package X;

import android.database.Cursor;
import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import libraries.access.src.main.base.contentprovider.transformers.TransformerException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class EPQ implements EQ5 {
    public final EPM A00;

    @Override // X.EQ5
    public final EPY AhF(Cursor cursor, EPM epm, EPi ePi) throws JSONException {
        String strOptString;
        String strOptString2;
        String strOptString3 = "";
        try {
            String string = cursor.getString(AnonymousClass005.A1Z(cursor, epm, ePi) ? 1 : 0);
            if (string == null) {
                return null;
            }
            JSONObject jSONObjectA19 = BV4.A19(string);
            C10543Hqv c10543HqvA0z = C3cG.A0z();
            c10543HqvA0z.element = "";
            C10543Hqv c10543HqvA0z2 = C3cG.A0z();
            c10543HqvA0z2.element = "";
            if (jSONObjectA19.has("userId")) {
                strOptString = C7384Etj.A0L(jSONObjectA19, "userId");
            } else {
                strOptString = jSONObjectA19.optString(NodeCommandFallbackWorker.KEY_USER_ID);
                C7384Etj.A0U(strOptString);
            }
            A00("name", c10543HqvA0z, jSONObjectA19);
            A00("profilePicUrl", c10543HqvA0z2, jSONObjectA19);
            if (jSONObjectA19.has("accessToken")) {
                strOptString2 = C7384Etj.A0L(jSONObjectA19, "accessToken");
            } else {
                strOptString2 = jSONObjectA19.optString("auth_token");
                C7384Etj.A0U(strOptString2);
            }
            if (jSONObjectA19.has("sso_settings_v2")) {
                strOptString3 = jSONObjectA19.optString("sso_settings_v2");
                C7384Etj.A0U(strOptString3);
            }
            if (jSONObjectA19.has("profile")) {
                JSONObject jSONObject = jSONObjectA19.getJSONObject("profile");
                C7384Etj.A0U(jSONObject);
                if (jSONObject.has("userId")) {
                    strOptString = C7384Etj.A0L(jSONObject, "userId");
                }
                A00("name", c10543HqvA0z, jSONObject);
                A00("profilePictureUri", c10543HqvA0z2, jSONObject);
            }
            C5226Ddj c5226DdjA00 = AbstractC5227Ddk.A00(strOptString3);
            int length = strOptString.length();
            if (length == 0) {
                CFK.A06("FacebookSsoTransformer", AnonymousClass007.A0a("[empty fb_local_auth debug] Invalid account data: userId is empty, credentialSource: ", ePi));
            }
            int length2 = strOptString2.length();
            if (length2 == 0) {
                CFK.A06("FacebookSsoTransformer", AnonymousClass007.A0a("[empty fb_local_auth debug] Invalid account data: accessToken is empty, credentialSource: ", ePi));
            }
            if (length != 0 && length2 != 0) {
                CFK.A06("FacebookSsoTransformer", AnonymousClass007.A0a("[empty fb_local_auth debug] Valid account data: userId and accessToken, credentialSource: ", ePi));
            }
            return new EPY(strOptString, strOptString2, "FACEBOOK", new C7144EhA((C10543Hqv<String>) c10543HqvA0z, (C10543Hqv<String>) c10543HqvA0z2, c5226DdjA00), epm, ePi);
        } catch (JSONException e) {
            throw new TransformerException(e);
        }
    }

    @Override // X.EQ5
    public final C6683EPv AhH(Cursor cursor, EnumC7407Eul enumC7407Eul) {
        throw C8j3.A18("Not implemented");
    }

    public EPQ(EPM epm) {
        this.A00 = epm;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object, java.lang.String] */
    public static void A00(String str, C10543Hqv c10543Hqv, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            ?? OptString = jSONObject.optString(str);
            C7384Etj.A0U(OptString);
            c10543Hqv.element = OptString;
        }
    }

    @Override // X.EQ5
    public final EPY AhG(Cursor cursor, EPi ePi) throws JSONException {
        try {
            String string = cursor.getString(C60P.A1Y(cursor, ePi) ? 1 : 0);
            if (string == null) {
                return null;
            }
            JSONObject jSONObjectA19 = BV4.A19(string);
            JSONObject jSONObject = jSONObjectA19.getJSONObject("profile");
            String strOptString = "";
            if (jSONObjectA19.has("sso_settings_v2")) {
                strOptString = jSONObjectA19.optString("sso_settings_v2");
                C7384Etj.A0U(strOptString);
            }
            C5226Ddj c5226DdjA00 = AbstractC5227Ddk.A00(strOptString);
            return new EPY(C7384Etj.A0L(jSONObject, ErrorReportingConstants.USER_ID_KEY), C7384Etj.A0L(jSONObjectA19, NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM), "FACEBOOK", new C7144EhA(c5226DdjA00, jSONObject, 8), this.A00, ePi);
        } catch (JSONException e) {
            throw new TransformerException(e);
        }
    }
}
