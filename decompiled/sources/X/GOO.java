package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GOO {
    public final GOT A00;
    public final String A01;
    public final String A02;
    public final GOP A03;
    public final ArrayList A04;

    public GOO(JSONObject jSONObject) throws JSONException {
        jSONObject.optString("basePlanId");
        String strOptString = jSONObject.optString("offerId");
        this.A01 = strOptString.isEmpty() ? null : strOptString;
        this.A02 = jSONObject.getString("offerIdToken");
        this.A00 = new GOT(jSONObject.getJSONArray("pricingPhases"));
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("installmentPlanDetails");
        if (jSONObjectOptJSONObject != null) {
            jSONObjectOptJSONObject.getInt("commitmentPaymentsCount");
            jSONObjectOptJSONObject.optInt("subsequentCommitmentPaymentsCount");
        }
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("transitionPlanDetails");
        this.A03 = jSONObjectOptJSONObject2 != null ? new GOP(jSONObjectOptJSONObject2) : null;
        ArrayList arrayListA0h = C3cG.A0h();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListA0h.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        this.A04 = arrayListA0h;
    }
}
