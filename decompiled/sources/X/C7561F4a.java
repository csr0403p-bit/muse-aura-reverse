package X;

/* renamed from: X.F4a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7561F4a implements CEF {
    public final int $t;
    public final Object A00;
    public final String A01;

    public C7561F4a(CF9 cf9, String str, int i) {
        this.$t = i;
        this.A00 = cf9;
        this.A01 = str;
    }

    @Override // X.CEF
    public final void onComplete(CSA<Void> csa) {
        CF9 cf9;
        Object[] objArr;
        String str;
        int i = this.$t;
        C7384Etj.A0Y(csa, 0);
        boolean zA0C = csa.A0C();
        if (i != 0) {
            String strA00 = zA0C ? "successful" : CF9.A00(csa);
            cf9 = (CF9) this.A00;
            objArr = new Object[]{this.A01, strA00};
            str = "deferredUninstall: %s result: %s";
        } else {
            String strA002 = zA0C ? "successful" : CF9.A00(csa);
            cf9 = (CF9) this.A00;
            objArr = new Object[]{this.A01, strA002};
            str = "deferredInstall: %s result: %s";
        }
        cf9.A02(str, objArr);
    }
}
