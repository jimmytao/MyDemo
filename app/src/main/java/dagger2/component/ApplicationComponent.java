package dagger2.component;

import dagger.Component;
import dagger2.bean.WangBean;
import dagger2.module.AppModule;

/**
 * Created by tao.
 * <p>
 * Created Time : 2017/1/5 14:27.
 * <p>
 * Description : File in  dagger2.component, Project in MyDemo.
 * <p>
 * Content:
 */

@Component(modules = {AppModule.class})
public interface ApplicationComponent {

    WangBean getWangBean();

    //因为这里并不需要和具体的依赖组件发生关联，所以不需要添加注入接口
    //但是如果一旦使用 compoment.inject(...) 使某个实体类和Component发生了关系，
    // 那么对应Component的 Module 中必须提供 @Inject修饰的所有对象的 providesXXX 方法，
    // 而且如果有两种构造方法，必须提供两种 providesXXX 方法
    //void inject(DemoProjectApplication demoProjectApplication);
}
