package X;

import com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class HxJ<V> implements Callable {
    public final /* synthetic */ EEO A00;
    public final /* synthetic */ C7403Euh A01;
    public final /* synthetic */ Hx1 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Executor A04;
    public final /* synthetic */ G0U<Hly, Unit> A05;

    /* JADX WARN: Incorrect types in method signature: (LX/EEO;LX/Euh;Ljava/lang/String;LX/Hx1;Ljava/util/concurrent/Executor;LX/G0U<-LX/Hly;Lkotlin/Unit;>;)V */
    public HxJ(EEO eeo, C7403Euh c7403Euh, Hx1 hx1, String str, Executor executor, G0U g0u) {
        this.A00 = eeo;
        this.A01 = c7403Euh;
        this.A03 = str;
        this.A02 = hx1;
        this.A04 = executor;
        this.A05 = g0u;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        ComponentQueryDiskCacheRecord componentQueryDiskCacheRecordA00;
        try {
            componentQueryDiskCacheRecordA00 = EEO.A00(this.A00, this.A01, this.A02, this.A03);
        } catch (Exception e) {
            componentQueryDiskCacheRecordA00 = null;
            FFI.A01(null, "Failed to read from disk cache", e);
        }
        this.A04.execute(new Htn(this.A02, componentQueryDiskCacheRecordA00, this.A05));
        return Unit.INSTANCE;
    }
}
