package X;

/* loaded from: classes5.dex */
public final class F4X implements CEF {
    public final int $t;
    public final int A00;
    public final Object A01;

    public F4X(CF9 cf9, int i, int i2) {
        this.$t = i2;
        this.A01 = cf9;
        this.A00 = i;
    }

    @Override // X.CEF
    public final void onComplete(CSA<Void> csa) {
        Object[] objArr;
        String str;
        Object objA00;
        int i = this.$t;
        C7384Etj.A0Y(csa, 0);
        CF9 cf9 = (CF9) this.A01;
        Integer numValueOf = Integer.valueOf(this.A00);
        boolean zA0C = csa.A0C();
        if (i != 0) {
            if (zA0C) {
                objA00 = csa.A08();
                if (objA00 == null) {
                    throw BV4.A0U();
                }
            } else {
                objA00 = CF9.A00(csa);
            }
            objArr = new Object[]{numValueOf, objA00};
            str = "startInstall onCompleted id: %d result: %s";
        } else {
            objArr = new Object[]{numValueOf, zA0C ? "completed" : CF9.A00(csa)};
            str = "cancelInstall: %d completed: %s";
        }
        cf9.A02(str, objArr);
    }
}
