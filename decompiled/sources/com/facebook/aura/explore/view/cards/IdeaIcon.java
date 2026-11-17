package com.facebook.aura.explore.view.cards;

import X.AnonymousClass001;
import X.C06G;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class IdeaIcon extends C06G {
    public static final int $stable = 0;
    public final boolean isColorIcon;
    public final String url;

    public IdeaIcon(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        this.url = str;
        this.isColorIcon = z;
    }

    public final IdeaIcon copy(String str, boolean z) {
        C7384Etj.A0Y(str, 0);
        return new IdeaIcon(str, z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdeaIcon) {
                IdeaIcon ideaIcon = (IdeaIcon) obj;
                if (!C7384Etj.areEqual(this.url, ideaIcon.url) || this.isColorIcon != ideaIcon.isColorIcon) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdeaIcon copy$default(IdeaIcon ideaIcon, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ideaIcon.url;
        }
        if ((i & 2) != 0) {
            z = ideaIcon.isColorIcon;
        }
        C7384Etj.A0Y(str, 0);
        return new IdeaIcon(str, z);
    }

    public final String component1() {
        return this.url;
    }

    public final boolean component2() {
        return this.isColorIcon;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return C0KA.A00(AnonymousClass001.A0G(this.url), this.isColorIcon);
    }

    public final boolean isColorIcon() {
        return this.isColorIcon;
    }

    public String toString() {
        return super.toString();
    }
}
