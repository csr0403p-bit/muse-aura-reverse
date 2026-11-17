package X;

import java.io.PrintWriter;

/* renamed from: X.Fgb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8577Fgb extends AbstractC8628Fhf {
    public final C1HY A00;
    public final A21 A01;

    @Deprecated
    public final void A00(PrintWriter printWriter, String str) {
        Ao1 ao1 = this.A01.A00;
        if (ao1.A00 > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (0 < ao1.A00) {
                ao1.A02(0);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(ao1.A00(0));
                printWriter.print(": ");
                throw BV4.A0a("toString");
            }
        }
    }

    public final String toString() {
        StringBuilder sbA0p = BV4.A0p(128);
        sbA0p.append("LoaderManager{");
        AbstractC7609F5w.A1K(sbA0p, this);
        sbA0p.append(" in ");
        C1HY c1hy = this.A00;
        AbstractC7609F5w.A1L(sbA0p, c1hy);
        sbA0p.append("{");
        AbstractC7609F5w.A1K(sbA0p, c1hy);
        return AnonymousClass001.A0v("}}", sbA0p);
    }

    public C8577Fgb(C1HY c1hy, BJt bJt) {
        this.A00 = c1hy;
        InterfaceC08439ui interfaceC08439ui = A21.A01;
        C7384Etj.A0Y(bJt, 0);
        this.A01 = (A21) new BON(interfaceC08439ui, bJt, A6K.A00).A01(A21.class);
    }
}
