package dagger2.module;

import dagger.Module;
import dagger.Provides;
import dagger2.bean.WangBean;

/**
 * Created by tao.
 * <p>
 * Created Time : 2017/1/5 14:30.
 * <p>
 * Description : File in  dagger2.component, Project in MyDemo.
 * <p>
 * Content:全局的依赖,假设这个依赖提供两个数据;
 */
@Module
public class AppModule {


/*
    public AppModule(WangBean wangBean) {
        this.wangBean = wangBean;
    }*/

    @Provides
    public WangBean provideWangBean() {
        return new WangBean();
    }

}
