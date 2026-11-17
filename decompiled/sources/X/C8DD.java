package X;

/* renamed from: X.8DD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8DD extends AbstractC3584CVf<C8DE> {
    public final C8DE A00 = new C8DE();
    public final C8DE A01 = new C8DE();

    @Override // X.AbstractC3584CVf
    public final /* bridge */ /* synthetic */ AbstractC3582CVd A01() {
        return new C8DE();
    }

    @Override // X.AbstractC3584CVf
    public final /* bridge */ /* synthetic */ boolean A02(AbstractC3582CVd abstractC3582CVd) {
        C8DE c8de = (C8DE) abstractC3582CVd;
        synchronized (this) {
            String strA00 = BV3.A00(40);
            if (c8de == null) {
                throw C60O.A0i(strA00);
            }
            c8de.appWakeups.clear();
            int i = 0;
            while (true) {
                C8DE c8de2 = this.A00;
                DQZ<String, C8DB> dqz = c8de2.appWakeups;
                if (i < dqz.size()) {
                    C8DB c8db = new C8DB();
                    C8DB c8dbA07 = dqz.A07(i);
                    c8db.A02 = c8dbA07.A02;
                    c8db.A00 = c8dbA07.A00;
                    c8db.A01 = c8dbA07.A01;
                    c8de.appWakeups.put(c8de2.appWakeups.A05(i), c8db);
                    i++;
                }
            }
        }
        return true;
    }
}
