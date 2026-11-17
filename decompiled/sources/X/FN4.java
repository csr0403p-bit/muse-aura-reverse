package X;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FN4 implements FOI {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final SparseArray<Object> A04;
    public final Object A05;
    public final String A06;
    public final HashMap<String, String> A07;
    public final List A08;
    public final Map<String, Object> A09;
    public final Map<String, Object> A0A;
    public final Map<String, Object> A0B;

    public FN4(Object obj, String str, HashMap map, List list, Map map2, Map map3, Map map4, int i) {
        this.A06 = str;
        this.A07 = map == null ? BV4.A0u() : map;
        this.A0A = map3 == null ? BV4.A0u() : map3;
        this.A0B = map4 == null ? BV4.A0u() : map4;
        this.A01 = i <= 0 ? 719983200 : i;
        int iA0G = AnonymousClass001.A0G(str) + C3cH.A02(map);
        if (!TextUtils.isEmpty(null)) {
            throw BV4.A0a("hashCode");
        }
        synchronized (Hmu.class) {
            LruCache<Integer, Integer> lruCache = Hmu.A00;
            Integer numValueOf = Integer.valueOf(iA0G);
            Integer num = lruCache.get(numValueOf);
            iA0G = num != null ? (num.intValue() + 1) * 31 : iA0G;
            lruCache.put(numValueOf, Integer.valueOf(iA0G));
        }
        this.A00 = iA0G;
        this.A03 = 86400L;
        this.A02 = AwakeTimeSinceBootClock.INSTANCE.now();
        this.A08 = list;
        this.A04 = BV4.A0B();
        this.A05 = obj;
        this.A09 = map2 == null ? BV4.A0u() : map2;
    }

    @Override // X.FOI
    public final String AHv() {
        return "legacy_screen";
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FN4)) {
            return false;
        }
        FN4 fn4 = (FN4) obj;
        if (!this.A06.equals(fn4.A06) || !this.A07.equals(fn4.A07)) {
            return false;
        }
        if (TextUtils.isEmpty(null)) {
            return TextUtils.isEmpty(null);
        }
        throw BV4.A0a("equals");
    }

    public final int hashCode() {
        int iA0G = (AnonymousClass006.A0G(this.A06) * 31) + C3cH.A02(this.A07);
        if (TextUtils.isEmpty(null)) {
            return iA0G;
        }
        throw BV4.A0a("hashCode");
    }
}
