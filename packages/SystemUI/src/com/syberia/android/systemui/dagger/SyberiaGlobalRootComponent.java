package com.syberia.android.systemui.dagger;

import android.content.Context;

import com.android.systemui.dagger.GlobalModule;
import com.android.systemui.dagger.GlobalRootComponent;
import com.android.systemui.dagger.WMModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = {
        GlobalModule.class,
        SyberiaSysUISubcomponentModule.class,
        WMModule.class})
public interface SyberiaGlobalRootComponent extends GlobalRootComponent {

    @Component.Builder
    interface Builder extends GlobalRootComponent.Builder {
        SyberiaGlobalRootComponent build();
    }

    @Override
    SyberiaSysUIComponent.Builder getSysUIComponent();
}
