package X;

/* loaded from: classes5.dex */
public final class CJE implements CFD {
    public final CFD A00;
    public final CFB A01;

    @Override // X.CFD
    public final /* bridge */ /* synthetic */ Object AjF() {
        Object objAjF = this.A00.AjF();
        if (objAjF != null) {
            return objAjF;
        }
        throw BV4.A0a("Cannot return null from a non-@Nullable @Provides method");
    }

    public CJE(CFD cfd, CFB cfb) {
        this.A01 = cfb;
        this.A00 = cfd;
    }
}
