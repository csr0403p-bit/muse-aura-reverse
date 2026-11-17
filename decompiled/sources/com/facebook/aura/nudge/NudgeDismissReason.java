package com.facebook.aura.nudge;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class NudgeDismissReason {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ NudgeDismissReason[] $VALUES;
    public static final NudgeDismissReason AGENT_APPROVAL;
    public static final NudgeDismissReason BACKGROUND;
    public static final NudgeDismissReason DISMISS_BUTTON;
    public static final NudgeDismissReason EXPIRED;
    public static final NudgeDismissReason INPUT_BLOCKED;
    public static final NudgeDismissReason MESSAGE_SENT;
    public static final NudgeDismissReason PREEMPTED;
    public final String wireValue;

    static {
        NudgeDismissReason nudgeDismissReason = new NudgeDismissReason("DISMISS_BUTTON", 0, "dismiss_button");
        DISMISS_BUTTON = nudgeDismissReason;
        NudgeDismissReason nudgeDismissReason2 = new NudgeDismissReason("MESSAGE_SENT", 1, "message_sent");
        MESSAGE_SENT = nudgeDismissReason2;
        NudgeDismissReason nudgeDismissReason3 = new NudgeDismissReason("EXPIRED", 2, "expired");
        EXPIRED = nudgeDismissReason3;
        NudgeDismissReason nudgeDismissReason4 = new NudgeDismissReason("BACKGROUND", 3, "background");
        BACKGROUND = nudgeDismissReason4;
        NudgeDismissReason nudgeDismissReason5 = new NudgeDismissReason("AGENT_APPROVAL", 4, "agent_approval");
        AGENT_APPROVAL = nudgeDismissReason5;
        NudgeDismissReason nudgeDismissReason6 = new NudgeDismissReason("PREEMPTED", 5, "preempted");
        PREEMPTED = nudgeDismissReason6;
        NudgeDismissReason nudgeDismissReason7 = new NudgeDismissReason("INPUT_BLOCKED", 6, "input_blocked");
        INPUT_BLOCKED = nudgeDismissReason7;
        NudgeDismissReason[] nudgeDismissReasonArr = {nudgeDismissReason, nudgeDismissReason2, nudgeDismissReason3, nudgeDismissReason4, nudgeDismissReason5, nudgeDismissReason6, nudgeDismissReason7};
        $VALUES = nudgeDismissReasonArr;
        $ENTRIES = C3cG.A0w(nudgeDismissReasonArr);
    }

    public static Ey9<NudgeDismissReason> getEntries() {
        return $ENTRIES;
    }

    public static NudgeDismissReason valueOf(String str) {
        return (NudgeDismissReason) Enum.valueOf(NudgeDismissReason.class, str);
    }

    public static NudgeDismissReason[] values() {
        return (NudgeDismissReason[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public NudgeDismissReason(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
