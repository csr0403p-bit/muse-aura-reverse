package X;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class DB0 extends DAZ {
    public List<? extends DBA> A00;
    public final C4880DAz A01;
    public final String A02;
    public final List<HxE<DB6, Eu4>> A03;
    public final F18<DBB> A04;
    public final F18<DK9> A05;

    @Override // X.DAZ, X.DAu
    public final void ATc(String str) {
        C7384Etj.A0Y(str, 0);
        List<? extends DBA> list = this.A00;
        if (list != null) {
            Iterator<? extends DBA> it = list.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }

    @Override // X.DAu
    public final void onActivityResumed(Activity activity) {
        C7384Etj.A0Y(activity, 0);
        List<? extends DBA> list = this.A00;
        if (list != null) {
            Iterator<? extends DBA> it = list.iterator();
            while (it.hasNext()) {
                it.next().onActivityResumed(activity);
            }
        }
    }

    @Override // X.DAZ
    public final F18<DK9> A01() {
        return this.A05;
    }

    @Override // X.DAZ
    public final F18<DBB> A02() {
        return this.A04;
    }

    @Override // X.DAZ
    public final void A03() {
        this.A01.A00.set(0);
        List<HxE<DB6, Eu4>> list = this.A03;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        int i = 0;
        for (HxE<DB6, Eu4> hxE : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            arrayListA0i.add(hxE.first.install(new C4875DAc(this, i), new EQe(this, 18), new C4879DAy(this, i)));
            i = i2;
        }
        this.A00 = arrayListA0i;
    }

    @Override // X.DAZ
    public final void A04() {
        List<? extends DBA> list = this.A00;
        if (list != null) {
            Iterator<? extends DBA> it = list.iterator();
            while (it.hasNext()) {
                it.next().uninstall();
            }
        }
        this.A00 = null;
    }

    @Override // X.DAu
    public final String getName() {
        return this.A02;
    }

    public DB0(List list, F18 f18, F18 f182) {
        this.A05 = f18;
        this.A04 = f182;
        this.A03 = list;
        this.A02 = FGI.A0M("Signal|", AbstractC06907md.A01(",", list, new EY5(22)));
        int size = list.size();
        int i = 0;
        Iterator<Integer> it = ATD.A0C(0, size).iterator();
        while (it.hasNext()) {
            int iA00 = ((BNt) it).A00();
            if (Boolean.valueOf(this.A03.get(iA00).second == Eu4.A03).booleanValue()) {
                i |= 1 << iA00;
            }
        }
        if (size > 32) {
            throw BV4.A0N("In order to support more than 32 lifecycle definitions increase state size and verify bitwise operations");
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 |= 1 << i3;
        }
        this.A01 = new C4880DAz(i2, i);
    }
}
