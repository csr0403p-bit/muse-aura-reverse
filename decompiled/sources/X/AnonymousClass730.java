package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.730, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass730 extends AnonymousClass738 {
    public int A00;
    public int A01;
    public C76B A02;

    @Override // X.C73D
    public final C73D A7J() {
        AnonymousClass730 anonymousClass730 = new AnonymousClass730();
        anonymousClass730.A02 = this.A02;
        anonymousClass730.A01 = this.A01;
        anonymousClass730.A00 = this.A00;
        List<C73D> list = ((AnonymousClass738) anonymousClass730).A01;
        List<C73D> list2 = super.A01;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<C73D> it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass738.A01(arrayListA0i, it);
        }
        list.addAll(arrayListA0i);
        return anonymousClass730;
    }

    @Override // X.C73D
    public final C76B AHq() {
        return this.A02;
    }

    @Override // X.C73D
    public final void Ado(C76B c76b) {
        this.A02 = c76b;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EmittableColumn(modifier=");
        sbA0x.append(this.A02);
        sbA0x.append(", verticalAlignment=");
        sbA0x.append((Object) FGI.A0G("Vertical(value=", ')', this.A01));
        sbA0x.append(", horizontalAlignment=");
        return AnonymousClass738.A00(this, FGI.A0G("Horizontal(value=", ')', this.A00), sbA0x);
    }

    public AnonymousClass730() {
        super(Integer.MAX_VALUE, false);
        this.A02 = C76B.A00;
        this.A01 = 0;
        this.A00 = 0;
    }
}
