package X;

import java.util.List;

/* renamed from: X.Dmf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5651Dmf {
    public static final String[] A00 = {"autoplay_eligible", "autoplay_failure_reasons", "autoplay_setting_value", "data_connection_quality", "debug_reason", "mute_context", "video_play_reason", "audio_derived_content_id", "player_sound_on", "audio_key_source", "playback_speed", "video_width", "video_height", "view_width", "video_type"};
    public static final C06827l3 A01 = C06827l3.A02("mpd_qe=(.*?)\\)");

    public static final Double A00(String str) {
        List listA0e;
        String str2;
        List listA0e2;
        String str3;
        if (str == null || (listA0e = C7BY.A0e(str, ",")) == null || (str2 = (String) AbstractC0878AGe.A0I(listA0e)) == null || (listA0e2 = C7BY.A0e(str2, ":")) == null || (str3 = (String) AbstractC0878AGe.A0I(listA0e2)) == null) {
            return null;
        }
        return Double.valueOf(Double.parseDouble(str3));
    }

    public static final Long A01(Dq8 dq8, C5623Dm6 c5623Dm6) {
        long j = dq8.A02;
        if (j <= 0) {
            return null;
        }
        long j2 = j - c5623Dm6.A0E;
        if (j2 < 0) {
            j2 = 0;
        }
        return Long.valueOf(j2);
    }
}
