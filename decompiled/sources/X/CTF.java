package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final class CTF implements Runnable {
    public static final String __redex_internal_original_name = "zzf";
    public final /* synthetic */ CTD A00;
    public final /* synthetic */ CTH A01;

    @Override // java.lang.Runnable
    public final void run() {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "bg processing of the intent starting now");
        }
        CTB ctb = this.A01.A00;
        CTD ctd = this.A00;
        ctb.A04(ctd.A01);
        ctd.A00();
    }

    public CTF(CTD ctd, CTH cth) {
        this.A01 = cth;
        this.A00 = ctd;
    }
}
