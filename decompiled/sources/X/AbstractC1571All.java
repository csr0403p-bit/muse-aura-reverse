package X;

import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.All, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1571All {
    public static final AaC A00 = new AaC(0.0f, 0.0f, 10.0f, 10.0f);

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[EDGE_INSN: B:65:0x00ee->B:48:0x00ee BREAK  A[LOOP:0: B:22:0x0064->B:68:?]] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.Ab2 r12, X.C1562Alc r13, X.C1562Alc r14, X.InterfaceC1574Alo r15, X.InterfaceC1574Alo r16, X.G0U r17) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1571All.A03(X.Ab2, X.Alc, X.Alc, X.Alo, X.Alo, X.G0U):void");
    }

    public static final Ab2 A00(C1557AlM c1557AlM, G0U g0u) {
        Ab2 ab2;
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C1562Alc c1562AlcA00 = c1557AlM.A00();
            C1453AjM c1453AjM = c1562AlcA00.A03;
            if (!c1453AjM.A0d.A0G.A0G || c1453AjM.A0D == null) {
                ab2 = AbstractC1489Ajw.A00;
            } else {
                AaC aaCA05 = c1562AlcA00.A05();
                ab2 = new Ab2(48);
                C1573Aln c1573Aln = new C1573Aln();
                c1573Aln.Acb(C2Un.A02(aaCA05));
                A03(ab2, c1562AlcA00, c1562AlcA00, new C1573Aln(), c1573Aln, g0u);
            }
            return ab2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void A02(Ab2 ab2, C1562Alc c1562Alc, C1562Alc c1562Alc2, InterfaceC1574Alo interfaceC1574Alo, InterfaceC1574Alo interfaceC1574Alo2, G0U g0u) {
        C1453AjM c1453AjM = c1562Alc2.A03;
        if (c1453AjM.A0d.A0G.A0G && c1453AjM.A0D != null) {
            Region region = ((C1573Aln) interfaceC1574Alo2).A00;
            if (!region.isEmpty()) {
                AaC aaCA07 = c1562Alc2.A07();
                if (aaCA07.A05()) {
                    aaCA07 = c1562Alc2.A08();
                }
                BLU bluA02 = C2Un.A02(aaCA07);
                interfaceC1574Alo.Acb(bluA02);
                if (((C1573Aln) interfaceC1574Alo).A00.op(region, Region.Op.INTERSECT)) {
                    int i = c1562Alc2.A01;
                    if (i == c1562Alc.A01) {
                        i = -1;
                    }
                    ab2.A0B(i, new C1629An1(c1562Alc2, interfaceC1574Alo.AD2()));
                    List listA0C = c1562Alc2.A0C(false, true);
                    for (int iA00 = C60O.A00(listA0C); -1 < iA00; iA00--) {
                        if (!AnonymousClass003.A1X(listA0C.get(iA00), g0u)) {
                            A02(ab2, c1562Alc, (C1562Alc) listA0C.get(iA00), interfaceC1574Alo, interfaceC1574Alo2, g0u);
                        }
                    }
                    if (A05(c1562Alc2)) {
                        region.op(bluA02.A01, bluA02.A03, bluA02.A02, bluA02.A00, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (c1562Alc2.A00 != null) {
            A01(ab2, c1562Alc, c1562Alc2);
        }
    }

    public static final void A01(Ab2 ab2, C1562Alc c1562Alc, C1562Alc c1562Alc2) {
        C1453AjM c1453AjM;
        C1562Alc c1562AlcA0B = c1562Alc2.A0B();
        AaC aaCA05 = (c1562AlcA0B == null || (c1453AjM = c1562AlcA0B.A03) == null || !c1453AjM.A0d.A0G.A0G) ? A00 : c1562AlcA0B.A05();
        int i = c1562Alc2.A01;
        if (i == c1562Alc.A01) {
            i = -1;
        }
        ab2.A0B(i, new C1629An1(c1562Alc2, C2Un.A02(aaCA05)));
    }

    public static final boolean A04(C1562Alc c1562Alc) {
        AbstractC1387AiH abstractC1387AiHA09 = c1562Alc.A09();
        if (abstractC1387AiHA09 == null || !abstractC1387AiHA09.A0z()) {
            C0919AHv c0919AHv = c1562Alc.A04;
            C0920AHw<Unit> c0920AHw = AbstractC1671Anw.A0B;
            C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHv.A03;
            if (!c0918AHu.A07(c0920AHw) && !c0918AHu.A07(AbstractC1671Anw.A0H)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean A05(C1562Alc c1562Alc) {
        if (A04(c1562Alc)) {
            return false;
        }
        C0919AHv c0919AHv = c1562Alc.A04;
        if (c0919AHv.A01) {
            return true;
        }
        C0918AHu<C0920AHw<?>, Object> c0918AHu = c0919AHv.A03;
        Object[] objArr = c0918AHu.A04;
        long[] jArr = c0918AHu.A03;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((C8j5.A0A(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                int iA0E = 8 - C8j3.A0E(i, length);
                for (int i2 = 0; i2 < iA0E; i2++) {
                    if ((255 & j) < 128 && ((C0920AHw) C8j3.A11(objArr, i, i2)).A00) {
                        return true;
                    }
                    j >>= 8;
                }
                if (iA0E != 8) {
                    return false;
                }
            }
            if (i == length) {
                return false;
            }
            i++;
        }
    }
}
