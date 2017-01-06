package dagger2.util;

import dagger2.component.ActivityComponent;
import dagger2.component.ApplicationComponent;
import dagger2.component.DaggerActivityComponent;
import dagger2.component.DaggerApplicationComponent;
import dagger2.module.ActivityModule;
import dagger2.module.AppModule;

/**
 * Created by tao.
 * <p>
 * Created Time : 2017/1/5 14:12.
 * <p>
 * Description : File in  dagger2.util, Project in MyDemo.
 * <p>
 * Content:获取component的工具类(保证单例)
 */

public class ComponentUtil {

    private static ActivityComponent activityComponent;
    private static ApplicationComponent applicationComponent;

    //获取activitycomponent
    public static ActivityComponent getActivityComponent() {

        if (activityComponent == null) {
            synchronized (ActivityComponent.class) {
                if (activityComponent == null) {
                    activityComponent = DaggerActivityComponent.builder()
                            .activityModule(new ActivityModule())
                            .applicationComponent(getApplicationComponent())
                            .build();

                }
            }
        }
        return activityComponent;
    }

    //获取Applicationcomponent
    public static ApplicationComponent getApplicationComponent() {

        if (applicationComponent == null) {
            synchronized (ApplicationComponent.class) {
                if (activityComponent == null) {
                    applicationComponent = DaggerApplicationComponent.builder()
                            .appModule(new AppModule())
                            .build();

                }
            }
        }
        return applicationComponent;
    }

}
