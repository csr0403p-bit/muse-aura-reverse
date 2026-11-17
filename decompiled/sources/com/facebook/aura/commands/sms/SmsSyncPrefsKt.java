package com.facebook.aura.commands.sms;

import X.A3q;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.FGI;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class SmsSyncPrefsKt {
    public static final String KEY_LAST_SYNCED_SMS_DATE_MS = "last_synced_sms_date_ms";
    public static final String KEY_RECENTLY_PUBLISHED_IDS = "recently_published_message_ids";
    public static final long MMS_SECOND_GRANULARITY_MS = 1000;
    public static final String SMS_SYNC_PREFS = "sms_sync";
    public static final long SYNC_BACKDATE_GRACE_MS = 86400000;

    public static final long lastSyncedSmsDate(Context context) {
        C7384Etj.A0Y(context, 0);
        return context.getSharedPreferences(SMS_SYNC_PREFS, 0).getLong(KEY_LAST_SYNCED_SMS_DATE_MS, 0L);
    }

    public static final Set<String> recentlyPublishedIds(Context context) {
        C7384Etj.A0Y(context, 0);
        SharedPreferences sharedPreferences = context.getSharedPreferences(SMS_SYNC_PREFS, 0);
        A3q a3q = A3q.A00;
        Set<String> stringSet = sharedPreferences.getStringSet(KEY_RECENTLY_PUBLISHED_IDS, a3q);
        if (stringSet == null) {
            stringSet = a3q;
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            String strA0j = AnonymousClass005.A0j(it);
            C7384Etj.A0X(strA0j);
            C60Q.A1M(C7BY.A0T(strA0j, strA0j, '|'), linkedHashSetA0k);
        }
        return linkedHashSetA0k;
    }

    public static final void setLastSyncedSmsDate(Context context, long j) {
        C7384Etj.A0Y(context, 0);
        context.getSharedPreferences(SMS_SYNC_PREFS, 0).edit().putLong(KEY_LAST_SYNCED_SMS_DATE_MS, j).apply();
    }

    public static final void recordPublishedIds(Context context, Map<String, Long> map, long j) {
        boolean zA1b = AnonymousClass004.A1b(context, map);
        if (map.isEmpty()) {
            return;
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(SMS_SYNC_PREFS, zA1b ? 1 : 0);
        long j2 = j - 86401000;
        A3q a3q = A3q.A00;
        Set<String> stringSet = sharedPreferences.getStringSet(KEY_RECENTLY_PUBLISHED_IDS, a3q);
        if (stringSet == null) {
            stringSet = a3q;
        }
        LinkedHashSet linkedHashSetA0k = C3cG.A0k();
        for (String str : stringSet) {
            String str2 = str;
            C7384Etj.A0X(str2);
            if (C60P.A01(C9tI.A0s(C7BY.A0R(str2, str2, '|'))) > j2) {
                linkedHashSetA0k.add(str);
            }
        }
        Iterator itA0n = AnonymousClass002.A0n(map);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            linkedHashSetA0k.add(FGI.A0K(C60O.A0t(entryA0l), C3cG.A05(entryA0l.getValue()), "|"));
        }
        sharedPreferences.edit().putStringSet(KEY_RECENTLY_PUBLISHED_IDS, linkedHashSetA0k).apply();
    }
}
