package X;

/* loaded from: classes5.dex */
public final class F5S implements InterfaceC5174DbF {
    public final int $t;
    public final Object A00;

    /* JADX WARN: Multi-variable type inference failed */
    public F5S(Hm1 hm1, Hm1<? super T> hm12) {
        this.$t = hm12;
        this.A00 = hm1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC5174DbF
    public final void onResult(T t) {
        if (this.$t == 0) {
            HtJ htJ = (HtJ) this.A00;
            if (!(GBL.A04.get(htJ) instanceof G6I)) {
                return;
            }
            htJ.resumeWith(t);
            return;
        }
        Throwable th = (Throwable) t;
        HtJ htJ2 = (HtJ) this.A00;
        if (!(GBL.A04.get(htJ2) instanceof G6I)) {
            return;
        }
        if (th == null) {
            C7384Etj.A0a("LOAD_PARAM");
            throw F60.createAndThrow();
        }
        BV7.A1K(th, htJ2);
    }
}
