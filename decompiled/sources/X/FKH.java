package X;

import android.content.Context;

/* loaded from: classes6.dex */
public abstract class FKH {
    public static final boolean A00(Context context) {
        C7384Etj.A0Y(context, 0);
        return (context.getApplicationContext().getApplicationInfo().flags & 4194304) != 0 && C8j3.A0Z(context).getLayoutDirection() == 1;
    }
}
