package X;

import X.AbstractC10524Hor;
import X.GF1;

/* loaded from: classes6.dex */
public abstract class GF1<MessageType extends GF1<MessageType, BuilderType>, BuilderType extends AbstractC10524Hor<MessageType, BuilderType>> implements AnonymousClass777 {
    public int memoizedHashCode = 0;

    public final int A04(GG0 schema) {
        int iAKR;
        GF0 gf0 = (GF0) this;
        if (AbstractC7609F5w.A1U(gf0.memoizedSerializedSize, Integer.MIN_VALUE)) {
            if (schema == null) {
                schema = AbstractC7609F5w.A0V(gf0);
            }
            iAKR = schema.AKR(gf0);
            if (iAKR < 0) {
                throw BV7.A0l("serialized size must be non-negative, was ", iAKR);
            }
        } else {
            iAKR = gf0.memoizedSerializedSize & Integer.MAX_VALUE;
            if (iAKR == Integer.MAX_VALUE) {
                if (schema == null) {
                    schema = AbstractC7609F5w.A0V(gf0);
                }
                int iAKR2 = schema.AKR(gf0);
                if (iAKR2 < 0) {
                    throw BV7.A0l("serialized size must be non-negative, was ", iAKR2);
                }
                gf0.memoizedSerializedSize = (Integer.MAX_VALUE & iAKR2) | (gf0.memoizedSerializedSize & Integer.MIN_VALUE);
                return iAKR2;
            }
        }
        return iAKR;
    }
}
