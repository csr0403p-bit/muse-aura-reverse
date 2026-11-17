package X;

import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.common.stringformat.StringFormatUtil;

/* renamed from: X.BXp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC2383BXp {
    public static final double A00(long j) {
        if (j < 0 || j > LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            throw new IllegalArgumentException(StringFormatUtil.formatStrLocaleSafe("Invalid input: %d", Long.valueOf(j)));
        }
        return j / 1000.0d;
    }
}
