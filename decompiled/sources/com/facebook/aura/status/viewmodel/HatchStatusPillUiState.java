package com.facebook.aura.status.viewmodel;

import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.AvatarMedia;

/* loaded from: classes4.dex */
public final class HatchStatusPillUiState extends C06G {
    public final String activityEmoji;
    public final AvatarMedia avatarMedia;
    public final String botName;
    public final String milestoneVideoUrl;
    public final HatchPillState pillState;
    public final Integer subtitleRes;
    public final String subtitleText;

    public HatchStatusPillUiState(HatchPillState hatchPillState, Integer num, String str, String str2, String str3, AvatarMedia avatarMedia, String str4) {
        AnonymousClass002.A1D(hatchPillState, 0, avatarMedia);
        this.pillState = hatchPillState;
        this.subtitleRes = num;
        this.subtitleText = str;
        this.activityEmoji = str2;
        this.botName = str3;
        this.avatarMedia = avatarMedia;
        this.milestoneVideoUrl = str4;
    }

    public final HatchStatusPillUiState copy(HatchPillState hatchPillState, Integer num, String str, String str2, String str3, AvatarMedia avatarMedia, String str4) {
        AnonymousClass002.A1D(hatchPillState, 0, avatarMedia);
        return new HatchStatusPillUiState(hatchPillState, num, str, str2, str3, avatarMedia, str4);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStatusPillUiState) {
                HatchStatusPillUiState hatchStatusPillUiState = (HatchStatusPillUiState) obj;
                if (this.pillState != hatchStatusPillUiState.pillState || !C7384Etj.areEqual(this.subtitleRes, hatchStatusPillUiState.subtitleRes) || !C7384Etj.areEqual(this.subtitleText, hatchStatusPillUiState.subtitleText) || !C7384Etj.areEqual(this.activityEmoji, hatchStatusPillUiState.activityEmoji) || !C7384Etj.areEqual(this.botName, hatchStatusPillUiState.botName) || !C7384Etj.areEqual(this.avatarMedia, hatchStatusPillUiState.avatarMedia) || !C7384Etj.areEqual(this.milestoneVideoUrl, hatchStatusPillUiState.milestoneVideoUrl)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchStatusPillUiState copy$default(HatchStatusPillUiState hatchStatusPillUiState, HatchPillState hatchPillState, Integer num, String str, String str2, String str3, AvatarMedia avatarMedia, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchPillState = hatchStatusPillUiState.pillState;
        }
        if ((i & 2) != 0) {
            num = hatchStatusPillUiState.subtitleRes;
        }
        if ((i & 4) != 0) {
            str = hatchStatusPillUiState.subtitleText;
        }
        if ((i & 8) != 0) {
            str2 = hatchStatusPillUiState.activityEmoji;
        }
        if ((i & 16) != 0) {
            str3 = hatchStatusPillUiState.botName;
        }
        if ((i & 32) != 0) {
            avatarMedia = hatchStatusPillUiState.avatarMedia;
        }
        if ((i & 64) != 0) {
            str4 = hatchStatusPillUiState.milestoneVideoUrl;
        }
        return hatchStatusPillUiState.copy(hatchPillState, num, str, str2, str3, avatarMedia, str4);
    }

    public final HatchPillState component1() {
        return this.pillState;
    }

    public final Integer component2() {
        return this.subtitleRes;
    }

    public final String component3() {
        return this.subtitleText;
    }

    public final String component4() {
        return this.activityEmoji;
    }

    public final String component5() {
        return this.botName;
    }

    public final AvatarMedia component6() {
        return this.avatarMedia;
    }

    public final String component7() {
        return this.milestoneVideoUrl;
    }

    public final String getActivityEmoji() {
        return this.activityEmoji;
    }

    public final AvatarMedia getAvatarMedia() {
        return this.avatarMedia;
    }

    public final String getBotName() {
        return this.botName;
    }

    public final String getMilestoneVideoUrl() {
        return this.milestoneVideoUrl;
    }

    public final HatchPillState getPillState() {
        return this.pillState;
    }

    public final Integer getSubtitleRes() {
        return this.subtitleRes;
    }

    public final String getSubtitleText() {
        return this.subtitleText;
    }

    public int hashCode() {
        return AnonymousClass005.A0F(this.avatarMedia, (((((((AnonymousClass005.A0E(this.pillState) + AnonymousClass006.A0D(this.subtitleRes)) * 31) + AnonymousClass006.A0G(this.subtitleText)) * 31) + AnonymousClass006.A0G(this.activityEmoji)) * 31) + AnonymousClass006.A0G(this.botName)) * 31) + AnonymousClass005.A0H(this.milestoneVideoUrl);
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ HatchStatusPillUiState(HatchPillState hatchPillState, Integer num, String str, String str2, String str3, AvatarMedia avatarMedia, String str4, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchPillState.IDLE : hatchPillState, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? new AvatarMedia(null, null, null, null, null, null, null, 127, null) : avatarMedia, (i & 64) != 0 ? null : str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusPillUiState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0);
    }
}
