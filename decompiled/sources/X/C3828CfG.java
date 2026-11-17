package X;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

@Deprecated
/* renamed from: X.CfG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3828CfG extends AbstractC4178Com<GoogleSignInOptions> {
    public static int A00 = 1;

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r4v0 X.CfG) */
    public static final synchronized int A00(C3828CfG c3828CfG) {
        int i;
        synchronized (c3828CfG) {
            i = A00;
            if (i == 1) {
                Context context = c3828CfG.A01;
                C4001CjU c4001CjU = C4001CjU.A00;
                int iA01 = c4001CjU.A01(context, 12451000);
                if (iA01 == 0) {
                    i = 4;
                } else {
                    if (c4001CjU.A02(context, null, iA01) == null) {
                        i = 3;
                        if (Cb9.A00(context, "com.google.android.gms.auth.api.fallback") == 0) {
                        }
                    }
                    i = 2;
                }
                A00 = i;
            }
        }
        return i;
    }
}
