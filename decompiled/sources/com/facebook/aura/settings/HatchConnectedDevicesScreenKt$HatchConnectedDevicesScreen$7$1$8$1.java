package com.facebook.aura.settings;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$8$1 extends C7438Evz implements Function0<Unit> {
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$8$1(Object obj) {
        super(0, obj, HatchConnectedDevicesViewModel.class, "dismissDeveloperModeTurnOff", "dismissDeveloperModeTurnOff()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchConnectedDevicesViewModel) this.receiver).dismissDeveloperModeTurnOff();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
