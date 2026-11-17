package com.facebook.aura.model;

import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C3cH;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class AvatarStatusVideos extends C06G {
    public static final int $stable = 0;
    public final String connecting;
    public final String idle;
    public final String makingSomething;
    public final AvatarStatusVideos startFrames;
    public final String wakingVideo;
    public final String working;

    public AvatarStatusVideos() {
        this(null, null, null, null, null, null);
    }

    public static /* synthetic */ AvatarStatusVideos copy$default(AvatarStatusVideos avatarStatusVideos, String str, String str2, String str3, String str4, String str5, AvatarStatusVideos avatarStatusVideos2, int i, Object obj) {
        String str6 = str;
        String str7 = str2;
        String str8 = str3;
        String str9 = str4;
        String str10 = str5;
        AvatarStatusVideos avatarStatusVideos3 = avatarStatusVideos2;
        if ((i & 1) != 0) {
            str6 = avatarStatusVideos.idle;
        }
        if ((i & 2) != 0) {
            str7 = avatarStatusVideos.working;
        }
        if ((i & 4) != 0) {
            str8 = avatarStatusVideos.makingSomething;
        }
        if ((i & 8) != 0) {
            str9 = avatarStatusVideos.connecting;
        }
        if ((i & 16) != 0) {
            str10 = avatarStatusVideos.wakingVideo;
        }
        if ((i & 32) != 0) {
            avatarStatusVideos3 = avatarStatusVideos.startFrames;
        }
        return new AvatarStatusVideos(str6, str7, str8, str9, str10, avatarStatusVideos3);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarStatusVideos) {
                AvatarStatusVideos avatarStatusVideos = (AvatarStatusVideos) obj;
                if (!C7384Etj.areEqual(this.idle, avatarStatusVideos.idle) || !C7384Etj.areEqual(this.working, avatarStatusVideos.working) || !C7384Etj.areEqual(this.makingSomething, avatarStatusVideos.makingSomething) || !C7384Etj.areEqual(this.connecting, avatarStatusVideos.connecting) || !C7384Etj.areEqual(this.wakingVideo, avatarStatusVideos.wakingVideo) || !C7384Etj.areEqual(this.startFrames, avatarStatusVideos.startFrames)) {
                }
            }
            return false;
        }
        return true;
    }

    public final String component1() {
        return this.idle;
    }

    public final String component2() {
        return this.working;
    }

    public final String component3() {
        return this.makingSomething;
    }

    public final String component4() {
        return this.connecting;
    }

    public final String component5() {
        return this.wakingVideo;
    }

    public final AvatarStatusVideos component6() {
        return this.startFrames;
    }

    public final AvatarStatusVideos copy(String str, String str2, String str3, String str4, String str5, AvatarStatusVideos avatarStatusVideos) {
        return new AvatarStatusVideos(str, str2, str3, str4, str5, avatarStatusVideos);
    }

    public final String getConnecting() {
        return this.connecting;
    }

    public final String getIdle() {
        return this.idle;
    }

    public final String getMakingSomething() {
        return this.makingSomething;
    }

    public final AvatarStatusVideos getStartFrames() {
        return this.startFrames;
    }

    public final String getWakingVideo() {
        return this.wakingVideo;
    }

    public final String getWorking() {
        return this.working;
    }

    public int hashCode() {
        return (((((((((AnonymousClass006.A0G(this.idle) * 31) + AnonymousClass006.A0G(this.working)) * 31) + AnonymousClass006.A0G(this.makingSomething)) * 31) + AnonymousClass006.A0G(this.connecting)) * 31) + AnonymousClass006.A0G(this.wakingVideo)) * 31) + C3cH.A02(this.startFrames);
    }

    public String toString() {
        return super.toString();
    }

    public AvatarStatusVideos(String str, String str2, String str3, String str4, String str5, AvatarStatusVideos avatarStatusVideos) {
        this.idle = str;
        this.working = str2;
        this.makingSomething = str3;
        this.connecting = str4;
        this.wakingVideo = str5;
        this.startFrames = avatarStatusVideos;
    }

    public /* synthetic */ AvatarStatusVideos(String str, String str2, String str3, String str4, String str5, AvatarStatusVideos avatarStatusVideos, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : avatarStatusVideos);
    }
}
