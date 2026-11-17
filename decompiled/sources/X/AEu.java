package X;

/* loaded from: classes4.dex */
public abstract class AEu {
    public static final C0860A6h A00 = new C0860A6h();

    public static final BLL A00(AEs aEs) {
        BLL bll;
        C78T c78t;
        C7384Etj.A0Y(aEs, 0);
        synchronized (A00) {
            bll = (BLL) aEs.getCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (bll == null) {
                try {
                    GBK gbk = AbstractC9266GBt.A00;
                    c78t = ((B8t) AbstractC7429Evm.A00).A01;
                } catch (C7500EyF | IllegalStateException unused) {
                    c78t = C6ys.A00;
                }
                bll = new BLL(c78t.plus(new C8eO(null)));
                aEs.addCloseable("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", bll);
            }
        }
        return bll;
    }
}
