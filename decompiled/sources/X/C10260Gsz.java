package X;

import java.util.Iterator;

/* renamed from: X.Gsz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10260Gsz extends AbstractC10243Gse {
    public static final C7318Ekj<C10259Gsy<Gt4>> A01 = new C7318Ekj<>(new C8927Ftj(6));
    public final boolean A00;

    public final String toString() {
        return String.format(":has(%s)", this.A02);
    }

    public C10260Gsz(AbstractC10245Gsg abstractC10245Gsg) {
        boolean z;
        super(abstractC10245Gsg);
        if (abstractC10245Gsg instanceof Gsm) {
            Iterator<AbstractC10245Gsg> it = ((Gsm) abstractC10245Gsg).A03.iterator();
            while (it.hasNext()) {
                AbstractC10245Gsg next = it.next();
                if ((next instanceof C10258Gsx) || (next instanceof C10248Gsj)) {
                    z = true;
                    break;
                }
            }
            z = false;
        } else {
            z = false;
        }
        this.A00 = z;
    }
}
