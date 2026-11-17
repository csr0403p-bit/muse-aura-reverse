package com.meta.maps.display;

import X.AnonymousClass005;
import X.C60Q;
import X.C6xC;
import X.C7384Etj;
import X.C8j4;

/* loaded from: classes4.dex */
public final class GestureInteraction {
    public GestureType gestureType;
    public float screenX;
    public float screenY;

    public GestureInteraction(GestureType gestureType, float f, float f2) {
        C7384Etj.A0Y(gestureType, 0);
        this.gestureType = gestureType;
        this.screenX = f;
        this.screenY = f2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof GestureInteraction) {
                GestureInteraction gestureInteraction = (GestureInteraction) obj;
                if (!C6xC.A00(this.gestureType, gestureInteraction.gestureType) || Float.compare(this.screenX, gestureInteraction.screenX) != 0 || Float.compare(this.screenY, gestureInteraction.screenY) != 0) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C8j4.A06(AnonymousClass005.A02(C60Q.A02(this.gestureType) * 31, this.screenX), this.screenY);
    }
}
