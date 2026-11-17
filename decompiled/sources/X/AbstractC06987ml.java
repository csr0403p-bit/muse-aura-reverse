package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Trace;
import android.util.Base64;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.secure.trustedapp.exception.ApplicationInfoNotFoundException;
import com.facebook.secure.trustedapp.exception.PackageInfoMisMatchException;
import com.facebook.secure.trustedapp.exception.PackageNameNotFoundException;
import com.facebook.secure.trustedapp.exception.SignatureNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: X.7ml, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC06987ml {
    public static C06957mi A00(Context context, String str) {
        try {
            C06957mi c06957miA00 = AbstractC06937mg.A00(context, str, 64);
            String str2 = c06957miA00.A02;
            if (str.equals(str2)) {
                return c06957miA00;
            }
            throw new PackageInfoMisMatchException(FGI.A0d("Package name mismatch: expected=", str, ", was=", str2));
        } catch (PackageManager.NameNotFoundException e) {
            throw new PackageNameNotFoundException(FGI.A0M(str, " not found by PackageManager."), e);
        } catch (RuntimeException e2) {
            throw new SecurityException(e2);
        }
    }

    public static C7mC A01(Context context, String str) throws NoSuchAlgorithmException {
        C06957mi c06957miA00 = A00(context, str);
        C06897mc c06897mcA00 = c06957miA00.A00();
        if (c06897mcA00 == null) {
            throw new SignatureNotFoundException(c06957miA00.A02);
        }
        byte[] byteArray = c06897mcA00.A00.get(0).toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
            messageDigest.update(byteArray);
            return new C7mC(Base64.encodeToString(messageDigest.digest(), 11));
        } catch (NoSuchAlgorithmException unused) {
            throw new SecurityException("Error obtaining SHA1/SHA256");
        }
    }

    public static boolean A02(Context context) throws NoSuchAlgorithmException {
        return AnonymousClass002.A1L(AbstractC10402HbJ.A0k.contains(A01(context, context.getPackageName())) ? 1 : 0);
    }

    public static boolean A03(Context context, int i, int i2) {
        int iCheckSignatures;
        if (!AnonymousClass002.A1Q(i, i2)) {
            try {
                if (Trace.isEnabled()) {
                    try {
                        Trace.beginSection("PackageManagerCompat.checkSignatures");
                        iCheckSignatures = context.getPackageManager().checkSignatures(i, i2);
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    iCheckSignatures = context.getPackageManager().checkSignatures(i, i2);
                }
                if (iCheckSignatures != 0) {
                    return false;
                }
            } catch (RuntimeException e) {
                throw new SecurityException(e);
            }
        }
        return true;
    }

    public static boolean A04(Context context, String str) {
        ApplicationInfo applicationInfo = A00(context, context.getPackageName()).A00;
        if (applicationInfo == null) {
            throw new ApplicationInfoNotFoundException(context.getPackageName());
        }
        ApplicationInfo applicationInfo2 = A00(context, str).A00;
        if (applicationInfo2 != null) {
            return A03(context, applicationInfo.uid, applicationInfo2.uid);
        }
        throw new ApplicationInfoNotFoundException(str);
    }
}
