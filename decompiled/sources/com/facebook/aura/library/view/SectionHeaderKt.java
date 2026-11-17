package com.facebook.aura.library.view;

import X.AKH;
import X.AKQ;
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
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C0v5;
import X.C1515AkP;
import X.C1822Arm;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0V;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SectionHeaderKt {

    /* renamed from: com.facebook.aura.library.view.SectionHeaderKt$SectionHeader$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchComponent $component;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onSeeAllClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, BRg bRg, HatchComponent hatchComponent, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$component = hatchComponent;
            this.$onSeeAllClick = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SectionHeaderKt.SectionHeader(this.$title, this.$modifier, this.$component, this.$onSeeAllClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SectionHeader(String str, BRg bRg, HatchComponent hatchComponent, Function0<Unit> function0, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        BRg bRgA01;
        BRg bRg2;
        BRg bRg3 = bRg;
        Function0<Unit> function02 = function0;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1885554087);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg3);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0F(bfm, AnonymousClass003.A0K(hatchComponent));
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            if (i4 != 0) {
                hatchComponent = null;
            }
            if (i5 != 0) {
                function02 = null;
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0R(bRg3), C06G.A00(bfm), 0.0f);
            if (function02 != null) {
                bfm.AgE(1335869722);
                BS0 bs0 = BRg.A00;
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
                bRg2 = bs0;
                boolean zA1D = AnonymousClass003.A1D(iA0d) | AnonymousClass006.A1X(iA0d);
                Object objAaT2 = bfm.AaT();
                if (zA1D || objAaT2 == obj) {
                    objAaT2 = new SectionHeaderKt$SectionHeader$2$1(hatchComponent, function02);
                    bfm.Ai0(objAaT2);
                }
                bRgA01 = C0v5.A01(null, interfaceC1072AWd, bs0, null, null, (Function0) objAaT2, true);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, 458752673);
                bRgA01 = BRg.A00;
                bRg2 = bRgA01;
            }
            BRg bRgThen = bRgA0B.then(bRgA01);
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
            int iA0J = AnonymousClass003.A0J(bbiA0M);
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA012, iA0J);
            C90m c90m = C90m.A00;
            C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title3Emphasized;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, C3U4.A0C(bRg2, AuraDimensKt.SpacingXsmall, 0.0f, 0.0f, 0.0f), C06G.A0L(bfm, akh), c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            if (function02 != null) {
                bfm.AgE(1797267932);
                C01N.A09(bfm, bRg2, AuraDimensKt.SpacingMicro);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_right, 0), AuraIconSize.TINY, null, AnonymousClass001.A0f(bfm, akh).tertiaryText, null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(1797530285);
            }
            BBI.A0R(bbiA0M, false);
            C01N.A07(bfm, c90m.AiP(bRg2, 1.0f, true));
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(str, bRg3, hatchComponent, function02, i, i2);
        }
    }
}
