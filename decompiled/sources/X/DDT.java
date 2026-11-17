package X;

/* loaded from: classes5.dex */
public final class DDT implements Runnable {
    public static final String __redex_internal_original_name = "CacheManager$initCache$4";
    public final /* synthetic */ DDR A00;

    public DDT(DDR ddr) {
        this.A00 = ddr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3157C0f c3157C0f;
        DDR ddr = this.A00;
        if (ddr.A0B.cache.cacheManagerWaitForCacheInitialization && (c3157C0f = ddr.A06) != null) {
            C0a c0a = c3157C0f.A00;
            if (!(c0a instanceof C0M ? ((C0M) c0a).A0I : ((C0N) c0a).A0N)) {
                try {
                    C3157C0f c3157C0f2 = ddr.A06;
                    if (c3157C0f2 != null) {
                        c3157C0f2.A00.A0G();
                    }
                } catch (InterruptedException e) {
                    BzX.A00("CacheManager_default", "Cache initialization wait was interrupted", e);
                }
            }
        }
        ddr.A03();
    }
}
