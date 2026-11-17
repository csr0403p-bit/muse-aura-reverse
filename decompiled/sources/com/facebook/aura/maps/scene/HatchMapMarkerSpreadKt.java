package com.facebook.aura.maps.scene;

import X.A3Y;
import X.A3Z;
import X.ATD;
import X.Ab3;
import X.AbstractC0885AGm;
import X.AbstractC2258BHp;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import X.C8j4;
import X.F60;
import X.HxE;
import com.facebook.aura.maps.model.HatchMapCoordinate;
import com.facebook.aura.maps.model.HatchMapMarker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class HatchMapMarkerSpreadKt {
    public static final double COINCIDENT_COORDINATE_SCALE = 1000000.0d;
    public static final double METERS_PER_DEGREE_LATITUDE = 111320.0d;

    public static final List<HatchMapMarker> spreadCoincidentMarkers(List<HatchMapMarker> list, double d) {
        C7384Etj.A0Y(list, 0);
        final ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        Iterator<HatchMapMarker> it = list.iterator();
        while (it.hasNext()) {
            arrayListA0m.add(coincidenceKey(it.next().getCoordinate()));
        }
        Map mapA00 = A3Z.A00(new A3Y<HxE<? extends Long, ? extends Long>, HxE<? extends Long, ? extends Long>>() { // from class: com.facebook.aura.maps.scene.HatchMapMarkerSpreadKt$spreadCoincidentMarkers$$inlined$groupingBy$1
            @Override // X.A3Y
            public HxE<? extends Long, ? extends Long> keyOf(HxE<? extends Long, ? extends Long> hxE) {
                return hxE;
            }

            @Override // X.A3Y
            public Iterator<HxE<? extends Long, ? extends Long>> sourceIterator() {
                return arrayListA0m.iterator();
            }
        });
        HashMap map = new HashMap();
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list);
        int i = 0;
        for (HatchMapMarker hatchMapMarker : list) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0885AGm.A14();
                throw F60.createAndThrow();
            }
            HatchMapMarker hatchMapMarkerCopy = hatchMapMarker;
            Object obj = arrayListA0m.get(i);
            C7384Etj.A0Y(mapA00, 0);
            int iA0F = AnonymousClass001.A0F(AbstractC2258BHp.A0L(obj, mapA00));
            if (iA0F > 1) {
                Object orDefault = map.getOrDefault(obj, 0);
                C7384Etj.A0U(orDefault);
                int iA0F2 = AnonymousClass001.A0F(orDefault);
                C8j4.A1O(obj, map, iA0F2 + 1);
                hatchMapMarkerCopy = hatchMapMarkerCopy.copy(hatchMapMarkerCopy.id, onRing(hatchMapMarkerCopy.getCoordinate(), iA0F2, iA0F, d), hatchMapMarkerCopy.title, hatchMapMarkerCopy.subtitle, hatchMapMarkerCopy.backgroundImageUrl);
            }
            arrayListA0m2.add(hatchMapMarkerCopy);
            i = i2;
        }
        return arrayListA0m2;
    }

    public static final HxE<Long, Long> coincidenceKey(HatchMapCoordinate hatchMapCoordinate) {
        return C3cG.A0r(Long.valueOf(Ab3.A03(hatchMapCoordinate.latitude * 1000000.0d)), Long.valueOf(Ab3.A03(hatchMapCoordinate.longitude * 1000000.0d)));
    }

    public static final HatchMapCoordinate onRing(HatchMapCoordinate hatchMapCoordinate, int i, int i2, double d) {
        double d2 = ((i * 6.283185307179586d) / i2) + 0.7853981633974483d;
        double d3 = hatchMapCoordinate.latitude;
        return new HatchMapCoordinate(ATD.A00(d3 + ((Math.cos(d2) * d) / 111320.0d), -90.0d, 90.0d), hatchMapCoordinate.longitude + ((Math.sin(d2) * d) / (Math.max(Math.cos((d3 * 3.141592653589793d) / 180.0d), 0.01d) * 111320.0d)));
    }
}
