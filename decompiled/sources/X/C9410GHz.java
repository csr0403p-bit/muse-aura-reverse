package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GHz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9410GHz {
    public boolean A00;
    public final C7343ElL A01 = new C7343ElL();

    static {
        new C9410GHz(0);
    }

    public final boolean equals(Object obj) {
        Map.Entry entryA0l;
        if (this != obj) {
            if (obj instanceof C9410GHz) {
                C7343ElL c7343ElL = this.A01;
                C7343ElL c7343ElL2 = ((C9410GHz) obj).A01;
                if (c7343ElL.A01.size() + c7343ElL.A00 == c7343ElL2.A01.size() + c7343ElL2.A00 && c7343ElL.keySet().equals(c7343ElL2.keySet())) {
                    AbstractC7339ElH abstractC7339ElH = ((C7340ElI) c7343ElL.entrySet()).A00;
                    Iterator itA0n = null;
                    int i = -1;
                    while (true) {
                        i++;
                        if (i >= abstractC7339ElH.A00) {
                            if (!abstractC7339ElH.A01.isEmpty()) {
                                if (itA0n == null) {
                                    itA0n = AnonymousClass002.A0n(abstractC7339ElH.A01);
                                }
                                if (!itA0n.hasNext()) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        if (i < abstractC7339ElH.A00) {
                            entryA0l = (C7342ElK) abstractC7339ElH.A04[i];
                        } else {
                            if (itA0n == null) {
                                itA0n = AnonymousClass002.A0n(abstractC7339ElH.A01);
                            }
                            entryA0l = C3cH.A0l(itA0n);
                        }
                        Object key = entryA0l.getKey();
                        Object value = entryA0l.getValue();
                        Object obj2 = c7343ElL2.get(key);
                        if (value != obj2 && (value == null || obj2 == null || !value.equals(obj2))) {
                            break;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    private final void A01() {
        if (this.A00) {
            return;
        }
        C7343ElL c7343ElL = this.A01;
        int i = c7343ElL.A00;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c7343ElL.A01(i2).A00;
            if (obj instanceof GI0) {
                ((GI0) obj).A0F();
            }
        }
        Iterator it = (c7343ElL.A01.isEmpty() ? Collections.EMPTY_SET : c7343ElL.A01.entrySet()).iterator();
        while (it.hasNext()) {
            Object objA0s = BV7.A0s(it);
            if (objA0s instanceof GI0) {
                ((GI0) objA0s).A0F();
            }
        }
        if (!c7343ElL.A03) {
            if (c7343ElL.A00 > 0) {
                c7343ElL.A01(0).getClass();
                throw null;
            }
            Iterator it2 = (c7343ElL.A01.isEmpty() ? Collections.EMPTY_SET : c7343ElL.A01.entrySet()).iterator();
            if (it2.hasNext()) {
                C3cH.A0l(it2).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c7343ElL.A03) {
            c7343ElL.A01 = c7343ElL.A01.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c7343ElL.A01);
            c7343ElL.A02 = c7343ElL.A02.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c7343ElL.A02);
            c7343ElL.A03 = true;
        }
        this.A00 = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(X.GI5 r3, X.EnumC10217Grd r4, java.lang.Object r5, int r6) {
        /*
            X.Grh r0 = X.EnumC10217Grd.A02
            if (r4 != r0) goto L18
            X.GIF r5 = (X.GIF) r5
            int r1 = r6 << 3
            r0 = r1 | 3
            r3.A09(r0)
            X.GI0 r5 = (X.GI0) r5
            r5.A0G(r3)
            r0 = r1 | 4
        L14:
            r3.A09(r0)
            return
        L18:
            int r1 = r4.b
            int r0 = r6 << 3
            r0 = r0 | r1
            r3.A09(r0)
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L36;
                case 1: goto L3f;
                case 2: goto L48;
                case 3: goto L48;
                case 4: goto Lc3;
                case 5: goto L4e;
                case 6: goto L56;
                case 7: goto L5e;
                case 8: goto L67;
                case 9: goto L71;
                case 10: goto L76;
                case 11: goto L86;
                case 12: goto L28;
                case 13: goto Lb5;
                case 14: goto L56;
                case 15: goto L4e;
                case 16: goto L2d;
                case 17: goto Lc8;
                default: goto L27;
            }
        L27:
            return
        L28:
            int r0 = X.AnonymousClass001.A0F(r5)
            goto L14
        L2d:
            int r0 = X.AnonymousClass001.A0F(r5)
            int r0 = X.AbstractC7607F5u.A0A(r0)
            goto L14
        L36:
            double r0 = X.BV6.A00(r5)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            goto L52
        L3f:
            float r0 = X.AnonymousClass001.A02(r5)
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            goto L5a
        L48:
            long r0 = X.C3cG.A05(r5)
            goto Ld0
        L4e:
            long r0 = X.C3cG.A05(r5)
        L52:
            r3.A0A(r0)
            return
        L56:
            int r0 = X.AnonymousClass001.A0F(r5)
        L5a:
            r3.A07(r0)
            return
        L5e:
            boolean r0 = X.AnonymousClass001.A1X(r5)
            byte r0 = (byte) r0
            r3.A06(r0)
            return
        L67:
            boolean r0 = r5 instanceof X.AbstractC9330GEn
            if (r0 != 0) goto L95
            java.lang.String r5 = (java.lang.String) r5
            r3.A0D(r5)
            return
        L71:
            X.GIF r5 = (X.GIF) r5
            X.GI0 r5 = (X.GI0) r5
            goto L82
        L76:
            X.GIF r5 = (X.GIF) r5
            X.GI0 r5 = (X.GI0) r5
            r0 = 0
            int r0 = r5.A0B(r0)
            r3.A09(r0)
        L82:
            r5.A0G(r3)
            return
        L86:
            boolean r0 = r5 instanceof X.AbstractC9330GEn
            if (r0 != 0) goto L95
            byte[] r5 = (byte[]) r5
            int r1 = r5.length
            r3.A09(r1)
            r0 = 0
            r3.A0E(r5, r0, r1)
            return
        L95:
            X.GEn r5 = (X.AbstractC9330GEn) r5
            int r0 = r5.A01()
            r3.A09(r0)
            boolean r0 = r5 instanceof X.C9332GEp
            if (r0 == 0) goto Lac
            X.GEp r5 = (X.C9332GEp) r5
            byte[] r2 = r5.d
            r1 = 0
            int r0 = r2.length
        La8:
            r3.A0E(r2, r1, r0)
            return
        Lac:
            X.GEo r5 = (X.C9331GEo) r5
            byte[] r2 = r5.d
            int r1 = r5.e
            int r0 = r5.f
            goto La8
        Lb5:
            boolean r0 = r5 instanceof X.GIT
            if (r0 == 0) goto Lc3
            X.GIT r5 = (X.GIT) r5
            int r0 = r5.A2f()
        Lbf:
            r3.A08(r0)
            return
        Lc3:
            int r0 = X.AnonymousClass001.A0F(r5)
            goto Lbf
        Lc8:
            long r0 = X.C3cG.A05(r5)
            long r0 = X.AbstractC7610F5x.A0S(r0)
        Ld0:
            r3.A0B(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9410GHz.A02(X.GI5, X.Grd, java.lang.Object, int):void");
    }

    public final Object clone() {
        C9410GHz c9410GHz = new C9410GHz();
        C7343ElL c7343ElL = this.A01;
        if (c7343ElL.A00 > 0) {
            c7343ElL.A01(0).getClass();
            throw null;
        }
        Iterator it = (c7343ElL.A01.isEmpty() ? Collections.EMPTY_SET : c7343ElL.A01.entrySet()).iterator();
        if (!it.hasNext()) {
            return c9410GHz;
        }
        Map.Entry entryA0l = C3cH.A0l(it);
        if (entryA0l.getKey() != null) {
            throw new ClassCastException();
        }
        entryA0l.getValue();
        throw null;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public C9410GHz() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int A00(X.EnumC10217Grd r4, java.lang.Object r5, int r6) {
        /*
            int r3 = X.GI5.A00(r6)
            X.Grh r0 = X.EnumC10217Grd.A02
            if (r4 != r0) goto La
            int r3 = r3 * 2
        La:
            int r2 = r4.ordinal()
            r1 = 0
            r0 = 4
            switch(r2) {
                case 0: goto L87;
                case 1: goto L83;
                case 2: goto L1a;
                case 3: goto L1a;
                case 4: goto L58;
                case 5: goto L87;
                case 6: goto L83;
                case 7: goto L1f;
                case 8: goto L24;
                case 9: goto L31;
                case 10: goto L77;
                case 11: goto L38;
                case 12: goto L47;
                case 13: goto L4c;
                case 14: goto L83;
                case 15: goto L87;
                case 16: goto L5d;
                case 17: goto L6a;
                default: goto L13;
            }
        L13:
            java.lang.String r0 = "There is no way to get here, but the compiler thinks otherwise."
            java.lang.RuntimeException r0 = X.BV4.A0c(r0)
            throw r0
        L1a:
            long r0 = X.C3cG.A05(r5)
            goto L72
        L1f:
            r5.getClass()
            r0 = 1
            goto L8c
        L24:
            boolean r0 = r5 instanceof X.AbstractC9330GEn
            if (r0 != 0) goto L40
            java.lang.String r5 = (java.lang.String) r5
            X.GEI r0 = X.GEK.A00
            int r1 = r0.A00(r5)
            goto L7d
        L31:
            X.GIF r5 = (X.GIF) r5
            int r0 = r5.A0B(r1)
            goto L8c
        L38:
            boolean r0 = r5 instanceof X.AbstractC9330GEn
            if (r0 != 0) goto L40
            byte[] r5 = (byte[]) r5
            int r1 = r5.length
            goto L7d
        L40:
            X.GEn r5 = (X.AbstractC9330GEn) r5
            int r1 = r5.A01()
            goto L7d
        L47:
            int r0 = X.AnonymousClass001.A0F(r5)
            goto L65
        L4c:
            boolean r0 = r5 instanceof X.GIT
            if (r0 == 0) goto L58
            X.GIT r5 = (X.GIT) r5
            int r0 = r5.A2f()
        L56:
            long r0 = (long) r0
            goto L72
        L58:
            int r0 = X.AnonymousClass001.A0F(r5)
            goto L56
        L5d:
            int r0 = X.AnonymousClass001.A0F(r5)
            int r0 = X.AbstractC7607F5u.A0A(r0)
        L65:
            int r0 = X.AbstractC7609F5w.A05(r0)
            goto L8c
        L6a:
            long r0 = X.C3cG.A05(r5)
            long r0 = X.AbstractC7610F5x.A0S(r0)
        L72:
            int r0 = X.AbstractC7609F5w.A08(r0)
            goto L8c
        L77:
            X.GIF r5 = (X.GIF) r5
            int r1 = r5.A0B(r1)
        L7d:
            int r0 = X.AbstractC7609F5w.A05(r1)
            int r0 = r0 + r1
            goto L8c
        L83:
            r5.getClass()
            goto L8c
        L87:
            r5.getClass()
            r0 = 8
        L8c:
            int r0 = r0 + r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9410GHz.A00(X.Grd, java.lang.Object, int):int");
    }

    public C9410GHz(int i) {
        A01();
        A01();
    }
}
