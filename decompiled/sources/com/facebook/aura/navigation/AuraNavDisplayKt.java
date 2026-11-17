package com.facebook.aura.navigation;

import X.AKH;
import X.AKJ;
import X.AKQ;
import X.AMR;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B81;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRL;
import X.BRg;
import X.C00x;
import X.C0z7;
import X.C1062ATq;
import X.C10G;
import X.C1515AkP;
import X.C1EP;
import X.C1b8;
import X.C28u;
import X.C3cG;
import X.C5qH;
import X.C5rn;
import X.C78N;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.ui.adaptive.AuraModalFlowPresentation;
import com.facebook.aura.ui.adaptive.AuraModalFlowPresentationKt;
import com.facebook.aura.ui.adaptive.AuraPageCardKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class AuraNavDisplayKt {

    /* renamed from: com.facebook.aura.navigation.AuraNavDisplayKt$AuraLoggedOutNavDisplay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ NavBackStack<AuraNavKey> $backstack;
        public final /* synthetic */ boolean $isBackHandlingEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $overlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, boolean z) {
            super(2);
            this.$backstack = navBackStack;
            this.$navigator = auraNavigator;
            this.$modifier = bRg;
            this.$overlay = g0w;
            this.$isBackHandlingEnabled = z;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                NavBackStack<AuraNavKey> navBackStack = this.$backstack;
                AuraNavigator auraNavigator = this.$navigator;
                BRg bRg = this.$modifier;
                G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$overlay;
                boolean z = this.$isBackHandlingEnabled;
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = AuraNavDisplayKt$AuraLoggedOutNavDisplay$1$1$1.INSTANCE;
                    bfm.Ai0(objAaT);
                }
                AuraNavDisplayKt.AuraNavDisplayContent(navBackStack, auraNavigator, bRg, g0w, z, null, false, false, (G0U) objAaT, bfm, 100663296, 224);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.navigation.AuraNavDisplayKt$AuraLoggedOutNavDisplay$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavBackStack<AuraNavKey> $backstack;
        public final /* synthetic */ boolean $isBackHandlingEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $overlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$backstack = navBackStack;
            this.$navigator = auraNavigator;
            this.$modifier = bRg;
            this.$isBackHandlingEnabled = z;
            this.$overlay = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraNavDisplayKt.AuraLoggedOutNavDisplay(this.$backstack, this.$navigator, this.$modifier, this.$isBackHandlingEnabled, this.$overlay, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.navigation.AuraNavDisplayKt$AuraNavDisplay$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C127082 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavBackStack<AuraNavKey> $backstack;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $overlay;
        public final /* synthetic */ C5qH<AuraNavKey> $pageSceneStrategy;
        public final /* synthetic */ boolean $requireBlockingOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C127082(NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, BRg bRg, C5qH<AuraNavKey> c5qH, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$backstack = navBackStack;
            this.$navigator = auraNavigator;
            this.$modifier = bRg;
            this.$pageSceneStrategy = c5qH;
            this.$requireBlockingOverlay = z;
            this.$overlay = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraNavDisplayKt.AuraNavDisplay(this.$backstack, this.$navigator, this.$modifier, this.$pageSceneStrategy, this.$requireBlockingOverlay, this.$overlay, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.navigation.AuraNavDisplayKt$AuraNavDisplayContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavKey $blockingOverlayKey;
        public final /* synthetic */ List<BRL<AuraNavKey>> $entries;
        public final /* synthetic */ boolean $isBackHandlingEnabled;
        public final /* synthetic */ boolean $isTerminalTop;
        public final /* synthetic */ AuraNavDisplayKt$AuraNavDisplayContent$navigationEventDispatcherOwner$1$1 $navigationEventDispatcherOwner;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $overlay;
        public final /* synthetic */ boolean $requireBlockingOverlay;
        public final /* synthetic */ List<C5qH<AuraNavKey>> $sceneStrategies;
        public final /* synthetic */ C28u $systemBackDispatcherOwner;

        /* renamed from: com.facebook.aura.navigation.AuraNavDisplayKt$AuraNavDisplayContent$3$2, reason: invalid class name */
        /* loaded from: classes4.dex */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ AuraNavKey $blockingOverlayKey;
            public final /* synthetic */ List<BRL<AuraNavKey>> $entries;
            public final /* synthetic */ boolean $isBackHandlingEnabled;
            public final /* synthetic */ AuraNavigator $navigator;
            public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $overlay;
            public final /* synthetic */ boolean $requireBlockingOverlay;
            public final /* synthetic */ List<C5qH<AuraNavKey>> $sceneStrategies;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass2(boolean z, AuraNavKey auraNavKey, List<BRL<AuraNavKey>> list, List<? extends C5qH<AuraNavKey>> list2, boolean z2, AuraNavigator auraNavigator, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
                super(2);
                this.$requireBlockingOverlay = z;
                this.$blockingOverlayKey = auraNavKey;
                this.$entries = list;
                this.$sceneStrategies = list2;
                this.$isBackHandlingEnabled = z2;
                this.$navigator = auraNavigator;
                this.$overlay = g0w;
            }

            public final void invoke(BFM bfm, int i) {
                if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    bfm.Afo();
                    return;
                }
                if (this.$requireBlockingOverlay && this.$blockingOverlayKey == null) {
                    Object objA0p = AnonymousClass001.A0p(bfm, -940066874);
                    if (objA0p == C78N.A00) {
                        objA0p = AuraNavDisplayKt$AuraNavDisplayContent$3$2$1$1.INSTANCE;
                        bfm.Ai0(objA0p);
                    }
                    B81.A00(false, (Function0) objA0p, bfm, 48, 1);
                    C1b8.A04(bfm, C10G.A01, AuraTheme.INSTANCE.getColors(bfm, 6).background);
                } else {
                    bfm.AgE(-939928366);
                    List<BRL<AuraNavKey>> list = this.$entries;
                    List<C5qH<AuraNavKey>> list2 = this.$sceneStrategies;
                    Object objAaT = bfm.AaT();
                    Object obj = C78N.A00;
                    if (objAaT == obj) {
                        objAaT = AuraNavDisplayKt$AuraNavDisplayContent$3$2$2$1.INSTANCE;
                        bfm.Ai0(objAaT);
                    }
                    G0U g0u = (G0U) objAaT;
                    Object objAaT2 = bfm.AaT();
                    if (objAaT2 == obj) {
                        objAaT2 = AuraNavDisplayKt$AuraNavDisplayContent$3$2$3$1.INSTANCE;
                        bfm.Ai0(objAaT2);
                    }
                    G0U g0u2 = (G0U) objAaT2;
                    boolean zA1T = AnonymousClass001.A1T(bfm, this.$navigator, bfm.A66(this.$isBackHandlingEnabled));
                    boolean z = this.$isBackHandlingEnabled;
                    AuraNavigator auraNavigator = this.$navigator;
                    Object objAaT3 = bfm.AaT();
                    if (zA1T || objAaT3 == obj) {
                        objAaT3 = new AuraNavDisplayKt$AuraNavDisplayContent$3$2$4$1(z, auraNavigator);
                        BBI.A0T(bfm, objAaT3);
                    }
                    AMR.A00(null, null, bfm, null, null, list, list2, null, (Function0) objAaT3, g0u, g0u2, null, 113246208, 0, HatchMessageShareDocumentRenderer.MIN_IMAGE_HEIGHT_PX);
                    C1062ATq c1062ATq = C10G.A01;
                    G0W<InterfaceC05151eP, BFM, Integer, Unit> g0w = this.$overlay;
                    InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(false);
                    BBI bbi = (BBI) bfm;
                    int iA0J = AnonymousClass003.A0J(bbi);
                    AKQ akqA04 = BBI.A04(bbi);
                    BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                    Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                    if (bbi.A0V == null) {
                        C00x.A00();
                        throw F60.createAndThrow();
                    }
                    AnonymousClass005.A0n(bfm, bbi, function0);
                    AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA01, iA0J);
                    AnonymousClass001.A1G(C0z7.A00, bfm, g0w, 6);
                    BBI.A0R(bbi, true);
                }
                AnonymousClass001.A1D(bfm);
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AuraNavDisplayKt$AuraNavDisplayContent$navigationEventDispatcherOwner$1$1 auraNavDisplayKt$AuraNavDisplayContent$navigationEventDispatcherOwner$1$1, C28u c28u, AuraNavigator auraNavigator, boolean z, boolean z2, boolean z3, AuraNavKey auraNavKey, List<BRL<AuraNavKey>> list, List<? extends C5qH<AuraNavKey>> list2, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w) {
            super(2);
            this.$navigationEventDispatcherOwner = auraNavDisplayKt$AuraNavDisplayContent$navigationEventDispatcherOwner$1$1;
            this.$systemBackDispatcherOwner = c28u;
            this.$navigator = auraNavigator;
            this.$isTerminalTop = z;
            this.$isBackHandlingEnabled = z2;
            this.$requireBlockingOverlay = z3;
            this.$blockingOverlayKey = auraNavKey;
            this.$entries = list;
            this.$sceneStrategies = list2;
            this.$overlay = g0w;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AKJ<C28u> akjA04 = C1EP.A00.A04(this.$navigationEventDispatcherOwner);
                AKH<C28u> akh = AuraTerminalBackHandlerKt.LocalAuraTerminalBackDispatcherOwner;
                C28u c28u = this.$systemBackDispatcherOwner;
                boolean z = this.$isTerminalTop;
                boolean z2 = this.$isBackHandlingEnabled;
                if (!z || !z2) {
                    c28u = null;
                }
                AKJ<C28u> akjA042 = akh.A04(c28u);
                AKH<AuraNavigator> akh2 = AuraNavigatorKt.LocalNavigator;
                AuraNavigator auraNavigator = this.$navigator;
                AnonymousClass003.A0p(bfm, new AnonymousClass2(this.$requireBlockingOverlay, this.$blockingOverlayKey, this.$entries, this.$sceneStrategies, z2, auraNavigator, this.$overlay), new AKJ[]{akjA04, akjA042, akh2.A04(auraNavigator)}, 2111625855);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.navigation.AuraNavDisplayKt$AuraNavDisplayContent$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavBackStack<AuraNavKey> $backstack;
        public final /* synthetic */ boolean $isBackHandlingEnabled;
        public final /* synthetic */ boolean $modalFlowsEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0W<InterfaceC05151eP, BFM, Integer, Unit> $overlay;
        public final /* synthetic */ C5qH<AuraNavKey> $pageSceneStrategy;
        public final /* synthetic */ G0U<C5rn<AuraNavKey>, Unit> $provideEntries;
        public final /* synthetic */ boolean $requireBlockingOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, BRg bRg, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, boolean z, C5qH<AuraNavKey> c5qH, boolean z2, boolean z3, G0U<? super C5rn<AuraNavKey>, Unit> g0u, int i, int i2) {
            super(2);
            this.$backstack = navBackStack;
            this.$navigator = auraNavigator;
            this.$modifier = bRg;
            this.$overlay = g0w;
            this.$isBackHandlingEnabled = z;
            this.$pageSceneStrategy = c5qH;
            this.$modalFlowsEnabled = z2;
            this.$requireBlockingOverlay = z3;
            this.$provideEntries = g0u;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraNavDisplayKt.AuraNavDisplayContent(this.$backstack, this.$navigator, this.$modifier, this.$overlay, this.$isBackHandlingEnabled, this.$pageSceneStrategy, this.$modalFlowsEnabled, this.$requireBlockingOverlay, this.$provideEntries, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraLoggedOutNavDisplay(NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, BRg bRg, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        boolean z2 = z;
        BRg bRg2 = bRg;
        G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        boolean zA1a = AnonymousClass002.A1a(navBackStack, auraNavigator);
        bfm.AgG(368566337);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(navBackStack, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraNavigator, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0q(bfm, z);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0X(bfm, g0w2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                z2 = true;
            }
            if (i5 != 0) {
                g0w2 = ComposableSingletons$AuraNavDisplayKt.f84lambda$2069284090;
            }
            AnonymousClass003.A0m(bfm, AuraPageCardKt.LocalAuraPageCardSuppressed.A04(Boolean.valueOf(zA1a)), new AnonymousClass1(navBackStack, auraNavigator, bRg2, g0w2, z2), 1943556993);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(navBackStack, auraNavigator, bRg2, z2, g0w2, i, i2);
        }
    }

    public static final void AuraNavDisplay(NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, BRg bRg, C5qH<AuraNavKey> c5qH, boolean z, G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        C5qH<AuraNavKey> c5qH2 = c5qH;
        G0W<? super InterfaceC05151eP, ? super BFM, ? super Integer, Unit> g0w2 = g0w;
        BRg bRg2 = bRg;
        boolean zA1K = z;
        boolean zA1b = AnonymousClass004.A1b(navBackStack, auraNavigator);
        bfm.AgG(956338072);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(navBackStack, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraNavigator, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, c5qH2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0r(bfm, zA1K);
        }
        int i6 = i2 & 32;
        int iA0Y = 196608;
        if (i6 != 0) {
            iA05 |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0w2);
            iA05 |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                c5qH2 = null;
            }
            zA1K = C3cG.A1K(i5, zA1K);
            if (i6 != 0) {
                g0w2 = ComposableSingletons$AuraNavDisplayKt.lambda$893528051;
            }
            boolean zA1Z = AnonymousClass002.A1Z(AuraModalFlowPresentationKt.auraModalFlowPresentation(bfm, zA1b ? 1 : 0), AuraModalFlowPresentation.Dialog);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = AuraNavDisplayKt$AuraNavDisplay$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraNavDisplayContent(navBackStack, auraNavigator, bRg2, g0w2, zA1b, c5qH2, zA1Z, zA1K, (G0U) objAaT, bfm, AnonymousClass001.A0C(iA05 << 9, AnonymousClass002.A07(iA05, (iA05 & 14) | 100663296) | ((iA05 >> 6) & 7168) | (458752 & (iA05 << 6))), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C127082(navBackStack, auraNavigator, bRg2, c5qH2, zA1K, g0w2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraNavDisplayContent(androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey> r23, com.facebook.aura.navigation.AuraNavigator r24, X.BRg r25, X.G0W<? super X.InterfaceC05151eP, ? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r26, boolean r27, X.C5qH<com.facebook.aura.navigation.AuraNavKey> r28, boolean r29, boolean r30, X.G0U<? super X.C5rn<com.facebook.aura.navigation.AuraNavKey>, kotlin.Unit> r31, X.BFM r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 674
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.navigation.AuraNavDisplayKt.AuraNavDisplayContent(androidx.navigation3.runtime.NavBackStack, com.facebook.aura.navigation.AuraNavigator, X.BRg, X.G0W, boolean, X.5qH, boolean, boolean, X.G0U, X.BFM, int, int):void");
    }
}
