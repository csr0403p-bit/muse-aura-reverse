package com.facebook.aura.maps;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.BHL;
import X.BLG;
import X.C0894AGw;
import X.C1BN;
import X.C3cG;
import X.C7384Etj;
import X.C9286GCn;
import X.F60;
import X.HnJ;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class HatchMapFlowController implements HatchMapNavigationFlowDriver {
    public static final int $stable = 0;
    public final BLG<HatchMapNavigationFlow> mutableTopFlow;
    public final List<HatchMapNavigationFlow> stack = C3cG.A0h();
    public final C1BN<HatchMapNavigationFlow> topFlow;

    @Override // com.facebook.aura.maps.HatchMapNavigationFlowDriver
    public void push(HatchMapNavigationFlow hatchMapNavigationFlow) {
        C7384Etj.A0Y(hatchMapNavigationFlow, 0);
        HatchMapNavigationFlow hatchMapNavigationFlow2 = (HatchMapNavigationFlow) AbstractC0878AGe.A0I(this.stack);
        if (hatchMapNavigationFlow2 != null) {
            hatchMapNavigationFlow2.disappear();
        }
        this.stack.add(hatchMapNavigationFlow);
        AnonymousClass002.A1I(this.mutableTopFlow, hatchMapNavigationFlow);
        hatchMapNavigationFlow.enter();
        hatchMapNavigationFlow.appear();
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlowDriver
    public HatchMapNavigationFlow getTop() {
        return (HatchMapNavigationFlow) AbstractC0878AGe.A0I(this.stack);
    }

    public final C1BN<HatchMapNavigationFlow> getTopFlow() {
        return this.topFlow;
    }

    public final void mapAttached() {
        Iterator<HatchMapNavigationFlow> it = this.stack.iterator();
        while (it.hasNext()) {
            it.next().mapAttached();
        }
    }

    public final void mapDetached() {
        List<HatchMapNavigationFlow> list = this.stack;
        C7384Etj.A0Y(list, 0);
        Iterator<E> it = new C0894AGw(list).iterator();
        while (it.hasNext()) {
            ((HatchMapNavigationFlow) it.next()).mapDetached();
        }
    }

    @Override // com.facebook.aura.maps.HatchMapNavigationFlowDriver
    public void pop() {
        HatchMapNavigationFlow hatchMapNavigationFlow = (HatchMapNavigationFlow) AbstractC0882AGj.A0q(this.stack);
        if (hatchMapNavigationFlow != null) {
            hatchMapNavigationFlow.disappear();
            hatchMapNavigationFlow.exit();
            HatchMapNavigationFlow hatchMapNavigationFlow2 = (HatchMapNavigationFlow) AbstractC0878AGe.A0I(this.stack);
            this.mutableTopFlow.Af8(hatchMapNavigationFlow2);
            if (hatchMapNavigationFlow2 != null) {
                hatchMapNavigationFlow2.reappear();
            }
        }
    }

    public final void removeAll() {
        if (this.stack.isEmpty()) {
            return;
        }
        List listA0X = AbstractC0878AGe.A0X(this.stack);
        this.stack.clear();
        this.mutableTopFlow.Af8(null);
        Iterator<T> it = BHL.A1B(listA0X).iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            HatchMapNavigationFlow hatchMapNavigationFlow = (HatchMapNavigationFlow) next;
            if (i == 0) {
                hatchMapNavigationFlow.disappear();
            }
            hatchMapNavigationFlow.exit();
            i = i2;
        }
    }

    public HatchMapFlowController() {
        C9286GCn c9286GCnA01 = HnJ.A01(null);
        this.mutableTopFlow = c9286GCnA01;
        this.topFlow = c9286GCnA01;
    }
}
