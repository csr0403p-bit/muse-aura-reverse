package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C1BO;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraFixedNavBarKt$AuraTabRail$onTabReselected$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<AuraTabRootNavKey> $currentTabRoot$delegate;
    public final /* synthetic */ AuraTabBarHostState $hostState;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraFixedNavBarKt$AuraTabRail$onTabReselected$1$1(AuraTabBarHostState auraTabBarHostState, C1BO<? extends AuraTabRootNavKey> c1bo) {
        super(0);
        this.$hostState = auraTabBarHostState;
        this.$currentTabRoot$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraTabRootNavKey value = this.$currentTabRoot$delegate.getValue();
        if (value != null) {
            this.$hostState.onReselected(value);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
