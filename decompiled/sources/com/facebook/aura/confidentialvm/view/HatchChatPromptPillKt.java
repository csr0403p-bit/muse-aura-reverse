package com.facebook.aura.confidentialvm.view;

import X.AKH;
import X.AKQ;
import X.AVy;
import X.AbstractC04540eo;
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
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1D3;
import X.C1D8;
import X.C1DM;
import X.C1OM;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
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
public abstract class HatchChatPromptPillKt {

    /* renamed from: com.facebook.aura.confidentialvm.view.HatchChatPromptPillKt$HatchChatPromptPill$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AVy $iconPainter;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, AVy aVy, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$iconPainter = aVy;
            this.$onClick = function0;
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
            HatchChatPromptPillKt.HatchChatPromptPill(this.$title, this.$iconPainter, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchChatPromptPill(String str, AVy aVy, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(str, aVy);
        C7384Etj.A0Y(function0, 2);
        bfm.AgG(826231327);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(aVy, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1D3 c1d3A00 = C1D8.A00(78.0f);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            BRg bRgA03 = C11U.A03(AbstractC04540eo.A00(bRg2, c1d3A00, 8.0f, 4, C06G.A0F(bfm, akh), C06G.A0F(bfm, akh)), c1d3A00);
            long j = AnonymousClass001.A0f(bfm, akh).elevated;
            C1DM c1dm = C1OM.A00;
            BRg bRgA0B = C3U4.A0B(C0v5.A05(C1b8.A03(bRgA03, c1dm, j), null, function0, zA1a), AuraDimensKt.SpacingMedium, AuraDimensKt.SpacingSmall);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            BBI bbi = (BBI) bfm;
            long j2 = bbi.A06;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA032 = C1b8.A03(C11U.A01(C10G.A07(bs0, 28.0f), 8.0f), c1dm, AnonymousClass001.A0f(bfm, akh).primaryButtonBackground);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA032);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            long j3 = AnonymousClass001.A0f(bfm, akh).onMedia;
            AuraIconSize auraIconSize = AuraIconSize.X_SMALL;
            int i5 = AVy.$stable;
            AuraIconKt.m2567AuraIconFHprtrg(null, aVy, auraIconSize, null, j3, null, bfm, (i5 << 3) | 3456 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 33);
            BBI.A0R(bbi, zA1a);
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0O(c90m, bs0, zA1a), C06G.A0L(bfm, akh), C06G.A0V(bfm), null, null, null, false, 0, zA1a ? 1 : 0, 2, null, null, null, bfm, AnonymousClass005.A01(iA0d), 6, 14832);
            AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), auraIconSize, null, C06G.A0G(bfm, akh), null, bfm, (i5 << 3) | 3456, 33);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, aVy, function0, bRg2, i, i2);
        }
    }
}
