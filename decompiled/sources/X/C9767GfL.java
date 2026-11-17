package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GfL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9767GfL {
    public static final C9767GfL A00 = new C9767GfL();

    public static final void A00(Integer num, Integer num2, String str, JSONObject jSONObject) throws JSONException {
        if (str != null) {
            jSONObject.put("request_uuid", str);
        }
        if (num != null) {
            jSONObject.put("vesta_client_api_version", num.intValue());
        }
        if (num2 != null) {
            jSONObject.put("vesta_client_protocol_version", num2.intValue());
        }
    }
}
