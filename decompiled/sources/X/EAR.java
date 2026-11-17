package X;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes5.dex */
public final class EAR implements EAX {
    public long A02;
    public long A03;
    public EAL A04;
    public EAL A05;
    public EAS A06;
    public boolean A07;
    public EAL A08;
    public EAL A09;
    public ByteBuffer A0A;
    public ByteBuffer A0B;
    public ShortBuffer A0C;
    public boolean A0D;
    public float A01 = 1.0f;
    public float A00 = 1.0f;

    @Override // X.EAX
    public final EAL A6n(EAL eal) throws AudioProcessor$UnhandledAudioFormatException {
        if (eal.A02 != 2) {
            throw BV6.A0W(eal);
        }
        int i = eal.A03;
        this.A08 = eal;
        EAL eal2 = new EAL(i, eal.A01, 2);
        this.A09 = eal2;
        this.A07 = true;
        return eal2;
    }

    @Override // X.EAX
    public final ByteBuffer AIL() {
        int i;
        EAS eas = this.A06;
        if (eas != null && (i = eas.A05 * eas.A0G * 2) > 0) {
            if (this.A0A.capacity() < i) {
                ByteBuffer byteBufferA17 = BV8.A17(i);
                this.A0A = byteBufferA17;
                this.A0C = byteBufferA17.asShortBuffer();
            } else {
                this.A0A.clear();
                this.A0C.clear();
            }
            ShortBuffer shortBuffer = this.A0C;
            int iRemaining = shortBuffer.remaining();
            int i2 = eas.A0G;
            int iMin = Math.min(iRemaining / i2, eas.A05);
            shortBuffer.put(eas.A0B, 0, i2 * iMin);
            int i3 = eas.A05 - iMin;
            eas.A05 = i3;
            short[] sArr = eas.A0B;
            System.arraycopy(sArr, iMin * i2, sArr, 0, i3 * i2);
            this.A03 += i;
            this.A0A.limit(i);
            this.A0B = this.A0A;
        }
        ByteBuffer byteBuffer = this.A0B;
        this.A0B = EAX.A00;
        return byteBuffer;
    }

    @Override // X.EAX
    public final void AYz() {
        EAS eas = this.A06;
        if (eas != null) {
            int i = eas.A00;
            float f = eas.A0F;
            float f2 = eas.A0D;
            int i2 = eas.A05 + ((int) ((((i / (f / f2)) + eas.A06) / (eas.A0E * f2)) + 0.5f));
            short[] sArr = eas.A0A;
            int i3 = eas.A0J * 2;
            short[] sArrA04 = EAS.A04(eas, sArr, i, i3 + i);
            eas.A0A = sArrA04;
            int i4 = 0;
            while (true) {
                int i5 = eas.A0G;
                if (i4 >= i3 * i5) {
                    break;
                }
                sArrA04[(i5 * i) + i4] = 0;
                i4++;
            }
            eas.A00 += i3;
            EAS.A01(eas);
            if (eas.A05 > i2) {
                eas.A05 = i2;
            }
            eas.A00 = 0;
            eas.A09 = 0;
            eas.A06 = 0;
        }
        this.A0D = true;
    }

    @Override // X.EAX
    public final boolean isActive() {
        int i = this.A09.A03;
        if (i != -1) {
            return C8j3.A01(this.A01, 1.0f) >= 1.0E-4f || C8j3.A01(this.A00, 1.0f) >= 1.0E-4f || i != this.A08.A03;
        }
        return false;
    }

    @Override // X.EAX
    public final boolean isEnded() {
        if (!this.A0D) {
            return false;
        }
        EAS eas = this.A06;
        return eas == null || (eas.A05 * eas.A0G) * 2 == 0;
    }

    @Override // X.EAX
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        EAL eal = EAL.A04;
        this.A08 = eal;
        this.A09 = eal;
        this.A04 = eal;
        this.A05 = eal;
        ByteBuffer byteBuffer = EAX.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
        this.A07 = false;
        this.A06 = null;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A0D = false;
    }

    public EAR() {
        EAL eal = EAL.A04;
        this.A08 = eal;
        this.A09 = eal;
        this.A04 = eal;
        this.A05 = eal;
        ByteBuffer byteBuffer = EAX.A00;
        this.A0A = byteBuffer;
        this.A0C = byteBuffer.asShortBuffer();
        this.A0B = byteBuffer;
    }

    @Override // X.EAX
    public final void AZ0(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            EAS eas = this.A06;
            eas.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.A02 += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = eas.A0G;
            int i2 = iRemaining2 / i;
            short[] sArrA04 = EAS.A04(eas, eas.A0A, eas.A00, i2);
            eas.A0A = sArrA04;
            shortBufferAsShortBuffer.get(sArrA04, eas.A00 * i, ((i * i2) * 2) / 2);
            eas.A00 += i2;
            EAS.A01(eas);
            BV7.A1L(byteBuffer, iRemaining);
        }
    }

    @Override // X.EAX
    public final void flush() {
        if (isActive()) {
            EAL eal = this.A08;
            this.A04 = eal;
            EAL eal2 = this.A09;
            this.A05 = eal2;
            if (this.A07) {
                this.A06 = new EAS(this.A01, this.A00, eal.A03, eal.A01, eal2.A03);
            } else {
                EAS eas = this.A06;
                if (eas != null) {
                    eas.A00 = 0;
                    eas.A05 = 0;
                    eas.A06 = 0;
                    eas.A04 = 0;
                    eas.A03 = 0;
                    eas.A09 = 0;
                    eas.A08 = 0;
                    eas.A07 = 0;
                    eas.A02 = 0;
                    eas.A01 = 0;
                }
            }
        }
        this.A0B = EAX.A00;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A0D = false;
    }
}
