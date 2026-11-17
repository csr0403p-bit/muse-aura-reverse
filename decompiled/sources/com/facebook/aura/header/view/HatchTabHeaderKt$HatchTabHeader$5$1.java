package com.facebook.aura.header.view;

import X.AHD;
import X.AKQ;
import X.ASj;
import X.AXN;
import X.AbstractC1046ASq;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AxM;
import X.B1V;
import X.B6A;
import X.BBI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C0Hi;
import X.C0z7;
import X.C1041ASi;
import X.C10G;
import X.C11S;
import X.C11T;
import X.C1515AkP;
import X.C1AC;
import X.C1BO;
import X.C1DG;
import X.C2HU;
import X.C2VU;
import X.C78N;
import X.C79;
import X.F60;
import X.G0U;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.header.api.HeaderAction;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchTabHeaderKt$HatchTabHeader$5$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ HeaderButton $badgedHeaderButton;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
    public final /* synthetic */ AXN $density;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ boolean $hasTrailingButtons;
    public final /* synthetic */ AHD<HeaderAction> $headerActions;
    public final /* synthetic */ AHD<HeaderButton> $headerButtons;
    public final /* synthetic */ C1BO<Boolean> $isLiveSessionActive$delegate;
    public final /* synthetic */ boolean $isTitleCompact;
    public final /* synthetic */ HeaderLeadingButton $leadingButton;
    public final /* synthetic */ boolean $leadingButtonEnabled;
    public final /* synthetic */ boolean $leadingButtonRotating;
    public final /* synthetic */ MutableState<C1DG> $measuredHeaderContainerBottom$delegate;
    public final /* synthetic */ MutableState<C1DG> $measuredLeadingChromeBottom$delegate;
    public final /* synthetic */ MutableState<C1DG> $measuredTrailingChromeBottom$delegate;
    public final /* synthetic */ MutableState<C1DG> $measuredTrailingChromeCenterY$delegate;
    public final /* synthetic */ MutableState<C1DG> $measuredTrailingChromeWidth$delegate;
    public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
    public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $onLeadingButtonClick;
    public final /* synthetic */ HatchHeaderTitleAlignment $resolvedTitleAlignment;
    public final /* synthetic */ float $resolvedTitleAlpha;
    public final /* synthetic */ String $subtitle;
    public final /* synthetic */ String $title;
    public final /* synthetic */ BRg $titleModifier;
    public final /* synthetic */ B6A $trailingButtonTint;

    /* renamed from: com.facebook.aura.header.view.HatchTabHeaderKt$HatchTabHeader$5$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ HeaderLeadingButton $leadingButton;
        public final /* synthetic */ boolean $leadingButtonEnabled;
        public final /* synthetic */ boolean $leadingButtonRotating;
        public final /* synthetic */ MutableState<C1DG> $measuredLeadingChromeBottom$delegate;
        public final /* synthetic */ G0U<HeaderLeadingButton, Unit> $onLeadingButtonClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(HeaderLeadingButton headerLeadingButton, boolean z, G0U<? super HeaderLeadingButton, Unit> g0u, C0Hi c0Hi, AXN axn, boolean z2, MutableState<C1DG> mutableState) {
            super(2);
            this.$leadingButton = headerLeadingButton;
            this.$leadingButtonRotating = z;
            this.$onLeadingButtonClick = g0u;
            this.$focusManager = c0Hi;
            this.$density = axn;
            this.$leadingButtonEnabled = z2;
            this.$measuredLeadingChromeBottom$delegate = mutableState;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            BBI bbiA0M;
            float fA01;
            if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                if (this.$leadingButton != null) {
                    bfm.AgE(-693904381);
                    if (this.$leadingButtonRotating) {
                        bfm.AgE(-693641594);
                        fA01 = C1BO.A01(AbstractC1046ASq.A00(new C1041ASi(new ASj(C2HU.A02, 2000, 0), C79.A00, 0L), AbstractC1046ASq.A01(bfm), bfm, 0.0f, 360.0f));
                        bbiA0M = (BBI) bfm;
                        BBI.A0R(bbiA0M, false);
                    } else {
                        bbiA0M = AnonymousClass002.A0M(bfm, -692809492);
                        fA01 = 0.0f;
                    }
                    BS0 bs0 = BRg.A00;
                    BRg bRgA04 = C10G.A04(bs0, 60.0f);
                    HeaderLeadingButton headerLeadingButton = this.$leadingButton;
                    G0U<HeaderLeadingButton, Unit> g0u = this.$onLeadingButtonClick;
                    C0Hi c0Hi = this.$focusManager;
                    AXN axn = this.$density;
                    boolean z = this.$leadingButtonEnabled;
                    MutableState<C1DG> mutableState = this.$measuredLeadingChromeBottom$delegate;
                    InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                    int iA0J = AnonymousClass003.A0J(bbiA0M);
                    AKQ akqA04 = BBI.A04(bbiA0M);
                    BRg bRgA01 = AxM.A01(bfm, bRgA04);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbiA0M.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbiA0M, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                    C0z7 c0z7 = C0z7.A00;
                    boolean zA1a = AnonymousClass001.A1a(AnonymousClass003.A1N(bfm, c0Hi, g0u), bfm, AnonymousClass003.A0K(headerLeadingButton));
                    Object objAaT = bfm.AaT();
                    if (zA1a || objAaT == C78N.A00) {
                        objAaT = new HatchTabHeaderKt$HatchTabHeader$5$1$2$1$1$1(c0Hi, g0u, headerLeadingButton);
                        bfm.Ai0(objAaT);
                    }
                    Function0 function02 = (Function0) objAaT;
                    BRg bRgA4C = c0z7.A4C(C2VU.A09, bs0);
                    boolean zA65 = bfm.A65(axn);
                    Object objAaT2 = bfm.AaT();
                    if (zA65 || objAaT2 == C78N.A00) {
                        objAaT2 = new HatchTabHeaderKt$HatchTabHeader$5$1$2$1$2$1(axn, mutableState);
                        bfm.Ai0(objAaT2);
                    }
                    HatchTabHeaderKt.HatchTabHeaderLeadingButton(headerLeadingButton, function02, C11T.A00(AnonymousClass003.A0V(bRgA4C, objAaT2), fA01), z, bfm, 0, 0);
                    BBI.A0R(bbiA0M, true);
                } else {
                    bfm.AgE(-691631616);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchTabHeaderKt$HatchTabHeader$5$1$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0V<BFM, Integer, Unit> $centerContent;
        public final /* synthetic */ boolean $isTitleCompact;
        public final /* synthetic */ HatchHeaderTitleAlignment $resolvedTitleAlignment;
        public final /* synthetic */ float $resolvedTitleAlpha;
        public final /* synthetic */ String $subtitle;
        public final /* synthetic */ String $title;
        public final /* synthetic */ BRg $titleModifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(G0V<? super BFM, ? super Integer, Unit> g0v, String str, String str2, boolean z, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, BRg bRg, float f) {
            super(2);
            this.$centerContent = g0v;
            this.$title = str;
            this.$subtitle = str2;
            this.$isTitleCompact = z;
            this.$resolvedTitleAlignment = hatchHeaderTitleAlignment;
            this.$titleModifier = bRg;
            this.$resolvedTitleAlpha = f;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                if (this.$centerContent != null) {
                    bfm.AgE(-372995252);
                    AnonymousClass001.A1H(bfm, this.$centerContent, 0);
                } else if (this.$title != null) {
                    bfm.AgE(-372907832);
                    HatchTabHeaderKt.HatchTabHeaderTitle(this.$title, this.$subtitle, this.$isTitleCompact, AnonymousClass002.A1Z(this.$resolvedTitleAlignment, HatchHeaderTitleAlignment.CENTER), C11S.A00(this.$titleModifier, this.$resolvedTitleAlpha), bfm, 0, 0);
                } else {
                    bfm.AgE(-372545535);
                }
                AnonymousClass001.A1D(bfm);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.header.view.HatchTabHeaderKt$HatchTabHeader$5$1$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ HeaderButton $badgedHeaderButton;
        public final /* synthetic */ AXN $density;
        public final /* synthetic */ C0Hi $focusManager;
        public final /* synthetic */ boolean $hasTrailingButtons;
        public final /* synthetic */ AHD<HeaderAction> $headerActions;
        public final /* synthetic */ AHD<HeaderButton> $headerButtons;
        public final /* synthetic */ C1BO<Boolean> $isLiveSessionActive$delegate;
        public final /* synthetic */ MutableState<C1DG> $measuredTrailingChromeBottom$delegate;
        public final /* synthetic */ MutableState<C1DG> $measuredTrailingChromeCenterY$delegate;
        public final /* synthetic */ MutableState<C1DG> $measuredTrailingChromeWidth$delegate;
        public final /* synthetic */ G0U<HeaderButton, Unit> $onHeaderButtonClick;
        public final /* synthetic */ B6A $trailingButtonTint;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(boolean z, AXN axn, MutableState<C1DG> mutableState, MutableState<C1DG> mutableState2, AHD<HeaderAction> ahd, AHD<? extends HeaderButton> ahd2, G0U<? super HeaderButton, Unit> g0u, C0Hi c0Hi, B6A b6a, HeaderButton headerButton, C1BO<Boolean> c1bo, MutableState<C1DG> mutableState3) {
            super(2);
            this.$hasTrailingButtons = z;
            this.$density = axn;
            this.$measuredTrailingChromeWidth$delegate = mutableState;
            this.$measuredTrailingChromeCenterY$delegate = mutableState2;
            this.$headerActions = ahd;
            this.$headerButtons = ahd2;
            this.$onHeaderButtonClick = g0u;
            this.$focusManager = c0Hi;
            this.$trailingButtonTint = b6a;
            this.$badgedHeaderButton = headerButton;
            this.$isLiveSessionActive$delegate = c1bo;
            this.$measuredTrailingChromeBottom$delegate = mutableState3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void invoke(X.BFM r28, int r29) {
            /*
                Method dump skipped, instructions count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.header.view.HatchTabHeaderKt$HatchTabHeader$5$1.AnonymousClass4.invoke(X.BFM, int):void");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchTabHeaderKt$HatchTabHeader$5$1(AXN axn, HatchHeaderTitleAlignment hatchHeaderTitleAlignment, MutableState<C1DG> mutableState, HeaderLeadingButton headerLeadingButton, boolean z, G0U<? super HeaderLeadingButton, Unit> g0u, C0Hi c0Hi, boolean z2, MutableState<C1DG> mutableState2, G0V<? super BFM, ? super Integer, Unit> g0v, String str, String str2, boolean z3, BRg bRg, float f, boolean z4, MutableState<C1DG> mutableState3, MutableState<C1DG> mutableState4, AHD<HeaderAction> ahd, AHD<? extends HeaderButton> ahd2, G0U<? super HeaderButton, Unit> g0u2, B6A b6a, HeaderButton headerButton, C1BO<Boolean> c1bo, MutableState<C1DG> mutableState5) {
        super(2);
        this.$density = axn;
        this.$resolvedTitleAlignment = hatchHeaderTitleAlignment;
        this.$measuredHeaderContainerBottom$delegate = mutableState;
        this.$leadingButton = headerLeadingButton;
        this.$leadingButtonRotating = z;
        this.$onLeadingButtonClick = g0u;
        this.$focusManager = c0Hi;
        this.$leadingButtonEnabled = z2;
        this.$measuredLeadingChromeBottom$delegate = mutableState2;
        this.$centerContent = g0v;
        this.$title = str;
        this.$subtitle = str2;
        this.$isTitleCompact = z3;
        this.$titleModifier = bRg;
        this.$resolvedTitleAlpha = f;
        this.$hasTrailingButtons = z4;
        this.$measuredTrailingChromeWidth$delegate = mutableState3;
        this.$measuredTrailingChromeCenterY$delegate = mutableState4;
        this.$headerActions = ahd;
        this.$headerButtons = ahd2;
        this.$onHeaderButtonClick = g0u2;
        this.$trailingButtonTint = b6a;
        this.$badgedHeaderButton = headerButton;
        this.$isLiveSessionActive$delegate = c1bo;
        this.$measuredTrailingChromeBottom$delegate = mutableState5;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            C1AC c1ac = C2VU.A05;
            BRg bRgA0U = AnonymousClass001.A0U(C10G.A02, 60.0f);
            boolean zA65 = bfm.A65(this.$density);
            AXN axn = this.$density;
            MutableState<C1DG> mutableState = this.$measuredHeaderContainerBottom$delegate;
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new HatchTabHeaderKt$HatchTabHeader$5$1$1$1(axn, mutableState);
                bfm.Ai0(objAaT);
            }
            HatchHeaderKt.m993HatchHeaderContentyBXNGS4(this.$resolvedTitleAlignment, AnonymousClass003.A0V(bRgA0U, objAaT), 60.0f, c1ac, null, false, false, B1V.A00(bfm, new AnonymousClass2(this.$leadingButton, this.$leadingButtonRotating, this.$onLeadingButtonClick, this.$focusManager, this.$density, this.$leadingButtonEnabled, this.$measuredLeadingChromeBottom$delegate), -1194038910), B1V.A00(bfm, new AnonymousClass3(this.$centerContent, this.$title, this.$subtitle, this.$isTitleCompact, this.$resolvedTitleAlignment, this.$titleModifier, this.$resolvedTitleAlpha), -215690783), B1V.A00(bfm, new AnonymousClass4(this.$hasTrailingButtons, this.$density, this.$measuredTrailingChromeWidth$delegate, this.$measuredTrailingChromeCenterY$delegate, this.$headerActions, this.$headerButtons, this.$onHeaderButtonClick, this.$focusManager, this.$trailingButtonTint, this.$badgedHeaderButton, this.$isLiveSessionActive$delegate, this.$measuredTrailingChromeBottom$delegate), 762657344), bfm, 918752640, 80);
            return;
        }
        bfm.Afo();
    }
}
