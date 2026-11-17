package X;

import com.facebook.debug.tracer.Tracer;
import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes5.dex */
public abstract class C0a implements InterfaceC3158C0g {
    public final C0S A00;
    public final List<C0S> A02;
    public final boolean A05;
    public volatile long A06 = 0;
    public final AbstractMap<String, NavigableSet<C0J>> A01 = BV4.A0u();
    public final Set<String> A04 = C60O.A13();
    public final Map<String, List<C0R>> A03 = BV4.A0u();

    public void A0F() {
    }

    public static C0H A0D(C0M c0m, Object obj) {
        return c0m.A09.A03.get(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long A0E(java.lang.String r3) {
        /*
            r2 = this;
            boolean r0 = r2 instanceof X.C0M
            if (r0 == 0) goto L18
            r0 = r2
            X.C0M r0 = (X.C0M) r0
            monitor-enter(r2)
            X.C0H r0 = A0D(r0, r3)     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L2b
            X.Byl r0 = r0.A00     // Catch: java.lang.Throwable -> L15
            long r0 = X.AbstractC3127Bys.A00(r0)     // Catch: java.lang.Throwable -> L15
            goto L2d
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
        L18:
            r0 = r2
            X.C0N r0 = (X.C0N) r0
            monitor-enter(r2)
            java.util.HashMap<java.lang.String, java.lang.Long> r0 = r0.A0A     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L2f
            java.lang.Long r0 = (java.lang.Long) r0     // Catch: java.lang.Throwable -> L2f
            if (r0 == 0) goto L2b
            long r0 = r0.longValue()     // Catch: java.lang.Throwable -> L2f
            goto L2d
        L2b:
            r0 = -1
        L2d:
            monitor-exit(r2)
            return r0
        L2f:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0a.A0E(java.lang.String):long");
    }

    public final void A0G() {
        if (this instanceof C0M) {
            C0M c0m = (C0M) this;
            Object obj = c0m.A0B;
            synchronized (obj) {
                if (!c0m.A0I) {
                    obj.wait();
                }
            }
            return;
        }
        C0N c0n = (C0N) this;
        Object obj2 = c0n.A09;
        synchronized (obj2) {
            if (!c0n.A0N) {
                obj2.wait();
            }
        }
    }

    public final void A0H(C0S c0s) {
        if (this instanceof C0M) {
            C0M c0m = (C0M) this;
            if (c0m.A0G) {
                c0m.A0C.add(c0s);
                return;
            } else {
                synchronized (this) {
                    c0m.A0C.add(c0s);
                }
                return;
            }
        }
        C0N c0n = (C0N) this;
        if (c0n.A0H) {
            ((C0a) c0n).A02.add(c0s);
        } else {
            synchronized (this) {
                ((C0a) c0n).A02.add(c0s);
            }
        }
    }

    public final void A0I(C0J c0j) {
        if (!(this instanceof C0M)) {
            List listA0z = BV4.A0z(c0j.A06, this.A03);
            if (listA0z != null) {
                int size = listA0z.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        ((C0R) listA0z.get(size)).AW4(this, c0j);
                    }
                }
            }
            this.A00.AW4(this, c0j);
            Iterator<C0S> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().AW4(this, c0j);
            }
            return;
        }
        C0M c0m = (C0M) this;
        List listA0v = BV6.A0v(c0j.A06, c0m.A0D);
        if (listA0v != null) {
            int size2 = listA0v.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                } else {
                    ((C0R) listA0v.get(size2)).AW4(c0m, c0j);
                }
            }
        }
        c0m.A08.AW4(c0m, c0j);
        ArrayList<C0S> arrayList = c0m.A0C;
        int size3 = arrayList.size();
        for (int i = 0; i < size3; i++) {
            arrayList.get(i).AW4(c0m, c0j);
        }
    }

    public final void A0J(C0J c0j, String str) {
        String str2;
        C3156C0e c3156C0e;
        for (C0S c0s : this.A02) {
            if (c0s instanceof C0b) {
                C0b c0b = (C0b) c0s;
                C7384Etj.A0Y(c0j, 1);
                Tracer.A01("CacheInstrumentationListener.onSpanRemoved");
                try {
                    if (c0b.A01 != null && (str2 = c0j.A06) != null) {
                        String str3 = "unknown";
                        String strName = "UNKNOWN";
                        C3155C0d c3155C0d = c0b.A00;
                        String strName2 = null;
                        if (c3155C0d != null) {
                            synchronized (c3155C0d) {
                                c3156C0e = c3155C0d.A00.get(c3155C0d.A01.floor(c0j));
                            }
                        } else {
                            c3156C0e = null;
                        }
                        if (c3156C0e != null) {
                            C3159C0h c3159C0h = c3156C0e.A00;
                            str3 = c3159C0h.A02;
                            if (str3 == null) {
                                str3 = "";
                            }
                            strName = c3159C0h.A00.name();
                            strName2 = c3159C0h.A01.name();
                        }
                        C3164C0p c3164C0p = c0b.A01;
                        if (c3164C0p != null) {
                            String str4 = c0b.A02;
                            if (str4 == null) {
                                str4 = "";
                            }
                            long j = c0j.A04;
                            long j2 = c0j.A03;
                            G0U<? super C0J, Boolean> g0u = c0b.A03;
                            c3164C0p.A01.add(new BYO(BYR.SPAN_REMOVED, null, str4, str3, null, strName, null, str2, null, str, null, null, strName2, null, j, j2, 0L, 0L, g0u != null ? AnonymousClass003.A1X(c0j, g0u) : false));
                        }
                    }
                } finally {
                    Tracer.A00();
                }
            }
        }
    }

    public final void A0K(String str, long j) {
        if (this instanceof C0M) {
            C0M c0m = (C0M) this;
            synchronized (this) {
                C3122Bym c3122Bym = new C3122Bym();
                C3122Bym.A01(c3122Bym, j);
                try {
                    C0C c0c = c0m.A09;
                    c0c.A03(c3122Bym, str);
                    c0c.A02();
                } catch (IOException e) {
                    CFK.A0A("SimpleCacheV2", FGI.A0M("Failed to store total content length for ", str), e);
                }
            }
        }
        C0N c0n = (C0N) this;
        synchronized (this) {
            BV4.A1F(str, c0n.A0A, j);
        }
    }

    @Override // X.InterfaceC3158C0g
    public final /* synthetic */ File Ag1(String str, String str2, long j, long j2) {
        File fileA0O;
        File fileA0O2;
        File fileA0O3;
        if (this instanceof C0M) {
            C0M c0m = (C0M) this;
            synchronized (this) {
                C0M.A04(c0m);
                C0H c0hA0D = A0D(c0m, str);
                c0hA0D.getClass();
                C1G.A08(c0hA0D.A02(j, j2));
                File file = c0m.A0A;
                if (!file.exists()) {
                    C0M.A06(file);
                    C0M.A03(c0m);
                }
                c0m.A08.AWA(c0m, str, j, j2);
                if (str2 != null) {
                    fileA0O3 = C3cG.A0O(file, str2);
                    try {
                        if (!fileA0O3.getCanonicalPath().startsWith(FGI.A0M(file.getCanonicalPath(), File.separator))) {
                            throw C60Q.A0U("subdirectory must not escape the cache directory: ", str2);
                        }
                    } catch (IOException e) {
                        throw BV4.A0Q(FGI.A0M("Failed to resolve canonical path for subdirectory: ", str2), e);
                    }
                } else {
                    fileA0O3 = C3cG.A0O(file, Integer.toString(c0m.A0E.nextInt(10)));
                }
                if (!fileA0O3.exists()) {
                    C0M.A06(fileA0O3);
                }
                fileA0O2 = C0D.A03(fileA0O3, c0hA0D.A01, j, System.currentTimeMillis());
            }
            return fileA0O2;
        }
        C0N c0n = (C0N) this;
        synchronized (this) {
            C1G.A08(c0n.A0B.containsKey(str));
            File file2 = c0n.A08;
            if (!file2.exists()) {
                C0N.A08(c0n);
                file2.mkdirs();
            }
            ((C0a) c0n).A00.AWA(c0n, str, j, j2);
            Iterator<C0S> it = ((C0a) c0n).A02.iterator();
            while (it.hasNext()) {
                it.next().AWA(c0n, str, j, j2);
            }
            if (str2 != null) {
                fileA0O = C3cG.A0O(file2, str2);
                try {
                    if (!fileA0O.getCanonicalPath().startsWith(FGI.A0M(file2.getCanonicalPath(), File.separator))) {
                        throw C60Q.A0U("subdirectory must not escape the cache directory: ", str2);
                    }
                    BV5.A1H(fileA0O);
                } catch (IOException e2) {
                    throw BV4.A0Q(FGI.A0M("Failed to resolve canonical path for subdirectory: ", str2), e2);
                }
            } else if (c0n.A02) {
                fileA0O = C3cG.A0O(file2, Integer.toString(c0n.A0C.nextInt(c0n.A00)));
                if (!fileA0O.exists()) {
                    fileA0O.mkdir();
                }
            } else {
                fileA0O = file2;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            StringBuilder sbA0g = C3cG.A0g(str);
            BV7.A1H(".", sbA0g, j);
            sbA0g.append(jCurrentTimeMillis);
            fileA0O2 = C3cG.A0O(fileA0O, AnonymousClass001.A0v(".v2.exo", sbA0g));
        }
        return fileA0O2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.concurrent.CopyOnWriteArrayList] */
    public C0a(C0S c0s, ArrayList arrayList, boolean z, boolean z2) {
        this.A05 = z2;
        this.A00 = c0s;
        this.A02 = z ? new CopyOnWriteArrayList(arrayList) : arrayList;
    }
}
