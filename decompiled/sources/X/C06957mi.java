package X;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.7mi, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06957mi {
    public final ApplicationInfo A00;
    public final PackageInfo A01;
    public final String A02;
    public final String A03;

    public final C06897mc A00() {
        PackageInfo packageInfo = this.A01;
        SigningInfo signingInfo = packageInfo.signingInfo;
        if (signingInfo == null) {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                return null;
            }
            List listA0U = AbstractC0878AGe.A0U(Arrays.asList(signatureArr));
            if (listA0U.isEmpty()) {
                return null;
            }
            return new C06897mc(listA0U, listA0U.size() > 1, false);
        }
        boolean zHasMultipleSigners = signingInfo.hasMultipleSigners();
        boolean zHasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
        Signature[] apkContentsSigners = zHasMultipleSigners ? signingInfo.getApkContentsSigners() : signingInfo.getSigningCertificateHistory();
        if (apkContentsSigners == null) {
            return null;
        }
        List listA0U2 = AbstractC0878AGe.A0U(Arrays.asList(apkContentsSigners));
        if (listA0U2.isEmpty()) {
            return null;
        }
        return new C06897mc(listA0U2, zHasMultipleSigners, zHasPastSigningCertificates);
    }

    public C06957mi(PackageInfo packageInfo) {
        this.A01 = packageInfo;
        String str = packageInfo.packageName;
        this.A02 = str == null ? "" : str;
        String str2 = packageInfo.versionName;
        this.A03 = str2 == null ? "" : str2;
        this.A00 = packageInfo.applicationInfo;
    }
}
