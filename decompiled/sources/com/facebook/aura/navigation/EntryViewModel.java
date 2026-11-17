package com.facebook.aura.navigation;

import X.AEs;
import X.AnonymousClass002;
import X.BJt;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class EntryViewModel extends AEs {
    public final Map<Object, BJt> owners = C3cG.A0j();

    public final void clearViewModelStoreOwnerForKey(Object obj) {
        C7384Etj.A0Y(obj, 0);
        BJt bJtRemove = this.owners.remove(obj);
        if (bJtRemove != null) {
            bJtRemove.A00();
        }
    }

    public final BJt viewModelStoreForKey(Object obj) {
        C7384Etj.A0Y(obj, 0);
        Map<Object, BJt> map = this.owners;
        BJt bJt = map.get(obj);
        if (bJt == null) {
            bJt = new BJt();
            map.put(obj, bJt);
        }
        return bJt;
    }

    @Override // X.AEs
    public void onCleared() {
        Iterator itA0n = AnonymousClass002.A0n(this.owners);
        while (itA0n.hasNext()) {
            ((BJt) C3cH.A0l(itA0n).getValue()).A00();
        }
    }
}
