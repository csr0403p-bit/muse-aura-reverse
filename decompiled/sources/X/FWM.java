package X;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes6.dex */
public abstract class FWM {
    public static int A00(Context context, String str, int i) {
        TypedValue typedValueA0Z = AbstractC7607F5u.A0Z();
        if (context.getTheme().resolveAttribute(i, typedValueA0Z, true)) {
            return typedValueA0Z.data;
        }
        throw BV5.A0T("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", new Object[]{str, context.getResources().getResourceName(i)});
    }

    public static int A01(View view, int i) {
        return A00(view.getContext(), view.getClass().getCanonicalName(), i);
    }
}
