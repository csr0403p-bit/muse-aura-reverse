package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import com.facebook.aura.analytics.hatch.HatchInstallReferrerLogger;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public final class CJG implements CFD {
    public final CFD A00;

    @Override // X.CFD
    public final /* bridge */ /* synthetic */ Object AjF() {
        int length;
        String strA10;
        Context context = ((CJD) this.A00).A00.A00;
        if (context == null) {
            throw BV4.A0a("Cannot return null from a non-@Nullable @Provides method");
        }
        CJQ cjq = C3392CJg.A02;
        context.getPackageName();
        C3392CJg c3392CJg = new C3392CJg();
        int i = 0;
        try {
            if (context.getPackageManager().getApplicationInfo(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE, 0).enabled) {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo(HatchInstallReferrerLogger.PLAY_STORE_PACKAGE, 64).signatures;
                if (signatureArr != null && (length = signatureArr.length) != 0) {
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
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        c3392CJg.A00 = new CKb(context, C3392CJg.A01, C3392CJg.A02, C3394CJi.A00);
                        return c3392CJg;
                    } while (i < length);
                }
                AbstractC3393CJh.A00.A04("Phonesky package is not signed -- possibly self-built package. Could not verify.", new Object[0]);
            }
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return c3392CJg;
    }

    public CJG(CFD cfd) {
        this.A00 = cfd;
    }
}
