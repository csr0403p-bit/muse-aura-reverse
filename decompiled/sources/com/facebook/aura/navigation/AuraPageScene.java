package com.facebook.aura.navigation;

import X.AMP;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.B1V;
import X.BFM;
import X.BMI;
import X.BRL;
import X.C06G;
import X.C7384Etj;
import X.G0V;
import X.G2k;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AuraPageScene extends C06G implements AMP<AuraNavKey> {
    public final G0V<BFM, Integer, Unit> content;
    public final List<BRL<AuraNavKey>> entries;
    public final BRL<AuraNavKey> entry;
    public final Object key;
    public final G2k<AuraTabRootNavKey, AuraNavKey, G0V<? super BFM, ? super Integer, Unit>, BFM, Integer, Unit> pageContent;
    public final List<BRL<AuraNavKey>> previousEntries;
    public final AuraTabRootNavKey tabRoot;

    /* JADX WARN: Multi-variable type inference failed */
    public AuraPageScene(BRL<AuraNavKey> brl, List<BRL<AuraNavKey>> list, AuraTabRootNavKey auraTabRootNavKey, G2k<? super AuraTabRootNavKey, ? super AuraNavKey, ? super G0V<? super BFM, ? super Integer, Unit>, ? super BFM, ? super Integer, Unit> g2k) {
        C7384Etj.A0Y(brl, 0);
        AnonymousClass002.A1B(list, 1, g2k);
        this.entry = brl;
        this.previousEntries = list;
        this.tabRoot = auraTabRootNavKey;
        this.pageContent = g2k;
        this.key = brl.A00;
        this.entries = Collections.singletonList(brl);
        this.content = B1V.A01(new AuraPageScene$content$1(this), 362659098, true);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AuraPageScene) {
                AuraPageScene auraPageScene = (AuraPageScene) obj;
                if (!C7384Etj.areEqual(this.entry, auraPageScene.entry) || !C7384Etj.areEqual(this.previousEntries, auraPageScene.previousEntries) || !C7384Etj.areEqual(this.tabRoot, auraPageScene.tabRoot) || !C7384Etj.areEqual(this.pageContent, auraPageScene.pageContent)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AuraPageScene copy$default(AuraPageScene auraPageScene, BRL brl, List list, AuraTabRootNavKey auraTabRootNavKey, G2k g2k, int i, Object obj) {
        if ((i & 1) != 0) {
            brl = auraPageScene.entry;
        }
        if ((i & 2) != 0) {
            list = auraPageScene.previousEntries;
        }
        if ((i & 4) != 0) {
            auraTabRootNavKey = auraPageScene.tabRoot;
        }
        if ((i & 8) != 0) {
            g2k = auraPageScene.pageContent;
        }
        AnonymousClass005.A0y(brl, list, g2k);
        return new AuraPageScene(brl, list, auraTabRootNavKey, g2k);
    }

    public final BRL<AuraNavKey> component1() {
        return this.entry;
    }

    public final List<BRL<AuraNavKey>> component2() {
        return this.previousEntries;
    }

    public final AuraTabRootNavKey component3() {
        return this.tabRoot;
    }

    public final G2k<AuraTabRootNavKey, AuraNavKey, G0V<? super BFM, ? super Integer, Unit>, BFM, Integer, Unit> component4() {
        return this.pageContent;
    }

    @Override // X.AMP
    public G0V<BFM, Integer, Unit> getContent() {
        return this.content;
    }

    @Override // X.AMP
    public List<BRL<AuraNavKey>> getEntries() {
        return this.entries;
    }

    public final BRL<AuraNavKey> getEntry() {
        return this.entry;
    }

    @Override // X.AMP
    public Object getKey() {
        return this.key;
    }

    public final G2k<AuraTabRootNavKey, AuraNavKey, G0V<? super BFM, ? super Integer, Unit>, BFM, Integer, Unit> getPageContent() {
        return this.pageContent;
    }

    @Override // X.AMP
    public List<BRL<AuraNavKey>> getPreviousEntries() {
        return this.previousEntries;
    }

    public final AuraTabRootNavKey getTabRoot() {
        return this.tabRoot;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.pageContent, (AnonymousClass005.A0F(this.previousEntries, AnonymousClass005.A0E(this.entry)) + AnonymousClass006.A0D(this.tabRoot)) * 31);
    }

    public final AuraPageScene copy(BRL<AuraNavKey> brl, List<BRL<AuraNavKey>> list, AuraTabRootNavKey auraTabRootNavKey, G2k<? super AuraTabRootNavKey, ? super AuraNavKey, ? super G0V<? super BFM, ? super Integer, Unit>, ? super BFM, ? super Integer, Unit> g2k) {
        AnonymousClass005.A0y(brl, list, g2k);
        return new AuraPageScene(brl, list, auraTabRootNavKey, g2k);
    }

    public /* bridge */ Map<String, Object> getMetadata() {
        return BMI.A00(this);
    }

    public String toString() {
        return super.toString();
    }
}
