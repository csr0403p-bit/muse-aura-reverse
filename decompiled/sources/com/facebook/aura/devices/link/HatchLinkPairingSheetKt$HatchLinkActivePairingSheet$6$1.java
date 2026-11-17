package com.facebook.aura.devices.link;

import X.C7438Evz;
import com.facebook.aura.devices.pairing.HatchDevicePairingViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$6$1 extends C7438Evz implements Function0<Unit> {
    public HatchLinkPairingSheetKt$HatchLinkActivePairingSheet$6$1(Object obj) {
        super(0, obj, HatchDevicePairingViewModel.class, "goBackInPairing", "goBackInPairing()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchDevicePairingViewModel) this.receiver).goBackInPairing();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
