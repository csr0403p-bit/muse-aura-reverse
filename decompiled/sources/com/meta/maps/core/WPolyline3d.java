package com.meta.maps.core;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C60Q;
import X.C6xC;
import java.util.List;

/* loaded from: classes3.dex */
public final class WPolyline3d {
    public final List<Vec3d> v;
    public final String w;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof WPolyline3d) {
                WPolyline3d wPolyline3d = (WPolyline3d) obj;
                if (!C6xC.A00(this.v, wPolyline3d.v) || !C6xC.A00(this.w, wPolyline3d.w)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.w, C60Q.A02(this.v) * 31);
    }

    public WPolyline3d(List<Vec3d> list, String str) {
        AnonymousClass003.A0u(list, str);
        this.v = list;
        this.w = str;
    }
}
