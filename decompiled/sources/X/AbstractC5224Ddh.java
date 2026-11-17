package X;

import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Ddh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5224Ddh {
    public static final List<EOZ> A01(String str) {
        if (str == null || C7BY.A0j(str)) {
            return C0881AGi.A00;
        }
        JSONArray jSONArray = new JSONArray(str);
        ArrayList arrayListA0h = C3cG.A0h();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            C7384Etj.A0X(jSONObject);
            String strA00 = A00(jSONObject, "type");
            if (strA00 != null || (strA00 = A00(jSONObject, "app_source")) != null) {
                Locale locale = Locale.ROOT;
                C7384Etj.A0V(locale);
                String lowerCase = strA00.toLowerCase(locale);
                String strA002 = A00(jSONObject, NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM);
                String strA003 = A00(jSONObject, NodeCommandFallbackWorker.KEY_USER_ID);
                String strA004 = A00(jSONObject, "credential_source");
                arrayListA0h.add(new EOZ(lowerCase, strA002, strA003, strA004 != null ? strA004.toLowerCase(locale) : null));
            }
        }
        return arrayListA0h;
    }

    public static final String A00(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            String strOptString = jSONObject.optString(str);
            C7384Etj.A0X(strOptString);
            if (!C7BY.A0j(strOptString)) {
                return strOptString;
            }
        }
        return null;
    }
}
