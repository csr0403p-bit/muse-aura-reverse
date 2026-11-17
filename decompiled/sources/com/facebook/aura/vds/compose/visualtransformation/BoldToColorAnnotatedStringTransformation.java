package com.facebook.aura.vds.compose.visualtransformation;

import X.AnonymousClass006;
import X.ApQ;
import X.C06H;
import X.C0881AGi;
import X.C1731ApS;
import X.C1733ApU;
import X.C1736ApY;
import X.C1824Aro;
import X.C7384Etj;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class BoldToColorAnnotatedStringTransformation implements AnnotatedStringTransformation {
    public static final int $stable = 0;
    public final long boldColor;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: convert-4WTKRHQ, reason: not valid java name */
    private final ApQ m3111convert4WTKRHQ(ApQ apQ, long j) {
        C1731ApS c1731ApSA0W = AnonymousClass006.A0W();
        c1731ApSA0W.A0E(apQ.A00);
        for (C1733ApU<String> c1733ApU : apQ.A03(0, apQ.length())) {
            c1731ApSA0W.A0G(c1733ApU.A03, c1733ApU.A02, c1733ApU.A01, c1733ApU.A00);
        }
        List<C1733ApU> list = apQ.A03;
        if (list == null) {
            list = C0881AGi.A00;
        }
        for (C1733ApU c1733ApU2 : list) {
            C1824Aro c1824AroA01 = (C1824Aro) c1733ApU2.A02;
            if (C7384Etj.areEqual(c1824AroA01.A09, C1736ApY.A01)) {
                c1824AroA01 = C1824Aro.A01(c1824AroA01, 65534, j, 0L);
            }
            c1731ApSA0W.A0A(c1824AroA01, c1733ApU2.A01, c1733ApU2.A00);
        }
        return c1731ApSA0W.A04();
    }

    @Override // com.facebook.aura.vds.compose.visualtransformation.AnnotatedStringTransformation
    public ApQ filter(ApQ apQ) {
        C7384Etj.A0Y(apQ, 0);
        return !hasNoBold(apQ) ? m3111convert4WTKRHQ(apQ, this.boldColor) : apQ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean hasNoBold(ApQ apQ) {
        List list = apQ.A03;
        if (list == null) {
            list = C0881AGi.A00;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C7384Etj.areEqual(((C1824Aro) ((C1733ApU) it.next()).A02).A09, C1736ApY.A01)) {
                    return false;
                }
            }
        }
        return true;
    }

    public /* synthetic */ BoldToColorAnnotatedStringTransformation(long j, C06H c06h) {
        this(j);
    }

    public BoldToColorAnnotatedStringTransformation(long j) {
        this.boldColor = j;
    }
}
