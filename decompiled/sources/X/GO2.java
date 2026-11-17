package X;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class GO2 {
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GO2) {
            return TextUtils.equals(this.A03, ((GO2) obj).A03);
        }
        return false;
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("UnfetchedProduct{productId='");
        sbA0x.append(this.A01);
        sbA0x.append("', productType='");
        sbA0x.append(this.A02);
        sbA0x.append("', statusCode=");
        sbA0x.append(this.A00);
        return C8j3.A15(sbA0x);
    }

    public GO2(String str) {
        this.A03 = str;
        JSONObject jSONObject = new JSONObject(str);
        this.A01 = jSONObject.optString("productId");
        String strOptString = jSONObject.optString("type");
        this.A02 = strOptString;
        this.A00 = jSONObject.has("statusCode") ? jSONObject.optInt("statusCode") : 0;
        if (TextUtils.isEmpty(strOptString)) {
            throw C60O.A0i("Product type cannot be empty.");
        }
        jSONObject.optString("serializedDocid");
    }
}
