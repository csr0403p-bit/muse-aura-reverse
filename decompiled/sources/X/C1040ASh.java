package X;

import X.AOd;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;

/* renamed from: X.ASh, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1040ASh<V extends AOd> implements InterfaceC0999AOh<V> {
    public final long A00;
    public final long A01;
    public final InterfaceC1044ASn<V> A02;
    public final Integer A03;

    @Override // X.InterfaceC0999AOh
    public final /* synthetic */ AOd getEndVelocity(AOd aOd, AOd aOd2, AOd aOd3) {
        return getVelocityFromNanos(getDurationNanos(aOd, aOd2, aOd3), aOd, aOd2, aOd3);
    }

    @Override // X.InterfaceC0999AOh
    public final V getValueFromNanos(long j, V v, V v2, V v3) {
        long j2;
        V velocityFromNanos = v3;
        InterfaceC1044ASn<V> interfaceC1044ASn = this.A02;
        long j3 = this.A01;
        long j4 = j + j3;
        if (j4 <= 0) {
            j2 = 0;
        } else {
            long j5 = this.A00;
            long j6 = j4 / j5;
            j2 = (this.A03 == C79.A00 || j6 % 2 == 0) ? j4 - (j6 * j5) : ((j6 + 1) * j5) - j4;
        }
        long j7 = this.A00;
        if (j4 > j7) {
            velocityFromNanos = interfaceC1044ASn.getVelocityFromNanos(j7 - j3, v, v2, velocityFromNanos);
        }
        return interfaceC1044ASn.getValueFromNanos(j2, v, v2, velocityFromNanos);
    }

    @Override // X.InterfaceC0999AOh
    public final V getVelocityFromNanos(long j, V v, V v2, V v3) {
        long j2;
        V velocityFromNanos = v3;
        InterfaceC1044ASn<V> interfaceC1044ASn = this.A02;
        long j3 = this.A01;
        long j4 = j + j3;
        if (j4 <= 0) {
            j2 = 0;
        } else {
            long j5 = this.A00;
            long j6 = j4 / j5;
            j2 = (this.A03 == C79.A00 || j6 % 2 == 0) ? j4 - (j6 * j5) : ((j6 + 1) * j5) - j4;
        }
        long j7 = this.A00;
        if (j4 > j7) {
            velocityFromNanos = interfaceC1044ASn.getVelocityFromNanos(j7 - j3, v, v2, velocityFromNanos);
        }
        return interfaceC1044ASn.getVelocityFromNanos(j2, v, v2, velocityFromNanos);
    }

    @Override // X.InterfaceC0999AOh
    public final boolean isInfinite() {
        return true;
    }

    public C1040ASh(InterfaceC1044ASn interfaceC1044ASn, Integer num, long j) {
        this.A02 = interfaceC1044ASn;
        this.A03 = num;
        this.A00 = (interfaceC1044ASn.AEl() + interfaceC1044ASn.AEr()) * 1000000;
        this.A01 = j * 1000000;
    }

    @Override // X.InterfaceC0999AOh
    public final long getDurationNanos(V v, V v2, V v3) {
        return LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    }
}
