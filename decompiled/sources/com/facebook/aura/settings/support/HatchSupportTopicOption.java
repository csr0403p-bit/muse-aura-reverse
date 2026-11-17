package com.facebook.aura.settings.support;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class HatchSupportTopicOption extends C06G {
    public static final int $stable = 8;
    public final HatchSupportTopicLabel label;
    public final String slug;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchSupportTopicOption) {
                HatchSupportTopicOption hatchSupportTopicOption = (HatchSupportTopicOption) obj;
                if (!C7384Etj.areEqual(this.slug, hatchSupportTopicOption.slug) || !C7384Etj.areEqual(this.label, hatchSupportTopicOption.label)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchSupportTopicOption copy$default(HatchSupportTopicOption hatchSupportTopicOption, String str, HatchSupportTopicLabel hatchSupportTopicLabel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchSupportTopicOption.slug;
        }
        if ((i & 2) != 0) {
            hatchSupportTopicLabel = hatchSupportTopicOption.label;
        }
        AnonymousClass003.A0u(str, hatchSupportTopicLabel);
        return new HatchSupportTopicOption(str, hatchSupportTopicLabel);
    }

    public final String component1() {
        return this.slug;
    }

    public final HatchSupportTopicLabel component2() {
        return this.label;
    }

    public final HatchSupportTopicLabel getLabel() {
        return this.label;
    }

    public final String getSlug() {
        return this.slug;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.label, AnonymousClass001.A0G(this.slug));
    }

    public HatchSupportTopicOption(String str, HatchSupportTopicLabel hatchSupportTopicLabel) {
        AnonymousClass003.A0u(str, hatchSupportTopicLabel);
        this.slug = str;
        this.label = hatchSupportTopicLabel;
    }

    public final HatchSupportTopicOption copy(String str, HatchSupportTopicLabel hatchSupportTopicLabel) {
        AnonymousClass003.A0u(str, hatchSupportTopicLabel);
        return new HatchSupportTopicOption(str, hatchSupportTopicLabel);
    }

    public String toString() {
        return super.toString();
    }
}
