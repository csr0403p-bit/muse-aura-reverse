package X;

/* loaded from: classes6.dex */
public final class FLD implements Runnable {
    public static final String __redex_internal_original_name = "BKBloksExtensionsOnDataChangeBinderUtil$DataChangeController$1";
    public final /* synthetic */ FL6 A00;

    public FLD(FL6 fl6) {
        this.A00 = fl6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FL6 fl6 = this.A00;
        FDW fdw = fl6.A03;
        HsM hsMA0D = fdw.A0D(40);
        if (fl6.A01 && hsMA0D != null) {
            F9J.A03(fl6.A02, fdw, C9115Fyg.A00(), hsMA0D, 0);
        }
        fl6.A01 = false;
    }
}
