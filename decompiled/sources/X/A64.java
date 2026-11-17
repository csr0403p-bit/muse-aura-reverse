package X;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class A64<E> extends A67<E, List<? extends E>, ArrayList<E>> {
    public final C9iZ A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A64(C9hr<E> c9hr) {
        super(c9hr);
        C7384Etj.A0Y(c9hr, 0);
        C9iZ descriptor = c9hr.getDescriptor();
        C7384Etj.A0Y(descriptor, 0);
        this.A00 = new A68(descriptor);
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ Object A04(Object obj) {
        C7384Etj.A0Y(obj, 0);
        return obj;
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ int A01(Object obj) {
        AbstractCollection abstractCollection = (AbstractCollection) obj;
        C7384Etj.A0Y(abstractCollection, 0);
        return abstractCollection.size();
    }

    @Override // X.C9tY
    public final /* bridge */ /* synthetic */ Object A03() {
        return new ArrayList();
    }

    @Override // X.C9tX
    public final /* bridge */ /* synthetic */ void A08(Object obj, int i, Object obj2) {
        AbstractList abstractList = (AbstractList) obj;
        C7384Etj.A0Y(abstractList, 0);
        abstractList.add(i, obj2);
    }

    @Override // X.C9tX, X.C9hr, X.C9hv, X.C9jG
    public final C9iZ getDescriptor() {
        return this.A00;
    }
}
