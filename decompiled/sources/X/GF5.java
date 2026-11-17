package X;

import X.AbstractC10480Hkv;
import X.GF5;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class GF5<MessageType extends GF5<MessageType, BuilderType>, BuilderType extends AbstractC10480Hkv<MessageType, BuilderType>> implements GF8 {
    public int memoizedHashCode = 0;

    public static Map A03(C9168Fzb c9168Fzb) {
        return Collections.unmodifiableMap(c9168Fzb.values_);
    }

    public final int A04(GF4 schema) {
        int iAKR;
        GF2 gf2 = (GF2) this;
        if (AbstractC7609F5w.A1U(gf2.memoizedSerializedSize, Integer.MIN_VALUE)) {
            if (schema == null) {
                schema = AbstractC7609F5w.A0X(gf2);
            }
            iAKR = schema.AKR(gf2);
            if (iAKR < 0) {
                throw BV7.A0l("serialized size must be non-negative, was ", iAKR);
            }
        } else {
            iAKR = gf2.memoizedSerializedSize & Integer.MAX_VALUE;
            if (iAKR == Integer.MAX_VALUE) {
                if (schema == null) {
                    schema = AbstractC7609F5w.A0X(gf2);
                }
                int iAKR2 = schema.AKR(gf2);
                if (iAKR2 < 0) {
                    throw BV7.A0l("serialized size must be non-negative, was ", iAKR2);
                }
                gf2.memoizedSerializedSize = (Integer.MAX_VALUE & iAKR2) | (gf2.memoizedSerializedSize & Integer.MIN_VALUE);
                return iAKR2;
            }
        }
        return iAKR;
    }
}
