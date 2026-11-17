package X;

import com.facebook.aura.confidentialvm.repository.ConfidentialVmPinVerifierCrypto;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: X.F1v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC7546F1v {
    public static final SecretKey A00 = KeyGenerator.getInstance(ConfidentialVmPinVerifierCrypto.AES).generateKey();
}
