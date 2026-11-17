package com.facebook.aura.main;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import com.facebook.aura.analytics.hatch.HatchModule;
import com.facebook.aura.analytics.hatch.HatchTimeSpentLogger;
import com.facebook.aura.crashreporting.HatchScreenCrashAnnotator;
import com.facebook.aura.gateway.HatchGatewayConnection;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraOverlayNavKey;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.perf.HatchNavTTRCCoordinator;
import com.facebook.aura.perf.HatchNavTTRCSpec;
import com.facebook.aura.startup.AuraStartupMetricTracker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class LoggingAuraNavigator implements AuraNavigator {
    public static final int $stable = 8;
    public final NavBackStack<AuraNavKey> backStack;
    public final AuraNavigator delegate;
    public boolean lastReportedIsFeatureModule;
    public HatchModule lastReportedModule;
    public final HatchNavTTRCCoordinator navTtrcCoordinator;
    public final HatchTimeSpentLogger timeSpentLogger;
    public final AbstractC3358CGz userSession;

    private final void logPopNavigation(AuraNavKey auraNavKey) {
        AuraNavKey auraNavKey2 = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        if (C7384Etj.areEqual(auraNavKey, auraNavKey2)) {
            return;
        }
        annotateCrashReportsWithCurrentScreen();
        HatchModule hatchModule = auraNavKey != null ? LoggingAuraNavigatorKt.toHatchModule(auraNavKey) : null;
        HatchModule hatchModule2 = auraNavKey2 != null ? LoggingAuraNavigatorKt.toHatchModule(auraNavKey2) : null;
        reportStartupNavigation(auraNavKey2);
        if (hatchModule2 == null) {
            reportModuleUnderFeatureReturn(hatchModule, null, null);
            return;
        }
        if (hatchModule == null) {
            if (!isUnreported(hatchModule2)) {
                return;
            } else {
                hatchModule = this.lastReportedModule;
            }
        }
        reportTimeSpent(auraNavKey2, hatchModule, hatchModule2, null, null);
    }

    private final void reportModuleUnderFeatureReturn(HatchModule hatchModule, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype) {
        Object objPrevious;
        HatchModule hatchModule2;
        HatchModule hatchModule3 = hatchModule;
        if (this.lastReportedIsFeatureModule) {
            NavBackStack<AuraNavKey> navBackStack = this.backStack;
            ListIterator listIterator = navBackStack.listIterator(navBackStack.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                } else {
                    objPrevious = listIterator.previous();
                    if (LoggingAuraNavigatorKt.toHatchModule((AuraNavKey) objPrevious) != null) {
                        break;
                    }
                }
            }
            AuraNavKey auraNavKey = (AuraNavKey) objPrevious;
            if (auraNavKey == null || (hatchModule2 = LoggingAuraNavigatorKt.toHatchModule(auraNavKey)) == null || !isUnreported(hatchModule2)) {
                return;
            }
            if (hatchModule3 == null) {
                hatchModule3 = this.lastReportedModule;
            }
            reportTimeSpent(auraNavKey, hatchModule3, hatchModule2, hatchClickPoint, hatchEventSubtype);
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void addBeforeBackStackChangeListener(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.delegate.addBeforeBackStackChangeListener(function0);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean back() {
        AuraNavKey auraNavKey = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        boolean zBack = this.delegate.back();
        if (zBack) {
            annotateCrashReportsWithCurrentScreen();
            AuraNavKey auraNavKey2 = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
            HatchModule hatchModule = auraNavKey != null ? LoggingAuraNavigatorKt.toHatchModule(auraNavKey) : null;
            HatchModule hatchModule2 = auraNavKey2 != null ? LoggingAuraNavigatorKt.toHatchModule(auraNavKey2) : null;
            reportStartupNavigation(auraNavKey2);
            if (hatchModule2 == null) {
                reportModuleUnderFeatureReturn(hatchModule, HatchClickPoint.BACK_GESTURE, HatchEventSubtype.BACK_NAVIGATION);
                return zBack;
            }
            if (hatchModule != null) {
                reportTimeSpent(auraNavKey2, hatchModule, hatchModule2, HatchClickPoint.BACK_GESTURE, HatchEventSubtype.BACK_NAVIGATION);
            } else if (isUnreported(hatchModule2)) {
                hatchModule = this.lastReportedModule;
                reportTimeSpent(auraNavKey2, hatchModule, hatchModule2, HatchClickPoint.BACK_GESTURE, HatchEventSubtype.BACK_NAVIGATION);
            }
        }
        return zBack;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(G0U<? super AuraNavKey, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        return this.delegate.isInBackStack(g0u);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, boolean z) {
        C7384Etj.A0Y(auraNavKey, 0);
        AuraNavKey auraNavKey2 = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        HatchModule hatchModule = auraNavKey2 != null ? LoggingAuraNavigatorKt.toHatchModule(auraNavKey2) : null;
        maybeStartProgrammaticRootNavigationTrace(auraNavKey2, auraNavKey);
        this.delegate.navigate(auraNavKey, z);
        annotateCrashReportsWithCurrentScreen();
        if (auraNavKey2 != null && (auraNavKey2 instanceof AuraTabRootNavKey) && !(auraNavKey instanceof AuraTabRootNavKey) && LoggingAuraNavigatorKt.toNavTtrcSurface(auraNavKey) == null) {
            this.navTtrcCoordinator.cancelForPushNavigation();
        }
        reportStartupNavigation(auraNavKey);
        HatchModule hatchModule2 = LoggingAuraNavigatorKt.toHatchModule(auraNavKey);
        if (hatchModule2 != null) {
            reportTimeSpent(auraNavKey, hatchModule, hatchModule2, null, null);
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigateWithContext(AuraNavKey auraNavKey, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, LaunchFlag launchFlag) {
        C7384Etj.A0Y(auraNavKey, 0);
        AnonymousClass002.A1B(hatchClickPoint, 1, launchFlag);
        AuraNavKey auraNavKey2 = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        HatchModule hatchModule = auraNavKey2 != null ? LoggingAuraNavigatorKt.toHatchModule(auraNavKey2) : null;
        maybeStartProgrammaticRootNavigationTrace(auraNavKey2, auraNavKey);
        this.delegate.navigate(auraNavKey, launchFlag);
        annotateCrashReportsWithCurrentScreen();
        if (auraNavKey2 != null && (auraNavKey2 instanceof AuraTabRootNavKey) && hatchEventSubtype != HatchEventSubtype.TAB_SWITCH && !(auraNavKey instanceof AuraTabRootNavKey) && LoggingAuraNavigatorKt.toNavTtrcSurface(auraNavKey) == null) {
            this.navTtrcCoordinator.cancelForPushNavigation();
        }
        reportStartupNavigation(auraNavKey);
        HatchModule hatchModule2 = LoggingAuraNavigatorKt.toHatchModule(auraNavKey);
        if (hatchModule2 != null) {
            reportTimeSpent(auraNavKey, hatchModule, hatchModule2, hatchClickPoint, hatchEventSubtype);
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(G0U<? super AuraNavKey, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        AuraNavKey auraNavKey = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        this.delegate.popAll(g0u);
        logPopNavigation(auraNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popTabSubstack(AuraTabRootNavKey auraTabRootNavKey, AuraTabRootNavKey auraTabRootNavKey2) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        this.delegate.popTabSubstack(auraTabRootNavKey, auraTabRootNavKey2);
        annotateCrashReportsWithCurrentScreen();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToRoot() {
        AuraNavKey auraNavKey = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        this.delegate.popToRoot();
        annotateCrashReportsWithCurrentScreen();
        AuraNavKey auraNavKey2 = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        HatchModule hatchModule = auraNavKey != null ? LoggingAuraNavigatorKt.toHatchModule(auraNavKey) : null;
        HatchModule hatchModule2 = auraNavKey2 != null ? LoggingAuraNavigatorKt.toHatchModule(auraNavKey2) : null;
        reportStartupNavigation(auraNavKey2);
        if (hatchModule2 == null) {
            reportModuleUnderFeatureReturn(hatchModule, null, null);
            return;
        }
        if (hatchModule != null) {
            if (hatchModule == hatchModule2) {
                return;
            }
        } else if (!isUnreported(hatchModule2)) {
            return;
        } else {
            hatchModule = this.lastReportedModule;
        }
        reportTimeSpent(auraNavKey2, hatchModule, hatchModule2, null, null);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToTabRoot(AuraTabRootNavKey auraTabRootNavKey) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        this.delegate.popToTabRoot(auraTabRootNavKey);
        annotateCrashReportsWithCurrentScreen();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void removeBeforeBackStackChangeListener(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.delegate.removeBeforeBackStackChangeListener(function0);
    }

    public final void reportForeground() {
        Object objPrevious;
        HatchModule hatchModule;
        annotateCrashReportsWithCurrentScreen();
        NavBackStack<AuraNavKey> navBackStack = this.backStack;
        ListIterator listIterator = navBackStack.listIterator(navBackStack.size());
        do {
            objPrevious = null;
            if (!listIterator.hasPrevious()) {
                break;
            } else {
                objPrevious = listIterator.previous();
            }
        } while (objPrevious instanceof AuraOverlayNavKey);
        AuraNavKey auraNavKeyCurrentKey = (AuraNavKey) objPrevious;
        if (((auraNavKeyCurrentKey == null || LoggingAuraNavigatorKt.toHatchModule(auraNavKeyCurrentKey) == null) && (auraNavKeyCurrentKey = this.delegate.currentKey(false)) == null) || (hatchModule = LoggingAuraNavigatorKt.toHatchModule(auraNavKeyCurrentKey)) == null) {
            return;
        }
        reportTimeSpent(auraNavKeyCurrentKey, null, hatchModule, null, null);
    }

    private final void annotateCrashReportsWithCurrentScreen() {
        HatchScreenCrashAnnotator hatchScreenCrashAnnotator = HatchScreenCrashAnnotator.INSTANCE;
        AuraNavKey auraNavKey = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        hatchScreenCrashAnnotator.setCurrentScreen(auraNavKey != null ? LoggingAuraNavigatorKt.screenName(auraNavKey) : null);
        NavBackStack<AuraNavKey> navBackStack = this.backStack;
        ArrayList arrayListA0i = AnonymousClass003.A0i(navBackStack);
        Iterator it = navBackStack.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(LoggingAuraNavigatorKt.screenName((AuraNavKey) it.next()));
        }
        hatchScreenCrashAnnotator.setNavChain(arrayListA0i);
    }

    private final boolean isUnreported(HatchModule hatchModule) {
        return this.lastReportedIsFeatureModule && hatchModule != this.lastReportedModule;
    }

    public static /* synthetic */ void reportModuleUnderFeatureReturn$default(LoggingAuraNavigator loggingAuraNavigator, HatchModule hatchModule, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, int i, Object obj) {
        if ((i & 2) != 0) {
            hatchClickPoint = null;
        }
        if ((i & 4) != 0) {
            hatchEventSubtype = null;
        }
        loggingAuraNavigator.reportModuleUnderFeatureReturn(hatchModule, hatchClickPoint, hatchEventSubtype);
    }

    private final void reportStartupNavigation(AuraNavKey auraNavKey) {
        HatchModule shellModule;
        if (auraNavKey == null || (shellModule = LoggingAuraNavigatorKt.toShellModule(auraNavKey)) == null) {
            return;
        }
        AuraStartupMetricTracker.instance.onNavigationEvent(shellModule.getModuleName());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void reportTimeSpent(com.facebook.aura.navigation.AuraNavKey r3, com.facebook.aura.analytics.hatch.HatchModule r4, com.facebook.aura.analytics.hatch.HatchModule r5, com.facebook.aura.analytics.hatch.HatchClickPoint r6, com.facebook.aura.analytics.hatch.HatchEventSubtype r7) {
        /*
            r2 = this;
            r2.lastReportedModule = r5
            if (r3 == 0) goto Lb
            com.facebook.aura.analytics.hatch.HatchModule r1 = com.facebook.aura.main.LoggingAuraNavigatorKt.toShellModule(r3)
            r0 = 0
            if (r1 != 0) goto Lc
        Lb:
            r0 = 1
        Lc:
            r2.lastReportedIsFeatureModule = r0
            com.facebook.aura.analytics.hatch.HatchTimeSpentLogger r0 = r2.timeSpentLogger
            r0.reportNavigation(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.main.LoggingAuraNavigator.reportTimeSpent(com.facebook.aura.navigation.AuraNavKey, com.facebook.aura.analytics.hatch.HatchModule, com.facebook.aura.analytics.hatch.HatchModule, com.facebook.aura.analytics.hatch.HatchClickPoint, com.facebook.aura.analytics.hatch.HatchEventSubtype):void");
    }

    public static /* synthetic */ void reportTimeSpent$default(LoggingAuraNavigator loggingAuraNavigator, AuraNavKey auraNavKey, HatchModule hatchModule, HatchModule hatchModule2, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, int i, Object obj) {
        if ((i & 8) != 0) {
            hatchClickPoint = null;
        }
        if ((i & 16) != 0) {
            hatchEventSubtype = null;
        }
        loggingAuraNavigator.reportTimeSpent(auraNavKey, hatchModule, hatchModule2, hatchClickPoint, hatchEventSubtype);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraNavKey currentKey(boolean z) {
        return this.delegate.currentKey(z);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraTabRootNavKey currentTabRoot() {
        return this.delegate.currentTabRoot();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void dismissBottomSheetStack(int i) {
        AuraNavKey auraNavKey = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        this.delegate.dismissBottomSheetStack(i);
        logPopNavigation(auraNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popLast(int i) {
        AuraNavKey auraNavKey = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        this.delegate.popLast(i);
        logPopNavigation(auraNavKey);
    }

    public LoggingAuraNavigator(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, NavBackStack<AuraNavKey> navBackStack) {
        HatchModule hatchModule;
        AnonymousClass005.A0x(abstractC3358CGz, auraNavigator, navBackStack);
        this.userSession = abstractC3358CGz;
        this.delegate = auraNavigator;
        this.backStack = navBackStack;
        this.timeSpentLogger = HatchTimeSpentLogger.Companion.getInstance(abstractC3358CGz);
        this.navTtrcCoordinator = HatchNavTTRCCoordinator.Companion.getInstance(abstractC3358CGz);
        AuraNavKey auraNavKey = (AuraNavKey) AbstractC0878AGe.A0I(navBackStack);
        reportStartupNavigation(auraNavKey);
        if (auraNavKey != null && (hatchModule = LoggingAuraNavigatorKt.toHatchModule(auraNavKey)) != null) {
            reportTimeSpent(auraNavKey, null, hatchModule, null, null);
        }
        annotateCrashReportsWithCurrentScreen();
    }

    private final void maybeStartProgrammaticRootNavigationTrace(AuraNavKey auraNavKey, AuraNavKey auraNavKey2) {
        HatchNavTTRCSpec.Surface navTtrcSurface = LoggingAuraNavigatorKt.toNavTtrcSurface(auraNavKey2);
        if (navTtrcSurface == null || C7384Etj.areEqual(auraNavKey, auraNavKey2) || this.navTtrcCoordinator.captureActiveToken(navTtrcSurface) != null) {
            return;
        }
        this.navTtrcCoordinator.startNavigation(navTtrcSurface, false, HatchGatewayConnection.Companion.getInstance(this.userSession).isConnected(), null, null);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void reconcileTabs(Set<? extends AuraTabRootNavKey> set, G0U<? super AuraTabRootNavKey, Boolean> g0u) {
        AnonymousClass003.A0u(set, g0u);
        this.delegate.reconcileTabs(set, g0u);
        annotateCrashReportsWithCurrentScreen();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return this.delegate.isInBackStack(auraNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, LaunchFlag launchFlag) {
        HatchModule hatchModule;
        boolean zA1a = AnonymousClass002.A1a(auraNavKey, launchFlag);
        AuraNavKey auraNavKey2 = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        if (auraNavKey2 != null) {
            hatchModule = LoggingAuraNavigatorKt.toHatchModule(auraNavKey2);
        } else {
            hatchModule = null;
        }
        maybeStartProgrammaticRootNavigationTrace(auraNavKey2, auraNavKey);
        this.delegate.navigate(auraNavKey, launchFlag);
        annotateCrashReportsWithCurrentScreen();
        if (auraNavKey2 != null && (auraNavKey2 instanceof AuraTabRootNavKey) == zA1a && !(auraNavKey instanceof AuraTabRootNavKey) && launchFlag != LaunchFlag.BRING_TO_FRONT && LoggingAuraNavigatorKt.toNavTtrcSurface(auraNavKey) == null) {
            this.navTtrcCoordinator.cancelForPushNavigation();
        }
        reportStartupNavigation(auraNavKey);
        HatchModule hatchModule2 = LoggingAuraNavigatorKt.toHatchModule(auraNavKey);
        if (hatchModule2 != null) {
            reportTimeSpent(auraNavKey, hatchModule, hatchModule2, null, null);
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(Collection<? extends AuraNavKey> collection) {
        C7384Etj.A0Y(collection, 0);
        AuraNavKey auraNavKey = (AuraNavKey) AbstractC0878AGe.A0I(this.backStack);
        this.delegate.popAll(collection);
        logPopNavigation(auraNavKey);
    }
}
