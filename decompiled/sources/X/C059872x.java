package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72x, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C059872x extends AnonymousClass732 {
    @Override // X.C73D
    public final C73D A7J() {
        C059872x c059872x = new C059872x();
        ((AnonymousClass732) c059872x).A02 = ((AnonymousClass732) this).A02;
        ((AnonymousClass732) c059872x).A00 = ((AnonymousClass732) this).A00;
        ((AnonymousClass732) c059872x).A01 = ((AnonymousClass732) this).A01;
        List<C73D> list = ((AnonymousClass738) c059872x).A01;
        List<C73D> list2 = ((AnonymousClass738) this).A01;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
        Iterator<C73D> it = list2.iterator();
        while (it.hasNext()) {
            AnonymousClass738.A01(arrayListA0i, it);
        }
        list.addAll(arrayListA0i);
        return c059872x;
    }
}
