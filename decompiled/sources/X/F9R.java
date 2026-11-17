package X;

import com.instagram.common.bloks.BloksParseResult;

/* loaded from: classes6.dex */
public final class F9R implements Runnable {
    public static final String __redex_internal_original_name = "BloksComponentQueryManager$setup$storeResult$1$1";
    public final /* synthetic */ F9Q A00;
    public final /* synthetic */ F6D A01;
    public final /* synthetic */ HoL A02;
    public final /* synthetic */ F9S A03;

    public F9R(F9Q f9q, F6D f6d, HoL hoL, F9S f9s) {
        this.A00 = f9q;
        this.A03 = f9s;
        this.A02 = hoL;
        this.A01 = f6d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        F9Q f9q = this.A00;
        Object obj = f9q.A03;
        F9S f9s = this.A03;
        HoL hoL = this.A02;
        F6D f6d = this.A01;
        synchronized (obj) {
            for (F9V f9v : F9Q.A01(f9q, f6d, hoL, f9s, hoL.A00() ? C79.A01 : C79.A0K)) {
                F9b f9b = f9q.A01;
                f9b.A07(f9v.A00);
                F9U f9u = f9v.A01;
                if (f9u != null) {
                    AbstractC8162FXe.A02("Tree operations are only supported from the UI Thread");
                    BloksParseResult bloksParseResult = f9u.A00;
                    if (!f9b.A0R) {
                        AbstractC8162FXe.A02("Tree operations are only supported from the UI Thread");
                        f9b.A0L.add(bloksParseResult);
                        F9b.A02(f9b);
                    }
                    f9b.A08(f9u.A01, f9u.A02);
                }
            }
        }
    }
}
