package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppFlag;

/* renamed from: X.7og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C07197og {
    public static C07197og A05;
    public final ComponentName A00;
    public final SharedPreferences A01;
    public final PackageManager A02;
    public final C3620CZj A03;
    public final Context A04;

    public static synchronized C07197og A00(Context context) {
        C07197og c07197og;
        c07197og = A05;
        if (c07197og == null) {
            Context applicationContext = context.getApplicationContext();
            c07197og = new C07197og(applicationContext, new C3620CZj(applicationContext, applicationContext.getPackageManager()));
            A05 = c07197og;
        }
        return c07197og;
    }

    public C07197og(Context context, C3620CZj c3620CZj) {
        this.A04 = context;
        this.A03 = c3620CZj;
        this.A01 = context.getSharedPreferences("oxygen_preloads_sdk", 0);
        this.A02 = context.getPackageManager();
        this.A00 = new ComponentName(context, (Class<?>) IsManagedAppFlag.class);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A01() {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C07197og.A01():boolean");
    }
}
