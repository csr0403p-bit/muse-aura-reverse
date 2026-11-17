package X;

import java.lang.ref.SoftReference;

/* renamed from: X.9uL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9uL<T> implements C9uD<T> {
    public final G0U<C9uG<?>, C9hr<T>> A00;
    public final C9uQ<C9uP<T>> A01 = new C9uQ<>();

    @Override // X.C9uD
    public final C9hr<T> AC2(C9uG<Object> c9uG) {
        C7384Etj.A0Y(c9uG, 0);
        C9uP<T> c9uP = this.A01.get(C9uT.A01(c9uG));
        C7384Etj.A0U(c9uP);
        C9uN c9uN = (C9uN) c9uP;
        T t = c9uN.reference.get();
        if (t == null) {
            BTB btb = new BTB(28, c9uG, this);
            synchronized (c9uN) {
                t = c9uN.reference.get();
                if (t == null) {
                    t = (T) btb.invoke();
                    c9uN.reference = new SoftReference<>(t);
                }
            }
        }
        return t.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C9uL(G0U<? super C9uG<?>, ? extends C9hr<T>> g0u) {
        this.A00 = g0u;
    }
}
