package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import com.facebook.aura.confidentialvm.session.ConfidentialSessionGate;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchDevicePairingViewModel$showPairingFlow$logger$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ HatchDevicePairingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchDevicePairingViewModel$showPairingFlow$logger$1(HatchDevicePairingViewModel hatchDevicePairingViewModel) {
        super(0);
        this.this$0 = hatchDevicePairingViewModel;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        return Boolean.valueOf(ConfidentialSessionGate.Companion.getInstance(this.this$0.userSession).isStandardVm());
    }
}
