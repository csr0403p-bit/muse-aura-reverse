package com.facebook.aura.common.formatting;

import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class LocalizedFormattingKt$$ExternalSyntheticBackportWithForwarding0 {
    public static /* synthetic */ BigDecimal m(BigDecimal bigDecimal) {
        return bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
    }
}
