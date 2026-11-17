package com.facebook.aura.navigation;

import X.AGH;
import X.AMP;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BRL;
import X.C06H;
import X.C3cG;
import X.C3cJ;
import X.C5qG;
import X.C5qH;
import X.C5r1;
import X.C7384Etj;
import X.F60;
import X.G0U;
import X.Hs1;
import X.HxE;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;

/* loaded from: classes2.dex */
public final class OverlaySceneStrategy<T> implements C5qH<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final String OVERLAY_KEY = "aura_overlay";
    public static final String OVERLAY_PRIORITY_KEY = "aura_overlay_priority";
    public boolean isOverlayOnBackStack;
    public C5r1<T> latestCalculationScope;
    public final Map<Object, Float> zIndices = C3cG.A0j();

    public final class Companion {
        public final Map<String, Object> overlay(int i) {
            return AGH.A0D(new HxE(OverlaySceneStrategy.OVERLAY_KEY, true), new HxE(OverlaySceneStrategy.OVERLAY_PRIORITY_KEY, Integer.valueOf(i)));
        }

        public static /* synthetic */ Map overlay$default(Companion companion, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = Integer.MAX_VALUE;
            }
            return companion.overlay(i);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.navigation.OverlaySceneStrategy$displayedBlockingOverlay$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<BRL<T>, Boolean> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final Boolean invoke(BRL<T> brl) {
            C7384Etj.A0Y(brl, 0);
            AuraNavKey auraNavKey = AuraPageSceneStrategyKt.getAuraNavKey(brl);
            boolean z = false;
            if (auraNavKey != null && AuraNavKeyKt.isBlockingOverlay(auraNavKey)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    public final AuraNavKey displayedBlockingOverlay(List<BRL<T>> list) {
        C7384Etj.A0Y(list, 0);
        BRL brl = (BRL) AbstractC0878AGe.A0A(selectedOverlayIndex(list, AnonymousClass1.INSTANCE), list);
        if (brl != null) {
            return AuraPageSceneStrategyKt.getAuraNavKey(brl);
        }
        return null;
    }

    /* renamed from: com.facebook.aura.navigation.OverlaySceneStrategy$selectedOverlayIndex$1, reason: invalid class name and case insensitive filesystem */
    public final class C127111 extends AbstractC7559F3s implements G0U<BRL<T>, Boolean> {
        public static final C127111 INSTANCE = new C127111();

        public C127111() {
            super(1);
        }

        public final Boolean invoke(BRL<T> brl) {
            return AnonymousClass001.A0i();
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
            return AnonymousClass001.A0i();
        }
    }

    private final int getOverlayPriority(BRL<T> brl) {
        Number number;
        Object obj = brl.A02.get(OVERLAY_PRIORITY_KEY);
        if (!(obj instanceof Integer) || (number = (Number) obj) == null) {
            return Integer.MAX_VALUE;
        }
        return number.intValue();
    }

    private final boolean isOverlay(BRL<T> brl) {
        return C7384Etj.areEqual(brl.A02.get(OVERLAY_KEY), AnonymousClass001.A0i());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ int selectedOverlayIndex$default(OverlaySceneStrategy overlaySceneStrategy, List list, G0U g0u, int i, Object obj) {
        if ((i & 2) != 0) {
            g0u = C127111.INSTANCE;
        }
        return overlaySceneStrategy.selectedOverlayIndex(list, g0u);
    }

    private final float zIndexOf(BRL<T> brl, List<BRL<T>> list) {
        float fFloatValue;
        float fFloatValue2;
        Map<Object, Float> map = this.zIndices;
        Object obj = brl.A00;
        Float fValueOf = map.get(obj);
        if (fValueOf == null) {
            ArrayList arrayListA0h = C3cG.A0h();
            for (BRL<T> brl2 : list) {
                BRL<T> brl3 = brl2;
                if (isOverlay(brl3) && this.zIndices.containsKey(brl3.A00)) {
                    arrayListA0h.add(brl2);
                }
            }
            ArrayList arrayListA0h2 = C3cG.A0h();
            ArrayList arrayListA0h3 = C3cG.A0h();
            for (Object obj2 : arrayListA0h) {
                if (getOverlayPriority((BRL) obj2) < getOverlayPriority(brl)) {
                    arrayListA0h2.add(obj2);
                } else {
                    arrayListA0h3.add(obj2);
                }
            }
            Iterator it = arrayListA0h3.iterator();
            if (it.hasNext()) {
                float fA00 = C3cJ.A00(this, it);
                while (it.hasNext()) {
                    fA00 = Math.max(fA00, C3cJ.A00(this, it));
                }
                fFloatValue = Float.valueOf(fA00).floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            Iterator it2 = arrayListA0h2.iterator();
            if (it2.hasNext()) {
                float fA002 = C3cJ.A00(this, it2);
                while (it2.hasNext()) {
                    fA002 = Math.min(fA002, C3cJ.A00(this, it2));
                }
                fFloatValue2 = (fFloatValue + Float.valueOf(fA002).floatValue()) / 2.0f;
            } else {
                fFloatValue2 = fFloatValue + 1.0f;
            }
            fValueOf = Float.valueOf(fFloatValue2);
            map.put(obj, fValueOf);
        }
        return AnonymousClass001.A02(fValueOf);
    }

    public final boolean isOverlayOnBackStack() {
        return this.isOverlayOnBackStack;
    }

    @Deprecated(level = Hs1.A04, message = "Deprecated in favor of List<SceneStrategy> APIs that take the output of this operator has been refactored to take a list of strategies instead.")
    public /* bridge */ C5qH<T> then(C5qH<T> c5qH) {
        return new C5qG(this, c5qH);
    }

    private final int selectedOverlayIndex(List<BRL<T>> list, G0U<? super BRL<T>, Boolean> g0u) {
        int overlayPriority;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        int i3 = 0;
        for (BRL<T> brl : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            BRL<T> brl2 = brl;
            if (isOverlay(brl2) && g0u.invoke(brl2).booleanValue() && (overlayPriority = getOverlayPriority(brl2)) <= i2) {
                i = i3;
                i2 = overlayPriority;
            }
            i3 = i4;
        }
        return i;
    }

    @Override // X.C5qH
    public AMP<T> calculateScene(C5r1<T> c5r1, List<BRL<T>> list) {
        boolean zA1a = AnonymousClass002.A1a(c5r1, list);
        if (this.latestCalculationScope != c5r1) {
            this.latestCalculationScope = c5r1;
            ArrayList arrayListA0h = C3cG.A0h();
            for (BRL<T> brl : list) {
                if (isOverlay(brl)) {
                    arrayListA0h.add(brl);
                }
            }
            this.isOverlayOnBackStack = !arrayListA0h.isEmpty();
            Set<Object> setKeySet = this.zIndices.keySet();
            HashSet hashSet = new HashSet();
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                hashSet.add(((BRL) it.next()).A00);
            }
            setKeySet.retainAll(hashSet);
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                zIndexOf((BRL) it2.next(), arrayListA0h);
            }
        }
        int iSelectedOverlayIndex = selectedOverlayIndex(list, C127111.INSTANCE);
        if (iSelectedOverlayIndex != -1) {
            BRL<T> brl2 = list.get(iSelectedOverlayIndex);
            AuraNavKey auraNavKey = AuraPageSceneStrategyKt.getAuraNavKey(brl2);
            if (auraNavKey != null && AuraNavKeyKt.isBlockingOverlay(auraNavKey) == zA1a) {
                List listA0Z = AbstractC0878AGe.A0Z(list, iSelectedOverlayIndex + 1);
                if (!listA0Z.isEmpty()) {
                    if (!(listA0Z instanceof Collection) || !listA0Z.isEmpty()) {
                        Iterator it3 = listA0Z.iterator();
                        while (it3.hasNext()) {
                            if (!(AuraPageSceneStrategyKt.getAuraNavKey((BRL) it3.next()) instanceof AuraBottomSheetNavKey)) {
                            }
                        }
                    }
                }
                return new BlockingOverlayScene(brl2);
            }
            ArrayList arrayListA0h2 = C3cG.A0h();
            int i = 0;
            for (BRL<T> brl3 : list) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0885AGm.A14();
                    throw F60.createAndThrow();
                }
                if (i != iSelectedOverlayIndex) {
                    arrayListA0h2.add(brl3);
                }
                i = i2;
            }
            if (!arrayListA0h2.isEmpty()) {
                return new TransparentOverlayScene(brl2.A00, brl2, zIndexOf(brl2, list), arrayListA0h2, arrayListA0h2);
            }
        }
        return null;
    }
}
