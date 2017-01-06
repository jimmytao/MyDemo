package dagger2.module;

import dagger.Module;
import dagger.Provides;
import dagger2.bean.LiBean;
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
public class FragmentModule {

    @Provides
    @D
    LiBean provideLiBean() {
        return new LiBean();
    }

}