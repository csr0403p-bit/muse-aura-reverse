package X;

/* loaded from: classes6.dex */
public final class F6E extends AbstractC8390Fd5 {
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ HsM A01;
    public final /* synthetic */ String A02;

    @Override // X.AbstractC8390Fd5
    public final void onAuthenticationError(int i, CharSequence charSequence) {
        HsM hsM;
        String string;
        C7384Etj.A0Y(charSequence, 1);
        if (i != 10) {
            hsM = this.A01;
            string = i != 13 ? charSequence.toString() : "ACTION_FALLBACK";
        } else {
            hsM = this.A01;
            string = "ACTION_CANCELED";
        }
        AbstractC7691FAk.A02(this.A00, C9115Fyg.A01(null), hsM, string, 1);
    }

    @Override // X.AbstractC8390Fd5
    public final void onAuthenticationSucceeded(C8391Fd6 c8391Fd6) {
        C7384Etj.A0Y(c8391Fd6, 0);
        String str = this.A02;
        if (str == null) {
            str = "authenticated";
        }
        AbstractC7691FAk.A02(this.A00, C9115Fyg.A01(str), this.A01, null, 1);
    }

    public F6E(F6D f6d, HsM hsM, String str) {
        this.A02 = str;
        this.A01 = hsM;
        this.A00 = f6d;
    }
}
