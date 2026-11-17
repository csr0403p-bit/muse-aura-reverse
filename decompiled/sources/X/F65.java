package X;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes6.dex */
public final class F65 implements Runnable {
    public static final String __redex_internal_original_name = "BKBloksActionDispatchAsyncImpl$evaluate$1";
    public final /* synthetic */ F6D A00;
    public final /* synthetic */ HsM A01;

    public F65(HsM hsM, F6D f6d) {
        this.A00 = f6d;
        this.A01 = hsM;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference<FBB> weakReference;
        FBB fbb;
        F6D f6d = this.A00;
        if (!AbstractC8162FXe.A03() || (weakReference = f6d.A08) == null || (fbb = weakReference.get()) == null) {
            return;
        }
        HsM hsM = this.A01;
        Hj6 hj6 = Hj6.A02;
        C7648F8p c7648F8p = ((F6L) f6d).A02;
        F8K f8k = f6d.A04;
        Map<String, F8J> map = f6d.A09;
        Htq<F6D> htq = f6d.A05;
        String str = f6d.A07;
        F9H f9h = ((F6L) f6d).A00;
        String str2 = f6d.A01;
        if (str2 == null) {
            throw AbstractC7608F5v.A0e();
        }
        AbstractC7691FAk.A00(new F6D(f9h, fbb, f6d.A02, f6d.A03, f8k, htq, c7648F8p, f6d.A06, str, str2, map, f6d.A0A), hj6, hsM);
    }
}
