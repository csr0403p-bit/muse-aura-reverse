package X;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* loaded from: classes4.dex */
public final class AEw implements AEx<KeyAgreement> {
    @Override // X.AEx
    public final /* bridge */ /* synthetic */ KeyAgreement AGb(String algorithm, Provider provider) {
        return provider == null ? KeyAgreement.getInstance(algorithm) : KeyAgreement.getInstance(algorithm, provider);
    }
}
