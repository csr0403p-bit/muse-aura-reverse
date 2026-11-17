package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.733, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass733 extends AnonymousClass738 {
    public C76B A00;
    public final int A01;

    public AnonymousClass733(int i) {
        super(i, false);
        this.A01 = i;
        this.A00 = C76B.A00;
    }

    @Override // X.C73D
    public final C73D A7J() {
        AnonymousClass733 anonymousClass733 = new AnonymousClass733(this.A01);
        anonymousClass733.A00 = this.A00;
        List<C73D> list = ((AnonymousClass738) anonymousClass733).A01;
        List<C73D> list2 = super.A01;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<C73D> it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass738.A01(arrayListA0i, it);
        }
        list.addAll(arrayListA0i);
        return anonymousClass733;
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
        return AnonymousClass738.A00(this, this.A00, C60O.A0x("RemoteViewsRoot(modifier="));
    }
}
