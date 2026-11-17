package com.facebook.aura.settings;

import X.AnonymousClass001;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$6$1 extends C7438Evz implements G0U<Boolean, Unit> {
    public HatchConnectedDevicesScreenKt$HatchConnectedDevicesScreen$7$1$6$1(Object obj) {
        super(1, obj, HatchConnectedDevicesViewModel.class, "setDeveloperModeEnabled", "setDeveloperModeEnabled(Z)V", 0);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((HatchConnectedDevicesViewModel) this.receiver).setDeveloperModeEnabled(z);
    }
}
