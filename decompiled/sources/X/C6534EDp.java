package X;

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.EDp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6534EDp implements EE9, EE7 {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public static final C6534EDp A03 = new C6534EDp(true, true, false);
    public static final C6534EDp A05 = new C6534EDp(false, false, false);
    public static final C6534EDp A04 = new C6534EDp(true, true, true);

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6534EDp)) {
            return false;
        }
        C6534EDp c6534EDp = (C6534EDp) obj;
        return c6534EDp.A00 == this.A00 && c6534EDp.A01 == this.A01 && c6534EDp.A02 == this.A02;
    }

    public final int hashCode() {
        return Arrays.hashCode(new boolean[]{this.A00, this.A01, false, this.A02, false});
    }

    public C6534EDp(boolean z, boolean z2, boolean z3) {
        this.A01 = z;
        this.A00 = z2;
        this.A02 = z3;
    }

    @Override // X.EE7
    public final JSONObject Ah0() throws JSONException {
        JSONObject jSONObjectA18 = BV4.A18();
        jSONObjectA18.put("is_user_scoped", this.A01);
        jSONObjectA18.put("is_underlying_account_scoped", false);
        jSONObjectA18.put("keep_data_between_sessions", this.A02);
        jSONObjectA18.put("userid_in_path", this.A00);
        jSONObjectA18.put("keep_data_on_account_removal", false);
        return jSONObjectA18;
    }

    @Override // X.EE9
    public final String getIdentifier() {
        return "user_scope";
    }
}
