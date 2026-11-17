package com.facebook.aura.vds.compose.card;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B6A;
import X.BFM;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C1AC;
import X.C1DG;
import X.C1DH;
import X.C1EQ;
import X.C2VU;
import X.C3TQ;
import X.C7384Etj;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyle;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;

/* loaded from: classes.dex */
public final class AuraCardStyleInstance extends C06G implements AuraCardStyle {
    public final long backgroundColor;
    public final boolean buttonModeInverted;
    public final AuraButtonStyle buttonStyle;
    public final boolean buttonStyleOverrideAllowed;
    public final C3TQ contentPaddingNoStartItem;
    public final C3TQ contentPaddingValues;
    public final boolean isLight;
    public final C1AC leadingAlignmentOverride;
    public final C1DG minHeight;
    public final C3TQ trailingItemPaddingValues;

    /* renamed from: copy-pEFIigM, reason: not valid java name */
    public final AuraCardStyleInstance m2494copypEFIigM(boolean z, long j, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonStyle auraButtonStyle, boolean z2, boolean z3, C1AC c1ac, C1DG c1dg) {
        AnonymousClass005.A16(c3tq, c3tq2, c3tq3, auraButtonStyle, 2);
        return new AuraCardStyleInstance(z, j, c3tq, c3tq2, c3tq3, auraButtonStyle, z2, z3, c1ac, c1dg);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraCardStyleInstance) {
                AuraCardStyleInstance auraCardStyleInstance = (AuraCardStyleInstance) obj;
                if (this.isLight == auraCardStyleInstance.isLight) {
                    long j = this.backgroundColor;
                    long j2 = auraCardStyleInstance.backgroundColor;
                    long j3 = B6A.A01;
                    if (j != j2 || !C7384Etj.areEqual(this.contentPaddingValues, auraCardStyleInstance.contentPaddingValues) || !C7384Etj.areEqual(this.contentPaddingNoStartItem, auraCardStyleInstance.contentPaddingNoStartItem) || !C7384Etj.areEqual(this.trailingItemPaddingValues, auraCardStyleInstance.trailingItemPaddingValues) || this.buttonStyle != auraCardStyleInstance.buttonStyle || this.buttonModeInverted != auraCardStyleInstance.buttonModeInverted || this.buttonStyleOverrideAllowed != auraCardStyleInstance.buttonStyleOverrideAllowed || !C7384Etj.areEqual(this.leadingAlignmentOverride, auraCardStyleInstance.leadingAlignmentOverride) || !C7384Etj.areEqual(this.minHeight, auraCardStyleInstance.minHeight)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final boolean component1() {
        return this.isLight;
    }

    /* renamed from: component10-lTKBWiU, reason: not valid java name */
    private final C1DG m2490component10lTKBWiU() {
        return this.minHeight;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    private final long m2491component20d7_KjU() {
        return this.backgroundColor;
    }

    private final C3TQ component3() {
        return this.contentPaddingValues;
    }

    private final C3TQ component4() {
        return this.contentPaddingNoStartItem;
    }

    private final C3TQ component5() {
        return this.trailingItemPaddingValues;
    }

    private final AuraButtonStyle component6() {
        return this.buttonStyle;
    }

    private final boolean component7() {
        return this.buttonModeInverted;
    }

    private final boolean component8() {
        return this.buttonStyleOverrideAllowed;
    }

    private final C1AC component9() {
        return this.leadingAlignmentOverride;
    }

    /* renamed from: copy-pEFIigM$default, reason: not valid java name */
    public static /* synthetic */ AuraCardStyleInstance m2492copypEFIigM$default(AuraCardStyleInstance auraCardStyleInstance, boolean z, long j, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonStyle auraButtonStyle, boolean z2, boolean z3, C1AC c1ac, C1DG c1dg, int i, Object obj) {
        if ((i & 1) != 0) {
            z = auraCardStyleInstance.isLight;
        }
        if ((i & 2) != 0) {
            j = auraCardStyleInstance.backgroundColor;
        }
        if ((i & 4) != 0) {
            c3tq = auraCardStyleInstance.contentPaddingValues;
        }
        if ((i & 8) != 0) {
            c3tq2 = auraCardStyleInstance.contentPaddingNoStartItem;
        }
        if ((i & 16) != 0) {
            c3tq3 = auraCardStyleInstance.trailingItemPaddingValues;
        }
        if ((i & 32) != 0) {
            auraButtonStyle = auraCardStyleInstance.buttonStyle;
        }
        if ((i & 64) != 0) {
            z2 = auraCardStyleInstance.buttonModeInverted;
        }
        if ((i & 128) != 0) {
            z3 = auraCardStyleInstance.buttonStyleOverrideAllowed;
        }
        if ((i & 256) != 0) {
            c1ac = auraCardStyleInstance.leadingAlignmentOverride;
        }
        if ((i & 512) != 0) {
            c1dg = auraCardStyleInstance.minHeight;
        }
        return auraCardStyleInstance.m2494copypEFIigM(z, j, c3tq, c3tq2, c3tq3, auraButtonStyle, z2, z3, c1ac, c1dg);
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public C1EQ backgroundBrush() {
        return null;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public boolean buttonModeInverted() {
        return this.buttonModeInverted;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public boolean buttonStyleOverrideAllowed() {
        return this.buttonStyleOverrideAllowed;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public C3TQ contentPaddingValues(boolean z) {
        return z ? this.contentPaddingValues : this.contentPaddingNoStartItem;
    }

    public int hashCode() {
        int iA02 = C0KA.A02(this.isLight);
        long j = this.backgroundColor;
        long j2 = B6A.A01;
        int iA01 = (C0KA.A01(C0KA.A01(AnonymousClass005.A0F(this.buttonStyle, AnonymousClass005.A0F(this.trailingItemPaddingValues, AnonymousClass005.A0F(this.contentPaddingNoStartItem, AnonymousClass005.A0F(this.contentPaddingValues, AnonymousClass006.A06(j, iA02))))), this.buttonModeInverted), this.buttonStyleOverrideAllowed) + AnonymousClass006.A0D(this.leadingAlignmentOverride)) * 31;
        C1DG c1dg = this.minHeight;
        return iA01 + (c1dg != null ? Float.floatToIntBits(c1dg.A00) : 0);
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public AuraThemeMode isLight() {
        return this.isLight ? AuraThemeMode.LIGHT : AuraThemeMode.DARK;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public C1AC leadingAlignment() {
        C1AC c1ac = this.leadingAlignmentOverride;
        return c1ac == null ? C2VU.A05 : c1ac;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    /* renamed from: minHeight-lTKBWiU */
    public C1DG mo2489minHeightlTKBWiU() {
        return this.minHeight;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public C3TQ trailingItemPaddingValues() {
        return this.trailingItemPaddingValues;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    /* renamed from: backgroundColor-8tov2TA */
    public /* bridge */ /* synthetic */ B6A mo2488backgroundColor8tov2TA(boolean z, BFM bfm, int i) {
        return new B6A(m2493backgroundColorXeAY9LY(z, bfm, i));
    }

    /* renamed from: backgroundColor-XeAY9LY, reason: not valid java name */
    public long m2493backgroundColorXeAY9LY(boolean z, BFM bfm, int i) {
        bfm.AgE(721311712);
        long j = this.backgroundColor;
        long jM2545applyStateM3jwhU8 = ColorExtKt.m2545applyStateM3jwhU8(j, z, j, bfm, (i << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX);
        AnonymousClass002.A19(bfm);
        return jM2545applyStateM3jwhU8;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public C1DH borderStroke(boolean z, BFM bfm, int i) {
        AnonymousClass004.A1A(bfm, 1656300902);
        return null;
    }

    @Override // com.facebook.aura.vds.compose.card.AuraCardStyle
    public AuraLabelButtonStyle buttonStyle(BFM bfm, int i) {
        bfm.AgE(-923606303);
        AuraLabelButtonStyle style = AuraButtonKt.toStyle(this.buttonStyle, null, bfm, 0, 1);
        AnonymousClass001.A1D(bfm);
        return style;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AuraCardStyleInstance(boolean z, long j, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonStyle auraButtonStyle, boolean z2, boolean z3, C1AC c1ac, C1DG c1dg, C06H c06h) {
        this(z, j, c3tq, c3tq2, c3tq3, auraButtonStyle, z2, z3, c1ac, c1dg);
    }

    public /* synthetic */ AuraCardStyleInstance(boolean z, long j, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonStyle auraButtonStyle, boolean z2, boolean z3, C1AC c1ac, C1DG c1dg, int i, C06H c06h) {
        this(z, j, c3tq, c3tq2, c3tq3, auraButtonStyle, z2, z3, (i & 256) != 0 ? null : c1ac, (i & 512) != 0 ? null : c1dg);
    }

    public AuraCardStyleInstance(boolean z, long j, C3TQ c3tq, C3TQ c3tq2, C3TQ c3tq3, AuraButtonStyle auraButtonStyle, boolean z2, boolean z3, C1AC c1ac, C1DG c1dg) {
        AnonymousClass005.A16(c3tq, c3tq2, c3tq3, auraButtonStyle, 2);
        this.isLight = z;
        this.backgroundColor = j;
        this.contentPaddingValues = c3tq;
        this.contentPaddingNoStartItem = c3tq2;
        this.trailingItemPaddingValues = c3tq3;
        this.buttonStyle = auraButtonStyle;
        this.buttonModeInverted = z2;
        this.buttonStyleOverrideAllowed = z3;
        this.leadingAlignmentOverride = c1ac;
        this.minHeight = c1dg;
    }
}
