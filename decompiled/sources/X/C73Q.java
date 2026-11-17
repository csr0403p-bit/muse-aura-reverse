package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.73Q, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C73Q extends BMc<C73D> {
    public final int A00;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.BMc
    public final void A00() {
        T t = this.A01;
        C7384Etj.A0Z(t, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        ((AnonymousClass738) t).A01.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1370Ahw
    public final /* bridge */ /* synthetic */ void ANm(int i, Object obj) {
        C73D c73d = (C73D) obj;
        T t = super.A00;
        C7384Etj.A0Z(t, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
        int i2 = ((AnonymousClass738) t).A00;
        if (i2 <= 0) {
            T t2 = this.A01;
            C7384Etj.A0Z(t2, "null cannot be cast to non-null type androidx.glance.EmittableWithChildren");
            throw C60O.A0i(FGI.A0H("Too many embedded views for the current surface. The maximum depth is: ", ((AnonymousClass738) t2).A00));
        }
        if (c73d instanceof AnonymousClass738) {
            AnonymousClass738 anonymousClass738 = (AnonymousClass738) c73d;
            anonymousClass738.A00 = anonymousClass738.A02 ? this.A00 : i2 - 1;
        }
        C73D c73d2 = (C73D) super.A00;
        if (!(c73d2 instanceof AnonymousClass738)) {
            throw C3cG.A0Q("Current node cannot accept children");
        }
        ((AnonymousClass738) c73d2).A01.add(i, c73d);
    }

    @Override // X.InterfaceC1370Ahw
    public final void AQt(int i, int i2, int i3) {
        C73D c73d = (C73D) super.A00;
        if (!(c73d instanceof AnonymousClass738)) {
            throw C3cG.A0Q("Current node cannot accept children");
        }
        List<C73D> list = ((AnonymousClass738) c73d).A01;
        int i4 = i2 - i3;
        if (i > i2) {
            i4 = i2;
        }
        if (i3 != 1) {
            List<C73D> listSubList = list.subList(i, i3 + i);
            ArrayList arrayListA0R = AbstractC0878AGe.A0R(listSubList);
            listSubList.clear();
            list.addAll(i4, arrayListA0R);
            return;
        }
        if (i == i2 + 1 || i == i2 - 1) {
            list.set(i, list.set(i2, list.get(i)));
        } else {
            list.add(i4, list.remove(i));
        }
    }

    @Override // X.InterfaceC1370Ahw
    public final void Aab(int i, int i2) {
        C73D c73d = (C73D) super.A00;
        if (!(c73d instanceof AnonymousClass738)) {
            throw C3cG.A0Q("Current node cannot accept children");
        }
        List<C73D> list = ((AnonymousClass738) c73d).A01;
        if (i2 == 1) {
            list.remove(i);
        } else {
            list.subList(i, i2 + i).clear();
        }
    }

    public C73Q(AnonymousClass738 anonymousClass738) {
        super(anonymousClass738);
        this.A00 = anonymousClass738.A00;
    }

    @Override // X.InterfaceC1370Ahw
    public final /* bridge */ /* synthetic */ void ANj(int i, Object obj) {
    }
}
