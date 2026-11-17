package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.CDb, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3303CDb {
    public final C3312CDl A00;
    public final CDQ A01;
    public final InterfaceC3307CDg A02;
    public final Collection A03;
    public final Executor A04;
    public final CDv A05;

    public C3303CDb(C3312CDl c3312CDl, CDQ cdq, CDv cDv, InterfaceC3307CDg interfaceC3307CDg, Collection collection, Executor executor) {
        AnonymousClass002.A1C(executor, 3, interfaceC3307CDg);
        this.A03 = collection;
        this.A00 = c3312CDl;
        this.A01 = cdq;
        this.A04 = executor;
        this.A02 = interfaceC3307CDg;
        this.A05 = cDv;
    }

    public static final void A00(CDd cDd, EnumC3305CDe enumC3305CDe, C7463Ews c7463Ews, C3303CDb c3303CDb, C3320CDz c3320CDz, Iterator it) {
        C3311CDk c3311CDk;
        if (!it.hasNext()) {
            CFK.A0I("RequestManager", "executeAction is called when no actions exist %s", cDd.A00.toString());
            if (c3320CDz != null) {
                c3320CDz.A00(C3cG.A0Q("executeAction is called when no actions exist"));
                return;
            }
            return;
        }
        C3309CDi c3309CDi = (C3309CDi) it.next();
        C3320CDz c3320CDz2 = new C3320CDz();
        CE0<TResult> ce0 = c3320CDz2.A00;
        Executor executor = c3303CDb.A04;
        ce0.A05(new C3304CDc(cDd, enumC3305CDe, c7463Ews, c3303CDb, c3320CDz, it), executor);
        if (c3309CDi != null) {
            switch (c3309CDi.A00.intValue()) {
                case 0:
                    Set<String> set = c3309CDi.A01;
                    Iterator it2 = c3303CDb.A03.iterator();
                    if (it2.hasNext()) {
                        it2.next();
                        throw BV4.A0a("onDownloadBatchStart");
                    }
                    c3303CDb.A02.startDownload(new C3306CDf(enumC3305CDe, set)).A05(new F4Z(cDd, c3320CDz2, c3303CDb, 0), executor);
                    return;
                case 1:
                    executor.execute(new RunnableC3300CCx(cDd, c3303CDb, c3320CDz2, c3309CDi.A01));
                    return;
                case 2:
                    c3303CDb.A02.deferInstall(new C3306CDf(enumC3305CDe, c3309CDi.A01));
                    c3311CDk = new C3311CDk(null, null, true);
                    break;
                case 3:
                case 5:
                case 7:
                default:
                    return;
                case 4:
                    c3311CDk = new C3311CDk(new C7Gm(null, null, -1, true, false), null, true);
                    break;
                case 6:
                    c3311CDk = new C3311CDk(new C7Gm(null, null, -2, false, true), null, true);
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                    c3311CDk = new C3311CDk(new C7Gm(null, null, -1, false, false), null, true);
                    break;
            }
            ce0.A06(c3311CDk);
        }
    }
}
