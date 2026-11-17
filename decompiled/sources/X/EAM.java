package X;

import androidx.media3.common.util.Util;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class EAM implements InterfaceC6516EAu {
    public final EAN A00;
    public final EA9 A01;
    public final EAX[] A02;

    @Override // X.InterfaceC6516EAu
    public final long AHa(long j) {
        long j2;
        EAN ean = this.A00;
        if (!ean.isActive()) {
            return j;
        }
        if (ean.A03 < 1024) {
            return (long) (ean.A01 * j);
        }
        long j3 = ean.A02;
        ean.A08.getClass();
        long j4 = j3 - ((r0.A01 * r0.A0H) * 2);
        int i = ean.A05.A03;
        int i2 = ean.A04.A03;
        if (i == i2) {
            j2 = ean.A03;
        } else {
            j4 *= i;
            j2 = i2 * ean.A03;
        }
        return Util.A0F(RoundingMode.DOWN, j, j4, j2);
    }

    public EAM(EAX... eaxArr) {
        EA9 ea9 = new EA9();
        EAN ean = new EAN();
        int length = eaxArr.length;
        EAX[] eaxArr2 = new EAX[length + 2];
        this.A02 = eaxArr2;
        System.arraycopy(eaxArr, 0, eaxArr2, 0, length);
        this.A01 = ea9;
        this.A00 = ean;
        eaxArr2[length] = ea9;
        eaxArr2[length + 1] = ean;
    }

    @Override // X.InterfaceC6516EAu
    public final C6233Dyb A4X(C6233Dyb c6233Dyb) {
        EAN ean = this.A00;
        float f = c6233Dyb.A01;
        C1G.A07(AnonymousClass002.A1N((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        if (ean.A01 != f) {
            ean.A01 = f;
            ean.A0C = true;
        }
        float f2 = c6233Dyb.A00;
        C1G.A07(AnonymousClass002.A1N((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1))));
        if (ean.A00 != f2) {
            ean.A00 = f2;
            ean.A0C = true;
        }
        return c6233Dyb;
    }

    @Override // X.InterfaceC6516EAu
    public final boolean A4Z(boolean z) {
        this.A01.A06 = z;
        return z;
    }

    @Override // X.InterfaceC6516EAu
    public final EAX[] ACY() {
        return this.A02;
    }

    @Override // X.InterfaceC6516EAu
    public final long AKg() {
        return this.A01.A05;
    }
}
