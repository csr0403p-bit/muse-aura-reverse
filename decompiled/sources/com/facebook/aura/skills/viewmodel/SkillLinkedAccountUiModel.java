package com.facebook.aura.skills.viewmodel;

import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C0KA;
import X.C7384Etj;

/* loaded from: classes.dex */
public final class SkillLinkedAccountUiModel extends C06G {
    public final String accountId;
    public final String displayName;
    public final boolean needsReauth;
    public final String profilePictureUrl;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof SkillLinkedAccountUiModel) {
                SkillLinkedAccountUiModel skillLinkedAccountUiModel = (SkillLinkedAccountUiModel) obj;
                if (!C7384Etj.areEqual(this.accountId, skillLinkedAccountUiModel.accountId) || !C7384Etj.areEqual(this.displayName, skillLinkedAccountUiModel.displayName) || !C7384Etj.areEqual(this.profilePictureUrl, skillLinkedAccountUiModel.profilePictureUrl) || this.needsReauth != skillLinkedAccountUiModel.needsReauth) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ SkillLinkedAccountUiModel copy$default(SkillLinkedAccountUiModel skillLinkedAccountUiModel, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = skillLinkedAccountUiModel.accountId;
        }
        if ((i & 2) != 0) {
            str2 = skillLinkedAccountUiModel.displayName;
        }
        if ((i & 4) != 0) {
            str3 = skillLinkedAccountUiModel.profilePictureUrl;
        }
        if ((i & 8) != 0) {
            z = skillLinkedAccountUiModel.needsReauth;
        }
        AnonymousClass003.A0u(str, str2);
        return new SkillLinkedAccountUiModel(str, str2, str3, z);
    }

    public final String component1() {
        return this.accountId;
    }

    public final String component2() {
        return this.displayName;
    }

    public final String component3() {
        return this.profilePictureUrl;
    }

    public final boolean component4() {
        return this.needsReauth;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final boolean getNeedsReauth() {
        return this.needsReauth;
    }

    public final String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public int hashCode() {
        return C0KA.A00((AnonymousClass005.A0I(this.displayName, AnonymousClass001.A0G(this.accountId)) + AnonymousClass006.A0G(this.profilePictureUrl)) * 31, this.needsReauth);
    }

    public SkillLinkedAccountUiModel(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        this.accountId = str;
        this.displayName = str2;
        this.profilePictureUrl = str3;
        this.needsReauth = z;
    }

    public final SkillLinkedAccountUiModel copy(String str, String str2, String str3, boolean z) {
        AnonymousClass003.A0u(str, str2);
        return new SkillLinkedAccountUiModel(str, str2, str3, z);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ SkillLinkedAccountUiModel(String str, String str2, String str3, boolean z, int i, C06H c06h) {
        this(str, str2, str3, AnonymousClass005.A1P(i, z));
    }
}
