package X;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/* renamed from: X.Alg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1566Alg {
    public static final G0V<C1562Alc, C1562Alc, Integer> A00;
    public static final Comparator<C1562Alc>[] A01;

    static {
        Comparator<C1562Alc>[] comparatorArr = new Comparator[2];
        int i = 0;
        while (true) {
            Comparator comparator = C1568Ali.A00;
            while (true) {
                comparatorArr[i] = new BSG(new C1569Alj(comparator, C1453AjM.A0i), 7);
                i++;
                if (i >= 2) {
                    A01 = comparatorArr;
                    A00 = BUR.A00(29);
                    return;
                } else if (i != 0) {
                    comparator = C1567Alh.A00;
                }
            }
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Alc;LX/G0U<-LX/Alc;Ljava/lang/Boolean;>;LX/G0U<-LX/Alc;Ljava/lang/Boolean;>;Ljava/util/List<LX/Alc;>;)Ljava/util/List<LX/Alc;>; */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c7 A[LOOP:1: B:8:0x0043->B:20:0x00c7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d0 A[EDGE_INSN: B:42:0x00d0->B:23:0x00d0 BREAK  A[LOOP:2: B:13:0x0064->B:22:0x00cd]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[EDGE_INSN: B:40:0x00e0->B:24:0x00e0 BREAK  A[LOOP:1: B:8:0x0043->B:20:0x00c7], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList A00(X.C1562Alc r16, java.util.List r17, X.G0U r18, X.G0U r19) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1566Alg.A00(X.Alc, java.util.List, X.G0U, X.G0U):java.util.ArrayList");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Alc;Ljava/util/ArrayList<LX/Alc;>;LX/G0U<-LX/Alc;Ljava/lang/Boolean;>;LX/G0U<-LX/Alc;Ljava/lang/Boolean;>;LX/Ab2<Ljava/util/List<LX/Alc;>;>;)V */
    public static final void A01(Ab2 ab2, C1562Alc c1562Alc, ArrayList arrayList, G0U g0u, G0U g0u2) {
        Object objA05 = c1562Alc.A04.A03.A05(AbstractC1671Anw.A0O);
        if (objA05 == null) {
            objA05 = AnonymousClass001.A0h();
        }
        boolean zA1X = AnonymousClass001.A1X(objA05);
        if (zA1X || AnonymousClass003.A1X(c1562Alc, g0u2)) {
            if (AnonymousClass003.A1X(c1562Alc, g0u)) {
                arrayList.add(c1562Alc);
            }
            if (zA1X) {
                ab2.A0B(c1562Alc.A01, A00(c1562Alc, c1562Alc.A0C(!c1562Alc.A05, false), g0u, g0u2));
                return;
            }
        }
        List listA0C = c1562Alc.A0C(!c1562Alc.A05, false);
        int size = listA0C.size();
        for (int i = 0; i < size; i++) {
            A01(ab2, (C1562Alc) listA0C.get(i), arrayList, g0u, g0u2);
        }
    }
}
