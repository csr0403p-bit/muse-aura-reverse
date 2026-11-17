package X;

import org.webrtc.voiceengine.WebRtcAudioUtils;

/* loaded from: classes5.dex */
public final class BXt implements BVI {
    public final int A00;
    public final int A01;
    public final int A02;

    public BXt(int i, int i2, int i3) {
        this.A01 = i2;
        this.A00 = i;
        this.A02 = i3;
    }

    public static int A00(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw BV4.A0P();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }
}
