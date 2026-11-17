package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72z, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C060072z extends AnonymousClass734 {
    public long A00;
    public C76B A01 = C72e.A00(new C062775h(AnonymousClass735.A00));

    @Override // X.C73D
    public final C73D A7J() {
        C060072z c060072z = new C060072z();
        c060072z.A00 = this.A00;
        ((AnonymousClass734) c060072z).A00 = ((AnonymousClass734) this).A00;
        List<C73D> list = ((AnonymousClass738) c060072z).A01;
        List<C73D> list2 = super.A01;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<C73D> it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass738.A01(arrayListA0i, it);
        }
        list.addAll(arrayListA0i);
        return c060072z;
    }

    @Override // X.C73D
    public final C76B AHq() {
        return this.A01;
    }

    @Override // X.C73D
    public final void Ado(C76B c76b) {
        this.A01 = c76b;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EmittableLazyListItem(modifier=");
        sbA0x.append(this.A01);
        sbA0x.append(C8j2.A00(8));
        return AnonymousClass738.A00(this, ((AnonymousClass734) this).A00, sbA0x);
    }
}
