package com.facebook.aura.appupdate;

import X.AKQ;
import X.AbstractC1754Apr;
import X.AbstractC1996Aw5;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B6A;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C0z7;
import X.C1515AkP;
import X.C1736ApY;
import X.C1809ArT;
import X.C1822Arm;
import X.C19U;
import X.C1YL;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.Context;
import com.facebook.aura.R;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.buttongroup.AuraButtonGroupsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AppUpdateHardBlockScreenKt {

    /* renamed from: com.facebook.aura.appupdate.AppUpdateHardBlockScreenKt$AppUpdateHardBlockScreen$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, Function0<Unit> function0, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$onDismiss = function0;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AppUpdateHardBlockScreenKt.AppUpdateHardBlockScreen(this.$modifier, this.$onDismiss, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AppUpdateHardBlockScreen(BRg bRg, Function0<Unit> function0, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(function0, 1);
        bfm.AgG(-188842605);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, bRg2) : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            AuraColors auraColorsA0c = AnonymousClass002.A0c(bfm);
            Object objAaT = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT == obj) {
                objAaT = AppUpdateHardBlockScreenKt$AppUpdateHardBlockScreen$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            B81.A00(false, (Function0) objAaT, bfm, 48, 1);
            BRg bRgA0B = C3U4.A0B(AnonymousClass001.A0T(bRg2), AuraDimensKt.SpacingLarge, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C0z7 c0z7 = C0z7.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA4C = c0z7.A4C(C2VU.A09, bs0);
            AuraContentRole auraContentRole = AuraContentRole.Focused;
            BRg bRgAuraContentWidth = AuraContentFrameKt.auraContentWidth(bRgA4C, auraContentRole, bfm, 48);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgAuraContentWidth);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            C1822Arm c1822Arm = C1822Arm.A03;
            long jA03 = C19U.A03(48);
            long j2 = B6A.A07;
            long j3 = C1809ArT.A01;
            AuraTextKt.m2639AuraTextUY9GdpU("\u1f4f2", null, 0L, new C1822Arm(null, null, null, 0, 0, j2, jA03, j3, j2, j3), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 3078, 0, 16310);
            C01N.A08(bfm, bs0, AuraDimensKt.SpacingLargePlusMicro);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12062b), null, auraColorsA0c.primaryText, new C1822Arm(null, null, null, 0, 0, j2, C19U.A03(24), j3, j2, j3), null, C1736ApY.A01, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 199680, 0, 16274);
            float f = AuraDimensKt.SpacingMedium;
            C01N.A08(bfm, bs0, f);
            AuraTextKt.m2639AuraTextUY9GdpU(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120629), null, auraColorsA0c.secondaryText, new C1822Arm(null, null, null, 0, 0, j2, C19U.A03(16), j3, j2, C19U.A03(22)), null, null, new C1YL(3), false, 0, 0, 0, null, null, null, bfm, 3072, 0, 16306);
            C01N.A08(bfm, bs0, f);
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass001.A0t(bfm, "16.0.0.11.159", R.string._name_removed__res_0x7f12062c), null, auraColorsA0c.tertiaryText, new C1822Arm(null, AbstractC1996Aw5.A01, null, 0, 0, j2, C19U.A03(14), j3, j2, j3), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120628);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12062a);
            BRg bRgAuraContentWidth2 = AuraContentFrameKt.auraContentWidth(C3U4.A0C(AbstractC1754Apr.A01(c0z7.A4C(C2VU.A06, bs0)), 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingLargePlusMicro), auraContentRole, bfm, 48);
            boolean zA1W = AnonymousClass002.A1W(bfm, strA012, AnonymousClass003.A1J(bfm, strA01, contextA0H), AnonymousClass003.A1C(iA0d));
            Object objAaT2 = bfm.AaT();
            if (zA1W || objAaT2 == obj) {
                objAaT2 = new AppUpdateHardBlockScreenKt$AppUpdateHardBlockScreen$2$2$1(strA01, strA012, contextA0H, function0);
                bfm.Ai0(objAaT2);
            }
            AuraButtonGroupsKt.m2454AuraButtonGroupFLdL6rA(bRgAuraContentWidth2, null, null, null, null, null, null, true, (G0U) objAaT2, bfm, 12582912, 126);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(bRg2, function0, i, i2);
        }
    }
}
