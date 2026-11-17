package com.facebook.aura.vds.compose.bottomsheet.core;

import X.AKH;
import X.AKQ;
import X.AQC;
import X.ASZ;
import X.AVy;
import X.AXN;
import X.AbstractC1754Apr;
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
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0A8;
import X.C0z7;
import X.C10543Hqv;
import X.C10G;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D8;
import X.C1DG;
import X.C2VU;
import X.C3U4;
import X.C3Ue;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC04981Yd;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1497Ak4;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraElevatedButtonKt;
import com.facebook.aura.vds.compose.surface.AuraElevatedSurfaceKt;
import com.facebook.aura.vds.compose.surface.AuraSurfaceKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraModeOverriderKt;
import com.facebook.aura.vds.compose.theme.AuraTypography;
import com.facebook.aura.vds.compose.theme.AuraTypographyKt;
import com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class AuraBottomSheetInnerKt {

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraBottomSheetHeader$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $config;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$config = auraBottomSheetHeaderConfig;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBottomSheetInnerKt.AuraBottomSheetHeader(this.$modifier, this.$config, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraBottomSheetHeader$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $config;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(BRg bRg, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$config = auraBottomSheetHeaderConfig;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBottomSheetInnerKt.AuraBottomSheetHeader(this.$modifier, this.$config, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraBottomSheetInner$1, reason: invalid class name and case insensitive filesystem */
    public final class C142671 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $background;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ boolean $fillHeight;
        public final /* synthetic */ boolean $floatingDragHandle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $header;
        public final /* synthetic */ AuraThemeMode $modeOverride;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ AuraContainer.AuraBottomSheet $type;

        /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraBottomSheetInner$1$1, reason: invalid class name and collision with other inner class name */
        public final class C04191 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $background;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
            public final /* synthetic */ boolean $dismissible;
            public final /* synthetic */ boolean $fillHeight;
            public final /* synthetic */ boolean $floatingDragHandle;
            public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
            public final /* synthetic */ AuraBottomSheetHeaderConfig $header;
            public final /* synthetic */ BRg $modifier;
            public final /* synthetic */ Function0<Unit> $onDismissRequest;
            public final /* synthetic */ AuraContainer.AuraBottomSheet $type;

            /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraBottomSheetInner$1$1$2, reason: invalid class name */
            public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
                public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $background;
                public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
                public final /* synthetic */ boolean $dismissible;
                public final /* synthetic */ boolean $fillHeight;
                public final /* synthetic */ boolean $floatingDragHandle;
                public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
                public final /* synthetic */ AuraBottomSheetHeaderConfig $header;
                public final /* synthetic */ Function0<Unit> $onDismissRequest;

                /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraBottomSheetInner$1$1$2$1, reason: invalid class name and collision with other inner class name */
                public final class C04201 extends AbstractC7559F3s implements G0U<InterfaceC1497Ak4, Unit> {
                    public final /* synthetic */ C10543Hqv<MutableState<C1DG>> $boxHeightDp;
                    public final /* synthetic */ AXN $density;

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(InterfaceC1497Ak4 interfaceC1497Ak4) {
                        C7384Etj.A0Y(interfaceC1497Ak4, 0);
                        C1DG.A06(this.$density.Agy(AnonymousClass002.A09(interfaceC1497Ak4.AKd())), this.$boxHeightDp.element);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C04201(C10543Hqv<MutableState<C1DG>> c10543Hqv, AXN axn) {
                        super(1);
                        this.$boxHeightDp = c10543Hqv;
                        this.$density = axn;
                    }

                    @Override // X.G0U
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC1497Ak4 interfaceC1497Ak4) {
                        invoke2(interfaceC1497Ak4);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(boolean z, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, boolean z2, boolean z3, Function0<Unit> function0, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2) {
                    super(3);
                    this.$fillHeight = z;
                    this.$background = g0w;
                    this.$floatingDragHandle = z2;
                    this.$dismissible = z3;
                    this.$onDismissRequest = function0;
                    this.$header = auraBottomSheetHeaderConfig;
                    this.$content = g0v;
                    this.$footer = g0v2;
                }

                @Override // X.G0W
                public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
                    invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
                    BRg bRgA0R;
                    C7384Etj.A0Y(interfaceC05151eP, 0);
                    if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                        AXN axnA0Y = AnonymousClass002.A0Y(bfm);
                        C10543Hqv c10543Hqv = new C10543Hqv();
                        Object objAaT = bfm.AaT();
                        Object obj = C78N.A00;
                        T tA11 = objAaT;
                        if (objAaT == obj) {
                            tA11 = AnonymousClass004.A11(bfm, C1DG.A03());
                        }
                        c10543Hqv.element = tA11;
                        C10543Hqv c10543Hqv2 = new C10543Hqv();
                        Object objAaT2 = bfm.AaT();
                        T tA112 = objAaT2;
                        if (objAaT2 == obj) {
                            tA112 = AnonymousClass004.A11(bfm, C1DG.A03());
                        }
                        c10543Hqv2.element = tA112;
                        BS0 bs0 = BRg.A00;
                        boolean z = this.$fillHeight;
                        BRg bRg = bs0;
                        if (z) {
                            bRg = C10G.A00;
                        }
                        BRg bRgA00 = ASZ.A00(bRg, new C04201(c10543Hqv2, axnA0Y));
                        G0W<C1DG, BFM, Integer, Unit> g0w = this.$background;
                        boolean z2 = this.$floatingDragHandle;
                        boolean z3 = this.$dismissible;
                        Function0<Unit> function0 = this.$onDismissRequest;
                        AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig = this.$header;
                        G0V<BFM, Integer, Unit> g0v = this.$content;
                        G0V<BFM, Integer, Unit> g0v2 = this.$footer;
                        Alignment alignment = C2VU.A0E;
                        InterfaceC1380AiA interfaceC1380AiAA01 = C3Ue.A01(alignment, false);
                        BBI bbi = (BBI) bfm;
                        long j = bbi.A06;
                        int i2 = (int) (j ^ (j >>> 32));
                        AKQ akqA04 = BBI.A04(bbi);
                        BRg bRgA01 = AxM.A01(bfm, bRgA00);
                        Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
                        if (bbi.A0V == null) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        AnonymousClass005.A0n(bfm, bbi, function02);
                        G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v3 = C1515AkP.A04;
                        BPg.A02(bfm, interfaceC1380AiAA01, g0v3);
                        G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v4 = C1515AkP.A06;
                        G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v4, i2);
                        G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
                        G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
                        C0z7 c0z7 = C0z7.A00;
                        if (g0w != 0) {
                            bfm.AgE(1917360026);
                            g0w.invoke(((MutableState) c10543Hqv2.element).getValue(), bfm, 0);
                        } else {
                            bfm.AgE(1917412881);
                        }
                        BBI.A0R(bbi, false);
                        BRg bRg2 = bs0;
                        if (z) {
                            bRg2 = C10G.A00;
                        }
                        InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
                        int iA0D = AnonymousClass001.A0D(bbi);
                        AKQ akqA042 = BBI.A04(bbi);
                        BRg bRgA012 = AxM.A01(bfm, bRg2);
                        AnonymousClass005.A0n(bfm, bbi, function02);
                        BPg.A02(bfm, interfaceC1380AiAA0U, g0v3);
                        BPg.A02(bfm, akqA042, g0v4);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
                        BPg.A02(bfm, bRgA012, g0vA0u);
                        C90l c90l = C90l.A00;
                        if (!z2) {
                            bfm.AgE(425249135);
                            AuraDragHandleKt.AuraDragHandle(new AQC(C2VU.A00), z3, function0, bfm, 0);
                        } else {
                            bfm.AgE(425475931);
                        }
                        BBI.A0R(bbi, false);
                        if (auraBottomSheetHeaderConfig != null) {
                            bfm.AgE(425513534);
                            AuraBottomSheetInnerKt.AuraBottomSheetHeader(C10G.A02, auraBottomSheetHeaderConfig, bfm, 6, 0);
                        } else {
                            bfm.AgE(425664411);
                        }
                        BBI.A0R(bbi, false);
                        if (!z2) {
                            bfm.AgE(425705579);
                            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AnonymousClass002.A0d(bfm).bottomsheetBelowDragHandleVerticalSpacing, bfm, 0);
                        } else {
                            bfm.AgE(425813211);
                        }
                        BBI.A0R(bbi, false);
                        BRg bRgA013 = AbstractC1754Apr.A01(bs0);
                        if (z) {
                            bRgA0R = AnonymousClass001.A0R(c90l.AiP(bs0, 1.0f, true));
                        } else {
                            bRgA0R = bs0;
                        }
                        BRg bRgThen = bRgA013.then(bRgA0R);
                        InterfaceC1380AiA interfaceC1380AiAA012 = C3Ue.A01(alignment, false);
                        int iA0D2 = AnonymousClass001.A0D(bbi);
                        AKQ akqA043 = BBI.A04(bbi);
                        BRg bRgA014 = AxM.A01(bfm, bRgThen);
                        AnonymousClass005.A0n(bfm, bbi, function02);
                        BPg.A02(bfm, interfaceC1380AiAA012, g0v3);
                        BPg.A02(bfm, akqA043, g0v4);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
                        BPg.A02(bfm, bRgA014, g0vA0u);
                        BRg bRg3 = bs0;
                        if (z) {
                            bRg3 = C10G.A01;
                        }
                        BRg bRgA03 = C3U4.A03(bRg3, AuraDimensKt.SpacingXsmall + ((C1DG) ((MutableState) c10543Hqv.element).getValue()).A00);
                        InterfaceC1380AiA interfaceC1380AiAA013 = C3Ue.A01(alignment, false);
                        int iA0D3 = AnonymousClass001.A0D(bbi);
                        AKQ akqA044 = BBI.A04(bbi);
                        BRg bRgA015 = AxM.A01(bfm, bRgA03);
                        AnonymousClass005.A0n(bfm, bbi, function02);
                        BPg.A02(bfm, interfaceC1380AiAA013, g0v3);
                        BPg.A02(bfm, akqA044, g0v4);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D3);
                        BPg.A02(bfm, bRgA015, g0vA0u);
                        g0v.invoke(bfm, 0);
                        BBI.A0R(bbi, true);
                        BRg bRgA002 = ASZ.A00(c0z7.A4C(C2VU.A06, bs0), new AuraBottomSheetInnerKt$AuraBottomSheetInner$1$1$2$2$1$1$2(c10543Hqv, axnA0Y));
                        InterfaceC1380AiA interfaceC1380AiAA014 = C3Ue.A01(alignment, false);
                        int iA0D4 = AnonymousClass001.A0D(bbi);
                        AKQ akqA045 = BBI.A04(bbi);
                        BRg bRgA016 = AxM.A01(bfm, bRgA002);
                        AnonymousClass005.A0n(bfm, bbi, function02);
                        BPg.A02(bfm, interfaceC1380AiAA014, g0v3);
                        BPg.A02(bfm, akqA045, g0v4);
                        AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D4);
                        BPg.A02(bfm, bRgA016, g0vA0u);
                        if (g0v2 == null) {
                            bfm.AgE(162144847);
                        } else {
                            bfm.AgE(-964600846);
                            g0v2.invoke(bfm, 0);
                        }
                        AnonymousClass002.A10(bbi, false, true);
                        BBI.A0R(bbi, true);
                        if (z2) {
                            bfm.AgE(1919117850);
                            AuraDragHandleKt.AuraDragHandle(c0z7.A4C(C2VU.A0C, bs0), z3, function0, bfm, 0);
                        } else {
                            bfm.AgE(1919324465);
                        }
                        BBI.A0R(bbi, false);
                        BBI.A0R(bbi, true);
                        return;
                    }
                    bfm.Afo();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C04191(BRg bRg, boolean z, AuraContainer.AuraBottomSheet auraBottomSheet, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, boolean z2, boolean z3, Function0<Unit> function0, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2) {
                super(2);
                this.$modifier = bRg;
                this.$fillHeight = z;
                this.$type = auraBottomSheet;
                this.$background = g0w;
                this.$floatingDragHandle = z2;
                this.$dismissible = z3;
                this.$onDismissRequest = function0;
                this.$header = auraBottomSheetHeaderConfig;
                this.$content = g0v;
                this.$footer = g0v2;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                long j;
                if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                    BRg bRgA02 = AbstractC1754Apr.A02(this.$modifier);
                    boolean z = this.$fillHeight;
                    BRg bRg = BRg.A00;
                    if (z) {
                        bRg = C10G.A00;
                    }
                    BRg bRgThen = bRgA02.then(bRg);
                    AuraContainer.AuraBottomSheet auraBottomSheet = this.$type;
                    if (C7384Etj.areEqual(auraBottomSheet, AuraContainer.PrimaryBottomSheet.INSTANCE)) {
                        j = AnonymousClass003.A0c(bfm, 1714465488).modal;
                    } else if (C7384Etj.areEqual(auraBottomSheet, AuraContainer.SecondaryBottomSheet.INSTANCE)) {
                        j = AnonymousClass003.A0c(bfm, 1714467513).secondaryModal;
                    } else {
                        AnonymousClass004.A1A(bfm, 1714463437);
                        throw new NoWhenBranchMatchedException();
                    }
                    boolean zA1V = AnonymousClass001.A1V(bfm);
                    float f = AnonymousClass002.A0d(bfm).bottomsheetRoundedCorner;
                    AuraSurfaceKt.m2623AuraSurface1esR5Hs(bRgThen, C1D8.A01(f, f, 0.0f, 0.0f), zA1V, j, null, 0L, null, zA1V, B1V.A00(bfm, new AnonymousClass2(this.$fillHeight, this.$background, this.$floatingDragHandle, this.$dismissible, this.$onDismissRequest, this.$header, this.$content, this.$footer), 2070199019), bfm, 100663296, 244);
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C142671(AuraThemeMode auraThemeMode, BRg bRg, boolean z, AuraContainer.AuraBottomSheet auraBottomSheet, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, boolean z2, boolean z3, Function0<Unit> function0, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, G0V<? super BFM, ? super Integer, Unit> g0v, G0V<? super BFM, ? super Integer, Unit> g0v2) {
            super(2);
            this.$modeOverride = auraThemeMode;
            this.$modifier = bRg;
            this.$fillHeight = z;
            this.$type = auraBottomSheet;
            this.$background = g0w;
            this.$floatingDragHandle = z2;
            this.$dismissible = z3;
            this.$onDismissRequest = function0;
            this.$header = auraBottomSheetHeaderConfig;
            this.$content = g0v;
            this.$footer = g0v2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AuraThemeMode auraThemeMode = this.$modeOverride;
                if (auraThemeMode == null) {
                    auraThemeMode = AuraThemeMode.DEFAULT;
                }
                AuraModeOverriderKt.AuraModeOverrider(auraThemeMode, null, B1V.A00(bfm, new C04191(this.$modifier, this.$fillHeight, this.$type, this.$background, this.$floatingDragHandle, this.$dismissible, this.$onDismissRequest, this.$header, this.$content, this.$footer), 1043123659), bfm, 384, 2);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraBottomSheetInner$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<C1DG, BFM, Integer, Unit> $background;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $dismissible;
        public final /* synthetic */ boolean $fillHeight;
        public final /* synthetic */ boolean $floatingDragHandle;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $footer;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $header;
        public final /* synthetic */ AuraThemeMode $modeOverride;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDismissRequest;
        public final /* synthetic */ AuraContainer.AuraBottomSheet $type;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AuraContainer.AuraBottomSheet auraBottomSheet, BRg bRg, AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C1DG, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, boolean z, boolean z2, boolean z3, AuraThemeMode auraThemeMode, G0V<? super BFM, ? super Integer, Unit> g0v2, int i, int i2, int i3) {
            super(2);
            this.$type = auraBottomSheet;
            this.$modifier = bRg;
            this.$header = auraBottomSheetHeaderConfig;
            this.$footer = g0v;
            this.$background = g0w;
            this.$onDismissRequest = function0;
            this.$dismissible = z;
            this.$floatingDragHandle = z2;
            this.$fillHeight = z3;
            this.$modeOverride = auraThemeMode;
            this.$content = g0v2;
            this.$$changed = i;
            this.$$changed1 = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraBottomSheetInnerKt.AuraBottomSheetInner(this.$type, this.$modifier, this.$header, this.$footer, this.$background, this.$onDismissRequest, this.$dismissible, this.$floatingDragHandle, this.$fillHeight, this.$modeOverride, this.$content, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraBottomSheetLabeledHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C142682 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraBottomSheetHeaderConfig $config;
        public final /* synthetic */ AuraBottomSheetHeaderConfig.LabeledAccessoryButton $leadingButton;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142682(AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, AuraBottomSheetHeaderConfig.LabeledAccessoryButton labeledAccessoryButton, BRg bRg, int i, int i2) {
            super(2);
            this.$config = auraBottomSheetHeaderConfig;
            this.$leadingButton = labeledAccessoryButton;
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
            AuraBottomSheetInnerKt.AuraBottomSheetLabeledHeader(this.$config, this.$leadingButton, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraHeaderIconButton$1, reason: invalid class name and case insensitive filesystem */
    public final class C142691 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraBottomSheetHeaderConfig.AccessoryButton $button;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142691(AuraBottomSheetHeaderConfig.AccessoryButton accessoryButton, BRg bRg, int i, int i2) {
            super(2);
            this.$button = accessoryButton;
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
            AuraBottomSheetInnerKt.AuraHeaderIconButton(this.$button, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraHeaderLabeledButton$2, reason: invalid class name and case insensitive filesystem */
    public final class C142702 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
        public final /* synthetic */ AuraBottomSheetHeaderConfig.LabeledAccessoryButton $button;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142702(AuraBottomSheetHeaderConfig.LabeledAccessoryButton labeledAccessoryButton) {
            super(3);
            this.$button = labeledAccessoryButton;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
            invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
            int iA0d = i;
            C7384Etj.A0Y(interfaceC05151eP, 0);
            if ((i & 6) == 0) {
                iA0d = i | AnonymousClass004.A0d(bfm, interfaceC05151eP);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                String strA01 = AbstractC2271BQs.A01(bfm, this.$button.label);
                C1822Arm c1822ArmA0W = C06G.A0W(bfm);
                long jA0C = C06G.A0C(bfm);
                BRg bRgA07 = C3U4.A07(interfaceC05151eP.A4C(C2VU.A09, BRg.A00), AuraDimensKt.SpacingMedium);
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = AuraBottomSheetInnerKt$AuraHeaderLabeledButton$2$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, AnonymousClass001.A0X(bRgA07, objAaT), jA0C, c1822ArmA0W, null, null, null, false, 0, 1, 2, null, null, null, bfm, 805306368, 6, 14832);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt$AuraHeaderLabeledButton$3, reason: invalid class name and case insensitive filesystem */
    public final class C142713 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AuraBottomSheetHeaderConfig.LabeledAccessoryButton $button;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142713(AuraBottomSheetHeaderConfig.LabeledAccessoryButton labeledAccessoryButton, BRg bRg, int i, int i2) {
            super(2);
            this.$button = labeledAccessoryButton;
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
            AuraBottomSheetInnerKt.AuraHeaderLabeledButton(this.$button, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02a3 A[PHI: r11
  0x02a3: PHI (r11v11 float) = (r11v0 float), (r11v12 float) binds: [B:33:0x00cf, B:31:0x00cc] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraBottomSheetHeader(X.BRg r40, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig r41, X.BFM r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt.AuraBottomSheetHeader(X.BRg, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig, X.BFM, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraBottomSheetInner(com.facebook.aura.vds.compose.theme.AuraContainer.AuraBottomSheet r37, X.BRg r38, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig r39, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r40, X.G0W<? super X.C1DG, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r41, kotlin.jvm.functions.Function0<kotlin.Unit> r42, boolean r43, boolean r44, boolean r45, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode r46, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r47, X.BFM r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.bottomsheet.core.AuraBottomSheetInnerKt.AuraBottomSheetInner(com.facebook.aura.vds.compose.theme.AuraContainer$AuraBottomSheet, X.BRg, com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig, X.G0V, X.G0W, kotlin.jvm.functions.Function0, boolean, boolean, boolean, com.facebook.aura.vds.compose.theme.root.mode.AuraThemeMode, X.G0V, X.BFM, int, int, int):void");
    }

    public static final void AuraBottomSheetLabeledHeader(AuraBottomSheetHeaderConfig auraBottomSheetHeaderConfig, AuraBottomSheetHeaderConfig.LabeledAccessoryButton labeledAccessoryButton, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1957095164);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, auraBottomSheetHeaderConfig) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0U(bfm, labeledAccessoryButton);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 147, 146), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1AC c1ac = C2VU.A04;
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA0U = AnonymousClass003.A0U(C3U4.A0C(bRg2, f, 0.0f, f, AuraDimensKt.SpacingMedium));
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(AcQ.A01, bfm, c1ac, 48);
            BBI bbi = (BBI) bfm;
            long j = bbi.A06;
            int i4 = (int) (j ^ (j >>> 32));
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0U);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V<InterfaceC1516AkQ, InterfaceC1380AiA, Unit> g0v = C1515AkP.A04;
            BPg.A02(bfm, interfaceC1380AiAA00, g0v);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v2 = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v2, i4);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            BPg.A03(bfm, g0u);
            G0V<InterfaceC1516AkQ, BRg, Unit> g0v3 = C1515AkP.A05;
            BPg.A02(bfm, bRgA01, g0v3);
            C90m c90m = C90m.A00;
            BS0 bs0 = BRg.A00;
            AuraHeaderLabeledButton(labeledAccessoryButton, C10G.A00(C2VU.A02, c90m.AiP(bs0, 1.0f, true), false), bfm, (iA0T >> 3) & 14, 0);
            InterfaceC1380AiA interfaceC1380AiAA002 = C06I.A00(AcQ.A06, bfm, C2VU.A00, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA002, g0v);
            BPg.A02(bfm, akqA042, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0v3);
            String str = auraBottomSheetHeaderConfig.title;
            AKH<AuraTypography> akh = AuraTypographyKt.LocalAuraTypography;
            AuraTextKt.m2639AuraTextUY9GdpU(str, null, 0L, AnonymousClass001.A0g(bfm, akh).bodyEmphasized, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
            String str2 = auraBottomSheetHeaderConfig.subtitle;
            if (str2 != null) {
                bfm.AgE(-2030996181);
                AuraTextKt.m2639AuraTextUY9GdpU(str2, null, 0L, C06G.A0a(bfm, akh), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16374);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-2030910652);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            InterfaceC04981Yd interfaceC04981Yd = AcQ.A00;
            BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
            InterfaceC1380AiA interfaceC1380AiAA003 = C0A8.A00(interfaceC04981Yd, bfm, C2VU.A05, 6);
            int iA0D2 = AnonymousClass001.A0D(bbi);
            AKQ akqA043 = BBI.A04(bbi);
            BRg bRgA013 = AxM.A01(bfm, bRgAiP);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA003, g0v);
            BPg.A02(bfm, akqA043, g0v2);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D2);
            BPg.A02(bfm, bRgA013, g0v3);
            AuraBottomSheetHeaderConfig.AccessoryButton accessoryButton = auraBottomSheetHeaderConfig.secondaryTrailingButton;
            if (accessoryButton == null) {
                bfm.AgE(702093461);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(702093462);
                AuraHeaderIconButton(accessoryButton, null, bfm, 0, 2);
                BBI.A0R(bbi, false);
            }
            AuraBottomSheetHeaderConfig.AccessoryButton accessoryButton2 = auraBottomSheetHeaderConfig.trailingButton;
            if (accessoryButton2 == null) {
                bfm.AgE(702154965);
            } else {
                bfm.AgE(702154966);
                AuraHeaderIconButton(accessoryButton2, null, bfm, 0, 2);
            }
            AnonymousClass002.A10(bbi, false, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142682(auraBottomSheetHeaderConfig, labeledAccessoryButton, bRg2, i, i2);
        }
    }

    public static final void AuraHeaderIconButton(AuraBottomSheetHeaderConfig.AccessoryButton accessoryButton, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(105031489);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, accessoryButton) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraElevatedButtonKt.m2417AuraElevatedIconButtonXjqr6CI(BOf.A00(bfm, accessoryButton.icon, 0), AbstractC2271BQs.A01(bfm, accessoryButton.contentDescription), accessoryButton.onClick, bRg2, false, 0.0f, null, null, null, false, false, bfm, AVy.$stable | ((iA0T << 6) & 7168), 0, 2032);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142691(accessoryButton, bRg2, i, i2);
        }
    }

    public static final void AuraHeaderLabeledButton(AuraBottomSheetHeaderConfig.LabeledAccessoryButton labeledAccessoryButton, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1086798546);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, labeledAccessoryButton) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, labeledAccessoryButton.contentDescription);
            Function0<Unit> function0 = labeledAccessoryButton.onClick;
            BRg bRgA0U = AnonymousClass003.A0U(bRg);
            boolean zA65 = bfm.A65(strA01);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraBottomSheetInnerKt$AuraHeaderLabeledButton$1$1(strA01);
                bfm.Ai0(objAaT);
            }
            AuraElevatedSurfaceKt.m2622AuraElevatedPillSurfaceDzVHIIc(AnonymousClass001.A0Y(bRgA0U, objAaT, false), 0.0f, function0, B1V.A00(bfm, new C142702(labeledAccessoryButton), -1825733908), bfm, 3072, 2);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142713(labeledAccessoryButton, bRg, i, i2);
        }
    }
}
