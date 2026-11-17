package X;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.Queue;

/* renamed from: X.CSx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3540CSx {
    public static C3540CSx A04;
    public String A02 = null;
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final Queue<Intent> A03 = BV4.A0s();

    public static synchronized C3540CSx A00() {
        C3540CSx c3540CSx;
        c3540CSx = A04;
        if (c3540CSx == null) {
            c3540CSx = new C3540CSx();
            A04 = c3540CSx;
        }
        return c3540CSx;
    }

    public final boolean A01(Context context) {
        Boolean boolValueOf = this.A00;
        if (boolValueOf == null) {
            boolValueOf = Boolean.valueOf(AnonymousClass002.A1M(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK")));
            this.A00 = boolValueOf;
        }
        if (!boolValueOf.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.A00.booleanValue();
    }
}
