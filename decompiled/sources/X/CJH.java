package X;

/* loaded from: classes5.dex */
public final class CJH implements CFD {
    public final CFD A00;
    public final CFD A01;
    public final CFD A02;
    public final CFD A03;

    @Override // X.CFD
    public final /* bridge */ /* synthetic */ Object AjF() {
        Object objAjF = this.A00.AjF();
        CJ6 cj6 = (CJ6) this.A01.AjF();
        return new CJL((C3392CJg) objAjF, (CJO) this.A03.AjF(), (CJK) this.A02.AjF(), cj6);
    }

    public CJH(CFD cfd, CFD cfd2, CFD cfd3, CFD cfd4) {
        this.A00 = cfd;
        this.A01 = cfd2;
        this.A02 = cfd3;
        this.A03 = cfd4;
    }
}
