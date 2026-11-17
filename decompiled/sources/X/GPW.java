package X;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
public abstract class GPW {
    public static final void A00(GOU gou, InterfaceC9568GPa interfaceC9568GPa, GPX gpx, String str) {
        AtomicReference<Map<String, GPY>> atomicReference;
        Map<String, GPY> map;
        HashMap mapA0w;
        C7384Etj.A0Y(gpx, 1);
        C10511HoF c10511HoF = gpx.A01;
        HoJ hoJ = c10511HoF.A02;
        if (C7384Etj.areEqual(hoJ != null ? hoJ.A01 : null, str)) {
            C10606Hye c10606Hye = gpx.A02;
            C10574Huh c10574Huh = gpx.A00;
            C7384Etj.A0Y(c10606Hye, 0);
            C7384Etj.A0Y(c10574Huh, 1);
            GPX gpx2 = new GPX(gou, c10574Huh, c10511HoF, c10606Hye);
            C10439Hhm c10439Hhm = (C10439Hhm) interfaceC9568GPa;
            do {
                atomicReference = c10439Hhm.A00;
                map = atomicReference.get();
                C7384Etj.A0X(map);
                if (map.get(c10606Hye.A06) != gpx) {
                    return;
                }
                String str2 = c10606Hye.A03;
                if (str2 != null && map.get(str2) != gpx) {
                    return;
                }
                mapA0w = BV4.A0w(map);
                C10606Hye c10606Hye2 = gpx2.A02;
                mapA0w.put(c10606Hye2.A06, gpx2);
                String str3 = c10606Hye2.A03;
                if (str3 != null) {
                    mapA0w.put(str3, gpx2);
                }
            } while (!Bs8.A00(map, mapA0w, atomicReference));
        }
    }
}
