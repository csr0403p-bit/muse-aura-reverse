package X;

import org.json.JSONObject;

/* renamed from: X.Ctl, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4343Ctl {
    public static final boolean A00(String str) {
        boolean z = false;
        if (C8j3.A0J(str, 0) == 0) {
            return false;
        }
        try {
            new JSONObject(str);
            z = true;
            return true;
        } catch (Exception unused) {
            return z;
        }
    }
}
