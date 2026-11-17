package X;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* loaded from: classes5.dex */
public final class EAN implements EAX {
    public long A02;
    public long A03;
    public EAL A04;
    public EAL A05;
    public EAL A06;
    public EAL A07;
    public EAO A08;
    public ByteBuffer A09;
    public ByteBuffer A0A;
    public ShortBuffer A0B;
    public boolean A0C;
    public boolean A0D;
    public float A01 = 1.0f;
    public float A00 = 1.0f;

    @Override // X.EAX
    public final EAL A6n(EAL eal) throws AudioProcessor$UnhandledAudioFormatException {
        if (eal.A02 != 2) {
            throw BV6.A0W(eal);
        }
        int i = eal.A03;
        this.A06 = eal;
        EAL eal2 = new EAL(i, eal.A01, 2);
        this.A07 = eal2;
        this.A0C = true;
        return eal2;
    }

    @Override // X.EAX
    public final ByteBuffer AIL() {
        EAO eao = this.A08;
        if (eao != null) {
            int i = eao.A06;
            C1G.A08(C8j3.A1Q(i));
            int i2 = eao.A0H;
            int i3 = i * i2 * 2;
            if (i3 > 0) {
                if (this.A09.capacity() < i3) {
                    ByteBuffer byteBufferA17 = BV8.A17(i3);
                    this.A09 = byteBufferA17;
                    this.A0B = byteBufferA17.asShortBuffer();
                } else {
                    this.A09.clear();
                    this.A0B.clear();
                }
                ShortBuffer shortBuffer = this.A0B;
                C1G.A08(C8j3.A1Q(eao.A06));
                int iMin = Math.min(shortBuffer.remaining() / i2, eao.A06);
                shortBuffer.put(eao.A0C, 0, i2 * iMin);
                int i4 = eao.A06 - iMin;
                eao.A06 = i4;
                short[] sArr = eao.A0C;
                System.arraycopy(sArr, iMin * i2, sArr, 0, i4 * i2);
                this.A03 += i3;
                this.A09.limit(i3);
                this.A0A = this.A09;
            }
        }
        ByteBuffer byteBuffer = this.A0A;
        this.A0A = EAX.A00;
        return byteBuffer;
    }

    @Override // X.EAX
    public final void AYz() {
        EAO eao = this.A08;
        if (eao != null) {
            int i = eao.A01;
            float f = eao.A0G;
            int i2 = eao.A06 + ((int) (((((((i - r9) / (f / r3)) + eao.A0A) + eao.A00) + eao.A07) / (eao.A0F * eao.A0E)) + 0.5d));
            eao.A00 = 0.0d;
            short[] sArr = eao.A0B;
            int i3 = eao.A0K * 2;
            short[] sArrA04 = EAO.A04(eao, sArr, i, i3 + i);
            eao.A0B = sArrA04;
            int i4 = 0;
            while (true) {
                int i5 = eao.A0H;
                if (i4 >= i3 * i5) {
                    break;
                }
                sArrA04[(i5 * i) + i4] = 0;
                i4++;
            }
            eao.A01 += i3;
            EAO.A01(eao);
            if (eao.A06 > i2) {
                eao.A06 = Math.max(i2, 0);
            }
            eao.A01 = 0;
            eao.A0A = 0;
            eao.A07 = 0;
        }
        this.A0D = true;
    }

    @Override // X.EAX
    public final boolean isActive() {
        int i = this.A07.A03;
        if (i != -1) {
            return C8j3.A01(this.A01, 1.0f) >= 1.0E-4f || C8j3.A01(this.A00, 1.0f) >= 1.0E-4f || i != this.A06.A03;
        }
        return false;
    }

    @Override // X.EAX
    public final boolean isEnded() {
        if (!this.A0D) {
            return false;
        }
        EAO eao = this.A08;
        if (eao == null) {
            return true;
        }
        int i = eao.A06;
        C1G.A08(C8j3.A1Q(i));
        return (i * eao.A0H) * 2 == 0;
    }

    @Override // X.EAX
    public final void reset() {
        this.A01 = 1.0f;
        this.A00 = 1.0f;
        EAL eal = EAL.A04;
        this.A06 = eal;
        this.A07 = eal;
        this.A04 = eal;
        this.A05 = eal;
        ByteBuffer byteBuffer = EAX.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
        this.A0C = false;
        this.A08 = null;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A0D = false;
    }

    public EAN() {
        EAL eal = EAL.A04;
        this.A06 = eal;
        this.A07 = eal;
        this.A04 = eal;
        this.A05 = eal;
        ByteBuffer byteBuffer = EAX.A00;
        this.A09 = byteBuffer;
        this.A0B = byteBuffer.asShortBuffer();
        this.A0A = byteBuffer;
    }

    @Override // X.EAX
    public final void AZ0(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            EAO eao = this.A08;
            eao.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.A02 += iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i = eao.A0H;
            int i2 = iRemaining2 / i;
            short[] sArrA04 = EAO.A04(eao, eao.A0B, eao.A01, i2);
            eao.A0B = sArrA04;
            shortBufferAsShortBuffer.get(sArrA04, eao.A01 * i, ((i * i2) * 2) / 2);
            eao.A01 += i2;
            EAO.A01(eao);
            BV7.A1L(byteBuffer, iRemaining);
        }
    }

    @Override // X.EAX
    public final void flush() {
        if (isActive()) {
            EAL eal = this.A06;
            this.A04 = eal;
            EAL eal2 = this.A07;
            this.A05 = eal2;
            if (this.A0C) {
                this.A08 = new EAO(this.A01, this.A00, eal.A03, eal.A01, eal2.A03);
            } else {
                EAO eao = this.A08;
                if (eao != null) {
                    eao.A01 = 0;
                    eao.A06 = 0;
                    eao.A07 = 0;
                    eao.A05 = 0;
                    eao.A04 = 0;
                    eao.A0A = 0;
                    eao.A09 = 0;
                    eao.A08 = 0;
                    eao.A03 = 0;
                    eao.A02 = 0;
                    eao.A00 = 0.0d;
                }
            }
        }
        this.A0A = EAX.A00;
        this.A02 = 0L;
        this.A03 = 0L;
        this.A0D = false;
    }
}
