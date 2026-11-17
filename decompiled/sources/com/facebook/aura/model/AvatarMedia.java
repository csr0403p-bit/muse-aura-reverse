package com.facebook.aura.model;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0881AGi;
import X.C3cH;
import X.C7384Etj;
import java.util.Map;

/* loaded from: classes2.dex */
public final class AvatarMedia extends C06G {
    public static final int $stable;
    public final AppearancePaths callIdle;
    public final AvatarDisplayCrop callIdleCrop;
    public final AvatarDisplayCrop callIdleDarkCrop;
    public final String revision;
    public final Map<AvatarVideoVariant, AppearancePaths> startFrames;
    public final AppearancePaths still;
    public final Map<AvatarVideoVariant, AppearancePaths> videos;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarMedia) {
                AvatarMedia avatarMedia = (AvatarMedia) obj;
                if (!C7384Etj.areEqual(this.still, avatarMedia.still) || !C7384Etj.areEqual(this.videos, avatarMedia.videos) || !C7384Etj.areEqual(this.startFrames, avatarMedia.startFrames) || !C7384Etj.areEqual(this.callIdle, avatarMedia.callIdle) || !C7384Etj.areEqual(this.callIdleCrop, avatarMedia.callIdleCrop) || !C7384Etj.areEqual(this.callIdleDarkCrop, avatarMedia.callIdleDarkCrop) || !C7384Etj.areEqual(this.revision, avatarMedia.revision)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        int i = AvatarDisplayCrop.$stable;
        $stable = i | i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AvatarMedia() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvatarMedia copy$default(AvatarMedia avatarMedia, AppearancePaths appearancePaths, Map map, Map map2, AppearancePaths appearancePaths2, AvatarDisplayCrop avatarDisplayCrop, AvatarDisplayCrop avatarDisplayCrop2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            appearancePaths = avatarMedia.still;
        }
        if ((i & 2) != 0) {
            map = avatarMedia.videos;
        }
        if ((i & 4) != 0) {
            map2 = avatarMedia.startFrames;
        }
        if ((i & 8) != 0) {
            appearancePaths2 = avatarMedia.callIdle;
        }
        if ((i & 16) != 0) {
            avatarDisplayCrop = avatarMedia.callIdleCrop;
        }
        if ((i & 32) != 0) {
            avatarDisplayCrop2 = avatarMedia.callIdleDarkCrop;
        }
        if ((i & 64) != 0) {
            str = avatarMedia.revision;
        }
        return avatarMedia.copy(appearancePaths, map, map2, appearancePaths2, avatarDisplayCrop, avatarDisplayCrop2, str);
    }

    public final AppearancePaths component1() {
        return this.still;
    }

    public final Map<AvatarVideoVariant, AppearancePaths> component2() {
        return this.videos;
    }

    public final Map<AvatarVideoVariant, AppearancePaths> component3() {
        return this.startFrames;
    }

    public final AppearancePaths component4() {
        return this.callIdle;
    }

    public final AvatarDisplayCrop component5() {
        return this.callIdleCrop;
    }

    public final AvatarDisplayCrop component6() {
        return this.callIdleDarkCrop;
    }

    public final String component7() {
        return this.revision;
    }

    public final AppearancePaths getCallIdle() {
        return this.callIdle;
    }

    public final AvatarDisplayCrop getCallIdleCrop() {
        return this.callIdleCrop;
    }

    public final AvatarDisplayCrop getCallIdleDarkCrop() {
        return this.callIdleDarkCrop;
    }

    public final String getRevision() {
        return this.revision;
    }

    public final Map<AvatarVideoVariant, AppearancePaths> getStartFrames() {
        return this.startFrames;
    }

    public final AppearancePaths getStill() {
        return this.still;
    }

    public final Map<AvatarVideoVariant, AppearancePaths> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.callIdle, AnonymousClass005.A0F(this.startFrames, AnonymousClass005.A0F(this.videos, AnonymousClass005.A0E(this.still)))) + AnonymousClass006.A0D(this.callIdleCrop)) * 31) + AnonymousClass006.A0D(this.callIdleDarkCrop)) * 31) + AnonymousClass005.A0H(this.revision);
    }

    public final AvatarMedia copy(AppearancePaths appearancePaths, Map<AvatarVideoVariant, AppearancePaths> map, Map<AvatarVideoVariant, AppearancePaths> map2, AppearancePaths appearancePaths2, AvatarDisplayCrop avatarDisplayCrop, AvatarDisplayCrop avatarDisplayCrop2, String str) {
        AnonymousClass005.A14(appearancePaths, map, map2, appearancePaths2);
        return new AvatarMedia(appearancePaths, map, map2, appearancePaths2, avatarDisplayCrop, avatarDisplayCrop2, str);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ AvatarMedia(AppearancePaths appearancePaths, Map map, Map map2, AppearancePaths appearancePaths2, AvatarDisplayCrop avatarDisplayCrop, AvatarDisplayCrop avatarDisplayCrop2, String str, int i, C06H c06h) {
        if ((i & 1) != 0) {
            C0881AGi c0881AGi = C0881AGi.A00;
            appearancePaths = new AppearancePaths(c0881AGi, c0881AGi);
        }
        Map mapA0o = C3cH.A0o(map, i & 2);
        Map mapA0o2 = C3cH.A0o(map2, i & 4);
        if ((i & 8) != 0) {
            C0881AGi c0881AGi2 = C0881AGi.A00;
            appearancePaths2 = new AppearancePaths(c0881AGi2, c0881AGi2);
        }
        this(appearancePaths, mapA0o, mapA0o2, appearancePaths2, (i & 16) != 0 ? null : avatarDisplayCrop, (i & 32) != 0 ? null : avatarDisplayCrop2, (i & 64) != 0 ? null : str);
    }

    public AvatarMedia(AppearancePaths appearancePaths, Map<AvatarVideoVariant, AppearancePaths> map, Map<AvatarVideoVariant, AppearancePaths> map2, AppearancePaths appearancePaths2, AvatarDisplayCrop avatarDisplayCrop, AvatarDisplayCrop avatarDisplayCrop2, String str) {
        AnonymousClass005.A14(appearancePaths, map, map2, appearancePaths2);
        this.still = appearancePaths;
        this.videos = map;
        this.startFrames = map2;
        this.callIdle = appearancePaths2;
        this.callIdleCrop = avatarDisplayCrop;
        this.callIdleDarkCrop = avatarDisplayCrop2;
        this.revision = str;
    }
}
