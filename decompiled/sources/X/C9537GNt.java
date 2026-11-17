package X;

import android.text.TextUtils;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.GNt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9537GNt {
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final ArrayList A04;
    public final ArrayList A05;
    public final JSONObject A06;
    public final String A07;
    public final String A08;

    public final GON A00() {
        ArrayList arrayList = this.A05;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        return (GON) arrayList.get(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9537GNt) {
            return TextUtils.equals(this.A07, ((C9537GNt) obj).A07);
        }
        return false;
    }

    public final int hashCode() {
        return this.A07.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("ProductDetails{jsonString='");
        sbA0x.append(this.A07);
        sbA0x.append("', parsedJson=");
        sbA0x.append(this.A06);
        sbA0x.append(", productId='");
        sbA0x.append(this.A00);
        sbA0x.append("', productType='");
        sbA0x.append(this.A01);
        sbA0x.append("', title='");
        sbA0x.append(this.A08);
        sbA0x.append("', productDetailsToken='");
        sbA0x.append(this.A02);
        sbA0x.append("', subscriptionOfferDetails=");
        sbA0x.append(this.A04);
        return C8j3.A15(sbA0x);
    }

    public C9537GNt(String str) {
        this.A07 = str;
        JSONObject jSONObject = new JSONObject(str);
        this.A06 = jSONObject;
        String strOptString = jSONObject.optString("productId");
        this.A00 = strOptString;
        String strOptString2 = jSONObject.optString("type");
        this.A01 = strOptString2;
        if (TextUtils.isEmpty(strOptString)) {
            throw C60O.A0i("Product id cannot be empty.");
        }
        if (TextUtils.isEmpty(strOptString2)) {
            throw C60O.A0i("Product type cannot be empty.");
        }
        this.A08 = jSONObject.optString("title");
        jSONObject.optString("name");
        jSONObject.optString(HatchWebPageParserKt.DESCRIPTION);
        jSONObject.optString("packageDisplayName");
        jSONObject.optString("iconUrl");
        this.A02 = jSONObject.optString("skuDetailsToken");
        this.A03 = jSONObject.optString("serializedDocid");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("subscriptionOfferDetails");
        ArrayList arrayListA0h = null;
        if (jSONArrayOptJSONArray != null) {
            arrayListA0h = C3cG.A0h();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                arrayListA0h.add(new GOO(jSONArrayOptJSONArray.getJSONObject(i)));
            }
        } else if (strOptString2.equals("subs") || strOptString2.equals("play_pass_subs")) {
            arrayListA0h = C3cG.A0h();
        }
        this.A04 = arrayListA0h;
        JSONObject jSONObjectOptJSONObject = this.A06.optJSONObject("oneTimePurchaseOfferDetails");
        JSONArray jSONArrayOptJSONArray2 = this.A06.optJSONArray("oneTimePurchaseOfferDetailsList");
        ArrayList arrayListA0h2 = C3cG.A0h();
        if (jSONArrayOptJSONArray2 != null) {
            for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                arrayListA0h2.add(new GON(jSONArrayOptJSONArray2.getJSONObject(i2)));
            }
        } else if (jSONObjectOptJSONObject == null) {
            return;
        } else {
            arrayListA0h2.add(new GON(jSONObjectOptJSONObject));
        }
        this.A05 = arrayListA0h2;
    }
}
