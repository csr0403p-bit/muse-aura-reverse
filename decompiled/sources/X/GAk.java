package X;

/* loaded from: classes6.dex */
public class GAk<T> extends GAq<T> implements GAu {
    public final HtJ<T> A00;

    /* JADX WARN: Incorrect types in method signature: (LX/78T;LX/HtJ<-TT;>;)V */
    public GAk(HtJ htJ, C78T c78t) {
        super(c78t, true);
        this.A00 = htJ;
    }

    @Override // X.GBM
    public final void A0J(Object obj) {
        if (this instanceof GAs) {
            ((GAs) this).A0V(obj);
            return;
        }
        HtJ htJA02 = C7Bm.A02(this.A00);
        if (obj instanceof C10474Hkl) {
            Throwable th = ((C10474Hkl) obj).A00;
            C7384Etj.A0Y(th, 0);
            obj = C3cG.A0s(th);
        }
        GBI.A00(obj, htJA02);
    }

    @Override // X.GBM
    public final boolean A0P() {
        return true;
    }

    @Override // X.GAq
    public void A0V(Object obj) {
        HtJ<T> htJ = this.A00;
        if (obj instanceof C10474Hkl) {
            Throwable th = ((C10474Hkl) obj).A00;
            C7384Etj.A0Y(th, 0);
            obj = C3cG.A0s(th);
        }
        htJ.resumeWith(obj);
    }

    public void A0X() {
    }

    @Override // X.GAu
    public final GAu getCallerFrame() {
        HtJ<T> htJ = this.A00;
        if (htJ instanceof GAu) {
            return (GAu) htJ;
        }
        return null;
    }
}
