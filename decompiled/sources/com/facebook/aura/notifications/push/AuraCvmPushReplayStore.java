package com.facebook.aura.notifications.push;

import X.A3q;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C7BY;
import X.C9tI;
import X.FGI;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class AuraCvmPushReplayStore {
    public static final String ENTRIES_KEY = "entries";
    public static final String ENTRY_SEPARATOR = "\t";
    public static final int MAX_ENTRIES = 512;
    public final SharedPreferences preferences;
    public static final Companion Companion = new Companion();
    public static final Object processLock = C3cG.A0T();

    public final class Entry extends C06G {
        public final long expiresAtMs;
        public final String notificationId;
        public final String vmId;

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof Entry) {
                    Entry entry = (Entry) obj;
                    if (!C7384Etj.areEqual(this.vmId, entry.vmId) || !C7384Etj.areEqual(this.notificationId, entry.notificationId) || this.expiresAtMs != entry.expiresAtMs) {
                    }
                }
                return false;
            }
            return true;
        }

        public static /* synthetic */ Entry copy$default(Entry entry, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = entry.vmId;
            }
            if ((i & 2) != 0) {
                str2 = entry.notificationId;
            }
            if ((i & 4) != 0) {
                j = entry.expiresAtMs;
            }
            return entry.copy(str, str2, j);
        }

        public final String component1() {
            return this.vmId;
        }

        public final String component2() {
            return this.notificationId;
        }

        public final long component3() {
            return this.expiresAtMs;
        }

        public final String encode() {
            String str = this.vmId;
            String str2 = this.notificationId;
            long j = this.expiresAtMs;
            StringBuilder sbA0g = C3cG.A0g(str);
            C60O.A1R("\t", str2, sbA0g);
            sbA0g.append(j);
            return sbA0g.toString();
        }

        public final long getExpiresAtMs() {
            return this.expiresAtMs;
        }

        public final String getNotificationId() {
            return this.notificationId;
        }

        public final String getVmId() {
            return this.vmId;
        }

        public int hashCode() {
            return AnonymousClass006.A05(this.expiresAtMs, AnonymousClass005.A0I(this.notificationId, AnonymousClass001.A0G(this.vmId)));
        }

        public Entry(String str, String str2, long j) {
            AnonymousClass003.A0u(str, str2);
            this.vmId = str;
            this.notificationId = str2;
            this.expiresAtMs = j;
        }

        public final Entry copy(String str, String str2, long j) {
            AnonymousClass003.A0u(str, str2);
            return new Entry(str, str2, j);
        }

        public String toString() {
            return super.toString();
        }
    }

    private final Entry decodeEntry(String str) {
        Long lA0s;
        List listA0i = C7BY.A0i(str, new String[]{"\t"}, 3);
        if (listA0i.size() == 3 && (lA0s = C9tI.A0s(C60Q.A0n(listA0i, 2))) != null) {
            return new Entry(C60Q.A0n(listA0i, 0), C60Q.A0n(listA0i, 1), lA0s.longValue());
        }
        return null;
    }

    public final class Companion {
        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AuraCvmPushReplayStore(Context context, String str) {
        this.preferences = context.getApplicationContext().getSharedPreferences(FGI.A0M("aura_cvm_push_replay_", str), AnonymousClass004.A1b(context, str) ? 1 : 0);
    }

    public final boolean claim(String str, String str2, long j, long j2) {
        boolean zCommit;
        AnonymousClass003.A0u(str, str2);
        synchronized (processLock) {
            SharedPreferences sharedPreferences = this.preferences;
            A3q a3q = A3q.A00;
            Set<String> stringSet = sharedPreferences.getStringSet(ENTRIES_KEY, a3q);
            if (stringSet == null) {
                stringSet = a3q;
            }
            ArrayList arrayListA0h = C3cG.A0h();
            Iterator<String> it = stringSet.iterator();
            while (it.hasNext()) {
                Entry entryDecodeEntry = decodeEntry(AnonymousClass005.A0j(it));
                if (entryDecodeEntry != null) {
                    arrayListA0h.add(entryDecodeEntry);
                }
            }
            ArrayList arrayListA0h2 = C3cG.A0h();
            for (Object obj : arrayListA0h) {
                if (((Entry) obj).expiresAtMs >= j2) {
                    arrayListA0h2.add(obj);
                }
            }
            ArrayList arrayList = new ArrayList(arrayListA0h2);
            zCommit = false;
            if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Entry entry = (Entry) it2.next();
                    if (str.equals(entry.vmId) && str2.equals(entry.notificationId)) {
                        break;
                    }
                }
            }
            if (arrayList.size() < 512) {
                arrayList.add(new Entry(str, str2, j));
                LinkedHashSet linkedHashSetA0k = C3cG.A0k();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    linkedHashSetA0k.add(((Entry) it3.next()).encode());
                }
                zCommit = this.preferences.edit().putStringSet(ENTRIES_KEY, linkedHashSetA0k).commit();
            }
        }
        return zCommit;
    }
}
