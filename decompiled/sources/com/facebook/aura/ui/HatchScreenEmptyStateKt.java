package com.facebook.aura.ui;

import X.AKH;
import X.AKQ;
import X.AVy;
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
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C11U;
import X.C1515AkP;
import X.C1YL;
import X.C1b8;
import X.C3U4;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchScreenEmptyStateKt {

    /* renamed from: com.facebook.aura.ui.HatchScreenEmptyStateKt$HatchScreenEmptyState$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AVy $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, AVy aVy, String str2, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$icon = aVy;
            this.$subtitle = str2;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchScreenEmptyStateKt.HatchScreenEmptyState(this.$title, this.$modifier, this.$icon, this.$subtitle, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchScreenEmptyState(String str, BRg bRg, AVy aVy, String str2, BFM bfm, int i, int i2) {
        AVy aVy2;
        String str3;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-1290571582);
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
            iA0d |= AnonymousClass003.A05(AnonymousClass004.A1Z(aVy, bfm, i) ? 1 : 0);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, str2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            str3 = null;
            aVy2 = i4 == 0 ? aVy : null;
            if (i5 == 0) {
                str3 = str2;
            }
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA09 = C3U4.A09(bRg2, f);
            InterfaceC1380AiA interfaceC1380AiAA0R = AnonymousClass006.A0R(bfm);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i6 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0R, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i6);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            if (aVy2 != null) {
                bfm.AgE(-1544326852);
                BS0 bs0 = BRg.A00;
                BRg bRgA02 = C11U.A02(bs0, 64.0f);
                AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
                BRg bRgA00 = C1b8.A00(bRgA02, 0.1f, C06G.A0I(bfm, akh));
                InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
                int iA0D = AnonymousClass001.A0D(bbi);
                AKQ akqA042 = BBI.A04(bbi);
                BRg bRgA012 = AxM.A01(bfm, bRgA00);
                AnonymousClass005.A0n(bfm, bbi, function0);
                BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
                BPg.A02(bfm, akqA042, g0v2);
                AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                BPg.A02(bfm, bRgA012, g0vA0u);
                AuraIconKt.m2567AuraIconFHprtrg(null, aVy2, AuraIconSize.SMALL_MEDIUM, null, C06G.A0I(bfm, akh), null, bfm, AnonymousClass001.A04() | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 33);
                BBI.A0R(bbi, true);
                C01N.A08(bfm, bs0, f);
            } else {
                bfm.AgE(-1543840586);
            }
            BBI.A0R(bbi, false);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0X(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16306);
            if (str3 != null) {
                bfm.AgE(-1543628329);
                AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C06G.A08(bfm), C01N.A01(bfm, BRg.A00, AuraDimensKt.SpacingSmall).bodyRegular, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 9) & 14, 0, 16306);
            } else {
                bfm.AgE(-1543383274);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
            aVy2 = aVy;
            str3 = str2;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRg2, aVy2, str3, i, i2);
        }
    }
}
