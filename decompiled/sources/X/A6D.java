package X;

import java.util.Iterator;

/* JADX INFO: Add missing generic type declarations: [R] */
/* loaded from: classes4.dex */
public final /* synthetic */ class A6D<R> extends C7438Evz implements G0U<C3b6<? extends R>, Iterator<? extends R>> {
    public static final A6D A00 = new A6D();

    public A6D() {
        super(1, C3b6.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C3b6 c3b6 = (C3b6) obj;
        C7384Etj.A0Y(c3b6, 0);
        return c3b6.iterator();
    }
}
