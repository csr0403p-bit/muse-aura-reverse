package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;

/* loaded from: classes3.dex */
public final class HatchCitationUiModel extends C06G {
    public static final int $stable = 0;
    public final String domain;
    public final String id;
    public final String permalink;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchCitationUiModel) {
                HatchCitationUiModel hatchCitationUiModel = (HatchCitationUiModel) obj;
                if (!C7384Etj.areEqual(this.id, hatchCitationUiModel.id) || !C7384Etj.areEqual(this.permalink, hatchCitationUiModel.permalink) || !C7384Etj.areEqual(this.domain, hatchCitationUiModel.domain)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchCitationUiModel copy$default(HatchCitationUiModel hatchCitationUiModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hatchCitationUiModel.id;
        }
        if ((i & 2) != 0) {
            str2 = hatchCitationUiModel.permalink;
        }
        if ((i & 4) != 0) {
            str3 = hatchCitationUiModel.domain;
        }
        return hatchCitationUiModel.copy(str, str2, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.permalink;
    }

    public final String component3() {
        return this.domain;
    }

    public final String getDomain() {
        return this.domain;
    }

    public final String getId() {
        return this.id;
    }

    public final String getPermalink() {
        return this.permalink;
    }

    public int hashCode() {
        return AnonymousClass001.A0H(this.domain, AnonymousClass005.A0I(this.permalink, AnonymousClass001.A0G(this.id)));
    }

    public HatchCitationUiModel(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        this.id = str;
        this.permalink = str2;
        this.domain = str3;
    }

    public final HatchCitationUiModel copy(String str, String str2, String str3) {
        AnonymousClass005.A0x(str, str2, str3);
        return new HatchCitationUiModel(str, str2, str3);
    }

    public String toString() {
        return super.toString();
    }
}
