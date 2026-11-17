package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.math.BigInteger;

/* renamed from: X.GiF, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9821GiF extends AbstractC9789Ggy {
    public final BigInteger _value;
    public static final BigInteger A02 = BigInteger.valueOf(AuraImpressionTimeTracker.UNKNOWN_TIME);
    public static final BigInteger A00 = BigInteger.valueOf(2147483647L);
    public static final BigInteger A03 = BigInteger.valueOf(Long.MIN_VALUE);
    public static final BigInteger A01 = BigInteger.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX);

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C9821GiF)) {
            return false;
        }
        return C6xC.A00(((C9821GiF) obj)._value, this._value);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return AnonymousClass006.A0D(this._value);
    }

    public C9821GiF(BigInteger bigInteger) {
        this._value = bigInteger;
    }
}
