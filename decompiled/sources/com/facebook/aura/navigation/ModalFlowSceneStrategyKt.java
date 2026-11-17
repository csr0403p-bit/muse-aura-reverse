package com.facebook.aura.navigation;

import X.AEk;
import X.AKH;
import X.AKQ;
import X.ANR;
import X.ASj;
import X.AWx;
import X.AaM;
import X.AbstractC04540eo;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BNH;
import X.BPg;
import X.BRL;
import X.BRg;
import X.BRr;
import X.C00x;
import X.C06G;
import X.C06c;
import X.C0v5;
import X.C0z7;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1743Apg;
import X.C1DI;
import X.C1DM;
import X.C1OP;
import X.C1YD;
import X.C1b8;
import X.C2HU;
import X.C2VU;
import X.C3IL;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.HtJ;
import X.InterfaceC1072AWd;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.partners.voice.background.VoiceCallForegroundService;
import com.facebook.aura.toast.HatchToastHostKt;
import com.facebook.aura.ui.adaptive.AuraPageCardKt;
import com.facebook.aura.ui.adaptive.AuraPageHost;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.theme.AuraColors;
import com.facebook.aura.vds.compose.theme.AuraColorsKt;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class ModalFlowSceneStrategyKt {
    public static final float MODAL_FLOW_ENTER_SCALE = 0.94f;
    public static final int MODAL_FLOW_FADE_DURATION_MS = 200;
    public static final ASj<Float> pageFadeSpec = AnonymousClass002.A0J(C2HU.A02, 150);

    /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowPages$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ List<BRL<T>> $flowEntries;
        public final /* synthetic */ boolean $isFullBleed;
        public final /* synthetic */ BRg $modifier;

        /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowPages$1$1, reason: invalid class name and collision with other inner class name */
        public final class C02421 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ List<BRL<T>> $flowEntries;
            public final /* synthetic */ boolean $isFullBleed;
            public final /* synthetic */ BRg $modifier;

            /* JADX INFO: Add missing generic type declarations: [T] */
            /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowPages$1$1$3, reason: invalid class name */
            public final class AnonymousClass3<T> extends AbstractC7559F3s implements G2j<C06c, BRL<T>, BFM, Integer, Unit> {
                public final /* synthetic */ List<BRL<T>> $flowEntries;
                public final /* synthetic */ boolean $isFullBleed;

                /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowPages$1$1$3$1, reason: invalid class name and collision with other inner class name */
                public final class C02431 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                    public final /* synthetic */ BRL<T> $entry;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C02431(BRL<T> brl) {
                        super(2);
                        this.$entry = brl;
                    }

                    @Override // X.G0V
                    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                        invoke(bfm, AnonymousClass001.A0F(num));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BFM bfm, int i) {
                        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                            this.$entry.A00(bfm, 0);
                        } else {
                            bfm.Afo();
                        }
                    }
                }

                public final void invoke(C06c c06c, BRL<T> brl, BFM bfm, int i) {
                    C7384Etj.A0Y(brl, 1);
                    if ((i & 48) == 0) {
                        i |= AnonymousClass004.A0e(bfm, brl);
                    }
                    if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 145, VoiceCallForegroundService.AVATAR_TARGET_PX), bfm, i)) {
                        AnonymousClass003.A0m(bfm, AuraPageCardKt.LocalAuraPageHost.A04(this.$isFullBleed ? AuraPageHost.Window : C7384Etj.areEqual(brl.A00, ((BRL) AbstractC0878AGe.A0F(this.$flowEntries)).A00) ? AuraPageHost.ModalFlowRoot : AuraPageHost.ModalFlowChild), new C02431(brl), -668995680);
                    } else {
                        bfm.Afo();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass3(boolean z, List<BRL<T>> list) {
                    super(4);
                    this.$isFullBleed = z;
                    this.$flowEntries = list;
                }

                @Override // X.G2j
                public /* bridge */ /* synthetic */ Unit invoke(C06c c06c, Object obj, BFM bfm, Integer num) {
                    invoke(c06c, (BRL) obj, bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C02421(List<BRL<T>> list, BRg bRg, boolean z) {
                super(2);
                this.$flowEntries = list;
                this.$modifier = bRg;
                this.$isFullBleed = z;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    Object objA0H = AbstractC0878AGe.A0H(this.$flowEntries);
                    BRg bRg = this.$modifier;
                    boolean zA67 = bfm.A67(this.$flowEntries);
                    List<BRL<T>> list = this.$flowEntries;
                    Object objAaT = bfm.AaT();
                    if (zA67 || objAaT == C78N.A00) {
                        objAaT = new ModalFlowSceneStrategyKt$ModalFlowPages$1$1$1$1(list);
                        bfm.Ai0(objAaT);
                    }
                    G0U g0u = (G0U) objAaT;
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == C78N.A00) {
                        objAaT2 = ModalFlowSceneStrategyKt$ModalFlowPages$1$1$2$1.INSTANCE;
                        bfm.Ai0(objAaT2);
                    }
                    ANR.A02(bfm, null, bRg, objA0H, "modalFlowPages", g0u, (G0U) objAaT2, B1V.A00(bfm, new AnonymousClass3(this.$isFullBleed, this.$flowEntries), -1491805088), 1794048, 8);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(List<BRL<T>> list, BRg bRg, boolean z) {
            super(2);
            this.$flowEntries = list;
            this.$modifier = bRg;
            this.$isFullBleed = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                HatchSharedElementKt.DisableHatchSharedTransitions(B1V.A00(bfm, new C02421(this.$flowEntries, this.$modifier, this.$isFullBleed), -1074918328), bfm, 6);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowPages$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ List<BRL<T>> $flowEntries;
        public final /* synthetic */ boolean $isFullBleed;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<BRL<T>> list, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$flowEntries = list;
            this.$isFullBleed = z;
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
            ModalFlowSceneStrategyKt.ModalFlowPages(this.$flowEntries, this.$isFullBleed, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowSurface$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $isFullBleed;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismiss;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(Function0<Float> function0, boolean z, Function0<Unit> function02, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$progress = function0;
            this.$isFullBleed = z;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            ModalFlowSceneStrategyKt.ModalFlowSurface(this.$progress, this.$isFullBleed, this.$onDismiss, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final <T> void ModalFlowPages(List<BRL<T>> list, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1344487694);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0o(bfm, z);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AnonymousClass003.A0m(bfm, AuraPageCardKt.LocalAuraPageCardSuppressed.A04(true), new AnonymousClass1(list, bRg2, z), 2101793714);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(list, z, bRg2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v2, types: [androidx.compose.ui.Alignment] */
    /* JADX WARN: Type inference failed for: r26v1, types: [X.BRg] */
    /* JADX WARN: Type inference failed for: r38v0, types: [X.BFM] */
    public static final void ModalFlowSurface(Function0<Float> function0, boolean z, Function0<Unit> function02, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2;
        BRg bRgA09;
        BBI bbiA0M;
        Function0 function03;
        BRg bRgA00;
        BRg bRg3 = bRg;
        bfm.AgG(532877824);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0T |= 3072;
        } else if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0g(bfm, bRg3);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg3 = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120027);
            C1DM c1dm = AnonymousClass002.A0e(bfm).elevated;
            AKH<AuraColors> akh = AuraColorsKt.LocalAuraColors;
            long jA0F = C06G.A0F(bfm, akh);
            long j = AnonymousClass001.A0f(bfm, akh).scrim;
            BRg bRgA0T = AnonymousClass001.A0T(bRg3);
            if (z) {
                bbiA0M = AnonymousClass002.A0M(bfm, 764643184);
                bRgA09 = BRg.A00;
                bRg2 = bRgA09;
            } else {
                bfm.AgE(764721397);
                bRg2 = BRg.A00;
                boolean zA1B = AnonymousClass003.A1B(iA0T) | bfm.A64(j);
                Object objAaT = bfm.AaT();
                if (zA1B || objAaT == C78N.A00) {
                    objAaT = new ModalFlowSceneStrategyKt$ModalFlowSurface$1$1(j, function0);
                    bfm.Ai0(objAaT);
                }
                BRg bRgA01 = AEk.A01(bRg2, (G0U) objAaT);
                Object objAaT2 = bfm.AaT();
                Object obj = C78N.A00;
                BRg bRgA012 = C0v5.A01(null, (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT2, obj), bRgA01, new C1YD(0), null, function02, true);
                boolean zA65 = bfm.A65(strA01);
                Object objAaT3 = bfm.AaT();
                if (zA65 || objAaT3 == obj) {
                    objAaT3 = new ModalFlowSceneStrategyKt$ModalFlowSurface$3$1(strA01);
                    bfm.Ai0(objAaT3);
                }
                bRgA09 = C3U4.A09(BNH.A00(new C1OP(new C1OP(C1743Apg.A01(bfm).A0D, C1743Apg.A01(bfm).A01), C1743Apg.A01(bfm).A02), AnonymousClass001.A0Y(bRgA012, objAaT3, false)), 24.0f);
                bbiA0M = (BBI) bfm;
                BBI.A0R(bbiA0M, false);
            }
            BRg bRgThen = bRgA0T.then(bRgA09);
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            long j2 = bbiA0M.A06;
            int i4 = (int) (j2 ^ (j2 >>> 32));
            AKQ akqA04 = BBI.A04(bbiA0M);
            BRg bRgA013 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function04 = C1515AkP.A00;
            if (bbiA0M.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA0M, function04);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v2 = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA0a, g0v2);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v3 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v3, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA013, g0u);
            if (z) {
                bfm.AgE(-1123327851);
                boolean zA1F = AnonymousClass004.A1F(iA0T);
                Object objAaT4 = bfm.AaT();
                if (zA1F || objAaT4 == C78N.A00) {
                    objAaT4 = new ModalFlowSceneStrategyKt$ModalFlowSurface$4$1$1(function0);
                    bfm.Ai0(objAaT4);
                }
                bRgA00 = C1b8.A01(AnonymousClass001.A0W(bRg2, objAaT4), C06G.A0K(bfm, akh));
                BBI.A0R(bbiA0M, false);
                function03 = null;
            } else {
                bfm.AgE(-1123190304);
                function03 = null;
                BRg bRgA0A = C10G.A0A(C10G.A0D(bRg2, Float.NaN, 560.0f), Float.NaN, 650.0f);
                boolean zA1F2 = AnonymousClass004.A1F(iA0T);
                Object objAaT5 = bfm.AaT();
                if (zA1F2 || objAaT5 == C78N.A00) {
                    objAaT5 = new ModalFlowSceneStrategyKt$ModalFlowSurface$4$2$1(function0);
                    bfm.Ai0(objAaT5);
                }
                BRg bRgA02 = C1DI.A02(C1b8.A01(C11U.A03(AbstractC04540eo.A00(AnonymousClass001.A0W(bRgA0A, objAaT5), c1dm, 8.0f, 4, jA0F, jA0F), c1dm), C06G.A0K(bfm, akh)), c1dm, 1.0f, C06G.A0E(bfm, akh));
                Unit unit = Unit.INSTANCE;
                Object objAaT6 = bfm.AaT();
                if (objAaT6 == C78N.A00) {
                    objAaT6 = new PointerInputEventHandler() { // from class: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowSurface$4$3$1
                        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                        public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                            return AnonymousClass007.A0W(bRr, htJ, AnonymousClass1.INSTANCE);
                        }

                        /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategyKt$ModalFlowSurface$4$3$1$1, reason: invalid class name */
                        public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AWx, Unit> {
                            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

                            public AnonymousClass1() {
                                super(1);
                            }

                            @Override // X.G0U
                            public /* bridge */ /* synthetic */ Unit invoke(AWx aWx) {
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke-k-4lQ0M, reason: not valid java name */
                            public final void m1467invokek4lQ0M(long j) {
                            }
                        }
                    };
                    bfm.Ai0(objAaT6);
                }
                bRgA00 = AaM.A00(bRgA02, (PointerInputEventHandler) objAaT6, unit);
                BBI.A0R(bbiA0M, false);
            }
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
            int iA0D = AnonymousClass001.A0D(bbiA0M);
            AKQ akqA042 = BBI.A04(bbiA0M);
            BRg bRgA014 = AxM.A01(bfm, bRgA00);
            AnonymousClass005.A0n(bfm, bbiA0M, function04);
            BPg.A02(bfm, interfaceC1380AiAA0c, g0v2);
            BPg.A02(bfm, akqA042, g0v3);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA014, g0vA0u);
            C0z7 c0z7 = C0z7.A00;
            C3IL.A00(bfm, function03, function03, B1V.A00(bfm, new ModalFlowSceneStrategyKt$ModalFlowSurface$4$4$1(g0v), 514497118), 3072, 7, false);
            HatchToastHostKt.HatchToastHostOverlay(C3U4.A09(c0z7.A4C(C2VU.A06, bRg2), 16.0f), function03, bfm, 0, 2);
            AnonymousClass002.A0y(bbiA0M);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(function0, z, function02, bRg3, g0v, i, i2);
        }
    }
}
