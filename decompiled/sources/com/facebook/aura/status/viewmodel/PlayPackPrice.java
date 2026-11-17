package com.facebook.aura.status.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.common.formatting.LocalizedFormattingKt$$ExternalSyntheticBackportWithForwarding0;
import java.math.BigDecimal;
import java.util.Currency;

/* loaded from: classes4.dex */
public final class PlayPackPrice extends C06G {
    public final int amountInHundredths;
    public final Currency currency;
    public final String playFormattedPrice;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PlayPackPrice) {
                PlayPackPrice playPackPrice = (PlayPackPrice) obj;
                if (!C7384Etj.areEqual(this.playFormattedPrice, playPackPrice.playFormattedPrice) || this.amountInHundredths != playPackPrice.amountInHundredths || !C7384Etj.areEqual(this.currency, playPackPrice.currency)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PlayPackPrice copy$default(PlayPackPrice playPackPrice, String str, int i, Currency currency, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = playPackPrice.playFormattedPrice;
        }
        if ((i2 & 2) != 0) {
            i = playPackPrice.amountInHundredths;
        }
        if ((i2 & 4) != 0) {
            currency = playPackPrice.currency;
        }
        return playPackPrice.copy(str, i, currency);
    }

    private final BigDecimal getMajorUnits() {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(this.amountInHundredths);
        C7384Etj.A0U(bigDecimalValueOf);
        BigDecimal bigDecimalMovePointLeft = bigDecimalValueOf.movePointLeft(2);
        C7384Etj.A0U(bigDecimalMovePointLeft);
        return bigDecimalMovePointLeft;
    }

    public final String component1() {
        return this.playFormattedPrice;
    }

    public final int component2() {
        return this.amountInHundredths;
    }

    public final Currency component3() {
        return this.currency;
    }

    public final String format() {
        if (this.currency.getDefaultFractionDigits() != 2 || this.amountInHundredths % 100 != 0) {
            return this.playFormattedPrice;
        }
        return AuraBuyCreditsViewModelKt.ZERO_CENTS_SUFFIX.A03(this.playFormattedPrice, "");
    }

    public final int getAmountInHundredths() {
        return this.amountInHundredths;
    }

    public final Currency getCurrency() {
        return this.currency;
    }

    public final String getPlayFormattedPrice() {
        return this.playFormattedPrice;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.currency, (AnonymousClass001.A0G(this.playFormattedPrice) + this.amountInHundredths) * 31);
    }

    public PlayPackPrice(String str, int i, Currency currency) {
        AnonymousClass003.A0v(str, currency);
        this.playFormattedPrice = str;
        this.amountInHundredths = i;
        this.currency = currency;
    }

    public final PlayPackPrice copy(String str, int i, Currency currency) {
        AnonymousClass003.A0v(str, currency);
        return new PlayPackPrice(str, i, currency);
    }

    public final String forAnalytics() {
        String plainString = LocalizedFormattingKt$$ExternalSyntheticBackportWithForwarding0.m(getMajorUnits()).toPlainString();
        C7384Etj.A0U(plainString);
        return plainString;
    }

    public String toString() {
        return super.toString();
    }
}
