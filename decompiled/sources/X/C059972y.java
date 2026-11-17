package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C059972y extends AnonymousClass738 {
    public C76B A00;
    public C059672t A01;

    @Override // X.C73D
    public final C73D A7J() {
        C059972y c059972y = new C059972y();
        c059972y.A00 = this.A00;
        c059972y.A01 = this.A01;
        List<C73D> list = ((AnonymousClass738) c059972y).A01;
        List<C73D> list2 = super.A01;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<C73D> it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass738.A01(arrayListA0i, it);
        }
        list.addAll(arrayListA0i);
        return c059972y;
    }

    @Override // X.C73D
    public final C76B AHq() {
        return this.A00;
    }

    @Override // X.C73D
    public final void Ado(C76B c76b) {
        this.A00 = c76b;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EmittableBox(modifier=");
        sbA0x.append(this.A00);
        sbA0x.append(", contentAlignment=");
        sbA0x.append(this.A01);
        sbA0x.append("children=[\n");
        sbA0x.append(A02());
        return AnonymousClass001.A0v("\n])", sbA0x);
    }

    public C059972y() {
        super(Integer.MAX_VALUE, false);
        this.A00 = C76B.A00;
        this.A01 = C059672t.A04;
    }
}
