package X;

/* renamed from: X.GmS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9958GmS {
    public static final C10007Gnf A00 = C10007Gnf.A00;

    public final GqU A0B() {
        C9972Gml<C9934Glc> c9972Gml;
        C9972Gml<C9943Glv> c9972Gml2;
        if (this instanceof C9908Gko) {
            C9908Gko c9908Gko = (C9908Gko) this;
            GqU gqU = c9908Gko.A09;
            if (gqU == null) {
                AbstractC9910Gks abstractC9910Gks = c9908Gko.A04;
                GqU gqUA0F = null;
                if (abstractC9910Gks != null) {
                    if (c9908Gko.A08) {
                        c9972Gml = c9908Gko.A02;
                    } else {
                        C9972Gml<C9959GmU> c9972Gml3 = c9908Gko.A00;
                        if (c9972Gml3 == null || (gqUA0F = abstractC9910Gks.A0F(c9972Gml3.A02)) == null) {
                            c9972Gml = c9908Gko.A03;
                        }
                    }
                    if ((c9972Gml == null || (gqUA0F = abstractC9910Gks.A0F(c9972Gml.A02)) == null) && (c9972Gml2 = c9908Gko.A01) != null) {
                        gqUA0F = abstractC9910Gks.A0F(c9972Gml2.A02);
                    }
                }
                c9908Gko.A09 = gqUA0F == null ? C9908Gko.A0B : gqUA0F;
                return gqUA0F;
            }
            if (gqU != C9908Gko.A0B) {
                return gqU;
            }
        }
        return null;
    }

    public final AbstractC9870GjI A0C() {
        AbstractC10031Go7 abstractC10031Go7A0I;
        if (!(this instanceof C9978Gmt)) {
            C9908Gko c9908Gko = (C9908Gko) this;
            if (c9908Gko.A08) {
                abstractC10031Go7A0I = c9908Gko.A0G();
                if (abstractC10031Go7A0I == null) {
                    abstractC10031Go7A0I = c9908Gko.A0E();
                }
            } else {
                abstractC10031Go7A0I = c9908Gko.A0I();
                if (abstractC10031Go7A0I == null) {
                    C9934Glc c9934GlcA0H = c9908Gko.A0H();
                    if (c9934GlcA0H != null) {
                        return c9934GlcA0H.A0H(0);
                    }
                    abstractC10031Go7A0I = c9908Gko.A0E();
                    if (abstractC10031Go7A0I == null) {
                        abstractC10031Go7A0I = c9908Gko.A0G();
                    }
                }
            }
            return abstractC10031Go7A0I.A07();
        }
        abstractC10031Go7A0I = ((C9978Gmt) this).A04;
        if (abstractC10031Go7A0I == null) {
            return C9860Gj8.A05;
        }
        return abstractC10031Go7A0I.A07();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0162 A[PHI: r6 r7 r9
  0x0162: PHI (r6v7 X.Gou) = (r6v3 X.Gou), (r6v4 X.Gou), (r6v4 X.Gou), (r6v2 X.Gou) binds: [B:88:0x012e, B:99:0x015e, B:100:0x0160, B:67:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r7v8 X.Gou) = (r7v3 X.Gou), (r7v4 X.Gou), (r7v4 X.Gou), (r7v2 X.Gou) binds: [B:88:0x012e, B:99:0x015e, B:100:0x0160, B:67:0x00e3] A[DONT_GENERATE, DONT_INLINE]
  0x0162: PHI (r9v12 X.GoA) = (r9v6 X.GoA), (r9v8 X.GoA), (r9v8 X.GoA), (r9v5 X.GoA) binds: [B:88:0x012e, B:99:0x015e, B:100:0x0160, B:67:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C10034GoA A0D() {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9958GmS.A0D():X.GoA");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9943Glv A0E() {
        /*
            r10 = this;
            boolean r0 = r10 instanceof X.C9978Gmt
            if (r0 == 0) goto Lf
            X.Gmt r10 = (X.C9978Gmt) r10
            X.Gmj r4 = r10.A04
            boolean r0 = r4 instanceof X.C9943Glv
            if (r0 == 0) goto L6f
            X.Glv r4 = (X.C9943Glv) r4
        Le:
            return r4
        Lf:
            X.Gko r10 = (X.C9908Gko) r10
            X.Gml<X.Glv> r0 = r10.A01
            if (r0 == 0) goto L6f
            T r4 = r0.A02
            X.Glv r4 = (X.C9943Glv) r4
            X.Gml<T> r5 = r0.A01
        L1b:
            if (r5 == 0) goto Le
            T r3 = r5.A02
            X.Glv r3 = (X.C9943Glv) r3
            java.lang.reflect.Field r0 = r4.A00
            java.lang.Class r2 = r0.getDeclaringClass()
            java.lang.reflect.Field r0 = r3.A00
            java.lang.Class r1 = r0.getDeclaringClass()
            if (r2 == r1) goto L3e
            boolean r0 = r2.isAssignableFrom(r1)
            if (r0 != 0) goto L52
            boolean r0 = r1.isAssignableFrom(r2)
            if (r0 == 0) goto L3e
        L3b:
            X.Gml<T> r5 = r5.A01
            goto L1b
        L3e:
            int r0 = r4.A06()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r0)
            int r0 = r3.A06()
            boolean r0 = java.lang.reflect.Modifier.isStatic(r0)
            if (r1 == r0) goto L54
            if (r1 == 0) goto L3b
        L52:
            r4 = r3
            goto L3b
        L54:
            java.lang.String r5 = "Multiple fields representing property \""
            java.lang.String r6 = r10.A0J()
            java.lang.String r7 = "\": "
            java.lang.String r8 = r4.A0E()
            java.lang.String r9 = " vs "
            java.lang.String r10 = r3.A0E()
            java.lang.String r0 = X.FGI.A0j(r5, r6, r7, r8, r9, r10)
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L6f:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9958GmS.A0E():X.Glv");
    }

    public final AbstractC9970Gmj A0F() {
        if (this instanceof C9978Gmt) {
            return ((C9978Gmt) this).A04;
        }
        C9908Gko c9908Gko = (C9908Gko) this;
        if (!c9908Gko.A08) {
            C9959GmU c9959GmUA0I = c9908Gko.A0I();
            if (c9959GmUA0I != null) {
                return c9959GmUA0I;
            }
            C9934Glc c9934GlcA0H = c9908Gko.A0H();
            if (c9934GlcA0H != null) {
                return c9934GlcA0H;
            }
            C9943Glv c9943GlvA0E = c9908Gko.A0E();
            if (c9943GlvA0E != null) {
                return c9943GlvA0E;
            }
        }
        C9934Glc c9934GlcA0G = c9908Gko.A0G();
        return c9934GlcA0G == null ? c9908Gko.A0E() : c9934GlcA0G;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9934Glc A0G() {
        /*
            r9 = this;
            boolean r0 = r9 instanceof X.C9978Gmt
            if (r0 == 0) goto L15
            X.Gmt r9 = (X.C9978Gmt) r9
            X.Gmj r1 = r9.A04
            boolean r0 = r1 instanceof X.C9934Glc
            if (r0 == 0) goto L7e
            X.Glc r1 = (X.C9934Glc) r1
            int r0 = r1.A0G()
            if (r0 != 0) goto L7e
            return r1
        L15:
            X.Gko r9 = (X.C9908Gko) r9
            X.Gml<X.Glc> r5 = r9.A02
            if (r5 == 0) goto L7e
            X.Gml<T> r4 = r5.A01
            if (r4 != 0) goto L24
        L1f:
            T r1 = r5.A02
            X.Glc r1 = (X.C9934Glc) r1
            return r1
        L24:
            T r0 = r5.A02
            X.Glc r0 = (X.C9934Glc) r0
            java.lang.reflect.Method r0 = r0.A00
            java.lang.Class r2 = r0.getDeclaringClass()
            T r3 = r4.A02
            X.Glc r3 = (X.C9934Glc) r3
            java.lang.reflect.Method r0 = r3.A00
            java.lang.Class r1 = r0.getDeclaringClass()
            if (r2 == r1) goto L51
            boolean r0 = r2.isAssignableFrom(r1)
            if (r0 != 0) goto L61
            boolean r0 = r1.isAssignableFrom(r2)
            if (r0 == 0) goto L51
        L46:
            X.Gml<T> r4 = r4.A01
            if (r4 != 0) goto L24
            X.Gml r0 = r5.A02()
            r9.A02 = r0
            goto L1f
        L51:
            int r2 = X.C9908Gko.A00(r3)
            T r1 = r5.A02
            X.Glc r1 = (X.C9934Glc) r1
            int r0 = X.C9908Gko.A00(r1)
            if (r2 == r0) goto L63
            if (r2 >= r0) goto L46
        L61:
            r5 = r4
            goto L46
        L63:
            java.lang.String r4 = "Conflicting getter definitions for property \""
            java.lang.String r5 = r9.A0J()
            java.lang.String r6 = "\": "
            java.lang.String r7 = r1.A0E()
            java.lang.String r8 = " vs "
            java.lang.String r9 = r3.A0E()
            java.lang.String r0 = X.FGI.A0j(r4, r5, r6, r7, r8, r9)
            java.lang.IllegalArgumentException r0 = X.C60O.A0i(r0)
            throw r0
        L7e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9958GmS.A0G():X.Glc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0095 A[EDGE_INSN: B:39:0x0095->B:35:0x0095 BREAK  A[LOOP:0: B:16:0x0027->B:40:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[LOOP:0: B:16:0x0027->B:40:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C9934Glc A0H() {
        /*
            r6 = this;
            boolean r0 = r6 instanceof X.C9978Gmt
            if (r0 == 0) goto L16
            X.Gmt r6 = (X.C9978Gmt) r6
            X.Gmj r0 = r6.A04
            boolean r1 = r0 instanceof X.C9934Glc
            if (r1 == 0) goto L9c
            X.Glc r0 = (X.C9934Glc) r0
            int r2 = r0.A0G()
            r1 = 1
            if (r2 != r1) goto L9c
            return r0
        L16:
            X.Gko r6 = (X.C9908Gko) r6
            X.Gml<X.Glc> r4 = r6.A03
            if (r4 == 0) goto L9c
            X.Gml<T> r5 = r4.A01
            if (r5 != 0) goto L27
        L20:
            T r0 = r4.A02
            X.Glc r0 = (X.C9934Glc) r0
            return r0
        L25:
            if (r5 == 0) goto L95
        L27:
            T r2 = r4.A02
            r1 = r2
            X.Glc r1 = (X.C9934Glc) r1
            T r0 = r5.A02
            X.Glc r0 = (X.C9934Glc) r0
            X.Glc r1 = X.C9908Gko.A01(r1, r0, r6)
            if (r1 == r2) goto L3b
            T r0 = r5.A02
            if (r1 != r0) goto L3e
            r4 = r5
        L3b:
            X.Gml<T> r5 = r5.A01
            goto L25
        L3e:
            java.util.ArrayList r3 = X.C3cG.A0h()
            T r0 = r4.A02
            r3.add(r0)
        L47:
            T r0 = r5.A02
            r3.add(r0)
        L4c:
            X.Gml<T> r5 = r5.A01
            if (r5 == 0) goto L68
            T r2 = r4.A02
            r1 = r2
            X.Glc r1 = (X.C9934Glc) r1
            T r0 = r5.A02
            X.Glc r0 = (X.C9934Glc) r0
            X.Glc r1 = X.C9908Gko.A01(r1, r0, r6)
            if (r1 == r2) goto L4c
            T r0 = r5.A02
            if (r1 != r0) goto L47
            r3.clear()
            r4 = r5
            goto L4c
        L68:
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L95
            java.util.stream.Stream r2 = r3.stream()
            r1 = 2
            X.I0v r0 = new X.I0v
            r0.<init>(r1)
            java.util.stream.Stream r1 = r2.map(r0)
            java.lang.String r0 = " vs "
            java.util.stream.Collector r0 = java.util.stream.Collectors.joining(r0)
            java.lang.Object r1 = r1.collect(r0)
            java.lang.String r0 = r6.A0J()
            java.lang.Object[] r1 = new java.lang.Object[]{r0, r1}
            java.lang.String r0 = "Conflicting setter definitions for property \"%s\": %s"
            java.lang.IllegalArgumentException r0 = X.BV5.A0T(r0, r1)
            throw r0
        L95:
            X.Gml r0 = r4.A02()
            r6.A03 = r0
            goto L20
        L9c:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC9958GmS.A0H():X.Glc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C9959GmU A0I() {
        Object obj;
        if (this instanceof C9978Gmt) {
            obj = ((C9978Gmt) this).A04;
            if (!(obj instanceof C9959GmU)) {
                return null;
            }
        } else {
            C9972Gml c9972Gml = ((C9908Gko) this).A00;
            if (c9972Gml == null) {
                return null;
            }
            do {
                C9959GmU c9959GmU = (C9959GmU) c9972Gml.A02;
                if (c9959GmU._owner instanceof C9937Glg) {
                    return c9959GmU;
                }
                c9972Gml = c9972Gml.A01;
            } while (c9972Gml != null);
            obj = c9972Gml.A02;
        }
        return (C9959GmU) obj;
    }

    public final String A0J() {
        C10009Gnh c10009Gnh;
        if (this instanceof C9978Gmt) {
            c10009Gnh = ((C9978Gmt) this).A03;
        } else {
            c10009Gnh = ((C9908Gko) this).A06;
            if (c10009Gnh == null) {
                return null;
            }
        }
        return c10009Gnh._simpleName;
    }

    public final boolean A0K() {
        if (this instanceof C9908Gko) {
            C9908Gko c9908Gko = (C9908Gko) this;
            if (c9908Gko.A00 == null && c9908Gko.A03 == null) {
                for (C9972Gml c9972Gml = c9908Gko.A01; c9972Gml != null; c9972Gml = c9972Gml.A01) {
                    if (!c9972Gml.A05) {
                    }
                }
                return false;
            }
        } else if (A0I() == null && A0H() == null && A0E() == null) {
            return false;
        }
        return true;
    }

    public final boolean A0L() {
        return this instanceof C9978Gmt ? ((C9978Gmt) this).A04 instanceof C9959GmU : AnonymousClass002.A1X(((C9908Gko) this).A00);
    }

    public final Class<?>[] A0M() {
        C9972Gml<C9934Glc> c9972Gml;
        if (!(this instanceof C9908Gko)) {
            return null;
        }
        C9908Gko c9908Gko = (C9908Gko) this;
        AbstractC9910Gks abstractC9910Gks = c9908Gko.A04;
        Class<?>[] clsArrA0h = null;
        if (abstractC9910Gks == null) {
            return null;
        }
        if (c9908Gko.A08) {
            c9972Gml = c9908Gko.A02;
        } else {
            C9972Gml<C9959GmU> c9972Gml2 = c9908Gko.A00;
            if (c9972Gml2 != null && (clsArrA0h = abstractC9910Gks.A0h(c9972Gml2.A02)) != null) {
                return clsArrA0h;
            }
            c9972Gml = c9908Gko.A03;
        }
        if (c9972Gml != null && (clsArrA0h = abstractC9910Gks.A0h(c9972Gml.A02)) != null) {
            return clsArrA0h;
        }
        C9972Gml<C9943Glv> c9972Gml3 = c9908Gko.A01;
        return c9972Gml3 != null ? abstractC9910Gks.A0h(c9972Gml3.A02) : clsArrA0h;
    }
}
