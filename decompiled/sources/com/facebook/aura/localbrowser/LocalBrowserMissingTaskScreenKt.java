package com.facebook.aura.localbrowser;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOD;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C06I;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1er;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C5wL;
import X.C78N;
import X.C90l;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC0857A6e;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.browsertask.view.BrowserStopButtonKt;
import com.facebook.aura.browsertask.view.StopTaskConfirmationDialogKt;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.localbrowser.LocalBrowserMissingTaskViewModel;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.HatchScreenEmptyStateKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class LocalBrowserMissingTaskScreenKt {
    public static /* synthetic */ Unit $r8$lambda$ygEZPdoO__akYAdcc_UGck1G8eg(MutableState mutableState) {
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserMissingTaskScreen$lambda$7$0(LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel, MutableState mutableState) {
        MutableState.A09(false, mutableState);
        localBrowserMissingTaskViewModel.stop();
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserMissingTaskScreen$lambda$8$0(MutableState mutableState) {
        MutableState.A09(false, mutableState);
        return Unit.INSTANCE;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LocalBrowserTaskOutcome.values().length];
            try {
                AnonymousClass005.A0v(LocalBrowserTaskOutcome.STOPPED, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LocalBrowserStopStatus.values().length];
            try {
                AnonymousClass005.A0v(LocalBrowserStopStatus.FAILED, iArr2, 1);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A14(LocalBrowserStopStatus.STOPPING, iArr2);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A15(LocalBrowserStopStatus.REPORTING, iArr2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A16(LocalBrowserStopStatus.NONE, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final void LocalBrowserMissingTaskContent(final LocalBrowserMissingTaskUiState localBrowserMissingTaskUiState, final Function0<Unit> function0, final Function0<Unit> function02, BRg bRg, BFM bfm, final int i, final int i2) {
        int iLocalBrowserOutcomeRes;
        int i3;
        int i4;
        int iOrdinal;
        BRg bRg2 = bRg;
        bfm.AgG(430597500);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(localBrowserMissingTaskUiState, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i5 != 0) {
                bRg2 = BRg.A00;
            }
            LocalBrowserStopStatus localBrowserStopStatus = localBrowserMissingTaskUiState.stopStatus;
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int iOrdinal2 = localBrowserStopStatus.ordinal();
            if (iOrdinal2 == 3) {
                iLocalBrowserOutcomeRes = R.string._name_removed__res_0x7f120ca2;
            } else if (iOrdinal2 == 2 || iOrdinal2 == 1) {
                iLocalBrowserOutcomeRes = R.string._name_removed__res_0x7f120ca6;
            } else {
                if (iOrdinal2 != 0) {
                    throw C3cG.A0q();
                }
                LocalBrowserTaskOutcome localBrowserTaskOutcome = localBrowserMissingTaskUiState.outcome;
                iLocalBrowserOutcomeRes = (localBrowserTaskOutcome == null || (iOrdinal = localBrowserTaskOutcome.ordinal()) == -1) ? R.string._name_removed__res_0x7f120c8d : iOrdinal != 4 ? LocalBrowserTaskViewerKt.localBrowserOutcomeRes(localBrowserTaskOutcome) : R.string._name_removed__res_0x7f120ca5;
            }
            LocalBrowserStopStatus localBrowserStopStatus2 = localBrowserMissingTaskUiState.stopStatus;
            int iOrdinal3 = localBrowserStopStatus2.ordinal();
            if (iOrdinal3 == 3) {
                i3 = R.string._name_removed__res_0x7f120ca1;
            } else if (iOrdinal3 == 2 || iOrdinal3 == 1) {
                i3 = R.string._name_removed__res_0x7f120ca3;
            } else {
                if (iOrdinal3 != 0) {
                    throw C3cG.A0q();
                }
                LocalBrowserTaskOutcome localBrowserTaskOutcome2 = localBrowserMissingTaskUiState.outcome;
                i3 = R.string._name_removed__res_0x7f120c8b;
                if (localBrowserTaskOutcome2 != null) {
                    i3 = R.string._name_removed__res_0x7f120c9d;
                }
            }
            if (localBrowserStopStatus2 == LocalBrowserStopStatus.FAILED) {
                i4 = R.drawable.exclamation_circle_outline;
            } else {
                LocalBrowserTaskOutcome localBrowserTaskOutcome3 = localBrowserMissingTaskUiState.outcome;
                LocalBrowserTaskOutcome localBrowserTaskOutcome4 = LocalBrowserTaskOutcome.STOPPED;
                i4 = R.drawable.globe_wght400_outline_24;
                if (localBrowserTaskOutcome3 == localBrowserTaskOutcome4) {
                    i4 = R.drawable.hatch_stop_square;
                }
            }
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new G0U() { // from class: com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$$ExternalSyntheticLambda0
                    @Override // X.G0U
                    public final Object invoke(Object obj) {
                        AnonymousClass002.A11((InterfaceC0857A6e) obj);
                        return Unit.INSTANCE;
                    }
                };
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRg2, objAaT, false);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, iLocalBrowserOutcomeRes);
            String strA012 = AbstractC2271BQs.A01(bfm, i3);
            AVy aVyA00 = BOf.A00(bfm, i4, 0);
            C1062ATq c1062ATq = C10G.A02;
            HatchScreenEmptyStateKt.HatchScreenEmptyState(strA01, c1062ATq, aVyA00, strA012, bfm, (AVy.$stable << 6) | 48, 0);
            LocalBrowserStopStatus localBrowserStopStatus3 = localBrowserMissingTaskUiState.stopStatus;
            if (localBrowserStopStatus3 == LocalBrowserStopStatus.STOPPING || localBrowserStopStatus3 == LocalBrowserStopStatus.REPORTING) {
                bfm.AgE(-1242326660);
            } else {
                bfm.AgE(-1243049332);
                if (!localBrowserMissingTaskUiState.canStop || localBrowserMissingTaskUiState.stopStatus == LocalBrowserStopStatus.FAILED) {
                    bfm.AgE(-1242799906);
                    boolean z = localBrowserMissingTaskUiState.canStop;
                    int i6 = R.string._name_removed__res_0x7f120c83;
                    if (z) {
                        i6 = R.string._name_removed__res_0x7f120c9e;
                    }
                    String strA013 = AbstractC2271BQs.A01(bfm, i6);
                    Function0<Unit> function04 = function02;
                    if (localBrowserMissingTaskUiState.canStop) {
                        function04 = function0;
                    }
                    AuraButtonKt.m2408AuraButtonnL3aKkM(null, strA013, null, C3U4.A07(c1062ATq, AuraDimensKt.SpacingMedium), AuraButtonStyles.INSTANCE.secondary(null, bfm, 48, 1), AuraButtonSize.MEDIUM, null, false, false, false, false, false, null, null, function04, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 196608, 0, 0, 134201285);
                } else {
                    bfm.AgE(-1242984356);
                    BrowserStopButtonKt.BrowserStopButton(function0, C3U4.A07(c1062ATq, AuraDimensKt.SpacingMedium), false, bfm, (iA05 >> 3) & 14, 4);
                }
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, false);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$$ExternalSyntheticLambda1
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    LocalBrowserMissingTaskUiState localBrowserMissingTaskUiState2 = localBrowserMissingTaskUiState;
                    Function0 function05 = function0;
                    Function0 function06 = function02;
                    BRg bRg4 = bRg3;
                    int i7 = i;
                    LocalBrowserMissingTaskScreenKt.LocalBrowserMissingTaskContent(localBrowserMissingTaskUiState2, function05, function06, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i7), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void LocalBrowserMissingTaskScreen(final String str, final Function0<Unit> function0, BRg bRg, BFM bfm, final int i, final int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(str, function0);
        bfm.AgG(1190514585);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, function0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            LocalBrowserMissingTaskViewModel.Factory factory = new LocalBrowserMissingTaskViewModel.Factory(AnonymousClass002.A0h(bfm), str);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            final LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel = (LocalBrowserMissingTaskViewModel) AnonymousClass003.A0Y(factory, bodA00, AnonymousClass005.A0Y(bodA00), LocalBrowserMissingTaskViewModel.class, str);
            final C1BO c1boA02 = C2CK.A02(bfm, localBrowserMissingTaskViewModel.uiState);
            int i4 = iA0d >> 3;
            MutableState mutableStateA00 = C1er.A00(bfm, function0);
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = AnonymousClass005.A0S(bfm, zA1b);
            }
            final MutableState mutableState = (MutableState) objAaT;
            boolean zA1N = AnonymousClass003.A1N(bfm, localBrowserMissingTaskViewModel, mutableStateA00);
            Object objAaT2 = bfm.AaT();
            if (zA1N || objAaT2 == C78N.A00) {
                objAaT2 = new LocalBrowserMissingTaskScreenKt$LocalBrowserMissingTaskScreen$1$1(localBrowserMissingTaskViewModel, mutableStateA00, null);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A18(bfm, objAaT2, localBrowserMissingTaskViewModel);
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120ca8), null, function0, null, zA1b, zA1b, zA1b ? 1 : 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, zA1b ? 1 : 0, null, null, null, zA1b, B1V.A00(bfm, new G2j() { // from class: com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$$ExternalSyntheticLambda3
                @Override // X.G2j
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    return LocalBrowserMissingTaskScreenKt.LocalBrowserMissingTaskScreen$lambda$6(c1boA02, localBrowserMissingTaskViewModel, mutableState, function0, (C1DG) obj, (C1DG) obj2, (BFM) obj3, AnonymousClass001.A0F(obj4));
                }
            }, 1577055540), bfm, AnonymousClass001.A05(iA0d << 15, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), zA1b ? 1 : 0, 805306368, 536870828);
            if (MutableState.A0A(mutableState) && ((LocalBrowserMissingTaskUiState) c1boA02.getValue()).canStop) {
                bfm.AgE(-1218403183);
                boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, localBrowserMissingTaskViewModel);
                Object objAaT3 = bfm.AaT();
                if (zA1J || objAaT3 == C78N.A00) {
                    objAaT3 = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return LocalBrowserMissingTaskScreenKt.LocalBrowserMissingTaskScreen$lambda$7$0(localBrowserMissingTaskViewModel, mutableState);
                        }
                    };
                    bfm.Ai0(objAaT3);
                }
                Function0 function02 = (Function0) objAaT3;
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT4 = bfm.AaT();
                if (zA65 || objAaT4 == C78N.A00) {
                    objAaT4 = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            MutableState.A09(false, mutableState);
                            return Unit.INSTANCE;
                        }
                    };
                    bfm.Ai0(objAaT4);
                }
                StopTaskConfirmationDialogKt.StopTaskConfirmationDialog(function02, (Function0) objAaT4, null, bfm, zA1b ? 1 : 0, 4);
            } else {
                bfm.AgE(-1218226359);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final BRg bRg3 = bRg2;
            bBbAAc.A06 = new G0V() { // from class: com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$$ExternalSyntheticLambda6
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    String str2 = str;
                    Function0 function03 = function0;
                    BRg bRg4 = bRg3;
                    int i5 = i;
                    LocalBrowserMissingTaskScreenKt.LocalBrowserMissingTaskScreen(str2, function03, bRg4, (BFM) obj, AnonymousClass011.A02(obj2, i5), i2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final Unit LocalBrowserMissingTaskScreen$lambda$6(final C1BO c1bo, final LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel, final MutableState mutableState, Function0 function0, C1DG c1dg, C1DG c1dg2, BFM bfm, int i) {
        int iA04 = (i & 6) == 0 ? i | AnonymousClass004.A04(bfm, c1dg.A00) : i;
        if ((i & 48) == 0) {
            iA04 |= AnonymousClass004.A05(bfm, c1dg2.A00);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
            BS0 bs0 = BRg.A00;
            C1062ATq c1062ATq = C10G.A01;
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, c1062ATq);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            C90l c90l = C90l.A00;
            C01N.A08(bfm, bs0, c1dg.A00);
            LocalBrowserMissingTaskUiState localBrowserMissingTaskUiState = (LocalBrowserMissingTaskUiState) c1bo.getValue();
            boolean zA1O = AnonymousClass003.A1O(bfm, localBrowserMissingTaskViewModel, mutableState, bfm.A65(c1bo));
            Object objAaT = bfm.AaT();
            if (zA1O || objAaT == C78N.A00) {
                objAaT = new Function0() { // from class: com.facebook.aura.localbrowser.LocalBrowserMissingTaskScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LocalBrowserMissingTaskScreenKt.LocalBrowserMissingTaskScreen$lambda$6$0$0$0(localBrowserMissingTaskViewModel, c1bo, mutableState);
                    }
                };
                bfm.Ai0(objAaT);
            }
            BRg bRgA0R = AnonymousClass001.A0R(c90l.AiP(bs0, 1.0f, true));
            float f = AuraDimensKt.SpacingMedium;
            LocalBrowserMissingTaskContent(localBrowserMissingTaskUiState, (Function0) objAaT, function0, C10G.A0D(AnonymousClass005.A0T(bfm, C10G.A02(C2VU.A09, C3U4.A07(bRgA0R, f), false)), Float.NaN, 360.0f), bfm, LocalBrowserMissingTaskUiState.$stable, 0);
            C01N.A04(bfm, bbi, bs0, c1dg2.A00 + f, true);
        } else {
            bfm.Afo();
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Unit $r8$lambda$ztGZAAvnxpHJvEOc13hZc3KXsEg(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserMissingTaskContent$lambda$0$0(InterfaceC0857A6e interfaceC0857A6e) {
        AnonymousClass002.A11(interfaceC0857A6e);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserMissingTaskContent$lambda$2(LocalBrowserMissingTaskUiState localBrowserMissingTaskUiState, Function0 function0, Function0 function02, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserMissingTaskContent(localBrowserMissingTaskUiState, function0, function02, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserMissingTaskScreen$lambda$6$0$0$0(LocalBrowserMissingTaskViewModel localBrowserMissingTaskViewModel, C1BO c1bo, MutableState mutableState) {
        if (((LocalBrowserMissingTaskUiState) c1bo.getValue()).stopStatus == LocalBrowserStopStatus.FAILED) {
            localBrowserMissingTaskViewModel.stop();
        } else {
            MutableState.A09(true, mutableState);
        }
        return Unit.INSTANCE;
    }

    public static final Unit LocalBrowserMissingTaskScreen$lambda$9(String str, Function0 function0, BRg bRg, int i, int i2, BFM bfm, int i3) {
        LocalBrowserMissingTaskScreen(str, function0, bRg, bfm, AnonymousClass011.A00(i), i2);
        return Unit.INSTANCE;
    }
}
