package com.example.blogexpress;

import static com.example.blogexpress.R.*;
import static com.example.blogexpress.R.id.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;
import com.example.blogexpress.Fragments.Login;

public class MainActivity extends AppCompatActivity {

//    LottieAnimationView lottieAnimationView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
//        lottieAnimationView=findViewById(R.id.lottie_animation_id);
//        lottieAnimationView.setAnimation(R.raw.lottie_launcher_animation);
//        lottieAnimationView.setRepeatCount(0); // No looping
//        lottieAnimationView.setSpeed(1.0f); // Normal speed
//
//        lottieAnimationView.playAnimation();

//

        textView = findViewById(id.textView);

        String fullText = "BlogExpress";
        String targetWord = "Express";
        int targetWordStart = fullText.indexOf(targetWord);
        int targetWordEnd = targetWordStart + targetWord.length();

        SpannableString spannableString = new SpannableString(fullText);
        ForegroundColorSpan colorSpan = new ForegroundColorSpan(Color.BLUE);

        spannableString.setSpan(colorSpan, targetWordStart, targetWordEnd, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        textView.setText(spannableString);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        }, 3000); // 3000 milliseconds = 3 seconds



    }
}