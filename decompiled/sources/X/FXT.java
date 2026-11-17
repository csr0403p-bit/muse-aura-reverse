package X;

import com.facebook.graphservice.interfaces.Tree;

/* loaded from: classes6.dex */
public abstract class FXT {
    public static final void A00(Object obj) {
        if (obj == null) {
            throw BV4.A0a(FGI.A0M("null cannot be cast to non-null type ", Tree.class.getName()));
        }
        if (obj instanceof Tree) {
            return;
        }
        if (obj instanceof A7N) {
            A7O a7o = ((A7N) obj).innerData;
            if ((a7o instanceof Tree) && a7o != null) {
                return;
            }
        }
        throw new ClassCastException(FGI.A0U(C60Q.A0e(obj), C8j2.A00(24), Tree.class.getName()));
    }
}
