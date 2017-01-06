package dagger2.component;

import dagger.Component;
import dagger2.module.ActivityModule;
import dagger2.module.FragmentModule;
import dagger2.scope.A;
import dagger2.scope.D;
import dagger2.view.DaggerActivity;
import dagger2.view.DaggerActivity1;


/**
 * Created by tao.
 * <p>
 * Created Time : 2017/1/5 10:14.
 * <p>
 * Description : File in  dagger2.component, Project in MyDemo.
 * <p>
 * Content:
 */
@Component(modules = {ActivityModule.class, FragmentModule.class},dependencies = ApplicationComponent.class)
@D
@A
public interface ActivityComponent {

    //下面这三个方法，返回值必须是从上面指定的依赖库DraggerActivityMoudle.class中取得的对象
    //方法名不一致也行，但是方便阅读，建议一致，因为它主要是根据返回值类型来找依赖的

    //当然！！！！下面这三个方法也可以不写，但是如果要写，就按照这个格式来
    //但是当Component要被别的Component依赖时(appcomponent就需要这样)，这里就必须写几个方法，
    //不写代表不向别的Component暴露此依赖，这里是个容易出bug的地方

    //下面的这个方法，表示要将以上的三个依赖注入到某个类中
    void inject(DaggerActivity daggerActivity);
    void inject(DaggerActivity1 daggerActivity1);



}
