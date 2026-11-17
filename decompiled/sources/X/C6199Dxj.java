package X;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Util;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.common.base.Supplier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;

/* renamed from: X.Dxj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6199Dxj implements InterfaceC6235Dyd {
    public static final Supplier<String> A08 = new C4456CwY(1);
    public static final Random A09 = new Random();
    public InterfaceC6257Dz0 A02;
    public String A03;
    public final Supplier<String> A06 = A08;
    public final C5998Dth A05 = new C5998Dth();
    public final E6B A04 = new E6B();
    public final HashMap<String, C6201Dxl> A07 = BV4.A0u();
    public Timeline A01 = Timeline.A00;
    public long A00 = -1;

    @Override // X.InterfaceC6235Dyd
    public final synchronized boolean A57(C6202Dxm c6202Dxm, String str) {
        C6201Dxl c6201Dxl = this.A07.get(str);
        if (c6201Dxl == null) {
            return false;
        }
        int i = c6202Dxm.A01;
        Dy6 dy6 = c6202Dxm.A09;
        c6201Dxl.A00(dy6, i);
        return c6201Dxl.A02(dy6, i);
    }

    @Override // X.InterfaceC6235Dyd
    public final synchronized void ABb(C6202Dxm c6202Dxm) {
        InterfaceC6257Dz0 interfaceC6257Dz0;
        String str = this.A03;
        if (str != null) {
            C6201Dxl c6201Dxl = this.A07.get(str);
            c6201Dxl.getClass();
            A02(c6201Dxl);
        }
        Iterator itA0x = BV5.A0x(this.A07);
        while (itA0x.hasNext()) {
            C6201Dxl c6201Dxl2 = (C6201Dxl) itA0x.next();
            itA0x.remove();
            if (c6201Dxl2.A04 && (interfaceC6257Dz0 = this.A02) != null) {
                interfaceC6257Dz0.AVo(c6202Dxm, c6201Dxl2.A05, false);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e A[Catch: all -> 0x004c, PHI: r1
  0x003e: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:18:0x003c, B:16:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000b, B:6:0x0011, B:8:0x0017, B:10:0x0023, B:12:0x002a, B:15:0x0036, B:19:0x003e, B:20:0x0041, B:21:0x0047), top: B:27:0x0001 }] */
    @Override // X.InterfaceC6235Dyd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void Ai5(X.C6202Dxm r8, int r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            X.Dz0 r0 = r7.A02     // Catch: java.lang.Throwable -> L4c
            r0.getClass()     // Catch: java.lang.Throwable -> L4c
            r0 = 5
            boolean r6 = X.AnonymousClass002.A1Q(r9, r0)
            java.util.HashMap<java.lang.String, X.Dxl> r0 = r7.A07     // Catch: java.lang.Throwable -> L4c
            java.util.Iterator r5 = X.BV5.A0x(r0)     // Catch: java.lang.Throwable -> L4c
        L11:
            boolean r0 = r5.hasNext()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L47
            java.lang.Object r4 = r5.next()     // Catch: java.lang.Throwable -> L4c
            X.Dxl r4 = (X.C6201Dxl) r4     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r4.A01(r8)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L11
            r5.remove()     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r4.A04     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L11
            java.lang.String r3 = r4.A05     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r7.A03     // Catch: java.lang.Throwable -> L4c
            boolean r2 = r3.equals(r0)     // Catch: java.lang.Throwable -> L4c
            if (r6 == 0) goto L3b
            if (r2 == 0) goto L3b
            boolean r0 = r4.A03     // Catch: java.lang.Throwable -> L4c
            r1 = 1
            if (r0 != 0) goto L3e
        L3b:
            r1 = 0
            if (r2 == 0) goto L41
        L3e:
            r7.A02(r4)     // Catch: java.lang.Throwable -> L4c
        L41:
            X.Dz0 r0 = r7.A02     // Catch: java.lang.Throwable -> L4c
            r0.AVo(r8, r3, r1)     // Catch: java.lang.Throwable -> L4c
            goto L11
        L47:
            r7.A01(r8)     // Catch: java.lang.Throwable -> L4c
            monitor-exit(r7)
            return
        L4c:
            r0 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L4c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6199Dxj.Ai5(X.Dxm, int):void");
    }

    @Override // X.InterfaceC6235Dyd
    public final synchronized void Ai6(C6202Dxm c6202Dxm) {
        Dy6 dy6;
        this.A02.getClass();
        Timeline timeline = this.A01;
        this.A01 = c6202Dxm.A07;
        Iterator itA0x = BV5.A0x(this.A07);
        while (itA0x.hasNext()) {
            C6201Dxl c6201Dxl = (C6201Dxl) itA0x.next();
            Timeline timeline2 = this.A01;
            int iA00 = c6201Dxl.A00;
            if (iA00 < timeline.A02()) {
                C6199Dxj c6199Dxj = c6201Dxl.A06;
                C5998Dth c5998Dth = c6199Dxj.A05;
                timeline.A0E(c5998Dth, iA00, 0L);
                for (int i = c5998Dth.A00; i <= c5998Dth.A01; i++) {
                    int iA06 = timeline2.A06(timeline.A0C(i));
                    if (iA06 != -1) {
                        iA00 = E6B.A00(c6199Dxj.A04, timeline2, iA06);
                        break;
                    }
                }
                iA00 = -1;
            } else if (iA00 >= timeline2.A02()) {
                iA00 = -1;
            }
            c6201Dxl.A00 = iA00;
            if (iA00 == -1 || (((dy6 = c6201Dxl.A02) != null && timeline2.A06(dy6.A04) == -1) || c6201Dxl.A01(c6202Dxm))) {
                itA0x.remove();
                if (c6201Dxl.A04) {
                    String str = c6201Dxl.A05;
                    if (str.equals(this.A03)) {
                        A02(c6201Dxl);
                    }
                    this.A02.AVo(c6202Dxm, str, false);
                }
            }
        }
        A01(c6202Dxm);
    }

    public static C6201Dxl A00(C6199Dxj c6199Dxj, Dy6 dy6, int i) {
        HashMap<String, C6201Dxl> map = c6199Dxj.A07;
        Iterator itA0x = BV5.A0x(map);
        C6201Dxl c6201Dxl = null;
        long j = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
        while (itA0x.hasNext()) {
            C6201Dxl c6201Dxl2 = (C6201Dxl) itA0x.next();
            c6201Dxl2.A00(dy6, i);
            if (c6201Dxl2.A02(dy6, i)) {
                long j2 = c6201Dxl2.A01;
                if (j2 == -1 || j2 < j) {
                    c6201Dxl = c6201Dxl2;
                    j = j2;
                } else if (j2 == j && c6201Dxl.A02 != null && c6201Dxl2.A02 != null) {
                    c6201Dxl = c6201Dxl2;
                }
            }
        }
        if (c6201Dxl != null) {
            return c6201Dxl;
        }
        String str = c6199Dxj.A06.get();
        C6201Dxl c6201Dxl3 = new C6201Dxl(c6199Dxj, dy6, str, i);
        map.put(str, c6201Dxl3);
        return c6201Dxl3;
    }

    private void A01(C6202Dxm c6202Dxm) {
        Dy6 dy6;
        if (AnonymousClass002.A1M(c6202Dxm.A07.A02())) {
            String str = this.A03;
            if (str != null) {
                C6201Dxl c6201Dxl = this.A07.get(str);
                c6201Dxl.getClass();
                A02(c6201Dxl);
                return;
            }
            return;
        }
        C6201Dxl c6201Dxl2 = this.A07.get(this.A03);
        int i = c6202Dxm.A01;
        Dy6 dy62 = c6202Dxm.A09;
        this.A03 = A00(this, dy62, i).A05;
        Ai4(c6202Dxm);
        if (dy62 != null) {
            int i2 = dy62.A00;
            if (AnonymousClass002.A1P(i2, -1)) {
                if (c6201Dxl2 != null && c6201Dxl2.A01 == dy62.A03 && (dy6 = c6201Dxl2.A02) != null && dy6.A00 == i2 && dy6.A01 == dy62.A01) {
                    return;
                }
                this.A02.ARh(A00(this, new Dy6(dy62.A04, dy62.A03), i).A05);
            }
        }
    }

    private void A02(C6201Dxl c6201Dxl) {
        long j = c6201Dxl.A01;
        if (j != -1) {
            this.A00 = j;
        }
        this.A03 = null;
    }

    @Override // X.InterfaceC6235Dyd
    public final synchronized void Ai4(C6202Dxm c6202Dxm) {
        long j;
        C6201Dxl c6201Dxl;
        this.A02.getClass();
        Timeline timeline = c6202Dxm.A07;
        if (!AnonymousClass002.A1M(timeline.A02())) {
            Dy6 dy6 = c6202Dxm.A09;
            if (dy6 != null) {
                long j2 = dy6.A03;
                HashMap<String, C6201Dxl> map = this.A07;
                C6201Dxl c6201Dxl2 = map.get(this.A03);
                if (c6201Dxl2 != null) {
                    j = c6201Dxl2.A01;
                    if (j != -1) {
                    }
                    if (j2 >= j && ((c6201Dxl = map.get(this.A03)) == null || c6201Dxl.A01 != -1 || c6201Dxl.A00 == c6202Dxm.A01)) {
                    }
                }
                j = this.A00 + 1;
                if (j2 >= j) {
                }
            }
            int i = c6202Dxm.A01;
            C6201Dxl c6201DxlA00 = A00(this, dy6, i);
            if (this.A03 == null) {
                this.A03 = c6201DxlA00.A05;
            }
            if (dy6 != null) {
                int i2 = dy6.A00;
                if (AnonymousClass002.A1P(i2, -1)) {
                    Object obj = dy6.A04;
                    Dy6 dy62 = new Dy6(obj, dy6.A03, i2);
                    C6201Dxl c6201DxlA002 = A00(this, dy62, i);
                    if (!c6201DxlA002.A04) {
                        c6201DxlA002.A04 = true;
                        E6B e6b = this.A04;
                        timeline.A0B(e6b, obj);
                        long jA07 = BV5.A07(Util.A0B(e6b.A02));
                        this.A02.AVm(new C6202Dxm(timeline, c6202Dxm.A06, dy62, c6202Dxm.A08, i, c6202Dxm.A00, c6202Dxm.A04, jA07, c6202Dxm.A02, c6202Dxm.A05), c6201DxlA002.A05);
                    }
                }
            }
            if (!c6201DxlA00.A04) {
                c6201DxlA00.A04 = true;
                this.A02.AVm(c6202Dxm, c6201DxlA00.A05);
            }
            String str = c6201DxlA00.A05;
            if (str.equals(this.A03) && !c6201DxlA00.A03) {
                c6201DxlA00.A03 = true;
                this.A02.AVl(c6202Dxm, str);
            }
        }
    }
}
