package X;

import java.util.Iterator;

/* renamed from: X.CDc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3304CDc implements CEB<C3311CDk> {
    public final /* synthetic */ CDd A00;
    public final /* synthetic */ EnumC3305CDe A01;
    public final /* synthetic */ C7463Ews A02;
    public final /* synthetic */ C3303CDb A03;
    public final /* synthetic */ C3320CDz<C7Gm> A04;
    public final /* synthetic */ Iterator<C3309CDi> A05;

    @Override // X.CEB
    public final void onCompleted(AbstractC7391EuP<C3311CDk> abstractC7391EuP) {
        C7384Etj.A0Y(abstractC7391EuP, 0);
        C3311CDk c3311CDkA04 = abstractC7391EuP.A04();
        if (c3311CDkA04 == null) {
            CFK.A07("RequestManager", "No action result provided - use ActionResult to pass exceptions.");
            C3320CDz<C7Gm> c3320CDz = this.A04;
            if (c3320CDz != null) {
                c3320CDz.A00(C3cG.A0Q("No action result provided - use ActionResult to pass exceptions."));
                return;
            }
            return;
        }
        C7Gm c7Gm = c3311CDkA04.A00;
        C3320CDz<C7Gm> c3320CDz2 = this.A04;
        if (c3320CDz2 != null && c7Gm != null) {
            c3320CDz2.A00.A06(c7Gm);
            this.A02.A00 = c3311CDkA04.A01;
        }
        Iterator<C3309CDi> it = this.A05;
        if (!it.hasNext() && c3320CDz2 != null && !c3320CDz2.A00.A07()) {
            CFK.A0I("RequestManager", "All actions executed, but task is incomplete %s", this.A00.A00.toString());
            c3320CDz2.A00(C3cG.A0Q("All actions executed, but task is incomplete"));
        } else if (c3311CDkA04.A02 && it.hasNext()) {
            C3303CDb c3303CDb = this.A03;
            C7463Ews c7463Ews = this.A02;
            EnumC3305CDe enumC3305CDe = this.A01;
            if (c3320CDz2 == null || c3320CDz2.A00.A07()) {
                c3320CDz2 = null;
            }
            C3303CDb.A00(this.A00, enumC3305CDe, c7463Ews, c3303CDb, c3320CDz2, it);
        }
    }

    /* JADX WARN: Incorrect types in method signature: (LX/CDz<LX/7Gm;>;LX/Ews;Ljava/util/Iterator<LX/CDi;>;LX/CDd;LX/CDb;LX/CDe;)V */
    public C3304CDc(CDd cDd, EnumC3305CDe enumC3305CDe, C7463Ews c7463Ews, C3303CDb c3303CDb, C3320CDz c3320CDz, Iterator it) {
        this.A04 = c3320CDz;
        this.A02 = c7463Ews;
        this.A05 = it;
        this.A00 = cDd;
        this.A03 = c3303CDb;
        this.A01 = enumC3305CDe;
    }
}
