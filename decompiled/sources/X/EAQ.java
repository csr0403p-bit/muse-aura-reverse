package X;

import androidx.media3.common.util.Util;
import java.math.RoundingMode;

/* loaded from: classes5.dex */
public final class EAQ implements InterfaceC6516EAu {
    public final EAI A00;
    public final EAR A01;
    public final EAX[] A02;

    public EAQ(EAX... eaxArr) {
        EAI eai = new EAI();
        EAR ear = new EAR();
        int length = eaxArr.length;
        EAX[] eaxArr2 = new EAX[length + 2];
        this.A02 = eaxArr2;
        System.arraycopy(eaxArr, 0, eaxArr2, 0, length);
        this.A00 = eai;
        this.A01 = ear;
        eaxArr2[length] = eai;
        eaxArr2[length + 1] = ear;
    }

    @Override // X.InterfaceC6516EAu
    public final C6233Dyb A4X(C6233Dyb c6233Dyb) {
        EAR ear = this.A01;
        float f = c6233Dyb.A01;
        if (ear.A01 != f) {
            ear.A01 = f;
            ear.A07 = true;
        }
        float f2 = c6233Dyb.A00;
        if (ear.A00 != f2) {
            ear.A00 = f2;
            ear.A07 = true;
        }
        return c6233Dyb;
    }

    @Override // X.InterfaceC6516EAu
    public final boolean A4Z(boolean z) {
        this.A00.A05 = z;
        return z;
    }

    @Override // X.InterfaceC6516EAu
    public final EAX[] ACY() {
        return this.A02;
    }

    @Override // X.InterfaceC6516EAu
    public final long AHa(long j) {
        long j2;
        EAR ear = this.A01;
        if (ear.A03 < 1024) {
            return (long) (ear.A01 * j);
        }
        long j3 = ear.A02;
        ear.A06.getClass();
        long j4 = j3 - ((r0.A00 * r0.A0G) * 2);
        int i = ear.A05.A03;
        int i2 = ear.A04.A03;
        if (i == i2) {
            j2 = ear.A03;
        } else {
            j4 *= i;
            j2 = i2 * ear.A03;
        }
        return Util.A0F(RoundingMode.DOWN, j, j4, j2);
    }

    @Override // X.InterfaceC6516EAu
    public final long AKg() {
        return this.A00.A04;
    }
}
