package com.facebook.aura.widgets;

import X.AHD;
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
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C10G;
import X.C1515AkP;
import X.C1BO;
import X.C1DG;
import X.C1YL;
import X.C1YY;
import X.C2CK;
import X.C2VU;
import X.C3U4;
import X.C7384Etj;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G2j;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.header.view.HatchPageScreenKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.spaces.repo.SpaceCard;
import com.facebook.aura.vds.compose.spinner.AuraSpinnerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.widgets.SpaceWidgetPickerUiState;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class SpaceWidgetPickerScreenKt {

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerLoading$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
            super(2);
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
            SpaceWidgetPickerScreenKt.SpaceWidgetPickerLoading(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerMessage$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$text = str;
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
            SpaceWidgetPickerScreenKt.SpaceWidgetPickerMessage(this.$text, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerScreen$1, reason: invalid class name and case insensitive filesystem */
    public final class C144091 extends AbstractC7559F3s implements G2j<C1DG, C1DG, BFM, Integer, Unit> {
        public final /* synthetic */ G0U<SpaceCard, Unit> $onSpacePicked;
        public final /* synthetic */ C1BO<SpaceWidgetPickerUiState> $uiState$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C144091(G0U<? super SpaceCard, Unit> g0u, C1BO<? extends SpaceWidgetPickerUiState> c1bo) {
            super(4);
            this.$onSpacePicked = g0u;
            this.$uiState$delegate = c1bo;
        }

        @Override // X.G2j
        public /* bridge */ /* synthetic */ Unit invoke(C1DG c1dg, C1DG c1dg2, BFM bfm, Integer num) {
            m3162invokei1RSzL4(c1dg.A00, c1dg2.A00, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* renamed from: invoke-i1RSzL4, reason: not valid java name */
        public final void m3162invokei1RSzL4(float f, float f2, BFM bfm, int i) {
            String strA01;
            int iA04 = (i & 6) == 0 ? AnonymousClass004.A04(bfm, f) | i : i;
            if ((i & 48) == 0) {
                iA04 |= AnonymousClass004.A05(bfm, f2);
            }
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(iA04 & 147, 146), bfm, iA04)) {
                bfm.Afo();
                return;
            }
            SpaceWidgetPickerUiState value = this.$uiState$delegate.getValue();
            if (C7384Etj.areEqual(value, SpaceWidgetPickerUiState.Loading.INSTANCE)) {
                bfm.AgE(967225252);
                SpaceWidgetPickerScreenKt.SpaceWidgetPickerLoading(null, bfm, 0, 1);
            } else {
                if (C7384Etj.areEqual(value, SpaceWidgetPickerUiState.SignedOut.INSTANCE)) {
                    bfm.AgE(967227943);
                    strA01 = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12100b);
                } else if (C7384Etj.areEqual(value, SpaceWidgetPickerUiState.Empty.INSTANCE)) {
                    bfm.AgE(967233530);
                    strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121008);
                } else {
                    if (!(value instanceof SpaceWidgetPickerUiState.Loaded)) {
                        throw AnonymousClass005.A0k(bfm, 967223623);
                    }
                    bfm.AgE(967237970);
                    SpaceWidgetPickerScreenKt.m3160SpaceWidgetPickerListo3XDK20(((SpaceWidgetPickerUiState.Loaded) value).spaces, f, f2, this.$onSpacePicked, null, bfm, (iA04 << 3) & 1008, 16);
                }
                SpaceWidgetPickerScreenKt.SpaceWidgetPickerMessage(strA01, null, bfm, 0, 2);
            }
            AnonymousClass001.A1D(bfm);
        }
    }

    /* renamed from: com.facebook.aura.widgets.SpaceWidgetPickerScreenKt$SpaceWidgetPickerScreen$2, reason: invalid class name and case insensitive filesystem */
    public final class C144102 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClose;
        public final /* synthetic */ G0U<SpaceCard, Unit> $onSpacePicked;
        public final /* synthetic */ SpaceWidgetPickerViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C144102(SpaceWidgetPickerViewModel spaceWidgetPickerViewModel, G0U<? super SpaceCard, Unit> g0u, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$viewModel = spaceWidgetPickerViewModel;
            this.$onSpacePicked = g0u;
            this.$onClose = function0;
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
            SpaceWidgetPickerScreenKt.SpaceWidgetPickerScreen(this.$viewModel, this.$onSpacePicked, this.$onClose, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: SpaceWidgetPickerList-o3XDK20, reason: not valid java name */
    public static final void m3160SpaceWidgetPickerListo3XDK20(AHD<SpaceCard> ahd, float f, float f2, G0U<? super SpaceCard, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(707118459);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A05(bfm, f);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A06(bfm, f2);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass004.A0W(bfm, g0u);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0T |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 9363, 9362), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0T = AnonymousClass001.A0T(bRg2);
            boolean zA1T = AnonymousClass001.A1T(bfm, ahd, AnonymousClass003.A1C(iA0T)) | AnonymousClass003.A1E(iA0T) | ((iA0T & 896) == 256);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$1$1(ahd, f, g0u, f2);
                bfm.Ai0(objAaT);
            }
            C1YY.A01(null, null, null, null, null, bfm, null, bRgA0T, (G0U) objAaT, 0, 510, false, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new SpaceWidgetPickerScreenKt$SpaceWidgetPickerList$2(ahd, f, f2, g0u, bRg2, i, i2);
        }
    }

    public static final void SpaceWidgetPickerMessage(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRgA0P = bRg;
        bfm.AgG(1169162442);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRgA0P);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRgA0P = BRg.A00;
            }
            BRg bRgA09 = C3U4.A09(AnonymousClass001.A0T(bRgA0P), 24.0f);
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(AcQ.A02, bfm, C2VU.A00, 54);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA09);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A08(bfm), C06G.A0T(bfm), null, null, C1YL.A00(), false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16306);
            bRgA0P = AnonymousClass001.A0P(bbi, bRgA0P);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(str, bRgA0P, i, i2);
        }
    }

    public static final void SpaceWidgetPickerScreen(SpaceWidgetPickerViewModel spaceWidgetPickerViewModel, G0U<? super SpaceCard, Unit> g0u, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A10(spaceWidgetPickerViewModel, g0u, function0);
        bfm.AgG(1845206661);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(spaceWidgetPickerViewModel, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, g0u);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchPageScreenKt.m997HatchPageScreenZOcclw(AuraContainer.PrimaryScreen.INSTANCE, bRg2, null, 0L, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f121009), null, function0, null, false, false, 0, null, null, null, null, null, null, 0L, 0L, null, 0.0f, null, null, null, 0, null, null, null, false, B1V.A00(bfm, new C144091(g0u, C2CK.A02(bfm, spaceWidgetPickerViewModel.uiState)), 1721674954), bfm, AnonymousClass001.A05(iA05 << 12, ((iA05 >> 6) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6), 0, 805306368, 536870828);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C144102(spaceWidgetPickerViewModel, g0u, function0, bRg2, i, i2);
        }
    }

    public static final void SpaceWidgetPickerLoading(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-482425148);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraSpinnerKt.m2611AuraSpinnerFNF3uiM(C10G.A02(C2VU.A09, AnonymousClass001.A0T(bRg), false), null, 0L, bfm, 0, 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg, i, i2);
        }
    }

    public static final /* synthetic */ SpaceWidgetPickerUiState access$SpaceWidgetPickerScreen$lambda$0(C1BO c1bo) {
        return (SpaceWidgetPickerUiState) c1bo.getValue();
    }
}
