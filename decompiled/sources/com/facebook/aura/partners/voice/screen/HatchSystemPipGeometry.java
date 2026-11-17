package com.facebook.aura.partners.voice.screen;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BLU;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C3cI;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class HatchSystemPipGeometry extends C06G {
    public static final int $stable = 0;
    public final BLU avatarBounds;
    public final BLU sourceBounds;
    public final long windowSize;
    public final boolean zoomsFromAvatar;

    public HatchSystemPipGeometry(long j, BLU blu, BLU blu2, boolean z) {
        C7384Etj.A0Y(blu, 1);
        this.windowSize = j;
        this.avatarBounds = blu;
        this.sourceBounds = blu2;
        this.zoomsFromAvatar = z;
    }

    /* renamed from: copy-CJJAR-o$default, reason: not valid java name */
    public static /* synthetic */ HatchSystemPipGeometry m1731copyCJJARo$default(HatchSystemPipGeometry hatchSystemPipGeometry, long j, BLU blu, BLU blu2, boolean z, int i, Object obj) {
        long j2 = j;
        BLU blu3 = blu;
        BLU blu4 = blu2;
        boolean z2 = z;
        if ((i & 1) != 0) {
            j2 = hatchSystemPipGeometry.windowSize;
        }
        if ((i & 2) != 0) {
            blu3 = hatchSystemPipGeometry.avatarBounds;
        }
        if ((i & 4) != 0) {
            blu4 = hatchSystemPipGeometry.sourceBounds;
        }
        if ((i & 8) != 0) {
            z2 = hatchSystemPipGeometry.zoomsFromAvatar;
        }
        C7384Etj.A0Y(blu3, 1);
        return new HatchSystemPipGeometry(j2, blu3, blu4, z2);
    }

    /* renamed from: copy-CJJAR-o, reason: not valid java name */
    public final HatchSystemPipGeometry m1733copyCJJARo(long j, BLU blu, BLU blu2, boolean z) {
        C7384Etj.A0Y(blu, 1);
        return new HatchSystemPipGeometry(j, blu, blu2, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSystemPipGeometry) {
                HatchSystemPipGeometry hatchSystemPipGeometry = (HatchSystemPipGeometry) obj;
                if (this.windowSize != hatchSystemPipGeometry.windowSize || !C7384Etj.areEqual(this.avatarBounds, hatchSystemPipGeometry.avatarBounds) || !C7384Etj.areEqual(this.sourceBounds, hatchSystemPipGeometry.sourceBounds) || this.zoomsFromAvatar != hatchSystemPipGeometry.zoomsFromAvatar) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: component1-YbymL2g, reason: not valid java name */
    public final long m1732component1YbymL2g() {
        return this.windowSize;
    }

    public final BLU component2() {
        return this.avatarBounds;
    }

    public final BLU component3() {
        return this.sourceBounds;
    }

    public final boolean component4() {
        return this.zoomsFromAvatar;
    }

    public final BLU getAvatarBounds() {
        return this.avatarBounds;
    }

    public final BLU getSourceBounds() {
        return this.sourceBounds;
    }

    /* renamed from: getWindowSize-YbymL2g, reason: not valid java name */
    public final long m1734getWindowSizeYbymL2g() {
        return this.windowSize;
    }

    public final boolean getZoomsFromAvatar() {
        return this.zoomsFromAvatar;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0F(this.avatarBounds, C3cI.A01(this.windowSize)) + AnonymousClass006.A0D(this.sourceBounds)) * 31, this.zoomsFromAvatar);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchSystemPipGeometry(long j, BLU blu, BLU blu2, boolean z, C06H c06h) {
        this(j, blu, blu2, z);
    }
}
