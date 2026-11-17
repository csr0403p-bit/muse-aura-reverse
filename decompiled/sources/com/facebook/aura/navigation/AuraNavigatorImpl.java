package com.facebook.aura.navigation;

import X.ADq;
import X.ATD;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.BNt;
import X.C7384Etj;
import X.G0U;
import androidx.navigation3.runtime.NavBackStack;
import com.facebook.aura.analytics.hatch.HatchClickPoint;
import com.facebook.aura.analytics.hatch.HatchEventSubtype;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraNavigatorImpl implements AuraNavigator {
    public final NavBackStack<AuraNavKey> backStack;
    public final Set<Function0<Unit>> beforeBackStackChangeListeners;

    public AuraNavigatorImpl(NavBackStack<AuraNavKey> navBackStack) {
        C7384Etj.A0Y(navBackStack, 0);
        this.backStack = navBackStack;
        this.beforeBackStackChangeListeners = new LinkedHashSet();
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void addBeforeBackStackChangeListener(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.beforeBackStackChangeListeners.add(function0);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void dismissBottomSheetStack(int i) {
        for (int i2 = 0; i2 < i && this.backStack.size() > 1 && (AbstractC0878AGe.A0H(this.backStack) instanceof AuraBottomSheetNavKey); i2++) {
            notifyBeforeBackStackChange();
            NavBackStack<AuraNavKey> navBackStack = this.backStack;
            navBackStack.remove(AnonymousClass002.A0E(navBackStack));
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(G0U<? super AuraNavKey, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        NavBackStack<AuraNavKey> navBackStack = this.backStack;
        if (!(navBackStack instanceof Collection) || !navBackStack.isEmpty()) {
            Iterator it = navBackStack.iterator();
            while (it.hasNext()) {
                if (g0u.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, boolean z) {
        C7384Etj.A0Y(auraNavKey, 0);
        navigate(auraNavKey, z ? LaunchFlag.REPLACE : LaunchFlag.NAVIGATE);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(G0U<? super AuraNavKey, Boolean> g0u) {
        C7384Etj.A0Y(g0u, 0);
        notifyBeforeBackStackChange();
        AbstractC0882AGj.A0v(this.backStack, g0u);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popTabSubstack(AuraTabRootNavKey auraTabRootNavKey, AuraTabRootNavKey auraTabRootNavKey2) {
        NavBackStack<AuraNavKey> navBackStack;
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        Iterator it = this.backStack.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            if (C7384Etj.areEqual(it.next(), auraTabRootNavKey)) {
                if (i2 >= 0) {
                    Integer numNextTabRootIndex = nextTabRootIndex(i2 + 1);
                    int iIntValue = (numNextTabRootIndex != null ? numNextTabRootIndex.intValue() : this.backStack.size()) - i2;
                    notifyBeforeBackStackChange();
                    while (true) {
                        navBackStack = this.backStack;
                        if (i >= iIntValue) {
                            break;
                        }
                        navBackStack.remove(i2);
                        i++;
                    }
                    if (!navBackStack.isEmpty() || auraTabRootNavKey2 == null) {
                        return;
                    }
                    this.backStack.A00.add(auraTabRootNavKey2);
                    return;
                }
                return;
            }
            i2++;
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToTabRoot(AuraTabRootNavKey auraTabRootNavKey) {
        C7384Etj.A0Y(auraTabRootNavKey, 0);
        NavBackStack<AuraNavKey> navBackStack = this.backStack;
        ListIterator listIterator = navBackStack.listIterator(navBackStack.size());
        while (listIterator.hasPrevious()) {
            if (C7384Etj.areEqual(listIterator.previous(), auraTabRootNavKey)) {
                int iNextIndex = listIterator.nextIndex();
                if (iNextIndex >= 0) {
                    int i = iNextIndex + 1;
                    Integer numNextTabRootIndex = nextTabRootIndex(i);
                    int iIntValue = (numNextTabRootIndex != null ? numNextTabRootIndex.intValue() : this.backStack.size()) - i;
                    for (int i2 = 0; i2 < iIntValue; i2++) {
                        notifyBeforeBackStackChange();
                        this.backStack.remove(i);
                    }
                    return;
                }
                return;
            }
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void removeBeforeBackStackChangeListener(Function0<Unit> function0) {
        C7384Etj.A0Y(function0, 0);
        this.beforeBackStackChangeListeners.remove(function0);
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LaunchFlag.values().length];
            try {
                AnonymousClass002.A13(LaunchFlag.NAVIGATE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(LaunchFlag.REPLACE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(LaunchFlag.REPLACE_BACKSTACK, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(LaunchFlag.BRING_TO_FRONT, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Integer nextTabRootIndex(int i) {
        int size = this.backStack.size();
        while (i < size) {
            if (this.backStack.A00.get(i) instanceof AuraTabRootNavKey) {
                return Integer.valueOf(i);
            }
            i++;
        }
        return null;
    }

    private final void notifyBeforeBackStackChange() {
        Iterator it = AbstractC0878AGe.A0X(this.beforeBackStackChangeListeners).iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean back() {
        if ((AbstractC0878AGe.A0I(this.backStack) instanceof AuraTerminalNavKey) || this.backStack.size() <= 1) {
            return false;
        }
        notifyBeforeBackStackChange();
        NavBackStack<AuraNavKey> navBackStack = this.backStack;
        navBackStack.remove(AnonymousClass002.A0E(navBackStack));
        return true;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraNavKey currentKey(boolean z) {
        Object objPrevious;
        NavBackStack<AuraNavKey> navBackStack = this.backStack;
        if (!z) {
            ListIterator listIterator = navBackStack.listIterator(navBackStack.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                if (!(objPrevious instanceof AuraOverlayNavKey) && !(objPrevious instanceof AuraBottomSheetNavKey)) {
                    break;
                }
            }
        } else {
            objPrevious = AbstractC0878AGe.A0I(navBackStack);
        }
        return (AuraNavKey) objPrevious;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public AuraTabRootNavKey currentTabRoot() {
        Object objPrevious;
        NavBackStack<AuraNavKey> navBackStack = this.backStack;
        ListIterator listIterator = navBackStack.listIterator(navBackStack.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
            if (objPrevious instanceof AuraTabRootNavKey) {
                break;
            }
        }
        if (objPrevious instanceof AuraTabRootNavKey) {
            return (AuraTabRootNavKey) objPrevious;
        }
        return null;
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popLast(int i) {
        int size = this.backStack.size() - 1;
        if (i > size) {
            i = size;
        }
        if (i > 0) {
            notifyBeforeBackStackChange();
            NavBackStack<AuraNavKey> navBackStack = this.backStack;
            navBackStack.subList(navBackStack.size() - i, this.backStack.size()).clear();
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popToRoot() {
        while (this.backStack.size() > 1) {
            notifyBeforeBackStackChange();
            AbstractC0882AGj.A0q(this.backStack);
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigateWithContext(AuraNavKey auraNavKey, HatchClickPoint hatchClickPoint, HatchEventSubtype hatchEventSubtype, LaunchFlag launchFlag) {
        AnonymousClass003.A0w(auraNavKey, launchFlag);
        navigate(auraNavKey, launchFlag);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void reconcileTabs(Set<? extends AuraTabRootNavKey> set, G0U<? super AuraTabRootNavKey, Boolean> g0u) {
        AnonymousClass003.A0u(set, g0u);
        ADq aDqA12 = AbstractC0885AGm.A12(this.backStack);
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = aDqA12.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (this.backStack.A00.get(next.intValue()) instanceof AuraTabRootNavKey) {
                arrayList.add(next);
            }
        }
        int size = arrayList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i = size - 1;
            int iIntValue = ((Number) arrayList.get(size)).intValue();
            Object obj = this.backStack.A00.get(iIntValue);
            C7384Etj.A0Z(obj, "null cannot be cast to non-null type com.facebook.aura.navigation.AuraTabRootNavKey");
            if (!set.contains(obj) && g0u.invoke(obj).booleanValue()) {
                int i2 = size + 1;
                int iIntValue2 = i2 < arrayList.size() ? ((Number) arrayList.get(i2)).intValue() : this.backStack.size();
                notifyBeforeBackStackChange();
                int i3 = iIntValue2 - iIntValue;
                for (int i4 = 0; i4 < i3; i4++) {
                    this.backStack.remove(iIntValue);
                }
            }
            if (i < 0) {
                return;
            } else {
                size = i;
            }
        }
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public boolean isInBackStack(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        return this.backStack.contains(auraNavKey);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [boolean] */
    @Override // com.facebook.aura.navigation.AuraNavigator
    public void navigate(AuraNavKey auraNavKey, LaunchFlag launchFlag) {
        NavBackStack<AuraNavKey> navBackStack;
        int size;
        ?? A1a = AnonymousClass002.A1a(auraNavKey, launchFlag);
        int iOrdinal = launchFlag.ordinal();
        if (iOrdinal != 0) {
            int iNextIndex = -1;
            if (iOrdinal != A1a) {
                int i = 0;
                if (iOrdinal != 2) {
                    if (iOrdinal == 3) {
                        Iterator it = this.backStack.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (C7384Etj.areEqual(it.next(), auraNavKey)) {
                                if (i2 >= 0) {
                                    if (auraNavKey instanceof AuraTabRootNavKey) {
                                        Integer numNextTabRootIndex = nextTabRootIndex(i2 + 1);
                                        if (numNextTabRootIndex != null) {
                                            size = numNextTabRootIndex.intValue();
                                        } else {
                                            size = this.backStack.size();
                                        }
                                        notifyBeforeBackStackChange();
                                        ADq aDqA0C = ATD.A0C(i2, size);
                                        ArrayList arrayListA0i = AnonymousClass003.A0i(aDqA0C);
                                        Iterator<Integer> it2 = aDqA0C.iterator();
                                        while (it2.hasNext()) {
                                            arrayListA0i.add(this.backStack.A00.get(((BNt) it2).A00()));
                                        }
                                        int i3 = size - i2;
                                        while (true) {
                                            NavBackStack<AuraNavKey> navBackStack2 = this.backStack;
                                            if (i < i3) {
                                                navBackStack2.remove(i2);
                                                i++;
                                            } else {
                                                navBackStack2.addAll(arrayListA0i);
                                                return;
                                            }
                                        }
                                    } else {
                                        notifyBeforeBackStackChange();
                                        this.backStack.remove(i2);
                                    }
                                }
                            } else {
                                i2++;
                            }
                        }
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    while (this.backStack.size() > A1a) {
                        notifyBeforeBackStackChange();
                        AbstractC0882AGj.A0q(this.backStack);
                    }
                    if (!this.backStack.isEmpty()) {
                        if (!C7384Etj.areEqual(this.backStack.A00.get(0), auraNavKey)) {
                            notifyBeforeBackStackChange();
                            this.backStack.A00.set(0, auraNavKey);
                            return;
                        }
                        return;
                    }
                }
            } else {
                NavBackStack<AuraNavKey> navBackStack3 = this.backStack;
                ListIterator listIterator = navBackStack3.listIterator(navBackStack3.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        break;
                    } else if (!(listIterator.previous() instanceof AuraOverlayNavKey)) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                notifyBeforeBackStackChange();
                navBackStack = this.backStack;
                if (iNextIndex >= 0) {
                    navBackStack.A00.set(iNextIndex, auraNavKey);
                    return;
                }
                navBackStack.A00.add(auraNavKey);
            }
        } else if (C7384Etj.areEqual(AbstractC0878AGe.A0I(this.backStack), auraNavKey)) {
            return;
        }
        notifyBeforeBackStackChange();
        navBackStack = this.backStack;
        navBackStack.A00.add(auraNavKey);
    }

    @Override // com.facebook.aura.navigation.AuraNavigator
    public void popAll(Collection<? extends AuraNavKey> collection) {
        C7384Etj.A0Y(collection, 0);
        notifyBeforeBackStackChange();
        this.backStack.removeAll(collection);
    }
}
