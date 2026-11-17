package com.facebook.aura.maps;

import X.AFR;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C9n4;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchMapNavigationHostKt$HatchMapNavigationHost$1$1$1 extends AbstractC7559F3s implements G0U<C9n4, Unit> {
    public final /* synthetic */ HatchMapNavigationController $controller;
    public final /* synthetic */ Function0<Unit> $onMapAttached;
    public final /* synthetic */ AFR $retainedMap;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C9n4 c9n4) {
        C7384Etj.A0Y(c9n4, 0);
        this.$controller.attachMap$fbandroid_express_aura_java_com_facebook_aura_maps_impl_impl(this.$retainedMap, c9n4);
        this.$onMapAttached.invoke();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMapNavigationHostKt$HatchMapNavigationHost$1$1$1(HatchMapNavigationController hatchMapNavigationController, AFR afr, Function0<Unit> function0) {
        super(1);
        this.$controller = hatchMapNavigationController;
        this.$retainedMap = afr;
        this.$onMapAttached = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C9n4 c9n4) {
        invoke2(c9n4);
        return Unit.INSTANCE;
    }
}
