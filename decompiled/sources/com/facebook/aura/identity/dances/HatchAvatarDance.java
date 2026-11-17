package com.facebook.aura.identity.dances;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.model.HatchAttachmentFile;

/* loaded from: classes.dex */
public final class HatchAvatarDance {
    public static final int $stable = 0;
    public final String id;
    public final HatchAttachmentFile video;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAvatarDance) {
                HatchAvatarDance hatchAvatarDance = (HatchAvatarDance) obj;
                if (!C7384Etj.areEqual(this.id, hatchAvatarDance.id) || !C7384Etj.areEqual(this.video, hatchAvatarDance.video)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAvatarDance copy$default(HatchAvatarDance hatchAvatarDance, String str, HatchAttachmentFile hatchAttachmentFile, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchAvatarDance.id;
        }
        if ((i & 2) != 0) {
            hatchAttachmentFile = hatchAvatarDance.video;
        }
        AnonymousClass003.A0u(str, hatchAttachmentFile);
        return new HatchAvatarDance(str, hatchAttachmentFile);
    }

    public final String component1() {
        return this.id;
    }

    public final HatchAttachmentFile component2() {
        return this.video;
    }

    public final String getId() {
        return this.id;
    }

    public final HatchAttachmentFile getVideo() {
        return this.video;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.video, AnonymousClass001.A0G(this.id));
    }

    public String toString() {
        String str = this.id;
        HatchAttachmentFile hatchAttachmentFile = this.video;
        StringBuilder sb = new StringBuilder("HatchAvatarDance(id=");
        sb.append(str);
        sb.append(", video=");
        sb.append(hatchAttachmentFile);
        return AnonymousClass001.A0v(")", sb);
    }

    public HatchAvatarDance(String str, HatchAttachmentFile hatchAttachmentFile) {
        AnonymousClass003.A0u(str, hatchAttachmentFile);
        this.id = str;
        this.video = hatchAttachmentFile;
    }

    public final HatchAvatarDance copy(String str, HatchAttachmentFile hatchAttachmentFile) {
        AnonymousClass003.A0u(str, hatchAttachmentFile);
        return new HatchAvatarDance(str, hatchAttachmentFile);
    }
}
