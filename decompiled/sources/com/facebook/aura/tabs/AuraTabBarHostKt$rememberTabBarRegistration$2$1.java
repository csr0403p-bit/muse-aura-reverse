package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraTabBarHostKt$rememberTabBarRegistration$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $dimmed;
    public final /* synthetic */ AuraTabBarHostState $state;
    public final /* synthetic */ AuraTabRootNavKey $tabRoot;
    public final /* synthetic */ Object $token;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraTabBarHostKt$rememberTabBarRegistration$2$1(AuraTabBarHostState auraTabBarHostState, AuraTabRootNavKey auraTabRootNavKey, Object obj, boolean z) {
        super(0);
        this.$state = auraTabBarHostState;
        this.$tabRoot = auraTabRootNavKey;
        this.$token = obj;
        this.$dimmed = z;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.updateDimmed(this.$tabRoot, this.$token, this.$dimmed);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
