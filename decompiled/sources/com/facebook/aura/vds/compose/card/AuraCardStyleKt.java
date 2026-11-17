package com.facebook.aura.vds.compose.card;

import X.C1DP;
import X.C3TQ;
import X.C3U4;
import X.EnumC1820Arj;
import com.facebook.aura.vds.compose.theme.AuraCardDimensions;

/* loaded from: classes.dex */
public abstract class AuraCardStyleKt {
    /* renamed from: withVerticalPadding-lG28NQ4, reason: not valid java name */
    public static final C3TQ m2496withVerticalPaddinglG28NQ4(C3TQ c3tq, float f, EnumC1820Arj enumC1820Arj) {
        return new C1DP(C3U4.A01(c3tq, enumC1820Arj), f, C3U4.A00(c3tq, enumC1820Arj), f);
    }

    /* renamed from: withVerticalPadding-lG28NQ4, reason: not valid java name */
    public static final AuraCardDimensions m2497withVerticalPaddinglG28NQ4(AuraCardDimensions auraCardDimensions, float f, EnumC1820Arj enumC1820Arj) {
        return auraCardDimensions.m2660copyXG1SiQA(m2496withVerticalPaddinglG28NQ4(auraCardDimensions.contentPadding, f, enumC1820Arj), m2496withVerticalPaddinglG28NQ4(auraCardDimensions.contentPaddingNoStartItem, f, enumC1820Arj), auraCardDimensions.trailingItemPadding, auraCardDimensions.backgroundBorderWidth, auraCardDimensions.minHeight);
    }
}
