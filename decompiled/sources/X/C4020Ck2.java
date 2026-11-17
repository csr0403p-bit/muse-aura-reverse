package X;

/* renamed from: X.Ck2, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4020Ck2 {
    public final Ck3 A00;

    public final void A00(F2m f2m) {
        Ck3 ck3 = this.A00;
        if (ck3 == null) {
            f2m.onFail(new Throwable("Authenticated Request Factory is Null!"));
            return;
        }
        C4018Cjz c4018CjzA00 = ck3.A00("FXMetaSessionCookieFetcher");
        c4018CjzA00.A00 = "post";
        c4018CjzA00.A01 = "meta";
        c4018CjzA00.A02 = "/get_accounts_center_cookie";
        CYV cyv = CYV.A03;
        C4030CkL c4030CkL = c4018CjzA00.A03;
        c4030CkL.A02.A01 = cyv;
        c4030CkL.A00.A00 = new Ev1(this, f2m);
        c4018CjzA00.A00();
    }

    public C4020Ck2(Ck3 ck3) {
        this.A00 = ck3;
    }
}
