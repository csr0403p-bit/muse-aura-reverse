package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.739, reason: invalid class name */
/* loaded from: classes3.dex */
public final class AnonymousClass739 extends AnonymousClass738 {
    public long A00;
    public C70B A01;

    @Override // X.C73D
    public final C73D A7J() {
        AnonymousClass739 anonymousClass739 = new AnonymousClass739();
        anonymousClass739.A00 = this.A00;
        anonymousClass739.A01 = this.A01;
        List<C73D> list = ((AnonymousClass738) anonymousClass739).A01;
        List<C73D> list2 = super.A01;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<C73D> it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass738.A01(arrayListA0i, it);
        }
        list.addAll(arrayListA0i);
        return anonymousClass739;
    }

    @Override // X.C73D
    public final C76B AHq() {
        C76B c76bAHq;
        C73D c73d = (C73D) AbstractC0878AGe.A0K(super.A01);
        return (c73d == null || (c76bAHq = c73d.AHq()) == null) ? AnonymousClass722.A00(C76B.A00) : c76bAHq;
    }

    @Override // X.C73D
    public final void Ado(C76B c76b) {
        throw new IllegalAccessError("You cannot set the modifier of an EmittableSizeBox");
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("EmittableSizeBox(size=");
        sbA0x.append((Object) C73O.A01(this.A00));
        sbA0x.append(", sizeMode=");
        return AnonymousClass738.A00(this, this.A01, sbA0x);
    }

    public AnonymousClass739() {
        super(Integer.MAX_VALUE, false);
        this.A00 = 9205357640488583168L;
        this.A01 = C73B.A00;
    }
}
