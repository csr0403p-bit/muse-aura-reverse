package com.facebook.aura.status.api;

import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AbstractC7536F0j;
import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.email.EmailStatusTabProvider;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public final class StatusTabs {
    public static final int $stable = 0;
    public static final StatusTabs INSTANCE = new StatusTabs();

    public final List<StatusTab> enabled(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(EmailStatusTabProvider.INSTANCE.tab());
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((StatusTab) obj).isEnabled(abstractC3358CGz)) {
                arrayList2.add(obj);
            }
        }
        return AbstractC0878AGe.A0c(arrayList2, new Comparator() { // from class: com.facebook.aura.status.api.StatusTabs$enabled$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00(((StatusTab) t).getId(), ((StatusTab) t2).getId());
            }
        });
    }
}
