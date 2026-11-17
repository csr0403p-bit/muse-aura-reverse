package com.facebook.aura.assist;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.navigation.LaunchFlag;
import com.facebook.aura.navigation.key.AuraSubscriptionSheetKey;
import com.facebook.aura.navigation.key.HatchVoiceNuxSheetKey;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AssistVoiceNavigator implements AuraNavigator {
    public static final int $stable = 8;
    public final AuraNavigator parent;
    public final MutableState sheet$delegate;

    public AssistVoiceNavigator(AuraNavigator auraNavigator) {
        C7384Etj.A0Y(auraNavigator, 0);
        this.parent = auraNavigator;
        this.sheet$delegate = AnonymousClass003.A0S();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void addBeforeBackStackChangeListener(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.parent.addBeforeBackStackChangeListener(function0);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return C7384Etj.areEqual(getSheet(), auraNavKey) || this.parent.isInBackStack(auraNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, boolean z) {
        C7384Etj.A0Y(auraNavKey, 0);
        navigate(auraNavKey, z ? LaunchFlag.REPLACE : LaunchFlag.NAVIGATE);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(G0U<? super AuraNavKey, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        AuraNavKey sheet = getSheet();
        if (sheet != null && AnonymousClass003.A1X(sheet, g0u)) {
            setSheet(null);
        }
        this.parent.popAll(g0u);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popTabSubstack(AuraTabRootNavKey auraTabRootNavKey, AuraTabRootNavKey auraTabRootNavKey2) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        this.parent.popTabSubstack(auraTabRootNavKey, auraTabRootNavKey2);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToRoot() {
        setSheet(null);
        this.parent.popToRoot();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToTabRoot(AuraTabRootNavKey auraTabRootNavKey) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        this.parent.popToTabRoot(auraTabRootNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void removeBeforeBackStackChangeListener(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.parent.removeBeforeBackStackChangeListener(function0);
    }

    private final void setSheet(AuraNavKey auraNavKey) {
        this.sheet$delegate.Af8(auraNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraNavKey currentKey(boolean z) {
        AuraNavigator auraNavigator;
        boolean z2;
        if (z) {
            AuraNavKey sheet = getSheet();
            if (sheet != null) {
                return sheet;
            }
            auraNavigator = this.parent;
            z2 = true;
        } else {
            auraNavigator = this.parent;
            z2 = false;
        }
        return auraNavigator.currentKey(z2);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraTabRootNavKey currentTabRoot() {
        return this.parent.currentTabRoot();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void dismissBottomSheetStack(int i) {
        if (i > 0) {
            if (getSheet() != null) {
                setSheet(null);
                i--;
                if (i <= 0) {
                    return;
                }
            }
            this.parent.dismissBottomSheetStack(i);
        }
    }

    public final AuraNavKey getSheet() {
        return (AuraNavKey) this.sheet$delegate.getValue();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popLast(int i) {
        this.parent.popLast(i);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean back() {
        if (getSheet() == null) {
            return this.parent.back();
        }
        setSheet(null);
        return true;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigateWithContext(AuraNavKey auraNavKey, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, LaunchFlag launchFlag) {
        AnonymousClass005.A0y(auraNavKey, hatchClickPoint, launchFlag);
        this.parent.navigateWithContext(auraNavKey, hatchClickPoint, hatchEventSubtype, launchFlag);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void reconcileTabs(Set<? extends AuraTabRootNavKey> set, G0U<? super AuraTabRootNavKey, Boolean> g0u) {
        AnonymousClass003.A0u(set, g0u);
        this.parent.reconcileTabs(set, g0u);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(G0U<? super AuraNavKey, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        return this.parent.isInBackStack(g0u);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, LaunchFlag launchFlag) {
        AnonymousClass003.A0u(auraNavKey, launchFlag);
        if (!(auraNavKey instanceof HatchVoiceNuxSheetKey) && !(auraNavKey instanceof AuraSubscriptionSheetKey)) {
            this.parent.navigate(auraNavKey, launchFlag);
        } else {
            setSheet(auraNavKey);
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(Collection<? extends AuraNavKey> collection) {
        C7384Etj.A0Y(collection, 0);
        if (AbstractC0878AGe.A0k(collection, getSheet())) {
            setSheet(null);
        }
        this.parent.popAll(collection);
    }
}
