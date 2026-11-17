package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Alc, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1562Alc {
    public C1562Alc A00;
    public final int A01;
    public final AbstractC1439Aj8 A02;
    public final C1453AjM A03;
    public final C0919AHv A04;
    public final boolean A05;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [X.Ajj] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v4, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [X.Aj8] */
    private final InterfaceC1476Ajj A01() {
        AbstractC1439Aj8 abstractC1439Aj8A0X;
        boolean z = this.A04.A01;
        C1453AjM c1453AjM = this.A03;
        AbstractC1439Aj8 abstractC1439Aj8 = null;
        AbstractC1439Aj8 abstractC1439Aj82 = c1453AjM.A0f.A02;
        int i = abstractC1439Aj82.aggregateChildKindSet & 8;
        if (z) {
            if (i != 0) {
                abstractC1439Aj8A0X = null;
                do {
                    if ((abstractC1439Aj82.kindSet & 8) != 0) {
                        AbstractC1437Aj6 abstractC1437Aj6A0X = abstractC1439Aj82;
                        C0910AHm c0910AHmA0W = null;
                        do {
                            if (abstractC1437Aj6A0X instanceof InterfaceC1476Ajj) {
                                ?? r7 = (InterfaceC1476Ajj) abstractC1437Aj6A0X;
                                if (r7.AOU()) {
                                    if (r7.AKa()) {
                                        return r7;
                                    }
                                    if (abstractC1439Aj8A0X == null) {
                                        abstractC1439Aj8A0X = r7;
                                    }
                                }
                            } else if ((abstractC1437Aj6A0X.kindSet & 8) != 0 && (abstractC1437Aj6A0X instanceof AbstractC1437Aj6)) {
                                AbstractC1439Aj8 abstractC1439Aj83 = abstractC1437Aj6A0X.A00;
                                int i2 = 0;
                                abstractC1437Aj6A0X = abstractC1437Aj6A0X;
                                while (abstractC1439Aj83 != null) {
                                    if ((abstractC1439Aj83.kindSet & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC1437Aj6A0X = abstractC1439Aj83;
                                        } else {
                                            c0910AHmA0W = C8j4.A0W(c0910AHmA0W);
                                            abstractC1437Aj6A0X = C8j4.A0X(c0910AHmA0W, abstractC1437Aj6A0X);
                                            c0910AHmA0W.A0G(abstractC1439Aj83);
                                        }
                                    }
                                    abstractC1439Aj83 = abstractC1439Aj83.child;
                                    abstractC1437Aj6A0X = abstractC1437Aj6A0X;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1437Aj6A0X = AbstractC1414Aij.A00(c0910AHmA0W);
                        } while (abstractC1437Aj6A0X != 0);
                    }
                    if ((abstractC1439Aj82.aggregateChildKindSet & 8) == 0) {
                        break;
                    }
                    abstractC1439Aj82 = abstractC1439Aj82.child;
                } while (abstractC1439Aj82 != null);
                abstractC1439Aj8 = abstractC1439Aj8A0X;
            }
        } else if (i != 0) {
            loop3: do {
                if ((abstractC1439Aj82.kindSet & 8) != 0) {
                    abstractC1439Aj8A0X = abstractC1439Aj82;
                    C0910AHm c0910AHmA0W2 = null;
                    do {
                        if (abstractC1439Aj8A0X instanceof InterfaceC1476Ajj) {
                            if (((InterfaceC1476Ajj) abstractC1439Aj8A0X).AOU()) {
                                abstractC1439Aj8 = abstractC1439Aj8A0X;
                            }
                        } else if ((abstractC1439Aj8A0X.kindSet & 8) != 0 && (abstractC1439Aj8A0X instanceof AbstractC1437Aj6)) {
                            int i3 = 0;
                            for (AbstractC1439Aj8 abstractC1439Aj84 = ((AbstractC1437Aj6) abstractC1439Aj8A0X).A00; abstractC1439Aj84 != null; abstractC1439Aj84 = abstractC1439Aj84.child) {
                                if ((abstractC1439Aj84.kindSet & 8) != 0) {
                                    i3++;
                                    if (i3 == 1) {
                                        abstractC1439Aj8A0X = abstractC1439Aj84;
                                    } else {
                                        c0910AHmA0W2 = C8j4.A0W(c0910AHmA0W2);
                                        abstractC1439Aj8A0X = C8j4.A0X(c0910AHmA0W2, abstractC1439Aj8A0X);
                                        c0910AHmA0W2.A0G(abstractC1439Aj84);
                                    }
                                }
                            }
                            if (i3 == 1) {
                            }
                        }
                        abstractC1439Aj8A0X = AbstractC1414Aij.A00(c0910AHmA0W2);
                    } while (abstractC1439Aj8A0X != null);
                }
                if ((abstractC1439Aj82.aggregateChildKindSet & 8) == 0) {
                    break;
                }
                abstractC1439Aj82 = abstractC1439Aj82.child;
            } while (abstractC1439Aj82 != null);
        }
        return (InterfaceC1476Ajj) abstractC1439Aj8;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/List<LX/Alc;>;LX/AHv;)V */
    private final void A03(C0919AHv c0919AHv, List list) {
        if (this.A04.A00) {
            return;
        }
        if (this.A00 == null) {
            A02(this.A03, list);
        }
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            C1562Alc c1562Alc = (C1562Alc) list.get(size2);
            if (!c1562Alc.A05 || !c1562Alc.A04.A01) {
                c0919AHv.A02(c1562Alc.A04);
                c1562Alc.A03(c0919AHv, list);
            }
        }
    }

    public final AbstractC1387AiH A09() {
        if (this.A00 == null) {
            InterfaceC1476Ajj interfaceC1476AjjA01 = A01();
            return interfaceC1476AjjA01 != null ? AbstractC1414Aij.A06(interfaceC1476AjjA01, 8) : this.A03.A0f.A07;
        }
        C1562Alc c1562AlcA0B = A0B();
        if (c1562AlcA0B != null) {
            return c1562AlcA0B.A09();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0919AHv A0A() {
        /*
            r2 = this;
            boolean r0 = r2.A05
            if (r0 == 0) goto Lb
            X.AHv r0 = r2.A04
            boolean r0 = r0.A01
            r1 = 1
            if (r0 != 0) goto Lc
        Lb:
            r1 = 0
        Lc:
            X.AHv r0 = r2.A04
            if (r1 == 0) goto L1c
            X.AHv r1 = r0.A00()
            java.util.ArrayList r0 = X.C3cG.A0h()
            r2.A03(r1, r0)
            return r1
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1562Alc.A0A():X.AHv");
    }

    public final C1562Alc A0B() {
        C1453AjM c1453AjMA0E;
        C1562Alc c1562Alc = this.A00;
        if (c1562Alc != null) {
            return c1562Alc;
        }
        boolean z = this.A05;
        if (z) {
            c1453AjMA0E = this.A03;
            while (true) {
                c1453AjMA0E = c1453AjMA0E.A0E();
                if (c1453AjMA0E == null) {
                    break;
                }
                C0919AHv c0919AHvAKL = c1453AjMA0E.AKL();
                if (c0919AHvAKL != null && c0919AHvAKL.A01) {
                    break;
                }
            }
        } else {
            c1453AjMA0E = this.A03;
            do {
                c1453AjMA0E = c1453AjMA0E.A0E();
                if (c1453AjMA0E == null) {
                    return null;
                }
            } while (!c1453AjMA0E.A0f.A09(8));
        }
        return AbstractC1468Ajb.A00(c1453AjMA0E, z);
    }

    public final List A0C(boolean z, boolean z2) {
        List list;
        String str;
        if (z || !this.A04.A00) {
            ArrayList arrayListA0h = C3cG.A0h();
            if (this.A05 && this.A04.A01) {
                List listA0h = C3cG.A0h();
                A04(arrayListA0h, listA0h);
                return listA0h;
            }
            if (this.A00 == null) {
                A02(this.A03, arrayListA0h);
                if (!z2) {
                    return arrayListA0h;
                }
                C0919AHv c0919AHv = this.A04;
                Object objA01 = AlP.A01(c0919AHv, AbstractC1671Anw.A0V);
                if (objA01 != null && c0919AHv.A01 && !arrayListA0h.isEmpty()) {
                    C2326BUa c2326BUa = new C2326BUa(objA01, 1);
                    C0919AHv c0919AHv2 = new C0919AHv();
                    c0919AHv2.A01 = false;
                    c0919AHv2.A00 = false;
                    c2326BUa.invoke(c0919AHv2);
                    C1562Alc c1562Alc = new C1562Alc(new C1563Ald(c2326BUa), new C1453AjM(true, this.A01 + 1000000000), c0919AHv2, false);
                    c1562Alc.A00 = this;
                    arrayListA0h.add(c1562Alc);
                }
                C0920AHw<List<String>> c0920AHw = AbstractC1671Anw.A03;
                if (!AbstractC0915AHr.A00(c0919AHv, c0920AHw) || arrayListA0h.isEmpty() || !c0919AHv.A01 || (list = (List) AlP.A01(c0919AHv, c0920AHw)) == null || (str = (String) AbstractC0878AGe.A0G(list)) == null) {
                    return arrayListA0h;
                }
                C2347BUv c2347BUv = new C2347BUv(str, 0);
                C0919AHv c0919AHv3 = new C0919AHv();
                c0919AHv3.A01 = false;
                c0919AHv3.A00 = false;
                c2347BUv.invoke(c0919AHv3);
                C1562Alc c1562Alc2 = new C1562Alc(new C1563Ald(c2347BUv), new C1453AjM(true, this.A01 + 2000000000), c0919AHv3, false);
                c1562Alc2.A00 = this;
                arrayListA0h.add(0, c1562Alc2);
                return arrayListA0h;
            }
        }
        return C0881AGi.A00;
    }

    public final boolean A0D() {
        if (this.A00 == null && A0C(false, true).isEmpty()) {
            C1453AjM c1453AjMA0E = this.A03;
            while (true) {
                c1453AjMA0E = c1453AjMA0E.A0E();
                if (c1453AjMA0E == null) {
                    return true;
                }
                C0919AHv c0919AHvAKL = c1453AjMA0E.AKL();
                if (c0919AHvAKL != null && c0919AHvAKL.A01) {
                    break;
                }
            }
        }
        return false;
    }

    public C1562Alc(AbstractC1439Aj8 abstractC1439Aj8, C1453AjM c1453AjM, C0919AHv c0919AHv, boolean z) {
        this.A02 = abstractC1439Aj8;
        this.A05 = z;
        this.A03 = c1453AjM;
        this.A04 = c0919AHv;
        this.A01 = c1453AjM.A02;
    }

    public static final AaC A00(InterfaceC1497Ak4 interfaceC1497Ak4, C1562Alc c1562Alc) {
        C1562Alc c1562AlcA0B = c1562Alc.A0B();
        if (c1562AlcA0B == null) {
            return AaC.A04;
        }
        AbstractC1439Aj8 abstractC1439Aj8 = c1562AlcA0B.A03.A0f.A02;
        if ((abstractC1439Aj8.aggregateChildKindSet & 8) != 0) {
            do {
                if ((abstractC1439Aj8.kindSet & 8) != 0) {
                    AbstractC1439Aj8 abstractC1439Aj8A0X = abstractC1439Aj8;
                    C0910AHm c0910AHmA0K = null;
                    do {
                        if (abstractC1439Aj8A0X instanceof InterfaceC1476Ajj) {
                            if (((InterfaceC1476Ajj) abstractC1439Aj8A0X).AOU()) {
                                return AbstractC1414Aij.A06(abstractC1439Aj8A0X, 8).APk(interfaceC1497Ak4, true);
                            }
                        } else if ((abstractC1439Aj8A0X.kindSet & 8) != 0 && (abstractC1439Aj8A0X instanceof AbstractC1437Aj6)) {
                            int i = 0;
                            for (AbstractC1439Aj8 abstractC1439Aj82 = ((AbstractC1437Aj6) abstractC1439Aj8A0X).A00; abstractC1439Aj82 != null; abstractC1439Aj82 = abstractC1439Aj82.child) {
                                if ((abstractC1439Aj82.kindSet & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        abstractC1439Aj8A0X = abstractC1439Aj82;
                                    } else {
                                        c0910AHmA0K = C8j5.A0K(c0910AHmA0K);
                                        abstractC1439Aj8A0X = C8j4.A0X(c0910AHmA0K, abstractC1439Aj8A0X);
                                        c0910AHmA0K.A0G(abstractC1439Aj82);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC1439Aj8A0X = AbstractC1414Aij.A00(c0910AHmA0K);
                    } while (abstractC1439Aj8A0X != null);
                }
                if ((abstractC1439Aj8.aggregateChildKindSet & 8) == 0) {
                    break;
                }
                abstractC1439Aj8 = abstractC1439Aj8.child;
            } while (abstractC1439Aj8 != null);
        }
        return A00(interfaceC1497Ak4, c1562AlcA0B);
    }

    private final void A02(C1453AjM c1453AjM, List list) {
        C0910AHm<C1453AjM> c0910AHmA0C = c1453AjM.A0C();
        C1453AjM[] c1453AjMArr = c0910AHmA0C.A01;
        int i = c0910AHmA0C.A00;
        for (int i2 = 0; i2 < i; i2++) {
            C1453AjM c1453AjM2 = c1453AjMArr[i2];
            if (c1453AjM2.A0D != null && !c1453AjM2.A0R) {
                if (c1453AjM2.A0f.A09(8)) {
                    list.add(AbstractC1468Ajb.A00(c1453AjM2, this.A05));
                } else {
                    A02(c1453AjM2, list);
                }
            }
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/List<LX/Alc;>;Ljava/util/List<LX/Alc;>;)Ljava/util/List<LX/Alc;>; */
    private final void A04(List list, List list2) {
        if (this.A00 == null) {
            A02(this.A03, list);
        }
        int size = list.size();
        for (int size2 = list.size(); size2 < size; size2++) {
            C1562Alc c1562Alc = (C1562Alc) list.get(size2);
            if (c1562Alc.A05 && c1562Alc.A04.A01) {
                list2.add(c1562Alc);
            } else if (!c1562Alc.A04.A00) {
                c1562Alc.A04(list, list2);
            }
        }
    }

    public final AaC A05() {
        AaC aaCAPk;
        AbstractC1387AiH abstractC1387AiHA09 = A09();
        return (abstractC1387AiHA09 == null || !AZE.A03(abstractC1387AiHA09) || (aaCAPk = AbstractC1496Ak3.A01(abstractC1387AiHA09).APk(abstractC1387AiHA09, true)) == null) ? AaC.A04 : aaCAPk;
    }

    public final AaC A06() {
        AbstractC1387AiH abstractC1387AiHA09 = A09();
        return (abstractC1387AiHA09 == null || !AZE.A03(abstractC1387AiHA09)) ? AaC.A04 : AbstractC1496Ak3.A00(abstractC1387AiHA09, true);
    }

    public final AaC A07() {
        C1Z3 c1z3A01 = A01();
        if (c1z3A01 == null) {
            return this.A03.A0f.A07.A0k();
        }
        AbstractC1439Aj8 abstractC1439Aj8 = ((AbstractC1439Aj8) c1z3A01).node;
        boolean zA1X = AnonymousClass002.A1X(AlP.A01(this.A04, AbstractC1578Alt.A0B));
        if (!abstractC1439Aj8.node.isAttached) {
            return AaC.A04;
        }
        AbstractC1387AiH abstractC1387AiHA06 = AbstractC1414Aij.A06(abstractC1439Aj8, 8);
        return !zA1X ? AbstractC1496Ak3.A01(abstractC1387AiHA06).APk(abstractC1387AiHA06, true) : abstractC1387AiHA06.A0k();
    }

    public final AaC A08() {
        AbstractC1387AiH abstractC1387AiHA06;
        C1Z3 c1z3A01 = A01();
        if (c1z3A01 == null) {
            abstractC1387AiHA06 = this.A03.A0f.A07;
        } else {
            AbstractC1439Aj8 abstractC1439Aj8 = ((AbstractC1439Aj8) c1z3A01).node;
            boolean zA1X = AnonymousClass002.A1X(AlP.A01(this.A04, AbstractC1578Alt.A0B));
            if (!abstractC1439Aj8.node.isAttached) {
                return AaC.A04;
            }
            abstractC1387AiHA06 = AbstractC1414Aij.A06(abstractC1439Aj8, 8);
            if (zA1X) {
                return abstractC1387AiHA06.A0k();
            }
        }
        return AbstractC1496Ak3.A01(abstractC1387AiHA06).APk(abstractC1387AiHA06, false);
    }
}
