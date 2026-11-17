package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EDj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6533EDj implements EE9, EE7 {
    public final long A00;

    public final boolean equals(Object obj) {
        return this == obj || (obj != null && BV5.A1T(this, obj) && this.A00 == ((C6533EDj) obj).A00);
    }

    public final int hashCode() {
        return (((int) this.A00) * 31) + 1;
    }

    public C6533EDj(long j) {
        this.A00 = j;
    }

    @Override // X.EE7
    public final JSONObject Ah0() throws JSONException {
        JSONObject jSONObjectA18 = BV4.A18();
        jSONObjectA18.put("stale_age_s", this.A00);
        jSONObjectA18.put("is_itemized", true);
        return jSONObjectA18;
    }

    @Override // X.EE9
    public final String getIdentifier() {
        return "stale_removal";
    }
}
