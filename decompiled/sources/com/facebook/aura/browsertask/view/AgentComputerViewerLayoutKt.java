package com.facebook.aura.browsertask.view;

import X.AEk;
import X.AKO;
import X.AKQ;
import X.APt;
import X.APu;
import X.AR9;
import X.ARC;
import X.AW9;
import X.AXN;
import X.AaI;
import X.AaM;
import X.AbstractC04661Bq;
import X.AbstractC07117nq;
import X.AbstractC1011APs;
import X.AbstractC2271BQs;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BRr;
import X.C00x;
import X.C1003AOr;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C16Z;
import X.C1BO;
import X.C1Cd;
import X.C1DG;
import X.C1er;
import X.C3U4;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C78e;
import X.C8j3;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.G2j;
import X.HtJ;
import X.HzP;
import X.InterfaceC1074AXb;
import X.InterfaceC1279AgP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.facebook.aura.R;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import com.facebook.aura.ui.adaptive.AuraContentFrameKt;
import com.facebook.aura.ui.adaptive.AuraContentRole;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class AgentComputerViewerLayoutKt {

    @DebugMetadata(c = "com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt", f = "AgentComputerViewerLayout.kt", l = {284}, m = "awaitTapUp", v = 2)
    /* renamed from: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$awaitTapUp$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AgentComputerViewerLayoutKt.awaitTapUp(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    public static /* synthetic */ int $r8$lambda$9j540jzK6dXR3poKo14BnrVj1n8(int i, int i2) {
        return -(i2 + i);
    }

    public static /* synthetic */ int $r8$lambda$Fm1afGYQ3vV89ZfyQNUxzrxuti4(int i, int i2) {
        return -(i2 + i);
    }

    /* renamed from: $r8$lambda$MG1D9mdAvp-NVo7hNPy4sIlvP-I, reason: not valid java name */
    public static /* synthetic */ Unit m313$r8$lambda$MG1D9mdAvpNVo7hNPy4sIlvPI(MutableState mutableState) {
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$acvV89dy0U2aKsh-NfV77guo-mY, reason: not valid java name */
    public static /* synthetic */ boolean m315$r8$lambda$acvV89dy0U2aKshNfV77guomY(boolean z) {
        return z;
    }

    public static final Unit AgentComputerViewerLayout$lambda$4$0$0(MutableState mutableState) {
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    public static final boolean AgentComputerViewerLayout$lambda$4$1$1$0(boolean z) {
        return z;
    }

    public static final int PreviewTopBanners$lambda$1$0$0(int i, int i2) {
        return -(i2 + i);
    }

    public static final int PreviewTopBanners$lambda$1$1$0(int i, int i2) {
        return -(i2 + i);
    }

    public static final Unit clipAbove_3ABfNKs$lambda$0(float f, C16Z c16z) {
        C7384Etj.A0Y(c16z, 1);
        float f2 = -c16z.Ah4(f);
        long jAKb = c16z.AKb();
        float fA03 = AnonymousClass003.A03(jAKb);
        float f3 = -fA03;
        float f4 = fA03 * 2.0f;
        float fA00 = AnonymousClass004.A00(jAKb) * 2.0f;
        InterfaceC1279AgP interfaceC1279AgPAEq = c16z.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            aaI.A01.A6N(f3, f2, f4, fA00, 1);
            c16z.A9O();
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            throw th;
        }
    }

    /* renamed from: $r8$lambda$AeY968z-Sd8ELhTSwB1sBYahXss, reason: not valid java name */
    public static /* synthetic */ Unit m312$r8$lambda$AeY968zSd8ELhTSwB1sBYahXss(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ int $r8$lambda$VSCJ0wD9ff2X7xuehllzRjsNA0k(int i, int i2) {
        return i2 + i;
    }

    public static /* synthetic */ int $r8$lambda$axkkGKmacW27mHEm8mIgbEQO_i8(int i, int i2) {
        return i2 + i;
    }

    public static final Unit AgentComputerViewerLayout$lambda$3(boolean z, Function0 function0, Function0 function02, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
            if (z) {
                bfm.AgE(1265234852);
                AnonymousClass005.A0o(bfm, BOf.A00(bfm, R.drawable.aura_checkmark_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120198), function0);
            } else if (function02 != null) {
                bfm.AgE(1265556601);
                AnonymousClass005.A0o(bfm, BOf.A00(bfm, R.drawable.arrow_share_wght400_outline_24, 0), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1201a4), function02);
            } else {
                bfm.AgE(1265852589);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AgentComputerViewerLayout$lambda$4$1$2(Function0 function0, boolean z, G0W g0w, C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            BrowserTakeoverControlsKt.BrowserTakeoverControls(function0, z, HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(BRg.A00, true, bfm, 54, 0), g0w, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final void PreviewStopButton(final boolean z, final boolean z2, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        APu aPuA09;
        APt aPtA0I;
        BRg bRg2 = bRg;
        bfm.AgG(-173917533);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0n |= 3072;
        } else if ((i & 3072) == 0) {
            iA0n |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AXN axnA04 = AKO.A04(Am0.A04, bbi);
            float f = AuraDimensKt.SpacingMedium;
            final int iAbr = axnA04.Abr(f);
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0R(bRg2), f);
            if (z2) {
                bfm.AgE(368986635);
                BBI.A0R(bbi, false);
                aPuA09 = AbstractC1011APs.A04(C1003AOr.A00(null), 0.0f);
                bfm.AgE(368989260);
                BBI.A0R(bbi, false);
                aPtA0I = AbstractC1011APs.A0E(C1003AOr.A00(null));
            } else {
                bfm.AgE(368987113);
                boolean zA63 = bfm.A63(iAbr);
                Object objAaT = bfm.AaT();
                if (zA63 || objAaT == C78N.A00) {
                    objAaT = new G0U() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda1
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(AnonymousClass001.A0F(obj) + iAbr);
                        }
                    };
                    BBI.A0O(bbi, objAaT);
                }
                aPuA09 = AbstractC1011APs.A09(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), (G0U) objAaT);
                BBI.A0R(bbi, false);
                bfm.AgE(368989770);
                boolean zA632 = bfm.A63(iAbr);
                Object objAaT2 = bfm.AaT();
                if (zA632 || objAaT2 == C78N.A00) {
                    objAaT2 = new G0U() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda2
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(AnonymousClass001.A0F(obj) + iAbr);
                        }
                    };
                    BBI.A0O(bbi, objAaT2);
                }
                aPtA0I = AbstractC1011APs.A0I(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), (G0U) objAaT2);
                BBI.A0R(bbi, false);
            }
            AbstractC04661Bq.A08(aPuA09, aPtA0I, bfm, bRgA09, null, B1V.A00(bfm, new G0W() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda3
                @Override // X.G0W
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return AgentComputerViewerLayoutKt.PreviewStopButton$lambda$3(function0, (C1Cd) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
                }
            }, 1314020555), (iA0n & 14) | 196608, 16, z);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda4
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3 = z;
                    boolean z4 = z2;
                    Function0 function02 = function0;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    AgentComputerViewerLayoutKt.PreviewStopButton(z3, z4, function02, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final int PreviewStopButton$lambda$1$0(int i, int i2) {
        return i2 + i;
    }

    public static final int PreviewStopButton$lambda$2$0(int i, int i2) {
        return i2 + i;
    }

    public static final Unit PreviewStopButton$lambda$3(final Function0 function0, C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
            boolean zA1X = AnonymousClass002.A1X(function0);
            BRg bRgTrackFloatingChromeObstacle = HatchFloatingChromeGeometryKt.trackFloatingChromeObstacle(AnonymousClass001.A0R(AuraContentFrameKt.auraContentWidth(BRg.A00, AuraContentRole.Focused, bfm, 54)), true, bfm, 48, 0);
            boolean zA65 = bfm.A65(function0);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function0 function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                        return Unit.INSTANCE;
                    }
                };
                BBI.A0T(bfm, objAaT);
            }
            BrowserStopButtonKt.BrowserStopButton((Function0) objAaT, bRgTrackFloatingChromeObstacle, zA1X, bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit PreviewStopButton$lambda$3$0$0(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    public static final void PreviewTopBanners(final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, final G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w2, final boolean z, final boolean z2, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-2063516027);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, g0w) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, g0w2);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0q(bfm, z2);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0X(bfm, function0);
        }
        int i3 = i2 & 32;
        int iA0i = 196608;
        if (i3 != 0) {
            iA0T |= iA0i;
        } else if ((196608 & i) == 0) {
            iA0i = AnonymousClass004.A0i(bfm, bRg2);
            iA0T |= iA0i;
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(74899 & iA0T, 74898), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BBI bbi = (BBI) bfm;
            AXN axnA04 = AKO.A04(Am0.A04, bbi);
            float f = AuraDimensKt.SpacingSmall;
            final int iAbr = axnA04.Abr(f);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f2 = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRgThen, f2, f, f2, 0.0f);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0C);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            if (g0w != null) {
                bfm.AgE(632961286);
                AnonymousClass001.A1G(c1062ATq, bfm, g0w, ((iA0T << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            } else {
                BRg bRgM317clipAbove3ABfNKs = m317clipAbove3ABfNKs(C3cG.A09(bfm, 633027843), f);
                boolean zA63 = bfm.A63(iAbr);
                Object objAaT = bfm.AaT();
                if (zA63 || objAaT == C78N.A00) {
                    objAaT = new G0U() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda6
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(-(AnonymousClass001.A0F(obj) + iAbr));
                        }
                    };
                    BBI.A0O(bbi, objAaT);
                }
                APu aPuA09 = AbstractC1011APs.A09(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), (G0U) objAaT);
                boolean zA632 = bfm.A63(iAbr);
                Object objAaT2 = bfm.AaT();
                if (zA632 || objAaT2 == C78N.A00) {
                    objAaT2 = new G0U() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda7
                        @Override // X.G0U
                        public final Object invoke(Object obj) {
                            return Integer.valueOf(-(AnonymousClass001.A0F(obj) + iAbr));
                        }
                    };
                    BBI.A0O(bbi, objAaT2);
                }
                AbstractC04661Bq.A06(aPuA09, AbstractC1011APs.A0I(C1003AOr.A00(C8j3.A0l(C8j3.A0N())), (G0U) objAaT2), c90l, bfm, bRgM317clipAbove3ABfNKs, null, B1V.A00(bfm, new G0W() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda8
                    @Override // X.G0W
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return AgentComputerViewerLayoutKt.PreviewTopBanners$lambda$1$2(g0w2, z2, function0, (C1Cd) obj, (BFM) obj2, AnonymousClass001.A0F(obj3));
                    }
                }, 564485843), 1572870 | ((iA0T >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 16, z);
            }
            AnonymousClass003.A0q(bbi);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda9
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    G0W g0w3 = g0w;
                    G0W g0w4 = g0w2;
                    boolean z3 = z;
                    boolean z4 = z2;
                    Function0 function03 = function0;
                    BRg bRg4 = bRg3;
                    int i4 = i;
                    AgentComputerViewerLayoutKt.PreviewTopBanners(g0w3, g0w4, z3, z4, function03, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i4), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0074 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object awaitTapUp(X.InterfaceC1074AXb r9, X.C1299Agk r10, X.HtJ<? super java.lang.Boolean> r11) {
        /*
            boolean r0 = r11 instanceof com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt.AnonymousClass1
            if (r0 == 0) goto L77
            r5 = r11
            com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$awaitTapUp$1 r5 = (com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L77
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L65
            if (r0 != r4) goto L7d
            java.lang.Object r10 = r5.L$1
            X.Agk r10 = (X.C1299Agk) r10
            java.lang.Object r0 = r5.L$0
            X.AXb r9 = X.C8j3.A0g(r0, r1)
        L27:
            X.Afe r1 = (X.C1247Afe) r1
            java.util.List<X.Agk> r0 = r1.A05
            java.lang.Object r7 = X.AbstractC0878AGe.A0K(r0)
            X.Agk r7 = (X.C1299Agk) r7
            if (r7 == 0) goto L63
            long r2 = r7.A08
            long r0 = r10.A08
            int r8 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r8 != 0) goto L63
            long r2 = r7.A0A
            long r0 = r10.A0A
            long r0 = X.AWx.A04(r2, r0)
            float r1 = X.AWx.A00(r0)
            r0 = r9
            androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
            X.AaN r0 = r0.A04
            float r0 = X.AnonymousClass006.A01(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L63
            boolean r0 = r7.A0F
            if (r0 != 0) goto L68
            boolean r0 = r7.A03()
            r0 = r0 ^ 1
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            return r6
        L63:
            r0 = 0
            goto L5e
        L65:
            X.Hwg.A00(r1)
        L68:
            X.AXj r0 = X.EnumC1080AXj.A03
            r5.L$0 = r9
            r5.L$1 = r10
            r5.label = r4
            java.lang.Object r1 = r9.A4z(r0, r5)
            if (r1 != r6) goto L27
            return r6
        L77:
            com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$awaitTapUp$1 r5 = new com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$awaitTapUp$1
            r5.<init>(r11)
            goto L12
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt.awaitTapUp(X.AXb, X.Agk, X.HtJ):java.lang.Object");
    }

    /* renamed from: clipAbove-3ABfNKs, reason: not valid java name */
    public static final BRg m317clipAbove3ABfNKs(BRg bRg, final float f) {
        return AEk.A03(bRg, new G0U() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda16
            @Override // X.G0U
            public final Object invoke(Object obj) {
                return AgentComputerViewerLayoutKt.clipAbove_3ABfNKs$lambda$0(f, (C16Z) obj);
            }
        });
    }

    public static final BRg trackControlsTouches(BRg bRg, final MutableState<Boolean> mutableState) {
        return AaM.A00(bRg, new PointerInputEventHandler() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt.trackControlsTouches.1

            @DebugMetadata(c = "com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$trackControlsTouches$1$1", f = "AgentComputerViewerLayout.kt", l = {266, 268, 275}, m = "invokeSuspend", v = 2)
            /* renamed from: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$trackControlsTouches$1$1, reason: invalid class name and collision with other inner class name */
            public final class C00541 extends AbstractC07117nq implements G0V<InterfaceC1074AXb, HtJ<? super Unit>, Object> {
                public final /* synthetic */ MutableState<Boolean> $chromeVisible;
                public /* synthetic */ Object L$0;
                public Object L$1;
                public boolean Z$0;
                public boolean Z$1;
                public int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C00541(MutableState<Boolean> mutableState, HtJ<? super C00541> htJ) {
                    super(2, htJ);
                    this.$chromeVisible = mutableState;
                }

                @Override // X.AbstractC8884Fsp
                public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
                    C00541 c00541 = new C00541(this.$chromeVisible, htJ);
                    c00541.L$0 = obj;
                    return c00541;
                }

                /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
                /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
                @Override // X.AbstractC8884Fsp
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r7 = r10.L$0
                        X.AXb r7 = (X.InterfaceC1074AXb) r7
                        X.Hji r6 = X.EnumC10460Hji.A02
                        int r0 = r10.label
                        r5 = 0
                        r4 = 3
                        r9 = 2
                        r3 = 0
                        r8 = 1
                        if (r0 == 0) goto L27
                        if (r0 == r8) goto L37
                        if (r0 == r9) goto L52
                        if (r0 != r4) goto L8e
                        boolean r8 = r10.Z$1
                        X.Hwg.A00(r11)
                    L1a:
                        androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r10.$chromeVisible
                        if (r11 != 0) goto L21
                        if (r8 != 0) goto L21
                        r3 = 1
                    L21:
                        androidx.compose.runtime.MutableState.A09(r3, r0)
                    L24:
                        kotlin.Unit r6 = kotlin.Unit.INSTANCE
                        return r6
                    L27:
                        X.Hwg.A00(r11)
                        X.AXj r0 = X.EnumC1080AXj.A03
                        r10.L$0 = r7
                        r10.label = r8
                        java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A04(r7, r0, r10, r3)
                        if (r11 != r6) goto L3a
                        return r6
                    L37:
                        X.Hwg.A00(r11)
                    L3a:
                        X.Agk r11 = (X.C1299Agk) r11
                        long r0 = X.AnonymousClass007.A0D(r7)
                        com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$trackControlsTouches$1$1$tapped$1 r2 = new com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$trackControlsTouches$1$1$tapped$1
                        r2.<init>(r11, r5)
                        r10.L$0 = r7
                        r10.L$1 = r5
                        r10.label = r9
                        java.lang.Object r11 = r7.AiU(r10, r2, r0)
                        if (r11 != r6) goto L55
                        return r6
                    L52:
                        X.Hwg.A00(r11)
                    L55:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
                        boolean r9 = X.C7384Etj.areEqual(r11, r0)
                        androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r10.$chromeVisible
                        if (r9 != 0) goto L65
                        androidx.compose.runtime.MutableState.A09(r3, r0)
                        goto L24
                    L65:
                        boolean r8 = androidx.compose.runtime.MutableState.A0A(r0)
                        r0 = r7
                        androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine r0 = (androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine) r0
                        X.AaN r0 = r0.A04
                        X.AjM r0 = X.AbstractC1414Aij.A04(r0)
                        X.AXi r0 = r0.A0E
                        long r1 = r0.AEp()
                        com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1 r0 = new com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$trackControlsTouches$1$1$secondTap$1
                        r0.<init>(r5)
                        r10.L$0 = r5
                        r10.L$1 = r5
                        r10.Z$0 = r9
                        r10.Z$1 = r8
                        r10.label = r4
                        java.lang.Object r11 = r7.AiU(r10, r0, r1)
                        if (r11 != r6) goto L1a
                        return r6
                    L8e:
                        java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
                        throw r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt.C109981.C00541.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                @Override // X.G0V
                public final Object invoke(InterfaceC1074AXb interfaceC1074AXb, HtJ<? super Unit> htJ) {
                    return ((C00541) create(interfaceC1074AXb, htJ)).invokeSuspend(Unit.INSTANCE);
                }
            }

            @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
            public final Object invoke(BRr bRr, HtJ<? super Unit> htJ) {
                return AnonymousClass006.A0l(bRr, htJ, new C00541(mutableState, null));
            }
        }, mutableState);
    }

    public static final float AgentComputerViewerLayout$lambda$1(C1BO<C1DG> c1bo) {
        return c1bo.getValue().A00;
    }

    public static final Unit AgentComputerViewerLayout$lambda$5(String str, String str2, boolean z, boolean z2, Function0 function0, Function0 function02, Function0 function03, Function0 function04, BRg bRg, boolean z3, Function0 function05, G0W g0w, G0W g0w2, G0W g0w3, G2j g2j, int i, int i2, int i3, BFM bfm, int i4) {
        AgentComputerViewerLayout(str, str2, z, z2, function0, function02, function03, function04, bRg, z3, function05, g0w, g0w2, g0w3, g2j, bfm, AnonymousClass011.A00(i), AnonymousClass011.A01(i2), i3);
        return Unit.INSTANCE;
    }

    public static final void ControlsAutoHideEffect(final boolean z, final boolean z2, final Function0<Unit> function0, BFM bfm, final int i) {
        long j;
        bfm.AgG(1872759140);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0o(bfm, z2);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, function0);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0n & 147, 146), bfm, iA0n)) {
            BBI bbi = (BBI) bfm;
            AR9 ar9 = (AR9) AKO.A07(Am0.A00, bbi);
            if (ar9 != null) {
                int recommendedTimeoutMillis = ((ARC) ar9).A00.getRecommendedTimeoutMillis(5000, 6);
                j = recommendedTimeoutMillis == Integer.MAX_VALUE ? LinkEncryptedPairingKt.LINK_COUNTER_MAX : recommendedTimeoutMillis;
            } else {
                j = 5000;
            }
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            Boolean boolValueOf = Boolean.valueOf(z);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            Long lValueOf = Long.valueOf(j);
            boolean zA1W = AnonymousClass002.A1W(bfm, mutableStateA00, AnonymousClass003.A1B(iA0n) | AnonymousClass001.A1O(iA0n), bfm.A64(j));
            Object objAaT = bfm.AaT();
            if (zA1W || objAaT == C78N.A00) {
                objAaT = new AgentComputerViewerLayoutKt$ControlsAutoHideEffect$1$1(z, z2, j, mutableStateA00, null);
                BBI.A0O(bbi, objAaT);
            }
            C78e.A02(bfm, boolValueOf, boolValueOf2, lValueOf, (G0V) objAaT);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$$ExternalSyntheticLambda0
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    AgentComputerViewerLayoutKt.ControlsAutoHideEffect(z, z2, function0, (BFM) obj, AnonymousClass011.A00(i));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit ControlsAutoHideEffect$lambda$2(boolean z, boolean z2, Function0 function0, int i, BFM bfm, int i2) {
        ControlsAutoHideEffect(z, z2, function0, bfm, AnonymousClass011.A00(i));
        return Unit.INSTANCE;
    }

    public static final Unit PreviewStopButton$lambda$4(boolean z, boolean z2, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        PreviewStopButton(z, z2, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit PreviewTopBanners$lambda$1$2(G0W g0w, boolean z, Function0 function0, C1Cd c1Cd, BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
            if (g0w != null) {
                bfm.AgE(1800824562);
                AnonymousClass001.A1G(C10G.A02, bfm, g0w, 6);
            } else {
                bfm.AgE(1800894963);
                BrowserTakeoverBannerKt.BrowserTakeoverBanner(z, function0, C10G.A02, bfm, 384, 0);
            }
            AnonymousClass002.A19(bfm);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static final Unit PreviewTopBanners$lambda$2(G0W g0w, G0W g0w2, boolean z, boolean z2, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        PreviewTopBanners(g0w, g0w2, z, z2, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0158  */
    /* JADX WARN: Type inference failed for: r6v31, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r6v32, types: [androidx.compose.runtime.snapshots.Snapshot] */
    /* JADX WARN: Type inference failed for: r6v33, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r70v0, types: [X.BFM, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt$AgentComputerViewerLayout$$inlined$animateDp$1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AgentComputerViewerLayout(final java.lang.String r55, final java.lang.String r56, final boolean r57, final boolean r58, final kotlin.jvm.functions.Function0<kotlin.Unit> r59, final kotlin.jvm.functions.Function0<kotlin.Unit> r60, final kotlin.jvm.functions.Function0<kotlin.Unit> r61, final kotlin.jvm.functions.Function0<kotlin.Unit> r62, X.BRg r63, boolean r64, kotlin.jvm.functions.Function0<kotlin.Unit> r65, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r66, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r67, X.G0W<? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r68, final X.G2j<? super X.C1DG, ? super X.BRg, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r69, X.BFM r70, final int r71, final int r72, final int r73) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt.AgentComputerViewerLayout(java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.BRg, boolean, kotlin.jvm.functions.Function0, X.G0W, X.G0W, X.G0W, X.G2j, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit AgentComputerViewerLayout$lambda$4(final androidx.compose.runtime.MutableState r21, boolean r22, boolean r23, X.AOP r24, final kotlin.jvm.functions.Function0 r25, X.G0W r26, X.G0W r27, boolean r28, kotlin.jvm.functions.Function0 r29, X.G2j r30, final X.G0W r31, X.C1DG r32, X.C1DG r33, X.BFM r34, int r35) {
        /*
            Method dump skipped, instructions count: 435
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.browsertask.view.AgentComputerViewerLayoutKt.AgentComputerViewerLayout$lambda$4(androidx.compose.runtime.MutableState, boolean, boolean, X.AOP, kotlin.jvm.functions.Function0, X.G0W, X.G0W, boolean, kotlin.jvm.functions.Function0, X.G2j, X.G0W, X.1DG, X.1DG, X.BFM, int):kotlin.Unit");
    }
}
