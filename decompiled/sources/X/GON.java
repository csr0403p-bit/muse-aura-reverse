package X;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GON {
    public final long A00;
    public final GPD A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final C9546GOc A06;
    public final GOT A07;
    public final ArrayList A08;

    public GON(JSONObject jSONObject) throws JSONException {
        C9546GOc c9546GOc;
        GPD gpd;
        this.A02 = jSONObject.optString("formattedPrice");
        this.A00 = jSONObject.optLong("priceAmountMicros");
        this.A03 = jSONObject.optString("priceCurrencyCode");
        String strOptString = jSONObject.optString("offerIdToken");
        this.A04 = strOptString.isEmpty() ? null : strOptString;
        jSONObject.optString("offerId");
        jSONObject.optString("purchaseOptionId");
        jSONObject.optInt("offerType");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("offerTags");
        this.A08 = C3cG.A0h();
        if (jSONArrayOptJSONArray != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                this.A08.add(jSONArrayOptJSONArray.getString(i));
            }
        }
        if (jSONObject.has("fullPriceMicros")) {
            jSONObject.optLong("fullPriceMicros");
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("discountDisplayInfo");
        if (jSONObjectOptJSONObject == null) {
            c9546GOc = null;
        } else {
            c9546GOc = new C9546GOc();
            if (jSONObjectOptJSONObject.has("percentageDiscount")) {
                jSONObjectOptJSONObject.optInt("percentageDiscount");
            }
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("discountAmount");
            if (jSONObjectOptJSONObject2 != null) {
                jSONObjectOptJSONObject2.optString("formattedDiscountAmount");
                jSONObjectOptJSONObject2.optLong("discountAmountMicros");
                jSONObjectOptJSONObject2.optString("discountAmountCurrencyCode");
            }
        }
        this.A06 = c9546GOc;
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("validTimeWindow");
        if (jSONObjectOptJSONObject3 != null) {
            if (jSONObjectOptJSONObject3.has("startTimeMillis")) {
                jSONObjectOptJSONObject3.optLong("startTimeMillis");
            }
            if (jSONObjectOptJSONObject3.has("endTimeMillis")) {
                jSONObjectOptJSONObject3.optLong("endTimeMillis");
            }
        }
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("limitedQuantityInfo");
        if (jSONObjectOptJSONObject4 != null) {
            jSONObjectOptJSONObject4.getInt("maximumQuantity");
            jSONObjectOptJSONObject4.getInt("remainingQuantity");
        }
        this.A05 = jSONObject.optString("serializedDocid");
        JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject("preorderDetails");
        if (jSONObjectOptJSONObject5 != null) {
            jSONObjectOptJSONObject5.getLong("preorderReleaseTimeMillis");
            jSONObjectOptJSONObject5.getLong("preorderPresaleEndTimeMillis");
        }
        JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("rentalDetails");
        if (jSONObjectOptJSONObject6 != null) {
            jSONObjectOptJSONObject6.getString("rentalPeriod");
            jSONObjectOptJSONObject6.optString("rentalExpirationPeriod");
        }
        JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("autoPayDetails");
        if (jSONObjectOptJSONObject7 == null) {
            gpd = null;
        } else {
            gpd = new GPD();
            jSONObjectOptJSONObject7.getString("type");
        }
        this.A01 = gpd;
        JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("pricingPhases");
        this.A07 = jSONArrayOptJSONArray2 != null ? new GOT(jSONArrayOptJSONArray2) : null;
    }
}
