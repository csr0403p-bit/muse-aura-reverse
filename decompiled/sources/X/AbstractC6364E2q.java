package X;

import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import com.facebook.aura.partners.voice.infra.VideoConfigJsonKt;
import com.facebook.aura.settings.support.HatchContactSupportViewModelKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* renamed from: X.E2q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6364E2q {
    public static final int[] A01 = {1, 2, 3, 6};
    public static final int[] A03 = {48000, 44100, OggOpusStreamEncoder.BIT_RATE};
    public static final int[] A04 = {24000, 22050, WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ};
    public static final int[] A02 = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] A00 = {32, 40, 48, 56, 64, 80, 96, HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 128, 160, 192, 224, 256, HatchContactSupportViewModelKt.MAX_EMAIL_LENGTH, 384, VideoConfigJsonKt.SOURCE_WIDTH, 512, 576, 640};
    public static final int[] A05 = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int A00(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = A03;
        if (i >= 3 || i2 < 0) {
            return -1;
        }
        int[] iArr2 = A05;
        if (i3 >= 19) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = A00[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static int A01(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i = iPosition; i <= iLimit; i++) {
            int iReverseBytes = byteBuffer.getInt(i + 4);
            if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                iReverseBytes = Integer.reverseBytes(iReverseBytes);
            }
            if ((iReverseBytes & (-2)) == -126718022) {
                return i - iPosition;
            }
        }
        return -1;
    }

    public static int A02(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return A01[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static int A03(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + (AnonymousClass002.A1Q(BV6.A0C(byteBuffer, (byteBuffer.position() + i) + 7), 187) ? 9 : 8)) >> 4) & 7);
    }
}
