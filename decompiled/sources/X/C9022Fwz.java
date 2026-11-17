package X;

import X.InterfaceC9011Fwo;
import java.time.Instant;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fwz, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9022Fwz<T extends InterfaceC9011Fwo> implements InterfaceC9026Fx4<T> {
    public Instant A00;
    public ZoneOffset A01;
    public final InterfaceC9026Fx4<T> A02;
    public final Instant A03;

    public C9022Fwz(InterfaceC9026Fx4<T> interfaceC9026Fx4, Instant instant) {
        C7384Etj.A0Y(interfaceC9026Fx4, 0);
        this.A02 = interfaceC9026Fx4;
        this.A03 = instant;
    }

    @Override // X.InterfaceC9026Fx4
    public final void AYb(T t) {
        Instant instantAKy;
        ZoneOffset zoneOffsetAKz;
        C7384Etj.A0Y(t, 0);
        if (t instanceof Fx5) {
            Fx5 fx5 = (Fx5) t;
            instantAKy = fx5.ALd();
            zoneOffsetAKz = fx5.AMx();
        } else {
            if (t instanceof InterfaceC9010Fwn) {
                List listAJw = ((InterfaceC9010Fwn) t).AJw();
                ArrayList arrayListA0h = C3cG.A0h();
                for (Object obj : listAJw) {
                    if (C9019Fww.A02(obj).compareTo(this.A03) >= 0) {
                        arrayListA0h.add(obj);
                    }
                }
                Iterator it = arrayListA0h.iterator();
                if (!it.hasNext()) {
                    throw C8j3.A1D();
                }
                instantAKy = C9019Fww.A02(it.next());
                while (it.hasNext()) {
                    Instant instantA02 = C9019Fww.A02(it.next());
                    if (instantAKy.compareTo(instantA02) > 0) {
                        instantAKy = instantA02;
                    }
                }
            } else {
                if (!(t instanceof InterfaceC9020Fwx)) {
                    throw AbstractC7607F5u.A10(t, "Unsupported record ");
                }
                instantAKy = ((InterfaceC9020Fwx) t).AKy();
            }
            if (!(t instanceof InterfaceC9020Fwx)) {
                throw AbstractC7607F5u.A10(t, "Unsupported record ");
            }
            zoneOffsetAKz = ((InterfaceC9020Fwx) t).AKz();
        }
        Instant instant = this.A00;
        if (instant == null || instantAKy.compareTo(instant) < 0) {
            this.A00 = instantAKy;
            this.A01 = zoneOffsetAKz;
        }
        this.A02.AYb(t);
    }

    @Override // X.InterfaceC9026Fx4
    public final C8990FwS AJ8() {
        return this.A02.AJ8();
    }
}
