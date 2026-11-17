package com.facebook.aura.status.viewmodel;

import X.AnonymousClass002;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.model.AgentActivityStatus;

/* loaded from: classes4.dex */
public abstract class HatchStatusPillViewModelKt {
    public static final HatchStatusPillUiState withStatusOverride(HatchStatusPillUiState hatchStatusPillUiState, Integer num) {
        C7384Etj.A0Y(hatchStatusPillUiState, 0);
        return num != null ? hatchStatusPillUiState.copy(hatchStatusPillUiState.pillState, num, null, null, hatchStatusPillUiState.botName, hatchStatusPillUiState.avatarMedia, hatchStatusPillUiState.milestoneVideoUrl) : hatchStatusPillUiState;
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgentActivityStatus.values().length];
            try {
                AnonymousClass002.A13(AgentActivityStatus.ONLINE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AgentActivityStatus.RESPONDING, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AgentActivityStatus.MAKING_SOMETHING, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AgentActivityStatus.WORKING, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AgentActivityStatus.COMPOSING, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AgentActivityStatus.WAITING_FOR_SUBAGENTS, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AgentActivityStatus.COMPACTING, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(AgentActivityStatus.NEEDS_APPROVAL, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(AgentActivityStatus.OUT_OF_CREDITS, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HatchPillState toPillState(AgentActivityStatus agentActivityStatus) {
        switch (agentActivityStatus.ordinal()) {
            case 0:
                return HatchPillState.IDLE;
            case 1:
            case 4:
                return HatchPillState.TYPING;
            case 2:
                return HatchPillState.MAKING_SOMETHING;
            case 3:
            case 6:
                return HatchPillState.USING_TOOL;
            case 5:
                return HatchPillState.WAITING_FOR_SUBAGENTS;
            case 7:
                return HatchPillState.NEEDS_APPROVAL;
            case 8:
                return HatchPillState.OUT_OF_CREDITS;
            default:
                throw C3cG.A0q();
        }
    }
}
