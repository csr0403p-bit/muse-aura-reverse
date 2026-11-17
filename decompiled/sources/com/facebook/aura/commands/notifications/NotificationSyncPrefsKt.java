package com.facebook.aura.commands.notifications;

import X.A3q;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.HxE;
import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class NotificationSyncPrefsKt {
    public static final String KEY_LAST_SYNCED_POST_TIME_MS = "last_synced_post_time_ms";
    public static final String KEY_RECENTLY_SHIPPED = "recently_shipped";
    public static final String NOTIFICATION_SYNC_PREFS = "notification_sync";
    public static final int RECENTLY_SHIPPED_MAX_ENTRIES = 500;
    public static final long RECENTLY_SHIPPED_TTL_MS = 86400000;

    public static final long lastSyncedPostTime(Context context) {
        C7384Etj.A0Y(context, 0);
        return context.getSharedPreferences(NOTIFICATION_SYNC_PREFS, 0).getLong(KEY_LAST_SYNCED_POST_TIME_MS, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void markShipped(Context context, Iterable<HxE<String, Long>> iterable, long j) {
        List listA0h;
        int iA09;
        Long lA0s;
        int iA1a = AnonymousClass002.A1a(context, iterable);
        SharedPreferences sharedPreferences = context.getSharedPreferences(NOTIFICATION_SYNC_PREFS, 0);
        long j2 = j - 86400000;
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        String string = sharedPreferences.getString(KEY_RECENTLY_SHIPPED, null);
        if (string != null && (listA0h = C7BY.A0h(string, new char[iA1a], '\n')) != null) {
            Iterator it = listA0h.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                int length = strA0j.length();
                if (length != 0 && (iA09 = C7BY.A09(strA0j, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, length - 1)) > 0 && (lA0s = C9tI.A0s(strA0j.substring(iA09 + 1))) != null && lA0s.longValue() >= j2) {
                    linkedHashMapA0j.put(strA0j.substring(0, iA09), lA0s);
                }
            }
        }
        Iterator<HxE<String, Long>> it2 = iterable.iterator();
        while (it2.hasNext()) {
            HxE hxEA10 = C60Q.A10(it2);
            String str = (String) hxEA10.first;
            long jA05 = C3cG.A05(hxEA10.second);
            if (str.length() != 0 && jA05 >= j2) {
                linkedHashMapA0j.remove(str);
                linkedHashMapA0j.put(str, Long.valueOf(jA05));
            }
        }
        int size = linkedHashMapA0j.size() - 500;
        if (size > 0) {
            Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
            for (int i = 0; itA0i.hasNext() && i < size; i++) {
                itA0i.next();
                itA0i.remove();
            }
        }
        StringBuilder sbA0w = C60O.A0w();
        Iterator itA0i2 = C3cG.A0i(linkedHashMapA0j);
        while (itA0i2.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i2);
            String strA0t = C60O.A0t(entryA0l);
            long jA052 = C3cG.A05(entryA0l.getValue());
            if (sbA0w.length() > 0) {
                sbA0w.append('\n');
            }
            sbA0w.append(strA0t);
            sbA0w.append(HatchMapSceneKt.ARTIFACT_ID_SEPARATOR);
            sbA0w.append(jA052);
        }
        sharedPreferences.edit().putString(KEY_RECENTLY_SHIPPED, sbA0w.toString()).apply();
    }

    public static final Set<String> recentlyShippedKeys(Context context, long j) {
        int iA09;
        Long lA0s;
        C7384Etj.A0Y(context, 0);
        String string = context.getSharedPreferences(NOTIFICATION_SYNC_PREFS, 0).getString(KEY_RECENTLY_SHIPPED, null);
        if (string == null) {
            return A3q.A00;
        }
        long j2 = j - 86400000;
        HashSet hashSetA13 = C60O.A13();
        Iterator it = C7BY.A0h(string, new char[1], '\n').iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            int length = strA0j.length();
            if (length != 0 && (iA09 = C7BY.A09(strA0j, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, length - 1)) > 0 && (lA0s = C9tI.A0s(strA0j.substring(iA09 + 1))) != null && lA0s.longValue() >= j2) {
                hashSetA13.add(strA0j.substring(0, iA09));
            }
        }
        return hashSetA13;
    }

    public static final void resetLastSyncedPostTime(Context context) {
        C7384Etj.A0Y(context, 0);
        context.getSharedPreferences(NOTIFICATION_SYNC_PREFS, 0).edit().putLong(KEY_LAST_SYNCED_POST_TIME_MS, 0L).apply();
    }

    public static final void setLastSyncedPostTime(Context context, long j) {
        C7384Etj.A0Y(context, 0);
        context.getSharedPreferences(NOTIFICATION_SYNC_PREFS, 0).edit().putLong(KEY_LAST_SYNCED_POST_TIME_MS, j).apply();
    }

    public static /* synthetic */ void markShipped$default(Context context, Iterable iterable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = System.currentTimeMillis();
        }
        markShipped(context, iterable, j);
    }

    public static /* synthetic */ Set recentlyShippedKeys$default(Context context, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        return recentlyShippedKeys(context, j);
    }
}
