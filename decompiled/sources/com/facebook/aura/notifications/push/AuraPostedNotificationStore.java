package com.facebook.aura.notifications.push;

import X.A3q;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC7536F0j;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BzK;
import X.C06H;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.FGI;
import com.facebook.aura.common.prefs.AuraUserPrefStore;
import com.facebook.aura.common.prefs.AuraUserPrefs;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AuraPostedNotificationStore {
    public static final Companion Companion = new Companion();
    public static final String ENTRIES_KEY = "posted_notification_keys";
    public static final int MAX_ENTRIES = 256;
    public static final String SEPARATOR = "\t";
    public static final long TTL_MS = 86400000;
    public final C4oT preferences;

    public AuraPostedNotificationStore(String str) {
        C7384Etj.A0Y(str, 0);
        this.preferences = AuraUserPrefs.INSTANCE.get(str, AuraUserPrefStore.CHAT_NOTIFICATION);
    }

    public final boolean contains(String str, long j) {
        C7384Etj.A0Y(str, 0);
        return entries(j).containsKey(str);
    }

    public final void record(String str, long j) {
        C7384Etj.A0Y(str, 0);
        List listA0e = AbstractC0878AGe.A0e(AbstractC0878AGe.A0c(AGH.A09(str, entries(j)).entrySet(), new Comparator() { // from class: com.facebook.aura.notifications.push.AuraPostedNotificationStore$record$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00((Long) ((Map.Entry) t).getValue(), (Long) ((Map.Entry) t2).getValue());
            }
        }), 255);
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator it = listA0e.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(key);
            linkedHashSetA0k.add(AnonymousClass006.A0y(value, "\t", sbA0w));
        }
        linkedHashSetA0k.add(FGI.A0K(str, j, "\t"));
        BzK bzKA9q = this.preferences.A9q();
        bzKA9q.A09(ENTRIES_KEY, linkedHashSetA0k);
        bzKA9q.apply();
    }

    private final Map<String, Long> entries(long j) {
        C4oT c4oT = this.preferences;
        A3q a3q = A3q.A00;
        Set<String> stringSet = c4oT.getStringSet(ENTRIES_KEY, a3q);
        if (stringSet == null) {
            stringSet = a3q;
        }
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            String strA0X = C7BY.A0X(strA0j, "\t", strA0j);
            Long lA0s = C9tI.A0s(C7BY.A0V(strA0j, "\t", strA0j));
            if (lA0s != null && j - lA0s.longValue() <= 86400000) {
                AnonymousClass002.A1J(strA0X, lA0s, arrayListA0h);
            }
        }
        return AGH.A06(arrayListA0h);
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
