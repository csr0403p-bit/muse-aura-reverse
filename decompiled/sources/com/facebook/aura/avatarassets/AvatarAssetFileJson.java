package com.facebook.aura.avatarassets;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07729ii;
import X.C07779iq;
import X.C2hx;
import X.C3cH;
import X.C7384Etj;
import X.C9hr;
import X.C9iZ;
import X.C9j5;
import kotlinx.serialization.Serializable;

@Serializable
/* loaded from: classes2.dex */
public final class AvatarAssetFileJson extends C06G {
    public static final Companion Companion = new Companion();
    public final AvatarDisplayCropJson display_crop;
    public final String format;
    public final Integer height;
    public final String path;
    public final String source;
    public final Integer width;

    public final class Companion {
        public final C9hr<AvatarAssetFileJson> serializer() {
            return AvatarAssetFileJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public AvatarAssetFileJson() {
        this(null, null, null, null, null, null);
    }

    public static /* synthetic */ AvatarAssetFileJson copy$default(AvatarAssetFileJson avatarAssetFileJson, String str, String str2, String str3, Integer num, Integer num2, AvatarDisplayCropJson avatarDisplayCropJson, int i, Object obj) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        Integer num3 = num;
        Integer num4 = num2;
        AvatarDisplayCropJson avatarDisplayCropJson2 = avatarDisplayCropJson;
        if ((i & 1) != 0) {
            str4 = avatarAssetFileJson.path;
        }
        if ((i & 2) != 0) {
            str5 = avatarAssetFileJson.format;
        }
        if ((i & 4) != 0) {
            str6 = avatarAssetFileJson.source;
        }
        if ((i & 8) != 0) {
            num3 = avatarAssetFileJson.width;
        }
        if ((i & 16) != 0) {
            num4 = avatarAssetFileJson.height;
        }
        if ((i & 32) != 0) {
            avatarDisplayCropJson2 = avatarAssetFileJson.display_crop;
        }
        return new AvatarAssetFileJson(str4, str5, str6, num3, num4, avatarDisplayCropJson2);
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_avatarassets_avatarassets(AvatarAssetFileJson avatarAssetFileJson, C9j5 c9j5, C9iZ c9iZ) {
        boolean zAfR = c9j5.AfR();
        if (zAfR || avatarAssetFileJson.path != null) {
            c9j5.AAP(avatarAssetFileJson.path, C07779iq.A01, c9iZ, 0);
        }
        if (zAfR || avatarAssetFileJson.format != null) {
            c9j5.AAP(avatarAssetFileJson.format, C07779iq.A01, c9iZ, 1);
        }
        if (zAfR || avatarAssetFileJson.source != null) {
            c9j5.AAP(avatarAssetFileJson.source, C07779iq.A01, c9iZ, 2);
        }
        if (zAfR || avatarAssetFileJson.width != null) {
            c9j5.AAP(avatarAssetFileJson.width, C07729ii.A00, c9iZ, 3);
        }
        if (zAfR || avatarAssetFileJson.height != null) {
            c9j5.AAP(avatarAssetFileJson.height, C07729ii.A00, c9iZ, 4);
        }
        if (zAfR || avatarAssetFileJson.display_crop != null) {
            c9j5.AAP(avatarAssetFileJson.display_crop, AvatarDisplayCropJson$$serializer.INSTANCE, c9iZ, 5);
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarAssetFileJson) {
                AvatarAssetFileJson avatarAssetFileJson = (AvatarAssetFileJson) obj;
                if (!C7384Etj.areEqual(this.path, avatarAssetFileJson.path) || !C7384Etj.areEqual(this.format, avatarAssetFileJson.format) || !C7384Etj.areEqual(this.source, avatarAssetFileJson.source) || !C7384Etj.areEqual(this.width, avatarAssetFileJson.width) || !C7384Etj.areEqual(this.height, avatarAssetFileJson.height) || !C7384Etj.areEqual(this.display_crop, avatarAssetFileJson.display_crop)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.path;
    }

    public final String component2() {
        return this.format;
    }

    public final String component3() {
        return this.source;
    }

    public final Integer component4() {
        return this.width;
    }

    public final Integer component5() {
        return this.height;
    }

    public final AvatarDisplayCropJson component6() {
        return this.display_crop;
    }

    public final AvatarAssetFileJson copy(String str, String str2, String str3, Integer num, Integer num2, AvatarDisplayCropJson avatarDisplayCropJson) {
        return new AvatarAssetFileJson(str, str2, str3, num, num2, avatarDisplayCropJson);
    }

    public final AvatarDisplayCropJson getDisplay_crop() {
        return this.display_crop;
    }

    public final String getFormat() {
        return this.format;
    }

    public final Integer getHeight() {
        return this.height;
    }

    public final String getPath() {
        return this.path;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.path) * 31) + AnonymousClass006.A0G(this.format)) * 31) + AnonymousClass006.A0G(this.source)) * 31) + AnonymousClass006.A0D(this.width)) * 31) + AnonymousClass006.A0D(this.height)) * 31) + C3cH.A02(this.display_crop);
    }

    public String toString() {
        return super.toString();
    }

    public AvatarAssetFileJson(String str, String str2, String str3, Integer num, Integer num2, AvatarDisplayCropJson avatarDisplayCropJson) {
        this.path = str;
        this.format = str2;
        this.source = str3;
        this.width = num;
        this.height = num2;
        this.display_crop = avatarDisplayCropJson;
    }

    public /* synthetic */ AvatarAssetFileJson(String str, String str2, String str3, Integer num, Integer num2, AvatarDisplayCropJson avatarDisplayCropJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : avatarDisplayCropJson);
    }

    public /* synthetic */ AvatarAssetFileJson(int i, String str, String str2, String str3, Integer num, Integer num2, AvatarDisplayCropJson avatarDisplayCropJson, C2hx c2hx) {
        if ((i & 1) == 0) {
            this.path = null;
        } else {
            this.path = str;
        }
        if ((i & 2) == 0) {
            this.format = null;
        } else {
            this.format = str2;
        }
        if ((i & 4) == 0) {
            this.source = null;
        } else {
            this.source = str3;
        }
        if ((i & 8) == 0) {
            this.width = null;
        } else {
            this.width = num;
        }
        if ((i & 16) == 0) {
            this.height = null;
        } else {
            this.height = num2;
        }
        if ((i & 32) == 0) {
            this.display_crop = null;
        } else {
            this.display_crop = avatarDisplayCropJson;
        }
    }
}
