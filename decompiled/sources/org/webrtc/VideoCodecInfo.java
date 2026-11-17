package org.webrtc;

import X.BV7;
import X.BV8;
import X.C60O;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes5.dex */
public class VideoCodecInfo {
    public static final String H264_CONSTRAINED_BASELINE_3_1 = "42e01f";
    public static final String H264_CONSTRAINED_HIGH_3_1 = "640c1f";
    public static final String H264_CONSTRAINED_HIGH_4_1 = "640c29";
    public static final String H264_FMTP_LEVEL_ASYMMETRY_ALLOWED = "level-asymmetry-allowed";
    public static final String H264_FMTP_PACKETIZATION_MODE = "packetization-mode";
    public static final String H264_FMTP_PROFILE_LEVEL_ID = "profile-level-id";
    public static final String H264_LEVEL_3_1 = "1f";
    public static final String H264_LEVEL_4_1 = "29";
    public static final String H264_PROFILE_CONSTRAINED_BASELINE = "42e0";
    public static final String H264_PROFILE_CONSTRAINED_HIGH = "640c";
    public final String name;
    public final Map<String, String> params;

    @Deprecated
    public final int payload;

    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof VideoCodecInfo) {
                    VideoCodecInfo videoCodecInfo = (VideoCodecInfo) obj;
                    if (!this.name.equalsIgnoreCase(videoCodecInfo.name) || !this.params.equals(videoCodecInfo.params)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public String getName() {
        return this.name;
    }

    public Map<String, String> getParams() {
        return this.params;
    }

    public int hashCode() {
        return BV7.A0D(this.name.toUpperCase(Locale.ROOT), this.params);
    }

    public String toString() {
        StringBuilder sbA0x = C60O.A0x("VideoCodec{");
        sbA0x.append(this.name);
        sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        return BV8.A0v(this.params, sbA0x);
    }

    public VideoCodecInfo(String str, Map<String, String> map) {
        this.payload = 0;
        this.name = str;
        this.params = map;
    }

    @Deprecated
    public VideoCodecInfo(int i, String str, Map<String, String> map) {
        this.payload = i;
        this.name = str;
        this.params = map;
    }
}
