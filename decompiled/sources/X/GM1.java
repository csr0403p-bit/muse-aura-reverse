package X;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes6.dex */
public final class GM1 extends GMT {
    public final GMD A00;
    public final C6966EdO A01;
    public final Integer A02;

    public static GM1 A01(GMD parameters, Integer idRequirement) throws GeneralSecurityException {
        byte[] bArrArray;
        GMP gmp = parameters.A00;
        if (gmp == GMP.A02) {
            if (idRequirement == null) {
                throw BV6.A0u("For given Variant TINK the value of idRequirement must be non-null");
            }
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(5);
            byteBufferAllocate.put((byte) 1);
            byteBufferAllocate.putInt(idRequirement.intValue());
            bArrArray = byteBufferAllocate.array();
        } else {
            if (gmp != GMP.A01) {
                throw AbstractC7611F5y.A0a(gmp, "Unknown Variant: ");
            }
            if (idRequirement != null) {
                throw BV6.A0u("For given Variant NO_PREFIX the value of idRequirement must be null");
            }
            bArrArray = new byte[0];
        }
        return new GM1(parameters, C6966EdO.A00(bArrArray), idRequirement);
    }

    public GM1(GMD parameters, C6966EdO outputPrefix, Integer idRequirement) {
        this.A00 = parameters;
        this.A01 = outputPrefix;
        this.A02 = idRequirement;
    }
}
