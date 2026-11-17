package com.facebook.aura.vds.compose.text.richtext;

import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C1810ArU;
import X.C1822Arm;
import X.C19U;
import X.C7384Etj;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraTypography;

/* loaded from: classes4.dex */
public final class AuraSpanStyles extends C06G {
    public static final int $stable = 0;
    public final C1822Arm blockQuote;
    public final C1822Arm body;
    public final C1822Arm heading1;
    public final C1822Arm heading2;
    public final C1822Arm heading3;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraSpanStyles) {
                AuraSpanStyles auraSpanStyles = (AuraSpanStyles) obj;
                if (!C7384Etj.areEqual(this.blockQuote, auraSpanStyles.blockQuote) || !C7384Etj.areEqual(this.heading1, auraSpanStyles.heading1) || !C7384Etj.areEqual(this.heading2, auraSpanStyles.heading2) || !C7384Etj.areEqual(this.heading3, auraSpanStyles.heading3) || !C7384Etj.areEqual(this.body, auraSpanStyles.body)) {
                }
            }
            return false;
        }
        return true;
    }

    public /* synthetic */ AuraSpanStyles(C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, C1822Arm c1822Arm4, C1822Arm c1822Arm5, int i, C06H c06h) {
        this(c1822Arm, c1822Arm2, c1822Arm3, c1822Arm4, (i & 16) != 0 ? null : c1822Arm5);
    }

    public static /* synthetic */ AuraSpanStyles copy$default(AuraSpanStyles auraSpanStyles, C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, C1822Arm c1822Arm4, C1822Arm c1822Arm5, int i, Object obj) {
        if ((i & 1) != 0) {
            c1822Arm = auraSpanStyles.blockQuote;
        }
        if ((i & 2) != 0) {
            c1822Arm2 = auraSpanStyles.heading1;
        }
        if ((i & 4) != 0) {
            c1822Arm3 = auraSpanStyles.heading2;
        }
        if ((i & 8) != 0) {
            c1822Arm4 = auraSpanStyles.heading3;
        }
        if ((i & 16) != 0) {
            c1822Arm5 = auraSpanStyles.body;
        }
        return auraSpanStyles.copy(c1822Arm, c1822Arm2, c1822Arm3, c1822Arm4, c1822Arm5);
    }

    public final C1822Arm component1() {
        return this.blockQuote;
    }

    public final C1822Arm component2() {
        return this.heading1;
    }

    public final C1822Arm component3() {
        return this.heading2;
    }

    public final C1822Arm component4() {
        return this.heading3;
    }

    public final C1822Arm component5() {
        return this.body;
    }

    public final C1822Arm getBlockQuote() {
        return this.blockQuote;
    }

    public final C1822Arm getBody() {
        return this.body;
    }

    public final C1822Arm getHeading1() {
        return this.heading1;
    }

    public final C1822Arm getHeading2() {
        return this.heading2;
    }

    public final C1822Arm getHeading3() {
        return this.heading3;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.heading3, AnonymousClass005.A0F(this.heading2, AnonymousClass005.A0F(this.heading1, AnonymousClass005.A0E(this.blockQuote)))) + AnonymousClass006.A0D(this.body);
    }

    public final AuraSpanStyles copy(C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, C1822Arm c1822Arm4, C1822Arm c1822Arm5) {
        AnonymousClass005.A14(c1822Arm, c1822Arm2, c1822Arm3, c1822Arm4);
        return new AuraSpanStyles(c1822Arm, c1822Arm2, c1822Arm3, c1822Arm4, c1822Arm5);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AuraSpanStyles(AuraColors auraColors, AuraTypography auraTypography, boolean z, boolean z2) {
        C1822Arm c1822ArmA00;
        C1822Arm c1822ArmHeading2;
        C1822Arm c1822ArmHeading3;
        boolean zA1b = AnonymousClass004.A1b(auraColors, auraTypography);
        C1822Arm c1822Arm = auraTypography.subheadlineRegular;
        long j = auraColors.secondaryText;
        C1810ArU c1810ArU = C1810ArU.A02;
        C1822Arm c1822ArmA002 = C1822Arm.A00(null, c1822Arm, null, null, null, null, null, new C1810ArU(C19U.A03(12), C19U.A03(12)), null, null, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, 16515070, j, 0L, 0L, 0L);
        if (z) {
            c1822ArmA00 = auraTypography.subheadlineMedium;
        } else if (z2) {
            c1822ArmA00 = AuraResponseTextStylingV2.INSTANCE.heading1(auraTypography.subheadlineRegular);
        } else {
            C1822Arm c1822Arm2 = auraTypography.title3Regular;
            long jA03 = C19U.A03(28);
            long jA032 = C19U.A03(36);
            c1822ArmA00 = C1822Arm.A00(null, c1822Arm2, null, null, null, null, null, null, null, null, zA1b ? 1 : 0, zA1b ? 1 : 0, zA1b ? 1 : 0, 16646013, 0L, jA03, C19U.A01(-0.12d), jA032);
        }
        if (z) {
            c1822ArmHeading2 = auraTypography.subheadlineMedium;
        } else {
            if (z2) {
                AuraResponseTextStylingV2 auraResponseTextStylingV2 = AuraResponseTextStylingV2.INSTANCE;
                c1822ArmHeading2 = auraResponseTextStylingV2.heading2(auraTypography.subheadlineRegular);
                c1822ArmHeading3 = auraResponseTextStylingV2.heading3(auraTypography.subheadlineRegular);
                this(c1822ArmA002, c1822ArmA00, c1822ArmHeading2, c1822ArmHeading3, AuraResponseTextStylingV2.INSTANCE.body(auraTypography.subheadlineRegular));
            }
            c1822ArmHeading2 = auraTypography.title3Regular;
        }
        c1822ArmHeading3 = auraTypography.subheadlineMedium;
        this(c1822ArmA002, c1822ArmA00, c1822ArmHeading2, c1822ArmHeading3, AuraResponseTextStylingV2.INSTANCE.body(auraTypography.subheadlineRegular));
    }

    public AuraSpanStyles(C1822Arm c1822Arm, C1822Arm c1822Arm2, C1822Arm c1822Arm3, C1822Arm c1822Arm4, C1822Arm c1822Arm5) {
        AnonymousClass005.A14(c1822Arm, c1822Arm2, c1822Arm3, c1822Arm4);
        this.blockQuote = c1822Arm;
        this.heading1 = c1822Arm2;
        this.heading2 = c1822Arm3;
        this.heading3 = c1822Arm4;
        this.body = c1822Arm5;
    }

    public /* synthetic */ AuraSpanStyles(AuraColors auraColors, AuraTypography auraTypography, boolean z, boolean z2, int i, C06H c06h) {
        this(auraColors, auraTypography, AnonymousClass005.A1O(i, z), (i & 8) != 0 ? true : z2);
    }
}
