package X;

import java.security.Provider;
import javax.crypto.Mac;

/* loaded from: classes4.dex */
public final class AF1 implements AEx<Mac> {
    @Override // X.AEx
    public final /* bridge */ /* synthetic */ Mac AGb(String algorithm, Provider provider) {
        return provider == null ? Mac.getInstance(algorithm) : Mac.getInstance(algorithm, provider);
    }
}
