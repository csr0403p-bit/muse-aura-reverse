package com.facebook.aura.skills.repo;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass006;
import X.C06H;
import X.C7384Etj;
import X.C79;
import X.F0C;
import android.os.SystemClock;
import com.facebook.aura.skills.model.Skill;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class HatchSkillIconUrlReconciler {
    public final ConcurrentHashMap<String, CachedIconUrl> cache = new ConcurrentHashMap<>();

    public final class CachedIconUrl {
        public long expiryTimeMs;
        public final String iconUrl;
        public final F0C path$delegate;

        public CachedIconUrl(String str, String str2) {
            C7384Etj.A0Y(str, 0);
            this.iconUrl = str;
            this.path$delegate = AbstractC5321DgF.A02(C79.A01, new HatchSkillIconUrlReconciler$CachedIconUrl$path$2(str2, this));
            this.expiryTimeMs = SystemClock.elapsedRealtime() + 300000;
        }

        public final String getIconUrl() {
            return this.iconUrl;
        }

        public final String getPath() {
            return (String) this.path$delegate.getValue();
        }

        public final boolean isExpired() {
            return AnonymousClass002.A1N((SystemClock.elapsedRealtime() > this.expiryTimeMs ? 1 : (SystemClock.elapsedRealtime() == this.expiryTimeMs ? 0 : -1)));
        }

        public /* synthetic */ CachedIconUrl(String str, String str2, int i, C06H c06h) {
            this(str, AnonymousClass006.A0s(i, str2));
        }
    }

    public final void retainOnly(Set<String> set) {
        C7384Etj.A0Y(set, 0);
        this.cache.keySet().retainAll(set);
    }

    private final Skill reconcile(Skill skill) {
        ConcurrentHashMap<String, CachedIconUrl> concurrentHashMap;
        String strExtractPath;
        String str = skill.iconUrl;
        if (str != null) {
            String str2 = skill.id;
            CachedIconUrl cachedIconUrl = this.cache.get(str2);
            if (cachedIconUrl == null || cachedIconUrl.isExpired()) {
                concurrentHashMap = this.cache;
                strExtractPath = null;
            } else if (!str.equals(cachedIconUrl.iconUrl)) {
                strExtractPath = HatchSkillIconUrlReconcilerKt.extractPath(str);
                if (strExtractPath != null && strExtractPath.equals(cachedIconUrl.getPath())) {
                    return Skill.copy$default(skill, null, null, null, null, false, cachedIconUrl.iconUrl, false, null, false, null, 991, null);
                }
                concurrentHashMap = this.cache;
            }
            concurrentHashMap.put(str2, new CachedIconUrl(str, strExtractPath));
        }
        return skill;
    }

    public final void clear() {
        this.cache.clear();
    }

    public final List<Skill> reconcile(List<Skill> list) {
        C7384Etj.A0Y(list, 0);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        Iterator<Skill> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(reconcile(it.next()));
        }
        return arrayListA0i;
    }
}
