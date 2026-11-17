package X;

import android.os.Handler;
import java.io.File;
import java.util.ArrayList;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.C0f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3157C0f implements InterfaceC3158C0g {
    public final C0a A00;
    public final Object A01;
    public final AtomicBoolean A02 = C60O.A1E();
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.C0a] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public C3157C0f(Handler handler, C0S c0s, File file, ArrayList arrayList, Set set, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.A05 = z4;
        this.A04 = z5;
        this.A03 = z12;
        ?? c0m = z6 ? new C0M(c0s, new C0C(file), file, arrayList, j, z, z2, z7, z8, z9, z10, z13, z15) : new C0N(handler, c0s, file, arrayList, set, i, j, z, z2, z3, z9, z10, z11, z12, z14, z15, z16);
        this.A00 = c0m;
        this.A01 = z5 ? c0m : this;
    }

    public static void A00(InterfaceC3158C0g interfaceC3158C0g, C0J c0j, String str) {
        C0a c0a;
        boolean zA07;
        if (interfaceC3158C0g instanceof C3157C0f) {
            c0a = ((C3157C0f) interfaceC3158C0g).A00;
        } else if (!(interfaceC3158C0g instanceof C0N) && !(interfaceC3158C0g instanceof C0M)) {
            return;
        } else {
            c0a = (C0a) interfaceC3158C0g;
        }
        if (c0a.A05) {
            if (c0a instanceof C0M) {
                C0M c0m = (C0M) c0a;
                synchronized (c0m) {
                    zA07 = C0M.A07(c0j, c0m);
                }
                if (!zA07) {
                }
            } else {
                c0a.Aax(c0j);
            }
            c0a.A0J(c0j, str);
        }
        c0a.Aax(c0j);
        c0a.A0I(c0j);
        c0a.A0J(c0j, str);
    }

    public final long A01(String str) {
        long jA0E;
        if (this.A04) {
            return this.A00.A0E(str);
        }
        synchronized (this.A01) {
            jA0E = this.A00.A0E(str);
        }
        return jA0E;
    }

    public final C0J A02(Integer num, String str, long j) {
        C0J c0jAgC;
        if (this.A04) {
            return this.A00.AgC(num, str, j, -1L);
        }
        synchronized (this.A01) {
            c0jAgC = this.A00.AgC(num, str, j, -1L);
        }
        return c0jAgC;
    }

    public final C0J A03(Integer num, String str, long j) {
        C0J c0jAgD;
        if (this.A04) {
            return this.A00.AgD(num, str, j, -1L);
        }
        synchronized (this.A01) {
            c0jAgD = this.A00.AgD(num, str, j, -1L);
        }
        return c0jAgD;
    }

    public final void A04(C0J c0j, String str) {
        boolean zA07;
        synchronized (this.A01) {
            C0a c0a = this.A00;
            if (c0a.A05) {
                if (c0a instanceof C0M) {
                    C0M c0m = (C0M) c0a;
                    synchronized (c0m) {
                        zA07 = C0M.A07(c0j, c0m);
                    }
                    if (!zA07) {
                    }
                } else {
                    c0a.Aax(c0j);
                }
                c0a.A0J(c0j, str);
            } else {
                c0a.Aax(c0j);
            }
            c0a.A0I(c0j);
            c0a.A0J(c0j, str);
        }
    }

    public final void A05(String str, long j) {
        if (this.A04) {
            this.A00.A0K(str, j);
            return;
        }
        synchronized (this.A01) {
            this.A00.A0K(str, j);
        }
    }

    @Override // X.InterfaceC3158C0g
    public final void A3e(String str) {
        if (this.A04) {
            this.A00.A3e(str);
            return;
        }
        synchronized (this.A01) {
            this.A00.A3e(str);
        }
    }

    @Override // X.InterfaceC3158C0g
    public final void A4U(C3122Bym c3122Bym, String str) {
        if (this.A04) {
            this.A00.A4U(c3122Bym, str);
            return;
        }
        synchronized (this.A01) {
            this.A00.A4U(c3122Bym, str);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    @Override // X.InterfaceC3158C0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A6a(java.io.File r16, long r17) {
        /*
            r15 = this;
            X.C0a r4 = r15.A00
            boolean r0 = r4 instanceof X.C0N
            r8 = r16
            r9 = r17
            if (r0 == 0) goto L63
            r0 = r4
            X.C0N r0 = (X.C0N) r0
            boolean r0 = r0.A0G
            if (r0 == 0) goto L63
            r1 = 0
            int r0 = (r17 > r1 ? 1 : (r17 == r1 ? 0 : -1))
            if (r0 <= 0) goto L63
            r13 = 1
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = r13
            X.C0J r0 = X.C0E.A00(r8, r9, r11, r13, r14)
            java.io.File r7 = r8.getParentFile()
            if (r0 == 0) goto L63
            if (r7 == 0) goto L63
            java.lang.String r5 = r0.A06
            long r2 = r0.A04
            long r0 = r0.A02
            java.lang.StringBuilder r6 = X.C3cG.A0g(r5)
            java.lang.String r5 = "."
            X.BV7.A1H(r5, r6, r2)
            r6.append(r0)
            java.lang.String r0 = ".fl"
            r6.append(r0)
            r6.append(r9)
            java.lang.String r0 = ".exo"
            java.lang.String r0 = X.AnonymousClass001.A0v(r0, r6)
            java.io.File r2 = X.C3cG.A0O(r7, r0)
            java.lang.String r1 = r2.getName()
            java.nio.charset.Charset r0 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r0 = r1.getBytes(r0)
            int r1 = r0.length
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto L63
            boolean r0 = r8.renameTo(r2)
            if (r0 != 0) goto L64
        L63:
            r2 = r8
        L64:
            java.lang.Object r1 = r15.A01
            monitor-enter(r1)
            r4.A6a(r2, r9)     // Catch: java.lang.Throwable -> L6c
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            return
        L6c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L6c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3157C0f.A6a(java.io.File, long):void");
    }

    @Override // X.InterfaceC3158C0g
    public final long AD9() {
        long jAD9;
        if (this.A04) {
            return this.A00.AD9();
        }
        synchronized (this.A01) {
            jAD9 = this.A00.AD9();
        }
        return jAD9;
    }

    @Override // X.InterfaceC3158C0g
    public final NavigableSet<C0J> ADD(String str) {
        NavigableSet<C0J> navigableSetADD;
        synchronized (this.A01) {
            navigableSetADD = this.A00.ADD(str);
            if (navigableSetADD == null) {
                navigableSetADD = new TreeSet<>();
            }
        }
        return navigableSetADD;
    }

    @Override // X.InterfaceC3158C0g
    public final C3121Byl AE3(String str) {
        C3121Byl c3121BylAE3;
        synchronized (this.A01) {
            c3121BylAE3 = this.A00.AE3(str);
            if (c3121BylAE3 == null) {
                c3121BylAE3 = C3121Byl.A02;
                C1H.A00(c3121BylAE3);
            }
        }
        return c3121BylAE3;
    }

    @Override // X.InterfaceC3158C0g
    public final Set<String> AGr() {
        Set<String> setAGr;
        synchronized (this.A01) {
            setAGr = this.A00.AGr();
            if (setAGr == null) {
                setAGr = C60O.A13();
            }
        }
        return setAGr;
    }

    @Override // X.InterfaceC3158C0g
    public final boolean AOA(String str, long j, long j2) {
        boolean zAOA;
        if (this.A04) {
            return this.A00.AOA(str, j, j2);
        }
        synchronized (this.A01) {
            zAOA = this.A00.AOA(str, j, j2);
        }
        return zAOA;
    }

    @Override // X.InterfaceC3158C0g
    public final boolean AOC(String str, long j, long j2) {
        return this.A00.AOC(str, j, j2);
    }

    @Override // X.InterfaceC3158C0g
    public final boolean AOe(String str) {
        boolean zAOe;
        if (this.A04) {
            return this.A00.AOe(str);
        }
        synchronized (this.A01) {
            zAOe = this.A00.AOe(str);
        }
        return zAOe;
    }

    @Override // X.InterfaceC3158C0g
    public final void AaF(C0J c0j) {
        synchronized (this.A01) {
            this.A00.AaF(c0j);
        }
    }

    @Override // X.InterfaceC3158C0g
    @Deprecated
    public final void Aax(C0J c0j) {
        if (this.A04) {
            A04(c0j, "not_provided");
            return;
        }
        synchronized (this.A01) {
            A04(c0j, "not_provided");
        }
    }

    @Override // X.InterfaceC3158C0g
    public final File Ag0(String str, long j, long j2) {
        File fileAg0;
        if (this.A04) {
            File fileAg02 = this.A00.Ag0(str, j, j2);
            C1H.A00(fileAg02);
            return fileAg02;
        }
        synchronized (this.A01) {
            fileAg0 = this.A00.Ag0(str, j, j2);
            C1H.A00(fileAg0);
        }
        return fileAg0;
    }

    @Override // X.InterfaceC3158C0g
    public final File Ag1(String str, String str2, long j, long j2) {
        File fileAg1;
        if (this.A04) {
            File fileAg12 = this.A00.Ag1(str, str2, j, j2);
            C1H.A00(fileAg12);
            return fileAg12;
        }
        synchronized (this.A01) {
            fileAg1 = this.A00.Ag1(str, str2, j, j2);
            C1H.A00(fileAg1);
        }
        return fileAg1;
    }

    @Override // X.InterfaceC3158C0g
    public final C0J AgC(Integer num, String str, long j, long j2) {
        C0J c0jAgC;
        if (this.A05 || this.A04) {
            return this.A00.AgC(num, str, j, j2);
        }
        synchronized (this.A01) {
            c0jAgC = this.A00.AgC(num, str, j, j2);
        }
        return c0jAgC;
    }

    @Override // X.InterfaceC3158C0g
    public final C0J AgD(Integer num, String str, long j, long j2) {
        C0J c0jAgD;
        if (this.A04) {
            return this.A00.AgD(num, str, j, j2);
        }
        synchronized (this.A01) {
            c0jAgD = this.A00.AgD(num, str, j, j2);
        }
        return c0jAgD;
    }
}
