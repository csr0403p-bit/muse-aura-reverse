package com.facebook.aura.conversation.reactions;

import X.A6B;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC2258BHp;
import X.AbstractC3358CGz;
import X.AbstractC7536F0j;
import X.AnonymousClass002;
import X.AnonymousClass006;
import X.B3i;
import X.BLG;
import X.BzK;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C10571Hud;
import X.C1BN;
import X.C3Pi;
import X.C3b6;
import X.C3cG;
import X.C3cH;
import X.C4oT;
import X.C60R;
import X.C7384Etj;
import X.C8d6;
import X.C9286GCn;
import X.C9hr;
import X.C9tS;
import X.HnJ;
import X.HxE;
import X.InterfaceC7549F2g;
import com.facebook.aura.common.prefs.HatchPrefsStore;
import com.facebook.aura.json.HatchJsonKt;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class HatchReactionUsageStore implements InterfaceC7549F2g {
    public static final String KEY_USAGE_COUNTS = "hatch_reaction_usage_counts_v2";
    public static final int MAX_TRACKED_EMOJIS = 64;
    public final BLG<Map<String, Integer>> _counts;
    public final C1BN<Map<String, Integer>> counts;
    public final AbstractC3358CGz userSession;
    public static final Companion Companion = new Companion();
    public static final C9hr<Map<String, Integer>> COUNTS = new C9tS(C07779iq.A01, C07729ii.A00);

    @Override // X.InterfaceC7549F2g
    public synchronized void clearUserData() {
        this._counts.Af8(AGH.A0E());
        BzK bzKA9q = getPrefs().A9q();
        bzKA9q.Aae(KEY_USAGE_COUNTS);
        bzKA9q.apply();
    }

    public final synchronized void recordUsage(String str) {
        if (C60R.A02(str) != 0) {
            Map<String, Integer> value = this._counts.getValue();
            Integer num = value.get(str);
            Map<String, Integer> mapPruneToCap = pruneToCap(AGH.A0C(value, AnonymousClass002.A0p(str, (num != null ? num.intValue() : 0) + 1)), str);
            this._counts.Af8(mapPruneToCap);
            BzK bzKA9q = getPrefs().A9q();
            bzKA9q.AYr(KEY_USAGE_COUNTS, HatchJsonKt.HatchJson.A02(mapPruneToCap, COUNTS));
            bzKA9q.apply();
        }
    }

    private final C4oT getPrefs() {
        return HatchPrefsStore.INSTANCE.userPrefs(this.userSession);
    }

    public final C1BN<Map<String, Integer>> getCounts() {
        return this.counts;
    }

    /* loaded from: classes.dex */
    public final class Companion {
        public final HatchReactionUsageStore getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (HatchReactionUsageStore) abstractC3358CGz.A03(HatchReactionUsageStore.class, new HatchReactionUsageStore$Companion$getInstance$1(abstractC3358CGz));
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public HatchReactionUsageStore(AbstractC3358CGz abstractC3358CGz) {
        this.userSession = abstractC3358CGz;
        C9286GCn c9286GCnA01 = HnJ.A01(readPersistedCounts());
        this._counts = c9286GCnA01;
        this.counts = C3Pi.A00(c9286GCnA01);
    }

    private final Map<String, Integer> pruneToCap(Map<String, Integer> map, String str) {
        if (map.size() <= 64) {
            return map;
        }
        B3i b3iA03 = A6B.A03(new HatchReactionUsageStore$pruneToCap$survivors$1(str), AbstractC0878AGe.A06(map.entrySet()));
        final Comparator comparator = new Comparator() { // from class: com.facebook.aura.conversation.reactions.HatchReactionUsageStore$pruneToCap$$inlined$compareByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return AbstractC7536F0j.A00((Comparable) ((Map.Entry) t2).getValue(), (Comparable) ((Map.Entry) t).getValue());
            }
        };
        C3b6 c3b6A07 = A6B.A07(new C8d6(new Comparator() { // from class: com.facebook.aura.conversation.reactions.HatchReactionUsageStore$pruneToCap$$inlined$thenBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare == 0 ? AbstractC7536F0j.A00((Comparable) ((Map.Entry) t).getKey(), (Comparable) ((Map.Entry) t2).getKey()) : iCompare;
            }
        }, b3iA03), 63);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        Iterator it = c3b6A07.iterator();
        while (it.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(it);
            HxE hxEA0r = C3cG.A0r(entryA0l.getKey(), entryA0l.getValue());
            linkedHashMapA0j.put(hxEA0r.first, hxEA0r.second);
        }
        return AnonymousClass006.A11(str, AbstractC2258BHp.A0L(str, map), linkedHashMapA0j);
    }

    private final Map<String, Integer> readPersistedCounts() {
        Object objA0s;
        String string = getPrefs().getString(KEY_USAGE_COUNTS, null);
        if (string != null) {
            try {
                objA0s = (Map) HatchJsonKt.HatchJson.A00(string, COUNTS);
            } catch (Throwable th) {
                objA0s = C3cG.A0s(th);
            }
            Map<String, Integer> map = (Map) (objA0s instanceof C10571Hud ? null : objA0s);
            if (map != null) {
                return map;
            }
        }
        return AGH.A0E();
    }

    public /* synthetic */ HatchReactionUsageStore(AbstractC3358CGz abstractC3358CGz, C06H c06h) {
        this(abstractC3358CGz);
    }
}
