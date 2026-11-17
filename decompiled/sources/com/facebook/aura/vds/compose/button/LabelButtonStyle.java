package com.facebook.aura.vds.compose.button;

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
import X.C0M7;
import X.C1822Arm;
import X.C1DG;
import X.C1DH;
import X.C1DM;
import X.C3TQ;
import X.C7384Etj;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class LabelButtonStyle extends C06G implements AuraLabelButtonStyle {
    public static final int $stable = 0;
    public final List<AuraButtonSize> allowedSizes;
    public final long backgroundColor;
    public final C1DM backgroundShapeOverride;
    public final long borderColor;
    public final long borderColorDisabled;
    public final long borderColorPressed;
    public final float buttonElevation;
    public final B6A buttonShadowColor;
    public final long contentColor;
    public final long contentColorDisabled;
    public final long contentColorPressed;
    public final AuraButtonCorner corner;
    public final boolean squareOnNoText;

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    public C1DM backgroundShape(AuraButtonSize auraButtonSize) {
        C7384Etj.A0Y(auraButtonSize, 0);
        C1DM c1dm = this.backgroundShapeOverride;
        return c1dm == null ? AuraButtonKt.toShape(this.corner, auraButtonSize) : c1dm;
    }

    /* renamed from: copy-h4cpyFU, reason: not valid java name */
    public final LabelButtonStyle m2447copyh4cpyFU(long j, long j2, long j3, long j4, long j5, long j6, long j7, AuraButtonCorner auraButtonCorner, C1DM c1dm, List<? extends AuraButtonSize> list, boolean z, float f, B6A b6a) {
        AnonymousClass002.A1F(auraButtonCorner, 7, list);
        return new LabelButtonStyle(j, j2, j3, j4, j5, j6, j7, auraButtonCorner, c1dm, list, z, f, b6a);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LabelButtonStyle) {
                LabelButtonStyle labelButtonStyle = (LabelButtonStyle) obj;
                long j = this.backgroundColor;
                long j2 = labelButtonStyle.backgroundColor;
                long j3 = B6A.A01;
                if (j != j2 || this.borderColor != labelButtonStyle.borderColor || this.borderColorPressed != labelButtonStyle.borderColorPressed || this.borderColorDisabled != labelButtonStyle.borderColorDisabled || this.contentColor != labelButtonStyle.contentColor || this.contentColorPressed != labelButtonStyle.contentColorPressed || this.contentColorDisabled != labelButtonStyle.contentColorDisabled || this.corner != labelButtonStyle.corner || !C7384Etj.areEqual(this.backgroundShapeOverride, labelButtonStyle.backgroundShapeOverride) || !C7384Etj.areEqual(this.allowedSizes, labelButtonStyle.allowedSizes) || this.squareOnNoText != labelButtonStyle.squareOnNoText || !C1DG.A08(this.buttonElevation, labelButtonStyle.buttonElevation) || !C7384Etj.areEqual(this.buttonShadowColor, labelButtonStyle.buttonShadowColor)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    public AuraIconSize iconSize(boolean z, boolean z2, AuraButtonSize auraButtonSize, BFM bfm, int i) {
        float f;
        C7384Etj.A0Y(auraButtonSize, 2);
        bfm.AgE(-37904176);
        if (!z || z2) {
            bfm.AgE(-2066169434);
            f = AuraButtonKt.toDimension(auraButtonSize, bfm, (i >> 6) & 14).iconAndTextSize;
        } else {
            bfm.AgE(-2066171329);
            f = AuraButtonKt.toDimension(auraButtonSize, bfm, (i >> 6) & 14).iconSize;
        }
        AuraIconSize auraIconSizeM2570auraIconSizeFromDp8Feqmps = AuraIconKt.m2570auraIconSizeFromDp8Feqmps(f, bfm, 0);
        AnonymousClass006.A1N(bfm);
        return auraIconSizeM2570auraIconSizeFromDp8Feqmps;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    /* renamed from: minSize-ccRj1GA */
    public float mo2430minSizeccRj1GA(AuraButtonSize auraButtonSize, BFM bfm, int i) {
        C7384Etj.A0Y(auraButtonSize, 0);
        bfm.AgE(-464642532);
        float f = AuraButtonKt.toDimension(auraButtonSize, bfm, i & 14).minSize;
        AnonymousClass001.A1D(bfm);
        return f;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    public C3TQ padding(boolean z, boolean z2, AuraButtonSize auraButtonSize, BFM bfm, int i) {
        C3TQ c3tq;
        C7384Etj.A0Y(auraButtonSize, 2);
        bfm.AgE(1618528171);
        if (!z) {
            bfm.AgE(-2024851260);
            c3tq = AuraButtonKt.toDimension(auraButtonSize, bfm, (i >> 6) & 14).defaultPadding;
        } else if (z2) {
            bfm.AgE(-2024911648);
            c3tq = AuraButtonKt.toDimension(auraButtonSize, bfm, (i >> 6) & 14).iconAndTextPadding;
        } else {
            bfm.AgE(-2024983289);
            c3tq = AuraButtonKt.toDimension(auraButtonSize, bfm, (i >> 6) & 14).iconPadding;
        }
        AnonymousClass006.A1M(bfm);
        return c3tq;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    public boolean sizeAllowed(AuraButtonSize auraButtonSize) {
        C7384Etj.A0Y(auraButtonSize, 0);
        return this.allowedSizes.contains(auraButtonSize);
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    /* renamed from: spacingBetweenIconAndText-ccRj1GA */
    public float mo2432spacingBetweenIconAndTextccRj1GA(AuraButtonSize auraButtonSize, BFM bfm, int i) {
        C7384Etj.A0Y(auraButtonSize, 0);
        bfm.AgE(1529061001);
        float f = AuraButtonKt.toDimension(auraButtonSize, bfm, i & 14).spacingBetweenIconAndText;
        AnonymousClass001.A1D(bfm);
        return f;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    public C1822Arm textStyle(AuraButtonSize auraButtonSize, BFM bfm, int i) {
        C1822Arm c1822Arm;
        int i2;
        C7384Etj.A0Y(auraButtonSize, 0);
        int iA0B = AnonymousClass005.A0B(bfm, auraButtonSize, 421734357);
        if (iA0B != 0) {
            if (iA0B != 1) {
                i2 = 1559799519;
                if (iA0B != 2) {
                    AnonymousClass004.A1A(bfm, 1559793234);
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                i2 = 1559797471;
            }
            c1822Arm = AnonymousClass006.A0k(bfm, i2).bodyMedium;
        } else {
            c1822Arm = AnonymousClass006.A0k(bfm, 1559795174).subheadlineMedium;
        }
        AnonymousClass006.A1M(bfm);
        return c1822Arm;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraButtonSize.values().length];
            try {
                AnonymousClass002.A13(AuraButtonSize.SMALL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraButtonSize.MEDIUM, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraButtonSize.LARGE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ LabelButtonStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, AuraButtonCorner auraButtonCorner, C1DM c1dm, List list, boolean z, float f, B6A b6a, int i, C06H c06h) {
        this(j, j2, (i & 4) != 0 ? j2 : j3, C06G.A05(j2, j4, i & 8), j5, j6, C06G.A05(j5, j7, i & 64), (i & 128) != 0 ? AuraButtonCorner.PILL : auraButtonCorner, (i & 256) != 0 ? null : c1dm, list, (i & 1024) != 0 ? false : z, (i & 2048) != 0 ? 0.0f : f, (i & 4096) != 0 ? null : b6a);
    }

    /* renamed from: component1-0d7_KjU, reason: not valid java name */
    private final long m2437component10d7_KjU() {
        return this.backgroundColor;
    }

    private final List<AuraButtonSize> component10() {
        return this.allowedSizes;
    }

    private final boolean component11() {
        return this.squareOnNoText;
    }

    /* renamed from: component12-D9Ej5fM, reason: not valid java name */
    private final float m2438component12D9Ej5fM() {
        return this.buttonElevation;
    }

    /* renamed from: component13-QN2ZGVo, reason: not valid java name */
    private final B6A m2439component13QN2ZGVo() {
        return this.buttonShadowColor;
    }

    /* renamed from: component2-0d7_KjU, reason: not valid java name */
    private final long m2440component20d7_KjU() {
        return this.borderColor;
    }

    /* renamed from: component3-0d7_KjU, reason: not valid java name */
    private final long m2441component30d7_KjU() {
        return this.borderColorPressed;
    }

    /* renamed from: component4-0d7_KjU, reason: not valid java name */
    private final long m2442component40d7_KjU() {
        return this.borderColorDisabled;
    }

    /* renamed from: component5-0d7_KjU, reason: not valid java name */
    private final long m2443component50d7_KjU() {
        return this.contentColor;
    }

    /* renamed from: component6-0d7_KjU, reason: not valid java name */
    private final long m2444component60d7_KjU() {
        return this.contentColorPressed;
    }

    /* renamed from: component7-0d7_KjU, reason: not valid java name */
    private final long m2445component70d7_KjU() {
        return this.contentColorDisabled;
    }

    private final AuraButtonCorner component8() {
        return this.corner;
    }

    private final C1DM component9() {
        return this.backgroundShapeOverride;
    }

    /* renamed from: copy-h4cpyFU$default, reason: not valid java name */
    public static /* synthetic */ LabelButtonStyle m2446copyh4cpyFU$default(LabelButtonStyle labelButtonStyle, long j, long j2, long j3, long j4, long j5, long j6, long j7, AuraButtonCorner auraButtonCorner, C1DM c1dm, List list, boolean z, float f, B6A b6a, int i, Object obj) {
        long j8 = j;
        long j9 = j2;
        long j10 = j3;
        long j11 = j4;
        long j12 = j5;
        long j13 = j6;
        long j14 = j7;
        C1DM c1dm2 = c1dm;
        boolean z2 = z;
        float f2 = f;
        AuraButtonCorner auraButtonCorner2 = auraButtonCorner;
        List list2 = list;
        B6A b6a2 = b6a;
        if ((i & 1) != 0) {
            j8 = labelButtonStyle.backgroundColor;
        }
        if ((i & 2) != 0) {
            j9 = labelButtonStyle.borderColor;
        }
        if ((i & 4) != 0) {
            j10 = labelButtonStyle.borderColorPressed;
        }
        if ((i & 8) != 0) {
            j11 = labelButtonStyle.borderColorDisabled;
        }
        if ((i & 16) != 0) {
            j12 = labelButtonStyle.contentColor;
        }
        if ((i & 32) != 0) {
            j13 = labelButtonStyle.contentColorPressed;
        }
        if ((i & 64) != 0) {
            j14 = labelButtonStyle.contentColorDisabled;
        }
        if ((i & 128) != 0) {
            auraButtonCorner2 = labelButtonStyle.corner;
        }
        if ((i & 256) != 0) {
            c1dm2 = labelButtonStyle.backgroundShapeOverride;
        }
        if ((i & 512) != 0) {
            list2 = labelButtonStyle.allowedSizes;
        }
        if ((i & 1024) != 0) {
            z2 = labelButtonStyle.squareOnNoText;
        }
        if ((i & 2048) != 0) {
            f2 = labelButtonStyle.buttonElevation;
        }
        if ((i & 4096) != 0) {
            b6a2 = labelButtonStyle.buttonShadowColor;
        }
        return labelButtonStyle.m2447copyh4cpyFU(j8, j9, j10, j11, j12, j13, j14, auraButtonCorner2, c1dm2, list2, z2, f2, b6a2);
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    /* renamed from: backgroundColor-0d7_KjU */
    public long mo2427backgroundColor0d7_KjU() {
        return this.backgroundColor;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    public C1DH borderStroke(boolean z, boolean z2) {
        long j = z2 ? this.borderColorPressed : z ? this.borderColor : this.borderColorDisabled;
        if (j == B6A.A07) {
            return null;
        }
        return C0M7.A00(1.0f, j);
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    /* renamed from: elevation-D9Ej5fM */
    public float mo2429elevationD9Ej5fM() {
        return this.buttonElevation;
    }

    public int hashCode() {
        long j = this.backgroundColor;
        long j2 = B6A.A01;
        int i = 0;
        int iA02 = AnonymousClass005.A02(C0KA.A01(AnonymousClass005.A0F(this.allowedSizes, (AnonymousClass005.A0F(this.corner, AnonymousClass006.A06(this.contentColorDisabled, AnonymousClass006.A06(this.contentColorPressed, AnonymousClass006.A06(this.contentColor, AnonymousClass006.A06(this.borderColorDisabled, AnonymousClass006.A06(this.borderColorPressed, AnonymousClass006.A06(this.borderColor, AnonymousClass005.A07(j)))))))) + AnonymousClass006.A0D(this.backgroundShapeOverride)) * 31), this.squareOnNoText), this.buttonElevation);
        B6A b6a = this.buttonShadowColor;
        if (b6a != null) {
            long j3 = b6a.A00;
            i = (int) (j3 ^ (j3 >>> 32));
        }
        return iA02 + i;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    /* renamed from: contentColor-wmQWz5c */
    public long mo2428contentColorwmQWz5c(boolean z, boolean z2, BFM bfm, int i) {
        bfm.AgE(-266688182);
        long j = z2 ? this.contentColorPressed : z ? this.contentColor : this.contentColorDisabled;
        AnonymousClass002.A19(bfm);
        return j;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    /* renamed from: shadowColor-6MYuD4A */
    public B6A mo2431shadowColor6MYuD4A(BFM bfm, int i) {
        bfm.AgE(-1777370261);
        B6A b6a = this.buttonShadowColor;
        AnonymousClass002.A19(bfm);
        return b6a;
    }

    @Override // com.facebook.aura.vds.compose.button.AuraLabelButtonStyle
    public boolean squareAspectRation(boolean z, BFM bfm, int i) {
        bfm.AgE(148378419);
        boolean z2 = false;
        if (this.squareOnNoText && !z) {
            z2 = true;
        }
        AnonymousClass002.A19(bfm);
        return z2;
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LabelButtonStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, AuraButtonCorner auraButtonCorner, C1DM c1dm, List<? extends AuraButtonSize> list, boolean z, float f, B6A b6a) {
        AnonymousClass002.A1F(auraButtonCorner, 7, list);
        this.backgroundColor = j;
        this.borderColor = j2;
        this.borderColorPressed = j3;
        this.borderColorDisabled = j4;
        this.contentColor = j5;
        this.contentColorPressed = j6;
        this.contentColorDisabled = j7;
        this.corner = auraButtonCorner;
        this.backgroundShapeOverride = c1dm;
        this.allowedSizes = list;
        this.squareOnNoText = z;
        this.buttonElevation = f;
        this.buttonShadowColor = b6a;
    }

    public /* synthetic */ LabelButtonStyle(long j, long j2, long j3, long j4, long j5, long j6, long j7, AuraButtonCorner auraButtonCorner, C1DM c1dm, List list, boolean z, float f, B6A b6a, C06H c06h) {
        this(j, j2, j3, j4, j5, j6, j7, auraButtonCorner, c1dm, list, z, f, b6a);
    }
}
