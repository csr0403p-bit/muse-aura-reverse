package X;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.LruCache;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.CMt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3426CMt {
    public static volatile boolean A00;
    public static volatile boolean A01;

    public static void A02(String str, String str2) {
        A03(str, str2, new Object[0]);
    }

    public static void A03(String str, String str2, Object... objArr) {
        if (A00) {
            CFK.A06(str, String.format(str2, objArr));
        }
    }

    public static Uri A00(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return uri;
        }
        String[] strArrSplit = encodedQuery.split("&");
        int i = 0;
        while (true) {
            if (i >= strArrSplit.length) {
                return uri;
            }
            String str = strArrSplit[i];
            if (str.startsWith("ms=")) {
                if (i < 0) {
                    return uri;
                }
                String[] strArrSplit2 = str.substring(3).split("_", -1);
                if (strArrSplit2.length < 2) {
                    return uri;
                }
                String str2 = strArrSplit2[1];
                if (str2.indexOf(76, 1) < 0) {
                    return uri;
                }
                strArrSplit2[1] = FGI.A0M(str2.substring(0, 1), strArrSplit2[1].substring(1).replace("L", ""));
                strArrSplit[i] = FGI.A0M("ms=", TextUtils.join("_", strArrSplit2));
                StringBuilder sbA0w = C60O.A0w();
                for (String str3 : strArrSplit) {
                    if (!str3.startsWith("chk_dur=")) {
                        if (sbA0w.length() > 0) {
                            sbA0w.append('&');
                        }
                        sbA0w.append(str3);
                    }
                }
                return uri.buildUpon().encodedQuery(sbA0w.toString()).build();
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String A01(android.net.Uri r5, java.lang.String r6, java.lang.String r7, boolean r8, boolean r9, boolean r10, boolean r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            java.lang.StringBuilder r1 = X.C60O.A0w()
            if (r5 != 0) goto Laf
            android.net.Uri r5 = android.net.Uri.EMPTY
        L8:
            java.lang.String r3 = "_t"
            java.lang.String r2 = "."
            if (r14 == 0) goto L4e
            if (r15 != 0) goto L16
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L4e
        L16:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L4e
            r1.append(r7)
            if (r9 == 0) goto L26
            if (r11 != 0) goto L26
            r1.append(r3)
        L26:
            X.C60O.A1R(r2, r6, r1)
            java.lang.String r3 = r5.getLastPathSegment()
            if (r3 != 0) goto L3a
            java.lang.String r3 = ""
        L31:
            java.lang.String r0 = X.AbstractC7406Euk.A00(r3)
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r1)
        L39:
            return r0
        L3a:
            int r2 = X.BV6.A0B(r3)
            r0 = -1
            if (r2 == r0) goto L31
            int r0 = r3.length()
            int r0 = r0 + (-1)
            if (r2 >= r0) goto L31
            java.lang.String r3 = X.BV4.A0j(r3, r2)
            goto L31
        L4e:
            if (r6 != 0) goto L5a
            if (r8 == 0) goto L5a
            int r0 = r5.hashCode()
            java.lang.String r6 = java.lang.Integer.toHexString(r0)
        L5a:
            if (r7 == 0) goto L5f
            r1.append(r7)
        L5f:
            if (r9 == 0) goto L66
            if (r11 != 0) goto L66
            r1.append(r3)
        L66:
            X.C60O.A1R(r2, r6, r1)
            r4 = 1
            if (r10 == 0) goto L8f
            java.lang.String r0 = r5.getLastPathSegment()
            if (r0 == 0) goto L8f
            java.lang.String r3 = r5.getLastPathSegment()
            java.lang.String r2 = r5.getLastPathSegment()
            r0 = 47
            int r2 = r2.lastIndexOf(r0)
        L80:
            java.lang.String r3 = X.BV4.A0g(r2, r3)
        L84:
            java.lang.String r0 = X.AnonymousClass001.A0v(r3, r1)
            if (r12 == 0) goto L39
            java.lang.String r0 = X.AbstractC7406Euk.A00(r0)
            return r0
        L8f:
            if (r13 == 0) goto Laa
            java.lang.String r0 = r5.getLastPathSegment()
            if (r0 == 0) goto Laa
            java.lang.String r3 = r5.getLastPathSegment()
            int r2 = X.BV6.A0B(r3)
            r0 = -1
            if (r2 == r0) goto L84
            int r0 = r3.length()
            int r0 = r0 - r4
            if (r2 >= r0) goto L84
            goto L80
        Laa:
            java.lang.String r3 = r5.getLastPathSegment()
            goto L84
        Laf:
            java.lang.String r2 = "127.0.0.1"
            java.lang.String r0 = r5.getHost()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L8
            java.lang.String r0 = "remote-uri"
            java.lang.String r0 = r5.getQueryParameter(r0)
            android.net.Uri r5 = android.net.Uri.parse(r0)
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC3426CMt.A01(android.net.Uri, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean):java.lang.String");
    }

    public static void A04(String str, String str2, Object... objArr) {
        CFK.A06(str, String.format(str2, objArr));
    }

    /* JADX WARN: Incorrect types in method signature: <K:Ljava/lang/Object;V:Ljava/lang/Object;>(Ljava/util/concurrent/atomic/AtomicReference<Landroid/util/LruCache<TK;TV;>;>;ILjava/lang/String;)V */
    public static void A05(String str, AtomicReference atomicReference, int i) {
        LruCache lruCache = (LruCache) atomicReference.get();
        Integer numValueOf = Integer.valueOf(lruCache.maxSize());
        Integer numValueOf2 = Integer.valueOf(i);
        A03("Util", "Trying to resize cache for %s: old=%d, new=%d, SDK=%d", str, numValueOf, numValueOf2, Integer.valueOf(Build.VERSION.SDK_INT));
        if (lruCache.maxSize() != i) {
            A03("Util", "Resizing cache for %s: old=%d, new=%d, %d existing items", str, Integer.valueOf(lruCache.maxSize()), numValueOf2, Integer.valueOf(lruCache.size()));
            lruCache.resize(i);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (JJLjava/util/TreeMap<Ljava/lang/Long;Ljava/lang/Integer;>;I)Z */
    public static boolean A06(TreeMap treeMap, int i, long j, long j2) {
        Long lValueOf = Long.valueOf(j);
        Object objFloorKey = treeMap.floorKey(lValueOf);
        if (objFloorKey != null && AnonymousClass001.A0F(treeMap.get(objFloorKey)) >= i) {
            return true;
        }
        Iterator it = treeMap.subMap(lValueOf, false, Long.valueOf(j2), true).values().iterator();
        while (it.hasNext()) {
            if (C60Q.A03(it) >= i) {
                return true;
            }
        }
        return false;
    }
}
