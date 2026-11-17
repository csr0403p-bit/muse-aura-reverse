package X;

import com.google.android.gms.wearable.internal.zzbj;
import com.google.android.gms.wearable.zzag;

/* loaded from: classes5.dex */
public final class Caq implements Runnable {
    public static final String __redex_internal_original_name = "zzae";
    public final /* synthetic */ zzbj A00;
    public final /* synthetic */ zzag A01;

    public Caq(zzbj zzbjVar, zzag zzagVar) {
        this.A01 = zzagVar;
        this.A00 = zzbjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbj zzbjVar = this.A00;
        Cao cao = this.A01.A01;
        zzbjVar.A00(cao);
        zzbjVar.A00(cao.zzh);
    }
}
