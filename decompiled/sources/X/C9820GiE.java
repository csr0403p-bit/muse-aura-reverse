package X;

import com.facebook.aura.bloks.extensions.visibility.AuraImpressionTimeTracker;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.math.BigDecimal;

/* renamed from: X.GiE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9820GiE extends AbstractC9789Ggy {
    public final BigDecimal _value;
    public static final C9820GiE A00 = new C9820GiE(BigDecimal.ZERO);
    public static final BigDecimal A03 = BigDecimal.valueOf(AuraImpressionTimeTracker.UNKNOWN_TIME);
    public static final BigDecimal A01 = BigDecimal.valueOf(2147483647L);
    public static final BigDecimal A04 = BigDecimal.valueOf(Long.MIN_VALUE);
    public static final BigDecimal A02 = BigDecimal.valueOf(LinkEncryptedPairingKt.LINK_COUNTER_MAX);

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj != null && (obj instanceof C9820GiE)) {
                BigDecimal bigDecimal = ((C9820GiE) obj)._value;
                BigDecimal bigDecimal2 = this._value;
                if (bigDecimal == null) {
                    if (bigDecimal2 == null) {
                    }
                } else if (bigDecimal2 != null && bigDecimal.compareTo(bigDecimal2) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        BigDecimal bigDecimal = this._value;
        if (bigDecimal == null) {
            return 0;
        }
        return AnonymousClass002.A0A(Double.doubleToLongBits(bigDecimal.doubleValue()));
    }

    public C9820GiE(BigDecimal bigDecimal) {
        this._value = bigDecimal;
    }
}
