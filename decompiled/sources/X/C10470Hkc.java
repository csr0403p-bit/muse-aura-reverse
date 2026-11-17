package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.Hkc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10470Hkc {
    public Set A00 = GNH.A05;
    public final String A01;
    public final String A02;
    public final JSONObject A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C10470Hkc) {
                C10470Hkc c10470Hkc = (C10470Hkc) obj;
                if (!TextUtils.equals(this.A01, c10470Hkc.A01) || !TextUtils.equals(this.A02, c10470Hkc.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        return FGI.A0M("Purchase. Json: ", this.A01);
    }

    public C10470Hkc(String str, String str2) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = new JSONObject(str);
    }

    public static ArrayList A00(C10470Hkc c10470Hkc) {
        ArrayList arrayListA0h = C3cG.A0h();
        JSONObject jSONObject = c10470Hkc.A03;
        if (jSONObject.has("productIds")) {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("productIds");
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayListA0h.add(jSONArrayOptJSONArray.optString(i));
                }
            }
        } else if (jSONObject.has("productId")) {
            arrayListA0h.add(jSONObject.optString("productId"));
        }
        return arrayListA0h;
    }
}
