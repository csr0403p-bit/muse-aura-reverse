package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EDd, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6531EDd implements EE9, EE7 {
    public final long A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && BV5.A1T(this, obj)) {
                C6531EDd c6531EDd = (C6531EDd) obj;
                if (this.A00 != c6531EDd.A00 || this.A01 != c6531EDd.A01 || this.A02 != c6531EDd.A02) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.EE9
    public final String getIdentifier() {
        return "max_size";
    }

    public final int hashCode() {
        return (AnonymousClass006.A06(this.A02, ((((int) this.A00) * 31) + ((int) this.A01)) * 31) * 31) + 1;
    }

    public C6531EDd(long j, long j2, long j3) {
        this.A00 = j;
        this.A01 = j2;
        this.A02 = j3;
    }

    @Override // X.EE7
    public final JSONObject Ah0() throws JSONException {
        JSONObject jSONObjectA18 = BV4.A18();
        jSONObjectA18.put("max_size", this.A00);
        jSONObjectA18.put("max_size_low_space_bytes", this.A01);
        jSONObjectA18.put("max_size_very_low_space_bytes", this.A02);
        jSONObjectA18.put("delete_only_on_init", false);
        jSONObjectA18.put("is_itemized", true);
        return jSONObjectA18;
    }
}
