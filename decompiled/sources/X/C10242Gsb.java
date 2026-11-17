package X;

import java.util.Iterator;

/* renamed from: X.Gsb, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10242Gsb extends C10241Gsa<Gt3> {
    @Override // X.C10241Gsa, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        return super.set((Gt4) obj, i);
    }

    @Override // X.C10241Gsa
    /* renamed from: A00 */
    public final /* bridge */ /* synthetic */ Gt4 remove(int i) {
        return super.remove(i);
    }

    @Override // X.C10241Gsa
    /* renamed from: A01 */
    public final /* bridge */ /* synthetic */ Gt4 set(Gt4 gt4, int i) {
        return super.set(gt4, i);
    }

    @Override // X.C10241Gsa
    public final /* bridge */ /* synthetic */ void A02() {
        super.A02();
    }

    @Override // X.C10241Gsa, java.util.ArrayList
    public final /* bridge */ /* synthetic */ Object clone() {
        C10242Gsb c10242Gsb = new C10242Gsb(size());
        Iterator<T> it = iterator();
        while (it.hasNext()) {
            c10242Gsb.add(((Gt3) it.next()).clone());
        }
        return c10242Gsb;
    }

    @Override // X.C10241Gsa, java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        return super.remove(i);
    }
}
