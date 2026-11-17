package com.facebook.aura.utils;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.BV5;
import X.C31u;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.HxE;
import X.InterfaceC7359EnW;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.mobileconfig.AuraMobileConfigDelegatesKt;
import com.facebook.aura.utils.MC;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes5.dex */
public final class HatchLeakPreventionUtil {
    public static final int $stable = 0;
    public static final String LEAK_PREVENTION_HASH = "e16f54914656d54f820419314bff7285c61466c7184e05cfec3afe036ac92a9f";
    public static volatile HxE<String, Boolean> lastCheck;
    public static final /* synthetic */ InterfaceC7359EnW<Object>[] $$delegatedProperties = AnonymousClass003.A1b(HatchLeakPreventionUtil.class, "leakPreventionKey", "getLeakPreventionKey()Ljava/lang/String;");
    public static final HatchLeakPreventionUtil INSTANCE = new HatchLeakPreventionUtil();
    public static final C31u leakPreventionKey$delegate = AuraMobileConfigDelegatesKt.auraMobileConfigString(MC.hatch_android.leak_prevention_key);

    private final String getLeakPreventionKey() {
        return BV5.A0m(this, leakPreventionKey$delegate, $$delegatedProperties, 0);
    }

    private final String getOneWayHash(String str) throws NoSuchAlgorithmException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
            messageDigest.reset();
            messageDigest.update(C3cG.A1S(str));
            byte[] bArrDigest = messageDigest.digest();
            C7384Etj.A0U(bArrDigest);
            return toHexString(bArrDigest);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    private final String toHexString(byte[] bArr) {
        StringBuilder sbA0w = C60O.A0w();
        for (byte b : bArr) {
            String hexString = Integer.toHexString((b & 255) | 256);
            C7384Etj.A0U(hexString);
            sbA0w.append(hexString.substring(1, 3));
        }
        return sbA0w.toString();
    }

    public final boolean isLeakPreventionHashCorrect() {
        String leakPreventionKey = getLeakPreventionKey();
        HxE<String, Boolean> hxE = lastCheck;
        if (hxE != null) {
            String str = hxE.first;
            boolean zA1X = AnonymousClass001.A1X(hxE.second);
            if (C7384Etj.areEqual(str, leakPreventionKey)) {
                return zA1X;
            }
        }
        boolean zEquals = LEAK_PREVENTION_HASH.equals(getOneWayHash(leakPreventionKey));
        lastCheck = C3cG.A0r(leakPreventionKey, Boolean.valueOf(zEquals));
        return zEquals;
    }
}
