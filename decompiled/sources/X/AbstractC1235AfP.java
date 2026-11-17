package X;

/* renamed from: X.AfP, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1235AfP {
    /* JADX WARN: Removed duplicated region for block: B:36:0x006d A[PHI: r4
  0x006d: PHI (r4v2 X.AHm) = (r4v1 X.AHm), (r4v1 X.AHm), (r4v4 X.AHm) binds: [B:21:0x0042, B:23:0x0046, B:34:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC1237AfR A00(X.C1Z3 r9, java.lang.Object r10) {
        /*
            r7 = 262144(0x40000, float:3.67342E-40)
            r0 = r9
            X.Aj8 r0 = (X.AbstractC1439Aj8) r0
            X.Aj8 r1 = r0.node
            boolean r0 = r1.isAttached
            if (r0 != 0) goto L15
            java.lang.String r0 = "visitAncestors called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L15:
            X.Aj8 r8 = r1.parent
            X.AjM r6 = X.AbstractC1414Aij.A04(r9)
        L1b:
            r9 = 0
            if (r6 == 0) goto L86
            int r0 = X.C1438Aj7.A00(r6, r7)
            if (r0 == 0) goto L77
        L24:
            if (r8 == 0) goto L77
            int r0 = r8.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L74
            r5 = r8
            r4 = r9
        L2d:
            boolean r0 = r5 instanceof X.InterfaceC1237AfR
            if (r0 == 0) goto L3f
            r1 = r5
            X.AfR r1 = (X.InterfaceC1237AfR) r1
            java.lang.Object r0 = r1.AM2()
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L3f
            return r1
        L3f:
            int r0 = r5.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L6d
            boolean r0 = r5 instanceof X.AbstractC1437Aj6
            if (r0 == 0) goto L6d
            r0 = r5
            X.Aj6 r0 = (X.AbstractC1437Aj6) r0
            X.Aj8 r3 = r0.A00
            r2 = 0
        L4e:
            r1 = 1
            if (r3 == 0) goto L6a
            int r0 = r3.kindSet
            r0 = r0 & r7
            if (r0 == 0) goto L5b
            int r2 = r2 + 1
            if (r2 != r1) goto L5e
            r5 = r3
        L5b:
            X.Aj8 r3 = r3.child
            goto L4e
        L5e:
            X.AHm r4 = X.C8j5.A0K(r4)
            X.Aj8 r5 = X.C8j4.A0X(r4, r5)
            r4.A0G(r3)
            goto L5b
        L6a:
            if (r2 != r1) goto L6d
            goto L71
        L6d:
            X.Aj8 r5 = X.AbstractC1414Aij.A00(r4)
        L71:
            if (r5 == 0) goto L74
            goto L2d
        L74:
            X.Aj8 r8 = r8.parent
            goto L24
        L77:
            X.AjM r6 = r6.A0E()
            if (r6 == 0) goto L84
            X.Aj7 r0 = r6.A0f
            if (r0 == 0) goto L84
            X.Aj8 r8 = r0.A06
            goto L1b
        L84:
            r8 = r9
            goto L1b
        L86:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1235AfP.A00(X.1Z3, java.lang.Object):X.AfR");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.Aj8] */
    public static final void A01(C1Z3 c1z3, Object obj, G0U<? super InterfaceC1237AfR, Boolean> g0u) {
        AbstractC1439Aj8 abstractC1439Aj8 = ((AbstractC1439Aj8) c1z3).node;
        if (!abstractC1439Aj8.isAttached) {
            ASP.A01("visitAncestors called on an unattached node");
            throw F60.createAndThrow();
        }
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.parent;
        C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(c1z3);
        if (c1453AjMA04 == null) {
            return;
        }
        while (true) {
            if ((c1453AjMA04.A0f.A02.aggregateChildKindSet & 262144) != 0) {
                while (abstractC1439Aj82 != null) {
                    if ((abstractC1439Aj82.kindSet & 262144) != 0) {
                        AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj82;
                        C0910AHm c0910AHm = null;
                        do {
                            if (abstractC1437Aj6A00 instanceof InterfaceC1237AfR) {
                                InterfaceC1237AfR interfaceC1237AfR = (InterfaceC1237AfR) abstractC1437Aj6A00;
                                if (obj.equals(interfaceC1237AfR.AM2()) && !g0u.invoke(interfaceC1237AfR).booleanValue()) {
                                    return;
                                }
                            } else if ((abstractC1437Aj6A00.kindSet & 262144) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                                AbstractC1439Aj8 abstractC1439Aj83 = abstractC1437Aj6A00.A00;
                                int i = 0;
                                abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                while (abstractC1439Aj83 != null) {
                                    if ((abstractC1439Aj83.kindSet & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC1437Aj6A00 = abstractC1439Aj83;
                                        } else {
                                            if (c0910AHm == null) {
                                                c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                            }
                                            if (abstractC1437Aj6A00 != 0) {
                                                c0910AHm.A0G(abstractC1437Aj6A00);
                                                abstractC1437Aj6A00 = 0;
                                            }
                                            c0910AHm.A0G(abstractC1439Aj83);
                                        }
                                    }
                                    abstractC1439Aj83 = abstractC1439Aj83.child;
                                    abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                        } while (abstractC1437Aj6A00 != 0);
                    }
                    abstractC1439Aj82 = abstractC1439Aj82.parent;
                }
            }
            c1453AjMA04 = c1453AjMA04.A0E();
            if (c1453AjMA04 == null) {
                return;
            }
            C1438Aj7 c1438Aj7 = c1453AjMA04.A0f;
            abstractC1439Aj82 = c1438Aj7 != null ? c1438Aj7.A06 : null;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:28:0x005e, B:36:0x0071], limit reached: 70 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a5 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [X.Aj8] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x00a1 -> B:9:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(X.C1Z3 r13, java.lang.Object r14, X.G0U<? super X.InterfaceC1237AfR, ? extends X.EnumC1236AfQ> r15) {
        /*
            r12 = 262144(0x40000, float:3.67342E-40)
            X.Aj8 r13 = (X.AbstractC1439Aj8) r13
            X.Aj8 r9 = r13.node
            boolean r0 = r9.isAttached
            if (r0 != 0) goto L14
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L14:
            r8 = 16
            X.Aj8[] r0 = new X.AbstractC1439Aj8[r8]
            r7 = 0
            X.AHm r6 = X.C0910AHm.A02(r0, r7)
            X.Aj8 r0 = r9.child
            if (r0 == 0) goto La1
            r6.A0G(r0)
        L24:
            int r0 = r6.A00
            if (r0 == 0) goto La5
            r5 = 1
            int r0 = r0 - r5
            java.lang.Object r9 = r6.A07(r0)
            X.Aj8 r9 = (X.AbstractC1439Aj8) r9
            int r0 = r9.aggregateChildKindSet
            r0 = r0 & r12
            if (r0 == 0) goto La1
            r0 = r9
        L36:
            boolean r1 = r0.isAttached
            if (r1 == 0) goto La1
            int r1 = r0.kindSet
            r1 = r1 & r12
            if (r1 == 0) goto L9c
            r11 = 0
            r10 = r0
            r4 = r11
        L42:
            boolean r1 = r10 instanceof X.InterfaceC1237AfR
            if (r1 == 0) goto L68
            X.AfR r10 = (X.InterfaceC1237AfR) r10
            java.lang.Object r1 = r10.AM2()
            boolean r1 = X.C7384Etj.areEqual(r14, r1)
            if (r1 == 0) goto L65
            java.lang.Object r2 = r15.invoke(r10)
        L56:
            X.AfQ r1 = X.EnumC1236AfQ.A02
            if (r2 == r1) goto La5
            X.AfQ r1 = X.EnumC1236AfQ.A04
            if (r2 == r1) goto L24
        L5e:
            X.Aj8 r10 = X.AbstractC1414Aij.A00(r4)
        L62:
            if (r10 == 0) goto L9c
            goto L42
        L65:
            X.AfQ r2 = X.EnumC1236AfQ.A03
            goto L56
        L68:
            int r1 = r10.kindSet
            r1 = r1 & r12
            if (r1 == 0) goto L5e
            boolean r1 = r10 instanceof X.AbstractC1437Aj6
            if (r1 == 0) goto L5e
            r1 = r10
            X.Aj6 r1 = (X.AbstractC1437Aj6) r1
            X.Aj8 r3 = r1.A00
            r2 = 0
        L77:
            if (r3 == 0) goto L99
            int r1 = r3.kindSet
            r1 = r1 & r12
            if (r1 == 0) goto L83
            int r2 = r2 + 1
            if (r2 != r5) goto L86
            r10 = r3
        L83:
            X.Aj8 r3 = r3.child
            goto L77
        L86:
            if (r4 != 0) goto L8f
            X.Aj8[] r1 = new X.AbstractC1439Aj8[r8]
            X.AHm r4 = new X.AHm
            r4.<init>(r7, r1)
        L8f:
            if (r10 == 0) goto L95
            r4.A0G(r10)
            r10 = r11
        L95:
            r4.A0G(r3)
            goto L83
        L99:
            if (r2 != r5) goto L5e
            goto L62
        L9c:
            X.Aj8 r0 = r0.child
            if (r0 == 0) goto La1
            goto L36
        La1:
            X.AbstractC1414Aij.A09(r6, r9)
            goto L24
        La5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1235AfP.A02(X.1Z3, java.lang.Object, X.G0U):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [T extends X.AfR, X.1Z3, X.AfR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [X.Aj8] */
    public static final <T extends InterfaceC1237AfR> void A03(T t, G0U<? super T, Boolean> g0u) {
        AbstractC1439Aj8 abstractC1439Aj8 = ((AbstractC1439Aj8) t).node;
        if (!abstractC1439Aj8.isAttached) {
            ASP.A01("visitAncestors called on an unattached node");
            throw F60.createAndThrow();
        }
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.parent;
        C1453AjM c1453AjMA04 = AbstractC1414Aij.A04(t);
        if (c1453AjMA04 == null) {
            return;
        }
        while (true) {
            if ((c1453AjMA04.A0f.A02.aggregateChildKindSet & 262144) != 0) {
                while (abstractC1439Aj82 != null) {
                    if ((abstractC1439Aj82.kindSet & 262144) != 0) {
                        AbstractC1437Aj6 abstractC1437Aj6A00 = abstractC1439Aj82;
                        C0910AHm c0910AHm = null;
                        do {
                            if (abstractC1437Aj6A00 instanceof InterfaceC1237AfR) {
                                InterfaceC1237AfR interfaceC1237AfR = (InterfaceC1237AfR) abstractC1437Aj6A00;
                                if (C7384Etj.areEqual(t.AM2(), interfaceC1237AfR.AM2()) && t.getClass() == interfaceC1237AfR.getClass() && !g0u.invoke(interfaceC1237AfR).booleanValue()) {
                                    return;
                                }
                            } else if ((abstractC1437Aj6A00.kindSet & 262144) != 0 && (abstractC1437Aj6A00 instanceof AbstractC1437Aj6)) {
                                AbstractC1439Aj8 abstractC1439Aj83 = abstractC1437Aj6A00.A00;
                                int i = 0;
                                abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                while (abstractC1439Aj83 != null) {
                                    if ((abstractC1439Aj83.kindSet & 262144) != 0) {
                                        i++;
                                        if (i == 1) {
                                            abstractC1437Aj6A00 = abstractC1439Aj83;
                                        } else {
                                            if (c0910AHm == null) {
                                                c0910AHm = new C0910AHm(0, new AbstractC1439Aj8[16]);
                                            }
                                            if (abstractC1437Aj6A00 != 0) {
                                                c0910AHm.A0G(abstractC1437Aj6A00);
                                                abstractC1437Aj6A00 = 0;
                                            }
                                            c0910AHm.A0G(abstractC1439Aj83);
                                        }
                                    }
                                    abstractC1439Aj83 = abstractC1439Aj83.child;
                                    abstractC1437Aj6A00 = abstractC1437Aj6A00;
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC1437Aj6A00 = AbstractC1414Aij.A00(c0910AHm);
                        } while (abstractC1437Aj6A00 != 0);
                    }
                    abstractC1439Aj82 = abstractC1439Aj82.parent;
                }
            }
            c1453AjMA04 = c1453AjMA04.A0E();
            if (c1453AjMA04 == null) {
                return;
            }
            C1438Aj7 c1438Aj7 = c1453AjMA04.A0f;
            abstractC1439Aj82 = c1438Aj7 != null ? c1438Aj7.A06 : null;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:30:0x0069, B:38:0x007c], limit reached: 68 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v0, types: [T extends X.AfR, X.AfR, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00a5 -> B:9:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T extends X.InterfaceC1237AfR> void A04(T r10, X.G0U<? super T, ? extends X.EnumC1236AfQ> r11) {
        /*
            r9 = 262144(0x40000, float:3.67342E-40)
            r0 = r10
            X.Aj8 r0 = (X.AbstractC1439Aj8) r0
            X.Aj8 r7 = r0.node
            boolean r0 = r7.isAttached
            if (r0 != 0) goto L15
            java.lang.String r0 = "visitSubtreeIf called on an unattached node"
            X.ASP.A01(r0)
            X.F60 r0 = X.F60.createAndThrow()
            throw r0
        L15:
            r0 = 16
            X.Aj8[] r1 = new X.AbstractC1439Aj8[r0]
            r0 = 0
            X.AHm r6 = X.C0910AHm.A02(r1, r0)
            X.Aj8 r0 = r7.child
            if (r0 == 0) goto La5
            r6.A0G(r0)
        L25:
            int r0 = r6.A00
            if (r0 == 0) goto Laa
            r5 = 1
            X.Aj8 r7 = X.C0910AHm.A03(r6, r0)
            int r0 = r7.aggregateChildKindSet
            r0 = r0 & r9
            if (r0 == 0) goto La5
            r0 = r7
        L34:
            boolean r1 = r0.isAttached
            if (r1 == 0) goto La5
            int r1 = r0.kindSet
            r1 = r1 & r9
            if (r1 == 0) goto La0
            r4 = 0
            r8 = r0
        L3f:
            boolean r1 = r8 instanceof X.InterfaceC1237AfR
            if (r1 == 0) goto L73
            X.AfR r8 = (X.InterfaceC1237AfR) r8
            java.lang.Object r2 = r10.AM2()
            java.lang.Object r1 = r8.AM2()
            boolean r1 = X.C7384Etj.areEqual(r2, r1)
            if (r1 == 0) goto L70
            java.lang.Class r2 = r10.getClass()
            java.lang.Class r1 = r8.getClass()
            if (r2 != r1) goto L70
            java.lang.Object r2 = r11.invoke(r8)
        L61:
            X.AfQ r1 = X.EnumC1236AfQ.A02
            if (r2 == r1) goto Laa
            X.AfQ r1 = X.EnumC1236AfQ.A04
            if (r2 == r1) goto L25
        L69:
            X.Aj8 r8 = X.AbstractC1414Aij.A00(r4)
        L6d:
            if (r8 == 0) goto La0
            goto L3f
        L70:
            X.AfQ r2 = X.EnumC1236AfQ.A03
            goto L61
        L73:
            int r1 = r8.kindSet
            r1 = r1 & r9
            if (r1 == 0) goto L69
            boolean r1 = r8 instanceof X.AbstractC1437Aj6
            if (r1 == 0) goto L69
            r1 = r8
            X.Aj6 r1 = (X.AbstractC1437Aj6) r1
            X.Aj8 r3 = r1.A00
            r2 = 0
        L82:
            if (r3 == 0) goto L9d
            int r1 = r3.kindSet
            r1 = r1 & r9
            if (r1 == 0) goto L8e
            int r2 = r2 + 1
            if (r2 != r5) goto L91
            r8 = r3
        L8e:
            X.Aj8 r3 = r3.child
            goto L82
        L91:
            X.AHm r4 = X.C8j4.A0W(r4)
            X.Aj8 r8 = X.C8j4.A0X(r4, r8)
            r4.A0G(r3)
            goto L8e
        L9d:
            if (r2 != r5) goto L69
            goto L6d
        La0:
            X.Aj8 r0 = r0.child
            if (r0 == 0) goto La5
            goto L34
        La5:
            X.AbstractC1414Aij.A09(r6, r7)
            goto L25
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1235AfP.A04(X.AfR, X.G0U):void");
    }
}
