package com.meta.maps.core;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C6xC;

/* loaded from: classes6.dex */
public final class WVec3d {
    public final Vec3d v;
    public final String w;

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof WVec3d) {
                WVec3d wVec3d = (WVec3d) obj;
                if (!C6xC.A00(this.v, wVec3d.v) || !C6xC.A00(this.w, wVec3d.w)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.w, (217 + this.v.hashCode()) * 31);
    }

    public WVec3d(Vec3d vec3d, String str) {
        AnonymousClass003.A0u(vec3d, str);
        this.v = vec3d;
        this.w = str;
    }
}
