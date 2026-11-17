package X;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Trace;
import android.util.Base64;
import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.secure.trustedapp.exception.PackageNameNotFoundException;
import com.facebook.secure.trustedapp.exception.SignatureNotFoundException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.7mj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C06967mj {
    public final int A00;
    public final String A01;
    public final String A02;
    public final List<String> A03;
    public final List<Signature> A04;
    public final List<C7mC> A05;
    public final int A06;

    public static C06967mj A01(Context context, String str) {
        ProviderInfo providerInfoResolveContentProvider;
        if (Trace.isEnabled()) {
            try {
                Trace.beginSection("PackageManagerCompat.resolveContentProvider");
                PackageManager packageManager = context.getPackageManager();
                providerInfoResolveContentProvider = Build.VERSION.SDK_INT >= 33 ? packageManager.resolveContentProvider(str, PackageManager.ComponentInfoFlags.of(0L)) : packageManager.resolveContentProvider(str, 0);
            } finally {
                Trace.endSection();
            }
        } else {
            PackageManager packageManager2 = context.getPackageManager();
            providerInfoResolveContentProvider = Build.VERSION.SDK_INT >= 33 ? packageManager2.resolveContentProvider(str, PackageManager.ComponentInfoFlags.of(0L)) : packageManager2.resolveContentProvider(str, 0);
        }
        if (providerInfoResolveContentProvider != null) {
            return A02(context, ((PackageItemInfo) providerInfoResolveContentProvider).packageName, true);
        }
        throw new SecurityException(FGI.A0M("Unable to get providerInfo for authority ", str));
    }

    public static C06967mj A03(C06957mi c06957mi, Set set, boolean z) throws NoSuchAlgorithmException {
        C7mC c7mC;
        C06897mc c06897mcA00 = c06957mi.A00();
        if (c06897mcA00 == null) {
            throw new SignatureNotFoundException("Unable to construct AppIdentity -- signingInfo was null. Make sure you called getPackageInfo() with GET_SIGNATURES or GET_CERTIFICATES flag.");
        }
        List<Signature> list = c06897mcA00.A00;
        if (list.isEmpty()) {
            throw new SignatureNotFoundException("Unable to construct AppIdentity -- packageInfo does not have any signatures. Make sure you called getPackageInfo() with GET_SIGNATURES or GET_CERTIFICATES flag.");
        }
        ApplicationInfo applicationInfo = c06957mi.A00;
        if (applicationInfo == null) {
            throw new SecurityException("Unable to construct AppIdentity -- package applicationInfo is null");
        }
        ArrayList arrayListA0t = C60Q.A0t(list);
        ArrayList arrayListA0t2 = C60Q.A0t(list);
        for (Signature signature : list) {
            byte[] byteArray = signature.toByteArray();
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
                messageDigest.update(byteArray);
                String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 11);
                if (z) {
                    MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-1");
                    messageDigest2.update(byteArray);
                    String strEncodeToString2 = Base64.encodeToString(messageDigest2.digest(), 11);
                    c7mC = new C7mC();
                    c7mC.sha1Hash = strEncodeToString2;
                    if (strEncodeToString.length() != 43) {
                        throw new SecurityException("Invalid SHA256 key hash - should be 256-bit.");
                    }
                    c7mC.sha256Hash = strEncodeToString;
                } else {
                    c7mC = new C7mC(strEncodeToString);
                }
                arrayListA0t.add(c7mC);
                arrayListA0t2.add(signature);
            } catch (NoSuchAlgorithmException unused) {
                throw new SecurityException("Error obtaining SHA1/SHA256");
            }
        }
        set.add(c06957mi.A02);
        int i = applicationInfo.uid;
        return new C06967mj(c06957mi.A03, null, new ArrayList(set), arrayListA0t, arrayListA0t2, i, applicationInfo.flags);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C06967mj c06967mj = (C06967mj) obj;
                if (this.A00 != c06967mj.A00 || !this.A03.equals(c06967mj.A03) || !Ht0.A00(this.A05, c06967mj.A05) || !Ht0.A00(this.A02, c06967mj.A02) || !Ht0.A00(this.A01, c06967mj.A01) || !Ht0.A00(this.A04, c06967mj.A04) || this.A06 != c06967mj.A06) {
                }
            }
            return false;
        }
        return true;
    }

    public static C06967mj A02(Context context, String str, boolean z) {
        try {
            return A03(AbstractC06937mg.A00(context, str, 64), C60O.A13(), z);
        } catch (PackageManager.NameNotFoundException e) {
            throw new PackageNameNotFoundException(FGI.A0M("Unable to get packageInfo for package ", str), e);
        }
    }

    public final C7mC A04() {
        List<C7mC> list = this.A05;
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public final String A05() {
        List<String> list = this.A03;
        if (list.isEmpty()) {
            throw C3cG.A0Q("Invalid AppIdentity object: no package names");
        }
        return AnonymousClass005.A0j(list.iterator());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A03, this.A05, this.A02, this.A01, Integer.valueOf(this.A06), this.A04});
    }

    /* JADX WARN: Incorrect types in method signature: (ILjava/util/List<Ljava/lang/String;>;Ljava/util/List<LX/7mC;>;Ljava/lang/String;Ljava/lang/String;ILjava/util/List<Landroid/content/pm/Signature;>;)V */
    public C06967mj(String str, String str2, List list, List list2, List list3, int i, int i2) {
        this.A00 = i;
        this.A03 = Collections.unmodifiableList(list);
        this.A05 = list2;
        this.A02 = str;
        this.A01 = str2;
        this.A06 = i2;
        this.A04 = list3;
        if (list.isEmpty()) {
            throw C60O.A0i("At least one package name is required");
        }
    }

    public static C06967mj A00(Context context, int i) {
        try {
            String[] strArrA02 = AbstractC06937mg.A02(context, i);
            C06957mi c06957miA00 = AbstractC06937mg.A00(context, strArrA02[0], 64);
            HashSet hashSetA13 = C60O.A13();
            hashSetA13.addAll(Arrays.asList(strArrA02));
            return A03(c06957miA00, hashSetA13, false);
        } catch (PackageManager.NameNotFoundException e) {
            throw new PackageNameNotFoundException(FGI.A0H("Unable to get packageInfo for uid ", i), e);
        }
    }

    public final String toString() {
        C7mC c7mCA04 = A04();
        StringBuilder sbA0x = C60O.A0x("AppIdentity{uid=");
        sbA0x.append(this.A00);
        sbA0x.append(", packageNames=");
        sbA0x.append(this.A03);
        sbA0x.append(", sha2=");
        String str = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        String string = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        sbA0x.append(c7mCA04 == null ? HatchCcvLoggingKt.NO_POSTAL_FIELD : c7mCA04.sha256Hash);
        sbA0x.append(C8j2.A00(16));
        String str2 = this.A02;
        if (str2 == null) {
            str2 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        }
        sbA0x.append(str2);
        sbA0x.append(", domain=");
        String str3 = this.A01;
        if (str3 != null) {
            str = str3;
        }
        sbA0x.append(str);
        sbA0x.append(", flags=");
        sbA0x.append(this.A06);
        sbA0x.append(", rawCertificates=");
        List<Signature> list = this.A04;
        if (!list.isEmpty()) {
            StringBuilder sbA0w = C60O.A0w();
            int i = 0;
            while (i < list.size()) {
                Signature signature = list.get(i);
                i++;
                sbA0w.append(FGI.A0I("Certificate #", i, PairsDiscretionDocument.TERMINATOR));
                sbA0w.append(Base64.encodeToString(signature.toByteArray(), 0));
            }
            string = sbA0w.toString();
        }
        sbA0x.append(string);
        sbA0x.append('}');
        return sbA0x.toString();
    }
}
