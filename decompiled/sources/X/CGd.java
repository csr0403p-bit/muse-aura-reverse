package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final class CGd implements CFL {
    public static final CGd A01 = new CGd();
    public int A00 = 5;

    @Override // X.CFL
    public final void Aj7(String str, String str2) {
        A01(str, 6, str2);
    }

    @Override // X.CFL
    public final void Aj8(String str, String str2, Throwable th) {
        A00(6, str, str2, th);
    }

    @Override // X.CFL
    public final void e(String str, String str2) {
        A01(str, 6, str2);
    }

    @Override // X.CFL
    public final void i(String str, String str2) {
        A01(str, 4, str2);
    }

    @Override // X.CFL
    public final void w(String str, String str2) {
        A01(str, 5, str2);
    }

    @Override // X.CFL
    public final int AHn() {
        return this.A00;
    }

    @Override // X.CFL
    public final boolean AOg(int i) {
        return BV7.A1S(this.A00, i);
    }

    private void A00(int i, String str, String str2, Throwable th) {
        Log.println(i, FGI.A0U("unknown", ":", str), FGI.A0O(str2, th == null ? "" : Log.getStackTraceString(th), '\n'));
    }

    public static void A01(String str, int i, String str2) {
        Log.println(i, FGI.A0U("unknown", ":", str), str2);
    }

    @Override // X.CFL
    public final void Adl(int i) {
        this.A00 = i;
    }

    @Override // X.CFL
    public final void log(int i, String str, String str2) {
        A01(str, i, str2);
    }

    @Override // X.CFL
    public final void e(String str, String str2, Throwable th) {
        A00(6, str, str2, th);
    }

    @Override // X.CFL
    public final void i(String str, String str2, Throwable th) {
        A00(4, str, str2, th);
    }

    @Override // X.CFL
    public final void w(String str, String str2, Throwable th) {
        A00(5, str, str2, th);
    }
}
