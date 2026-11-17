package com.facebook.aura.ui;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class DragRelease extends C06G {
    public static final int $stable = 8;
    public final Object hoveredTargetKey;
    public final Object key;
    public final Object nestTargetKey;
    public final Object roomBeforeKey;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DragRelease) {
                DragRelease dragRelease = (DragRelease) obj;
                if (!C7384Etj.areEqual(this.key, dragRelease.key) || !C7384Etj.areEqual(this.hoveredTargetKey, dragRelease.hoveredTargetKey) || !C7384Etj.areEqual(this.nestTargetKey, dragRelease.nestTargetKey) || !C7384Etj.areEqual(this.roomBeforeKey, dragRelease.roomBeforeKey)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DragRelease copy$default(DragRelease dragRelease, Object obj, Object obj2, Object obj3, Object obj4, int i, Object obj5) {
        if ((i & 1) != 0) {
            obj = dragRelease.key;
        }
        if ((i & 2) != 0) {
            obj2 = dragRelease.hoveredTargetKey;
        }
        if ((i & 4) != 0) {
            obj3 = dragRelease.nestTargetKey;
        }
        if ((i & 8) != 0) {
            obj4 = dragRelease.roomBeforeKey;
        }
        return new DragRelease(obj, obj2, obj3, obj4);
    }

    public final Object component1() {
        return this.key;
    }

    public final Object component2() {
        return this.hoveredTargetKey;
    }

    public final Object component3() {
        return this.nestTargetKey;
    }

    public final Object component4() {
        return this.roomBeforeKey;
    }

    public final DragRelease copy(Object obj, Object obj2, Object obj3, Object obj4) {
        return new DragRelease(obj, obj2, obj3, obj4);
    }

    public final Object getHoveredTargetKey() {
        return this.hoveredTargetKey;
    }

    public final Object getKey() {
        return this.key;
    }

    public final Object getNestTargetKey() {
        return this.nestTargetKey;
    }

    public final Object getRoomBeforeKey() {
        return this.roomBeforeKey;
    }

    public int hashCode() {
        return (((((AnonymousClass006.A0D(this.key) * 31) + AnonymousClass006.A0D(this.hoveredTargetKey)) * 31) + AnonymousClass006.A0D(this.nestTargetKey)) * 31) + C3cH.A02(this.roomBeforeKey);
    }

    public DragRelease(Object obj, Object obj2, Object obj3, Object obj4) {
        this.key = obj;
        this.hoveredTargetKey = obj2;
        this.nestTargetKey = obj3;
        this.roomBeforeKey = obj4;
    }

    public String toString() {
        return super.toString();
    }
}
