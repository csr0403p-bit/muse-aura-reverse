package X;

/* loaded from: classes6.dex */
public final class FNf implements Runnable {
    public static final String __redex_internal_original_name = "DataCache$1";
    public final /* synthetic */ FNe A00;
    public final /* synthetic */ Hi0 A01;
    public final /* synthetic */ String A02;

    public FNf(FNe fNe, Hi0 hi0, String str) {
        this.A02 = str;
        this.A01 = hi0;
        this.A00 = fNe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int iA07;
        FNO fnoA01;
        FNe fNe = this.A00;
        FNe fNe2 = FNe.A05;
        synchronized (fNe.A03) {
            C7971FNk c7971FNk = C7971FNk.A03;
            String str = this.A02;
            synchronized (c7971FNk.A01) {
                DQd<String, Integer> dQd = c7971FNk.A00;
                iA07 = BV6.A07(dQd.getOrDefault(str, BV4.A0V())) - 1;
                if (iA07 == 0) {
                    dQd.remove(str);
                } else if (iA07 >= 1) {
                    dQd.put(str, Integer.valueOf(iA07));
                }
            }
            fnoA01 = iA07 == 0 ? FNe.A01(fNe, str) : null;
        }
        if (fnoA01 != null) {
            fnoA01.A01.A02();
        }
    }
}
