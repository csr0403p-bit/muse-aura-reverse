package X;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Binder;
import android.os.Process;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Etf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C7381Etf {
    public final Map<C7mC, Set<String>> A00;
    public final Set<C7mC> A01;
    public final Set<String> A02 = new HashSet();

    public final boolean A02(C06967mj c06967mj, boolean z) {
        if (c06967mj != null && c06967mj.A04() != null) {
            C7mC c7mCA04 = c06967mj.A04();
            for (C7mC c7mC : this.A01) {
                if (!c7mCA04.equals(c7mC)) {
                    if (z) {
                        Set<C7mC> set = AbstractC10402HbJ.A0k;
                        C7384Etj.A0Y(c7mC, 0);
                        Set<C7mC> setA10 = BV4.A10(c7mC, AbstractC10402HbJ.A0i);
                        if (setA10 == null) {
                            setA10 = AbstractC10402HbJ.A0k;
                        }
                        if (setA10.contains(c7mCA04)) {
                        }
                    }
                }
                return true;
            }
            Map<C7mC, Set<String>> map = this.A00;
            Iterator itA11 = BV5.A11(map);
            while (itA11.hasNext()) {
                C7mC c7mC2 = (C7mC) itA11.next();
                if (!c7mCA04.equals(c7mC2)) {
                    if (z) {
                        Set<C7mC> set2 = AbstractC10402HbJ.A0k;
                        C7384Etj.A0Y(c7mC2, 0);
                        Set<C7mC> setA102 = BV4.A10(c7mC2, AbstractC10402HbJ.A0i);
                        if (setA102 == null) {
                            setA102 = AbstractC10402HbJ.A0k;
                        }
                        if (!setA102.contains(c7mCA04)) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                Iterator<String> it = c06967mj.A03.iterator();
                while (it.hasNext()) {
                    if (BV4.A10(c7mC2, map).contains(it.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C7381Etf) {
                C7381Etf c7381Etf = (C7381Etf) obj;
                Set<C7mC> set = c7381Etf.A01;
                Set<C7mC> set2 = this.A01;
                boolean zEquals = set != null ? set.equals(set2) : AnonymousClass002.A1Y(set2);
                Map<C7mC, Set<String>> map = c7381Etf.A00;
                Map<C7mC, Set<String>> map2 = this.A00;
                boolean zEquals2 = map != null ? map.equals(map2) : AnonymousClass002.A1Y(map2);
                if (!zEquals || !zEquals2) {
                }
            }
            return false;
        }
        return true;
    }

    @Deprecated
    public final boolean A01(Context context) {
        if (context == null) {
            return false;
        }
        if (Binder.getCallingPid() == Process.myPid()) {
            throw new SecurityException("This method must be called on behalf of an IPC transaction from binder thread.");
        }
        int callingUidOrThrow = Binder.getCallingUidOrThrow();
        Binder.getCallingPid();
        return A02(C06967mj.A00(context, callingUidOrThrow), AbstractC06987ml.A02(context));
    }

    public final int hashCode() {
        return BV7.A0D(this.A01, this.A00);
    }

    public C7381Etf(Map<C7mC, Set<String>> map) {
        HashSet hashSet = new HashSet();
        HashMap map2 = new HashMap();
        for (Map.Entry<C7mC, Set<String>> entry : map.entrySet()) {
            C7mC key = entry.getKey();
            Set<String> value = entry.getValue();
            if (value == null || !value.contains("*|all_packages|*")) {
                if (!map2.containsKey(key)) {
                    map2.put(key, new HashSet());
                }
                ((Set) map2.get(key)).addAll(value);
            } else {
                hashSet.add(key);
            }
        }
        this.A01 = Collections.unmodifiableSet(hashSet);
        this.A00 = Collections.unmodifiableMap(map2);
    }

    public final ContentProviderClient A00(Context context, Uri uri) {
        String authority = uri.getAuthority();
        String str = null;
        if (authority != null) {
            try {
                C06967mj c06967mjA01 = C06967mj.A01(context, authority);
                if (!A02(c06967mjA01, AbstractC06987ml.A02(context))) {
                    throw new SecurityException(AnonymousClass006.A0y(c06967mjA01, "' is not trusted: ", C3cI.A0x("The provider for uri '", authority)));
                }
                str = authority;
            } catch (SecurityException unused) {
            }
        }
        if (str == null) {
            return null;
        }
        return context.getContentResolver().acquireUnstableContentProviderClient(str);
    }
}
