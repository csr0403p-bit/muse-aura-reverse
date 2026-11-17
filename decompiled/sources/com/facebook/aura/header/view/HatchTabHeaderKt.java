package com.facebook.aura.header.view;

import X.AKQ;
import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0wg;
import X.C1515AkP;
import X.C1736ApY;
import X.C1822Arm;
import X.C19U;
import X.C1DG;
import X.C1OP;
import X.C1YL;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.avatarsize.HatchAvatarSize;
import com.facebook.aura.avatarsize.HatchAvatarSizeKt;
import com.facebook.aura.avatarsize.HatchAvatarSizeRepositoryKt;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchTabHeaderKt {
    public static final float StatusPillScrimHeightMultiplier = 1.2f;
    public static final int StatusPillTopPadding = 14;

    /* renamed from: com.facebook.aura.header.view.HatchTabHeaderKt$HatchHeaderTitleWithSubtitle$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ C1822Arm $titleStyle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, String str2, C1822Arm c1822Arm, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$titleStyle = c1822Arm;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTabHeaderKt.HatchHeaderTitleWithSubtitle(this.$title, this.$subtitle, this.$titleStyle, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchTabHeaderKt$HatchTabHeaderLeadingButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HeaderLeadingButton $button;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HeaderLeadingButton headerLeadingButton, Function0<Unit> function0, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$button = headerLeadingButton;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$enabled = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTabHeaderKt.HatchTabHeaderLeadingButton(this.$button, this.$onClick, this.$modifier, this.$enabled, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchTabHeaderKt$HatchTabHeaderTitle$1, reason: invalid class name and case insensitive filesystem */
    public final class C121961 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isCentered;
        public final /* synthetic */ boolean $isCompact;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C121961(String str, String str2, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$isCompact = z;
            this.$isCentered = z2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTabHeaderKt.HatchTabHeaderTitle(this.$title, this.$subtitle, this.$isCompact, this.$isCentered, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchHeaderTitleWithSubtitle(String str, String str2, C1822Arm c1822Arm, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1040770416);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, c1822Arm);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), c1822Arm, null, null, null, false, 0, 1, 2, null, null, null, bfm, (iA0d & 14) | 805306368 | ((iA0d << 3) & 7168), 6, 14834);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A08(bfm), C06G.A0Y(bfm), null, null, null, false, 0, 1, 2, null, null, null, bfm, ((iA0d >> 3) & 14) | 805306368, 6, 14834);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, c1822Arm, bRg2, i, i2);
        }
    }

    public static final void HatchTabHeaderLeadingButton(HeaderLeadingButton headerLeadingButton, Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        bfm.AgG(59287400);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, headerLeadingButton) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA08 |= 3072;
        } else if ((i & 3072) == 0) {
            iA08 |= AnonymousClass004.A0q(bfm, z2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 1171, 1170), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (headerLeadingButton == HeaderLeadingButton.SidePanel) {
                bfm.AgE(999581051);
                C01N.A0A(bfm, bRg2, HeaderButtonKt.PillIconTouchTarget);
            } else {
                bfm.AgE(999653901);
                HatchHeaderLeadingButtonKt.HatchHeaderLeadingButton(headerLeadingButton, function0, AbstractC07539Wl.A00(HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(bRg2, false, bfm, (iA08 >> 6) & 14, 1), headerLeadingButton.getTestTagId$fbandroid_express_aura_java_com_facebook_aura_header_view_view()), z2, bfm, iA08 & 7294, 0);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(headerLeadingButton, function0, bRg2, z2, i, i2);
        }
    }

    public static final void HatchTabHeaderTitle(String str, String str2, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(637650207);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1822Arm c1822ArmA00 = z ? C1822Arm.A00(null, AnonymousClass006.A0k(bfm, -402835534).bodyEmphasized, null, null, C1736ApY.A03, null, null, null, null, null, 0, 0, 0, 16646139, 0L, 0L, 0L, C19U.A03(24)) : AnonymousClass006.A0k(bfm, -402688532).title1Emphasized;
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            if (str2 != null) {
                bfm.AgE(-402605483);
                HatchHeaderTitleWithSubtitle(str, str2, c1822ArmA00, AnonymousClass001.A0R(bRg2), bfm, iA0d & 126, 0);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0R(bRg2), AnonymousClass003.A0c(bfm, -402417189).primaryText, c1822ArmA00, null, null, (z && z2) ? C1YL.A00() : null, false, 0, 1, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14768);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C121961(str, str2, z, z2, bRg2, i, i2);
        }
    }

    public static final float getHatchStatusPillHeight(boolean z, boolean z2, BFM bfm, int i, int i2) {
        float fStatusBarTopInsetDp;
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            z2 = true;
        }
        if (z2) {
            bfm.AgE(-360799949);
            fStatusBarTopInsetDp = statusBarTopInsetDp(bfm, 0);
            AnonymousClass001.A1D(bfm);
        } else {
            AnonymousClass003.A0l(bfm, -360799040);
            fStatusBarTopInsetDp = 0.0f;
        }
        HatchAvatarSize hatchAvatarSizeRememberHatchAvatarSize = HatchAvatarSizeRepositoryKt.rememberHatchAvatarSize(bfm, 0);
        if (!hatchAvatarSizeRememberHatchAvatarSize.isAvatarVisible()) {
            hatchAvatarSizeRememberHatchAvatarSize = HatchAvatarSize.SMALL;
        }
        return fStatusBarTopInsetDp + (HatchAvatarSizeKt.rememberAvatarSizeDp(hatchAvatarSizeRememberHatchAvatarSize, bfm, 0) - HatchAvatarSizeKt.PillAvatarOverlap) + HatchAvatarSizeKt.PillChromeHeight + 14.0f + (z ? 20.0f : 0.0f);
    }

    public static final HatchHeaderTitleAlignment resolveTabHeaderTitleAlignment(HatchHeaderTitleAlignment hatchHeaderTitleAlignment, boolean z, boolean z2, boolean z3) {
        return hatchHeaderTitleAlignment == null ? (z || (z2 && !z3)) ? HatchHeaderTitleAlignment.CENTER : HatchHeaderTitleAlignment.START : hatchHeaderTitleAlignment;
    }

    public static final float HatchTabHeader_mLtqdTI$lambda$15(MutableState<C1DG> mutableState) {
        return mutableState.getValue().A00;
    }

    public static final /* synthetic */ C1DG access$HatchTabHeader_mLtqdTI$lambda$12(MutableState mutableState) {
        return (C1DG) mutableState.getValue();
    }

    public static final /* synthetic */ C1DG access$HatchTabHeader_mLtqdTI$lambda$18(MutableState mutableState) {
        return (C1DG) mutableState.getValue();
    }

    public static final /* synthetic */ C1DG access$HatchTabHeader_mLtqdTI$lambda$6(MutableState mutableState) {
        return (C1DG) mutableState.getValue();
    }

    public static final /* synthetic */ C1DG access$HatchTabHeader_mLtqdTI$lambda$9(MutableState mutableState) {
        return (C1DG) mutableState.getValue();
    }

    public static final float statusBarTopInsetDp(BFM bfm, int i) {
        return C0wg.A00(bfm, C1OP.A00(bfm).ALn(AnonymousClass002.A0Y(bfm)));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fc  */
    /* renamed from: HatchTabHeader-mLtqdTI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1019HatchTabHeadermLtqdTI(X.BRg r65, java.lang.String r66, X.AHD<? extends com.facebook.aura.header.view.HeaderButton> r67, X.G0U<? super com.facebook.aura.header.view.HeaderButton, kotlin.Unit> r68, X.AHD<com.facebook.aura.header.api.HeaderAction> r69, com.facebook.aura.header.view.HeaderButton r70, com.facebook.aura.header.view.HeaderLeadingButton r71, boolean r72, boolean r73, X.G0U<? super com.facebook.aura.header.view.HeaderLeadingButton, kotlin.Unit> r74, com.facebook.aura.header.view.ScrimConfig r75, float r76, X.BRg r77, float r78, boolean r79, com.facebook.aura.header.view.HatchHeaderTitleAlignment r80, java.lang.String r81, X.B6A r82, boolean r83, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r84, X.BFM r85, int r86, int r87, int r88) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchTabHeaderKt.m1019HatchTabHeadermLtqdTI(X.BRg, java.lang.String, X.AHD, X.G0U, X.AHD, com.facebook.aura.header.view.HeaderButton, com.facebook.aura.header.view.HeaderLeadingButton, boolean, boolean, X.G0U, com.facebook.aura.header.view.ScrimConfig, float, X.BRg, float, boolean, com.facebook.aura.header.view.HatchHeaderTitleAlignment, java.lang.String, X.B6A, boolean, X.G0V, X.BFM, int, int, int):void");
    }
}
