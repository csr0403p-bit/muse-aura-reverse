package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.os.Handler;
import android.os.Trace;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class DDK implements C0S {
    public static final Object A0J = C3cG.A0T();
    public static volatile DDK A0K;
    public int A00;
    public int A02;
    public WeakReference<InterfaceC3158C0g> A03;
    public final DDP A05;
    public final Object A06;
    public final Runnable A07;
    public final Set<String> A08;
    public final AtomicBoolean A0A;
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final boolean A0D;
    public final Object[] A0E;
    public final AtomicBoolean A0F;
    public volatile Handler A0G;
    public volatile boolean A0H;
    public volatile boolean A0I;
    public long A01 = 5000;
    public final ConcurrentLinkedQueue<DDN> A09 = new ConcurrentLinkedQueue<>();
    public final C3184C1o A04 = new C3184C1o();

    @Override // X.C0S
    public final void AT3(String str, String str2, int i, int i2) {
    }

    @Override // X.C0R
    public final void AW4(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        String strA00;
        C7384Etj.A0Y(c0j, 1);
        String str = c0j.A06;
        if (str == null || (strA00 = AbstractC3160C0i.A00(str)) == null) {
            return;
        }
        File file = c0j.A05;
        A02(this, strA00, str, file != null ? file.getPath() : null);
    }

    @Override // X.C0R
    public final void AW5(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, C0J c0j2, Integer num) {
    }

    @Override // X.C0S
    public final void AWA(InterfaceC3158C0g interfaceC3158C0g, String str, long j, long j2) {
    }

    public DDK(DDP ddp) {
        this.A05 = ddp;
        ConcurrentHashMap.KeySetView keySetViewNewKeySet = ConcurrentHashMap.newKeySet();
        C7384Etj.A0U(keySetViewNewKeySet);
        this.A08 = keySetViewNewKeySet;
        int i = 0;
        this.A0F = BV4.A12(false);
        this.A0A = BV4.A12(false);
        this.A0C = BV4.A12(false);
        this.A0B = BV4.A12(false);
        this.A06 = C3cG.A0T();
        Object[] objArr = new Object[32];
        do {
            objArr[i] = C3cG.A0T();
            i++;
        } while (i < 32);
        this.A0E = objArr;
        Trace.beginSection("VPS-LightCacheDbLoad");
        try {
            DDW ddw = (DDW) ddp;
            ArrayList arrayListA0h = C3cG.A0h();
            try {
                try {
                    Trace.beginSection("video_cache_legacy_db_getAllEntries");
                    Cursor cursorRawQuery = ddw.getReadableDatabase().rawQuery("SELECT * FROM video_cache_entries", null);
                    try {
                        int columnIndex = cursorRawQuery.getColumnIndex("videoId");
                        int columnIndex2 = cursorRawQuery.getColumnIndex("cacheKey");
                        int columnIndex3 = cursorRawQuery.getColumnIndex("filePath");
                        while (cursorRawQuery.moveToNext()) {
                            String string = cursorRawQuery.getString(columnIndex);
                            C7384Etj.A0U(string);
                            String string2 = cursorRawQuery.getString(columnIndex2);
                            C7384Etj.A0U(string2);
                            String string3 = cursorRawQuery.getString(columnIndex3);
                            C7384Etj.A0U(string3);
                            arrayListA0h.add(new DDM(string, string2, string3));
                        }
                        cursorRawQuery.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Exception e) {
                BzX.A00("VideoCacheDatabaseHelper", "Failed to retrieve all cache entries from database", e);
            }
            Trace.endSection();
            this.A0D = arrayListA0h.isEmpty();
            this.A02 = arrayListA0h.size();
            Iterator it = arrayListA0h.iterator();
            while (it.hasNext()) {
                DDM ddm = (DDM) it.next();
                this.A04.A00(ddm.A02, ddm.A00, ddm.A01);
            }
            Trace.endSection();
            BV4.A1B(this.A02, "CacheMetadataLookup", "Light cache initialized: %d entries");
            this.A07 = new DDL(this);
        } catch (Throwable th2) {
            Trace.endSection();
            BV4.A1B(this.A02, "CacheMetadataLookup", "Light cache initialized: %d entries");
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.AGi] */
    public static final void A00(DDK ddk) {
        InterfaceC3158C0g interfaceC3158C0g;
        Set<String> setAGr;
        ?? A0h;
        String strA00;
        String path;
        WeakReference<InterfaceC3158C0g> weakReference = ddk.A03;
        if (weakReference == null || (interfaceC3158C0g = weakReference.get()) == null || (setAGr = interfaceC3158C0g.AGr()) == null || setAGr.isEmpty()) {
            return;
        }
        C3184C1o c3184C1o = ddk.A04;
        if (setAGr.isEmpty() && c3184C1o.A00.isEmpty()) {
            A0h = C0881AGi.A00;
        } else {
            A0h = C3cG.A0h();
            HashSet hashSetA13 = C60O.A13();
            Iterator itA0i = C3cG.A0i(c3184C1o.A00);
            while (itA0i.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0i);
                Object key = entryA0l.getKey();
                Set setKeySet = ((AbstractMap) entryA0l.getValue()).keySet();
                C7384Etj.A0U(setKeySet);
                for (Object obj : setKeySet) {
                    hashSetA13.add(obj);
                    if (!setAGr.contains(obj)) {
                        AnonymousClass002.A1J(EuD.A02, C3cG.A0r(key, obj), A0h);
                    }
                }
            }
            Iterator it = BGK.A03(hashSetA13, setAGr).iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (!hashSetA13.contains(strA0j) && (strA00 = AbstractC3160C0i.A00(strA0j)) != null) {
                    AnonymousClass002.A1J(EuD.A03, C3cG.A0r(strA00, strA0j), A0h);
                }
            }
        }
        Iterator it2 = A0h.iterator();
        while (it2.hasNext()) {
            HxE hxEA10 = C60Q.A10(it2);
            EuD euD = (EuD) hxEA10.first;
            HxE hxE = (HxE) hxEA10.second;
            int iOrdinal = euD.ordinal();
            if (iOrdinal == 1) {
                A02(ddk, (String) hxE.first, (String) hxE.second, null);
            } else {
                if (iOrdinal != 0) {
                    throw C3cG.A0q();
                }
                NavigableSet<C0J> navigableSetADD = interfaceC3158C0g.ADD((String) hxE.second);
                if (navigableSetADD != null) {
                    Iterator<C0J> it3 = navigableSetADD.iterator();
                    C7384Etj.A0U(it3);
                    while (it3.hasNext()) {
                        File file = it3.next().A05;
                        if (file != null && (path = file.getPath()) != null) {
                            ddk.A03((String) hxE.first, (String) hxE.second, path);
                        }
                    }
                }
            }
        }
    }

    public static final void A02(DDK ddk, String str, String str2, String str3) {
        ConcurrentLinkedQueue<DDN> concurrentLinkedQueue;
        DDN ddn;
        C3184C1o c3184C1o = ddk.A04;
        boolean zA1Y = C60P.A1Y(str, str2);
        synchronized (c3184C1o.A01[str.hashCode() & 31]) {
            if (str3 != null) {
                ConcurrentHashMap<String, ConcurrentHashMap<String, Set<String>>> concurrentHashMap = c3184C1o.A00;
                ConcurrentHashMap<String, Set<String>> concurrentHashMap2 = concurrentHashMap.get(str);
                if (concurrentHashMap2 != null) {
                    Set<String> set = concurrentHashMap2.get(str2);
                    if (set != null) {
                        set.remove(str3);
                        if (set.isEmpty() == zA1Y) {
                            concurrentHashMap2.remove(str2);
                        }
                    }
                    if (concurrentHashMap2.isEmpty() == zA1Y) {
                        concurrentHashMap.remove(str);
                    }
                }
                ddk.A08.remove(str3);
                DDM ddm = new DDM(str, str2, str3);
                concurrentLinkedQueue = ddk.A09;
                ddn = new DDN(EuD.A02, ddm, str, str2);
            } else {
                ConcurrentHashMap<String, ConcurrentHashMap<String, Set<String>>> concurrentHashMap3 = c3184C1o.A00;
                ConcurrentHashMap<String, Set<String>> concurrentHashMap4 = concurrentHashMap3.get(str);
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(str2);
                    if (concurrentHashMap4.isEmpty() == zA1Y) {
                        concurrentHashMap3.remove(str);
                    }
                }
                concurrentLinkedQueue = ddk.A09;
                ddn = new DDN(EuD.A02, null, str, str2);
            }
        }
        concurrentLinkedQueue.add(ddn);
    }

    private final void A03(String str, String str2, String str3) {
        DDM ddm = new DDM(str, str2, str3);
        this.A04.A00(str, str2, str3);
        try {
            synchronized (this.A06) {
                try {
                    SharedPreferences sharedPreferences = C4JM.A00().getSharedPreferences("video_cache_recent", 0);
                    if (sharedPreferences != null) {
                        String string = sharedPreferences.getString("recent_video_ids", null);
                        ArrayList arrayListA0h = (string == null || string.length() == 0) ? C3cG.A0h() : AbstractC0878AGe.A0R(C7BY.A0i(string, new String[]{","}, 0));
                        arrayListA0h.remove(str);
                        arrayListA0h.add(0, str);
                        while (arrayListA0h.size() > 20) {
                            arrayListA0h.remove(arrayListA0h.size() - 1);
                        }
                        sharedPreferences.edit().putString("recent_video_ids", AbstractC06907md.A01(",", arrayListA0h, null)).apply();
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            CFK.A0A("CacheMetadataLookup", "Failed to update recent video IDs", e);
        }
        this.A09.add(new DDN(EuD.A03, ddm, str, str2));
    }

    @Override // X.C0S
    public final void AS3() {
        if (this.A0F.compareAndSet(false, true)) {
            this.A0C.set(true);
            Handler handler = this.A0G;
            if (handler != null) {
                Runnable runnable = this.A07;
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, this.A01);
            }
            Handler handler2 = this.A0G;
            if (handler2 != null) {
                handler2.post(new DDO(this));
            } else {
                A00(this);
            }
        }
    }

    @Override // X.C0S
    public final boolean AbD() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c A[Catch: all -> 0x01d6, TryCatch #4 {, blocks: (B:20:0x0063, B:22:0x006d, B:24:0x0073, B:25:0x007b, B:27:0x0081, B:28:0x0092, B:52:0x0124, B:53:0x0128, B:55:0x012e, B:57:0x013a, B:59:0x0147, B:61:0x0157, B:63:0x015f, B:64:0x0163, B:66:0x0167, B:72:0x0178, B:74:0x017c, B:76:0x0186, B:78:0x0193, B:80:0x019c, B:108:0x01d5, B:79:0x0197, B:69:0x016e, B:92:0x01bd, B:94:0x01c1, B:95:0x01c3, B:98:0x01c9, B:38:0x00d3, B:39:0x00d7, B:41:0x00dd), top: B:122:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0197 A[Catch: all -> 0x01d6, TryCatch #4 {, blocks: (B:20:0x0063, B:22:0x006d, B:24:0x0073, B:25:0x007b, B:27:0x0081, B:28:0x0092, B:52:0x0124, B:53:0x0128, B:55:0x012e, B:57:0x013a, B:59:0x0147, B:61:0x0157, B:63:0x015f, B:64:0x0163, B:66:0x0167, B:72:0x0178, B:74:0x017c, B:76:0x0186, B:78:0x0193, B:80:0x019c, B:108:0x01d5, B:79:0x0197, B:69:0x016e, B:92:0x01bd, B:94:0x01c1, B:95:0x01c3, B:98:0x01c9, B:38:0x00d3, B:39:0x00d7, B:41:0x00dd), top: B:122:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.DDK r18, X.C3157C0f r19) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.DDK.A01(X.DDK, X.C0f):void");
    }

    @Override // X.C0R
    public final void AW3(InterfaceC3158C0g interfaceC3158C0g, C0J c0j) {
        String strA00;
        File file;
        String path;
        AnonymousClass003.A0u(interfaceC3158C0g, c0j);
        String str = c0j.A06;
        if (str == null || (strA00 = AbstractC3160C0i.A00(str)) == null || (file = c0j.A05) == null || (path = file.getPath()) == null) {
            return;
        }
        A03(strA00, str, path);
        WeakReference<InterfaceC3158C0g> weakReference = this.A03;
        if (weakReference == null || weakReference.get() == null) {
            this.A03 = BV4.A0q(interfaceC3158C0g);
        }
    }

    @Override // X.C0S
    public final /* synthetic */ void Acy(String str) {
    }
}
