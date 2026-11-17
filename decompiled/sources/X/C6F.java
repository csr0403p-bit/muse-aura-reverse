package X;

import android.content.Context;
import android.content.pm.ModuleInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class C6F implements InterfaceC3231C4o {
    public final Context A00;
    public final /* synthetic */ C3241C4y A01;
    public final /* synthetic */ F4R A02;

    public C6F(Context context, C3241C4y c3241C4y, F4R f4r) {
        this.A01 = c3241C4y;
        this.A02 = f4r;
        this.A00 = context;
    }

    public static void A02(C3228C4l c3228C4l) {
        C3228C4l.A01(C6B.A24, c3228C4l, Build.VERSION.SDK_INT < 36 ? r1 * 100000 : Build.VERSION.SDK_INT_FULL);
    }

    public static void A03(C3228C4l c3228C4l) {
        c3228C4l.A03(C6B.AAG, Build.VERSION.SECURITY_PATCH);
    }

    @Override // X.InterfaceC3231C4o
    public final Integer AHt() {
        return C79.A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
    @Override // X.InterfaceC3231C4o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void AY4(X.C3228C4l r6, X.EnumC3223C4g r7) throws org.json.JSONException {
        /*
            r5 = this;
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.A6L
            X.C4y r0 = r5.A01
            X.F18<java.lang.String> r0 = r0.A0P
            java.lang.Object r0 = r0.AMN()
            java.lang.String r0 = (java.lang.String) r0
            r6.A03(r1, r0)
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.A6N
            java.lang.String r0 = android.os.Build.MODEL
            r6.A03(r1, r0)
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.A6O
            java.lang.String r0 = android.os.Build.DEVICE
            r6.A03(r1, r0)
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.A6J
            java.lang.String r0 = android.os.Build.BRAND
            r6.A03(r1, r0)
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.A6Q
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r6.A03(r1, r0)
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.A6P
            java.lang.String r0 = "Android"
            r6.A03(r1, r0)
            com.facebook.errorreporting.field.ReportFieldString r2 = X.C6B.A4X
            java.lang.String r0 = "java.boot.class.path"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto Le6
            java.lang.String r0 = "/apex/com.android.art/javalib/core-libart.jar"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lce
            java.lang.String r0 = "ART_APEX"
        L46:
            r6.A03(r2, r0)
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.A4Y
            java.lang.String r0 = android.os.Build.VERSION.RELEASE
            r6.A03(r1, r0)
            X.C4e r2 = X.C6B.A0q
            int r3 = android.os.Build.VERSION.SDK_INT
            long r0 = (long) r3
            X.C3228C4l.A01(r2, r6, r0)
            com.facebook.errorreporting.field.ReportFieldString r4 = X.C6B.AAM
            X.C1A r0 = new X.C1A
            r0.<init>()
            java.lang.String r2 = r0.A00
            java.lang.String r1 = ":"
            java.lang.String r0 = r0.A01
            java.lang.String r0 = X.FGI.A0U(r2, r1, r0)
            r6.A03(r4, r0)
            X.C4a r1 = X.C6B.A0A
            java.lang.String r0 = "/apex/com.android.art/lib64/libart.so"
            boolean r0 = X.BV5.A1V(r0)
            if (r0 == 0) goto Lbd
            r0 = 1
        L77:
            r6.A02(r1, r0)
            com.facebook.errorreporting.field.ReportFieldString r2 = X.C6B.A4W
            java.lang.String r0 = "os.version"
            java.lang.String r1 = java.lang.System.getProperty(r0)
            if (r1 == 0) goto L8a
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L90
        L8a:
            android.system.StructUtsname r0 = android.system.Os.uname()
            java.lang.String r1 = r0.release
        L90:
            r6.A03(r2, r1)
            r0 = 30
            if (r3 < r0) goto Laa
            org.json.JSONObject r2 = X.C2N.A00()
            int r0 = r2.length()
            if (r0 <= 0) goto Laa
            com.facebook.errorreporting.field.ReportFieldString r1 = X.C6B.AAF
            java.lang.String r0 = r2.toString()
            r6.A03(r1, r0)
        Laa:
            android.content.Context r0 = r5.A00
            A01(r0, r6)
            A03(r6)
            A00(r0, r6)
            r0 = 36
            if (r3 < r0) goto Lbc
            A02(r6)
        Lbc:
            return
        Lbd:
            java.lang.String r0 = "/apex/com.android.art/lib/libart.so"
            boolean r0 = X.BV5.A1V(r0)
            if (r0 == 0) goto Lc7
            r0 = 0
            goto L77
        Lc7:
            java.lang.String r0 = "/system/lib64/libc.so"
            boolean r0 = X.BV5.A1V(r0)
            goto L77
        Lce:
            java.lang.String r0 = "/system/framework/core-libart.jar"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Lda
            java.lang.String r0 = "ART"
            goto L46
        Lda:
            java.lang.String r0 = "/system/framework/core.jar"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto Le6
            java.lang.String r0 = "DALVIK"
            goto L46
        Le6:
            java.lang.String r0 = "UNKNOWN"
            goto L46
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6F.AY4(X.C4l, X.C4g):void");
    }

    public static void A00(Context context, C3228C4l c3228C4l) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            c3228C4l.A02(C6B.A07, packageManager.hasSystemFeature("android.hardware.ram.low"));
        }
    }

    public static void A01(Context context, C3228C4l c3228C4l) throws JSONException {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            List<ModuleInfo> installedModules = packageManager.getInstalledModules(0);
            JSONObject jSONObjectA18 = BV4.A18();
            Iterator<ModuleInfo> it = installedModules.iterator();
            while (it.hasNext()) {
                String packageName = it.next().getPackageName();
                if (packageName != null) {
                    try {
                        jSONObjectA18.put(packageName, packageManager.getPackageInfo(packageName, 1073741824).getLongVersionCode());
                    } catch (PackageManager.NameNotFoundException | JSONException unused) {
                    }
                }
            }
            c3228C4l.A03(C6B.A8r, jSONObjectA18.toString());
        }
    }
}
