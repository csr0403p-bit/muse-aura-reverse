package com.facebook.aura.vds.compose.contextmenu;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C10G;
import X.C1822Arm;
import X.C3U4;
import X.G0V;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraContextMenuItemContentKt {
    public static final float MenuItemDefaultMaxHeight = 68.0f;
    public static final float MenuItemDefaultMaxWidth = 372.0f;
    public static final float MenuItemDefaultMinHeight = 44.0f;
    public static final float MenuItemDefaultMinWidth = 128.0f;

    /* renamed from: com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItemContentKt$AuraContextMenuStaticTextContent$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ int $maxLines;
        public final /* synthetic */ AuraContextMenuStyle $menuStyle;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, AuraContextMenuStyle auraContextMenuStyle, BRg bRg, int i, int i2, int i3) {
            super(2);
            this.$label = str;
            this.$menuStyle = auraContextMenuStyle;
            this.$modifier = bRg;
            this.$maxLines = i;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraContextMenuItemContentKt.AuraContextMenuStaticTextContent(this.$label, this.$menuStyle, this.$modifier, this.$maxLines, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AuraContextMenuStyle.values().length];
            try {
                AnonymousClass002.A13(AuraContextMenuStyle.OnMedia, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AuraContextMenuStyle.OnMediaTranslucent, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AuraContextMenuStyle.Default, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1  */
    /* renamed from: AuraContextMenuItemContent-yQUhCh4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2516AuraContextMenuItemContentyQUhCh4(java.lang.String r55, com.facebook.aura.vds.compose.contextmenu.AuraContextMenuStyle r56, X.BRg r57, java.lang.String r58, int r59, int r60, X.AVy r61, X.B6A r62, X.AVy r63, kotlin.jvm.functions.Function0<kotlin.Unit> r64, boolean r65, boolean r66, boolean r67, X.BFM r68, int r69, int r70, int r71) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItemContentKt.m2516AuraContextMenuItemContentyQUhCh4(java.lang.String, com.facebook.aura.vds.compose.contextmenu.AuraContextMenuStyle, X.BRg, java.lang.String, int, int, X.AVy, X.B6A, X.AVy, kotlin.jvm.functions.Function0, boolean, boolean, boolean, X.BFM, int, int, int):void");
    }

    public static final void AuraContextMenuStaticTextContent(String str, AuraContextMenuStyle auraContextMenuStyle, BRg bRg, int i, BFM bfm, int i2, int i3) {
        int i4 = i;
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, auraContextMenuStyle);
        bfm.AgG(1804596304);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass005.A09(bfm, auraContextMenuStyle);
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i6 = i3 & 8;
        if (i6 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, i4);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            if (i6 != 0) {
                i4 = 1;
            }
            long menuItemColor = getMenuItemColor(zA1b, auraContextMenuStyle, zA1b, bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 390);
            C1822Arm c1822ArmA0Y = C06G.A0Y(bfm);
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0B(AnonymousClass001.A0R(C10G.A0F(bRg2, MenuItemDefaultMinWidth, Float.NaN, MenuItemDefaultMaxWidth, Float.NaN)), 16.0f, 11.0f), menuItemColor, c1822ArmA0Y, null, null, null, zA1b, zA1b ? 1 : 0, i4, 2, null, null, null, bfm, AnonymousClass001.A06(iA0d << 18, iA0d & 14), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, auraContextMenuStyle, bRg2, i4, i2, i3);
        }
    }

    /* renamed from: LabelComponent-sW7UJKQ, reason: not valid java name */
    public static final void m2517LabelComponentsW7UJKQ(String str, long j, BRg bRg, int i, BFM bfm, int i2, int i3) {
        int i4 = i;
        bfm.AgG(1386561041);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i2 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0d |= AnonymousClass007.A06(bfm, i4);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i5 != 0) {
                i4 = 1;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, bRg, j, C06G.A0Z(bfm), null, null, null, false, 0, i4, 2, null, null, null, bfm, AnonymousClass001.A06(iA0d << 18, (iA0d & 14) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | ((iA0d << 3) & 896)), 6, 14832);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AuraContextMenuItemContentKt$LabelComponent$1(str, j, bRg, i4, i2, i3);
        }
    }

    public static final long getMenuItemColor(boolean z, AuraContextMenuStyle auraContextMenuStyle, boolean z2, BFM bfm, int i) {
        AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
        if (z2) {
            return auraColorsA0c.destructiveIcon.enabled;
        }
        int iOrdinal = auraContextMenuStyle.ordinal();
        if (iOrdinal == 1 || iOrdinal == 2) {
            return auraColorsA0c.onMedia;
        }
        if (iOrdinal == 0) {
            return z ? auraColorsA0c.primaryText : auraColorsA0c.secondaryText;
        }
        throw new NoWhenBranchMatchedException();
    }
}
