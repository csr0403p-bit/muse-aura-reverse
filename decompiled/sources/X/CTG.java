package X;

import android.content.Intent;

/* loaded from: classes5.dex */
public final class CTG implements Runnable {
    public static final String __redex_internal_original_name = "zzb";
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Intent A01;
    public final /* synthetic */ CTB A02;

    public CTG(Intent intent, Intent intent2, CTB ctb) {
        this.A02 = ctb;
        this.A00 = intent;
        this.A01 = intent2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CTB ctb = this.A02;
        ctb.A04(this.A00);
        CTB.A00(this.A01, ctb);
    }
}
