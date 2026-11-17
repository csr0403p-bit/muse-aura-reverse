package X;

/* JADX INFO: Add missing generic type declarations: [T] */
/* loaded from: classes5.dex */
public final class EL7<T> implements InterfaceC6659EMs<T> {
    public final /* synthetic */ EL2<T> A00;
    public final /* synthetic */ HyO<ENN> A01;

    /* JADX WARN: Multi-variable type inference failed */
    public EL7(EL2<T> el2, HyO<? super ENN> hyO) {
        this.A00 = el2;
        this.A01 = hyO;
    }

    @Override // X.InterfaceC6659EMs
    public final void ASP(T t) {
        ENN c6645ELp;
        EL2<T> el2 = this.A00;
        if (!AnonymousClass001.A1X(t)) {
            c6645ELp = new C6645ELp(el2 instanceof C6638ELi ? 9 : el2 instanceof C6637ELh ? 5 : 6);
        } else {
            c6645ELp = EN9.A00;
        }
        this.A01.AhZ(c6645ELp);
    }
}
