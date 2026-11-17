package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GOP {
    public final GOS A00;

    public GOP(JSONObject jSONObject) throws JSONException {
        jSONObject.getString("productId");
        jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString(HatchWebPageParserKt.DESCRIPTION);
        jSONObject.optString("basePlanId");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("pricingPhase");
        this.A00 = jSONObjectOptJSONObject == null ? null : new GOS(jSONObjectOptJSONObject);
    }
}
