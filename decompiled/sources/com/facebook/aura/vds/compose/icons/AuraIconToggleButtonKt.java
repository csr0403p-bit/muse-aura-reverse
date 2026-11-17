package com.facebook.aura.vds.compose.icons;

import X.AVy;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass011;
import X.B6A;
import X.BFM;
import X.BRg;
import X.C10G;
import X.C3U4;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1072AWd;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.ext.ColorExtKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraIconToggleButtonKt {
    public static final long IconToggleButtonCheckedBackgroundForDarkTheme;
    public static final long IconToggleButtonCheckedBackgroundForLightTheme;
    public static final long IconToggleButtonCheckedTintForDarkTheme;
    public static final long IconToggleButtonCheckedTintForLightTheme;

    /* renamed from: com.facebook.aura.vds.compose.icons.AuraIconToggleButtonKt$AuraIconToggleButton$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ AVy $painter;
        public final /* synthetic */ AuraIconToggleButtonSize $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraIconToggleButtonSize auraIconToggleButtonSize, AVy aVy) {
            super(3);
            this.$size = auraIconToggleButtonSize;
            this.$painter = aVy;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                AuraIconKt.m2569AuraIconInternalcf5BqRc(C3U4.A09(C10G.A07(BRg.A00, this.$size.m2572xe1bb7aa()), this.$size.m2571x1bcb9ba4()), this.$painter, ColorExtKt.m2544applyContentAlphaek8zF_U(AuraTheme.INSTANCE.getContentColor(bfm, 6), bfm, 0), null, bfm, AVy.$stable << 3, 8);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.icons.AuraIconToggleButtonKt$AuraIconToggleButton$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ String $contentDescription;
        public final /* synthetic */ String $contentDescriptionChecked;
        public final /* synthetic */ String $contentDescriptionUnchecked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;
        public final /* synthetic */ AVy $painter;
        public final /* synthetic */ AuraIconToggleButtonSize $size;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(BRg bRg, boolean z, String str, String str2, String str3, G0U<? super Boolean, Unit> g0u, AVy aVy, AuraIconToggleButtonSize auraIconToggleButtonSize, boolean z2, InterfaceC1072AWd interfaceC1072AWd, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$checked = z;
            this.$contentDescription = str;
            this.$contentDescriptionChecked = str2;
            this.$contentDescriptionUnchecked = str3;
            this.$onCheckedChange = g0u;
            this.$painter = aVy;
            this.$size = auraIconToggleButtonSize;
            this.$enabled = z2;
            this.$interactionSource = interfaceC1072AWd;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraIconToggleButtonKt.AuraIconToggleButton(this.$modifier, this.$checked, this.$contentDescription, this.$contentDescriptionChecked, this.$contentDescriptionUnchecked, this.$onCheckedChange, this.$painter, this.$size, this.$enabled, this.$interactionSource, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final long iconToggleButtonBackgroundColor(boolean z, boolean z2, BFM bfm, int i) {
        long j = z ? AnonymousClass003.A0c(bfm, 1761122329).isLight ? IconToggleButtonCheckedBackgroundForLightTheme : IconToggleButtonCheckedBackgroundForDarkTheme : AnonymousClass003.A0c(bfm, 1761322930).highlight;
        AnonymousClass002.A19(bfm);
        return ColorExtKt.m2545applyStateM3jwhU8(j, z2, B6A.A07, bfm, (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384);
    }

    public static final long iconToggleButtonContentColor(boolean z, boolean z2, BFM bfm, int i) {
        long j = z ? AnonymousClass003.A0c(bfm, -651219628).isLight ? IconToggleButtonCheckedTintForLightTheme : IconToggleButtonCheckedTintForDarkTheme : AnonymousClass003.A0c(bfm, -651030249).primaryIcon.enabled;
        AnonymousClass002.A19(bfm);
        return ColorExtKt.m2545applyStateM3jwhU8(j, z2, B6A.A07, bfm, (i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraIconToggleButton(X.BRg r38, boolean r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, X.G0U<? super java.lang.Boolean, kotlin.Unit> r43, X.AVy r44, com.facebook.aura.vds.compose.icons.AuraIconToggleButtonSize r45, boolean r46, X.InterfaceC1072AWd r47, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.icons.AuraIconToggleButtonKt.AuraIconToggleButton(X.BRg, boolean, java.lang.String, java.lang.String, java.lang.String, X.G0U, X.AVy, com.facebook.aura.vds.compose.icons.AuraIconToggleButtonSize, boolean, X.AWd, X.BFM, int, int):void");
    }

    static {
        long j = B6A.A01;
        IconToggleButtonCheckedTintForLightTheme = 4294309365L << 32;
        IconToggleButtonCheckedTintForDarkTheme = 4279308562L << 32;
        IconToggleButtonCheckedBackgroundForLightTheme = 4278519045L << 32;
        IconToggleButtonCheckedBackgroundForDarkTheme = 4294769916L << 32;
    }
}
