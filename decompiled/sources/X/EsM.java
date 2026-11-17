package X;

/* loaded from: classes5.dex */
public final class EsM implements HpO {
    public final EsK<T>.AwaitAllNode[] A00;
    public final /* synthetic */ EsK<T> A01;

    public EsM(EsK esK, EsK<T>.AwaitAllNode[] awaitAllNodeArr) {
        this.A01 = esK;
        this.A00 = awaitAllNodeArr;
    }

    public final void A00() {
        for (C7368EsL c7368EsL : this.A00) {
            HsS hsS = c7368EsL.A00;
            if (hsS == null) {
                C7384Etj.A0b("handle");
                throw F60.createAndThrow();
            }
            hsS.dispose();
        }
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("DisposeHandlersOnCancel[");
        sbA0x.append(this.A00);
        return BV5.A0o(sbA0x);
    }

    @Override // X.HpO
    public final void invoke(Throwable th) {
        A00();
    }
}
