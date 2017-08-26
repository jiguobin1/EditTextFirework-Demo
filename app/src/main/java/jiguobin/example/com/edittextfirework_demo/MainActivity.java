package jiguobin.example.com.edittextfirework_demo;


import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;


import com.qiushui.blurredview.BlurredView;

public class MainActivity extends Activity {

    /**
     * Blurredview
     */
    private BlurredView mBlurredView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        initViews();

    }

    /**
     * 初始化视图
     */
    private void initViews() {
        mBlurredView = (BlurredView) findViewById(R.id.activity_main_blurredview);
        //使用setBlurredImg()方法指定需要模糊的图片
        mBlurredView.setBlurredImg(getResources().getDrawable(R.drawable.dayu));
        //指定模糊度
        mBlurredView.setBlurredLevel(100);
    }

    }
