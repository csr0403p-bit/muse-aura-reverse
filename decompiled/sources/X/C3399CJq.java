package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.facebook.aura.appupdate.AppUpdateNudgeKt;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.google.android.play.core.install.InstallException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.CJq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3399CJq {
    public static final CJT A03 = new CJT("AppUpdateService");
    public static final Intent A04 = C60P.A03("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE);
    public C3404CKi A00;
    public final Context A01;
    public final CK9 A02;

    public static CSC A01() {
        CJT cjt = A03;
        Object[] objArrA1Y = BV5.A1Y(-9);
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", CJT.A00(cjt.A00, "onError(%d)", objArrA1Y));
        }
        return CSC.A01(new InstallException(-9));
    }

    public C3399CJq(Context context, CK9 ck9) {
        int length;
        String strA10;
        context.getPackageName();
        this.A01 = context;
        this.A02 = ck9;
        try {
            if (context.getPackageManager().getApplicationInfo(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE, 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE, 64).signatures;
                if (signatureArr == null || (length = signatureArr.length) == 0) {
                    CJT cjt = AbstractC3397CJo.A00;
                    if (Log.isLoggable("PlayCore", 5)) {
                        BV4.A1K(cjt.A00, " : ", "Phonesky package is not signed -- possibly self-built package. Could not verify.", "PlayCore");
                        return;
                    }
                    return;
                }
                int i = 0;
                do {
                    try {
                        strA10 = BV8.A10(MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256), signatureArr[i].toByteArray());
                    } catch (NoSuchAlgorithmException unused) {
                        strA10 = "";
                    }
                    if (!"8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strA10)) {
                        String str = Build.TAGS;
                        if ((!str.contains("dev-keys") && !str.contains("test-keys")) || !"GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strA10)) {
                            i++;
                        }
                    }
                    Context applicationContext = context.getApplicationContext();
                    this.A00 = new C3404CKi(applicationContext != null ? applicationContext : context, A04, A03, C3402CJy.A00);
                    return;
                } while (i < length);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
    }

    public static Bundle A00() {
        Map map;
        Bundle bundleA0N = BV6.A0N();
        Bundle bundleA0N2 = BV6.A0N();
        synchronized (CJr.class) {
            Map map2 = CJr.A00;
            if (!map2.containsKey(AppUpdateNudgeKt.APP_UPDATE_NUDGE_ID)) {
                HashMap mapA0u = BV4.A0u();
                C8j4.A1O("java", mapA0u, 11004);
                map2.put(AppUpdateNudgeKt.APP_UPDATE_NUDGE_ID, mapA0u);
            }
            map = (Map) map2.get(AppUpdateNudgeKt.APP_UPDATE_NUDGE_ID);
        }
        bundleA0N2.putInt("playcore_version_code", BV7.A0H("java", map));
        if (map.containsKey("native")) {
            bundleA0N2.putInt("playcore_native_version", BV7.A0H("native", map));
        }
        if (map.containsKey("unity")) {
            bundleA0N2.putInt("playcore_unity_version", BV7.A0H("unity", map));
        }
        bundleA0N.putAll(bundleA0N2);
        bundleA0N.putInt("playcore.version.code", 11004);
        return bundleA0N;
    }
}
