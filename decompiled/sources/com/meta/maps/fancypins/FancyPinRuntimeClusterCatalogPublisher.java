package com.meta.maps.fancypins;

import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.DCl;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public final class FancyPinRuntimeClusterCatalogPublisher {
    public FancyPinRuntimeClusterCatalog current;
    public final FancyPinRuntimeClusterCatalogSink sink;

    public FancyPinRuntimeClusterCatalogPublisher(FancyPinRuntimeClusterCatalogSink fancyPinRuntimeClusterCatalogSink) {
        C7384Etj.A0Y(fancyPinRuntimeClusterCatalogSink, 0);
        this.sink = fancyPinRuntimeClusterCatalogSink;
        C0881AGi c0881AGi = C0881AGi.A00;
        this.current = new FancyPinRuntimeClusterCatalog(c0881AGi, c0881AGi, 0L);
    }

    public final FancyPinRuntimeClusterCatalogPublication prepare(List<FancyPinClusterBlueprint> list) {
        C7384Etj.A0Y(list, 0);
        HashSet hashSetA13 = C60O.A13();
        Iterator<FancyPinClusterBlueprint> it = list.iterator();
        while (it.hasNext()) {
            hashSetA13.add(it.next().id);
        }
        if (hashSetA13.size() != list.size()) {
            throw C60O.A0i("Runtime cluster blueprint ids must be unique");
        }
        List listA0c = AbstractC0878AGe.A0c(list, new Comparator() { // from class: com.meta.maps.fancypins.FancyPinRuntimeClusterCatalogPublisher$prepare$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00(((FancyPinClusterBlueprint) t).id, ((FancyPinClusterBlueprint) t2).id);
            }
        });
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0c);
        Iterator it2 = listA0c.iterator();
        while (it2.hasNext()) {
            arrayListA0i.add(new String(((FancyPinClusterBlueprint) it2.next()).toJson(), DCl.A05));
        }
        return new FancyPinRuntimeClusterCatalogPublication(listA0c, C3cG.A1S(AbstractC0878AGe.A0L(",", "[", "]", arrayListA0i, null)));
    }

    public final FancyPinRuntimeClusterCatalog publish(FancyPinRuntimeClusterCatalogPublication fancyPinRuntimeClusterCatalogPublication) {
        C7384Etj.A0Y(fancyPinRuntimeClusterCatalogPublication, 0);
        if (this.current.generation >= LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            throw C3cG.A0Q("Runtime cluster catalog generation is exhausted");
        }
        List<Integer> listReplace = this.sink.replace(fancyPinRuntimeClusterCatalogPublication.blob);
        if (listReplace.size() == 1 && AnonymousClass001.A0F(AbstractC0878AGe.A0J(listReplace)) < 0) {
            return null;
        }
        if (listReplace.size() != fancyPinRuntimeClusterCatalogPublication.blueprints.size()) {
            throw C3cG.A0Q("Engine returned the wrong number of runtime cluster blueprint indices");
        }
        if (!(listReplace instanceof Collection) || !listReplace.isEmpty()) {
            Iterator<Integer> it = listReplace.iterator();
            while (it.hasNext()) {
                if (C60Q.A03(it) < 0) {
                    throw C3cG.A0Q("Engine returned a negative runtime cluster blueprint index");
                }
            }
        }
        if (AbstractC0878AGe.A0g(listReplace).size() != listReplace.size()) {
            throw C3cG.A0Q("Engine returned duplicate runtime cluster blueprint indices");
        }
        FancyPinRuntimeClusterCatalog fancyPinRuntimeClusterCatalog = new FancyPinRuntimeClusterCatalog(fancyPinRuntimeClusterCatalogPublication.blueprints, listReplace, this.current.generation + 1);
        this.current = fancyPinRuntimeClusterCatalog;
        return fancyPinRuntimeClusterCatalog;
    }

    public final FancyPinRuntimeClusterCatalog replace(List<FancyPinClusterBlueprint> list) {
        C7384Etj.A0Y(list, 0);
        return publish(prepare(list));
    }

    public final FancyPinRuntimeClusterCatalog getCurrent() {
        return this.current;
    }
}
