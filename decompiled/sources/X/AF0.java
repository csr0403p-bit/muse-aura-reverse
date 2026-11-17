package X;

import java.security.MessageDigest;
import java.security.Provider;

/* loaded from: classes4.dex */
public final class AF0 implements AEx<MessageDigest> {
    @Override // X.AEx
    public final /* bridge */ /* synthetic */ MessageDigest AGb(String algorithm, Provider provider) {
        return provider == null ? MessageDigest.getInstance(algorithm) : MessageDigest.getInstance(algorithm, provider);
    }
}
