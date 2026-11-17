package com.facebook.aura.vmdisabled.content;

import X.AKH;
import X.AKQ;
import X.AbstractC1754Apr;
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
import X.AnonymousClass011;
import X.AxM;
import X.B1U;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0v5;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1YD;
import X.C1YL;
import X.C1b8;
import X.C2VU;
import X.C3TH;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.C9m9;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.linktext.HatchInlineLinkTextKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.tag.AuraStatusTagKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.aura.vmdisabled.VmRecoveryFlowType;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class VmRecoveryFlowBodyKt {

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoveryFlowBodyKt$VmRecoveryBodyText$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VmRecoveryFlowType $flowType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $preview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(VmRecoveryFlowType vmRecoveryFlowType, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$flowType = vmRecoveryFlowType;
            this.$preview = z;
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
            VmRecoveryFlowBodyKt.VmRecoveryBodyText(this.$flowType, this.$preview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoveryFlowBodyKt$VmRecoveryChoiceRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C143412 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ boolean $recommended;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143412(String str, String str2, Function0<Unit> function0, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$title = str;
            this.$subtitle = str2;
            this.$onClick = function0;
            this.$modifier = bRg;
            this.$recommended = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            VmRecoveryFlowBodyKt.VmRecoveryChoiceRow(this.$title, this.$subtitle, this.$onClick, this.$modifier, this.$recommended, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoveryFlowBodyKt$VmRecoveryChoices$2, reason: invalid class name and case insensitive filesystem */
    public final class C143422 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VmRecoveryFlowType $flowType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $preview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143422(VmRecoveryFlowType vmRecoveryFlowType, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$flowType = vmRecoveryFlowType;
            this.$preview = z;
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
            VmRecoveryFlowBodyKt.VmRecoveryChoices(this.$flowType, this.$preview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vmdisabled.content.VmRecoveryFlowBodyKt$VmRecoveryFlowBody$2, reason: invalid class name and case insensitive filesystem */
    public final class C143432 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ VmRecoveryFlowType $flowType;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $preview;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C143432(VmRecoveryFlowType vmRecoveryFlowType, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$flowType = vmRecoveryFlowType;
            this.$preview = z;
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
            VmRecoveryFlowBodyKt.VmRecoveryFlowBody(this.$flowType, this.$preview, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void VmRecoveryBodyText(VmRecoveryFlowType vmRecoveryFlowType, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-906382732);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, vmRecoveryFlowType) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string.vm_recovery_learn_more);
            String strA0w = AnonymousClass006.A0w(bfm, HatchAppName.value, strA01, VmRecoveryFlowSpecKt.getBodyRes(vmRecoveryFlowType));
            long jA07 = C06G.A07(bfm);
            boolean zA67 = bfm.A67(auraNavigatorA0b) | AnonymousClass003.A1B(iA08) | AnonymousClass001.A1O(iA08);
            Object objAaT = bfm.AaT();
            if (zA67 || objAaT == C78N.A00) {
                objAaT = new VmRecoveryFlowBodyKt$VmRecoveryBodyText$1$1(auraNavigatorA0b, vmRecoveryFlowType, z);
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2640AuraTextVmYn7U0(HatchInlineLinkTextKt.m1187buildInlineLinkTextXOJAsU(strA0w, strA01, jA07, "vm_recovery_learn_more", (Function0) objAaT), AnonymousClass001.A0R(bRg2), C06G.A08(bfm), C06G.A0Z(bfm), null, null, new C1YL(3), 0L, false, 0, 0, 0, null, null, null, bfm, 0, 0, 32688);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(vmRecoveryFlowType, z, bRg2, i, i2);
        }
    }

    public static final void VmRecoveryChoiceRow(String str, String str2, Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        boolean z2;
        BRg bRg2 = bRg;
        boolean z3 = z;
        bfm.AgG(-1820035432);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
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
        int i4 = i2 & 16;
        if (i4 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0r(bfm, z3);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z3 = false;
            }
            BRg bRgA04 = C0v5.A04(AnonymousClass001.A0R(bRg2), new C1YD(0), null, function0, true);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0B = C3U4.A0B(C3U4.A0C(bRgA04, f, 0.0f, f, 0.0f), 0.0f, 10.0f);
            C1AC c1ac = C2VU.A04;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i5 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i5);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            float f2 = AuraDimensKt.SpacingSmall;
            InterfaceC1380AiA interfaceC1380AiAA002 = C0A8.A00(AcQ.A00(f2), bfm, c1ac, 48);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function02);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0L(bfm, akh), c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16370);
            if (z3) {
                bfm.AgE(770953594);
                AuraStatusTagKt.m2637AuraStatusTagRWsq2U(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12112d), AnonymousClass001.A0f(bfm, akh).accent, null, 0L, bfm, 0, 12);
                z2 = false;
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(771124652);
                z2 = false;
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C06G.A0I(bfm, akh), C06G.A0Z(bfm), null, null, null, z2, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16370);
            BBI.A0R(bbi, true);
            AuraIconKt.m2568AuraIconFyETyZw(C10G.A07(C3U4.A0C(bs0, f2, 0.0f, 0.0f, 0.0f), 20.0f), BOf.A00(bfm, R.drawable.chevron_right_wght400_outline_24, 0), 20.0f, null, C06G.A0H(bfm, akh), null, bfm, AnonymousClass001.A03(), 40);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143412(str, str2, function0, bRg2, z3, i, i2);
        }
    }

    public static final void VmRecoveryChoices(VmRecoveryFlowType vmRecoveryFlowType, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        BRg bRg2 = bRg;
        bfm.AgG(2097467013);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, vmRecoveryFlowType) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            boolean zA1B = AnonymousClass003.A1B(iA08) | bfm.A67(auraNavigatorA0b);
            int i5 = iA08 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX;
            boolean zA1Q = zA1B | AnonymousClass002.A1Q(i5, 32);
            Object objAaT = bfm.AaT();
            if (zA1Q || objAaT == C78N.A00) {
                objAaT = new VmRecoveryFlowBodyKt$VmRecoveryChoices$onReconnect$1$1(auraNavigatorA0b, vmRecoveryFlowType, z);
                bfm.Ai0(objAaT);
            }
            Function0 function0 = (Function0) objAaT;
            boolean zA1Q2 = AnonymousClass002.A1Q(i5, 32) | bfm.A67(auraNavigatorA0b);
            Object objAaT2 = bfm.AaT();
            if (zA1Q2 || objAaT2 == C78N.A00) {
                objAaT2 = new VmRecoveryFlowBodyKt$VmRecoveryChoices$onReset$1$1(auraNavigatorA0b, z);
                bfm.Ai0(objAaT2);
            }
            Function0 function02 = (Function0) objAaT2;
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingSmall);
            C3TH c3th = C2VU.A02;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, c3th, 0);
            BBI bbi = (BBI) bfm;
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, iA0D);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f121120);
            C1822Arm c1822ArmA0W = C06G.A0W(bfm);
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0L = C06G.A0L(bfm, akh);
            BS0 bs0 = BRg.A00;
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bs0, f, 0.0f, 0.0f, 0.0f);
            Object objAaT3 = bfm.AaT();
            if (objAaT3 == C78N.A00) {
                objAaT3 = VmRecoveryFlowBodyKt$VmRecoveryChoices$1$1$1.INSTANCE;
                bfm.Ai0(objAaT3);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strA0v, AnonymousClass001.A0Y(bRgA0C, objAaT3, false), jA0L, c1822ArmA0W, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BRg bRgA012 = C1b8.A01(C11U.A01(C10G.A02, 22.0f), AnonymousClass001.A0f(bfm, akh).highlight);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A06, bfm, c3th, 0);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgA012);
            AnonymousClass005.A0n(bfm, bbi, function03);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0vA0u);
            B1U b1uA00 = B1V.A00(bfm, new VmRecoveryFlowBodyKt$VmRecoveryChoices$1$2$reconnectRow$1(function0), 1763206396);
            B1U b1uA002 = B1V.A00(bfm, new VmRecoveryFlowBodyKt$VmRecoveryChoices$1$2$resetRow$1(vmRecoveryFlowType, function02), -2009679756);
            if (VmRecoveryFlowSpecKt.getListsResetFirst(vmRecoveryFlowType)) {
                bfm.AgE(647395939);
                i3 = 6;
                b1uA002.invoke(bfm, 6);
            } else {
                bfm.AgE(647396455);
                i3 = 6;
                b1uA00.invoke(bfm, 6);
            }
            BBI.A0R(bbi, false);
            AuraDividerKt.AuraRowDivider(C3U4.A0B(bs0, f, 0.0f), bfm, 0, 0);
            if (VmRecoveryFlowSpecKt.getListsResetFirst(vmRecoveryFlowType)) {
                bfm.AgE(647400583);
                b1uA00.invoke(bfm, i3);
            } else {
                bfm.AgE(647401219);
                b1uA002.invoke(bfm, i3);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143422(vmRecoveryFlowType, z, bRg2, i, i2);
        }
    }

    public static final void VmRecoveryFlowBody(VmRecoveryFlowType vmRecoveryFlowType, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(vmRecoveryFlowType, 0);
        bfm.AgG(566063635);
        int iA08 = (i & 6) == 0 ? AnonymousClass005.A08(bfm, vmRecoveryFlowType) | i : i;
        if ((i & 48) == 0) {
            iA08 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA08 |= 384;
        } else if ((i & 384) == 0) {
            iA08 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA08 & 147, 146), bfm, iA08)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA01 = AbstractC1754Apr.A01(AnonymousClass007.A0H(bfm, bRg2, C10G.A01));
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA07 = C3U4.A07(bRgA01, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            VmDisabledOverlayContentKt.m3145VmDisabledMessageKLGhzwk(AnonymousClass006.A0v(bfm, VmRecoveryFlowSpecKt.getTitleRes(vmRecoveryFlowType)), VmDisabledOverlayContentKt.REENABLE_LOGO_TOP_OFFSET, VmDisabledOverlayContentKt.REENABLE_LOGO_SIZE, VmDisabledOverlayContentKt.REENABLE_LOGO_TO_TITLE_SPACING, null, B1V.A00(bfm, new VmRecoveryFlowBodyKt$VmRecoveryFlowBody$1$1(vmRecoveryFlowType, z), 446252141), bfm, 196608, 16);
            BS0 bs0 = BRg.A00;
            C01N.A08(bfm, bs0, 30.0f);
            VmRecoveryChoices(vmRecoveryFlowType, z, null, bfm, iA08 & 126, 4);
            C01N.A04(bfm, bbi, bs0, f, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C143432(vmRecoveryFlowType, z, bRg2, i, i2);
        }
    }
}
