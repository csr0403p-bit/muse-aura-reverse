package X;

/* renamed from: X.Ck5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4022Ck5 implements InterfaceC4036Ckc {
    public final Ck3 A00;

    @Override // X.InterfaceC4036Ckc
    public final C4023CkC ARE(String str, String str2, String str3, String str4) {
        C4018Cjz c4018CjzA00 = this.A00.A00(str);
        c4018CjzA00.A01 = str2;
        c4018CjzA00.A02 = str3;
        c4018CjzA00.A00 = str4;
        CXt cXt = CXt.A03;
        CYD cyd = c4018CjzA00.A03.A02;
        cyd.A02 = cXt;
        cyd.A01 = CYV.A03;
        return new C4023CkC(c4018CjzA00);
    }

    public C4022Ck5(Ck3 ck3) {
        this.A00 = ck3;
    }
}
