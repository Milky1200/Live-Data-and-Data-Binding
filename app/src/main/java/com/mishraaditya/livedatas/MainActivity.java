package com.mishraaditya.livedatas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.mishraaditya.livedatas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Button btnText;
    TextView txtWord;
    MainViewModel mainViewModel;
    /*btnText=findViewById(R.id.button);
        txtWord=findViewById(R.id.textView);*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainViewModel=new ViewModelProvider(this).get(MainViewModel.class);
        binding.setMainViewModel(mainViewModel);
        binding.setLifecycleOwner(this);//if you will note apply this then Live Data Will noy work properly

        /*mainViewModel.factMute.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                txtWord.setText(s);
            }
        });


        btnText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainViewModel.updateLiveData();
            }
        });*/
    }
}