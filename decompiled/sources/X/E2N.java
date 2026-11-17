package X;

import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* loaded from: classes5.dex */
public abstract class E2N {
    public static final String[] A06 = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    public static final int[] A05 = {44100, 48000, OggOpusStreamEncoder.BIT_RATE};
    public static final int[] A00 = {OggOpusStreamEncoder.BIT_RATE, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    public static final int[] A04 = {OggOpusStreamEncoder.BIT_RATE, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    public static final int[] A01 = {OggOpusStreamEncoder.BIT_RATE, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    public static final int[] A02 = {OggOpusStreamEncoder.BIT_RATE, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    public static final int[] A03 = {8000, WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ, 24000, OggOpusStreamEncoder.BIT_RATE, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int A00(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!AnonymousClass002.A1Q(i & (-2097152), -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i6 = A05[i5];
        if (i2 == 2) {
            i6 /= 2;
        } else if (i2 == 0) {
            i6 /= 4;
        }
        int i7 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? A00[i4 - 1] : A04[i4 - 1]) * 12) / i6) + i7) * 4;
        }
        if (i2 == 3) {
            return (((i3 == 2 ? A01[i4 - 1] : A02[i4 - 1]) * VoiceCallForegroundService.AVATAR_TARGET_PX) / i6) + i7;
        }
        int i8 = A03[i4 - 1];
        int i9 = VoiceCallForegroundService.AVATAR_TARGET_PX;
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i8) / i6) + i7;
    }

    public static int A01(int i) {
        int i2;
        int i3;
        if (!AnonymousClass002.A1Q(i & (-2097152), -2097152) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        if (i3 == 1) {
            return i2 != 3 ? 576 : 1152;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw BV4.A0P();
    }
}
