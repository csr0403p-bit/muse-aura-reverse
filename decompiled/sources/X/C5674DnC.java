package X;

import com.facebook.aura.perf.HatchNavTTRCSpec;
import java.util.Map;

/* renamed from: X.DnC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5674DnC {
    public static final void A00(C8ee c8ee, C5963Dsz c5963Dsz, C5699Dng c5699Dng, String str, String str2) {
        if (c5699Dng.mDebugEventEnabled) {
            Eu1 eu1AcquireEvent = c8ee.acquireEvent("media_playback_compound_debug");
            if (!eu1AcquireEvent.isSampled() || c5963Dsz == null) {
                return;
            }
            eu1AcquireEvent.A3z(c5963Dsz, "required_metadata");
            eu1AcquireEvent.A3y("log_category", str);
            eu1AcquireEvent.A3y("error_type", str2);
            eu1AcquireEvent.A3y(HatchNavTTRCSpec.AnnotationKeys.ERROR_MESSAGE, "");
            eu1AcquireEvent.APu();
        }
    }

    public final String A01(C5963Dsz c5963Dsz, long j) {
        if (c5963Dsz == null) {
            return "client_metadata_provider_missing";
        }
        Number numberA0o = BV7.A0o();
        Map<String, Object> map = c5963Dsz.A00;
        if (!(map.containsKey("media_id") && (numberA0o = (Number) map.get("media_id")) == null) && j == numberA0o.longValue()) {
            return null;
        }
        return "client_media_id_mismatch";
    }
}
