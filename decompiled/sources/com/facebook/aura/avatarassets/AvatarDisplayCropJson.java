package com.facebook.aura.avatarassets;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07819iv;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AvatarDisplayCropJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Float size;
    public final Float x;
    public final Float y;

    public final class Companion {
        public final C9hr<AvatarDisplayCropJson> serializer() {
            return AvatarDisplayCropJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(AvatarDisplayCropJson avatarDisplayCropJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || avatarDisplayCropJson.x != null) {
            c9j5.AAP(avatarDisplayCropJson.x, C07819iv.A00, c9iZ, 0);
        }
        if (zAfR || avatarDisplayCropJson.y != null) {
            c9j5.AAP(avatarDisplayCropJson.y, C07819iv.A00, c9iZ, 1);
        }
        if (zAfR || avatarDisplayCropJson.size != null) {
            c9j5.AAP(avatarDisplayCropJson.size, C07819iv.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarDisplayCropJson) {
                AvatarDisplayCropJson avatarDisplayCropJson = (AvatarDisplayCropJson) obj;
                if (!C7384Etj.areEqual(this.x, avatarDisplayCropJson.x) || !C7384Etj.areEqual(this.y, avatarDisplayCropJson.y) || !C7384Etj.areEqual(this.size, avatarDisplayCropJson.size)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AvatarDisplayCropJson copy$default(AvatarDisplayCropJson avatarDisplayCropJson, Float f, Float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = avatarDisplayCropJson.x;
        }
        if ((i & 2) != 0) {
            f2 = avatarDisplayCropJson.y;
        }
        if ((i & 4) != 0) {
            f3 = avatarDisplayCropJson.size;
        }
        return new AvatarDisplayCropJson(f, f2, f3);
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

    public final AvatarDisplayCropJson copy(Float f, Float f2, Float f3) {
        return new AvatarDisplayCropJson(f, f2, f3);
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

    public AvatarDisplayCropJson(Float f, Float f2, Float f3) {
        this.x = f;
        this.y = f2;
        this.size = f3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarDisplayCropJson(int i, Float f, Float f2, Float f3, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.x = null;
        } else {
            this.x = f;
        }
        if ((i & 2) == 0) {
            this.y = null;
        } else {
            this.y = f2;
        }
        if ((i & 4) == 0) {
            this.size = null;
        } else {
            this.size = f3;
        }
    }

    public /* synthetic */ AvatarDisplayCropJson(Float f, Float f2, Float f3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3);
    }

    public AvatarDisplayCropJson() {
        this(null, null, null);
    }
}
