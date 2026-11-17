package com.facebook.aura.navigation;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.C8j3;
import X.G0U;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import java.util.Collection;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface AuraNavigator {

    /* renamed from: com.facebook.aura.navigation.AuraNavigator$-CC, reason: invalid class name */
    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class CC {
        public static void $default$addBeforeBackStackChangeListener(AuraNavigator auraNavigator, Function0 function0) {
        }

        public static void $default$removeBeforeBackStackChangeListener(AuraNavigator auraNavigator, Function0 function0) {
        }

        public static /* synthetic */ void access$addBeforeBackStackChangeListener$jd(AuraNavigator auraNavigator, Function0 function0) {
        }

        public static /* synthetic */ void access$removeBeforeBackStackChangeListener$jd(AuraNavigator auraNavigator, Function0 function0) {
        }

        public static /* synthetic */ AuraNavKey currentKey$default(AuraNavigator auraNavigator, boolean z, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: currentKey");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return auraNavigator.currentKey(z);
        }

        public static /* synthetic */ void dismissBottomSheetStack$default(AuraNavigator auraNavigator, int i, int i2, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: dismissBottomSheetStack");
            }
            if ((i2 & 1) != 0) {
                i = Integer.MAX_VALUE;
            }
            auraNavigator.dismissBottomSheetStack(i);
        }

        public static /* synthetic */ void navigate$default(AuraNavigator auraNavigator, AuraNavKey auraNavKey, boolean z, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: navigate");
            }
            auraNavigator.navigate(auraNavKey, AnonymousClass001.A1Q(i, z));
        }

        public static /* synthetic */ void navigateWithContext$default(AuraNavigator auraNavigator, AuraNavKey auraNavKey, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, LaunchFlag launchFlag, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: navigateWithContext");
            }
            if ((i & 4) != 0) {
                hatchEventSubtype = null;
            }
            if ((i & 8) != 0) {
                launchFlag = LaunchFlag.NAVIGATE;
            }
            auraNavigator.navigateWithContext(auraNavKey, hatchClickPoint, hatchEventSubtype, launchFlag);
        }

        public static /* synthetic */ void popTabSubstack$default(AuraNavigator auraNavigator, AuraTabRootNavKey auraTabRootNavKey, AuraTabRootNavKey auraTabRootNavKey2, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: popTabSubstack");
            }
            if ((i & 2) != 0) {
                auraTabRootNavKey2 = null;
            }
            auraNavigator.popTabSubstack(auraTabRootNavKey, auraTabRootNavKey2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void reconcileTabs$default(AuraNavigator auraNavigator, Set set, G0U g0u, int i, Object obj) {
            if (obj != null) {
                throw C8j3.A18("Super calls with default arguments not supported in this target, function: reconcileTabs");
            }
            if ((i & 2) != 0) {
                g0u = AnonymousClass1.INSTANCE;
            }
            auraNavigator.reconcileTabs(set, g0u);
        }
    }

    void addBeforeBackStackChangeListener(Function0<Unit> function0);

    boolean back();

    AuraNavKey currentKey(boolean z);

    AuraTabRootNavKey currentTabRoot();

    void dismissBottomSheetStack(int i);

    boolean isInBackStack(G0U<? super AuraNavKey, Boolean> g0u);

    boolean isInBackStack(AuraNavKey auraNavKey);

    void navigate(AuraNavKey auraNavKey, LaunchFlag launchFlag);

    void navigate(AuraNavKey auraNavKey, boolean z);

    void navigateWithContext(AuraNavKey auraNavKey, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, LaunchFlag launchFlag);

    void popAll(G0U<? super AuraNavKey, Boolean> g0u);

    void popAll(Collection<? extends AuraNavKey> collection);

    void popLast(int i);

    void popTabSubstack(AuraTabRootNavKey auraTabRootNavKey, AuraTabRootNavKey auraTabRootNavKey2);

    void popToRoot();

    void popToTabRoot(AuraTabRootNavKey auraTabRootNavKey);

    void reconcileTabs(Set<? extends AuraTabRootNavKey> set, G0U<? super AuraTabRootNavKey, Boolean> g0u);

    void removeBeforeBackStackChangeListener(Function0<Unit> function0);

    /* loaded from: classes4.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static void addBeforeBackStackChangeListener(AuraNavigator auraNavigator, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 1);
        }

        @Deprecated
        public static void removeBeforeBackStackChangeListener(AuraNavigator auraNavigator, Function0<Unit> function0) {
            C7384Etj.A0Y(function0, 1);
        }
    }

    /* renamed from: com.facebook.aura.navigation.AuraNavigator$reconcileTabs$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<AuraTabRootNavKey, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Boolean invoke2(AuraTabRootNavKey auraTabRootNavKey) {
            return AnonymousClass001.A0i();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(AuraTabRootNavKey auraTabRootNavKey) {
            return AnonymousClass001.A0i();
        }
    }
}
