package X;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.exoplayer.NotImplementedException;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class C0N extends C0a {
    public int A00;
    public List<File> A01;
    public boolean A02;
    public boolean A03;
    public long A04;
    public C0C A05;
    public boolean A06;
    public boolean A07;
    public final File A08;
    public final Object A09;
    public final HashMap<String, Long> A0A;
    public final HashMap<String, C0J> A0B;
    public final Random A0C;
    public final Set<String> A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final Handler A0J;
    public final Set<String> A0K;
    public final ConcurrentHashMap<String, CountDownLatch> A0L;
    public final AtomicBoolean A0M;
    public volatile boolean A0N;

    private synchronized C0C A03() {
        C0C c0c;
        c0c = this.A05;
        if (c0c == null) {
            c0c = new C0C(this.A08);
            this.A05 = c0c;
        }
        if (!this.A06) {
            try {
                c0c.A01();
            } catch (IOException unused) {
                CFK.A06("SimpleCache", "Failed to initialize content metadata index");
            }
            this.A06 = true;
        }
        return c0c;
    }

    private synchronized void A04() {
        C0C c0c = this.A05;
        if (c0c != null) {
            try {
                c0c.A02();
            } catch (IOException unused) {
                CFK.A06("SimpleCache", "Failed to store content metadata index");
            }
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r11v0 X.C0N) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0016, B:8:0x001b, B:10:0x0021, B:12:0x0027, B:14:0x002a, B:16:0x002f, B:25:0x004b, B:27:0x004f, B:29:0x0059, B:31:0x0065, B:33:0x006e, B:32:0x0069, B:24:0x0046, B:19:0x0039), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0016, B:8:0x001b, B:10:0x0021, B:12:0x0027, B:14:0x002a, B:16:0x002f, B:25:0x004b, B:27:0x004f, B:29:0x0059, B:31:0x0065, B:33:0x006e, B:32:0x0069, B:24:0x0046, B:19:0x0039), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069 A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0016, B:8:0x001b, B:10:0x0021, B:12:0x0027, B:14:0x002a, B:16:0x002f, B:25:0x004b, B:27:0x004f, B:29:0x0059, B:31:0x0065, B:33:0x006e, B:32:0x0069, B:24:0x0046, B:19:0x0039), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006e A[Catch: all -> 0x0078, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000f, B:6:0x0016, B:8:0x001b, B:10:0x0021, B:12:0x0027, B:14:0x002a, B:16:0x002f, B:25:0x004b, B:27:0x004f, B:29:0x0059, B:31:0x0065, B:33:0x006e, B:32:0x0069, B:24:0x0046, B:19:0x0039), top: B:42:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean A0B(X.C0N r11, java.io.File r12, boolean r13) {
        /*
            monitor-enter(r11)
            r4 = r12
            java.lang.String r2 = r12.getName()     // Catch: java.lang.Throwable -> L78
            X.Dlz r0 = X.EnumC5618Dlz.A1p     // Catch: java.lang.Throwable -> L78
            boolean r0 = X.AbstractC5653Dmh.A03(r0)     // Catch: java.lang.Throwable -> L78
            r9 = 1
            if (r0 == 0) goto L16
            java.lang.String r0 = "cached_content_index.exi"
            boolean r0 = r2.startsWith(r0)     // Catch: java.lang.Throwable -> L78
            goto L72
        L16:
            boolean r0 = r11.A0I     // Catch: java.lang.Throwable -> L78
            r3 = 0
            if (r0 == 0) goto L39
            boolean r0 = r12.isDirectory()     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L43
        L21:
            java.io.File[] r3 = r12.listFiles()     // Catch: java.lang.Throwable -> L78
            if (r3 == 0) goto L74
            int r2 = r3.length     // Catch: java.lang.Throwable -> L78
            if (r2 != 0) goto L2e
            r12.delete()     // Catch: java.lang.Throwable -> L78
            goto L74
        L2e:
            r1 = 0
        L2f:
            r0 = r3[r1]     // Catch: java.lang.Throwable -> L78
            A0B(r11, r0, r9)     // Catch: java.lang.Throwable -> L78
            int r1 = r1 + 1
            if (r1 >= r2) goto L74
            goto L2f
        L39:
            r0 = 46
            int r1 = r2.indexOf(r0)     // Catch: java.lang.Throwable -> L78
            r0 = -1
            if (r1 != r0) goto L43
            goto L21
        L43:
            if (r13 == 0) goto L46
            goto L4b
        L46:
            long r5 = r12.length()     // Catch: java.lang.Throwable -> L78
            goto L59
        L4b:
            boolean r0 = r11.A0G     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L69
            long r5 = A00(r2)     // Catch: java.lang.Throwable -> L78
            r1 = -1
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L69
        L59:
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = r9
            X.C0J r0 = X.C0E.A00(r4, r5, r7, r9, r10)     // Catch: java.lang.Throwable -> L78
            if (r0 != 0) goto L6e
            r12.delete()     // Catch: java.lang.Throwable -> L78
            goto L76
        L69:
            long r5 = r12.length()     // Catch: java.lang.Throwable -> L78
            goto L59
        L6e:
            A05(r0, r11)     // Catch: java.lang.Throwable -> L78
            goto L74
        L72:
            if (r0 == 0) goto L16
        L74:
            monitor-exit(r11)
            return r9
        L76:
            monitor-exit(r11)
            return r3
        L78:
            r0 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L78
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0N.A0B(X.C0N, java.io.File, boolean):boolean");
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void A3e(String str) {
        super.A04.add(str);
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void A4U(C3122Bym c3122Bym, String str) {
        if (!A0C(str)) {
            throw new NotImplementedException();
        }
        A03().A03(c3122Bym, str);
        A04();
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void A6a(File file, long j) {
        AbstractMap<String, NavigableSet<C0J>> abstractMap;
        NavigableSet<C0J> navigableSet;
        C0J c0jFloor;
        long jA00 = A00(file.getName());
        C0J c0jA00 = jA00 != -1 ? C0E.A00(file, jA00, -9223372036854775807L, true, true) : C0E.A00(file, 0L, 0L, false, false);
        C1G.A08(AnonymousClass002.A1X(c0jA00));
        HashMap<String, C0J> map = this.A0B;
        String str = c0jA00.A06;
        C1G.A08(map.containsKey(str));
        if (file.exists()) {
            if (j == 0) {
                file.delete();
            } else if (!this.A0G || (navigableSet = (abstractMap = super.A01).get(str)) == null || (c0jFloor = navigableSet.floor(c0jA00)) == null || c0jFloor.A04 != c0jA00.A04) {
                A05(c0jA00, this);
                notifyAll();
            } else {
                Object obj = c0jA00.A05;
                File file2 = c0jFloor.A05;
                if (!obj.equals(file2) || c0jA00.A03 != c0jFloor.A03) {
                    abstractMap.get(str).remove(c0jFloor);
                    super.A06 -= c0jFloor.A03;
                    if (file2 != null && !file2.equals(obj)) {
                        file2.delete();
                    }
                    A0I(c0jFloor);
                    A05(c0jA00, this);
                }
                notifyAll();
            }
        }
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized long AD9() {
        return super.A06;
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized NavigableSet<C0J> ADD(String str) {
        NavigableSet<C0J> navigableSet;
        navigableSet = super.A01.get(str);
        return (navigableSet == null || navigableSet.isEmpty()) ? new TreeSet() : new TreeSet((SortedSet) navigableSet);
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized C3121Byl AE3(String str) {
        C0H c0h;
        if (!A0C(str)) {
            throw new NotImplementedException();
        }
        c0h = A03().A03.get(str);
        return c0h != null ? c0h.A00 : C3121Byl.A02;
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized Set<String> AGr() {
        return BV4.A0x(super.A01.keySet());
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized boolean AOA(String str, long j, long j2) {
        C0J c0jFloor;
        NavigableSet<C0J> navigableSet = super.A01.get(str);
        if (navigableSet != null && (c0jFloor = navigableSet.floor(C0E.A02(str, j))) != null) {
            long jMax = c0jFloor.A04 + c0jFloor.A03;
            if (jMax > j) {
                long j3 = j + j2;
                if (jMax < j3) {
                    for (C0J c0j : navigableSet.tailSet(c0jFloor, false)) {
                        long j4 = c0j.A04;
                        if (j4 > jMax) {
                            break;
                        }
                        jMax = Math.max(jMax, j4 + c0j.A03);
                        if (jMax >= j3) {
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void AaF(C0J c0j) {
        C1G.A08(AnonymousClass002.A1Z(c0j, this.A0B.remove(c0j.A06)));
        notifyAll();
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void Aax(C0J c0j) {
        AbstractMap<String, NavigableSet<C0J>> abstractMap = super.A01;
        String str = c0j.A06;
        NavigableSet<C0J> navigableSet = abstractMap.get(str);
        long j = super.A06;
        long j2 = c0j.A03;
        super.A06 = j - j2;
        if (navigableSet == null || !navigableSet.remove(c0j)) {
            super.A00.AT3("removeSpan failed", str, (int) c0j.A04, (int) j2);
        }
        File file = c0j.A05;
        if (file != null) {
            List<File> list = this.A01;
            if (list != null) {
                list.add(file);
            } else {
                file.delete();
            }
        }
        if (navigableSet != null && navigableSet.isEmpty()) {
            abstractMap.remove(str);
            super.A04.remove(str);
            this.A0A.remove(str);
            if (A0C(str)) {
                A03().A04(str);
                A04();
            }
        }
        A0I(c0j);
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized File Ag0(String str, long j, long j2) {
        return Ag1(str, null, j, j2);
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized C0J AgD(Integer num, String str, long j, long j2) {
        return A02(C0E.A02(str, j), num);
    }

    public C0N(Handler handler, C0S c0s, File file, ArrayList arrayList, Set set, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        super(c0s, arrayList, z4, z9);
        this.A09 = C3cG.A0T();
        this.A0M = C60O.A1E();
        this.A0L = C60O.A1C();
        this.A0K = C60O.A18();
        this.A0H = z4;
        this.A0I = z5;
        try {
            C0Q.A01("VPS-SimpleCacheConstructor");
            this.A07 = z2;
            this.A08 = file;
            this.A0B = BV4.A0u();
            this.A0A = BV4.A0u();
            this.A0C = new Random();
            this.A02 = z3;
            this.A00 = i;
            this.A03 = z;
            this.A04 = j;
            this.A0J = handler;
            this.A0F = z7;
            this.A0E = z8;
            this.A0G = z10;
            set = set == null ? Collections.EMPTY_SET : set;
            this.A0D = set;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                this.A0L.put((String) it.next(), new CountDownLatch(1));
            }
            if (!z6) {
                A0F();
            }
        } finally {
            C0Q.A00();
        }
    }

    private C0J A01(C0J c0j) {
        String str = c0j.A06;
        long j = c0j.A04;
        NavigableSet<C0J> navigableSet = super.A01.get(str);
        if (navigableSet != null) {
            C0J c0jFloor = navigableSet.floor(c0j);
            if (c0jFloor != null) {
                long j2 = c0jFloor.A04;
                if (j2 <= j) {
                    long j3 = c0jFloor.A03;
                    if (j < j2 + j3) {
                        File file = c0jFloor.A05;
                        if (file != null) {
                            if (this.A0G) {
                                if (file.length() >= j3) {
                                    return c0jFloor;
                                }
                            } else if (file.exists()) {
                                return c0jFloor;
                            }
                        }
                        if (this.A0G && file != null && file.exists()) {
                            Aax(c0jFloor);
                            A0J(c0jFloor, "file_removed");
                        } else {
                            A08(this);
                        }
                        return A01(c0j);
                    }
                }
            }
            C0J c0jCeiling = navigableSet.ceiling(c0j);
            if (c0jCeiling != null) {
                return new C0J(null, str, j, c0jCeiling.A04 - j, -1L, false);
            }
        }
        return new C0J(null, str, j, -1L, -1L, false);
    }

    private synchronized C0J A02(C0J c0j, Integer num) {
        try {
            C0Q.A01("exo-startReadWriteNonBlocking");
            C0J c0jA01 = A01(c0j);
            if (!c0jA01.A07) {
                HashMap<String, C0J> map = this.A0B;
                String str = c0j.A06;
                if (map.containsKey(str)) {
                    return null;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c0jA01.A01 = jElapsedRealtime;
                c0jA01.A08 = jElapsedRealtime;
                map.put(str, c0jA01);
                return c0jA01;
            }
            AbstractMap<String, NavigableSet<C0J>> abstractMap = super.A01;
            String str2 = c0jA01.A06;
            NavigableSet<C0J> navigableSet = abstractMap.get(str2);
            if (navigableSet == null || !navigableSet.remove(c0jA01)) {
                C0S c0s = super.A00;
                int i = (int) c0jA01.A04;
                int i2 = (int) c0jA01.A03;
                c0s.AT3("startReadWriteNonBlocking", str2, i, i2);
                Iterator<C0S> it = super.A02.iterator();
                while (it.hasNext()) {
                    it.next().AT3("startReadWriteNonBlocking", str2, i, i2);
                }
            }
            C0J c0jA012 = c0jA01;
            File file = c0jA01.A05;
            File parentFile = file != null ? file.getParentFile() : null;
            if (!this.A0G || file == null || parentFile == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                File parentFile2 = file.getParentFile();
                long j = c0jA01.A04;
                StringBuilder sbA0g = C3cG.A0g(str2);
                BV7.A1H(".", sbA0g, j);
                sbA0g.append(jCurrentTimeMillis);
                File fileA0O = C3cG.A0O(parentFile2, AnonymousClass001.A0v(".v2.exo", sbA0g));
                file.renameTo(fileA0O);
                c0jA012 = C0E.A01(fileA0O, str2, j, jCurrentTimeMillis, 0L);
            } else {
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                long j2 = c0jA01.A04;
                long j3 = c0jA01.A03;
                StringBuilder sbA0g2 = C3cG.A0g(str2);
                BV7.A1H(".", sbA0g2, j2);
                sbA0g2.append(jCurrentTimeMillis2);
                sbA0g2.append(".fl");
                sbA0g2.append(j3);
                File fileA0O2 = C3cG.A0O(parentFile, AnonymousClass001.A0v(".exo", sbA0g2));
                if (fileA0O2.getName().getBytes(StandardCharsets.UTF_8).length > 255) {
                    StringBuilder sbA0g3 = C3cG.A0g(str2);
                    BV7.A1H(".", sbA0g3, j2);
                    sbA0g3.append(jCurrentTimeMillis2);
                    fileA0O2 = C3cG.A0O(parentFile, AnonymousClass001.A0v(".v2.exo", sbA0g3));
                }
                if (file.renameTo(fileA0O2)) {
                    c0jA012 = C0E.A01(fileA0O2, str2, j2, jCurrentTimeMillis2, j3);
                }
            }
            if (navigableSet != null) {
                navigableSet.add(c0jA012);
            }
            List listA0z = BV4.A0z(str2, super.A03);
            if (listA0z != null) {
                int size = listA0z.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    ((C0R) listA0z.get(size)).AW5(this, c0jA01, c0jA012, num);
                }
            }
            super.A00.AW5(this, c0jA01, c0jA012, num);
            Iterator<C0S> it2 = super.A02.iterator();
            while (it2.hasNext()) {
                it2.next().AW5(this, c0jA01, c0jA012, num);
            }
            return c0jA012;
        } finally {
            C0Q.A00();
        }
    }

    public static void A05(C0J c0j, C0N c0n) {
        AbstractMap<String, NavigableSet<C0J>> abstractMap = ((C0a) c0n).A01;
        String str = c0j.A06;
        NavigableSet<C0J> treeSet = abstractMap.get(str);
        if (treeSet == null) {
            treeSet = new TreeSet<>();
            abstractMap.put(str, treeSet);
        }
        treeSet.add(c0j);
        ((C0a) c0n).A06 += c0j.A03;
        List listA0z = BV4.A0z(str, ((C0a) c0n).A03);
        if (listA0z != null) {
            int size = listA0z.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((C0R) listA0z.get(size)).AW3(c0n, c0j);
                }
            }
        }
        ((C0a) c0n).A00.AW3(c0n, c0j);
        Iterator<C0S> it = ((C0a) c0n).A02.iterator();
        while (it.hasNext()) {
            it.next().AW3(c0n, c0j);
        }
    }

    public static void A06(C0N c0n) {
        Object obj = c0n.A09;
        synchronized (obj) {
            c0n.A0N = true;
            obj.notifyAll();
        }
    }

    public static void A07(C0N c0n) {
        Iterator<C0S> it = ((C0a) c0n).A02.iterator();
        while (it.hasNext()) {
            it.next().AS3();
        }
    }

    public static final void A08(C0N c0n) {
        Iterator itA0i = C3cG.A0i(((C0a) c0n).A01);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Iterator it = ((NavigableSet) entryA0l.getValue()).iterator();
            boolean z = true;
            while (it.hasNext()) {
                C0J c0j = (C0J) it.next();
                File file = c0j.A05;
                if (file == null || !file.exists()) {
                    it.remove();
                    if (c0j.A07) {
                        ((C0a) c0n).A06 -= c0j.A03;
                    }
                    c0n.A0I(c0j);
                } else {
                    z = false;
                }
            }
            if (z) {
                if (A0C(C60O.A0t(entryA0l))) {
                    c0n.A03().A04(C60O.A0t(entryA0l));
                    c0n.A04();
                }
                itA0i.remove();
            }
        }
    }

    public static boolean A0C(String str) {
        return AbstractC5653Dmh.A03(EnumC5618Dlz.A1p) && str != null && str.startsWith("ig_subtitle_");
    }

    @Override // X.C0a
    public final void A0F() {
        if (C3cI.A1W(this.A0M)) {
            C0P c0p = new C0P(this);
            c0p.setName("SimpleCache-loadCacheDir");
            c0p.start();
        }
    }

    @Override // X.InterfaceC3158C0g
    public final boolean AOC(String str, long j, long j2) {
        if (!this.A03 || this.A0N) {
            return AOA(str, j, j2);
        }
        return false;
    }

    @Override // X.InterfaceC3158C0g
    public final boolean AOe(String str) {
        return super.A04.contains(str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x009f, code lost:
    
        X.CFK.A06("SimpleCache", X.FGI.A0L("lock expired after ", r2, "ms for span: ", r7));
     */
    @Override // X.InterfaceC3158C0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized X.C0J AgC(java.lang.Integer r19, java.lang.String r20, long r21, long r23) {
        /*
            r18 = this;
            r6 = r18
            monitor-enter(r6)
            java.lang.String r0 = "SimpleCache.startReadWrite"
            com.facebook.debug.tracer.Tracer.A01(r0)     // Catch: java.lang.Throwable -> Lcc
            r2 = r20
            r0 = r21
            X.C0J r1 = X.C0E.A02(r2, r0)     // Catch: java.lang.Throwable -> Lc7
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lc7
            long r17 = r17 + r23
            r16 = 1
            r14 = 0
            int r0 = (r23 > r14 ? 1 : (r23 == r14 ? 0 : -1))
            boolean r13 = X.AnonymousClass002.A1M(r0)
        L20:
            r2 = r19
            X.C0J r0 = r6.A02(r1, r2)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L2a
            goto Lbd
        L2a:
            boolean r0 = r6.A07     // Catch: java.lang.Throwable -> Lc7
            r12 = 0
            if (r0 == 0) goto L7d
            if (r13 == 0) goto L7d
            java.util.HashMap<java.lang.String, X.C0J> r8 = r6.A0B     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = r1.A06     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r8.containsKey(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L67
            java.lang.Object r9 = r8.get(r7)     // Catch: java.lang.Throwable -> Lc7
            X.C0J r9 = (X.C0J) r9     // Catch: java.lang.Throwable -> Lc7
            long r4 = r6.A04     // Catch: java.lang.Throwable -> Lc7
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto L61
            java.lang.Integer r0 = X.C79.A00     // Catch: java.lang.Throwable -> Lc7
            if (r2 == r0) goto L61
            java.lang.Integer r0 = X.C79.A0K     // Catch: java.lang.Throwable -> Lc7
            if (r2 == r0) goto L61
            long r2 = r9.A08     // Catch: java.lang.Throwable -> Lc7
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 <= 0) goto L61
            long r10 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lc7
            long r2 = r9.A08     // Catch: java.lang.Throwable -> Lc7
            long r10 = r10 - r2
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 <= 0) goto L61
            goto Lc2
        L61:
            int r0 = r9.A00     // Catch: java.lang.Throwable -> Lc7
            int r0 = r0 + 1
            r9.A00 = r0     // Catch: java.lang.Throwable -> Lc7
        L67:
            r6.wait()     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r8.containsKey(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto L20
            java.lang.Object r2 = r8.get(r7)     // Catch: java.lang.Throwable -> Lc7
            X.C0J r2 = (X.C0J) r2     // Catch: java.lang.Throwable -> Lc7
            int r0 = r2.A00     // Catch: java.lang.Throwable -> Lc7
            int r0 = r0 - r16
            r2.A00 = r0     // Catch: java.lang.Throwable -> Lc7
            goto L20
        L7d:
            long r2 = X.C3cH.A04(r17)     // Catch: java.lang.Throwable -> Lc7
            java.util.HashMap<java.lang.String, X.C0J> r4 = r6.A0B     // Catch: java.lang.Throwable -> Lc7
            java.lang.String r7 = r1.A06     // Catch: java.lang.Throwable -> Lc7
            boolean r0 = r4.containsKey(r7)     // Catch: java.lang.Throwable -> Lc7
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r4.get(r7)     // Catch: java.lang.Throwable -> Lc7
            X.C0J r0 = (X.C0J) r0     // Catch: java.lang.Throwable -> Lc7
            long r4 = r0.A01     // Catch: java.lang.Throwable -> Lc7
            int r0 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r0 <= 0) goto Laf
            long r4 = X.C3cG.A04(r4)     // Catch: java.lang.Throwable -> Lc7
            int r0 = (r4 > r23 ? 1 : (r4 == r23 ? 0 : -1))
            if (r0 <= 0) goto Lad
            java.lang.String r4 = "SimpleCache"
            java.lang.String r1 = "lock expired after "
            java.lang.String r0 = "ms for span: "
            java.lang.String r0 = X.FGI.A0L(r1, r2, r0, r7)     // Catch: java.lang.Throwable -> Lc7
            X.CFK.A06(r4, r0)     // Catch: java.lang.Throwable -> Lc7
            goto Lc2
        Lad:
            long r2 = r23 - r4
        Laf:
            if (r13 != 0) goto Lb6
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 > 0) goto Lb8
            goto Lc2
        Lb6:
            r2 = 0
        Lb8:
            r6.wait(r2)     // Catch: java.lang.Throwable -> Lc7
            goto L20
        Lbd:
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r6)
            return r0
        Lc2:
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> Lcc
            monitor-exit(r6)
            return r12
        Lc7:
            r0 = move-exception
            com.facebook.debug.tracer.Tracer.A00()     // Catch: java.lang.Throwable -> Lcc
            throw r0     // Catch: java.lang.Throwable -> Lcc
        Lcc:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lcc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0N.AgC(java.lang.Integer, java.lang.String, long, long):X.C0J");
    }

    public static long A00(String str) throws NumberFormatException {
        int iLastIndexOf;
        int iLastIndexOf2;
        int length = str.length();
        int i = length - 4;
        if (i > 0 && str.endsWith(".exo") && (iLastIndexOf2 = (iLastIndexOf = str.lastIndexOf(46, length - 5)) + 1) != 0 && str.startsWith("fl", iLastIndexOf2)) {
            try {
                long j = Long.parseLong(str.substring(iLastIndexOf + 3, i));
                if (j > 0) {
                    return j;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return -1L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        A09(r18, r11, r20, r21, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A09(X.C0N r18, java.io.File r19, java.util.List r20, java.util.List r21, boolean r22) throws java.lang.NumberFormatException {
        /*
            java.io.File[] r4 = r19.listFiles()
            if (r4 == 0) goto Le
            if (r22 != 0) goto Lf
            int r0 = r4.length
            if (r0 != 0) goto Lf
            r19.delete()
        Le:
            return
        Lf:
            X.Dlz r0 = X.EnumC5618Dlz.A1p
            boolean r10 = X.AbstractC5653Dmh.A03(r0)
            int r3 = r4.length
            r2 = 0
            r1 = 0
        L18:
            if (r1 >= r3) goto Le
            r11 = r4[r1]
            java.lang.String r8 = r11.getName()
            r9 = r18
            if (r22 == 0) goto L2f
            java.util.Set<java.lang.String> r0 = r9.A0D
            boolean r0 = r0.contains(r8)
            if (r0 == 0) goto L2f
        L2c:
            int r1 = r1 + 1
            goto L18
        L2f:
            if (r10 == 0) goto L3a
            java.lang.String r0 = "cached_content_index.exi"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto L3a
            goto L2c
        L3a:
            boolean r0 = r9.A0I
            r6 = r20
            r5 = r21
            if (r0 == 0) goto L4c
            boolean r0 = r11.isDirectory()
            if (r0 == 0) goto L56
        L48:
            A09(r9, r11, r6, r5, r2)
            goto L2c
        L4c:
            r0 = 46
            int r7 = r8.indexOf(r0)
            r0 = -1
            if (r7 != r0) goto L56
            goto L48
        L56:
            boolean r0 = r9.A0G
            if (r0 == 0) goto L77
            long r12 = A00(r8)
            r7 = -1
            int r0 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r0 == 0) goto L77
        L64:
            r16 = 1
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r16
            X.C0J r0 = X.C0E.A00(r11, r12, r14, r16, r17)
            if (r0 != 0) goto L7c
            r5.add(r11)
            goto L2c
        L77:
            long r12 = r11.length()
            goto L64
        L7c:
            r6.add(r0)
            goto L2c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0N.A09(X.C0N, java.io.File, java.util.List, java.util.List, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        A0A(r7, r2, false);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A0A(X.C0N r7, java.io.File r8, boolean r9) {
        /*
            java.io.File[] r6 = r8.listFiles()
            if (r6 == 0) goto Le
            if (r9 != 0) goto Lf
            int r0 = r6.length
            if (r0 != 0) goto Lf
            r8.delete()
        Le:
            return
        Lf:
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L12:
            if (r3 >= r5) goto Le
            r2 = r6[r3]
            java.lang.String r1 = r2.getName()
            if (r9 == 0) goto L27
            java.util.Set<java.lang.String> r0 = r7.A0D
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L27
        L24:
            int r3 = r3 + 1
            goto L12
        L27:
            boolean r0 = r7.A0I
            if (r0 == 0) goto L35
            boolean r0 = r2.isDirectory()
            if (r0 == 0) goto L3f
        L31:
            A0A(r7, r2, r4)
            goto L24
        L35:
            r0 = 46
            int r1 = r1.indexOf(r0)
            r0 = -1
            if (r1 != r0) goto L3f
            goto L31
        L3f:
            r0 = 1
            A0B(r7, r2, r0)
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0N.A0A(X.C0N, java.io.File, boolean):void");
    }
}
