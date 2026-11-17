package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class HxQ {
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC7487Exq A01(X.FDW r13, X.InterfaceC10557Hsn r14, long r15) {
        /*
            Method dump skipped, instructions count: 577
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.HxQ.A01(X.FDW, X.Hsn, long):X.Exq");
    }

    public static final EtN A00(C7377EtL c7377EtL, FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, long j) {
        AnonymousClass005.A0y(fdw, c7377EtL, interfaceC10557Hsn);
        List<FDW> listA0G = fdw.A0G();
        C7384Etj.A0U(listA0G);
        ArrayList arrayListA0i = AnonymousClass003.A0i(listA0G);
        Iterator<FDW> it = listA0G.iterator();
        while (it.hasNext()) {
            arrayListA0i.add(A01(AbstractC7609F5w.A0i(it), interfaceC10557Hsn, j));
        }
        return new EtN(c7377EtL, arrayListA0i);
    }
}
