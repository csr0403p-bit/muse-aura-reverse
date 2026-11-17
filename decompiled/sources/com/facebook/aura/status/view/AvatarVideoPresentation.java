package com.facebook.aura.status.view;

import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C7384Etj;
import android.net.Uri;

/* loaded from: classes4.dex */
public final class AvatarVideoPresentation extends C06G {
    public final Float callCropTopFraction;
    public final Uri uri;

    public AvatarVideoPresentation(Uri uri, Float f) {
        C7384Etj.A0Y(uri, 0);
        this.uri = uri;
        this.callCropTopFraction = f;
    }

    public final AvatarVideoPresentation copy(Uri uri, Float f) {
        C7384Etj.A0Y(uri, 0);
        return new AvatarVideoPresentation(uri, f);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AvatarVideoPresentation) {
                AvatarVideoPresentation avatarVideoPresentation = (AvatarVideoPresentation) obj;
                if (!C7384Etj.areEqual(this.uri, avatarVideoPresentation.uri) || !C7384Etj.areEqual(this.callCropTopFraction, avatarVideoPresentation.callCropTopFraction)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ AvatarVideoPresentation copy$default(AvatarVideoPresentation avatarVideoPresentation, Uri uri, Float f, int i, Object obj) {
        if ((i & 1) != 0) {
            uri = avatarVideoPresentation.uri;
        }
        if ((i & 2) != 0) {
            f = avatarVideoPresentation.callCropTopFraction;
        }
        C7384Etj.A0Y(uri, 0);
        return new AvatarVideoPresentation(uri, f);
    }

    public final Uri component1() {
        return this.uri;
    }

    public final Float component2() {
        return this.callCropTopFraction;
    }

    public final Float getCallCropTopFraction() {
        return this.callCropTopFraction;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public int hashCode() {
        return AnonymousClass005.A0E(this.uri) + AnonymousClass006.A0D(this.callCropTopFraction);
    }

    public String toString() {
        return super.toString();
    }
}
