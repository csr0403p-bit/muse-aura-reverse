package X;

import com.instagram.common.bloks.componentquery.cache.ComponentQueryDiskCacheRecord;
import kotlin.Unit;

/* loaded from: classes6.dex */
public final class Htn implements Runnable {
    public static final String __redex_internal_original_name = "BloksComponentQueryDiskCache$fetchResponseForKey$1$1";
    public final /* synthetic */ Hx1 A00;
    public final /* synthetic */ ComponentQueryDiskCacheRecord A01;
    public final /* synthetic */ G0U<Hly, Unit> A02;

    /* JADX WARN: Incorrect types in method signature: (LX/G0U<-LX/Hly;Lkotlin/Unit;>;Lcom/instagram/common/bloks/componentquery/cache/ComponentQueryDiskCacheRecord;LX/Hx1;)V */
    public Htn(Hx1 hx1, ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord, G0U g0u) {
        this.A02 = g0u;
        this.A01 = componentQueryDiskCacheRecord;
        this.A00 = hx1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        G0U<Hly, Unit> g0u = this.A02;
        ComponentQueryDiskCacheRecord componentQueryDiskCacheRecord = this.A01;
        Hx1 hx1 = this.A00;
        g0u.invoke(new Hly(new HtM(AGH.A0A(hx1.A02), AGH.A0A(hx1.A01)), componentQueryDiskCacheRecord));
    }
}
