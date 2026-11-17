package X;

/* loaded from: classes6.dex */
public final class FB7 implements FB8 {
    public FDW A00;
    public final FAW A01;

    @Override // X.FB8
    public final boolean AiJ(FDW fdw) {
        if (!this.A01.Agn(fdw)) {
            return false;
        }
        this.A00 = fdw;
        return true;
    }

    public FB7(FAW faw) {
        this.A01 = faw;
    }
}
