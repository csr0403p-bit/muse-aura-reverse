package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes2.dex */
public final class IdentitySection extends C06G {
    public static final int $stable = 0;
    public final String content;
    public final String title;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IdentitySection) {
                IdentitySection identitySection = (IdentitySection) obj;
                if (!C7384Etj.areEqual(this.title, identitySection.title) || !C7384Etj.areEqual(this.content, identitySection.content)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ IdentitySection copy$default(IdentitySection identitySection, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = identitySection.title;
        }
        if ((i & 2) != 0) {
            str2 = identitySection.content;
        }
        AnonymousClass003.A0u(str, str2);
        return new IdentitySection(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.content;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.content, AnonymousClass001.A0G(this.title));
    }

    public IdentitySection(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        this.title = str;
        this.content = str2;
    }

    public final IdentitySection copy(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        return new IdentitySection(str, str2);
    }

    public String toString() {
        return super.toString();
    }
}
