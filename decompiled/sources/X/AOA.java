package X;

/* loaded from: classes4.dex */
public final class AOA<S> implements AOB<S> {
    public final S A00;
    public final S A01;

    @Override // X.AOB
    public final S AGR() {
        return this.A00;
    }

    @Override // X.AOB
    public final S ALW() {
        return this.A01;
    }

    @Override // X.AOB
    public final /* synthetic */ boolean APD(Object obj, Object obj2) {
        return C7384Etj.areEqual(obj, this.A00) && C7384Etj.areEqual(obj2, this.A01);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AOB) {
            AOB aob = (AOB) obj;
            if (C7384Etj.areEqual(this.A00, aob.AGR()) && C7384Etj.areEqual(this.A01, aob.ALW())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (C60R.A01(this.A00) * 31) + C8j4.A0E(this.A01, 0);
    }

    public AOA(S s, S s2) {
        this.A00 = s;
        this.A01 = s2;
    }
}
