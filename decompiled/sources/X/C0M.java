package X;

import android.os.ConditionVariable;
import android.os.SystemClock;
import com.facebook.debug.tracer.Tracer;
import com.facebook.google.android.exoplayer2.upstream.cache.Cache$CacheException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;

/* loaded from: classes5.dex */
public final class C0M extends C0a implements InterfaceC3158C0g {
    public static final HashSet<File> A0J = C60O.A13();
    public Cache$CacheException A00;
    public boolean A01;
    public boolean A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public long A07;
    public final C0S A08;
    public final C0C A09;
    public final File A0A;
    public final Object A0B;
    public final ArrayList<C0S> A0C;
    public final HashMap<String, List<C0R>> A0D;
    public final Random A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public volatile boolean A0I;

    private C0D A00(String str, long j, long j2) {
        File file;
        C0H c0hA0D = C0a.A0D(this, str);
        if (c0hA0D == null) {
            return new C0D(null, str, j, j2, -9223372036854775807L);
        }
        while (true) {
            C0D c0dA01 = c0hA0D.A01(j, j2);
            if (!c0dA01.A07 || (file = c0dA01.A05) == null || file.length() == c0dA01.A03) {
                return c0dA01;
            }
            A03(this);
        }
    }

    /* JADX WARN: In static synchronized method top region not synchronized by class const: (r1v0 X.C0M) */
    public static final synchronized void A04(C0M c0m) {
        synchronized (c0m) {
            Cache$CacheException cache$CacheException = c0m.A00;
            if (cache$CacheException != null) {
                throw cache$CacheException;
            }
        }
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void A3e(String str) {
        super.A04.add(str);
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void A4U(C3122Bym c3122Bym, String str) {
        A04(this);
        C0C c0c = this.A09;
        c0c.A03(c3122Bym, str);
        try {
            c0c.A02();
        } catch (IOException e) {
            throw new Cache$CacheException(e);
        }
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void A6a(File file, long j) {
        if (file.exists()) {
            if (j == 0) {
                file.delete();
            } else {
                boolean z = this.A05;
                C0C c0c = this.A09;
                C0D c0dA02 = z ? C0D.A02(c0c, file, file.getName(), j) : C0D.A01(c0c, file, j);
                c0dA02.getClass();
                C0H c0h = c0c.A03.get(c0dA02.A06);
                c0h.getClass();
                long j2 = c0dA02.A04;
                long j3 = c0dA02.A03;
                C1G.A08(c0h.A02(j2, j3));
                long jA00 = AbstractC3127Bys.A00(c0h.A00);
                if (jA00 != -1) {
                    C1G.A08(j2 + j3 <= jA00);
                }
                A02(c0dA02);
                try {
                    c0c.A02();
                    notifyAll();
                } catch (IOException e) {
                    throw new Cache$CacheException(e);
                }
            }
        }
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized long AD9() {
        return this.A07;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0015 A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x000f, B:8:0x0015), top: B:14:0x0001 }] */
    @Override // X.InterfaceC3158C0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized java.util.NavigableSet<X.C0J> ADD(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            X.C0H r0 = X.C0a.A0D(r2, r3)     // Catch: java.lang.Throwable -> L1c
            if (r0 == 0) goto L15
            java.util.TreeSet<X.C0D> r1 = r0.A04     // Catch: java.lang.Throwable -> L1c
            boolean r0 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r0 != 0) goto L15
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L1c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            goto L1a
        L15:
            java.util.TreeSet r0 = new java.util.TreeSet     // Catch: java.lang.Throwable -> L1c
            r0.<init>()     // Catch: java.lang.Throwable -> L1c
        L1a:
            monitor-exit(r2)
            return r0
        L1c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M.ADD(java.lang.String):java.util.NavigableSet");
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized C3121Byl AE3(String str) {
        C0H c0hA0D;
        c0hA0D = C0a.A0D(this, str);
        return c0hA0D != null ? c0hA0D.A00 : C3121Byl.A02;
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized Set<String> AGr() {
        return BV4.A0x(this.A09.A03.keySet());
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011  */
    @Override // X.InterfaceC3158C0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean AOA(java.lang.String r5, long r6, long r8) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 1
            X.C0H r0 = X.C0a.A0D(r4, r5)     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L11
            long r1 = r0.A00(r6, r8)     // Catch: java.lang.Throwable -> L14
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L11
            goto L12
        L11:
            r3 = 0
        L12:
            monitor-exit(r4)
            return r3
        L14:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M.AOA(java.lang.String, long, long):boolean");
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void AaF(C0J c0j) {
        C0C c0c = this.A09;
        C0H c0h = c0c.A03.get(c0j.A06);
        c0h.getClass();
        long j = c0j.A04;
        int i = 0;
        while (true) {
            ArrayList<C0I> arrayList = c0h.A03;
            if (i >= arrayList.size()) {
                throw BV4.A0T();
            }
            if (arrayList.get(i).A01 == j) {
                arrayList.remove(i);
                c0c.A04(c0h.A02);
                notifyAll();
            } else {
                i++;
            }
        }
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized void Aax(C0J c0j) {
        A07(c0j, this);
    }

    @Override // X.InterfaceC3158C0g
    public final synchronized File Ag0(String str, long j, long j2) {
        return Ag1(str, null, j, j2);
    }

    public C0M(C0S c0s, C0C c0c, File file, ArrayList arrayList, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        super(c0s, arrayList, z5, z8);
        this.A0B = C3cG.A0T();
        this.A07 = 0L;
        try {
            C0Q.A01("VPS-SimpleCacheV2Constructor");
            this.A0A = file;
            this.A08 = c0s;
            this.A09 = c0c;
            this.A0D = BV4.A0u();
            this.A0E = new Random();
            this.A0F = c0s.AbD();
            this.A0C = BV4.A0t(arrayList);
            this.A02 = z;
            this.A06 = z2;
            this.A03 = j;
            this.A0H = z6;
            this.A0G = z5;
            this.A01 = z3;
            this.A05 = z4;
            this.A04 = z7;
            ConditionVariable conditionVariable = z7 ? null : new ConditionVariable();
            new C0O(conditionVariable, this).start();
            if (conditionVariable != null) {
                conditionVariable.block();
            }
        } finally {
            C0Q.A00();
        }
    }

    private void A01(C0J c0j, C0D c0d, Integer num) {
        List listA0v = BV6.A0v(c0d.A06, this.A0D);
        if (listA0v != null) {
            int size = listA0v.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((C0R) listA0v.get(size)).AW5(this, c0d, c0j, num);
                }
            }
        }
        this.A08.AW5(this, c0d, c0j, num);
        ArrayList<C0S> arrayList = this.A0C;
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            arrayList.get(i).AW5(this, c0d, c0j, num);
        }
    }

    private void A02(C0D c0d) {
        C0C c0c = this.A09;
        String str = c0d.A06;
        c0c.A00(str).A04.add(c0d);
        this.A07 += c0d.A03;
        List listA0v = BV6.A0v(str, this.A0D);
        if (listA0v != null) {
            int size = listA0v.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((C0R) listA0v.get(size)).AW3(this, c0d);
                }
            }
        }
        this.A08.AW3(this, c0d);
        ArrayList<C0S> arrayList = this.A0C;
        int size2 = arrayList.size();
        for (int i = 0; i < size2; i++) {
            arrayList.get(i).AW3(this, c0d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001b, code lost:
    
        A05(r9, r4, r4.listFiles(), false);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A05(X.C0M r9, java.io.File r10, java.io.File[] r11, boolean r12) {
        /*
            if (r11 == 0) goto L5b
            int r7 = r11.length
            if (r7 == 0) goto L5b
            r6 = 0
            r5 = 0
        L7:
            if (r5 >= r7) goto L60
            r4 = r11[r5]
            java.lang.String r8 = r4.getName()
            if (r12 == 0) goto L40
            boolean r0 = r9.A0H
            if (r0 == 0) goto L25
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L2f
        L1b:
            java.io.File[] r0 = r4.listFiles()
            A05(r9, r4, r0, r6)
        L22:
            int r5 = r5 + 1
            goto L7
        L25:
            r0 = 46
            int r1 = r8.indexOf(r0)
            r0 = -1
            if (r1 != r0) goto L2f
            goto L1b
        L2f:
            java.lang.String r0 = "cached_content_index.exi"
            boolean r0 = r8.startsWith(r0)
            if (r0 != 0) goto L22
            java.lang.String r0 = ".uid"
            boolean r0 = r8.endsWith(r0)
            if (r0 == 0) goto L40
            goto L22
        L40:
            r1 = -1
            boolean r3 = r9.A05
            X.C0C r0 = r9.A09
            if (r3 == 0) goto L52
            X.C0D r0 = X.C0D.A02(r0, r4, r8, r1)
        L4c:
            if (r0 == 0) goto L57
            r9.A02(r0)
            goto L22
        L52:
            X.C0D r0 = X.C0D.A01(r0, r4, r1)
            goto L4c
        L57:
            r4.delete()
            goto L22
        L5b:
            if (r12 != 0) goto L60
            r10.delete()
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M.A05(X.C0M, java.io.File, java.io.File[], boolean):void");
    }

    public static boolean A07(C0J c0j, C0M c0m) {
        C0C c0c = c0m.A09;
        String str = c0j.A06;
        C0H c0h = c0c.A03.get(str);
        if (c0h == null || !c0h.A04.remove(c0j)) {
            return false;
        }
        File file = c0j.A05;
        if (file != null) {
            file.delete();
        }
        c0m.A07 -= c0j.A03;
        ((C0a) c0m).A04.remove(str);
        c0c.A04(c0h.A02);
        c0m.A0I(c0j);
        return true;
    }

    @Override // X.InterfaceC3158C0g
    public final boolean AOC(String str, long j, long j2) {
        if (!this.A02 || this.A0I) {
            return AOA(str, j, j2);
        }
        return false;
    }

    @Override // X.InterfaceC3158C0g
    public final boolean AOe(String str) {
        return super.A04.contains(str);
    }

    @Override // X.InterfaceC3158C0g
    public final C0J AgC(Integer num, String str, long j, long j2) {
        Tracer.A01("SimpleCacheV2.startReadWrite");
        try {
            if (this.A04) {
                A0G();
            }
            synchronized (this) {
                A04(this);
                C0J c0d = this.A05 ? new C0D(null, str, j, -1L, -9223372036854775807L) : C0E.A02(str, j);
                long jElapsedRealtime = SystemClock.elapsedRealtime() + j2;
                boolean zA1M = AnonymousClass002.A1M((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1)));
                while (true) {
                    String str2 = c0d.A06;
                    long j3 = c0d.A04;
                    long j4 = c0d.A03;
                    C0J c0jAgD = AgD(num, str2, j3, j4);
                    if (c0jAgD != null) {
                        return c0jAgD;
                    }
                    if (this.A06 && zA1M) {
                        HashMap<String, C0H> map = this.A09.A03;
                        C0H c0h = map.get(str2);
                        if (c0h != null) {
                            C0D c0dA01 = c0h.A01(j3, j4);
                            long j5 = this.A03;
                            if (j5 > 0 && num != C79.A00 && num != C79.A0K && c0dA01.A08 > 0 && SystemClock.elapsedRealtime() - c0dA01.A08 > j5) {
                                break;
                            }
                            c0dA01.A00++;
                        }
                        wait();
                        C0H c0h2 = map.get(str2);
                        if (c0h2 != null) {
                            c0h2.A01(j3, j4).A00--;
                        }
                    } else {
                        long jA04 = C3cH.A04(jElapsedRealtime);
                        C0H c0hA0D = C0a.A0D(this, str2);
                        if (c0hA0D != null) {
                            long j6 = c0hA0D.A01(j3, j4).A01;
                            if (j6 > 0) {
                                long jA042 = C3cG.A04(j6);
                                if (jA042 > j2) {
                                    CFK.A06("SimpleCacheV2", FGI.A0L("lock expired after ", jA04, "ms for span: ", str2));
                                    break;
                                }
                                jA04 = j2 - jA042;
                            }
                        }
                        if (!zA1M) {
                            if (jA04 <= 0) {
                                break;
                            }
                        } else {
                            jA04 = 0;
                        }
                        wait(jA04);
                    }
                }
                return null;
            }
        } finally {
            Tracer.A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    @Override // X.InterfaceC3158C0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0J AgD(java.lang.Integer r18, java.lang.String r19, long r20, long r22) throws com.facebook.google.android.exoplayer2.upstream.cache.Cache$CacheException {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0M.AgD(java.lang.Integer, java.lang.String, long, long):X.C0J");
    }

    public static void A03(C0M c0m) {
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = Collections.unmodifiableCollection(c0m.A09.A03.values()).iterator();
        while (it.hasNext()) {
            Iterator<C0D> it2 = ((C0H) it.next()).A04.iterator();
            while (it2.hasNext()) {
                C0D next = it2.next();
                File file = next.A05;
                if (file != null && file.length() != next.A03) {
                    arrayListA0h.add(next);
                }
            }
        }
        for (int i = 0; i < arrayListA0h.size(); i++) {
            A07((C0J) arrayListA0h.get(i), c0m);
        }
    }

    public static void A06(File file) throws Cache$CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strA0a = AnonymousClass007.A0a("Failed to create cache directory: ", file);
        CFK.A04("SimpleCacheV2", strA0a);
        throw new Cache$CacheException(strA0a);
    }
}
