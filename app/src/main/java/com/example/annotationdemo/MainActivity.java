package com.example.annotationdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.lib.BindView;
import com.example.lib.MyAnnotaion;
import com.example.lib.YiangAnnotation;


/**
 * Processor 生成的文件在
 * AnnotationDemo/app/build/intermediates/javac/debug/classes/com/example/annotationdemo
 * 下，没有apt目录了
 */

@MyAnnotaion
@YiangAnnotation(
        name = "yiang",
        text = "Hello !!! Welcome "
)
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.tv1)
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}

