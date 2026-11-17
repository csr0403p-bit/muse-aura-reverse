package X;

/* loaded from: classes5.dex */
public final class DBH implements Runnable {
    public static final String __redex_internal_original_name = "PreDrawWatchingSignalDefinition$uninstall$1$1";
    public final /* synthetic */ ViewOnAttachStateChangeListenerC8438Fe2 A00;
    public final /* synthetic */ DBF A01;

    public DBH(ViewOnAttachStateChangeListenerC8438Fe2 viewOnAttachStateChangeListenerC8438Fe2, DBF dbf) {
        this.A01 = dbf;
        this.A00 = viewOnAttachStateChangeListenerC8438Fe2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.A00.A01();
        } catch (IllegalStateException unused) {
        }
    }
}
