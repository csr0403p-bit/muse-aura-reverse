package X;

import androidx.compose.ui.platform.AndroidComposeView;

/* renamed from: X.Aij, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1414Aij {
    public static final AbstractC1387AiH A05(C1Z3 c1z3) {
        String str;
        if (((AbstractC1439Aj8) c1z3).node.isAttached) {
            AbstractC1387AiH abstractC1387AiHA06 = A06(c1z3, 2);
            if (AZE.A03(abstractC1387AiHA06)) {
                return abstractC1387AiHA06;
            }
            str = "LayoutCoordinates is not attached.";
        } else {
            str = "Cannot get LayoutCoordinates, Modifier.Node is not attached.";
        }
        ASP.A01(str);
        throw F60.createAndThrow();
    }

    public static final AbstractC1387AiH A06(C1Z3 c1z3, int i) {
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1439Aj8) c1z3).node.coordinator;
        C7384Etj.A0X(abstractC1387AiH);
        if (abstractC1387AiH.A0j() == c1z3) {
            AeA<Object> aeA = AbstractC1436Aj5.A00;
            if ((128 & i) != 0) {
                AbstractC1387AiH abstractC1387AiH2 = abstractC1387AiH.A08;
                C7384Etj.A0X(abstractC1387AiH2);
                return abstractC1387AiH2;
            }
        }
        return abstractC1387AiH;
    }

    public static final AbstractC1439Aj8 A00(C0910AHm<AbstractC1439Aj8> c0910AHm) {
        int i;
        if (c0910AHm == null || (i = c0910AHm.A00) == 0) {
            return null;
        }
        return c0910AHm.A07(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v5, types: [X.Aj8] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public static final InterfaceC1208Aeg A03(C1Z3 c1z3) {
        C1438Aj7 c1438Aj7;
        Object obj;
        AbstractC1439Aj8 abstractC1439Aj8 = ((AbstractC1439Aj8) c1z3).node;
        if (!abstractC1439Aj8.isAttached) {
            ASP.A01("visitAncestors called on an unattached node");
            throw F60.createAndThrow();
        }
        AbstractC1439Aj8 abstractC1439Aj82 = abstractC1439Aj8.parent;
        C1453AjM c1453AjMA04 = A04(c1z3);
        while (c1453AjMA04 != null) {
            AbstractC1437Aj6 abstractC1437Aj6 = abstractC1439Aj82;
            if (C1438Aj7.A00(c1453AjMA04, 8388640) != 0) {
                while (abstractC1437Aj6 != 0) {
                    int i = abstractC1437Aj6.kindSet;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(abstractC1437Aj6 instanceof Aef)) {
                                if (abstractC1437Aj6 instanceof AbstractC1437Aj6) {
                                    AbstractC1439Aj8 abstractC1439Aj83 = abstractC1437Aj6.A00;
                                    abstractC1437Aj6 = 0;
                                    while (abstractC1439Aj83 != null) {
                                        if (abstractC1439Aj83 instanceof Aef) {
                                            abstractC1437Aj6 = abstractC1439Aj83;
                                        }
                                        abstractC1439Aj83 = abstractC1439Aj83.child;
                                        abstractC1437Aj6 = abstractC1437Aj6;
                                    }
                                } else {
                                    abstractC1437Aj6 = 0;
                                }
                            }
                            Aef aef = (Aef) abstractC1437Aj6;
                            if (aef != null) {
                                return (C1206Aed) aef;
                            }
                            return null;
                        }
                        if ((i & 32) == 0) {
                            continue;
                        } else {
                            if (abstractC1437Aj6 instanceof InterfaceC1219Aex) {
                                obj = abstractC1437Aj6;
                            } else if (abstractC1437Aj6 instanceof AbstractC1437Aj6) {
                                obj = null;
                                for (AbstractC1439Aj8 abstractC1439Aj84 = abstractC1437Aj6.A00; abstractC1439Aj84 != null; abstractC1439Aj84 = abstractC1439Aj84.child) {
                                    if (abstractC1439Aj84 instanceof InterfaceC1219Aex) {
                                        obj = abstractC1439Aj84;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            InterfaceC1219Aex interfaceC1219Aex = (InterfaceC1219Aex) obj;
                            if (interfaceC1219Aex != null) {
                                ARP arpAJE = interfaceC1219Aex.AJE();
                                ARR<InterfaceC1208Aeg> arr = AbstractC1415Aik.A00;
                                if (arpAJE.A02(arr)) {
                                    return (InterfaceC1208Aeg) arpAJE.A00(arr);
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    abstractC1437Aj6 = abstractC1437Aj6.parent;
                }
            }
            c1453AjMA04 = c1453AjMA04.A0E();
            abstractC1439Aj82 = (c1453AjMA04 == null || (c1438Aj7 = c1453AjMA04.A0f) == null) ? null : c1438Aj7.A06;
        }
        return null;
    }

    public static final C1453AjM A04(C1Z3 c1z3) {
        AbstractC1387AiH abstractC1387AiH = ((AbstractC1439Aj8) c1z3).node.coordinator;
        if (abstractC1387AiH != null) {
            return abstractC1387AiH.A0P;
        }
        throw C3cG.A0Q("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static InterfaceC1536Aks A01(C1Z3 c1z3) {
        return ((AndroidComposeView) A07(c1z3)).A0h;
    }

    public static ASQ A02(C1Z3 c1z3) {
        return ((AndroidComposeView) A07(c1z3)).A0i;
    }

    public static final InterfaceC1464AjX A07(C1Z3 c1z3) {
        InterfaceC1464AjX interfaceC1464AjX = A04(c1z3).A0D;
        if (interfaceC1464AjX != null) {
            return interfaceC1464AjX;
        }
        throw C3cG.A0Q("This node does not have an owner.");
    }

    public static AXN A08(C1Z3 c1z3) {
        return A04(c1z3).A0F;
    }

    public static final void A09(C0910AHm c0910AHm, AbstractC1439Aj8 abstractC1439Aj8) {
        C0910AHm<C1453AjM> c0910AHmA0D = A04(abstractC1439Aj8).A0D();
        int i = c0910AHmA0D.A00 - 1;
        C1453AjM[] c1453AjMArr = c0910AHmA0D.A01;
        if (i < c1453AjMArr.length) {
            while (i >= 0) {
                c0910AHm.A0G(c1453AjMArr[i].A0f.A02);
                i--;
            }
        }
    }
}
