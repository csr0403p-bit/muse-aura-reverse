package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class Gsl extends AbstractC10243Gse {
    public int A00;
    public final ArrayList<AbstractC10245Gsg> A01;

    @Override // X.AbstractC10243Gse, X.AbstractC10245Gsg
    public final void A01() {
        Iterator<AbstractC10245Gsg> it = this.A01.iterator();
        while (it.hasNext()) {
            it.next().A01();
        }
        super.A01();
    }

    public final String toString() {
        ArrayList<AbstractC10245Gsg> arrayList = this.A01;
        C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
        return Gt5.A00(" > ", arrayList.iterator());
    }

    public Gsl(AbstractC10245Gsg abstractC10245Gsg) {
        super(abstractC10245Gsg);
        ArrayList<AbstractC10245Gsg> arrayListA0h = C3cG.A0h();
        this.A01 = arrayListA0h;
        this.A00 = 2;
        arrayListA0h.add(abstractC10245Gsg);
        this.A00 = abstractC10245Gsg.A00() + 2;
    }
}
