package X;

import androidx.media3.common.util.Util;
import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import java.nio.ByteOrder;
import java.util.Collections;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* loaded from: classes5.dex */
public final class E3A {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final long A09;
    public final C5402Dhv A0A;
    public final E55 A0B;

    public final C6154Dwx A03(C5402Dhv c5402Dhv, byte[] bArr) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.A04;
        if (i <= 0) {
            i = -1;
        }
        C5402Dhv c5402Dhv2 = this.A0A;
        if (c5402Dhv2 != null) {
            c5402Dhv = c5402Dhv == null ? c5402Dhv2 : c5402Dhv2.A01(c5402Dhv.A01);
        }
        C6162Dx5 c6162Dx5A00 = C6162Dx5.A00();
        c6162Dx5A00.A06("audio/flac");
        c6162Dx5A00.A0C = i;
        c6162Dx5A00.A04 = this.A02;
        c6162Dx5A00.A0J = this.A07;
        c6162Dx5A00.A0F = Util.A06(ByteOrder.LITTLE_ENDIAN, this.A00);
        c6162Dx5A00.A0a = Collections.singletonList(bArr);
        c6162Dx5A00.A0S = c5402Dhv;
        return BV6.A0U(c6162Dx5A00);
    }

    public static int A00(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 20) {
            return 5;
        }
        if (i != 24) {
            return i != 32 ? -1 : 7;
        }
        return 6;
    }

    public final long A02() {
        long j = this.A09;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.A07;
    }

    public final E3A A04(E55 e55) {
        return new E3A(this.A0A, e55, this.A05, this.A03, this.A06, this.A04, this.A07, this.A02, this.A00, this.A09);
    }

    public E3A(byte[] bArr, int i) {
        C6340E1q c6340E1q = new C6340E1q(bArr);
        c6340E1q.A0B(i * 8);
        this.A05 = c6340E1q.A08(16);
        this.A03 = c6340E1q.A08(16);
        this.A06 = c6340E1q.A08(24);
        this.A04 = c6340E1q.A08(24);
        int iA08 = c6340E1q.A08(20);
        this.A07 = iA08;
        this.A08 = A01(iA08);
        this.A02 = C6340E1q.A00(c6340E1q, 3);
        int iA00 = C6340E1q.A00(c6340E1q, 5);
        this.A00 = iA00;
        this.A01 = A00(iA00);
        this.A09 = (c6340E1q.A08(32) & 4294967295L) | ((c6340E1q.A08(4) & 4294967295L) << 32);
        this.A0B = null;
        this.A0A = null;
    }

    public static int A01(int i) {
        switch (i) {
            case 8000:
                return 4;
            case WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ /* 16000 */:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case OggOpusStreamEncoder.BIT_RATE /* 32000 */:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public E3A(C5402Dhv c5402Dhv, E55 e55, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j) {
        this.A05 = i;
        this.A03 = i2;
        this.A06 = i3;
        this.A04 = i4;
        this.A07 = i5;
        this.A08 = A01(i5);
        this.A02 = i6;
        this.A00 = i7;
        this.A01 = A00(i7);
        this.A09 = j;
        this.A0B = e55;
        this.A0A = c5402Dhv;
    }
}
