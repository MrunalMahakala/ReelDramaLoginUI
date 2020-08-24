package com.example.login_ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class step1 extends AppCompatActivity {
Button next;
TextView goto_signin;
TextView terms_conditions;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);
        next=findViewById(R.id.next);
        goto_signin=findViewById(R.id.goto_main);
        terms_conditions=findViewById(R.id.terms_conditions);
        String goto_login="Have an account? Sign in";
        String terms="By Continuing You Agree Our TERMS and CONDITIONS ";
        SpannableStringBuilder ssb=new SpannableStringBuilder(goto_login);
        ClickableSpan cs=new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
             Intent intent=new Intent(step1.this,MainActivity.class);
             startActivity(intent);
            }
        };
        SpannableStringBuilder termsssb=new SpannableStringBuilder(terms);
        ForegroundColorSpan fcs=new ForegroundColorSpan(Color.CYAN);
        ForegroundColorSpan fcs1=new ForegroundColorSpan(Color.CYAN);

        ssb.setSpan(fcs,17,24, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//go to signin
        termsssb.setSpan(fcs1,28,33,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//terms and conditions
        termsssb.setSpan(fcs,38,49,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//terms and conditions
        ssb.setSpan(cs,17,24,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);//goto signin clickable
        goto_signin.setText(ssb);
        goto_signin.setMovementMethod(LinkMovementMethod.getInstance());//compulsory for spannable clicks
        terms_conditions.setText(termsssb);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tostep2=new Intent(step1.this,step2.class);
                startActivity(tostep2);
            }
        });
    }
}