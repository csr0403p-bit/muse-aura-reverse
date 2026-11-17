package X;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public abstract class GKS {
    public static GKQ A00(byte[] serializedParameters) {
        try {
            GJL gjl = (GJL) GHM.A03(HzL.A00(), GJL.DEFAULT_INSTANCE, serializedParameters);
            GL6 gl6 = GL6.A01;
            GKZ gkz = new GKZ(gjl, AbstractC10509Hny.A00(gjl.typeUrl_));
            return !gl6.A00.get().A02.containsKey(new Hqs(gkz.A01, gkz.getClass())) ? new GKU(gkz) : gl6.A05(gkz);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
