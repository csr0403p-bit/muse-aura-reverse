package com.facebook.aura.tabs.api;

import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass005;
import X.C10650I0u;
import X.C20Q;
import X.C20Y;
import X.C7384Etj;
import com.facebook.aura.navigation.AuraTabRootNavKey;
import com.facebook.aura.pairs.ConnectionsTabAttentionProvider;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class TabAttentions {
    public static final TabAttentions INSTANCE = new TabAttentions();

    public final C20Q<Map<AuraTabRootNavKey, Set<String>>> observe(AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 0);
        ArrayList arrayList = new ArrayList(1);
        int i = new int[]{0}[0];
        if (i != 0) {
            throw AnonymousClass005.A0c(i);
        }
        arrayList.add(new C10650I0u(new TabAttentions$observe$flows$1$1(null), ConnectionsTabAttentionProvider.INSTANCE.source().attention(abstractC3358CGz), 1));
        return arrayList.isEmpty() ? new C20Y(AGH.A0E()) : new TabAttentions$observe$$inlined$combine$1((C20Q[]) AbstractC0878AGe.A0X(arrayList).toArray(new C20Q[0]));
    }
}
