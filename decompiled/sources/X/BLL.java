package X;

/* loaded from: classes4.dex */
public final class BLL implements C3UX, AutoCloseable {
    public final C78T A00;

    public BLL(C78T c78t) {
        C7384Etj.A0Y(c78t, 0);
        this.A00 = c78t;
    }

    @Override // X.C3UX
    public final C78T AEA() {
        return this.A00;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        HzS.A03(null, this.A00);
    }
}
