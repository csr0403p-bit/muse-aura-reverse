package X;

import androidx.media3.common.ParserException;
import com.facebook.aura.composer.dictation.voyager.OggOpusStreamEncoder;
import org.webrtc.voiceengine.WebRtcAudioUtils;

/* renamed from: X.E2l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6359E2l {
    public static final int[] A01 = {96000, 88200, 64000, 48000, 44100, OggOpusStreamEncoder.BIT_RATE, 24000, 22050, WebRtcAudioUtils.DEFAULT_SAMPLE_RATE_HZ, 12000, 11025, 8000, 7350};
    public static final int[] A00 = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static int A00(C6340E1q c6340E1q) throws ParserException {
        int iA08 = c6340E1q.A08(4);
        if (iA08 == 15) {
            if (c6340E1q.A06() >= 24) {
                return c6340E1q.A08(24);
            }
            throw BV6.A0V("AAC header insufficient data", null);
        }
        if (iA08 < 13) {
            return A01[iA08];
        }
        throw BV6.A0V("AAC header wrong Sampling Frequency Index", null);
    }

    public static E5A A01(C6340E1q c6340E1q, boolean z) {
        StringBuilder sbA0y;
        int iA08 = c6340E1q.A08(5);
        if (iA08 == 31) {
            iA08 = c6340E1q.A08(6) + 32;
        }
        int iA00 = A00(c6340E1q);
        int iA082 = c6340E1q.A08(4);
        String strA0H = FGI.A0H("mp4a.40.", iA08);
        if (iA08 == 5 || iA08 == 29) {
            iA00 = A00(c6340E1q);
            iA08 = c6340E1q.A08(5);
            if (iA08 == 31) {
                iA08 = c6340E1q.A08(6) + 32;
            }
            if (iA08 == 22) {
                iA082 = c6340E1q.A08(4);
            }
        }
        if (z) {
            if (iA08 != 1 && iA08 != 2 && iA08 != 3 && iA08 != 4 && iA08 != 6 && iA08 != 7 && iA08 != 17) {
                switch (iA08) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        sbA0y = C60O.A0y("Unsupported audio object type: ", iA08);
                        throw ParserException.A00(sbA0y.toString());
                }
            }
            if (c6340E1q.A0I()) {
                CNC.A04("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (c6340E1q.A0I()) {
                c6340E1q.A0C(14);
            }
            boolean zA0I = c6340E1q.A0I();
            if (iA082 == 0) {
                throw C8j3.A17();
            }
            if (iA08 == 6 || iA08 == 20) {
                c6340E1q.A0C(3);
            }
            if (zA0I) {
                if (iA08 == 22) {
                    c6340E1q.A0C(16);
                } else if (iA08 == 17 || iA08 == 19 || iA08 == 20 || iA08 == 23) {
                    c6340E1q.A0C(3);
                }
                c6340E1q.A0C(1);
            }
            switch (iA08) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iA083 = c6340E1q.A08(2);
                    if (iA083 == 2 || iA083 == 3) {
                        sbA0y = C60O.A0y("Unsupported epConfig: ", iA083);
                        throw ParserException.A00(sbA0y.toString());
                    }
            }
        }
        int i = A00[iA082];
        if (i != -1) {
            return new E5A(iA00, i, strA0H);
        }
        throw new ParserException(null, null, 1, true);
    }
}
