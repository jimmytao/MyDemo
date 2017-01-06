package tao.myapplication;

import android.app.Application;

import com.orhanobut.logger.LogLevel;
import com.orhanobut.logger.Logger;


/**
 * Created by tao.
 * <p>
 * Created Time : 2017/1/4 15:02.
 * <p>
 * Description : File in  tao.myapplication, Project in MyDemo.
 * <p>
 * Content:
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Logger
        .init("TAO")                    // default PRETTYLOGGER or use just init()
        .methodCount(3)                 // default 2
        .hideThreadInfo()               // default shown
        .logLevel(LogLevel.FULL)        // default LogLevel.FULL
        .methodOffset(0);               // default 0*/

       //把自定义的设置应用到EventBus默认的单例中
     //   EventBus.builder().addIndex(new MyEventBusIndex()).installDefaultEventBus();
      //  EventBus.getDefault();
    }
}

