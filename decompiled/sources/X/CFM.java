package X;

import android.util.Log;

/* loaded from: classes5.dex */
public final class CFM implements CFL {
    public static final CFM A01 = new CFM();
    public int A00;

    @Override // X.CFL
    public final int AHn() {
        return this.A00;
    }

    @Override // X.CFL
    public final boolean AOg(int i) {
        return this.A00 <= i;
    }

    public CFM(int i) {
    }

    @Override // X.CFL
    public final void Adl(int i) {
        this.A00 = i;
    }

    @Override // X.CFL
    public final void Aj7(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // X.CFL
    public final void e(String str, String str2) {
        Log.e(str, str2);
    }

    @Override // X.CFL
    public final void i(String str, String str2) {
        Log.i(str, str2);
    }

    @Override // X.CFL
    public final void w(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // X.CFL
    public final void Aj8(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    @Override // X.CFL
    public final void log(int i, String str, String str2) {
        Log.println(i, str, str2);
    }

    public CFM() {
    }

    @Override // X.CFL
    public final void e(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }

    @Override // X.CFL
    public final void i(String str, String str2, Throwable th) {
        Log.i(str, str2, th);
    }

    @Override // X.CFL
    public final void w(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }
}
