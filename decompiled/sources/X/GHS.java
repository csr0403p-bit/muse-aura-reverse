package X;

import X.AbstractC9393GHi;
import X.GHS;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class GHS<MessageType extends GHS<MessageType, BuilderType>, BuilderType extends AbstractC9393GHi<MessageType, BuilderType>> implements InterfaceC9329GEk {
    public int memoizedHashCode = 0;

    public final C9324GEf A0C() {
        try {
            int iA0B = A0B(null);
            AbstractC9321GEc abstractC9321GEc = AbstractC9321GEc.A00;
            byte[] bArr = new byte[iA0B];
            GGF ggf = new GGF(bArr, iA0B);
            GHV ghvA0d = AbstractC7609F5w.A0d(this);
            GHX ghx = ggf.A01;
            if (ghx == null) {
                ghx = new GHX(ggf);
            }
            ghvA0d.Aj1(ghx, this);
            if (ggf.A02 - ggf.A00 == 0) {
                return new C9324GEf(bArr);
            }
            throw C3cG.A0Q("Did not write as much data as expected.");
        } catch (IOException e) {
            throw BV4.A0d(FGI.A0h("Serializing ", C60Q.A0e(this), " to a ", "ByteString", " threw an IOException (should never happen)."), e);
        }
    }

    public final byte[] A0D() {
        try {
            int iA0B = A0B(null);
            byte[] bArr = new byte[iA0B];
            GGF ggf = new GGF(bArr, iA0B);
            GHV ghvA0d = AbstractC7609F5w.A0d(this);
            GHX ghx = ggf.A01;
            if (ghx == null) {
                ghx = new GHX(ggf);
            }
            ghvA0d.Aj1(ghx, this);
            if (ggf.A02 - ggf.A00 == 0) {
                return bArr;
            }
            throw C3cG.A0Q("Did not write as much data as expected.");
        } catch (IOException e) {
            throw BV4.A0d(FGI.A0h("Serializing ", C60Q.A0e(this), " to a ", "byte array", " threw an IOException (should never happen)."), e);
        }
    }

    public static GKT A08(GJO gjo, GHM ghm, Class cls, String str) {
        return new GKT(gjo, (InterfaceC9394GHj) ghm.A0E(C79.A0W), cls, str);
    }

    public static GHW A09(GHM ghm) {
        return (GHW) ghm.A0E(C79.A0P);
    }

    public final int A0B(GHV schema) {
        int iAKR;
        GHM ghm = (GHM) this;
        int i = ghm.memoizedSerializedSize;
        if ((i & Integer.MIN_VALUE) != 0) {
            if (schema == null) {
                schema = AbstractC7609F5w.A0d(ghm);
            }
            iAKR = schema.AKR(ghm);
            if (iAKR < 0) {
                throw BV7.A0l("serialized size must be non-negative, was ", iAKR);
            }
        } else {
            iAKR = i & Integer.MAX_VALUE;
            if (iAKR == Integer.MAX_VALUE) {
                if (schema == null) {
                    schema = AbstractC7609F5w.A0d(ghm);
                }
                int iAKR2 = schema.AKR(ghm);
                if (iAKR2 < 0) {
                    throw BV7.A0l("serialized size must be non-negative, was ", iAKR2);
                }
                ghm.memoizedSerializedSize = (Integer.MAX_VALUE & iAKR2) | (ghm.memoizedSerializedSize & Integer.MIN_VALUE);
                return iAKR2;
            }
        }
        return iAKR;
    }

    public static GHW A0A(GHM ghm, Integer num) {
        return (GHW) ghm.A0E(num);
    }
}
