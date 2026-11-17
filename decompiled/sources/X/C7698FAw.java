package X;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.FAw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7698FAw implements FAR {
    public final Object A00;
    public final C7699FAx A01;
    public final String A02;
    public final Map<String, Object> A03;
    public final boolean A04;

    @Override // X.FAR
    public final Runnable A6c(FB4 fb4, String str) {
        FB3 fb3;
        AnonymousClass002.A1A(str, 1, fb4);
        boolean z = this.A04;
        C7699FAx c7699FAx = this.A01;
        String str2 = this.A02;
        Object obj = this.A00;
        synchronized (c7699FAx) {
            if (z) {
                c7699FAx.A01(str2, obj);
                C7701FAz c7701FAzA00 = C7699FAx.A00(fb4, c7699FAx);
                Map<String, Set<String>> map = c7701FAzA00.A02;
                Set<String> set = map.get(str2);
                Set<String> set2 = set;
                if (set == null) {
                    HashSet hashSet = new HashSet(1);
                    hashSet.add(str);
                    map.put(str2, hashSet);
                    set2 = hashSet;
                }
                set2.add(str);
                fb3 = c7701FAzA00.A00;
            } else {
                Object obj2 = c7699FAx.A00.get(str2);
                if (obj2 == null) {
                    c7699FAx.A01(str2, obj);
                } else if (obj2 != obj) {
                    fb4.AAj(c7699FAx.A00, obj2, "gs", str);
                }
                C7701FAz c7701FAzA002 = C7699FAx.A00(fb4, c7699FAx);
                Map<String, Set<String>> map2 = c7701FAzA002.A02;
                Set<String> set3 = map2.get(str2);
                Set<String> set4 = set3;
                if (set3 == null) {
                    HashSet hashSet2 = new HashSet(1);
                    hashSet2.add(str);
                    map2.put(str2, hashSet2);
                    set4 = hashSet2;
                }
                set4.add(str);
                fb3 = c7701FAzA002.A00;
            }
        }
        return fb3;
    }

    @Override // X.FAR
    public final Object AGT() {
        return this.A00;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/Object;ZLjava/util/Map<Ljava/lang/String;+Ljava/lang/Object;>;LX/FAx;)V */
    public C7698FAw(C7699FAx c7699FAx, Object obj, String str, Map map, boolean z) {
        this.A02 = str;
        this.A00 = obj;
        this.A04 = z;
        this.A03 = map;
        this.A01 = c7699FAx;
    }
}
