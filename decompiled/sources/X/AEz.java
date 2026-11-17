package X;

import java.security.KeyFactory;
import java.security.Provider;

/* loaded from: classes4.dex */
public final class AEz implements AEx<KeyFactory> {
    @Override // X.AEx
    public final /* bridge */ /* synthetic */ KeyFactory AGb(String algorithm, Provider provider) {
        return provider == null ? KeyFactory.getInstance(algorithm) : KeyFactory.getInstance(algorithm, provider);
    }
}
