package com.facebook.aura.assist;

import X.G0U;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NoOpAssistNavigator implements AuraNavigator {
    public static final int $stable = 0;
    public static final NoOpAssistNavigator INSTANCE = new NoOpAssistNavigator();

    @Override // com.facebook.aura.navigation.AuraNavigator
    public /* bridge */ void addBeforeBackStackChangeListener(Function0<Unit> function0) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean back() {
        return false;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraNavKey currentKey(boolean z) {
        return null;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraTabRootNavKey currentTabRoot() {
        return null;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void dismissBottomSheetStack(int i) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(G0U<? super AuraNavKey, Boolean> g0u) {
        return false;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(G0U<? super AuraNavKey, Boolean> g0u) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popLast(int i) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToRoot() {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToTabRoot(AuraTabRootNavKey auraTabRootNavKey) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public /* bridge */ void removeBeforeBackStackChangeListener(Function0<Unit> function0) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, boolean z) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigateWithContext(AuraNavKey auraNavKey, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, LaunchFlag launchFlag) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popTabSubstack(AuraTabRootNavKey auraTabRootNavKey, AuraTabRootNavKey auraTabRootNavKey2) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void reconcileTabs(Set<? extends AuraTabRootNavKey> set, G0U<? super AuraTabRootNavKey, Boolean> g0u) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(AuraNavKey auraNavKey) {
        return false;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(Collection<? extends AuraNavKey> collection) {
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, LaunchFlag launchFlag) {
    }
}
