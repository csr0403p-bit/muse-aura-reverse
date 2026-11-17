package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.facebook.aura.auth.credentialmanager.AuraCredentialManagerFetchHelper;

/* loaded from: classes5.dex */
public class CaK {
    public static final CaK A00 = new CaK();

    public final Intent A02(Context context, String str, int i) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE, null);
            Intent intentA03 = C60P.A03("android.settings.APPLICATION_DETAILS_SETTINGS");
            intentA03.setData(uriFromParts);
            return intentA03;
        }
        if (context != null && AbstractC3629CaM.A00(context)) {
            Intent intentA032 = C60P.A03("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intentA032.setPackage("com.google.android.wearable.app");
            return intentA032;
        }
        StringBuilder sbA0x = C60O.A0x("gcore_");
        sbA0x.append(12451000);
        sbA0x.append("-");
        if (!TextUtils.isEmpty(str)) {
            sbA0x.append(str);
        }
        sbA0x.append("-");
        if (context != null) {
            sbA0x.append(context.getPackageName());
        }
        sbA0x.append("-");
        if (context != null) {
            try {
                CUG cugA00 = CUF.A00(context);
                sbA0x.append(cugA00.A00.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sbA0x.toString();
        Intent intentA033 = C60P.A03("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", AuraCredentialManagerFetchHelper.PROVIDER_PACKAGE);
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intentA033.setData(builderAppendQueryParameter.build());
        intentA033.setPackage(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE);
        intentA033.addFlags(524288);
        return intentA033;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A01(android.content.Context r10, int r11) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CaK.A01(android.content.Context, int):int");
    }
}
