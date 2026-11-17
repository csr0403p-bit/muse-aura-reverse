package com.facebook.aura.status.viewmodel;

import X.AHD;
import X.AHI;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C7384Etj;
import com.facebook.aura.model.AvatarMedia;

/* loaded from: classes.dex */
public final class HatchStatusUiState extends C06G {
    public final AHD<HatchActionUiModel> actions;
    public final AvatarMedia avatarMedia;
    public final String botName;
    public final HatchStatusPillUiState headerUiState;
    public final HatchModelInfoUiModel modelInfo;
    public final OutOfCreditsCta outOfCreditsCta;
    public final String statusBodyText;
    public final HatchStatusState statusState;
    public final AHD<HatchSubAgentUiModel> subAgents;
    public final AHD<HatchUpcomingTaskUiModel> upcomingTasks;

    public final HatchStatusUiState copy(HatchStatusState hatchStatusState, HatchStatusPillUiState hatchStatusPillUiState, OutOfCreditsCta outOfCreditsCta, String str, AHD<HatchActionUiModel> ahd, AHD<HatchUpcomingTaskUiModel> ahd2, AHD<HatchSubAgentUiModel> ahd3, HatchModelInfoUiModel hatchModelInfoUiModel, String str2, AvatarMedia avatarMedia) {
        C7384Etj.A0Y(hatchStatusState, 0);
        AnonymousClass005.A16(hatchStatusPillUiState, str, ahd, ahd2, 1);
        C7384Etj.A0Y(ahd3, 6);
        return new HatchStatusUiState(hatchStatusState, hatchStatusPillUiState, outOfCreditsCta, str, ahd, ahd2, ahd3, hatchModelInfoUiModel, str2, avatarMedia);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchStatusUiState) {
                HatchStatusUiState hatchStatusUiState = (HatchStatusUiState) obj;
                if (this.statusState != hatchStatusUiState.statusState || !C7384Etj.areEqual(this.headerUiState, hatchStatusUiState.headerUiState) || !C7384Etj.areEqual(this.outOfCreditsCta, hatchStatusUiState.outOfCreditsCta) || !C7384Etj.areEqual(this.statusBodyText, hatchStatusUiState.statusBodyText) || !C7384Etj.areEqual(this.actions, hatchStatusUiState.actions) || !C7384Etj.areEqual(this.upcomingTasks, hatchStatusUiState.upcomingTasks) || !C7384Etj.areEqual(this.subAgents, hatchStatusUiState.subAgents) || !C7384Etj.areEqual(this.modelInfo, hatchStatusUiState.modelInfo) || !C7384Etj.areEqual(this.botName, hatchStatusUiState.botName) || !C7384Etj.areEqual(this.avatarMedia, hatchStatusUiState.avatarMedia)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchStatusUiState() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 1023, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchStatusUiState copy$default(HatchStatusUiState hatchStatusUiState, HatchStatusState hatchStatusState, HatchStatusPillUiState hatchStatusPillUiState, OutOfCreditsCta outOfCreditsCta, String str, AHD ahd, AHD ahd2, AHD ahd3, HatchModelInfoUiModel hatchModelInfoUiModel, String str2, AvatarMedia avatarMedia, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchStatusState = hatchStatusUiState.statusState;
        }
        if ((i & 2) != 0) {
            hatchStatusPillUiState = hatchStatusUiState.headerUiState;
        }
        if ((i & 4) != 0) {
            outOfCreditsCta = hatchStatusUiState.outOfCreditsCta;
        }
        if ((i & 8) != 0) {
            str = hatchStatusUiState.statusBodyText;
        }
        if ((i & 16) != 0) {
            ahd = hatchStatusUiState.actions;
        }
        if ((i & 32) != 0) {
            ahd2 = hatchStatusUiState.upcomingTasks;
        }
        if ((i & 64) != 0) {
            ahd3 = hatchStatusUiState.subAgents;
        }
        if ((i & 128) != 0) {
            hatchModelInfoUiModel = hatchStatusUiState.modelInfo;
        }
        if ((i & 256) != 0) {
            str2 = hatchStatusUiState.botName;
        }
        if ((i & 512) != 0) {
            avatarMedia = hatchStatusUiState.avatarMedia;
        }
        return hatchStatusUiState.copy(hatchStatusState, hatchStatusPillUiState, outOfCreditsCta, str, ahd, ahd2, ahd3, hatchModelInfoUiModel, str2, avatarMedia);
    }

    public final HatchStatusState component1() {
        return this.statusState;
    }

    public final AvatarMedia component10() {
        return this.avatarMedia;
    }

    public final HatchStatusPillUiState component2() {
        return this.headerUiState;
    }

    public final OutOfCreditsCta component3() {
        return this.outOfCreditsCta;
    }

    public final String component4() {
        return this.statusBodyText;
    }

    public final AHD<HatchActionUiModel> component5() {
        return this.actions;
    }

    public final AHD<HatchUpcomingTaskUiModel> component6() {
        return this.upcomingTasks;
    }

    public final AHD<HatchSubAgentUiModel> component7() {
        return this.subAgents;
    }

    public final HatchModelInfoUiModel component8() {
        return this.modelInfo;
    }

    public final String component9() {
        return this.botName;
    }

    public final AHD<HatchActionUiModel> getActions() {
        return this.actions;
    }

    public final AvatarMedia getAvatarMedia() {
        return this.avatarMedia;
    }

    public final String getBotName() {
        return this.botName;
    }

    public final HatchStatusPillUiState getHeaderUiState() {
        return this.headerUiState;
    }

    public final HatchModelInfoUiModel getModelInfo() {
        return this.modelInfo;
    }

    public final OutOfCreditsCta getOutOfCreditsCta() {
        return this.outOfCreditsCta;
    }

    public final String getStatusBodyText() {
        return this.statusBodyText;
    }

    public final HatchStatusState getStatusState() {
        return this.statusState;
    }

    public final AHD<HatchSubAgentUiModel> getSubAgents() {
        return this.subAgents;
    }

    public final AHD<HatchUpcomingTaskUiModel> getUpcomingTasks() {
        return this.upcomingTasks;
    }

    public int hashCode() {
        return ((((AnonymousClass005.A0F(this.subAgents, AnonymousClass005.A0F(this.upcomingTasks, AnonymousClass005.A0F(this.actions, AnonymousClass005.A0I(this.statusBodyText, (AnonymousClass005.A0F(this.headerUiState, AnonymousClass005.A0E(this.statusState)) + AnonymousClass006.A0D(this.outOfCreditsCta)) * 31)))) + AnonymousClass006.A0D(this.modelInfo)) * 31) + AnonymousClass006.A0G(this.botName)) * 31) + C06G.A04(this.avatarMedia);
    }

    public String toString() {
        return super.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ HatchStatusUiState(HatchStatusState hatchStatusState, HatchStatusPillUiState hatchStatusPillUiState, OutOfCreditsCta outOfCreditsCta, String str, AHD ahd, AHD ahd2, AHD ahd3, HatchModelInfoUiModel hatchModelInfoUiModel, String str2, AvatarMedia avatarMedia, int i, C06H c06h) {
        this((i & 1) != 0 ? HatchStatusState.READY : hatchStatusState, (i & 2) != 0 ? new HatchStatusPillUiState(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127, 0 == true ? 1 : 0) : hatchStatusPillUiState, (i & 4) != 0 ? null : outOfCreditsCta, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? AHI.A01 : ahd, (i & 32) != 0 ? AHI.A01 : ahd2, (i & 64) != 0 ? AHI.A01 : ahd3, (i & 128) != 0 ? null : hatchModelInfoUiModel, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : avatarMedia);
    }

    public HatchStatusUiState(HatchStatusState hatchStatusState, HatchStatusPillUiState hatchStatusPillUiState, OutOfCreditsCta outOfCreditsCta, String str, AHD<HatchActionUiModel> ahd, AHD<HatchUpcomingTaskUiModel> ahd2, AHD<HatchSubAgentUiModel> ahd3, HatchModelInfoUiModel hatchModelInfoUiModel, String str2, AvatarMedia avatarMedia) {
        C7384Etj.A0Y(hatchStatusState, 0);
        AnonymousClass005.A16(hatchStatusPillUiState, str, ahd, ahd2, 1);
        C7384Etj.A0Y(ahd3, 6);
        this.statusState = hatchStatusState;
        this.headerUiState = hatchStatusPillUiState;
        this.outOfCreditsCta = outOfCreditsCta;
        this.statusBodyText = str;
        this.actions = ahd;
        this.upcomingTasks = ahd2;
        this.subAgents = ahd3;
        this.modelInfo = hatchModelInfoUiModel;
        this.botName = str2;
        this.avatarMedia = avatarMedia;
    }
}
