package X;

/* loaded from: classes6.dex */
public final class HlD<T> implements HtJ<T>, GAu {
    public final HtJ<T> A00;
    public final C78T A01;

    @Override // X.GAu
    public final GAu getCallerFrame() {
        HtJ<T> htJ = this.A00;
        if (htJ instanceof GAu) {
            return (GAu) htJ;
        }
        return null;
    }

    @Override // X.HtJ
    public final C78T getContext() {
        return this.A01;
    }

    @Override // X.HtJ
    public final void resumeWith(Object obj) {
        this.A00.resumeWith(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HlD(HtJ<? super T> htJ, C78T c78t) {
        this.A00 = htJ;
        this.A01 = c78t;
    }
}
