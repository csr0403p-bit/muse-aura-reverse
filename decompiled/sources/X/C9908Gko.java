package X;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Gko, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9908Gko extends AbstractC9958GmS implements Comparable<C9908Gko> {
    public static final GqU A0B = new GqU(C79.A00, "");
    public C9972Gml<C9959GmU> A00;
    public C9972Gml<C9943Glv> A01;
    public C9972Gml<C9934Glc> A02;
    public C9972Gml<C9934Glc> A03;
    public final AbstractC9910Gks A04;
    public final C10009Gnh A05;
    public final C10009Gnh A06;
    public final AbstractC9901Gkh<?> A07;
    public final boolean A08;
    public transient GqU A09;
    public transient C10034GoA A0A;

    /* JADX WARN: Multi-variable type inference failed */
    public static C9972Gml A04(C9971Gmk c9971Gmk, C9972Gml c9972Gml, C9908Gko c9908Gko) {
        C9972Gml c9972GmlA05 = c9972Gml;
        AbstractC9970Gmj abstractC9970Gmj = (AbstractC9970Gmj) c9972Gml.A02;
        boolean z = abstractC9970Gmj instanceof C9987GnD;
        AbstractC9970Gmj c9937Glg = abstractC9970Gmj;
        if (!z) {
            if (abstractC9970Gmj instanceof C9959GmU) {
                C9959GmU c9959GmU = (C9959GmU) abstractC9970Gmj;
                C9971Gmk c9971Gmk2 = c9959GmU.A00;
                c9937Glg = c9959GmU;
                if (c9971Gmk != c9971Gmk2) {
                    AbstractC10024Gnx abstractC10024Gnx = c9959GmU._owner;
                    int i = c9959GmU._index;
                    abstractC10024Gnx._paramAnnotations[i] = c9971Gmk;
                    c9937Glg = abstractC10024Gnx.A0I(i);
                }
            } else if (abstractC9970Gmj instanceof C9943Glv) {
                C9943Glv c9943Glv = (C9943Glv) abstractC9970Gmj;
                c9937Glg = new C9943Glv(c9971Gmk, c9943Glv.A01, c9943Glv.A00);
            } else if (abstractC9970Gmj instanceof C9934Glc) {
                C9934Glc c9934Glc = (C9934Glc) abstractC9970Gmj;
                c9937Glg = new C9934Glc(c9971Gmk, c9934Glc.A01, c9934Glc.A00, c9934Glc._paramAnnotations);
            } else {
                C9937Glg c9937Glg2 = (C9937Glg) abstractC9970Gmj;
                c9937Glg = new C9937Glg(c9971Gmk, c9937Glg2.A01, c9937Glg2._constructor, c9937Glg2._paramAnnotations);
            }
        }
        C9972Gml<T> c9972Gml2 = c9972Gml.A01;
        if (c9972Gml2 != 0) {
            c9972GmlA05 = c9972Gml.A05(A04(c9971Gmk, c9972Gml2, c9908Gko));
        }
        if (c9937Glg == c9972GmlA05.A02) {
            return c9972GmlA05;
        }
        return new C9972Gml(c9972GmlA05.A00, c9972GmlA05.A01, c9937Glg, c9972GmlA05.A04, c9972GmlA05.A05, c9972GmlA05.A03);
    }

    public static void A06(C9972Gml c9972Gml, C9908Gko c9908Gko, Collection collection, Map map) {
        for (C9972Gml c9972Gml2 = c9972Gml; c9972Gml2 != null; c9972Gml2 = c9972Gml2.A01) {
            C10009Gnh c10009Gnh = c9972Gml2.A00;
            if (c9972Gml2.A04 && c10009Gnh != null) {
                C9908Gko c9908Gko2 = (C9908Gko) map.get(c10009Gnh);
                if (c9908Gko2 == null) {
                    c9908Gko2 = new C9908Gko(c9908Gko.A04, c9908Gko.A05, c10009Gnh, c9908Gko.A07, c9908Gko.A08);
                    map.put(c10009Gnh, c9908Gko2);
                }
                if (c9972Gml == c9908Gko.A01) {
                    c9908Gko2.A01 = c9972Gml2.A05(c9908Gko2.A01);
                } else if (c9972Gml == c9908Gko.A02) {
                    c9908Gko2.A02 = c9972Gml2.A05(c9908Gko2.A02);
                } else if (c9972Gml == c9908Gko.A03) {
                    c9908Gko2.A03 = c9972Gml2.A05(c9908Gko2.A03);
                } else {
                    if (c9972Gml != c9908Gko.A00) {
                        throw AbstractC7607F5u.A10(c9908Gko, "Internal error: mismatched accessors, property: ");
                    }
                    c9908Gko2.A00 = c9972Gml2.A05(c9908Gko2.A00);
                }
            } else if (c9972Gml2.A05) {
                StringBuilder sbA0x = C60O.A0x("Conflicting/ambiguous property name definitions (implicit name ");
                C10009Gnh c10009Gnh2 = c9908Gko.A06;
                C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
                sbA0x.append(c10009Gnh2 == null ? "[null]" : AbstractC9855Gj3.A09(c10009Gnh2._simpleName));
                sbA0x.append("): found multiple explicit names: ");
                sbA0x.append(collection);
                throw C3cG.A0Q(AnonymousClass006.A0y(c9972Gml2, ", but also implicit accessor: ", sbA0x));
            }
        }
    }

    public static final int A00(C9934Glc c9934Glc) {
        String name = c9934Glc.A00.getName();
        if (!name.startsWith("get") || name.length() <= 3) {
            return (!name.startsWith("is") || name.length() <= 2) ? 3 : 2;
        }
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C9934Glc A01(X.C9934Glc r5, X.C9934Glc r6, X.C9908Gko r7) {
        /*
            java.lang.reflect.Method r4 = r5.A00
            java.lang.Class r3 = r4.getDeclaringClass()
            java.lang.reflect.Method r2 = r6.A00
            java.lang.Class r1 = r2.getDeclaringClass()
            if (r3 == r1) goto L1b
            boolean r0 = r3.isAssignableFrom(r1)
            if (r0 != 0) goto L48
            boolean r0 = r1.isAssignableFrom(r3)
            if (r0 == 0) goto L1b
        L1a:
            return r5
        L1b:
            java.lang.String r1 = r2.getName()
            java.lang.String r2 = "set"
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L2f
            int r1 = r1.length()
            r0 = 3
            r3 = 1
            if (r1 > r0) goto L30
        L2f:
            r3 = 2
        L30:
            java.lang.String r1 = r4.getName()
            boolean r0 = r1.startsWith(r2)
            if (r0 == 0) goto L42
            int r2 = r1.length()
            r1 = 3
            r0 = 1
            if (r2 > r1) goto L43
        L42:
            r0 = 2
        L43:
            if (r3 == r0) goto L49
            if (r3 >= r0) goto L1a
            return r6
        L48:
            return r6
        L49:
            X.Gks r0 = r7.A04
            if (r0 != 0) goto L4f
            r5 = 0
            return r5
        L4f:
            boolean r0 = r0 instanceof X.C9888GkO
            if (r0 == 0) goto L7c
            r0 = 0
            java.lang.Class r3 = r5.A0J(r0)
            java.lang.Class r2 = r6.A0J(r0)
            boolean r0 = r3.isPrimitive()
            r1 = 0
            if (r0 == 0) goto L6a
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L7a
            return r5
        L6a:
            boolean r0 = r2.isPrimitive()
            if (r0 != 0) goto L7b
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r3 != r0) goto L77
            if (r2 == r0) goto L7a
            return r5
        L77:
            if (r2 != r0) goto L7a
            return r6
        L7a:
            return r1
        L7b:
            return r6
        L7c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C9908Gko.A01(X.Glc, X.Glc, X.Gko):X.Glc");
    }

    private <T extends AbstractC9970Gmj> C9971Gmk A02(C9972Gml<T> c9972Gml) {
        C9971Gmk c9971Gmk = c9972Gml.A02.A00;
        C9972Gml<T> c9972Gml2 = c9972Gml.A01;
        return c9972Gml2 != null ? C9971Gmk.A00(c9971Gmk, A02(c9972Gml2)) : c9971Gmk;
    }

    public static C9971Gmk A03(C9908Gko c9908Gko, C9972Gml[] c9972GmlArr, int i) {
        C9971Gmk c9971GmkA02 = c9908Gko.A02(c9972GmlArr[i]);
        do {
            i++;
            if (i >= c9972GmlArr.length) {
                return c9971GmkA02;
            }
        } while (c9972GmlArr[i] == null);
        return C9971Gmk.A00(c9971GmkA02, A03(c9908Gko, c9972GmlArr, i));
    }

    public static Set<C10009Gnh> A05(C9972Gml<? extends AbstractC9970Gmj> c9972Gml, Set<C10009Gnh> set) {
        for (C9972Gml<? extends AbstractC9970Gmj> c9972Gml2 = c9972Gml; c9972Gml2 != null; c9972Gml2 = c9972Gml2.A01) {
            if (c9972Gml2.A04 && c9972Gml2.A00 != null) {
                if (set == null) {
                    set = C60O.A13();
                }
                set.add(c9972Gml2.A00);
            }
        }
        return set;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gml<+LX/Gmj;>;LX/Gnh;)Z */
    public static boolean A07(C10009Gnh c10009Gnh, C9972Gml c9972Gml) {
        while (c9972Gml != null) {
            if (c9972Gml.A04 && c10009Gnh.equals(c9972Gml.A00)) {
                return true;
            }
            c9972Gml = c9972Gml.A01;
        }
        return false;
    }

    public static <T> boolean A08(C9972Gml<T> c9972Gml) {
        while (c9972Gml != null) {
            if (c9972Gml.A00 != null && c9972Gml.A04) {
                return true;
            }
            c9972Gml = c9972Gml.A01;
        }
        return false;
    }

    public static <T> boolean A09(C9972Gml<T> c9972Gml) {
        while (c9972Gml != null) {
            if (c9972Gml.A00 != null && (!c9972Gml.A00._simpleName.isEmpty())) {
                return true;
            }
            c9972Gml = c9972Gml.A01;
        }
        return false;
    }

    public static <T> boolean A0A(C9972Gml<T> c9972Gml) {
        while (c9972Gml != null) {
            if (!c9972Gml.A03 && c9972Gml.A00 != null && (!c9972Gml.A00._simpleName.isEmpty())) {
                return true;
            }
            c9972Gml = c9972Gml.A01;
        }
        return false;
    }

    public final void A0N() {
        C9972Gml<C9943Glv> c9972GmlA01 = this.A01;
        if (c9972GmlA01 != null) {
            c9972GmlA01 = c9972GmlA01.A01();
        }
        this.A01 = c9972GmlA01;
        C9972Gml<C9934Glc> c9972GmlA012 = this.A02;
        if (c9972GmlA012 != null) {
            c9972GmlA012 = c9972GmlA012.A01();
        }
        this.A02 = c9972GmlA012;
        C9972Gml<C9934Glc> c9972GmlA013 = this.A03;
        if (c9972GmlA013 != null) {
            c9972GmlA013 = c9972GmlA013.A01();
        }
        this.A03 = c9972GmlA013;
        C9972Gml<C9959GmU> c9972GmlA014 = this.A00;
        if (c9972GmlA014 != null) {
            c9972GmlA014 = c9972GmlA014.A01();
        }
        this.A00 = c9972GmlA014;
    }

    public final void A0O(C9908Gko c9908Gko) {
        C9972Gml<C9943Glv> c9972GmlA04 = this.A01;
        C9972Gml<C9943Glv> c9972Gml = c9908Gko.A01;
        if (c9972GmlA04 != null) {
            if (c9972Gml != null) {
                c9972GmlA04 = c9972GmlA04.A04(c9972Gml);
            }
            c9972Gml = c9972GmlA04;
        }
        this.A01 = c9972Gml;
        C9972Gml<C9959GmU> c9972GmlA042 = this.A00;
        C9972Gml<C9959GmU> c9972Gml2 = c9908Gko.A00;
        if (c9972GmlA042 != null) {
            if (c9972Gml2 != null) {
                c9972GmlA042 = c9972GmlA042.A04(c9972Gml2);
            }
            c9972Gml2 = c9972GmlA042;
        }
        this.A00 = c9972Gml2;
        C9972Gml<C9934Glc> c9972GmlA043 = this.A02;
        C9972Gml<C9934Glc> c9972Gml3 = c9908Gko.A02;
        if (c9972GmlA043 != null) {
            if (c9972Gml3 != null) {
                c9972GmlA043 = c9972GmlA043.A04(c9972Gml3);
            }
            c9972Gml3 = c9972GmlA043;
        }
        this.A02 = c9972Gml3;
        C9972Gml<C9934Glc> c9972GmlA044 = this.A03;
        C9972Gml<C9934Glc> c9972Gml4 = c9908Gko.A03;
        if (c9972GmlA044 != null) {
            if (c9972Gml4 != null) {
                c9972GmlA044 = c9972GmlA044.A04(c9972Gml4);
            }
            c9972Gml4 = c9972GmlA044;
        }
        this.A03 = c9972Gml4;
    }

    public final boolean A0P() {
        for (C9972Gml c9972Gml = this.A01; c9972Gml != null; c9972Gml = c9972Gml.A01) {
            if (c9972Gml.A03) {
                return true;
            }
        }
        for (C9972Gml c9972Gml2 = this.A02; c9972Gml2 != null; c9972Gml2 = c9972Gml2.A01) {
            if (c9972Gml2.A03) {
                return true;
            }
        }
        for (C9972Gml c9972Gml3 = this.A03; c9972Gml3 != null; c9972Gml3 = c9972Gml3.A01) {
            if (c9972Gml3.A03) {
                return true;
            }
        }
        for (C9972Gml c9972Gml4 = this.A00; c9972Gml4 != null; c9972Gml4 = c9972Gml4.A01) {
            if (c9972Gml4.A03) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0Q() {
        for (C9972Gml c9972Gml = this.A01; c9972Gml != null; c9972Gml = c9972Gml.A01) {
            if (c9972Gml.A05) {
                return true;
            }
        }
        for (C9972Gml c9972Gml2 = this.A02; c9972Gml2 != null; c9972Gml2 = c9972Gml2.A01) {
            if (c9972Gml2.A05) {
                return true;
            }
        }
        for (C9972Gml c9972Gml3 = this.A03; c9972Gml3 != null; c9972Gml3 = c9972Gml3.A01) {
            if (c9972Gml3.A05) {
                return true;
            }
        }
        for (C9972Gml c9972Gml4 = this.A00; c9972Gml4 != null; c9972Gml4 = c9972Gml4.A01) {
            if (c9972Gml4.A05) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(C9908Gko c9908Gko) {
        C9908Gko c9908Gko2 = c9908Gko;
        C9972Gml<C9959GmU> c9972Gml = this.A00;
        C9972Gml<C9959GmU> c9972Gml2 = c9908Gko2.A00;
        if (c9972Gml != null) {
            if (c9972Gml2 == null) {
                return -1;
            }
        } else if (c9972Gml2 != null) {
            return 1;
        }
        return A0J().compareTo(c9908Gko2.A0J());
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[Property '");
        sbA0x.append(this.A06);
        sbA0x.append("'; ctors: ");
        sbA0x.append(this.A00);
        sbA0x.append(", field(s): ");
        sbA0x.append(this.A01);
        sbA0x.append(", getter(s): ");
        sbA0x.append(this.A02);
        sbA0x.append(", setter(s): ");
        return BV8.A0u(this.A03, sbA0x);
    }

    public C9908Gko(C10009Gnh c10009Gnh, C9908Gko c9908Gko) {
        this.A07 = c9908Gko.A07;
        this.A04 = c9908Gko.A04;
        this.A05 = c9908Gko.A05;
        this.A06 = c10009Gnh;
        this.A01 = c9908Gko.A01;
        this.A00 = c9908Gko.A00;
        this.A02 = c9908Gko.A02;
        this.A03 = c9908Gko.A03;
        this.A08 = c9908Gko.A08;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Gkh<*>;LX/Gks;ZLX/Gnh;LX/Gnh;)V */
    public C9908Gko(AbstractC9910Gks abstractC9910Gks, C10009Gnh c10009Gnh, C10009Gnh c10009Gnh2, AbstractC9901Gkh abstractC9901Gkh, boolean z) {
        this.A07 = abstractC9901Gkh;
        this.A04 = abstractC9910Gks;
        this.A05 = c10009Gnh;
        this.A06 = c10009Gnh2;
        this.A08 = z;
    }
}
