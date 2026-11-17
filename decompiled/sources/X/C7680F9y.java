package X;

import com.instagram.common.lispy.lang.BloksScriptingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.F9y, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7680F9y implements F64, InterfaceC7626F7i {
    public static final Object A0H = C3cG.A0T();
    public F9X A00;
    public final C0917AHt<String> A01;
    public final C7690FAj A02;
    public final FAB A03;
    public final FAB A04;
    public final F9N A05;
    public final Htq<F6D> A06;
    public final String A07;
    public final Map<String, InterfaceC7700FAy<Object>> A0D;
    public final Map<String, Object> A0E;
    public final Map<String, F8J> A0G;
    public final ArrayList<FAM> A08 = C3cG.A0h();
    public final HashMap<String, Object> A0B = BV4.A0u();
    public final HashMap<String, FAR> A0A = BV4.A0u();
    public final HashMap<String, F8J> A0C = BV4.A0u();
    public final ArrayList<F9T> A09 = C3cG.A0h();
    public final F0C A0F = AbstractC5321DgF.A02(C79.A0C, C8472Feb.A00(43));

    public static F9X A00(C7680F9y c7680F9y, Object obj) {
        C7384Etj.A0Y(obj, 0);
        return c7680F9y.A00;
    }

    @Override // X.F64
    public final Object AFR(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A0B.get(str);
    }

    @Override // X.F64
    public final boolean AN9(String str) {
        C7384Etj.A0Y(str, 0);
        return this.A0B.containsKey(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0068 A[PHI: r20
  0x0068: PHI (r20v3 boolean) = (r20v2 boolean), (r20v5 boolean) binds: [B:14:0x003c, B:23:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final X.F8J A02(X.F6D r20, X.F8L r21, java.lang.String r22) {
        /*
            r19 = this;
            r8 = r19
            java.util.HashMap<java.lang.String, X.F8J> r5 = r8.A0C
            r6 = r22
            java.lang.Object r4 = r5.get(r6)
            X.F8J r4 = (X.F8J) r4
            if (r4 != 0) goto L78
            java.util.Map<java.lang.String, X.F8J> r0 = r8.A0G
            java.lang.Object r4 = r0.get(r6)
            X.F8J r4 = (X.F8J) r4
            r7 = r20
            if (r4 == 0) goto L6f
            X.AHt<java.lang.String> r1 = r8.A01
            if (r1 == 0) goto L6f
            int r0 = r1.A01
            if (r0 == 0) goto L75
            java.lang.Object[] r13 = r1.A04
            long[] r12 = r1.A03
            int r0 = r12.length
            int r11 = r0 + (-2)
            if (r11 < 0) goto L79
            r10 = 0
            r20 = 0
        L2e:
            r18 = r12[r10]
            long r14 = X.C8j5.A0A(r18)
            r1 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r1
            int r0 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r0 == 0) goto L68
            int r0 = X.C8j3.A0E(r10, r11)
            r9 = 8
            int r3 = 8 - r0
            r2 = 0
        L47:
            if (r2 >= r3) goto L66
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r16 & r18
            r14 = 128(0x80, double:6.32E-322)
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 >= 0) goto L61
            java.lang.Object r1 = X.C8j3.A11(r13, r10, r2)
            java.util.Set<java.lang.String> r0 = r4.A04
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L61
            r20 = 1
        L61:
            long r18 = r18 >> r9
            int r2 = r2 + 1
            goto L47
        L66:
            if (r3 != r9) goto L6d
        L68:
            if (r10 == r11) goto L6d
            int r10 = r10 + 1
            goto L2e
        L6d:
            if (r20 == 0) goto L79
        L6f:
            r0 = r21
            X.F8J r4 = X.F8J.A00(r7, r0)
        L75:
            r5.put(r6, r4)
        L78:
            return r4
        L79:
            java.util.Map<java.lang.String, X.F8J> r0 = r4.A03
            java.util.Iterator r9 = X.AnonymousClass002.A0n(r0)
        L7f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L75
            java.util.Map$Entry r0 = X.C3cH.A0l(r9)
            java.lang.String r3 = X.C60O.A0t(r0)
            java.lang.Object r2 = r0.getValue()
            X.F8J r2 = (X.F8J) r2
            X.F9X r0 = r8.A00
            java.util.Map<java.lang.String, X.F8L> r1 = r0.A08
            java.lang.String r0 = r2.A02
            java.lang.Object r0 = r1.get(r0)
            X.F8L r0 = (X.F8L) r0
            if (r0 == 0) goto L6f
            X.F8J r0 = A01(r7, r8, r0, r3)
            if (r0 == 0) goto L6f
            java.lang.Object r1 = r2.A01
            java.lang.Object r0 = r0.A01
            boolean r0 = X.F8G.A00(r1, r0)
            if (r0 != 0) goto L7f
            goto L6f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7680F9y.A02(X.F6D, X.F8L, java.lang.String):X.F8J");
    }

    public static final boolean A03(C7680F9y c7680F9y, Map map) {
        C0917AHt<String> c0917AHt = c7680F9y.A01;
        if (c0917AHt != null) {
            Iterator itA0n = AnonymousClass002.A0n(map);
            while (itA0n.hasNext()) {
                F8J f8j = (F8J) BV7.A0s(itA0n);
                Iterator<String> it = f8j.A04.iterator();
                while (it.hasNext()) {
                    if (c0917AHt.A05(it.next())) {
                    }
                }
                if (A03(c7680F9y, f8j.A03)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC7626F7i
    public final long A5G() {
        return C3cG.A05(this.A0F.getValue());
    }

    @Override // X.F64
    public final F9X AM4() {
        return this.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7680F9y(F9X f9x, C7690FAj c7690FAj, C7674F9s c7674F9s, F9N f9n, Htq htq, String str, Map map) {
        this.A06 = htq;
        this.A0D = map;
        this.A00 = f9x;
        this.A02 = c7690FAj;
        this.A05 = f9n;
        this.A07 = str;
        if (c7674F9s == null) {
            this.A04 = new FAB(null);
            this.A03 = new FAB(null);
            C9jH c9jH = C9jH.A00;
            this.A0G = c9jH;
            this.A0E = c9jH;
            return;
        }
        FAB fab = c7674F9s.A01;
        this.A04 = new FAB(fab);
        this.A03 = fab;
        this.A0G = c7674F9s.A09;
        this.A0E = c7674F9s.A08;
        this.A01 = C0917AHt.A02();
        Iterator itA0n = AnonymousClass002.A0n(c7674F9s.A07);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            Object key = entryA0l.getKey();
            Object value = entryA0l.getValue();
            boolean zAreEqual = C7384Etj.areEqual(value, A0H);
            Map<String, Object> map2 = this.A00.A0A;
            if (zAreEqual) {
                if (map2.containsKey(key)) {
                    this.A01.A0B(key);
                }
            } else if (!F8G.A00(value, map2.get(key))) {
                this.A01.A0B(key);
            }
        }
    }

    public static final F8J A01(F6D f6d, C7680F9y c7680F9y, F8L f8l, String str) {
        try {
            return c7680F9y.A02(f6d, f8l, str);
        } catch (BloksScriptingException e) {
            FFI.A01(f6d.A02, FGI.A0M("Exception evaluating value expression for key: ", f8l.A02), e);
            return null;
        }
    }

    @Override // X.F64
    public final Object A6l(F6D f6d, F8L f8l) {
        AnonymousClass003.A0u(f8l, f6d);
        String strA01 = F8J.A01(f8l, ((F6L) f6d).A02);
        return A02(f6d, f8l, strA01).A02(f6d, strA01);
    }

    @Override // X.F64
    public final boolean A76(String str) {
        return A00(this, str).A0A.containsKey(str);
    }

    @Override // X.F64
    public final Object ADy(String str) {
        return A00(this, str).A01.get(str);
    }

    @Override // X.F64
    public final FDG AFx(String str) {
        return A00(this, str).A03.get(str);
    }

    @Override // X.F64
    public final F6K AHN(String str) {
        return (F6K) A00(this, str).A09.get(str);
    }

    @Override // X.F64
    public final C7616F6s AIe(String str) {
        return A00(this, str).A06.get(str);
    }

    @Override // X.F64
    public final F8L AMQ(String str) {
        return A00(this, str).A08.get(str);
    }

    @Override // X.F64
    public final Object AMX(String str) {
        return A00(this, str).A0A.get(str);
    }

    @Override // X.F64
    public final boolean ANE(String str) {
        return A00(this, str).A06.containsKey(str);
    }

    @Override // X.F64
    public final boolean ANK(String str) {
        return A00(this, str).A07.containsKey(str);
    }

    @Override // X.F64
    public final Object getParameter(String str) {
        return A00(this, str).A05.get(str);
    }
}
