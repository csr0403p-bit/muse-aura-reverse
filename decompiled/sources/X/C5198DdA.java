package X;

import com.facebook.aura.auth.strategies.AuraBloksLoginStrategyKt;
import com.facebook.aura.gateway.JarvisProtocolKt;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import org.json.JSONObject;

/* renamed from: X.DdA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5198DdA {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C5198DdA(JSONObject jSONObject) throws NumberFormatException {
        this.A06 = jSONObject.getString(NodeCommandFallbackWorker.KEY_USER_ID);
        this.A00 = jSONObject.getString(NativeLoginCheckpointContinuationKt.ACCESS_TOKEN_PARAM);
        A00(jSONObject, "user_data");
        A00(jSONObject, "admin_id");
        A00(jSONObject, "admin_token");
        A00(jSONObject, "session_cookies_string");
        this.A05 = A00(jSONObject, "session_secret");
        this.A04 = A00(jSONObject, "session_key");
        this.A07 = A00(jSONObject, "username");
        this.A01 = A00(jSONObject, "analytics_claim");
        A00(jSONObject, "horizon_id");
        A00(jSONObject, "horizon_token");
        this.A03 = A00(jSONObject, "frl_account_id");
        this.A02 = A00(jSONObject, AuraBloksLoginStrategyKt.FRL_ACCESS_TOKEN_KEY);
        String strA00 = A00(jSONObject, JarvisProtocolKt.APP_ID_QUERY_PARAM);
        if (strA00 != null) {
            Long.parseLong(strA00, 10);
        }
        A00(jSONObject, "traffic_telemetry_claim");
    }

    public static String A00(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.getString(str);
    }
}
