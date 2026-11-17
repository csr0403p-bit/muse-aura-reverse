package X;

import android.util.Log;

/* renamed from: X.8DE, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C8DE extends AbstractC3582CVd<C8DE> {
    public static final long serialVersionUID = 1;
    public DQZ<String, C8DB> appWakeups = new DQZ<>();

    @Override // X.AbstractC3582CVd
    public final /* bridge */ /* synthetic */ void A01(AbstractC3582CVd abstractC3582CVd) {
        DQZ<String, C8DB> dqz = this.appWakeups;
        dqz.clear();
        dqz.A0A(((C8DE) abstractC3582CVd).appWakeups);
    }

    @Override // X.AbstractC3582CVd
    public final /* bridge */ /* synthetic */ void A02(AbstractC3582CVd abstractC3582CVd, AbstractC3582CVd abstractC3582CVd2) {
        long j;
        C8DE c8de = (C8DE) abstractC3582CVd;
        C8DE c8de2 = (C8DE) abstractC3582CVd2;
        if (c8de2 == null) {
            c8de2 = new C8DE();
        }
        DQZ<String, C8DB> dqz = c8de2.appWakeups;
        if (c8de == null) {
            dqz.clear();
            dqz.A0A(this.appWakeups);
            return;
        }
        dqz.clear();
        int i = 0;
        while (true) {
            DQZ<String, C8DB> dqz2 = this.appWakeups;
            if (i >= dqz2.size()) {
                return;
            }
            String strA05 = dqz2.A05(i);
            DQZ<String, C8DB> dqz3 = c8de2.appWakeups;
            C8DB c8dbA07 = this.appWakeups.A07(i);
            c8dbA07.getClass();
            Integer num = c8dbA07.A02;
            C8DB c8db = new C8DB();
            c8db.A02 = num;
            c8db.A00 = 0L;
            c8db.A01 = 0L;
            dqz3.put(strA05, c8db);
            C8DB c8dbA072 = this.appWakeups.A07(i);
            C8DB c8db2 = c8de.appWakeups.get(strA05);
            C8DB c8db3 = c8de2.appWakeups.get(strA05);
            if (c8db2 == null) {
                c8db3.A02 = c8dbA072.A02;
                c8db3.A00 = c8dbA072.A00;
                j = c8dbA072.A01;
            } else {
                if (c8db2.A02 != c8dbA072.A02) {
                    Log.e("AppWakeupMetrics", FGI.A0d("Diff only allowed for similar kind of wakeups: ", c8dbA072.toString(), ", ", c8db2.toString()), null);
                }
                c8db3.A02 = c8dbA072.A02;
                c8db3.A00 = c8dbA072.A00 - c8db2.A00;
                j = c8dbA072.A01 - c8db2.A01;
            }
            c8db3.A01 = j;
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AbstractC7485Exn.A00(this.appWakeups, ((C8DE) obj).appWakeups);
    }

    public final int hashCode() {
        return C60R.A01(this.appWakeups);
    }

    public final String toString() {
        StringBuilder sbA0w = C60O.A0w();
        int i = 0;
        while (true) {
            DQZ<String, C8DB> dqz = this.appWakeups;
            if (i >= dqz.size()) {
                return sbA0w.toString();
            }
            sbA0w.append(dqz.A05(i));
            sbA0w.append(": ");
            sbA0w.append(this.appWakeups.A07(i));
            sbA0w.append(", ");
            i++;
        }
    }
}
