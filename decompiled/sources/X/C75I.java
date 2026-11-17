package X;

import android.util.Log;

/* renamed from: X.75I, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C75I implements C7mY {
    @Override // X.C7mY
    public final void Ab1(String str) {
        Log.e("Security-LocalReporter", str);
    }

    @Override // X.C7mY
    public final void report(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
