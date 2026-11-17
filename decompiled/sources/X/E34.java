package X;

import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import com.facebook.aura.file.view.MediaViewerContentKt;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* loaded from: classes5.dex */
public abstract class E34 {
    public static final int[] A00 = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    public static final int[] A02 = {-1, 8000, WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ, OggOpusStreamEncoder.BIT_RATE, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    public static final int[] A03 = {64, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 128, 192, 224, 256, 384, VideoConfigJsonKt.SOURCE_WIDTH, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, MediaViewerContentKt.DETAIL_IMAGE_MAX_DIMENSION_PX, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, OggOpusStreamEncoder.MAX_INPUT_BYTES};
    public static final int[] A01 = {8000, WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ, OggOpusStreamEncoder.BIT_RATE, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    public static final int[] A06 = {5, 8, 10, 12};
    public static final int[] A08 = {6, 9, 12, 15};
    public static final int[] A04 = {2, 4, 6, 8};
    public static final int[] A05 = {9, 11, 13, 16};
    public static final int[] A07 = {5, 8, 10, 12};

    public static int A00(C6340E1q c6340E1q, int[] iArr) {
        int i = 0;
        int i2 = 0;
        while (c6340E1q.A0I()) {
            i2++;
            i++;
            if (i >= 3) {
                break;
            }
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += 1 << iArr[i4];
        }
        return i3 + c6340E1q.A08(iArr[i2]);
    }

    public static int A01(ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        int i4;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b = byteBuffer.get(iPosition);
        if (b != -2) {
            if (b == -1) {
                i = (byteBuffer.get(iPosition + 4) & 7) << 4;
                i4 = iPosition + 7;
            } else if (b != 31) {
                i = (byteBuffer.get(iPosition + 4) & 1) << 6;
                i2 = iPosition + 5;
            } else {
                i = (byteBuffer.get(iPosition + 5) & 7) << 4;
                i4 = iPosition + 6;
            }
            i3 = byteBuffer.get(i4) & 60;
            return (((i3 >> 2) | i) + 1) * 32;
        }
        i = (byteBuffer.get(iPosition + 5) & 1) << 6;
        i2 = iPosition + 4;
        i3 = byteBuffer.get(i2) & 252;
        return (((i3 >> 2) | i) + 1) * 32;
    }

    public static C6340E1q A02(byte[] bArr) {
        byte b = bArr[0];
        if (b == Byte.MAX_VALUE || b == 100 || b == 64 || b == 113) {
            return new C6340E1q(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = bArrCopyOf[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b3 = bArrCopyOf[i];
                int i2 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i2];
                bArrCopyOf[i2] = b3;
            }
        }
        C6340E1q c6340E1q = new C6340E1q(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            C6340E1q c6340E1q2 = new C6340E1q(bArrCopyOf);
            while (c6340E1q2.A06() >= 16) {
                c6340E1q2.A0C(2);
                int iA08 = c6340E1q2.A08(14) & ((1 << 14) - 1);
                int i3 = c6340E1q.A00;
                int i4 = 8 - i3;
                int iMin = Math.min(i4, 14);
                int i5 = i4 - iMin;
                byte[] bArr2 = c6340E1q.A03;
                int i6 = c6340E1q.A02;
                byte b4 = (byte) (((65280 >> i3) | ((1 << i5) - 1)) & bArr2[i6]);
                bArr2[i6] = b4;
                int i7 = 14 - iMin;
                BV6.A0x(b4, bArr2, (iA08 >>> i7) << i5, i6);
                int i8 = i6 + 1;
                while (i7 > 8) {
                    i7 -= 8;
                    bArr2[i8] = (byte) (iA08 >>> i7);
                    i8++;
                }
                int i9 = 8 - i7;
                byte b5 = (byte) (bArr2[i8] & ((1 << i9) - 1));
                bArr2[i8] = b5;
                BV6.A0x((iA08 & ((1 << i7) - 1)) << i9, bArr2, b5, i8);
                c6340E1q.A0C(14);
                C6340E1q.A03(c6340E1q);
            }
        }
        c6340E1q.A0H(bArrCopyOf, bArrCopyOf.length);
        return c6340E1q;
    }
}
