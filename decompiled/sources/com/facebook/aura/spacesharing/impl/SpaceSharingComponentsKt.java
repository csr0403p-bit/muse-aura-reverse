package com.facebook.aura.spacesharing.impl;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06I;
import X.C0fG;
import X.C1062ATq;
import X.C10G;
import X.C11S;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C19U;
import X.C1D3;
import X.C1D8;
import X.C1DG;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class SpaceSharingComponentsKt {

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$CollaboratorRow$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $dimmed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ String $photoUrl;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, String str2, BRg bRg, String str3, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$name = str;
            this.$photoUrl = str2;
            this.$modifier = bRg;
            this.$subtitle = str3;
            this.$dimmed = z;
            this.$trailing = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.CollaboratorRow(this.$name, this.$photoUrl, this.$modifier, this.$subtitle, this.$dimmed, this.$trailing, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$InviteAccessOption$2, reason: invalid class name and case insensitive filesystem */
    public final class C139852 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ int $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $readOnly;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139852(int i, int i2, boolean z, boolean z2, BRg bRg, boolean z3, Function0<Unit> function0, int i3, int i4) {
            super(2);
            this.$label = i;
            this.$icon = i2;
            this.$checked = z;
            this.$enabled = z2;
            this.$modifier = bRg;
            this.$readOnly = z3;
            this.$onClick = function0;
            this.$$changed = i3;
            this.$$default = i4;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.InviteAccessOption(this.$label, this.$icon, this.$checked, this.$enabled, this.$modifier, this.$readOnly, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$InviteHeading$2, reason: invalid class name and case insensitive filesystem */
    public final class C139862 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139862(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.InviteHeading(this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$SharingLoading$2, reason: invalid class name and case insensitive filesystem */
    public final class C139872 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139872(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.SharingLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$SpaceSharingCopyLinkButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C139882 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139882(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.SpaceSharingCopyLinkButton(this.$url, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$SpaceSharingIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.SpaceSharingIcon(this.$url, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$SpaceSharingIcon$2, reason: invalid class name and case insensitive filesystem */
    public final class C139892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139892(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$url = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.SpaceSharingIcon(this.$url, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$SpaceSharingShareLinkButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C139901 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139901(boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$enabled = z;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.SpaceSharingShareLinkButton(this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt$SpaceSharingTitle$2, reason: invalid class name and case insensitive filesystem */
    public final class C139912 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C139912(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SpaceSharingComponentsKt.SpaceSharingTitle(this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: SharingAvatarPlaceholder-rAjV9yQ, reason: not valid java name */
    public static final void m2206SharingAvatarPlaceholderrAjV9yQ(BRg bRg, float f, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        float f2 = f;
        bfm.AgG(579430601);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A05(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 36.0f;
            }
            float f3 = 0.36f * f2;
            BRg bRgA07 = C10G.A07(bRg2, f2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraIconKt.m2568AuraIconFyETyZw(C3U4.A09(C1b8.A03(bRgA07, C1D8.A00, auraTheme.getColors(bfm, 6).highlight), (f2 - f3) / 2.0f), BOf.A00(bfm, R.drawable.user_outline_24_wght400, 0), f3, null, C3cH.A05(bfm, auraTheme), null, bfm, AVy.$stable << 3, 40);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceSharingComponentsKt$SharingAvatarPlaceholder$1(bRg2, f2, i, i2);
        }
    }

    public static final void CollaboratorRow(String str, String str2, BRg bRg, String str3, boolean z, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        String str4;
        BRg bRg2 = bRg;
        G0V<? super BFM, ? super Integer, Unit> g0v2 = g0v;
        boolean zA1K = z;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1245557245);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, zA1K);
        }
        int i6 = i2 & 32;
        int iA0Y = 196608;
        if (i6 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0v2);
            iA0d |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 74899, 74898), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            str4 = i4 == 0 ? str3 : null;
            zA1K = C3cG.A1K(i5, zA1K);
            if (i6 != 0) {
                g0v2 = ComposableSingletons$SpaceSharingComponentsKt.f299lambda$274745619;
            }
            float f = zA1K ? 0.3f : 1.0f;
            BRg bRgA04 = C3U4.A04(AnonymousClass001.A0R(bRg2), 16.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 10.0f);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA04);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0V);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            m2205SharingAvatar6a0pyJM(str2, C11S.A00(bs0, f), 44.0f, bfm, ((iA0d >> 3) & 14) | 384, 0);
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A00(2.0f), bfm, C2VU.A02, 6);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C11S.A00(bs0, f), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            if (str4 != null) {
                AuraTextKt.m2639AuraTextUY9GdpU(str4, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, 437544740).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0d >> 9) & 14, 0, 16370);
            } else {
                bfm.AgE(437707397);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
            AnonymousClass003.A13(bfm, g0v2, iA0d >> 15);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
            str4 = str3;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, str2, bRg2, str4, zA1K, g0v2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void InviteAccessOption(int r45, int r46, boolean r47, boolean r48, X.BRg r49, boolean r50, kotlin.jvm.functions.Function0<kotlin.Unit> r51, X.BFM r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.spacesharing.impl.SpaceSharingComponentsKt.InviteAccessOption(int, int, boolean, boolean, X.BRg, boolean, kotlin.jvm.functions.Function0, X.BFM, int, int):void");
    }

    public static final void InviteHeading(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(213900441);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineMedium;
            long jA07 = C3cH.A07(bfm, auraTheme);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceSharingComponentsKt$InviteHeading$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA0R, objAaT, false), jA07, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139862(str, bRg2, i, i2);
        }
    }

    /* renamed from: SharingAvatar-6a0pyJM, reason: not valid java name */
    public static final void m2205SharingAvatar6a0pyJM(String str, BRg bRg, float f, BFM bfm, int i, int i2) {
        float f2 = f;
        BRg bRg2 = bRg;
        bfm.AgG(1980909515);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A06(bfm, f2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 36.0f;
            }
            if (str == null || C7BY.A0j(str)) {
                bfm.AgE(424839877);
                m2206SharingAvatarPlaceholderrAjV9yQ(bRg2, f2, bfm, (iA0d >> 3) & 126, 0);
            } else {
                bfm.AgE(424905907);
                BRg bRgA07 = C10G.A07(bRg2, f2);
                long j = C3cH.A0W(bfm).photoBorder;
                C1D3 c1d3 = C1D8.A00;
                AuraImageKt.m2573AuraImageXRP3Ue8(str, C11U.A03(C3U4.A09(C1b8.A03(bRgA07, c1d3, j), 1.0f), c1d3), B18.A00, null, null, false, new C1DG(f2), 0L, false, false, false, B1V.A00(bfm, new SpaceSharingComponentsKt$SharingAvatar$1(f2), 69661714), null, null, null, bfm, AnonymousClass001.A05(iA0d << 12, (iA0d & 14) | 384), 48, 30648);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceSharingComponentsKt$SharingAvatar$2(str, bRg2, f2, i, i2);
        }
    }

    public static final void SpaceSharingCopyLinkButton(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-207400013);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C0fG c0fG = (C0fG) bfm.A6v(Am0.A02);
            View view = (View) bfm.A6v(AndroidCompositionLocals_androidKt.A05);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120231);
            AVy aVyA00 = BOf.A00(bfm, R.drawable.link_outline_24_wght400, 0);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ffe);
            boolean zA1X = AnonymousClass002.A1X(str);
            boolean zA1O = AnonymousClass003.A1O(bfm, view, strA01, AnonymousClass001.A1S(bfm, c0fG, AnonymousClass003.A1B(iA0d)));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new SpaceSharingComponentsKt$SpaceSharingCopyLinkButton$1$1(str, c0fG, view, strA01);
                bfm.Ai0(objAaT);
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(aVyA00, strA012, (Function0) objAaT, bRg2, zA1X, 0.0f, null, null, null, false, false, bfm, AVy.$stable | ((iA0d << 6) & 7168), 0, 2016);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139882(str, bRg2, i, i2);
        }
    }

    public static final void SpaceSharingIcon(String str, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        G0V<? super BFM, ? super Integer, Unit> c139892;
        BRg bRg2 = bRg;
        bfm.AgG(-1869896693);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (str == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c139892 = new AnonymousClass1(str, bRg2, i, i2);
                    bBbAAc.A06 = c139892;
                }
                return;
            }
            AuraImageKt.m2573AuraImageXRP3Ue8(str, C10G.A07(bRg2, 64.0f), B18.A00, null, null, false, new C1DG(64.0f), 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 1573248, 0, 32696);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c139892 = new C139892(str, bRg2, i, i2);
            bBbAAc.A06 = c139892;
        }
    }

    public static final void SpaceSharingShareLinkButton(boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(264678772);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0n |= 384;
        } else if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ffe), null, C3U4.A0B(AnonymousClass001.A0R(bRg2), 24.0f, 12.0f), AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), null, null, false, false, z, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, (iA0n << 27) & 1879048192, (iA0n << 9) & 57344, 0, 134200805);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139901(z, function0, bRg2, i, i2);
        }
    }

    public static final void SpaceSharingTitle(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(595468386);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822ArmA00 = C1822Arm.A00(null, auraTheme.getTypography(bfm, 6).title3Emphasized, null, null, null, null, null, null, null, null, 0, 0, 0, 16646141, 0L, C60Q.A04(), 0L, C19U.A03(25));
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0A = C3U4.A0A(c1062ATq, 4.0f, 16.0f);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = SpaceSharingComponentsKt$SpaceSharingTitle$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgA0A, objAaT, false), jA06, c1822ArmA00, null, null, C3cH.A0F(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16304);
            AuraDividerKt.AuraDivider(null, null, false, bfm, 0, 7);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139912(str, bRg2, i, i2);
        }
    }

    public static final void SharingLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(403565781);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120232);
            BRg bRgA02 = C10G.A02(C2VU.A09, AnonymousClass001.A0T(bRg), false);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new SpaceSharingComponentsKt$SharingLoading$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A0v(bfm, bRgA02, (G0U) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C139872(bRg, i, i2);
        }
    }
}
