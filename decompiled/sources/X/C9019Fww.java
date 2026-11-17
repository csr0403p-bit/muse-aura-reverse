package X;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Fww, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9019Fww {
    public static final C9019Fww A00 = new C9019Fww();

    /* JADX WARN: Incorrect types in method signature: (LX/Fwx;LX/Fx6<*>;)D */
    public static final double A00(Fx6 fx6, InterfaceC9020Fwx interfaceC9020Fwx) {
        Instant instant;
        Instant instant2;
        C7384Etj.A0Y(interfaceC9020Fwx, 0);
        if (fx6 instanceof C9018Fwv) {
            C9018Fwv c9018Fwv = (C9018Fwv) fx6;
            instant = c9018Fwv.A01;
            instant2 = c9018Fwv.A00;
        } else {
            if (!(fx6 instanceof C9017Fwu)) {
                throw C3cG.A0q();
            }
            C9017Fwu c9017Fwu = (C9017Fwu) fx6;
            LocalDateTime localDateTime = c9017Fwu.A01;
            ZoneId zoneIdAKz = interfaceC9020Fwx.AKz();
            if (zoneIdAKz == null) {
                zoneIdAKz = ZoneId.systemDefault();
            }
            instant = localDateTime.atZone(zoneIdAKz).toInstant();
            C7384Etj.A0U(instant);
            LocalDateTime localDateTime2 = c9017Fwu.A00;
            ZoneId zoneIdAFE = interfaceC9020Fwx.AFE();
            if (zoneIdAFE == null) {
                zoneIdAFE = ZoneId.systemDefault();
            }
            instant2 = localDateTime2.atZone(zoneIdAFE).toInstant();
            C7384Etj.A0U(instant2);
        }
        Instant instantAFC = interfaceC9020Fwx.AFC();
        C7384Etj.A0Y(instantAFC, 0);
        if (instantAFC.compareTo(instant2) > 0) {
            instantAFC = instant2;
        }
        Instant instantAKy = interfaceC9020Fwx.AKy();
        Instant instant3 = (Instant) HrB.A01(instantAKy, instant);
        C7384Etj.A0Y(instant3, 1);
        C7384Etj.A0U(Duration.between(instant3, instantAFC));
        C7384Etj.A0Y(instantAFC, 0);
        C7384Etj.A0Y(instantAKy, 1);
        C7384Etj.A0U(Duration.between(instantAKy, instantAFC));
        return Math.max(0.0d, r0.toMillis() / r2.toMillis());
    }

    public static final double A01(Object obj) {
        C7384Etj.A0Y(obj, 0);
        if (obj instanceof C8874Frn) {
            return ((C8874Frn) obj).A00;
        }
        if (obj instanceof C9028Fx8) {
            C9078Fy5 c9078Fy5 = ((C9028Fx8) obj).A00;
            return c9078Fy5.A00 * c9078Fy5.A01.A00();
        }
        if (obj instanceof C8875Fro) {
            return ((C8875Fro) obj).A00;
        }
        throw AbstractC7607F5u.A10(obj, "Unsupported type for value: ");
    }

    public static final Instant A02(Object obj) {
        C7384Etj.A0Y(obj, 0);
        if (obj instanceof C8874Frn) {
            return ((C8874Frn) obj).A01;
        }
        if (obj instanceof C9028Fx8) {
            return ((C9028Fx8) obj).A01;
        }
        if (obj instanceof C8875Fro) {
            return ((C8875Fro) obj).A01;
        }
        throw AbstractC7607F5u.A10(obj, "Unsupported type for time: ");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/Fwo;LX/Fx6<*>;)Z */
    public final boolean A03(Fx6 fx6, InterfaceC9011Fwo interfaceC9011Fwo) {
        C7384Etj.A0Y(fx6, 1);
        if (interfaceC9011Fwo instanceof C9056Fxe) {
            C9056Fxe c9056Fxe = (C9056Fxe) interfaceC9011Fwo;
            return AbstractC9016Fwt.A00(fx6, c9056Fxe.A05, c9056Fxe.A06);
        }
        if (interfaceC9011Fwo instanceof C9046FxU) {
            if (((C9046FxU) interfaceC9011Fwo).A0Y != null && A00(fx6, (InterfaceC9020Fwx) interfaceC9011Fwo) > 0.0d) {
                return true;
            }
        } else {
            if (!(interfaceC9011Fwo instanceof InterfaceC9010Fwn)) {
                throw BV5.A0U("Unsupported record type for aggregation fallback: ", C60O.A0p(C3cG.A0x(interfaceC9011Fwo.getClass()), AbstractC9050FxY.A00));
            }
            InterfaceC9010Fwn interfaceC9010Fwn = (InterfaceC9010Fwn) interfaceC9011Fwo;
            List listAJw = interfaceC9010Fwn.AJw();
            if (!(listAJw instanceof Collection) || !listAJw.isEmpty()) {
                Iterator it = listAJw.iterator();
                while (it.hasNext()) {
                    if (AbstractC9016Fwt.A00(fx6, A02(it.next()), interfaceC9010Fwn.AKz())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
