package X;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;

/* loaded from: classes4.dex */
public abstract class A23 {
    public static final FragmentActivity A00(Context context) {
        if (context instanceof FragmentActivity) {
            return (FragmentActivity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            throw C3cG.A0Q("Context is not a FragmentActivity");
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        C7384Etj.A0U(baseContext);
        return A00(baseContext);
    }

    public static final A25 A01(Context context) {
        FragmentActivity fragmentActivityA00 = A00(context);
        C08419ug c08419ug = C08419ug.A00;
        C7384Etj.A0Y(fragmentActivityA00, 0);
        return ((A24) new BON(c08419ug, fragmentActivityA00.getViewModelStore(), AnonymousClass003.A0Z(fragmentActivityA00)).A02(C3cG.A0x(A24.class))).A00;
    }
}
