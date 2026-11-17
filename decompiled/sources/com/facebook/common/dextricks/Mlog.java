package com.facebook.common.dextricks;

import X.BV4;
import X.C5M;
import X.FGI;
import android.util.Log;

/* loaded from: classes5.dex */
public final class Mlog {
    public static final String TAG = "DexLibLoader";
    public static final boolean VERBOSE = true;

    public static void assertThat(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        String strA00 = C5M.A00(str, objArr);
        Log.e(TAG, strA00);
        throw BV4.A0N(FGI.A0U(TAG, ": ", strA00));
    }

    public static void d(String str, Object... objArr) {
        Log.d(TAG, C5M.A00(str, objArr));
    }

    public static void e(String str, Object... objArr) {
        Log.e(TAG, C5M.A00(str, objArr));
    }

    public static void i(String str, Object... objArr) {
        Log.i(TAG, C5M.A00(str, objArr));
    }

    public static void v(String str, Object... objArr) {
        Log.v(TAG, C5M.A00(str, objArr));
    }

    public static void w(String str, Object... objArr) {
        C5M.A01(TAG, str, objArr);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        Log.d(TAG, C5M.A00(str, objArr, th));
    }

    public static void e(Throwable th, String str, Object... objArr) {
        Log.e(TAG, C5M.A00(str, objArr), th);
    }

    public static void i(Throwable th, String str, Object... objArr) {
        Log.i(TAG, C5M.A00(str, objArr, th));
    }

    public static void v(Throwable th, String str, Object... objArr) {
        Log.v(TAG, C5M.A00(str, objArr, th));
    }

    public static void w(Throwable th, String str, Object... objArr) {
        C5M.A01(TAG, str, objArr, th);
    }
}
