package X;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class ED8 {
    public final String A00;

    public final void A00(String str) {
        ED7 ed7 = (ED7) this;
        ed7.A00.edit().remove(FGI.A0H(ed7.A01, str.hashCode())).apply();
    }

    public final void A01(String str, JSONObject jSONObject) throws JSONException {
        ED7 ed7 = (ED7) this;
        try {
            jSONObject.put("path", str);
        } catch (JSONException unused) {
            AbstractC3422CMk.A03("SharedPrefCaskMetadataStore", FGI.A0d("Failed to add path for plugin=", ((ED8) ed7).A00, "; path=", str));
        }
        ed7.A00.edit().putString(FGI.A0H(ed7.A01, str.hashCode()), jSONObject.toString()).apply();
    }

    public ED8(String str) {
        this.A00 = str;
    }
}
