package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ffy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC8545Ffy {
    public static final AbstractC8522FfX A00 = new C8565FgJ();
    public static final AbstractC8522FfX A01;

    public static final void A00(List<? extends View> list, int i) {
        C7384Etj.A0Y(list, 0);
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            it.next().setVisibility(i);
        }
    }

    static {
        AbstractC8522FfX abstractC8522FfX;
        try {
            Class<?> cls = Class.forName("androidx.transition.FragmentTransitionSupport");
            C7384Etj.A0Z(cls, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            abstractC8522FfX = (AbstractC8522FfX) cls.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            abstractC8522FfX = null;
        }
        A01 = abstractC8522FfX;
    }
}
