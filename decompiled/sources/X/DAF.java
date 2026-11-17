package X;

import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import com.facebook.aura.login.nativeflow.HatchRegistrationAttestorKt;
import com.facebook.secure.attestation.keystore.KeystoreOperationException;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.ProviderException;
import java.security.UnrecoverableEntryException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class DAF {
    public final EEw A00;

    public final KeyStore.PrivateKeyEntry A01(C6560EEx c6560EEx) throws KeystoreOperationException, NoSuchAlgorithmException, KeyStoreException, UnrecoverableEntryException {
        KeyStore keyStore;
        EEw eEw = this.A00;
        synchronized (eEw) {
            keyStore = eEw.A00;
            if (keyStore == null) {
                Integer num = C79.A01;
                Integer num2 = C79.A0K;
                Class[] clsArr = {IllegalStateException.class, ProviderException.class};
                try {
                    keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    eEw.A00 = keyStore;
                } catch (IOException | GeneralSecurityException e) {
                    throw C6560EEx.A01(c6560EEx, e, num, num2);
                } catch (RuntimeException e2) {
                    if (C6560EEx.A02(e2, clsArr)) {
                        throw C6560EEx.A01(c6560EEx, e2, num, num2);
                    }
                    throw e2;
                }
            }
        }
        Integer num3 = C79.A0C;
        Integer num4 = C79.A0P;
        Class[] clsArr2 = {NullPointerException.class, ProviderException.class, UnsupportedOperationException.class};
        try {
            KeyStore.Entry entry = keyStore.getEntry(HatchRegistrationAttestorKt.HATCH_REGISTRATION_KEY_ALIAS, null);
            if (entry == null) {
                return null;
            }
            if (entry instanceof KeyStore.PrivateKeyEntry) {
                return (KeyStore.PrivateKeyEntry) entry;
            }
            throw c6560EEx.A03(num3, C79.A0W);
        } catch (IOException | GeneralSecurityException e3) {
            throw C6560EEx.A01(c6560EEx, e3, num3, num4);
        } catch (RuntimeException e4) {
            if (C6560EEx.A02(e4, clsArr2)) {
                throw C6560EEx.A01(c6560EEx, e4, num3, num4);
            }
            throw e4;
        }
    }

    public DAF(EEw eEw) {
        this.A00 = eEw;
    }

    public static final DAG A00(C6560EEx c6560EEx, KeyStore.PrivateKeyEntry privateKeyEntry) throws NoSuchAlgorithmException, KeystoreOperationException {
        CzV czV;
        byte[] encoded = privateKeyEntry.getCertificate().getPublicKey().getEncoded();
        if (encoded == null) {
            throw c6560EEx.A03(C79.A0K, C79.A0Y);
        }
        Integer num = C79.A0K;
        Integer num2 = C79.A09;
        Class[] clsArr = {IllegalArgumentException.class, IllegalStateException.class, ProviderException.class};
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(ConfidentialVmPinVerifierCrypto.SHA_256);
            C4592CzX c4592CzX = (C4592CzX) AbstractC4591CzW.A00;
            AbstractC4591CzW c4594CzZ = c4592CzX.A02;
            if (c4594CzZ == null) {
                CzV czV2 = c4592CzX.A00;
                char[] cArr = czV2.A07;
                int length = cArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        czV = czV2;
                        break;
                    }
                    char c = cArr[i];
                    if (c < 'A' || c > 'Z') {
                        i++;
                    } else {
                        boolean z = false;
                        int i2 = 0;
                        while (true) {
                            if (i2 >= length) {
                                break;
                            }
                            char c2 = cArr[i2];
                            if (c2 >= 'a' && c2 <= 'z') {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                        Preconditions.checkState(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                        char[] cArr2 = new char[length];
                        for (int i3 = 0; i3 < length; i3++) {
                            char c3 = cArr[i3];
                            if (c3 >= 'A' && c3 <= 'Z') {
                                c3 = (char) (c3 ^ ' ');
                            }
                            cArr2[i3] = c3;
                        }
                        czV = new CzV(FGI.A0M(czV2.A04, ".lowerCase()"), cArr2);
                        if (czV2.A05 && !czV.A05) {
                            byte[] bArr = czV.A06;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                            int i4 = 65;
                            while (true) {
                                if (i4 > 90) {
                                    czV = new CzV(FGI.A0M(czV.A04, ".ignoreCase()"), bArrCopyOf, czV.A07, true);
                                    break;
                                }
                                int i5 = i4 | 32;
                                byte b = bArr[i4];
                                byte b2 = bArr[i5];
                                if (b == -1) {
                                    bArrCopyOf[i4] = b2;
                                } else {
                                    char c4 = (char) i4;
                                    char c5 = (char) i5;
                                    if (!(b2 == -1)) {
                                        throw BV7.A0m("Can't ignoreCase() since '%s' and '%s' encode different values", new Object[]{Character.valueOf(c4), Character.valueOf(c5)});
                                    }
                                    bArrCopyOf[i5] = b;
                                }
                                i4++;
                            }
                        }
                    }
                }
                if (czV == czV2) {
                    c4594CzZ = c4592CzX;
                } else {
                    Character ch = c4592CzX.A01;
                    if (c4592CzX instanceof C4593CzY) {
                        c4594CzZ = new C4593CzY(czV, ch);
                        Preconditions.checkArgument(AnonymousClass002.A1Q(czV.A07.length, 64));
                    } else {
                        c4594CzZ = c4592CzX instanceof C4594CzZ ? new C4594CzZ(czV) : new C4592CzX(czV, ch);
                    }
                }
                c4592CzX.A02 = c4594CzZ;
            }
            return new DAG(c4594CzZ.A00(messageDigest.digest(encoded)));
        } catch (IOException | GeneralSecurityException e) {
            throw C6560EEx.A01(c6560EEx, e, num, num2);
        } catch (RuntimeException e2) {
            if (C6560EEx.A02(e2, clsArr)) {
                throw C6560EEx.A01(c6560EEx, e2, num, num2);
            }
            throw e2;
        }
    }
}
