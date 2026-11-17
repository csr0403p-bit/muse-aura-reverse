package X;

import java.util.HashMap;

/* renamed from: X.GlQ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9929GlQ {
    public static final String[] A09 = {"default", "from-String", "from-int", "from-long", "from-big-integer", "from-double", "from-big-decimal", "from-boolean", "delegate", "property-based", "array-delegate"};
    public AbstractC9915Gl5[] A02;
    public AbstractC9915Gl5[] A03;
    public AbstractC9915Gl5[] A04;
    public final C9914Gl4 A05;
    public final boolean A06;
    public final boolean A07;
    public final AbstractC10024Gnx[] A08 = new AbstractC10024Gnx[11];
    public int A00 = 0;
    public boolean A01 = false;

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if ("valueOf".equals(r4.A09()) != false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean A01(X.C9929GlQ r9, X.AbstractC10024Gnx r10, int r11, boolean r12) {
        /*
            r3 = 1
            int r8 = r3 << r11
            r9.A01 = r3
            X.Gnx[] r2 = r9.A08
            r4 = r2[r11]
            if (r4 == 0) goto L7a
            int r0 = r9.A00
            r0 = r0 & r8
            r5 = 0
            if (r0 == 0) goto L14
            if (r12 != 0) goto L18
        L13:
            return r5
        L14:
            r0 = r12 ^ 1
            if (r0 == 0) goto L7a
        L18:
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r10.getClass()
            if (r1 != r0) goto L7a
            java.lang.Class r7 = r4.A0J(r5)
            java.lang.Class r6 = r10.A0J(r5)
            if (r7 != r6) goto L47
            java.lang.Class r1 = r10.A0C()
            X.GpS[] r0 = X.AbstractC9855Gj3.A01
            java.lang.Class<java.lang.Enum> r6 = java.lang.Enum.class
            boolean r0 = r6.isAssignableFrom(r1)
            if (r0 == 0) goto L64
            java.lang.String r1 = "valueOf"
            java.lang.String r0 = r10.A09()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L64
            return r5
        L47:
            boolean r0 = r6.isAssignableFrom(r7)
            if (r0 != 0) goto L13
            boolean r0 = r7.isAssignableFrom(r6)
            if (r0 != 0) goto L7a
            boolean r1 = r7.isPrimitive()
            boolean r0 = r6.isPrimitive()
            if (r1 == r0) goto L93
            boolean r0 = r7.isPrimitive()
            if (r0 == 0) goto L7a
            return r5
        L64:
            java.lang.Class r0 = r4.A0C()
            boolean r0 = r6.isAssignableFrom(r0)
            if (r0 == 0) goto L93
            java.lang.String r1 = "valueOf"
            java.lang.String r0 = r4.A09()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L93
        L7a:
            if (r12 == 0) goto L81
            int r0 = r9.A00
            r0 = r0 | r8
            r9.A00 = r0
        L81:
            boolean r0 = r9.A06
            if (r0 == 0) goto L90
            java.lang.reflect.AnnotatedElement r1 = r10.A0B()
            java.lang.reflect.Member r1 = (java.lang.reflect.Member) r1
            boolean r0 = r9.A07
            X.AbstractC9855Gj3.A0H(r1, r0)
        L90:
            r2[r11] = r10
            return r3
        L93:
            java.lang.String[] r0 = X.C9929GlQ.A09
            r1 = r0[r11]
            if (r12 == 0) goto La6
            java.lang.String r0 = "explicitly marked"
        L9b:
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0, r4, r10}
            java.lang.String r0 = "Conflicting %s creators: already had %s creator %s, encountered another: %s"
            java.lang.IllegalArgumentException r0 = X.BV5.A0T(r0, r1)
            throw r0
        La6:
            java.lang.String r0 = "implicitly discovered"
            goto L9b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9929GlQ.A01(X.GlQ, X.Gnx, int, boolean):boolean");
    }

    public final void A02(AbstractC10024Gnx abstractC10024Gnx, AbstractC9915Gl5[] abstractC9915Gl5Arr) {
        Integer numValueOf;
        Object objPut;
        if (A01(this, abstractC10024Gnx, 9, true)) {
            int length = abstractC9915Gl5Arr.length;
            if (length > 1) {
                HashMap mapA0u = BV4.A0u();
                int i = 0;
                do {
                    String str = abstractC9915Gl5Arr[i]._propName._simpleName;
                    if ((!str.isEmpty() || abstractC9915Gl5Arr[i].A0B() == null) && (objPut = mapA0u.put(str, (numValueOf = Integer.valueOf(i)))) != null) {
                        throw BV5.A0T("Duplicate creator property \"%s\" (index %s vs %d) for type %s ", new Object[]{str, objPut, numValueOf, AbstractC9855Gj3.A06(this.A05.A05._class)});
                    }
                    i++;
                } while (i < length);
            }
            this.A04 = abstractC9915Gl5Arr;
        }
    }

    public static AbstractC9870GjI A00(AbstractC9904Gkk abstractC9904Gkk, C9929GlQ c9929GlQ, AbstractC10024Gnx abstractC10024Gnx, AbstractC9915Gl5[] abstractC9915Gl5Arr) {
        if (!c9929GlQ.A01 || abstractC10024Gnx == null) {
            return null;
        }
        int i = 0;
        if (abstractC9915Gl5Arr != null) {
            int length = abstractC9915Gl5Arr.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (abstractC9915Gl5Arr[i2] == null) {
                    i = i2;
                    break;
                }
                i2++;
            }
        }
        AbstractC9901Gkh abstractC9901Gkh = abstractC9904Gkk._config;
        AbstractC9870GjI abstractC9870GjIA0H = abstractC10024Gnx.A0H(i);
        AbstractC9910Gks abstractC9910GksA02 = abstractC9901Gkh.A02();
        if (abstractC9910GksA02 == null) {
            return abstractC9870GjIA0H;
        }
        C9959GmU c9959GmUA0I = abstractC10024Gnx.A0I(i);
        Object objA0V = abstractC9910GksA02.A0V(c9959GmUA0I);
        return objA0V != null ? abstractC9870GjIA0H.A0J(abstractC9904Gkk.A0K(objA0V)) : abstractC9910GksA02.A0G(abstractC9870GjIA0H, abstractC9901Gkh, c9959GmUA0I);
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gl4;LX/Gkh<*>;)V */
    public C9929GlQ(AbstractC9901Gkh abstractC9901Gkh, C9914Gl4 c9914Gl4) {
        this.A05 = c9914Gl4;
        this.A06 = abstractC9901Gkh.A07();
        this.A07 = abstractC9901Gkh.A09(EnumC9951GmA.A0L);
    }

    public final void A03(AbstractC10024Gnx abstractC10024Gnx, AbstractC9915Gl5[] abstractC9915Gl5Arr, int i, boolean z) {
        if (abstractC10024Gnx.A0H(i) instanceof AbstractC9865GjD) {
            if (A01(this, abstractC10024Gnx, 10, z)) {
                this.A02 = abstractC9915Gl5Arr;
            }
        } else if (A01(this, abstractC10024Gnx, 8, z)) {
            this.A03 = abstractC9915Gl5Arr;
        }
    }
}
