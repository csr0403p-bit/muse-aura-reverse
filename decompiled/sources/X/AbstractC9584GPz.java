package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.GPz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9584GPz {
    public static final GQ1 A00(JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has("vesta_fleet_key_list_bundle") || jSONObject.isNull("vesta_fleet_key_list_bundle")) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("vesta_fleet_key_list_bundle");
        C7384Etj.A0X(jSONObject2);
        return new GQ1(A02(jSONObject2, "base64_encoded_fleet_key_list"), A02(jSONObject2, "base64_encoded_fleet_key_list_signature_message"), A02(jSONObject2, "base64_encoded_fleet_key_list_signature_1"), A02(jSONObject2, "base64_encoded_fleet_key_list_signature_2"), A01("bundle_version", jSONObject2));
    }

    public static final Integer A01(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return Integer.valueOf(jSONObject.getInt(str));
    }

    public static final String A02(JSONObject jSONObject, String str) {
        if (!jSONObject.has(str) || jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }
}
