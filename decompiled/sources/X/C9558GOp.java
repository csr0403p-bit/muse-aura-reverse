package X;

import org.json.JSONObject;

/* renamed from: X.GOp, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9558GOp {
    public final String A00;

    public C9558GOp(String str) {
        this.A00 = new JSONObject(str).optString("countryCode");
    }

    public C9558GOp(String str, String str2) {
        this.A00 = str2;
    }
}
