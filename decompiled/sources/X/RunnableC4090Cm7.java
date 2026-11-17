package X;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.wearable.zzag;

/* renamed from: X.Cm7, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC4090Cm7 implements Runnable {
    public static final String __redex_internal_original_name = "zzw";
    public final /* synthetic */ DataHolder A00;
    public final /* synthetic */ zzag A01;

    public RunnableC4090Cm7(DataHolder dataHolder, zzag zzagVar) {
        this.A01 = zzagVar;
        this.A00 = dataHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DataHolder dataHolder = this.A00;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}
