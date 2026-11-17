package X;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* loaded from: classes4.dex */
public final class AEv implements AEx<KeyPairGenerator> {
    @Override // X.AEx
    public final /* bridge */ /* synthetic */ KeyPairGenerator AGb(String algorithm, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(algorithm) : KeyPairGenerator.getInstance(algorithm, provider);
    }
}
