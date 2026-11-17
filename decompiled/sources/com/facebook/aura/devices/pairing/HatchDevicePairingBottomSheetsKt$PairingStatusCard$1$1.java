package com.facebook.aura.devices.pairing;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C07C;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.ui.HatchSectionScope;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchDevicePairingBottomSheetsKt$PairingStatusCard$1$1 extends AbstractC7559F3s implements G0U<HatchSectionScope, Unit> {
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

    /* renamed from: com.facebook.aura.devices.pairing.HatchDevicePairingBottomSheetsKt$PairingStatusCard$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $trailing;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(BRg bRg, String str, G0V<? super BFM, ? super Integer, Unit> g0v) {
            super(3);
            this.$modifier = bRg;
            this.$label = str;
            this.$trailing = g0v;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass005.A1N(i, c07c), bfm, i)) {
                BRg bRgA0V = AnonymousClass001.A0V(C3U4.A02(AnonymousClass001.A0R(this.$modifier)), 32.0f);
                C1AC c1ac = C2VU.A04;
                String str = this.$label;
                G0V<BFM, Integer, Unit> g0v = this.$trailing;
                InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass002.A0W(bfm, c1ac);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, bRgA0V);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
                C90m c90m = C90m.A00;
                C1822Arm c1822ArmA0T = C06G.A0T(bfm);
                long jA0C = C06G.A0C(bfm);
                BRg bRgAiP = c90m.AiP(BRg.A00, 1.0f, true);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = HatchDevicePairingBottomSheetsKt$PairingStatusCard$1$1$1$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bRgAiP, objAaT, false), jA0C, c1822ArmA0T, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
                AnonymousClass001.A1H(bfm, g0v, 0);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HatchSectionScope hatchSectionScope) {
        C7384Etj.A0Y(hatchSectionScope, 0);
        AnonymousClass006.A1E(hatchSectionScope, new AnonymousClass1(this.$modifier, this.$label, this.$trailing), 1114734459);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchDevicePairingBottomSheetsKt$PairingStatusCard$1$1(BRg bRg, String str, G0V<? super BFM, ? super Integer, Unit> g0v) {
        super(1);
        this.$modifier = bRg;
        this.$label = str;
        this.$trailing = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(HatchSectionScope hatchSectionScope) {
        invoke2(hatchSectionScope);
        return Unit.INSTANCE;
    }
}
