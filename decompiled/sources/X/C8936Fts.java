package X;

/* renamed from: X.Fts, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8936Fts implements FC0 {
    public final int $t;
    public final Object A00;
    public final Object A01;

    /* JADX WARN: Multi-variable type inference failed */
    public C8936Fts(FBt fBt, FBt fBt2, FC0<C7708FBg> fc0) {
        this.$t = fc0;
        this.A01 = fBt;
        this.A00 = fBt2;
    }

    @Override // X.FC0
    public final /* bridge */ /* synthetic */ void AVw(Object obj) {
        C7708FBg c7708FBg;
        int i = this.$t;
        C7705FBd c7705FBd = (C7705FBd) obj;
        C7384Etj.A0Y(c7705FBd, 0);
        FBt fBt = (FBt) this.A01;
        Object obj2 = fBt.A03;
        FC0 fc0 = (FC0) this.A00;
        synchronized (obj2) {
            if (i != 0) {
                C7708FBg c7708FBg2 = fBt.A00;
                if (c7708FBg2 == null) {
                    C7384Etj.A0b("snapshot");
                    throw F60.createAndThrow();
                }
                c7708FBg = new C7708FBg(c7708FBg2.A00, c7705FBd);
            } else {
                C7708FBg c7708FBg3 = fBt.A00;
                if (c7708FBg3 == null) {
                    C7384Etj.A0b("snapshot");
                    throw F60.createAndThrow();
                }
                c7708FBg = new C7708FBg(c7705FBd, c7708FBg3.A01);
            }
            fBt.A00 = c7708FBg;
            fc0.AVw(c7708FBg);
        }
    }
}
