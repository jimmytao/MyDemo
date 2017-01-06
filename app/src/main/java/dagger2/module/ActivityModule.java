package dagger2.module;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;
import dagger2.bean.TaoBean;
import dagger2.bean.UserBean;
import dagger2.scope.A;
import dagger2.scope.D;

/**
 * Created by tao.
 * <p>
 * Created Time : 2017/1/5 10:17.
 * <p>
 * Description : File in  dagger2.module, Project in MyDemo.
 * <p>
 * Content:
 */

@Module
public class ActivityModule {

    @Provides
    @Named("B")
    UserBean provideUserBean() {
        return new UserBean("李狗蛋");
    }

    @Provides
    @Named("C")
    @A
    UserBean provideUserBean1() {
        return new UserBean("超狗蛋");
    }

    @Provides
    @D
    TaoBean provideTaoBean() {
        return new TaoBean();
    }


}