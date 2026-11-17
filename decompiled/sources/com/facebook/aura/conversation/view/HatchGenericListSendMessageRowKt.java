package com.facebook.aura.conversation.view;

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
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C0dx;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1DI;
import X.C1YD;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.explore.view.cards.IdeaCardPreviewImageKt;
import com.facebook.aura.model.GenericListRow;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.icons.AuraIconSize;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchGenericListSendMessageRowKt {

    /* renamed from: com.facebook.aura.conversation.view.HatchGenericListSendMessageRowKt$HatchGenericListSendMessageRow$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ GenericListRow $row;
        public final /* synthetic */ boolean $selected;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(GenericListRow genericListRow, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$row = genericListRow;
            this.$selected = z;
            this.$enabled = z2;
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
            HatchGenericListSendMessageRowKt.HatchGenericListSendMessageRow(this.$row, this.$selected, this.$enabled, this.$onClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchGenericListSendMessageRow(GenericListRow genericListRow, boolean z, boolean z2, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BBI bbiA0M;
        BRg bRgA02;
        BRg bRg2;
        BRg bRg3 = bRg;
        C7384Etj.A0Y(genericListRow, 0);
        C7384Etj.A0Y(function0, 3);
        bfm.AgG(-2034623880);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, genericListRow) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z2);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            C0dx c0dxA0T = AnonymousClass002.A0T(bfm);
            BRg bRgA0O = AnonymousClass006.A0O(C3U4.A0B(AnonymousClass001.A0R(bRg3), 8.0f, 4.0f));
            if (z) {
                bfm.AgE(1393881306);
                bRg2 = BRg.A00;
                bRgA02 = C1DI.A02(bRg2, C1D8.A00(8.0f), 1.5f, C06G.A0C(bfm));
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            } else {
                bbiA0M = AnonymousClass002.A0M(bfm, -1063407104);
                bRgA02 = BRg.A00;
                bRg2 = bRgA02;
            }
            BRg bRgThen = bRgA0O.then(bRgA02);
            C1YD c1yd = new C1YD(0);
            boolean zA67 = bfm.A67(c0dxA0T) | AnonymousClass004.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new HatchGenericListSendMessageRowKt$HatchGenericListSendMessageRow$1$1(c0dxA0T, function0);
                bfm.Ai0(objAaT);
            }
            BRg bRgA04 = C0v5.A04(bRgThen, c1yd, null, (Function0) objAaT, z2);
            boolean zA1I = AnonymousClass004.A1I(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1I || objAaT2 == C78N.A00) {
                objAaT2 = new HatchGenericListSendMessageRowKt$HatchGenericListSendMessageRow$2$1(z);
                bfm.Ai0(objAaT2);
            }
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0Y(bRgA04, objAaT2, false), 6.0f, 10.0f);
            InterfaceC1380AiA interfaceC1380AiAA0V = AnonymousClass006.A0V(bfm, C2VU.A04, 12.0f);
            long j = bbiA0M.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0V, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            String str = genericListRow.imageUrl;
            if (str == null) {
                bfm.AgE(-350768778);
                BBI.A0R(bbiA0M, false);
            } else {
                bfm.AgE(-350768777);
                IdeaCardPreviewImageKt.m795IdeaCardPreviewImageFV1VA1c(str, C11U.A01(C10G.A07(bRg2, 40.0f), 10.0f), 0, B18.A02, null, null, bfm, 3072, 52);
                BBI.A0R(bbiA0M, false);
            }
            BRg bRgAiP = c90m.AiP(bRg2, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, 2.0f, 6);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA012 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbiA0M, function02);
            BPg.A02(bfm, interfaceC1380AiAA0X, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str2 = genericListRow.title;
            C1822Arm c1822ArmA0V = C06G.A0V(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A0L(bfm, akh), c1822ArmA0V, null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14834);
            String str3 = genericListRow.subtitle;
            if (str3 == null) {
                bfm.AgE(-1971628965);
                BBI.A0R(bbiA0M, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(str3, null, C06G.A0I(bfm, akh), AnonymousClass006.A0k(bfm, -1971628964).footnoteRegular, null, null, null, false, 0, 3, 2, null, null, null, bfm, 805306368, 6, 14834);
                BBI.A0R(bbiA0M, false);
            }
            BBI.A0R(bbiA0M, true);
            if (z) {
                bfm.AgE(-349898607);
                AuraIconKt.m2567AuraIconFHprtrg(null, BOf.A00(bfm, R.drawable.ic_checkmark_circle_filled_24, 0), AuraIconSize.SMALL, null, C06G.A0L(bfm, akh), null, bfm, AnonymousClass001.A04(), 33);
            } else {
                bfm.AgE(-349680274);
            }
            BBI.A0R(bbiA0M, false);
            BBI.A0R(bbiA0M, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(genericListRow, z, z2, function0, bRg3, i, i2);
        }
    }
}
