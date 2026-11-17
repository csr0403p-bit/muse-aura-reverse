package X;

import java.security.Provider;
import java.security.Signature;

/* loaded from: classes4.dex */
public final class AEy implements AEx<Signature> {
    @Override // X.AEx
    public final /* bridge */ /* synthetic */ Signature AGb(String algorithm, Provider provider) {
        return provider == null ? Signature.getInstance(algorithm) : Signature.getInstance(algorithm, provider);
    }
}
