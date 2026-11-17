package com.facebook.aura.navigation;

import X.A3q;
import X.AGH;
import X.AMP;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BRL;
import X.C06H;
import X.C3cG;
import X.C5qG;
import X.C5qH;
import X.C5r1;
import X.C7384Etj;
import X.G0U;
import X.Hs1;
import X.HxE;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class BottomSheetSceneStrategy<T> implements C5qH<T> {
    public static final int $stable = 0;
    public static final String BOTTOM_SHEET_KEY = "aura_bottom_sheet";
    public static final Companion Companion = new Companion();
    public static final String DISMISSIBLE_KEY = "aura_bottom_sheet_dismissible";
    public static final String NEW_STACK_ROOT_KEY = "aura_bottom_sheet_new_stack_root";
    public static final String SKIP_PARTIALLY_EXPANDED_KEY = "aura_bottom_sheet_skip_partially_expanded";
    public C5r1<T> latestCalculationScope;
    public final Map<Object, BottomSheetScene<T>> scenes = C3cG.A0j();
    public Set<? extends Object> backStackContentKeys = A3q.A00;

    public final class Companion {
        public final Map<String, Object> bottomSheet(boolean z, boolean z2, boolean z3) {
            return AGH.A0D(new HxE(BottomSheetSceneStrategy.BOTTOM_SHEET_KEY, true), new HxE(BottomSheetSceneStrategy.DISMISSIBLE_KEY, Boolean.valueOf(z)), new HxE(BottomSheetSceneStrategy.SKIP_PARTIALLY_EXPANDED_KEY, Boolean.valueOf(z2)), new HxE(BottomSheetSceneStrategy.NEW_STACK_ROOT_KEY, Boolean.valueOf(z3)));
        }

        public static /* synthetic */ Map bottomSheet$default(Companion companion, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                z = true;
            }
            return companion.bottomSheet(z, C3cG.A1J(i, z2), AnonymousClass005.A1O(i, z3));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    /* renamed from: com.facebook.aura.navigation.BottomSheetSceneStrategy$calculateScene$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<BottomSheetScene<T>, Unit> {
        public final /* synthetic */ Object $rootContentKey;
        public final /* synthetic */ BottomSheetSceneStrategy<T> this$0;

        public final void invoke(BottomSheetScene<T> bottomSheetScene) {
            C7384Etj.A0Y(bottomSheetScene, 0);
            if (this.this$0.backStackContentKeys.contains(this.$rootContentKey) || this.this$0.scenes.get(this.$rootContentKey) != bottomSheetScene) {
                return;
            }
            this.this$0.scenes.remove(this.$rootContentKey);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BottomSheetSceneStrategy<T> bottomSheetSceneStrategy, Object obj) {
            super(1);
            this.this$0 = bottomSheetSceneStrategy;
            this.$rootContentKey = obj;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((BottomSheetScene) obj);
            return Unit.INSTANCE;
        }
    }

    @Override // X.C5qH
    public AMP<T> calculateScene(C5r1<T> c5r1, List<BRL<T>> list) {
        int iNextIndex;
        int iNextIndex2;
        boolean zA1a = AnonymousClass002.A1a(c5r1, list);
        if (this.latestCalculationScope != c5r1) {
            this.latestCalculationScope = c5r1;
            LinkedHashSet linkedHashSetA0k = C3cG.A0k();
            Iterator<BRL<T>> it = list.iterator();
            while (it.hasNext()) {
                linkedHashSetA0k.add(it.next().A00);
            }
            this.backStackContentKeys = linkedHashSetA0k;
            this.scenes.keySet().retainAll(this.backStackContentKeys);
        }
        BRL brl = (BRL) AbstractC0878AGe.A0I(list);
        if (brl != null) {
            Object obj = brl.A02.get(BOTTOM_SHEET_KEY);
            Boolean boolValueOf = Boolean.valueOf(zA1a);
            if (C7384Etj.areEqual(obj, boolValueOf)) {
                ListIterator listIteratorA0n = C3cG.A0n(list);
                while (true) {
                    iNextIndex = -1;
                    if (!listIteratorA0n.hasPrevious()) {
                        iNextIndex2 = -1;
                        break;
                    }
                    if (!C7384Etj.areEqual(((BRL) listIteratorA0n.previous()).A02.get(BOTTOM_SHEET_KEY), boolValueOf)) {
                        iNextIndex2 = listIteratorA0n.nextIndex();
                        break;
                    }
                }
                int i = iNextIndex2 + 1;
                ListIterator listIteratorA0n2 = C3cG.A0n(list);
                while (true) {
                    if (!listIteratorA0n2.hasPrevious()) {
                        break;
                    }
                    if (C7384Etj.areEqual(((BRL) listIteratorA0n2.previous()).A02.get(NEW_STACK_ROOT_KEY), boolValueOf)) {
                        iNextIndex = listIteratorA0n2.nextIndex();
                        break;
                    }
                }
                int iMax = Math.max(i, iNextIndex);
                List<BRL<T>> listSubList = list.subList(iMax, list.size());
                List<BRL<T>> listSubList2 = list.subList(0, iMax);
                if (!listSubList2.isEmpty()) {
                    Object obj2 = ((BRL) AbstractC0878AGe.A0F(listSubList)).A00;
                    HxE hxEA0r = C3cG.A0r(BottomSheetSceneKey.INSTANCE, obj2);
                    BottomSheetScene<T> bottomSheetScene = this.scenes.get(obj2);
                    if (bottomSheetScene != null) {
                        bottomSheetScene.update(listSubList, listSubList2);
                        return bottomSheetScene;
                    }
                    BottomSheetScene<T> bottomSheetScene2 = new BottomSheetScene<>(hxEA0r, new BottomSheetSceneState(listSubList, listSubList2), new AnonymousClass2(this, obj2));
                    this.scenes.put(obj2, bottomSheetScene2);
                    return bottomSheetScene2;
                }
            }
        }
        return null;
    }

    @Deprecated(level = Hs1.A04, message = "Deprecated in favor of List<SceneStrategy> APIs that take the output of this operator has been refactored to take a list of strategies instead.")
    public /* bridge */ C5qH<T> then(C5qH<T> c5qH) {
        return new C5qG(this, c5qH);
    }
}
