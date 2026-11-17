package X;

import java.util.Iterator;

/* renamed from: X.DoM, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5727DoM implements Dv4 {
    public final /* synthetic */ C5615Dlu A00;

    public C5727DoM(C5615Dlu c5615Dlu) {
        this.A00 = c5615Dlu;
    }

    @Override // X.Dv4
    public final void AN4(int i, Object obj) {
        Iterator it = this.A00.A0l.iterator();
        while (it.hasNext()) {
            ((C5621Dm4) it.next()).A00.A2A.AUb();
        }
    }
}
