package X;

import android.view.View;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.F8t, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7652F8t {
    public static final C7652F8t A00 = new C7652F8t();

    public static final View A00(C7652F8t c7652F8t, FBB fbb, FDW fdw) {
        List<FDW> listA0G = fdw.A0G();
        if (listA0G != null) {
            Iterator<FDW> it = listA0G.iterator();
            while (it.hasNext()) {
                FDW fdwA0y = AbstractC7607F5u.A0y(it);
                View viewA09 = fdwA0y.A09(fbb);
                if (viewA09 != null || (viewA09 = A00(c7652F8t, fbb, fdwA0y)) != null) {
                    return viewA09;
                }
            }
        }
        return null;
    }
}
