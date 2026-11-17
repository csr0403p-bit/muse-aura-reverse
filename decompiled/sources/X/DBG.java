package X;

/* loaded from: classes5.dex */
public final class DBG implements Runnable {
    public static final String __redex_internal_original_name = "PreDrawWatchingSignalDefinition$onActivityResumed$1";
    public final /* synthetic */ DBF A00;

    public DBG(DBF dbf) {
        this.A00 = dbf;
    }

    @Override // java.lang.Runnable
    public final void run() {
        DBF dbf = this.A00;
        if (AnonymousClass001.A1X(dbf.A00.get())) {
            return;
        }
        dbf.A01.set(null);
        dbf.A02.invoke("OnPreDraw");
    }
}
