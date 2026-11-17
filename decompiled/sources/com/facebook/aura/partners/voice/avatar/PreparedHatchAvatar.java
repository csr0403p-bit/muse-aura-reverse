package com.facebook.aura.partners.voice.avatar;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import X.C7BY;
import android.net.Uri;
import java.io.File;

/* loaded from: classes2.dex */
public final class PreparedHatchAvatar extends C06G {
    public final String avatarStillPath;
    public final Boolean referenceFromOriginal;
    public final HatchAvatarSelection selection;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof PreparedHatchAvatar) {
                PreparedHatchAvatar preparedHatchAvatar = (PreparedHatchAvatar) obj;
                if (!C7384Etj.areEqual(this.avatarStillPath, preparedHatchAvatar.avatarStillPath) || !C7384Etj.areEqual(this.selection, preparedHatchAvatar.selection) || !C7384Etj.areEqual(this.referenceFromOriginal, preparedHatchAvatar.referenceFromOriginal)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ PreparedHatchAvatar copy$default(PreparedHatchAvatar preparedHatchAvatar, String str, HatchAvatarSelection hatchAvatarSelection, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preparedHatchAvatar.avatarStillPath;
        }
        if ((i & 2) != 0) {
            hatchAvatarSelection = preparedHatchAvatar.selection;
        }
        if ((i & 4) != 0) {
            bool = preparedHatchAvatar.referenceFromOriginal;
        }
        return preparedHatchAvatar.copy(str, hatchAvatarSelection, bool);
    }

    public final String component1() {
        return this.avatarStillPath;
    }

    public final HatchAvatarSelection component2() {
        return this.selection;
    }

    public final Boolean component3() {
        return this.referenceFromOriginal;
    }

    public final String getAvatarStillPath() {
        return this.avatarStillPath;
    }

    public final String getFallbackUri() {
        Uri uriFromFile;
        String str = this.selection.reference.imageUri;
        if (str != null && !C7BY.A0j(str)) {
            return str;
        }
        File file = new File(this.avatarStillPath);
        if (!file.isFile() || (uriFromFile = Uri.fromFile(file)) == null) {
            return null;
        }
        return uriFromFile.toString();
    }

    public final Boolean getReferenceFromOriginal() {
        return this.referenceFromOriginal;
    }

    public final HatchAvatarSelection getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.selection, AnonymousClass001.A0G(this.avatarStillPath)) + AnonymousClass006.A0D(this.referenceFromOriginal);
    }

    public PreparedHatchAvatar(String str, HatchAvatarSelection hatchAvatarSelection, Boolean bool) {
        AnonymousClass003.A0u(str, hatchAvatarSelection);
        this.avatarStillPath = str;
        this.selection = hatchAvatarSelection;
        this.referenceFromOriginal = bool;
    }

    public final PreparedHatchAvatar copy(String str, HatchAvatarSelection hatchAvatarSelection, Boolean bool) {
        AnonymousClass003.A0u(str, hatchAvatarSelection);
        return new PreparedHatchAvatar(str, hatchAvatarSelection, bool);
    }

    public String toString() {
        return super.toString();
    }
}
