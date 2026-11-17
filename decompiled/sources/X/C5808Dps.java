package X;

/* renamed from: X.Dps, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5808Dps implements InterfaceC5965Dt6 {
    @Override // X.InterfaceC5965Dt6
    public final float AHx(DmT dmT, float f, int i) {
        C7384Etj.A0Y(dmT, 2);
        int i2 = dmT.desiredBuffer;
        int i3 = i - i2;
        if (!BV7.A1S(Math.abs(i3), dmT.desiredBufferAcceptableErrorMs)) {
            if (i3 >= dmT.adjustSpeedTopThresholdMs || i2 - i >= dmT.adjustSpeedBottomThresholdMs) {
                return i > i2 ? ((float) dmT.streamLatencyMaxSpeedDelta) + 1.0f : 1.0f - ((float) dmT.streamLatencyMinSpeedDelta);
            }
            if (!dmT.simpleSpeedControllerStopAtDesiredBuffer || ((f <= 1.0f || i > i2) && (f >= 1.0f || i < i2))) {
                return f;
            }
        }
        return 1.0f;
    }
}
