package X;

import com.facebook.aura.spaces.repo.HatchSpacesDataSourceKt;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.DmU, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5640DmU {
    public static final C5962Dsy A00(InterfaceC5724DoJ interfaceC5724DoJ, C5623Dm6 c5623Dm6, C5992DtZ c5992DtZ, boolean z, boolean z2) {
        String str;
        C7384Etj.A0Y(c5623Dm6, 0);
        C5962Dsy c5962Dsy = new C5962Dsy();
        long j = c5623Dm6.A04;
        long j2 = c5623Dm6.A08;
        AbstractC8150FWo.A02(c5962Dsy, "total_frame_count", Long.valueOf(j + j2));
        AbstractC8150FWo.A02(c5962Dsy, "dropped_frame_count", Long.valueOf(j));
        AbstractC8150FWo.A02(c5962Dsy, "large_dropped_frame_count", Long.valueOf(c5623Dm6.A05));
        AbstractC8150FWo.A02(c5962Dsy, "very_large_dropped_frame_count", Long.valueOf(c5623Dm6.A0A));
        AbstractC8150FWo.A02(c5962Dsy, "dropped_frame_bucketized", c5623Dm6.A0f);
        if (j2 < 0) {
            j2 = 0;
        }
        if (z) {
            long jA07 = c5623Dm6.A0J;
            if (c5992DtZ != null) {
                jA07 = ATD.A07(jA07 + c5992DtZ.A00, 0L, j2);
            }
            AbstractC8150FWo.A02(c5962Dsy, "hdr_frame_count", Long.valueOf(jA07));
        }
        if (z2 && c5992DtZ != null) {
            AbstractC8150FWo.A02(c5962Dsy, "inference_frame_count", Long.valueOf(ATD.A07(c5992DtZ.A01, 0L, j2)));
        }
        String str2 = c5623Dm6.A0h;
        if (C7384Etj.A06(str2) > 0) {
            AbstractC8150FWo.A02(c5962Dsy, "renderer_type", str2);
        }
        int i = c5623Dm6.A03;
        AbstractC8150FWo.A02(c5962Dsy, "avg_decode_time", Long.valueOf(c5623Dm6.A02));
        AbstractC8150FWo.A02(c5962Dsy, "avg_render_time", Long.valueOf(i));
        String str3 = c5623Dm6.A0j;
        if (str3.length() != 0) {
            AbstractC8150FWo.A02(c5962Dsy, "video_decoder_name", AnonymousClass001.A0u(str3));
        }
        C5627DmA c5627DmA = (C5627DmA) interfaceC5724DoJ;
        C5723DoI c5723DoI = c5627DmA.A0m.get();
        if (c5723DoI != null && (((str = c5723DoI.codecs) != null || (str = c5723DoI.mimeType) != null) && str.length() != 0)) {
            AbstractC8150FWo.A02(c5962Dsy, "audio_codec", str);
        }
        Boolean boolValueOf = Boolean.valueOf(c5627DmA.A0X.get());
        Map<String, Object> map = c5962Dsy.A00;
        map.put("is_black_screen_detected", boolValueOf);
        Boolean bool = c5627DmA.A0i.get();
        if (bool != null) {
            map.put("is_black_screen_detected_pixel_verified", bool);
        }
        return c5962Dsy;
    }

    public static final C5962Dsy A01(String str) throws JSONException {
        String string;
        C5962Dsy c5962Dsy = new C5962Dsy();
        if (str != null) {
            try {
                JSONObject jSONObjectA19 = BV4.A19(str);
                JSONObject jSONObjectPut = BV4.A18().put(HatchSpacesDataSourceKt.VERSION_QUERY_PARAM, 1);
                jSONObjectPut.put("dav1d", jSONObjectA19);
                string = jSONObjectPut.toString();
            } catch (JSONException e) {
                CFK.A0A("TagMetadataUtil", "Invalid media enhancement admission decision", e);
            }
        } else {
            string = null;
        }
        AbstractC8150FWo.A02(c5962Dsy, "media_enhancement_decisions", string);
        return c5962Dsy;
    }
}
