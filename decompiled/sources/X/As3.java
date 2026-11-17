package X;

/* loaded from: classes4.dex */
public final class As3 {
    public final Object A00;
    public final C1BO<Object> A01;
    public final As3 A02;

    public final boolean A00() {
        if (this.A01.getValue() != this.A00) {
            return true;
        }
        As3 as3 = this.A02;
        return as3 != null && as3.A00();
    }

    public As3(C1BO<? extends Object> c1bo, As3 as3) {
        this.A01 = c1bo;
        this.A02 = as3;
        this.A00 = c1bo.getValue();
    }
}
