package com.facebook.aura.navigation;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import com.facebook.aura.vds.compose.bottomsheet.state.AuraSheetState;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class BottomSheetScene$content$1$sheetNavigator$1$1 implements AuraNavigator {
    public final /* synthetic */ AuraNavigator $$delegate_0;
    public final /* synthetic */ C1BO<Integer> $currentSheetDepth;
    public final /* synthetic */ AtomicBoolean $isDismissing;
    public final /* synthetic */ AuraNavigator $outerNavigator;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ AuraSheetState $sheetState;

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void addBeforeBackStackChangeListener(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.$$delegate_0.addBeforeBackStackChangeListener(function0);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(G0U<? super AuraNavKey, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        return this.$$delegate_0.isInBackStack(g0u);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(G0U<? super AuraNavKey, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        this.$$delegate_0.popAll(g0u);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popTabSubstack(AuraTabRootNavKey auraTabRootNavKey, AuraTabRootNavKey auraTabRootNavKey2) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        this.$$delegate_0.popTabSubstack(auraTabRootNavKey, auraTabRootNavKey2);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToTabRoot(AuraTabRootNavKey auraTabRootNavKey) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        this.$$delegate_0.popToTabRoot(auraTabRootNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void removeBeforeBackStackChangeListener(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.$$delegate_0.removeBeforeBackStackChangeListener(function0);
    }

    public BottomSheetScene$content$1$sheetNavigator$1$1(AuraNavigator auraNavigator, C1BO<Integer> c1bo, AtomicBoolean atomicBoolean, C3UX c3ux, AuraSheetState auraSheetState) {
        this.$outerNavigator = auraNavigator;
        this.$currentSheetDepth = c1bo;
        this.$isDismissing = atomicBoolean;
        this.$scope = c3ux;
        this.$sheetState = auraSheetState;
        this.$$delegate_0 = auraNavigator;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean back() {
        if (C1BO.A02(this.$currentSheetDepth) > 1) {
            return this.$outerNavigator.back();
        }
        if (this.$isDismissing.compareAndSet(false, true)) {
            AnonymousClass001.A1J(new BottomSheetScene$content$1$sheetNavigator$1$1$back$1(this.$sheetState, this.$outerNavigator, this.$isDismissing, null), this.$scope);
        }
        return true;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraNavKey currentKey(boolean z) {
        return this.$$delegate_0.currentKey(z);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraTabRootNavKey currentTabRoot() {
        return this.$$delegate_0.currentTabRoot();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void dismissBottomSheetStack(int i) {
        this.$outerNavigator.dismissBottomSheetStack(Math.min(i, C1BO.A02(this.$currentSheetDepth)));
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popLast(int i) {
        this.$$delegate_0.popLast(i);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToRoot() {
        this.$$delegate_0.popToRoot();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, LaunchFlag launchFlag) {
        AnonymousClass003.A0u(auraNavKey, launchFlag);
        this.$$delegate_0.navigate(auraNavKey, launchFlag);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigateWithContext(AuraNavKey auraNavKey, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, LaunchFlag launchFlag) {
        AnonymousClass005.A0y(auraNavKey, hatchClickPoint, launchFlag);
        this.$$delegate_0.navigateWithContext(auraNavKey, hatchClickPoint, hatchEventSubtype, launchFlag);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void reconcileTabs(Set<? extends AuraTabRootNavKey> set, G0U<? super AuraTabRootNavKey, Boolean> g0u) {
        AnonymousClass003.A0u(set, g0u);
        this.$$delegate_0.reconcileTabs(set, g0u);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return this.$$delegate_0.isInBackStack(auraNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, boolean z) {
        C7384Etj.A0Y(auraNavKey, 0);
        this.$$delegate_0.navigate(auraNavKey, z);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(Collection<? extends AuraNavKey> collection) {
        C7384Etj.A0Y(collection, 0);
        this.$$delegate_0.popAll(collection);
    }
}
