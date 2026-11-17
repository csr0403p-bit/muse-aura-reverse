package X;

import android.content.Context;
import android.os.Handler;

/* loaded from: classes6.dex */
public final class FNe {
    public static final FNe A05 = new FNe();
    public final DQd<String, FNO<?>> A00 = new DQd<>(0);
    public final DQd<String, Long> A02 = new DQd<>(0);
    public final DQd A01 = new DQd(0);
    public final FOR A03 = FOR.A00;
    public volatile Handler A04 = new Handler(AbstractC7725FCb.A00);

    public static FNO A01(FNe fNe, String str) {
        fNe.A02.remove(str);
        C7971FNk c7971FNk = C7971FNk.A03;
        synchronized (c7971FNk.A01) {
            c7971FNk.A00.remove(str);
        }
        return fNe.A00.remove(str);
    }

    public static final void A02(Context context, FNe fNe, Hi0 hi0, long j) {
        if (j >= 0) {
            String datakey = hi0.getDatakey();
            C7971FNk c7971FNk = C7971FNk.A03;
            synchronized (fNe.A03) {
                if (fNe.A00.containsKey(datakey) || fNe.A02.containsKey(datakey)) {
                    synchronized (c7971FNk.A01) {
                        DQd<String, Integer> dQd = c7971FNk.A00;
                        dQd.put(datakey, Integer.valueOf(BV6.A07(dQd.getOrDefault(datakey, BV4.A0V())) + 1));
                    }
                    if (Boolean.TRUE.equals(hi0.getCustomInfo("enable_scheduled_cleanup_removal"))) {
                        hi0 = hi0.fromBundle(context.getApplicationContext(), hi0.toBundle());
                    }
                    FNf fNf = new FNf(fNe, hi0, datakey);
                    Handler handler = fNe.A04;
                    if (handler == null) {
                        synchronized (fNe) {
                            handler = fNe.A04;
                            if (handler == null) {
                                handler = new Handler(AbstractC7725FCb.A00);
                                fNe.A04 = handler;
                            }
                        }
                    }
                    handler.postDelayed(fNf, j);
                }
            }
        }
    }

    public final FNO<?> A03(Hi0 hi0) {
        FNO<?> fnoA01;
        synchronized (this.A03) {
            fnoA01 = A01(this, hi0.getDatakey());
        }
        return fnoA01;
    }

    public static final FNO A00(FNe fNe, Hi0 hi0) {
        AbstractC7972FNn abstractC7972FNn;
        boolean z;
        String datakey = hi0.getDatakey();
        synchronized (fNe.A03) {
            FNO<?> fno = fNe.A00.get(datakey);
            if (fno == null || (abstractC7972FNn = fno.A01) == null) {
                return null;
            }
            if (abstractC7972FNn.A00.A01.getDatakey().equals(hi0.getDatakey())) {
                z = false;
            } else {
                fNe.A03(hi0);
                z = true;
            }
            if (!z) {
                return fno;
            }
            abstractC7972FNn.A02();
            return null;
        }
    }
}
