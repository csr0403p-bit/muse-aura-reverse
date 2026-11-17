package X;

import android.content.Context;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class EKZ implements InterfaceC6635ELf, EMu {
    public static final String A0A = EK9.A01("SystemFgDispatcher");
    public EK5 A00;
    public InterfaceC6632ELc A01;
    public C6630ELa A02;
    public Context A03;
    public final C6625EKu A04;
    public final ENP A05;
    public final Object A06 = C3cG.A0T();
    public final Map<C6630ELa, C6617EKk> A07;
    public final Map<C6630ELa, HoC> A08;
    public final Map<C6630ELa, EKE> A09;

    public final void A00() {
        this.A01 = null;
        synchronized (this.A06) {
            Iterator itA10 = BV5.A10(this.A08);
            while (itA10.hasNext()) {
                ((HoC) itA10.next()).A5w(null);
            }
        }
        EKU eku = this.A00.A03;
        synchronized (eku.A09) {
            eku.A0A.remove(this);
        }
    }

    @Override // X.EMu
    public final void ASQ(ENN workSpec, EKE state) {
        if (workSpec instanceof C6645ELp) {
            BV4.A1E(EK9.A00(), "Constraints unmet for WorkSpec ", state.A0O, A0A);
            EK5 ek5 = this.A00;
            C6630ELa c6630ELaA00 = AbstractC6646ELq.A00(state);
            int i = ((C6645ELp) workSpec).A00;
            ENP enp = ek5.A06;
            ((C6616EKj) enp).A01.execute(new EKT(ek5.A03, new EMx(c6630ELaA00), i, true));
        }
    }

    @Override // X.InterfaceC6635ELf
    public final void ATA(C6630ELa id, boolean needsReschedule) {
        Map.Entry entryA0l;
        HoC hoCRemove;
        synchronized (this.A06) {
            if (this.A09.remove(id) != null && (hoCRemove = this.A08.remove(id)) != null) {
                hoCRemove.A5w(null);
            }
        }
        Map<C6630ELa, C6617EKk> map = this.A07;
        C6617EKk c6617EKkRemove = map.remove(id);
        if (id.equals(this.A02)) {
            if (map.size() > 0) {
                Iterator itA0n = AnonymousClass002.A0n(map);
                do {
                    entryA0l = C3cH.A0l(itA0n);
                } while (itA0n.hasNext());
                this.A02 = (C6630ELa) entryA0l.getKey();
                if (this.A01 != null) {
                    C6617EKk c6617EKk = (C6617EKk) entryA0l.getValue();
                    InterfaceC6632ELc interfaceC6632ELc = this.A01;
                    int i = c6617EKk.A01;
                    interfaceC6632ELc.Ag3(i, c6617EKk.A02, c6617EKk.A00);
                    ((SystemForegroundService) this.A01).A00.cancel(i);
                }
            } else {
                this.A02 = null;
            }
        }
        InterfaceC6632ELc interfaceC6632ELc2 = this.A01;
        if (c6617EKkRemove == null || interfaceC6632ELc2 == null) {
            return;
        }
        EK9 ek9A00 = EK9.A00();
        String str = A0A;
        StringBuilder sbA0x = C60O.A0x("Removing Notification (id: ");
        int i2 = c6617EKkRemove.A01;
        sbA0x.append(i2);
        sbA0x.append(", workSpecId: ");
        sbA0x.append(id);
        sbA0x.append(", notificationType: ");
        ek9A00.A02(str, BV4.A0l(sbA0x, c6617EKkRemove.A00));
        ((SystemForegroundService) interfaceC6632ELc2).A00.cancel(i2);
    }

    public EKZ(Context context) {
        this.A03 = context;
        EK5 ek5A00 = EK5.A00(context);
        this.A00 = ek5A00;
        this.A05 = ek5A00.A06;
        this.A02 = null;
        this.A07 = C3cG.A0j();
        this.A08 = BV4.A0u();
        this.A09 = BV4.A0u();
        this.A04 = new C6625EKu(ek5A00.A09);
        this.A00.A03.A02(this);
    }

    public final void A01(int startId, int fgsType) {
        EK9.A00();
        Log.i(A0A, FGI.A0H("Foreground service timed out, FGS type: ", fgsType));
        Iterator itA0n = AnonymousClass002.A0n(this.A07);
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            if (((C6617EKk) entryA0l.getValue()).A00 == fgsType) {
                C6630ELa c6630ELa = (C6630ELa) entryA0l.getKey();
                EK5 ek5 = this.A00;
                ENP enp = ek5.A06;
                ((C6616EKj) enp).A01.execute(new EKT(ek5.A03, new EMx(c6630ELa), -128, true));
            }
        }
        BV9.A04(this, startId);
    }
}
