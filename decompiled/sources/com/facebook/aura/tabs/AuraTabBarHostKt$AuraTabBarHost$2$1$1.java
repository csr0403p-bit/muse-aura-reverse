package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraTabBarHostKt$AuraTabBarHost$2$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraTabRootNavKey $currentTabRoot;
    public final /* synthetic */ AuraTabBarHostState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTabBarHostKt$AuraTabBarHost$2$1$1(AuraTabBarHostState auraTabBarHostState, AuraTabRootNavKey auraTabRootNavKey) {
        super(0);
        this.$state = auraTabBarHostState;
        this.$currentTabRoot = auraTabRootNavKey;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.onReselected(this.$currentTabRoot);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
