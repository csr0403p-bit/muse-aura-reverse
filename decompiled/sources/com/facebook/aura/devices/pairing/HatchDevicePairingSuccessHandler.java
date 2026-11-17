package com.facebook.aura.devices.pairing;

/* loaded from: classes4.dex */
public final class HatchDevicePairingSuccessHandler {
    public static final int $stable = 8;
    public boolean consumed;
    public final boolean shouldOpenSuccessDestination;

    public final HatchDevicePairingSuccessAction consume(boolean z) {
        if (this.consumed) {
            return null;
        }
        this.consumed = true;
        return (!this.shouldOpenSuccessDestination || z) ? HatchDevicePairingSuccessAction.RETURN_TO_CALLER : HatchDevicePairingSuccessAction.OPEN_SUCCESS_DESTINATION;
    }

    public HatchDevicePairingSuccessHandler(boolean z) {
        this.shouldOpenSuccessDestination = z;
    }
}
