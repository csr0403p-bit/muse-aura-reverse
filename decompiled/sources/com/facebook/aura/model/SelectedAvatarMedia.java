package com.facebook.aura.model;

import X.AnonymousClass005;
import X.C06G;
import X.C0KA;
import X.C7384Etj;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class SelectedAvatarMedia extends C06G {
    public static final int $stable = 0;
    public final List<String> callIdle;
    public final Map<AvatarVideoVariant, List<String>> startFrames;
    public final boolean stillIsDark;
    public final List<String> stills;
    public final Map<AvatarVideoVariant, List<String>> videos;

    /* JADX WARN: Multi-variable type inference failed */
    public SelectedAvatarMedia(List<String> list, boolean z, Map<AvatarVideoVariant, ? extends List<String>> map, Map<AvatarVideoVariant, ? extends List<String>> map2, List<String> list2) {
        C7384Etj.A0Y(list, 0);
        C7384Etj.A0Y(map, 2);
        C7384Etj.A0Y(map2, 3);
        C7384Etj.A0Y(list2, 4);
        this.stills = list;
        this.stillIsDark = z;
        this.videos = map;
        this.startFrames = map2;
        this.callIdle = list2;
    }

    public final SelectedAvatarMedia copy(List<String> list, boolean z, Map<AvatarVideoVariant, ? extends List<String>> map, Map<AvatarVideoVariant, ? extends List<String>> map2, List<String> list2) {
        AnonymousClass005.A11(list, map, map2, 0);
        C7384Etj.A0Y(list2, 4);
        return new SelectedAvatarMedia(list, z, map, map2, list2);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SelectedAvatarMedia) {
                SelectedAvatarMedia selectedAvatarMedia = (SelectedAvatarMedia) obj;
                if (!C7384Etj.areEqual(this.stills, selectedAvatarMedia.stills) || this.stillIsDark != selectedAvatarMedia.stillIsDark || !C7384Etj.areEqual(this.videos, selectedAvatarMedia.videos) || !C7384Etj.areEqual(this.startFrames, selectedAvatarMedia.startFrames) || !C7384Etj.areEqual(this.callIdle, selectedAvatarMedia.callIdle)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SelectedAvatarMedia copy$default(SelectedAvatarMedia selectedAvatarMedia, List list, boolean z, Map map, Map map2, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = selectedAvatarMedia.stills;
        }
        if ((i & 2) != 0) {
            z = selectedAvatarMedia.stillIsDark;
        }
        if ((i & 4) != 0) {
            map = selectedAvatarMedia.videos;
        }
        if ((i & 8) != 0) {
            map2 = selectedAvatarMedia.startFrames;
        }
        if ((i & 16) != 0) {
            list2 = selectedAvatarMedia.callIdle;
        }
        return selectedAvatarMedia.copy(list, z, map, map2, list2);
    }

    public final List<String> component1() {
        return this.stills;
    }

    public final boolean component2() {
        return this.stillIsDark;
    }

    public final Map<AvatarVideoVariant, List<String>> component3() {
        return this.videos;
    }

    public final Map<AvatarVideoVariant, List<String>> component4() {
        return this.startFrames;
    }

    public final List<String> component5() {
        return this.callIdle;
    }

    public final List<String> getCallIdle() {
        return this.callIdle;
    }

    public final Map<AvatarVideoVariant, List<String>> getStartFrames() {
        return this.startFrames;
    }

    public final boolean getStillIsDark() {
        return this.stillIsDark;
    }

    public final List<String> getStills() {
        return this.stills;
    }

    public final Map<AvatarVideoVariant, List<String>> getVideos() {
        return this.videos;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.callIdle, AnonymousClass005.A0F(this.startFrames, AnonymousClass005.A0F(this.videos, C0KA.A01(AnonymousClass005.A0E(this.stills), this.stillIsDark))));
    }

    public String toString() {
        return super.toString();
    }
}
