package X;

import android.security.keystore.KeyGenParameterSpec;
import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.login.nativeflow.HatchRegistrationAttestorKt;
import com.facebook.secure.attestation.keystore.KeystoreOperationException;
import com.google.common.collect.ImmutableSet;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes5.dex */
public final class EEw {
    public KeyStore A00;
    public final int A01;

    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final /* synthetic */ X.EFC A01(X.EEw r4, java.lang.Exception r5, java.util.Set r6) {
        /*
            boolean r0 = r5 instanceof java.security.ProviderException
            if (r0 == 0) goto L72
            int r4 = r4.A01
            java.util.IdentityHashMap r0 = new java.util.IdentityHashMap
            r0.<init>()
            java.util.Set r3 = java.util.Collections.newSetFromMap(r0)
            com.google.common.collect.ImmutableList$Builder r2 = com.google.common.collect.ImmutableList.builder()
        L13:
            if (r5 == 0) goto L2b
            int r1 = r3.size()
            r0 = 16
            if (r1 >= r0) goto L2b
            boolean r0 = r3.add(r5)
            if (r0 == 0) goto L2b
            r2.add(r5)
            java.lang.Throwable r5 = r5.getCause()
            goto L13
        L2b:
            com.google.common.collect.ImmutableList r1 = r2.build()
            r3 = 33
            if (r4 >= r3) goto L6d
            X.EFB r2 = X.EFB.A02
        L35:
            X.EF2 r0 = X.EF2.STRONGBOX
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L57
            java.util.Iterator r1 = r1.iterator()
        L41:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r1.next()
            boolean r0 = r0 instanceof android.security.keystore.StrongBoxUnavailableException
            if (r0 == 0) goto L41
            java.lang.Integer r1 = X.C79.A02
        L51:
            X.EFC r0 = new X.EFC
            r0.<init>(r2, r1)
            return r0
        L57:
            X.EF2 r0 = X.EF2.DEVICE_INFORMATION
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L6a
            if (r4 < r3) goto L6a
            boolean r0 = X.EF0.A01(r2)
            if (r0 == 0) goto L6a
            java.lang.Integer r1 = X.C79.A03
            goto L51
        L6a:
            java.lang.Integer r1 = X.C79.A0A
            goto L51
        L6d:
            X.EFB r2 = X.EF0.A00(r1)
            goto L35
        L72:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EEw.A01(X.EEw, java.lang.Exception, java.util.Set):X.EFC");
    }

    public static void A02(KeyGenParameterSpec keyGenParameterSpec, EEw eEw, C6560EEx c6560EEx) throws NoSuchAlgorithmException, KeystoreOperationException, NoSuchProviderException, InvalidAlgorithmParameterException {
        ImmutableSet<EF2> immutableSet = c6560EEx.A00;
        Integer num = C79.A0P;
        Integer num2 = C79.A0Z;
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", "AndroidKeyStore");
            Class[] clsArr = {IllegalArgumentException.class};
            try {
                keyPairGenerator.initialize(keyGenParameterSpec);
                Integer num3 = C79.A0T;
                Integer num4 = C79.A0A;
                Class[] clsArr2 = {IllegalStateException.class, ProviderException.class};
                try {
                    keyPairGenerator.generateKeyPair();
                } catch (IOException | GeneralSecurityException e) {
                    EFC efcA01 = A01(eEw, e, immutableSet);
                    if (efcA01 == null) {
                        efcA01 = new EFC(EFB.A02, num4);
                    }
                    Exception exc = efcA01.A00.A00;
                    if (exc == null) {
                        exc = e;
                    }
                    throw new KeystoreOperationException(C6560EEx.A00(efcA01, c6560EEx, exc, num3));
                } catch (RuntimeException e2) {
                    if (!C6560EEx.A02(e2, clsArr2)) {
                        throw e2;
                    }
                    EFC efcA012 = A01(eEw, e2, immutableSet);
                    if (efcA012 == null) {
                        efcA012 = new EFC(EFB.A02, num4);
                    }
                    Exception exc2 = efcA012.A00.A00;
                    if (exc2 == null) {
                        exc2 = e2;
                    }
                    throw new KeystoreOperationException(C6560EEx.A00(efcA012, c6560EEx, exc2, num3));
                }
            } catch (IOException | GeneralSecurityException e3) {
                throw C6560EEx.A01(c6560EEx, e3, num, num2);
            } catch (RuntimeException e4) {
                if (!C6560EEx.A02(e4, clsArr)) {
                    throw e4;
                }
                throw C6560EEx.A01(c6560EEx, e4, num, num2);
            }
        } catch (IOException | GeneralSecurityException e5) {
            throw C6560EEx.A01(c6560EEx, e5, num, num2);
        } catch (RuntimeException e6) {
            throw e6;
        }
    }

    public final void A03(C6560EEx c6560EEx, byte[] bArr) throws NoSuchAlgorithmException, KeystoreOperationException, NoSuchProviderException, InvalidAlgorithmParameterException {
        ImmutableSet<EF2> immutableSet = c6560EEx.A00;
        Integer num = C79.A0P;
        Integer num2 = C79.A0Z;
        Class[] clsArr = {IllegalArgumentException.class, IllegalStateException.class};
        try {
            int i = this.A01;
            KeyGenParameterSpec.Builder builderA00 = A00();
            builderA00.setAttestationChallenge(bArr);
            if (immutableSet.contains(EF2.STRONGBOX)) {
                builderA00.setIsStrongBoxBacked(true);
            }
            if (i >= 31 && immutableSet.contains(EF2.DEVICE_INFORMATION)) {
                builderA00.setDevicePropertiesAttestationIncluded(true);
            }
            A02(builderA00.build(), this, c6560EEx);
        } catch (IOException | GeneralSecurityException e) {
            throw C6560EEx.A01(c6560EEx, e, num, num2);
        } catch (RuntimeException e2) {
            if (!C6560EEx.A02(e2, clsArr)) {
                throw e2;
            }
            throw C6560EEx.A01(c6560EEx, e2, num, num2);
        }
    }

    public EEw(int i) {
        this.A01 = i;
    }

    public static KeyGenParameterSpec.Builder A00() {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(1, 10);
        return new KeyGenParameterSpec.Builder(HatchRegistrationAttestorKt.HATCH_REGISTRATION_KEY_ALIAS, 12).setDigests(ConfidentialVmPinVerifierCrypto.SHA_256).setCertificateNotBefore(date).setCertificateNotAfter(calendar.getTime());
    }
}
