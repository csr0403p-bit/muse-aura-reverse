package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final class EfH implements EfN {
    public final /* synthetic */ C7069EfP A00;
    public final /* synthetic */ C7108EgM A01;

    public EfH(C7069EfP c7069EfP, C7108EgM c7108EgM) {
        this.A01 = c7108EgM;
        this.A00 = c7069EfP;
    }

    @Override // X.EfN
    public final void Ab4(EfG<Object> efG, Throwable th) {
        Object objA01 = efG.A01();
        AbstractC3422CMk.A06("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", BV7.A0n(this), BV7.A0n(efG), objA01 != null ? C60Q.A0e(objA01) : "<value is null>", th == null ? "" : Log.getStackTraceString(th));
    }
}
