package com.facebook.aura.settings;

import X.AKH;
import X.AKQ;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AxM;
import X.BBI;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1DG;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1185Ado;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.button.AuraLabelButtonStyle;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraDimensions;
import com.facebook.aura.vds.compose.theme.AuraDimensionsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ComposableSingletons$CancelEncryptionScreenKt$lambda$968332307$1 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
    public static final ComposableSingletons$CancelEncryptionScreenKt$lambda$968332307$1 INSTANCE = new ComposableSingletons$CancelEncryptionScreenKt$lambda$968332307$1();

    public ComposableSingletons$CancelEncryptionScreenKt$lambda$968332307$1() {
        super(4);
    }

    @Override // X.G2j
    public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
        m1903invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* renamed from: invoke-i1RSzL4, reason: not valid java name */
    public final void m1903invokei1RSzL4(float f, float f2, BFM bfm, int i) {
        int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, f) : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, f2);
        }
        if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            bfm.Afo();
            return;
        }
        BS0 bs0 = BRg.A00;
        C1062ATq c1062ATq = C10G.A01;
        AKH<AuraDimensions> akh = AuraDimensionsKt.LocalAuraDimensions;
        BRg bRgA0C = C3U4.A0C(c1062ATq, C06G.A01(bfm, akh), 0.0f, C06G.A01(bfm, akh), 0.0f);
        InterfaceC1185Ado interfaceC1185Ado = AcQ.A06;
        InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A02, 0);
        BBI bbi = (BBI) bfm;
        long j = bbi.A06;
        int i2 = (int) (j ^ (j >>> 32));
        AKQ akqA04 = BBI.A04(bbi);
        BRg bRgA01 = AxM.A01(bfm, bRgA0C);
        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
        if (bbi.A0V == null) {
            C00x.A00();
            throw F60.createAndThrow();
        }
        AnonymousClass005.A0n(bfm, bbi, function0);
        G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
        BPg.A02(bfm, interfaceC1380AiAA00, g0v);
        G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
        G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i2);
        G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
        G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
        C90l c90l = C90l.A00;
        BRg bRgA0N = AnonymousClass001.A0N(c90l, bs0, true);
        C1062ATq c1062ATq2 = C10G.A02;
        BRg bRgA0H = AnonymousClass007.A0H(bfm, bRgA0N, c1062ATq2);
        InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(interfaceC1185Ado, bfm, C2VU.A00, 48);
        int iA0D = AnonymousClass001.A0D(bbi);
        AKQ akqA042 = BBI.A04(bbi);
        BRg bRgA012 = AxM.A01(bfm, bRgA0H);
        AnonymousClass005.A0n(bfm, bbi, function0);
        BPg.A02(bfm, interfaceC1380AiAA002, g0v);
        BPg.A02(bfm, akqA042, g0v2);
        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
        C01N.A0B(bfm, bs0, bRgA012, g0vA0u, f);
        String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f120eda);
        C1822Arm c1822Arm = AnonymousClass002.A0f(bfm).title1Medium;
        long jA0C = C06G.A0C(bfm);
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = ComposableSingletons$CancelEncryptionScreenKt$lambda$968332307$1$1$1$1$1.INSTANCE;
            bfm.Ai0(objAaT);
        }
        AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0Y(c1062ATq2, objAaT, false), jA0C, c1822Arm, null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120edb), C3U4.A0C(c1062ATq2, 0.0f, AuraDimensKt.SpacingXsmall, 0.0f, 0.0f), C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 0, 0, 16304);
        float f3 = AuraDimensKt.SpacingLarge;
        C01N.A08(bfm, bs0, f3);
        Object objAaT2 = bfm.AaT();
        if (objAaT2 == obj) {
            objAaT2 = ComposableSingletons$CancelEncryptionScreenKt$lambda$968332307$1$1$1$2$1.INSTANCE;
            bfm.Ai0(objAaT2);
        }
        HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, null, 0L, (G0U) objAaT2, bfm, 24582, 7);
        BBI.A0R(bbi, true);
        C01N.A08(bfm, bs0, f3);
        String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ed7);
        AuraLabelButtonStyle auraLabelButtonStyleDestructive = AuraButtonStyles.INSTANCE.destructive(null, bfm, 48, 1);
        Object objAaT3 = bfm.AaT();
        if (objAaT3 == obj) {
            objAaT3 = ComposableSingletons$CancelEncryptionScreenKt$lambda$968332307$1$1$2$1.INSTANCE;
            bfm.Ai0(objAaT3);
        }
        AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA01, null, c1062ATq2, auraLabelButtonStyleDestructive, null, null, false, false, false, false, false, null, null, (Function0) objAaT3, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 3072, RuntimeInternals.IOPRIO_BACKGROUND, 0, 134201317);
        C01N.A04(bfm, bbi, bs0, f2, true);
    }
}
