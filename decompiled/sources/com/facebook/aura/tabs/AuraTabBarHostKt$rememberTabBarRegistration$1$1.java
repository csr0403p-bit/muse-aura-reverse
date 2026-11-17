package com.facebook.aura.tabs;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C1BO;
import X.C78g;
import X.G0U;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraTabBarHostKt$rememberTabBarRegistration$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnReselected$delegate;
    public final /* synthetic */ boolean $dimmed;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ AuraTabBarHostState $state;
    public final /* synthetic */ AuraTabRootNavKey $tabRoot;
    public final /* synthetic */ Object $token;

    /* renamed from: com.facebook.aura.tabs.AuraTabBarHostKt$rememberTabBarRegistration$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnReselected$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends Function0<Unit>> c1bo) {
            super(0);
            this.$currentOnReselected$delegate = c1bo;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            C1BO.A0D(this.$currentOnReselected$delegate);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraTabBarHostKt$rememberTabBarRegistration$1$1(boolean z, AuraTabBarHostState auraTabBarHostState, AuraTabRootNavKey auraTabRootNavKey, Object obj, boolean z2, C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$enabled = z;
        this.$state = auraTabBarHostState;
        this.$tabRoot = auraTabRootNavKey;
        this.$token = obj;
        this.$dimmed = z2;
        this.$currentOnReselected$delegate = c1bo;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (this.$enabled) {
            this.$state.register(this.$tabRoot, this.$token, this.$dimmed, new AnonymousClass1(this.$currentOnReselected$delegate));
        }
        final boolean z = this.$enabled;
        final AuraTabBarHostState auraTabBarHostState = this.$state;
        final AuraTabRootNavKey auraTabRootNavKey = this.$tabRoot;
        final Object obj = this.$token;
        return new C78g() { // from class: com.facebook.aura.tabs.AuraTabBarHostKt$rememberTabBarRegistration$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
                if (z) {
                    auraTabBarHostState.unregister(auraTabRootNavKey, obj);
                }
            }
        };
    }
}
