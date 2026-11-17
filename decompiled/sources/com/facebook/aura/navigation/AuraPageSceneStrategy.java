package com.facebook.aura.navigation;

import X.AMP;
import X.AbstractC0878AGe;
import X.BFM;
import X.BRL;
import X.C3cG;
import X.C5qG;
import X.C5qH;
import X.C5r1;
import X.C7384Etj;
import X.G0V;
import X.G2k;
import X.Hs1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AuraPageSceneStrategy implements C5qH<AuraNavKey> {
    public static final int $stable = 0;
    public final G2k<AuraTabRootNavKey, AuraNavKey, G0V<? super BFM, ? super Integer, Unit>, BFM, Integer, Unit> pageContent;
    public final boolean tabsEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    public AuraPageSceneStrategy(boolean z, G2k<? super AuraTabRootNavKey, ? super AuraNavKey, ? super G0V<? super BFM, ? super Integer, Unit>, ? super BFM, ? super Integer, Unit> g2k) {
        C7384Etj.A0Y(g2k, 1);
        this.tabsEnabled = z;
        this.pageContent = g2k;
    }

    @Override // X.C5qH
    public AMP<AuraNavKey> calculateScene(C5r1<AuraNavKey> c5r1, List<BRL<AuraNavKey>> list) {
        int iNextIndex;
        AuraTabRootNavKey auraTabRootNavKey;
        C7384Etj.A0Y(list, 1);
        ListIterator listIteratorA0n = C3cG.A0n(list);
        while (true) {
            if (!listIteratorA0n.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((BRL) listIteratorA0n.previous()).A02.get(AuraPageSceneStrategyKt.NAV_KEY_METADATA) instanceof AuraTabRootNavKey) {
                iNextIndex = listIteratorA0n.nextIndex();
                break;
            }
        }
        if (!this.tabsEnabled || iNextIndex < 0) {
            auraTabRootNavKey = null;
            break;
        }
        List<BRL<AuraNavKey>> listSubList = list.subList(iNextIndex, list.size());
        if (!(listSubList instanceof Collection) || !listSubList.isEmpty()) {
            Iterator<BRL<AuraNavKey>> it = listSubList.iterator();
            while (it.hasNext()) {
                Object obj = it.next().A02.get(AuraPageSceneStrategyKt.NAV_KEY_METADATA);
                if ((obj instanceof AuraFullScreenNavKey) && !(obj instanceof AuraBottomSheetNavKey) && !(obj instanceof AuraOverlayNavKey)) {
                    auraTabRootNavKey = null;
                    break;
                }
            }
        }
        Object obj2 = list.get(iNextIndex).A02.get(AuraPageSceneStrategyKt.NAV_KEY_METADATA);
        C7384Etj.A0Z(obj2, "null cannot be cast to non-null type com.facebook.aura.navigation.AuraTabRootNavKey");
        auraTabRootNavKey = (AuraTabRootNavKey) obj2;
        return new AuraPageScene((BRL) AbstractC0878AGe.A0H(list), AbstractC0878AGe.A0d(list, 1), auraTabRootNavKey, this.pageContent);
    }

    @Deprecated(level = Hs1.A04, message = "Deprecated in favor of List<SceneStrategy> APIs that take the output of this operator has been refactored to take a list of strategies instead.")
    public /* bridge */ C5qH<AuraNavKey> then(C5qH<AuraNavKey> c5qH) {
        return new C5qG(this, c5qH);
    }
}
