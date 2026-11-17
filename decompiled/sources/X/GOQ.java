package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class GOQ extends GOR {
    public final C9537GNt A00;

    private final GOS A00() {
        ArrayList arrayList = this.A00.A04;
        Object obj = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((GOO) next).A01 == null) {
                obj = next;
                break;
            }
        }
        GOO goo = (GOO) obj;
        if (goo != null) {
            return (GOS) AbstractC0878AGe.A0G(goo.A00.A00);
        }
        return null;
    }

    @Override // X.GOU
    public final String AKi() {
        String str = this.A00.A00;
        C7384Etj.A0U(str);
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0113  */
    @Override // X.GOU
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.GPO> ALF() {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GOQ.ALF():java.util.List");
    }

    public GOQ(C9537GNt c9537GNt) {
        this.A00 = c9537GNt;
    }

    @Override // X.GOU
    public final String AJ2() {
        String str;
        GOS gosA00 = A00();
        return (gosA00 == null || (str = gosA00.A03) == null) ? "" : str;
    }

    @Override // X.GOU
    public final long AJ3() {
        GOS gosA00 = A00();
        if (gosA00 != null) {
            return gosA00.A02;
        }
        return 0L;
    }

    @Override // X.GOU
    public final String AJ4() {
        String str;
        GOS gosA00 = A00();
        return (gosA00 == null || (str = gosA00.A04) == null) ? "" : str;
    }

    @Override // X.GOU
    public final C10574Huh AJI() {
        return new C10574Huh((int) (AJ3() / 10000), AJ4());
    }
}
