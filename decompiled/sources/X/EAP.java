package X;

import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class EAP implements EAX {
    public EAL A00;
    public ByteBuffer A01;
    public EAL A02;
    public EAL A03;
    public ByteBuffer A04;
    public boolean A05;
    public EAL A06;

    @Override // X.EAX
    public final void AYz() {
        this.A05 = true;
        if (this instanceof EAC) {
            EAC eac = (EAC) this;
            if (eac.A05) {
                if (eac.A00 > 0) {
                    eac.A04 += r1 / ((EAP) eac).A00.A00;
                }
                eac.A00 = 0;
                return;
            }
            return;
        }
        if (this instanceof EAB) {
            EAB eab = (EAB) this;
            if (eab.A05) {
                if (eab.A00 > 0) {
                    eab.A04 += r1 / ((EAP) eab).A00.A00;
                }
                eab.A00 = 0;
                return;
            }
            return;
        }
        if (this instanceof EA9) {
            EA9 ea9 = (EA9) this;
            if (ea9.A01 > 0) {
                EA9.A02(ea9, true);
                ea9.A03 = 0;
            }
        }
    }

    public final ByteBuffer A03(int i) {
        if (this.A04.capacity() < i) {
            this.A04 = BV8.A17(i);
        } else {
            this.A04.clear();
        }
        ByteBuffer byteBuffer = this.A04;
        this.A01 = byteBuffer;
        return byteBuffer;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x006d  */
    @Override // X.EAX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.EAL A6n(X.EAL r8) throws androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EAP.A6n(X.EAL):X.EAL");
    }

    @Override // X.EAX
    public ByteBuffer AIL() {
        ByteBuffer byteBuffer = this.A01;
        this.A01 = EAX.A00;
        return byteBuffer;
    }

    @Override // X.EAX
    public final void flush() {
        this.A01 = EAX.A00;
        this.A05 = false;
        this.A00 = this.A02;
        this.A06 = this.A03;
        if (this instanceof EAC) {
            EAC eac = (EAC) this;
            if (eac.A05) {
                eac.A05 = false;
                int i = eac.A02;
                int i2 = ((EAP) eac).A00.A00;
                eac.A06 = new byte[i * i2];
                eac.A01 = eac.A03 * i2;
            }
            eac.A00 = 0;
            return;
        }
        if (this instanceof EAB) {
            EAB eab = (EAB) this;
            if (eab.A05) {
                eab.A05 = false;
                int i3 = eab.A02;
                int i4 = ((EAP) eab).A00.A00;
                eab.A06 = new byte[i3 * i4];
                eab.A01 = eab.A03 * i4;
            }
            eab.A00 = 0;
            return;
        }
        if (!(this instanceof EA9)) {
            if (this instanceof EA7) {
                EA7 ea7 = (EA7) this;
                ea7.A00 = ea7.A01;
                return;
            }
            return;
        }
        EA9 ea9 = (EA9) this;
        if (ea9.isActive()) {
            int i5 = ((EAP) ea9).A00.A01 * 2;
            ea9.A00 = i5;
            int iA05 = ((((int) BV4.A05(100000 * r1.A03)) / 2) / i5) * i5 * 2;
            if (ea9.A08.length != iA05) {
                ea9.A08 = new byte[iA05];
                ea9.A07 = new byte[iA05];
            }
        }
        ea9.A04 = 0;
        ea9.A05 = 0L;
        ea9.A03 = 0;
        ea9.A02 = 0;
        ea9.A01 = 0;
    }

    @Override // X.EAX
    public boolean isActive() {
        return AnonymousClass006.A1Z(this.A03, EAL.A04);
    }

    @Override // X.EAX
    public boolean isEnded() {
        return this.A05 && this.A01 == EAX.A00;
    }

    @Override // X.EAX
    public final void reset() {
        ByteBuffer byteBuffer = EAX.A00;
        this.A01 = byteBuffer;
        this.A05 = false;
        this.A04 = byteBuffer;
        EAL eal = EAL.A04;
        this.A02 = eal;
        this.A03 = eal;
        this.A00 = eal;
        this.A06 = eal;
        if (this instanceof EAC) {
            ((EAC) this).A06 = Util.A07;
            return;
        }
        if (this instanceof EAB) {
            ((EAB) this).A06 = Util.A07;
            return;
        }
        if (this instanceof EA9) {
            EA9 ea9 = (EA9) this;
            ea9.A06 = false;
            byte[] bArr = Util.A07;
            ea9.A08 = bArr;
            ea9.A07 = bArr;
            return;
        }
        if (this instanceof EA7) {
            EA7 ea7 = (EA7) this;
            ea7.A00 = null;
            ea7.A01 = null;
        }
    }

    public EAP() {
        ByteBuffer byteBuffer = EAX.A00;
        this.A04 = byteBuffer;
        this.A01 = byteBuffer;
        EAL eal = EAL.A04;
        this.A02 = eal;
        this.A03 = eal;
        this.A00 = eal;
        this.A06 = eal;
    }
}
