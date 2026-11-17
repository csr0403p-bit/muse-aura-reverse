package X;

import java.util.Iterator;

/* renamed from: X.AJz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0972AJz<E> extends AbstractC0891AGs<E> implements AKC<E> {
    public static final C0972AJz A03;
    public final C0959AJm<E, AKS> A00;
    public final Object A01;
    public final Object A02;

    static {
        AKE ake = AKE.A00;
        A03 = new C0972AJz(C0959AJm.A02, ake, ake);
    }

    @Override // X.AbstractC0890AGr
    public final int A0D() {
        return this.A00.size();
    }

    @Override // X.AbstractC0890AGr, java.util.Collection
    public final boolean contains(Object obj) {
        return this.A00.containsKey(obj);
    }

    @Override // X.AbstractC0890AGr, java.util.Collection, java.lang.Iterable
    public final Iterator<E> iterator() {
        return new C0940AIt(this.A01, this.A00);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0972AJz(Object obj, Object obj2, C0959AJm<E, AKS> c0959AJm) {
        this.A01 = obj2;
        this.A02 = c0959AJm;
        this.A00 = obj;
    }
}
