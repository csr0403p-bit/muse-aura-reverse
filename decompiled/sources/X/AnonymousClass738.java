package X;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.738, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class AnonymousClass738 implements C73D {
    public int A00;
    public final List<C73D> A01;
    public final boolean A02;

    public final String A02() {
        return C6tn.A07(C3cH.A0e(",\n", this.A01), "  ");
    }

    public AnonymousClass738(int i, boolean z) {
        this.A00 = i;
        this.A02 = z;
        this.A01 = C3cG.A0h();
    }

    public static String A00(AnonymousClass738 anonymousClass738, Object obj, StringBuilder sb) {
        sb.append(obj);
        sb.append(", children=[\n");
        sb.append(anonymousClass738.A02());
        sb.append("\n])");
        return sb.toString();
    }

    public static void A01(AbstractCollection abstractCollection, Iterator it) {
        abstractCollection.add(((C73D) it.next()).A7J());
    }

    public AnonymousClass738() {
        this(Integer.MAX_VALUE, false);
    }
}
