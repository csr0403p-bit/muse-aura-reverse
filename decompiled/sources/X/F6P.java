package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes6.dex */
public final class F6P {
    public static final F6P A00 = new F6P();

    public static final Activity A00(Context context, F6P f6p) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C7384Etj.A0U(baseContext);
        return A00(baseContext, f6p);
    }
}
