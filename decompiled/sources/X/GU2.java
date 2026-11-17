package X;

/* loaded from: classes6.dex */
public final class GU2 implements CQG<AbstractC9636GWg> {
    public final /* synthetic */ Hm1<GR9> A00;

    @Override // X.CQG
    public final void onFailure(Throwable th) {
        C7384Etj.A0Y(th, 0);
        AbstractC7608F5v.A1L("Failed to start session via SDK");
        this.A00.resumeWith(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GU2(Hm1<? super GR9> hm1) {
        this.A00 = hm1;
    }

    @Override // X.CQG
    public final /* bridge */ /* synthetic */ void onSuccess(AbstractC9636GWg abstractC9636GWg) {
        AbstractC9636GWg abstractC9636GWg2 = abstractC9636GWg;
        if (abstractC9636GWg2 instanceof GV8) {
            this.A00.resumeWith(((GV8) abstractC9636GWg2).A00);
            return;
        }
        if (abstractC9636GWg2 instanceof GVT) {
            onFailure(C3cG.A0Q("Required permissions missing"));
        } else if (abstractC9636GWg2 instanceof GVR) {
            onFailure(C3cG.A0Q("User not registered"));
        } else {
            if (abstractC9636GWg2 != null) {
                throw C3cG.A0q();
            }
            onFailure(C3cG.A0Q("RsysSdkHolder.rsysSdk.initCall returned a null InitCallResult!"));
        }
    }
}
