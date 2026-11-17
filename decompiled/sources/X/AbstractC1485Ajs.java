package X;

/* renamed from: X.Ajs, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1485Ajs {
    public static final C1506AkD A01(C1506AkD c1506AkD) {
        C1506AkD c1506AkD2;
        int iA00;
        AbstractC1439Aj8 abstractC1439Aj8 = c1506AkD.node;
        if (!abstractC1439Aj8.isAttached) {
            return null;
        }
        C0910AHm c0910AHmA02 = C0910AHm.A02(new AbstractC1439Aj8[16], 0);
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.child;
        if (abstractC1439Aj82 == null) {
            AbstractC1414Aij.A09(c0910AHmA02, abstractC1439Aj8);
        } else {
            c0910AHmA02.A0G(abstractC1439Aj82);
        }
        loop0: while (true) {
            int i = c0910AHmA02.A00;
            if (i == 0) {
                return null;
            }
            AbstractC1439Aj8 abstractC1439Aj8A03 = C0910AHm.A03(c0910AHmA02, i);
            if ((abstractC1439Aj8A03.aggregateChildKindSet & 1024) == 0) {
                AbstractC1414Aij.A09(c0910AHmA02, abstractC1439Aj8A03);
            } else {
                while (true) {
                    if ((abstractC1439Aj8A03.kindSet & 1024) != 0) {
                        C0910AHm c0910AHmA0W = null;
                        do {
                            if (abstractC1439Aj8A03 instanceof C1506AkD) {
                                c1506AkD2 = (C1506AkD) abstractC1439Aj8A03;
                                if (c1506AkD2.node.isAttached && ((iA00 = C1506AkD.A00(c1506AkD2)) == 0 || iA00 == 1)) {
                                    break loop0;
                                }
                            } else if ((abstractC1439Aj8A03.kindSet & 1024) != 0 && (abstractC1439Aj8A03 instanceof AbstractC1437Aj6)) {
                                int i2 = 0;
                                for (AbstractC1439Aj8 abstractC1439Aj83 = ((AbstractC1437Aj6) abstractC1439Aj8A03).A00; abstractC1439Aj83 != null; abstractC1439Aj83 = abstractC1439Aj83.child) {
                                    if ((abstractC1439Aj83.kindSet & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            abstractC1439Aj8A03 = abstractC1439Aj83;
                                        } else {
                                            c0910AHmA0W = C8j4.A0W(c0910AHmA0W);
                                            abstractC1439Aj8A03 = C8j4.A0X(c0910AHmA0W, abstractC1439Aj8A03);
                                            c0910AHmA0W.A0G(abstractC1439Aj83);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1439Aj8A03 = AbstractC1414Aij.A00(c0910AHmA0W);
                        } while (abstractC1439Aj8A03 != null);
                    } else {
                        abstractC1439Aj8A03 = abstractC1439Aj8A03.child;
                        if (abstractC1439Aj8A03 != null) {
                        }
                    }
                }
            }
        }
        return c1506AkD2;
    }

    public static final AaC A02(C1506AkD c1506AkD) {
        AbstractC1387AiH abstractC1387AiH;
        InterfaceC1497Ak4 interfaceC1497Ak4A01;
        return (!c1506AkD.isAttached || (abstractC1387AiH = c1506AkD.coordinator) == null || (interfaceC1497Ak4A01 = AbstractC1496Ak3.A01(abstractC1387AiH)) == null || !interfaceC1497Ak4A01.isAttached()) ? AaC.A04 : c1506AkD.A04(interfaceC1497Ak4A01);
    }

    public static final boolean A03(C1506AkD c1506AkD) {
        C1453AjM c1453AjM;
        AbstractC1387AiH abstractC1387AiH = c1506AkD.coordinator;
        return (abstractC1387AiH == null || (c1453AjM = abstractC1387AiH.A0P) == null || !c1453AjM.A0d.A0G.A0G || c1453AjM.A0D == null) ? false : true;
    }

    public static final C1506AkD A00(C1506AkD c1506AkD) {
        C1506AkD c1506AkDACD = AbstractC1414Aij.A01(c1506AkD).ACD();
        if (c1506AkDACD == null || !c1506AkDACD.isAttached) {
            return null;
        }
        return c1506AkDACD;
    }
}
