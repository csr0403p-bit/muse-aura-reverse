package com.facebook.aura.navigation;

import X.A3q;
import X.AMP;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.BRL;
import X.C06H;
import X.C3cG;
import X.C5qG;
import X.C5qH;
import X.C5r1;
import X.C7384Etj;
import X.G0U;
import X.Hs1;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class ModalFlowSceneStrategy<T> implements C5qH<T> {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion();
    public static final String IMMERSIVE_KEY = "aura_immersive";
    public static final String MODAL_FLOW_ROOT_KEY = "aura_modal_flow_root";
    public Set<? extends Object> backStackContentKeys;
    public boolean enabled;
    public final Function0<Boolean> isOverlayOnBackStack;
    public C5r1<T> latestCalculationScope;
    public final Set<Object> pageRootContentKeys;
    public final Map<Object, ModalFlowScene<T>> scenes;

    /* renamed from: com.facebook.aura.navigation.ModalFlowSceneStrategy$calculateScene$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0U<ModalFlowScene<T>, Unit> {
        public final /* synthetic */ Object $rootContentKey;
        public final /* synthetic */ ModalFlowSceneStrategy<T> this$0;

        public final void invoke(ModalFlowScene<T> modalFlowScene) {
            C7384Etj.A0Y(modalFlowScene, 0);
            if (this.this$0.backStackContentKeys.contains(this.$rootContentKey) || this.this$0.scenes.get(this.$rootContentKey) != modalFlowScene) {
                return;
            }
            this.this$0.scenes.remove(this.$rootContentKey);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(ModalFlowSceneStrategy<T> modalFlowSceneStrategy, Object obj) {
            super(1);
            this.this$0 = modalFlowSceneStrategy;
            this.$rootContentKey = obj;
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((ModalFlowScene) obj);
            return Unit.INSTANCE;
        }
    }

    public ModalFlowSceneStrategy(boolean z, Function0<Boolean> function0) {
        C7384Etj.A0Y(function0, 1);
        this.enabled = z;
        this.isOverlayOnBackStack = function0;
        this.scenes = C3cG.A0j();
        this.pageRootContentKeys = C3cG.A0k();
        this.backStackContentKeys = A3q.A00;
    }

    @Override // X.C5qH
    public AMP<T> calculateScene(C5r1<T> c5r1, List<BRL<T>> list) {
        int iNextIndex;
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
            this.pageRootContentKeys.retainAll(this.backStackContentKeys);
        }
        ListIterator listIteratorA0n = C3cG.A0n(list);
        while (true) {
            if (!listIteratorA0n.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (C7384Etj.areEqual(((BRL) listIteratorA0n.previous()).A02.get(MODAL_FLOW_ROOT_KEY), Boolean.valueOf(zA1a))) {
                iNextIndex = listIteratorA0n.nextIndex();
                break;
            }
        }
        if (iNextIndex <= 0) {
            return null;
        }
        List<BRL<T>> listSubList = list.subList(iNextIndex, list.size());
        if (!(listSubList instanceof Collection) || !listSubList.isEmpty()) {
            Iterator<BRL<T>> it2 = listSubList.iterator();
            while (it2.hasNext()) {
                if (presentsOutsideModalFlow(it2.next())) {
                    return null;
                }
            }
        }
        List<BRL<T>> listSubList2 = list.subList(0, iNextIndex);
        Object obj = ((BRL) AbstractC0878AGe.A0F(listSubList)).A00;
        ModalFlowScene<T> modalFlowScene = this.scenes.get(obj);
        if (modalFlowScene != null) {
            modalFlowScene.update(listSubList, listSubList2, AnonymousClass003.A1Y(this.isOverlayOnBackStack));
            return modalFlowScene;
        }
        if (!this.enabled || this.pageRootContentKeys.contains(obj)) {
            this.pageRootContentKeys.add(obj);
            return null;
        }
        ModalFlowScene<T> modalFlowScene2 = new ModalFlowScene<>(C3cG.A0r(ModalFlowSceneKey.INSTANCE, obj), new ModalFlowSceneState(listSubList, listSubList2, AnonymousClass003.A1Y(this.isOverlayOnBackStack)), new AnonymousClass3(this, obj));
        this.scenes.put(obj, modalFlowScene2);
        return modalFlowScene2;
    }

    public final class Companion {
        public final Map<String, Object> immersive() {
            return AnonymousClass006.A10(ModalFlowSceneStrategy.IMMERSIVE_KEY, AnonymousClass001.A0i());
        }

        public final Map<String, Object> modalFlow() {
            return AnonymousClass006.A10(ModalFlowSceneStrategy.MODAL_FLOW_ROOT_KEY, AnonymousClass001.A0i());
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    @Deprecated(level = Hs1.A04, message = "Deprecated in favor of List<SceneStrategy> APIs that take the output of this operator has been refactored to take a list of strategies instead.")
    public /* bridge */ C5qH<T> then(C5qH<T> c5qH) {
        return new C5qG(this, c5qH);
    }

    private final boolean presentsOutsideModalFlow(BRL<T> brl) {
        if (AuraPageSceneStrategyKt.getAuraNavKey(brl) instanceof AuraTabRootNavKey) {
            return true;
        }
        Map<String, Object> map = brl.A02;
        return C7384Etj.areEqual(map.get(IMMERSIVE_KEY), true) || C7384Etj.areEqual(map.get(BottomSheetSceneStrategy.BOTTOM_SHEET_KEY), true) || C7384Etj.areEqual(map.get(OverlaySceneStrategy.OVERLAY_KEY), true);
    }
}
