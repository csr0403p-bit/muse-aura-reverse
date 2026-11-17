package X;

/* loaded from: classes5.dex */
public final class CDN implements Runnable {
    public static final String __redex_internal_original_name = "AppModuleCacheManager$ModuleListenerSender$moduleOnLoaded$1";
    public final /* synthetic */ CDP A00;
    public final /* synthetic */ String A01;

    public CDN(CDP cdp, String str) {
        this.A00 = cdp;
        this.A01 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A00.A00.ATy(this.A01);
    }
}
