package tao.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;

import dagger2.view.DaggerActivity;

        /*
        PostThread：直接在发布者线程调用事件处理方法

        MainThread：如果发布者线程是主线程，那么直接在发布者线程(主线程)里边调用事件处理方法；
        如果发布者线程不是主线程，就把此事件送到主线程消息循环处理队列，在主线程中处理此事件

        BackgroundThread：如果发布者线程是主线程，那么把此事件发送到一个专门处理后台线程的消息循环处理队列，
        该队列管理多个后台线程；如果发布者不是主线程，那么在发布者线程中直接调用事件处理方法

        Async：并不使用队列管理多个事件，也不管发布者处在主线程与否，为每一个事件单独开辟一个线程处理
        */




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDI();

    }

    private void initDI() {

        Intent intent = new Intent(this, DaggerActivity.class);
        startActivity(intent);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
}
