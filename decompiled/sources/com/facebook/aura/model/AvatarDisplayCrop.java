package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class AvatarDisplayCrop extends C06G {
    public static final int $stable = 0;
    public final Float size;
    public final Float x;
    public final Float y;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarDisplayCrop) {
                AvatarDisplayCrop avatarDisplayCrop = (AvatarDisplayCrop) obj;
                if (!C7384Etj.areEqual(this.x, avatarDisplayCrop.x) || !C7384Etj.areEqual(this.y, avatarDisplayCrop.y) || !C7384Etj.areEqual(this.size, avatarDisplayCrop.size)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AvatarDisplayCrop copy$default(AvatarDisplayCrop avatarDisplayCrop, Float f, Float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = avatarDisplayCrop.x;
        }
        if ((i & 2) != 0) {
            f2 = avatarDisplayCrop.y;
        }
        if ((i & 4) != 0) {
            f3 = avatarDisplayCrop.size;
        }
        return new AvatarDisplayCrop(f, f2, f3);
    }

    public final Float component1() {
        return this.x;
    }

    public final Float component2() {
        return this.y;
    }

    public final Float component3() {
        return this.size;
    }

    public final AvatarDisplayCrop copy(Float f, Float f2, Float f3) {
        return new AvatarDisplayCrop(f, f2, f3);
    }

    public final Float getSize() {
        return this.size;
    }

    public final Float getX() {
        return this.x;
    }

    public final Float getY() {
        return this.y;
    }

    public int hashCode() {
        return (((AnonymousClass006.A0D(this.x) * 31) + AnonymousClass006.A0D(this.y)) * 31) + C3cH.A02(this.size);
    }

    public AvatarDisplayCrop(Float f, Float f2, Float f3) {
        this.x = f;
        this.y = f2;
        this.size = f3;
    }

    public String toString() {
        return super.toString();
    }
}
