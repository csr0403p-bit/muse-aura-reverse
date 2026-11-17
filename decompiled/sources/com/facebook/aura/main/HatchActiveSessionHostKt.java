package com.facebook.aura.main;

import X.AKH;
import X.AKJ;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BJW;
import X.BQN;
import X.BRg;
import X.BS0;
import X.C06G;
import X.C0861A6i;
import X.C1BO;
import X.C1DG;
import X.C2CK;
import X.C78N;
import X.C78e;
import X.C7BY;
import X.CFK;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05151eP;
import androidx.activity.ComponentActivity;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.activation.data.ActivationState;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.bugreport.AuraRageShakeManager;
import com.facebook.aura.confidentialvm.ConfidentialVmSetupGate;
import com.facebook.aura.deeplink.HatchIntentViewModel;
import com.facebook.aura.deeplink.HatchIntentViewModelKt;
import com.facebook.aura.globaleffects.HatchGlobalEffectsKt;
import com.facebook.aura.globaleffects.api.AppFloatingLayerKt;
import com.facebook.aura.header.view.HatchExpandedAvatarPanelKt;
import com.facebook.aura.header.view.HatchForegroundHeaderKt;
import com.facebook.aura.header.view.HatchForegroundHeaderState;
import com.facebook.aura.header.view.HatchStatusPillMetrics;
import com.facebook.aura.header.view.HatchStatusPillMetricsKt;
import com.facebook.aura.header.view.HatchTabHeaderKt;
import com.facebook.aura.library.repo.ArtifactItem;
import com.facebook.aura.library.repo.ArtifactSource;
import com.facebook.aura.library.repo.ArtifactsDataSource;
import com.facebook.aura.livesession.api.LiveSessionChromeKt;
import com.facebook.aura.navigation.AuraNavDisplayKt;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavKeyKt;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraNavigatorKt;
import com.facebook.aura.navigation.AuraPageSceneStrategy;
import com.facebook.aura.navigation.HatchSidePanelController;
import com.facebook.aura.navigation.HatchSidePanelDock;
import com.facebook.aura.navigation.RememberAuraNavBackStackKt;
import com.facebook.aura.navigation.SidePanelLocalsKt;
import com.facebook.aura.navigation.SidePanelOpenGestureKt;
import com.facebook.aura.navigation.key.ActivationScreenKey;
import com.facebook.aura.navigation.key.ConversationTabScreenKey;
import com.facebook.aura.navigation.key.OnboardingGateScreenKey;
import com.facebook.aura.navigation.key.SpaceTabScreenKey;
import com.facebook.aura.navigation.key.SpacesModalScreenKey;
import com.facebook.aura.onboarding.OnboardingStartupGate;
import com.facebook.aura.overlay.HatchOverlayFrameworkKt;
import com.facebook.aura.overlay.HatchOverlayKt;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.session.LocalUserSessionKt;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.tabs.AuraTabBarHostKt;
import com.facebook.aura.tabs.AuraTabBarHostState;
import com.facebook.aura.tabs.AuraTabLayoutKt;
import com.facebook.aura.ui.HatchFloatingChromeGeometry;
import com.facebook.aura.ui.HatchFloatingChromeGeometryKt;
import com.facebook.aura.ui.adaptive.AuraAvatarPanelShapeKt;
import com.facebook.aura.ui.adaptive.AuraContentAreaKt;
import com.facebook.aura.ui.adaptive.AuraSidePanelPresentation;
import com.facebook.aura.ui.adaptive.AuraSidePanelPresentationKt;
import com.facebook.aura.user.provider.AuraUserData;
import com.facebook.aura.user.provider.AuraViewerDataProvider;
import com.facebook.aura.user.provider.HatchGatewayConnectOwnership;
import com.facebook.aura.utils.HatchUtil;
import com.facebook.common.dextricks.RuntimeInternals;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchActiveSessionHostKt {
    public static final String TAG = "HatchGatewayOwnership";

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchActiveSessionHost$6, reason: invalid class name */
    public final class AnonymousClass6 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
        public final /* synthetic */ HatchSidePanelDockState $dockState;
        public final /* synthetic */ HatchFloatingChromeGeometry $floatingChromeGeometry;
        public final /* synthetic */ HatchForegroundHeaderState $foregroundHeaderState;
        public final /* synthetic */ boolean $isBlocked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
        public final /* synthetic */ AbstractC3358CGz $session;
        public final /* synthetic */ AuraSessionManager.SessionState.Active $sessionState;
        public final /* synthetic */ HatchSidePanelController $sidePanelController;
        public final /* synthetic */ HatchStatusPillMetrics $statusPillMetrics;
        public final /* synthetic */ AuraTabBarHostState $tabBarHostState;

        /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchActiveSessionHost$6$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
            public final /* synthetic */ HatchSidePanelDockState $dockState;
            public final /* synthetic */ boolean $isBlocked;
            public final /* synthetic */ BRg $modifier;
            public final /* synthetic */ AuraNavigator $navigator;
            public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
            public final /* synthetic */ AbstractC3358CGz $session;
            public final /* synthetic */ HatchSidePanelController $sidePanelController;

            /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchActiveSessionHost$6$1$1, reason: invalid class name and collision with other inner class name */
            public final class C02321 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
                public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
                public final /* synthetic */ HatchSidePanelDockState $dockState;
                public final /* synthetic */ boolean $isBlocked;
                public final /* synthetic */ BRg $modifier;
                public final /* synthetic */ AuraNavigator $navigator;
                public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
                public final /* synthetic */ AbstractC3358CGz $session;
                public final /* synthetic */ HatchSidePanelController $sidePanelController;

                /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchActiveSessionHost$6$1$1$1, reason: invalid class name and collision with other inner class name */
                public final class C02331 extends AbstractC7559F3s implements G0W<InterfaceC05151eP, BFM, Integer, Unit> {
                    public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
                    public final /* synthetic */ HatchSidePanelDockState $dockState;
                    public final /* synthetic */ AuraNavigator $navigator;
                    public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
                    public final /* synthetic */ AbstractC3358CGz $session;
                    public final /* synthetic */ HatchSidePanelController $sidePanelController;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public C02331(AbstractC3358CGz abstractC3358CGz, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, HatchSidePanelDockState hatchSidePanelDockState, G0U<? super AbstractC3358CGz, Unit> g0u) {
                        super(3);
                        this.$session = abstractC3358CGz;
                        this.$backStack = navBackStack;
                        this.$navigator = auraNavigator;
                        this.$sidePanelController = hatchSidePanelController;
                        this.$dockState = hatchSidePanelDockState;
                        this.$onInitialContentRendered = g0u;
                    }

                    @Override // X.G0W
                    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, Integer num) {
                        invoke(interfaceC05151eP, bfm, AnonymousClass001.A0F(num));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(InterfaceC05151eP interfaceC05151eP, BFM bfm, int i) {
                        if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                            HatchActiveSessionHostKt.HatchAuthenticatedContent(this.$session, this.$backStack, this.$navigator, this.$sidePanelController, this.$dockState, this.$onInitialContentRendered, null, bfm, HatchSidePanelController.$stable << 9, 64);
                            HatchGlobalEffectsKt.HatchGlobalEffects(bfm, 0);
                        } else {
                            bfm.Afo();
                        }
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C02321(BRg bRg, boolean z, AbstractC3358CGz abstractC3358CGz, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, HatchSidePanelDockState hatchSidePanelDockState, G0U<? super AbstractC3358CGz, Unit> g0u) {
                    super(2);
                    this.$modifier = bRg;
                    this.$isBlocked = z;
                    this.$session = abstractC3358CGz;
                    this.$backStack = navBackStack;
                    this.$navigator = auraNavigator;
                    this.$sidePanelController = hatchSidePanelController;
                    this.$dockState = hatchSidePanelDockState;
                    this.$onInitialContentRendered = g0u;
                }

                @Override // X.G0V
                public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                    invoke(bfm, AnonymousClass001.A0F(num));
                    return Unit.INSTANCE;
                }

                public final void invoke(BFM bfm, int i) {
                    if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                        LiveSessionChromeKt.LiveSessionChromeHost(AnonymousClass001.A0T(this.$modifier), !this.$isBlocked, B1V.A00(bfm, new C02331(this.$session, this.$backStack, this.$navigator, this.$sidePanelController, this.$dockState, this.$onInitialContentRendered), -1377687508), bfm, 384, 0);
                    } else {
                        bfm.Afo();
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(HatchSidePanelDockState hatchSidePanelDockState, BRg bRg, boolean z, AbstractC3358CGz abstractC3358CGz, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, G0U<? super AbstractC3358CGz, Unit> g0u) {
                super(2);
                this.$dockState = hatchSidePanelDockState;
                this.$modifier = bRg;
                this.$isBlocked = z;
                this.$session = abstractC3358CGz;
                this.$backStack = navBackStack;
                this.$navigator = auraNavigator;
                this.$sidePanelController = hatchSidePanelController;
                this.$onInitialContentRendered = g0u;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    HatchOverlayKt.HatchOverlay(bfm, 0);
                    AuraContentAreaKt.m2356ProvideAuraContentAreakHDZbjc(this.$dockState.m1338getContentStartInsetD9Ej5fM(), B1V.A00(bfm, new C02321(this.$modifier, this.$isBlocked, this.$session, this.$backStack, this.$navigator, this.$sidePanelController, this.$dockState, this.$onInitialContentRendered), -75651340), bfm, 48);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(AbstractC3358CGz abstractC3358CGz, AuraSessionManager.SessionState.Active active, AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, HatchSidePanelDockState hatchSidePanelDockState, HatchStatusPillMetrics hatchStatusPillMetrics, AuraTabBarHostState auraTabBarHostState, HatchFloatingChromeGeometry hatchFloatingChromeGeometry, HatchForegroundHeaderState hatchForegroundHeaderState, BRg bRg, boolean z, NavBackStack<AuraNavKey> navBackStack, G0U<? super AbstractC3358CGz, Unit> g0u) {
            super(2);
            this.$session = abstractC3358CGz;
            this.$sessionState = active;
            this.$navigator = auraNavigator;
            this.$sidePanelController = hatchSidePanelController;
            this.$dockState = hatchSidePanelDockState;
            this.$statusPillMetrics = hatchStatusPillMetrics;
            this.$tabBarHostState = auraTabBarHostState;
            this.$floatingChromeGeometry = hatchFloatingChromeGeometry;
            this.$foregroundHeaderState = hatchForegroundHeaderState;
            this.$modifier = bRg;
            this.$isBlocked = z;
            this.$backStack = navBackStack;
            this.$onInitialContentRendered = g0u;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AKH<AbstractC3358CGz> akh = LocalUserSessionKt.LocalUserSession;
                AbstractC3358CGz abstractC3358CGz = this.$session;
                AKJ<AbstractC3358CGz> akjA04 = akh.A04(abstractC3358CGz);
                AKJ<AbstractC3358CGz> akjA042 = LocalUserSessionKt.LocalUserSessionOrNull.A04(abstractC3358CGz);
                AKJ<Long> akjA043 = LocalUserSessionKt.LocalUserSessionGeneration.A04(Long.valueOf(this.$sessionState.sessionGeneration));
                AKH<AuraNavigator> akh2 = AuraNavigatorKt.LocalNavigator;
                AuraNavigator auraNavigator = this.$navigator;
                AKJ<AuraNavigator> akjA044 = akh2.A04(auraNavigator);
                AKH<HatchSidePanelController> akh3 = SidePanelLocalsKt.LocalSidePanelController;
                HatchSidePanelController hatchSidePanelController = this.$sidePanelController;
                AKJ<HatchSidePanelController> akjA045 = akh3.A04(hatchSidePanelController);
                AKH<HatchSidePanelDock> akh4 = SidePanelLocalsKt.LocalHatchSidePanelDock;
                HatchSidePanelDockState hatchSidePanelDockState = this.$dockState;
                AnonymousClass003.A0p(bfm, new AnonymousClass1(hatchSidePanelDockState, this.$modifier, this.$isBlocked, abstractC3358CGz, this.$backStack, auraNavigator, hatchSidePanelController, this.$onInitialContentRendered), new AKJ[]{akjA04, akjA042, akjA043, akjA044, akjA045, akh4.A04(hatchSidePanelDockState.dock), HatchStatusPillMetricsKt.LocalHatchStatusPillMetrics.A04(this.$statusPillMetrics), AuraTabBarHostKt.LocalAuraTabBarHostState.A04(this.$tabBarHostState), HatchFloatingChromeGeometryKt.LocalHatchFloatingChromeGeometry.A04(this.$floatingChromeGeometry), HatchForegroundHeaderKt.LocalHatchForegroundHeaderState.A04(this.$foregroundHeaderState)}, 772900452);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchActiveSessionHost$7, reason: invalid class name */
    public final class AnonymousClass7 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $isActivationEnabled;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
        public final /* synthetic */ AuraRageShakeManager $rageShakeManager;
        public final /* synthetic */ AuraSessionManager.SessionState.Active $sessionState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass7(AuraSessionManager.SessionState.Active active, boolean z, AuraRageShakeManager auraRageShakeManager, G0U<? super AbstractC3358CGz, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$sessionState = active;
            this.$isActivationEnabled = z;
            this.$rageShakeManager = auraRageShakeManager;
            this.$onInitialContentRendered = g0u;
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
            HatchActiveSessionHostKt.HatchActiveSessionHost(this.$sessionState, this.$isActivationEnabled, this.$rageShakeManager, this.$onInitialContentRendered, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchAuthenticatedContent$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<Boolean, BFM, Integer, Unit> {
        public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
        public final /* synthetic */ HatchSidePanelDockState $dockState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
        public final /* synthetic */ float $panelWidthPx;
        public final /* synthetic */ AbstractC3358CGz $session;
        public final /* synthetic */ long $shadowColor;
        public final /* synthetic */ HatchSidePanelController $sidePanelController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(AbstractC3358CGz abstractC3358CGz, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, long j, float f, HatchSidePanelDockState hatchSidePanelDockState, G0U<? super AbstractC3358CGz, Unit> g0u, BRg bRg) {
            super(3);
            this.$session = abstractC3358CGz;
            this.$backStack = navBackStack;
            this.$navigator = auraNavigator;
            this.$sidePanelController = hatchSidePanelController;
            this.$shadowColor = j;
            this.$panelWidthPx = f;
            this.$dockState = hatchSidePanelDockState;
            this.$onInitialContentRendered = g0u;
            this.$modifier = bRg;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, BFM bfm, Integer num) {
            invoke(AnonymousClass001.A1X(bool), bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(boolean z, BFM bfm, int i) {
            int iA0n = i;
            if ((i & 6) == 0) {
                iA0n = i | AnonymousClass004.A0n(bfm, z);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0n), bfm, iA0n)) {
                HatchActiveSessionHostKt.m1336HatchAuthenticatedLayersYod850M(this.$session, z, this.$backStack, this.$navigator, this.$sidePanelController, this.$shadowColor, this.$panelWidthPx, this.$dockState, this.$onInitialContentRendered, this.$modifier, bfm, (HatchSidePanelController.$stable << 12) | ((iA0n << 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchAuthenticatedContent$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
        public final /* synthetic */ HatchSidePanelDockState $dockState;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ G0U<AbstractC3358CGz, Unit> $onInitialContentRendered;
        public final /* synthetic */ AbstractC3358CGz $session;
        public final /* synthetic */ HatchSidePanelController $sidePanelController;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(AbstractC3358CGz abstractC3358CGz, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, HatchSidePanelDockState hatchSidePanelDockState, G0U<? super AbstractC3358CGz, Unit> g0u, BRg bRg, int i, int i2) {
            super(2);
            this.$session = abstractC3358CGz;
            this.$backStack = navBackStack;
            this.$navigator = auraNavigator;
            this.$sidePanelController = hatchSidePanelController;
            this.$dockState = hatchSidePanelDockState;
            this.$onInitialContentRendered = g0u;
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
            HatchActiveSessionHostKt.HatchAuthenticatedContent(this.$session, this.$backStack, this.$navigator, this.$sidePanelController, this.$dockState, this.$onInitialContentRendered, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchAuthenticatedNavDisplay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
        public final /* synthetic */ HatchSidePanelDock $dock;
        public final /* synthetic */ boolean $isBlocked;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onInitialContentRendered;
        public final /* synthetic */ AuraPageSceneStrategy $pageSceneStrategy;
        public final /* synthetic */ float $panelInset;
        public final /* synthetic */ HatchStatusPillMetrics $pillMetrics;
        public final /* synthetic */ boolean $requireBlockingOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, HatchSidePanelDock hatchSidePanelDock, boolean z, Function0<Unit> function0, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, AuraPageSceneStrategy auraPageSceneStrategy, boolean z2, float f, HatchStatusPillMetrics hatchStatusPillMetrics) {
            super(2);
            this.$modifier = bRg;
            this.$dock = hatchSidePanelDock;
            this.$isBlocked = z;
            this.$onInitialContentRendered = function0;
            this.$backStack = navBackStack;
            this.$navigator = auraNavigator;
            this.$pageSceneStrategy = auraPageSceneStrategy;
            this.$requireBlockingOverlay = z2;
            this.$panelInset = f;
            this.$pillMetrics = hatchStatusPillMetrics;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.AgE(-1164011993);
                bfm.AgE(-1164016235);
                BRg bRgA0T = AnonymousClass001.A0T(this.$modifier);
                if (!this.$dock.isDocked) {
                    bRgA0T = bRgA0T.then(C06G.A0N(bfm, BRg.A00));
                }
                BBI bbi = (BBI) bfm;
                BBI.A0R(bbi, false);
                boolean z = this.$isBlocked;
                float f = this.$panelInset;
                HatchStatusPillMetrics hatchStatusPillMetrics = this.$pillMetrics;
                if (!z) {
                    BS0 bs0 = BRg.A00;
                    HatchForegroundHeaderState hatchForegroundHeaderState = (HatchForegroundHeaderState) bfm.A6v(HatchForegroundHeaderKt.LocalHatchForegroundHeaderState);
                    boolean zA65 = bfm.A65(hatchStatusPillMetrics);
                    Object objAaT = bfm.AaT();
                    if (zA65 || objAaT == C78N.A00) {
                        objAaT = new HatchActiveSessionHostKt$HatchAuthenticatedNavDisplay$1$2$1$1(hatchStatusPillMetrics);
                        bfm.Ai0(objAaT);
                    }
                    bRgA0T = bRgA0T.then(HatchExpandedAvatarPanelKt.m987hatchExpandedAvatarPanelInsetziNgDLE(bs0, f, hatchForegroundHeaderState, (Function0) objAaT));
                }
                BBI.A0R(bbi, false);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = HatchActiveSessionHostKt$HatchAuthenticatedNavDisplay$1$3$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                AuraNavDisplayKt.AuraNavDisplay(this.$backStack, this.$navigator, BJW.A00(AnonymousClass001.A0Y(bRgA0T, objAaT2, false), this.$onInitialContentRendered), this.$pageSceneStrategy, this.$requireBlockingOverlay, null, bfm, 0, 32);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$HatchAuthenticatedNavDisplay$2, reason: invalid class name and case insensitive filesystem */
    public final class C126532 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ Function0<Unit> $onInitialContentRendered;
        public final /* synthetic */ boolean $requireBlockingOverlay;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126532(NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, boolean z, Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$backStack = navBackStack;
            this.$navigator = auraNavigator;
            this.$requireBlockingOverlay = z;
            this.$onInitialContentRendered = function0;
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
            HatchActiveSessionHostKt.HatchAuthenticatedNavDisplay(this.$backStack, this.$navigator, this.$requireBlockingOverlay, this.$onInitialContentRendered, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$LiveSessionFloatingChrome$1, reason: invalid class name and case insensitive filesystem */
    public final class C126541 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ NavBackStack<AuraNavKey> $backStack;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126541(NavBackStack<AuraNavKey> navBackStack, BRg bRg, int i, int i2) {
            super(2);
            this.$backStack = navBackStack;
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
            HatchActiveSessionHostKt.LiveSessionFloatingChrome(this.$backStack, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.main.HatchActiveSessionHostKt$ReconcileTabsEffect$2, reason: invalid class name and case insensitive filesystem */
    public final class C126552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ AuraNavigator $navigator;
        public final /* synthetic */ AbstractC3358CGz $session;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C126552(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, int i) {
            super(2);
            this.$navigator = auraNavigator;
            this.$session = abstractC3358CGz;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchActiveSessionHostKt.ReconcileTabsEffect(this.$navigator, this.$session, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final void HatchActiveSessionHost(AuraSessionManager.SessionState.Active active, boolean z, AuraRageShakeManager auraRageShakeManager, G0U<? super AbstractC3358CGz, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A11(active, auraRageShakeManager, g0u, 0);
        bfm.AgG(554015994);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, active) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(auraRageShakeManager, bfm, i) ? 1 : 0);
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
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ComponentActivity componentActivityA0y = AnonymousClass004.A0y(bfm);
            HatchIntentViewModel hatchIntentViewModel = (HatchIntentViewModel) BQN.A00(null, componentActivityA0y, AnonymousClass003.A0Z(componentActivityA0y), null, new C0861A6i(HatchIntentViewModel.class));
            AbstractC3358CGz abstractC3358CGz = active.session;
            boolean zHasBlockingOverlay = HatchOverlayFrameworkKt.hasBlockingOverlay(abstractC3358CGz, bfm, 0, 0);
            AuraNavKey startDestination = (!z || (!HatchGatewayConnectOwnership.Companion.getInstance(abstractC3358CGz).activationViewModelRoutePending.get() && isReturningFullyActivatedUser(abstractC3358CGz))) ? getStartDestination(abstractC3358CGz) : new ActivationScreenKey(false, false, null, false, null);
            NavBackStack<AuraNavKey> navBackStackRememberAuraNavBackStack = RememberAuraNavBackStackKt.rememberAuraNavBackStack(new AuraNavKey[]{startDestination}, bfm, 0);
            AuraNavigator auraNavigatorRememberLoggingAuraNavigator = LoggingAuraNavigatorKt.rememberLoggingAuraNavigator(abstractC3358CGz, navBackStackRememberAuraNavBackStack, bfm, 0);
            boolean zA1S = AnonymousClass001.A1S(bfm, auraNavigatorRememberLoggingAuraNavigator, (iA0T & 896) == 256 || ((iA0T & 512) != 0 && bfm.A67(auraRageShakeManager)));
            Object objAaT = bfm.AaT();
            if (zA1S || objAaT == C78N.A00) {
                objAaT = new HatchActiveSessionHostKt$HatchActiveSessionHost$1$1(auraRageShakeManager, auraNavigatorRememberLoggingAuraNavigator);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, auraNavigatorRememberLoggingAuraNavigator);
            if (zHasBlockingOverlay) {
                bfm.AgE(-867728248);
            } else {
                bfm.AgE(-867814738);
                LoggingAuraNavigatorKt.WarmStartNavigationEffect(auraNavigatorRememberLoggingAuraNavigator, bfm, 0);
                ReconcileTabsEffect(auraNavigatorRememberLoggingAuraNavigator, abstractC3358CGz, bfm, 0);
            }
            BBI bbi = (BBI) bfm;
            BBI.A0R(bbi, false);
            boolean zA1Y = AnonymousClass005.A1Y(bfm, abstractC3358CGz, startDestination, bfm.A67(hatchIntentViewModel), AnonymousClass004.A1I(iA0T));
            Object objAaT2 = bfm.AaT();
            if (zA1Y || objAaT2 == C78N.A00) {
                objAaT2 = new HatchActiveSessionHostKt$HatchActiveSessionHost$2$1(hatchIntentViewModel, z, abstractC3358CGz, startDestination);
                bfm.Ai0(objAaT2);
            }
            AnonymousClass001.A17(bfm, objAaT2, abstractC3358CGz);
            boolean zA1M = AnonymousClass003.A1M(bfm, hatchIntentViewModel, abstractC3358CGz);
            Object objAaT3 = bfm.AaT();
            if (zA1M || objAaT3 == C78N.A00) {
                objAaT3 = new HatchActiveSessionHostKt$HatchActiveSessionHost$3$1(hatchIntentViewModel, abstractC3358CGz);
                bfm.Ai0(objAaT3);
            }
            AnonymousClass001.A17(bfm, objAaT3, abstractC3358CGz);
            if (zHasBlockingOverlay) {
                bfm.AgE(-867087416);
            } else {
                boolean zA1Z = AnonymousClass001.A1Z(abstractC3358CGz, bfm, -867289226);
                Object objAaT4 = bfm.AaT();
                if (zA1Z || objAaT4 == C78N.A00) {
                    objAaT4 = new HatchActiveSessionHostKt$HatchActiveSessionHost$4$1(abstractC3358CGz);
                    bfm.Ai0(objAaT4);
                }
                HatchIntentViewModelKt.DeeplinkNavigation(hatchIntentViewModel, auraNavigatorRememberLoggingAuraNavigator, navBackStackRememberAuraNavBackStack, abstractC3358CGz, (G0U) objAaT4, bfm, HatchIntentViewModel.$stable, 0);
            }
            BBI.A0R(bbi, false);
            AuraSidePanelPresentation auraSidePanelPresentation = AuraSidePanelPresentationKt.auraSidePanelPresentation(bfm, 0);
            Object objAaT5 = bfm.AaT();
            Object obj = C78N.A00;
            if (objAaT5 == obj) {
                objAaT5 = new HatchSidePanelController(auraSidePanelPresentation);
                bfm.Ai0(objAaT5);
            }
            HatchSidePanelController hatchSidePanelController = (HatchSidePanelController) objAaT5;
            boolean zA1H = AnonymousClass003.A1H(bfm, auraSidePanelPresentation, bfm.A67(hatchSidePanelController));
            Object objAaT6 = bfm.AaT();
            if (zA1H || objAaT6 == obj) {
                objAaT6 = new HatchActiveSessionHostKt$HatchActiveSessionHost$5$1(hatchSidePanelController, auraSidePanelPresentation);
                bfm.Ai0(objAaT6);
            }
            AnonymousClass001.A15(bfm, objAaT6);
            Object objAaT7 = bfm.AaT();
            if (objAaT7 == obj) {
                objAaT7 = new HatchStatusPillMetrics();
                bfm.Ai0(objAaT7);
            }
            HatchStatusPillMetrics hatchStatusPillMetrics = (HatchStatusPillMetrics) objAaT7;
            AuraTabBarHostState auraTabBarHostStateRememberAuraTabBarHostState = AuraTabBarHostKt.rememberAuraTabBarHostState(bfm, 0);
            Object objAaT8 = bfm.AaT();
            if (objAaT8 == obj) {
                objAaT8 = new HatchFloatingChromeGeometry();
                bfm.Ai0(objAaT8);
            }
            HatchFloatingChromeGeometry hatchFloatingChromeGeometry = (HatchFloatingChromeGeometry) objAaT8;
            boolean zA65 = bfm.A65(navBackStackRememberAuraNavBackStack);
            Object objAaT9 = bfm.AaT();
            if (zA65 || objAaT9 == obj) {
                objAaT9 = new HatchForegroundHeaderState(hatchStatusPillMetrics, new HatchActiveSessionHostKt$HatchActiveSessionHost$foregroundHeaderState$1$1(navBackStackRememberAuraNavBackStack, hatchSidePanelController));
                bfm.Ai0(objAaT9);
            }
            AppFloatingLayerKt.ProvideAppFloatingLayers(abstractC3358CGz, B1V.A00(bfm, new AnonymousClass6(abstractC3358CGz, active, auraNavigatorRememberLoggingAuraNavigator, hatchSidePanelController, HatchSidePanelDockStateKt.rememberHatchSidePanelDockState(auraSidePanelPresentation, hatchSidePanelController, navBackStackRememberAuraNavBackStack, bfm, HatchSidePanelController.$stable << 3), hatchStatusPillMetrics, auraTabBarHostStateRememberAuraTabBarHostState, hatchFloatingChromeGeometry, (HatchForegroundHeaderState) objAaT9, bRg2, zHasBlockingOverlay, navBackStackRememberAuraNavBackStack, g0u), -1492360412), bfm, 48);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass7(active, z, auraRageShakeManager, g0u, bRg2, i, i2);
        }
    }

    public static final void HatchAuthenticatedContent(AbstractC3358CGz abstractC3358CGz, NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, HatchSidePanelController hatchSidePanelController, HatchSidePanelDockState hatchSidePanelDockState, G0U<? super AbstractC3358CGz, Unit> g0u, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1957040510);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, abstractC3358CGz) | i : i;
        if ((i & 48) == 0) {
            iA0T |= AnonymousClass002.A06(AnonymousClass004.A1Y(navBackStack, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA0T |= AnonymousClass003.A05(AnonymousClass004.A1Z(auraNavigator, bfm, i) ? 1 : 0);
        }
        if ((i & 3072) == 0) {
            iA0T |= AnonymousClass002.A00(AnonymousClass004.A1a(hatchSidePanelController, bfm, i) ? 1 : 0);
        }
        if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0T |= AnonymousClass004.A0h(bfm, hatchSidePanelDockState);
        }
        if ((196608 & i) == 0) {
            iA0T |= AnonymousClass004.A0Y(bfm, g0u);
        }
        int i3 = i2 & 64;
        int iA0j = 1572864;
        if (i3 != 0) {
            iA0T |= iA0j;
        } else if ((1572864 & i) == 0) {
            iA0j = AnonymousClass004.A0j(bfm, bRg2);
            iA0T |= iA0j;
        }
        boolean z = false;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(599187 & iA0T, 599186), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean z2 = (iA0T & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32 || ((iA0T & 64) != 0 && bfm.A65(navBackStack));
            Object objAaT = bfm.AaT();
            if (z2 || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new HatchActiveSessionHostKt$HatchAuthenticatedContent$topNonOverlay$2$1(navBackStack));
            }
            long j = AnonymousClass002.A0c(bfm).shadow;
            float fRememberSidePanelWidthPx = SidePanelOpenGestureKt.rememberSidePanelWidthPx(false, bfm, 0, 1);
            AuraNavKey auraNavKey = (AuraNavKey) ((C1BO) objAaT).getValue();
            if (!(navBackStack instanceof Collection) || !navBackStack.isEmpty()) {
                Iterator it = navBackStack.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else if (AuraNavKeyKt.isBlockingOverlay((AuraNavKey) it.next())) {
                        z = true;
                        break;
                    }
                }
            }
            HatchVmAccessHostKt.HatchVmAccessHost(abstractC3358CGz, auraNavKey, z, B1V.A00(bfm, new AnonymousClass2(abstractC3358CGz, navBackStack, auraNavigator, hatchSidePanelController, j, fRememberSidePanelWidthPx, hatchSidePanelDockState, g0u, bRg2), 819910025), bfm, (iA0T & 14) | 3072);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(abstractC3358CGz, navBackStack, auraNavigator, hatchSidePanelController, hatchSidePanelDockState, g0u, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x0232  */
    /* renamed from: HatchAuthenticatedLayers-Yod850M, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1336HatchAuthenticatedLayersYod850M(X.AbstractC3358CGz r38, boolean r39, androidx.navigation3.runtime.NavBackStack<com.facebook.aura.navigation.AuraNavKey> r40, com.facebook.aura.navigation.AuraNavigator r41, com.facebook.aura.navigation.HatchSidePanelController r42, long r43, float r45, com.facebook.aura.main.HatchSidePanelDockState r46, X.G0U<? super X.AbstractC3358CGz, kotlin.Unit> r47, X.BRg r48, X.BFM r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.HatchActiveSessionHostKt.m1336HatchAuthenticatedLayersYod850M(X.CGz, boolean, androidx.navigation3.runtime.NavBackStack, com.facebook.aura.navigation.AuraNavigator, com.facebook.aura.navigation.HatchSidePanelController, long, float, com.facebook.aura.main.HatchSidePanelDockState, X.G0U, X.BRg, X.BFM, int, int):void");
    }

    public static final void HatchAuthenticatedNavDisplay(NavBackStack<AuraNavKey> navBackStack, AuraNavigator auraNavigator, boolean z, Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        float f;
        BRg bRg2 = bRg;
        bfm.AgG(-1312778264);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(navBackStack, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(auraNavigator, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA05 |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA05 |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 9363, 9362), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchSidePanelDock hatchSidePanelDock = (HatchSidePanelDock) bfm.A6v(SidePanelLocalsKt.LocalHatchSidePanelDock);
            boolean zRememberShouldShowAuraTabBar = AuraTabLayoutKt.rememberShouldShowAuraTabBar(bfm, 0);
            float f2 = zRememberShouldShowAuraTabBar ? 60.0f : 0.0f;
            boolean zA66 = bfm.A66(zRememberShouldShowAuraTabBar);
            Object objAaT = bfm.AaT();
            if (zA66 || objAaT == C78N.A00) {
                objAaT = new AuraPageSceneStrategy(zRememberShouldShowAuraTabBar, ComposableSingletons$HatchActiveSessionHostKt.f79lambda$333029631);
                bfm.Ai0(objAaT);
            }
            AuraPageSceneStrategy auraPageSceneStrategy = (AuraPageSceneStrategy) objAaT;
            HatchStatusPillMetrics hatchStatusPillMetricsA0a = AnonymousClass002.A0a(bfm);
            float fSquarePanelSide = HatchExpandedAvatarPanelKt.squarePanelSide(bfm, 0);
            float hatchStatusPillHeight = HatchTabHeaderKt.getHatchStatusPillHeight(false, false, bfm, 0, 3);
            C1DG c1dgM1000getContentTopReservationlTKBWiU = hatchStatusPillMetricsA0a.m1000getContentTopReservationlTKBWiU();
            AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(false);
            float f3 = ((auraNavKeyCurrentKey instanceof SpaceTabScreenKey) || (auraNavKeyCurrentKey instanceof SpacesModalScreenKey)) ? 0.0f : HatchExpandedAvatarPanelKt.ExpandedPanelContentGap;
            if (AuraAvatarPanelShapeKt.auraAvatarPanelShape(bfm, 0).getDisplacesContent()) {
                float f4 = fSquarePanelSide + f3;
                if (c1dgM1000getContentTopReservationlTKBWiU != null) {
                    hatchStatusPillHeight = c1dgM1000getContentTopReservationlTKBWiU.A00;
                }
                f = C1DG.A04(new C1DG(f4 - hatchStatusPillHeight), 0.0f).A00;
            } else {
                f = 0.0f;
            }
            AnonymousClass003.A0m(bfm, C1DG.A02(AuraTabBarHostKt.LocalAuraTabBarHeight, f2), new AnonymousClass1(bRg2, hatchSidePanelDock, z, function0, navBackStack, auraNavigator, auraPageSceneStrategy, z, f, hatchStatusPillMetricsA0a), 1218899112);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126532(navBackStack, auraNavigator, z, function0, bRg2, i, i2);
        }
    }

    public static final AuraNavKey getStartDestination(AbstractC3358CGz abstractC3358CGz) {
        return OnboardingStartupGate.Companion.getInstance(abstractC3358CGz).hasCompletedOnboarding() ? ConversationTabScreenKey.INSTANCE : OnboardingGateScreenKey.INSTANCE;
    }

    public static final boolean isReturningFullyActivatedUser(AbstractC3358CGz abstractC3358CGz) {
        Boolean bool;
        Boolean bool2;
        StringBuilder sb;
        String strA0y;
        AuraUserData value = AuraViewerDataProvider.Companion.getInstance(abstractC3358CGz).userData.getValue();
        if (value == null) {
            strA0y = "nav activationScreen=true userData=null";
        } else {
            if (value.hasCompletedHatchActivation) {
                ActivationState currentActivationState = value.getCurrentActivationState(false, AnonymousClass001.A1X(ConfidentialVmSetupGate.Companion.getInstance(abstractC3358CGz).isSetupRequired.getValue()), false);
                z = currentActivationState == ActivationState.FULLY_ACTIVATED;
                bool = value.hasProvisionedVm;
                bool2 = value.isVmTypeSelectionRequired;
                sb = new StringBuilder("nav activationScreen=");
                sb.append(!z);
                sb.append(" activationState=");
                sb.append(currentActivationState);
                sb.append(" hasProvisionedVm=");
            } else {
                bool = value.hasProvisionedVm;
                bool2 = value.isVmTypeSelectionRequired;
                sb = new StringBuilder("nav activationScreen=true hasCompletedHatchActivation=false hasProvisionedVm=");
            }
            sb.append(bool);
            strA0y = AnonymousClass006.A0y(bool2, " isVmTypeSelectionRequired=", sb);
        }
        CFK.A05(TAG, strA0y);
        return z;
    }

    public static final void LiveSessionFloatingChrome(NavBackStack<AuraNavKey> navBackStack, BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(265044408);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(navBackStack, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        boolean z = true;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if ((iA05 & 14) != 4 && ((iA05 & 8) == 0 || !bfm.A65(navBackStack))) {
                z = false;
            }
            Object objAaT = bfm.AaT();
            if (z || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0R(bfm, new HatchActiveSessionHostKt$LiveSessionFloatingChrome$visible$2$1(navBackStack));
            }
            LiveSessionChromeKt.LiveSessionFloatingLayer(C1BO.A0F((C1BO) objAaT), bRg, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126541(navBackStack, bRg, i, i2);
        }
    }

    public static final void ReconcileTabsEffect(AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, BFM bfm, int i) {
        bfm.AgG(358183479);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(auraNavigator, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, abstractC3358CGz);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA05), bfm, iA05)) {
            boolean zIsFeedEnabled = HatchUtil.INSTANCE.isFeedEnabled();
            boolean zA65 = bfm.A65(abstractC3358CGz);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = AnonymousClass003.A0a(bfm, abstractC3358CGz);
            }
            ArtifactsDataSource artifactsDataSource = (ArtifactsDataSource) objAaT;
            C1BO c1boA02 = C2CK.A02(bfm, artifactsDataSource.items);
            C1BO c1boA022 = C2CK.A02(bfm, artifactsDataSource.hasLoaded);
            boolean zA652 = bfm.A65(c1boA02.getValue());
            Object objAaT2 = bfm.AaT();
            if (zA652 || objAaT2 == C78N.A00) {
                List list = (List) c1boA02.getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    ArtifactSource artifactSource = ((ArtifactItem) obj).source;
                    if (artifactSource == ArtifactSource.SPACE || artifactSource == ArtifactSource.SAVED_SPACE) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayListA0i.add(((ArtifactItem) it.next()).itemKey);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListA0i) {
                    if (!C7BY.A0j((String) obj2)) {
                        arrayList2.add(obj2);
                    }
                }
                objAaT2 = AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayList2));
                bfm.Ai0(objAaT2);
            }
            List list2 = (List) objAaT2;
            Object[] objArr = {abstractC3358CGz, Boolean.valueOf(C1BO.A0F(c1boA022)), Boolean.valueOf(zIsFeedEnabled), list2};
            boolean zA1X = AnonymousClass005.A1X(bfm, c1boA022, list2, (iA05 & 14) == 4 || ((iA05 & 8) != 0 && bfm.A67(auraNavigator)), bfm.A66(zIsFeedEnabled));
            Object objAaT3 = bfm.AaT();
            if (zA1X || objAaT3 == C78N.A00) {
                objAaT3 = new HatchActiveSessionHostKt$ReconcileTabsEffect$1$1(auraNavigator, zIsFeedEnabled, list2, c1boA022, null);
                bfm.Ai0(objAaT3);
            }
            C78e.A08(bfm, (G0V) objAaT3, objArr);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C126552(auraNavigator, abstractC3358CGz, i);
        }
    }

    public static final void maybeStartRootNavigationTrace(AbstractC3358CGz abstractC3358CGz, AuraNavKey auraNavKey, boolean z) {
        HatchNavTTRCSpec.Surface navTtrcSurface = LoggingAuraNavigatorKt.toNavTtrcSurface(auraNavKey);
        if (navTtrcSurface != null) {
            HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGz).startNavigation(navTtrcSurface, z, false, null, null);
        }
    }
}
