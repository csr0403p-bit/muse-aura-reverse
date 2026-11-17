package X;

import java.security.Provider;
import javax.crypto.Cipher;

/* loaded from: classes4.dex */
public final class AF6 implements AEx<Cipher> {
    @Override // X.AEx
    public final /* bridge */ /* synthetic */ Cipher AGb(String algorithm, Provider provider) {
        return provider == null ? Cipher.getInstance(algorithm) : Cipher.getInstance(algorithm, provider);
    }
}
