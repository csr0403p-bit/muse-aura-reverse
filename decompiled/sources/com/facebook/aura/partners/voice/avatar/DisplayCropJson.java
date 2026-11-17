package com.facebook.aura.partners.voice.avatar;

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
public final class DisplayCropJson extends C06G {
    public static final Companion Companion = new Companion();
    public final Float size;
    public final Float x;
    public final Float y;

    public final class Companion {
        public final C9hr<DisplayCropJson> serializer() {
            return DisplayCropJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_partners_voice_avatar_avatar(DisplayCropJson displayCropJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || displayCropJson.x != null) {
            c9j5.AAP(displayCropJson.x, C07819iv.A00, c9iZ, 0);
        }
        if (zAfR || displayCropJson.y != null) {
            c9j5.AAP(displayCropJson.y, C07819iv.A00, c9iZ, 1);
        }
        if (zAfR || displayCropJson.size != null) {
            c9j5.AAP(displayCropJson.size, C07819iv.A00, c9iZ, 2);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DisplayCropJson) {
                DisplayCropJson displayCropJson = (DisplayCropJson) obj;
                if (!C7384Etj.areEqual(this.x, displayCropJson.x) || !C7384Etj.areEqual(this.y, displayCropJson.y) || !C7384Etj.areEqual(this.size, displayCropJson.size)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ DisplayCropJson copy$default(DisplayCropJson displayCropJson, Float f, Float f2, Float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = displayCropJson.x;
        }
        if ((i & 2) != 0) {
            f2 = displayCropJson.y;
        }
        if ((i & 4) != 0) {
            f3 = displayCropJson.size;
        }
        return new DisplayCropJson(f, f2, f3);
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

    public final DisplayCropJson copy(Float f, Float f2, Float f3) {
        return new DisplayCropJson(f, f2, f3);
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

    public DisplayCropJson(Float f, Float f2, Float f3) {
        this.x = f;
        this.y = f2;
        this.size = f3;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ DisplayCropJson(int i, Float f, Float f2, Float f3, C2hx c2hx) {
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

    public /* synthetic */ DisplayCropJson(Float f, Float f2, Float f3, int i, C06H c06h) {
        this((i & 1) != 0 ? null : f, (i & 2) != 0 ? null : f2, (i & 4) != 0 ? null : f3);
    }

    public DisplayCropJson() {
        this(null, null, null);
    }
}
