package X;

import java.util.HashSet;

/* renamed from: X.Aj7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1438Aj7 {
    public C0910AHm<AbB> A00;
    public C0910AHm<AbB> A01;
    public AbstractC1439Aj8 A02;
    public C1440Aj9 A03;
    public AbstractC1387AiH A04;
    public final C0910AHm<BRg> A05;
    public final AbstractC1439Aj8 A06;
    public final Ai8 A07;
    public final C1453AjM A08;
    public final C1450AjJ A09;

    public static int A00(C1453AjM c1453AjM, int i) {
        return c1453AjM.A0f.A02.aggregateChildKindSet & i;
    }

    public static final AbstractC1439Aj8 A01(AbB abB, AbstractC1439Aj8 abstractC1439Aj8) {
        AbstractC1439Aj8 abstractC1439Aj82;
        if (abB instanceof Ab8) {
            AbstractC1439Aj8 abstractC1439Aj8Create = ((Ab8) abB).create();
            abstractC1439Aj8Create.kindSet = AbstractC1436Aj5.A02(abstractC1439Aj8Create);
            abstractC1439Aj82 = abstractC1439Aj8Create;
        } else {
            C1238AfU c1238AfU = new C1238AfU();
            c1238AfU.kindSet = AbstractC1436Aj5.A00(abB);
            c1238AfU.A00 = abB;
            c1238AfU.A01 = new HashSet<>();
            abstractC1439Aj82 = c1238AfU;
        }
        if (abstractC1439Aj82.isAttached) {
            ASP.A01("A ModifierNodeElement cannot return an already attached node from create() ");
            throw F60.createAndThrow();
        }
        abstractC1439Aj82.insertedNodeAwaitingAttachForInvalidation = true;
        AbstractC1439Aj8 abstractC1439Aj83 = abstractC1439Aj8.child;
        if (abstractC1439Aj83 != null) {
            abstractC1439Aj83.parent = abstractC1439Aj82;
            abstractC1439Aj82.child = abstractC1439Aj83;
        }
        abstractC1439Aj8.child = abstractC1439Aj82;
        abstractC1439Aj82.parent = abstractC1439Aj8;
        return abstractC1439Aj82;
    }

    public static final AbstractC1439Aj8 A02(AbstractC1439Aj8 abstractC1439Aj8) {
        if (abstractC1439Aj8.isAttached) {
            AbstractC1436Aj5.A05(abstractC1439Aj8, -1, 2);
            abstractC1439Aj8.runDetachLifecycle$ui();
            abstractC1439Aj8.markAsDetached$ui();
        }
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.child;
        AbstractC1439Aj8 abstractC1439Aj83 = abstractC1439Aj8.parent;
        if (abstractC1439Aj82 != null) {
            abstractC1439Aj82.parent = abstractC1439Aj83;
            abstractC1439Aj8.child = null;
        }
        if (abstractC1439Aj83 != null) {
            abstractC1439Aj83.child = abstractC1439Aj82;
            abstractC1439Aj8.parent = null;
        }
        C7384Etj.A0X(abstractC1439Aj83);
        return abstractC1439Aj83;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v6, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final InterfaceC1356Ahh A03(AbstractC1439Aj8 abstractC1439Aj8) {
        if ((abstractC1439Aj8.kindSet & 2) != 0) {
            if (!(abstractC1439Aj8 instanceof InterfaceC1356Ahh)) {
                if (abstractC1439Aj8 instanceof AbstractC1437Aj6) {
                    loop0: while (true) {
                        abstractC1439Aj8 = ((AbstractC1437Aj6) abstractC1439Aj8).A00;
                        while (abstractC1439Aj8 != 0) {
                            if (abstractC1439Aj8 instanceof InterfaceC1356Ahh) {
                                break loop0;
                            }
                            if (!(abstractC1439Aj8 instanceof AbstractC1437Aj6) || (abstractC1439Aj8.kindSet & 2) == 0) {
                                abstractC1439Aj8 = abstractC1439Aj8.child;
                            }
                        }
                    }
                }
            }
            return (InterfaceC1356Ahh) abstractC1439Aj8;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01f0, code lost:
    
        r14 = r14 + 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f4, code lost:
    
        r11 = r3[(r14 - 1) + r13];
        r10 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01fd, code lost:
    
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0119, code lost:
    
        r17 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011d, code lost:
    
        if ((r19 & 1) != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x011f, code lost:
    
        r17 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0121, code lost:
    
        r0 = -r12;
        r14 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        if (r14 > r12) goto L168;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0129, code lost:
    
        if (r14 == r0) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x012b, code lost:
    
        if (r14 == r12) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0137, code lost:
    
        if (r3[(r14 + 1) + r13] >= r3[(r14 - 1) + r13]) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0139, code lost:
    
        r11 = r3[(r14 + 1) + r13];
        r10 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x013f, code lost:
    
        r1 = r26 - ((r24 - r10) - r14);
        r16 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0146, code lost:
    
        if (r12 == 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0148, code lost:
    
        r16 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014a, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (r10 != r11) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x014d, code lost:
    
        r0 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
    
        r16 = (r16 & r0) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0154, code lost:
    
        if (r10 <= r23) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0158, code lost:
    
        if (r1 <= r25) goto L174;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0162, code lost:
    
        if (r8.A00(r10 - 1, r1 - 1) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0164, code lost:
    
        r10 = r10 - 1;
        r1 = r1 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0169, code lost:
    
        r3[r14 + r13] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x016d, code lost:
    
        if (r17 == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x016f, code lost:
    
        r15 = r19 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0173, code lost:
    
        if (r15 < r0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0175, code lost:
    
        if (r15 > r12) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x017a, code lost:
    
        if (r4[r15 + r13] < r10) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x017c, code lost:
    
        r2[0] = r10;
        r2[1] = r1;
        r2[2] = r11;
        r2[3] = r16;
        r2[4] = 1;
        r16 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A04(X.C0910AHm r29, X.C0910AHm r30, X.AbstractC1439Aj8 r31, X.C1438Aj7 r32, int r33, boolean r34) {
        /*
            Method dump skipped, instructions count: 816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1438Aj7.A04(X.AHm, X.AHm, X.Aj8, X.Aj7, int, boolean):void");
    }

    public static final void A05(AbB abB, AbB abB2, AbstractC1439Aj8 abstractC1439Aj8) {
        if ((abB instanceof Ab8) && (abB2 instanceof Ab8)) {
            ((Ab8) abB2).update(abstractC1439Aj8);
        } else {
            if (!(abstractC1439Aj8 instanceof C1238AfU)) {
                ASP.A01("Unknown Modifier.Node type");
                throw F60.createAndThrow();
            }
            C1238AfU c1238AfU = (C1238AfU) abstractC1439Aj8;
            if (c1238AfU.isAttached && (c1238AfU.kindSet & 8) != 0) {
                AbstractC1414Aij.A07(c1238AfU).AVj();
            }
            c1238AfU.A00 = abB2;
            c1238AfU.kindSet = AbstractC1436Aj5.A00(abB2);
            if (c1238AfU.isAttached) {
                C1238AfU.A00(c1238AfU, false);
            }
        }
        if (abstractC1439Aj8.isAttached) {
            AbstractC1436Aj5.A04(abstractC1439Aj8);
        } else {
            abstractC1439Aj8.updatedNodeAwaitingAttachForInvalidation = true;
        }
    }

    public static final void A06(AbstractC1439Aj8 abstractC1439Aj8, C1438Aj7 c1438Aj7, AbstractC1387AiH abstractC1387AiH) {
        while (true) {
            abstractC1439Aj8 = abstractC1439Aj8.parent;
            if (abstractC1439Aj8 == null) {
                return;
            }
            if (abstractC1439Aj8 == c1438Aj7.A09) {
                C1453AjM c1453AjMA0E = c1438Aj7.A08.A0E();
                abstractC1387AiH.A09 = c1453AjMA0E != null ? c1453AjMA0E.A0f.A07 : null;
                c1438Aj7.A04 = abstractC1387AiH;
                return;
            } else if ((abstractC1439Aj8.kindSet & 2) != 0) {
                return;
            } else {
                abstractC1439Aj8.updateCoordinator$ui(abstractC1387AiH);
            }
        }
    }

    public final void A07() {
        for (AbstractC1439Aj8 abstractC1439Aj8 = this.A02; abstractC1439Aj8 != null; abstractC1439Aj8 = abstractC1439Aj8.child) {
            abstractC1439Aj8.runAttachLifecycle$ui();
            if (abstractC1439Aj8.insertedNodeAwaitingAttachForInvalidation) {
                AbstractC1436Aj5.A03(abstractC1439Aj8);
            }
            if (abstractC1439Aj8.updatedNodeAwaitingAttachForInvalidation) {
                AbstractC1436Aj5.A04(abstractC1439Aj8);
            }
            abstractC1439Aj8.insertedNodeAwaitingAttachForInvalidation = false;
            abstractC1439Aj8.updatedNodeAwaitingAttachForInvalidation = false;
        }
    }

    public final void A08() {
        AbstractC1387AiH abstractC1387AiH;
        AbstractC1387AiH abstractC1387AiH2 = this.A07;
        AbstractC1439Aj8 abstractC1439Aj8 = this.A06;
        while (true) {
            abstractC1439Aj8 = abstractC1439Aj8.parent;
            if (abstractC1439Aj8 == null) {
                break;
            }
            InterfaceC1356Ahh interfaceC1356AhhA03 = A03(abstractC1439Aj8);
            if (interfaceC1356AhhA03 != null) {
                AbstractC1387AiH abstractC1387AiH3 = abstractC1439Aj8.coordinator;
                if (abstractC1387AiH3 != null) {
                    C1354Ahf c1354Ahf = (C1354Ahf) abstractC1387AiH3;
                    InterfaceC1356Ahh interfaceC1356Ahh = c1354Ahf.A01;
                    c1354Ahf.A11(interfaceC1356AhhA03);
                    abstractC1387AiH = c1354Ahf;
                    if (interfaceC1356Ahh != abstractC1439Aj8) {
                        InterfaceC1402AiX interfaceC1402AiX = c1354Ahf.A0A;
                        abstractC1387AiH = c1354Ahf;
                        if (interfaceC1402AiX != null) {
                            interfaceC1402AiX.invalidate();
                            abstractC1387AiH = c1354Ahf;
                        }
                    }
                } else {
                    AbstractC1387AiH c1354Ahf2 = new C1354Ahf(interfaceC1356AhhA03, this.A08);
                    abstractC1439Aj8.updateCoordinator$ui(c1354Ahf2);
                    abstractC1387AiH = c1354Ahf2;
                }
                abstractC1387AiH2.A09 = abstractC1387AiH;
                abstractC1387AiH.A08 = abstractC1387AiH2;
                abstractC1387AiH2 = abstractC1387AiH;
            } else {
                abstractC1439Aj8.updateCoordinator$ui(abstractC1387AiH2);
            }
        }
        C1453AjM c1453AjMA0E = this.A08.A0E();
        abstractC1387AiH2.A09 = c1453AjMA0E != null ? c1453AjMA0E.A0f.A07 : null;
        this.A04 = abstractC1387AiH2;
    }

    public final boolean A09(int i) {
        return (i & this.A02.aggregateChildKindSet) != 0;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("[");
        AbstractC1439Aj8 abstractC1439Aj8 = this.A02;
        AbstractC1439Aj8 abstractC1439Aj82 = this.A06;
        if (abstractC1439Aj8 != abstractC1439Aj82) {
            while (abstractC1439Aj8 != null && abstractC1439Aj8 != abstractC1439Aj82) {
                sbA0x.append(String.valueOf(abstractC1439Aj8));
                if (abstractC1439Aj8.child == abstractC1439Aj82) {
                    sbA0x.append("]");
                    break;
                }
                sbA0x.append(",");
                abstractC1439Aj8 = abstractC1439Aj8.child;
            }
        } else {
            sbA0x.append("]");
            break;
        }
        return sbA0x.toString();
    }

    public C1438Aj7(C1453AjM c1453AjM) {
        this.A08 = c1453AjM;
        C1450AjJ c1450AjJ = new C1450AjJ();
        c1450AjJ.aggregateChildKindSet = -1;
        this.A09 = c1450AjJ;
        Ai8 ai8 = new Ai8(c1453AjM);
        this.A07 = ai8;
        this.A04 = ai8;
        C1241AfX c1241AfX = ai8.A01;
        this.A06 = c1241AfX;
        this.A02 = c1241AfX;
        this.A05 = new C0910AHm<>(0, new BRg[16]);
    }
}
