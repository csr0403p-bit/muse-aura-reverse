package X;

import android.database.Cursor;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.Iterator;
import libraries.accessv2.src.model.FXAccessException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class ENu implements EO7 {
    public final EP0 A00;

    @Override // X.EO7
    public final ENw AhJ(Cursor cursor, EP1 ep1) throws FXAccessException {
        C3005Brn c3005Brn;
        C7384Etj.A0Y(cursor, 0);
        JSONObject jSONObjectA19 = BV4.A19(EO2.A00(cursor, BrowserOperationCatalogKt.VALUE));
        String strOptString = jSONObjectA19.optString("userId");
        if (strOptString.length() == 0) {
            strOptString = jSONObjectA19.optString(NodeCommandFallbackWorker.KEY_USER_ID);
        }
        if (C7384Etj.A06(strOptString) == 0 && jSONObjectA19.has("profile")) {
            strOptString = jSONObjectA19.getJSONObject("profile").optString("userId");
        }
        if (C7384Etj.A06(strOptString) == 0) {
            throw new FXAccessException("userId is null or empty", ENz.A09);
        }
        String strOptString2 = jSONObjectA19.optString("accessToken");
        if (strOptString2.length() == 0) {
            strOptString2 = jSONObjectA19.optString("auth_token");
        }
        if (C7384Etj.A06(strOptString2) == 0) {
            throw new FXAccessException("accessToken is null or empty", ENz.A09);
        }
        if (ep1 == null) {
            throw new FXAccessException("credentialSource is required for legacy transformers", ENz.A09);
        }
        String strOptString3 = jSONObjectA19.optString("sso_settings_v2");
        if (strOptString3 == null || strOptString3.length() == 0) {
            c3005Brn = null;
        } else {
            try {
                JSONObject jSONObjectA192 = BV4.A19(strOptString3);
                String strValueOf = String.valueOf(3);
                BXn bXnA00 = A00(strValueOf, "sso_eligibility", jSONObjectA192);
                BXn bXnA002 = A00(strValueOf, "nta_eligibility", jSONObjectA192);
                BXn bXnA003 = A00(strValueOf, "nta_super_eligibility", jSONObjectA192);
                boolean zOptBoolean = jSONObjectA192.optBoolean("is_feta", false);
                String strOptString4 = jSONObjectA192.optString("personalization_data");
                String str = null;
                if (C7384Etj.A06(strOptString4) > 0) {
                    str = strOptString4;
                }
                c3005Brn = new C3005Brn(str, bXnA00, bXnA002, bXnA003, jSONObjectA192.optInt("version_number", 0), jSONObjectA192.optLong("timestamp", -1L), zOptBoolean);
            } catch (JSONException unused) {
            }
        }
        return new ENw(null, strOptString, strOptString2, this.A00, ep1, c3005Brn, null);
    }

    public ENu(EP0 ep0) {
        this.A00 = ep0;
    }

    public static final BXn A00(String str, String str2, JSONObject jSONObject) {
        Object next;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str2);
        if (jSONObjectOptJSONObject != null) {
            String strOptString = jSONObjectOptJSONObject.optString(str, "");
            Iterator<E> it = BXn.A00.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (C7384Etj.areEqual(next.toString(), strOptString)) {
                    break;
                }
            }
            BXn bXn = (BXn) next;
            if (bXn != null) {
                return bXn;
            }
        }
        return BXn.A02;
    }
}
