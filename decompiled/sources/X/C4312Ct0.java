package X;

import android.os.Bundle;

/* renamed from: X.Ct0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4312Ct0 extends AbstractC4300Cso {
    public final String A00;

    public C4312Ct0(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.A00 = str;
        if (!AbstractC4343Ctl.A00(str)) {
            throw C60O.A0i("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }
}
