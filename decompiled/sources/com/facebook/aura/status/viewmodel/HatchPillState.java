package com.facebook.aura.status.viewmodel;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class HatchPillState {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ HatchPillState[] $VALUES;
    public static final HatchPillState CONNECTING;
    public static final HatchPillState CONNECTION_ERROR;
    public static final HatchPillState DISCONNECTED;
    public static final HatchPillState IDLE;
    public static final HatchPillState MAKING_SOMETHING;
    public static final HatchPillState NEEDS_APPROVAL;
    public static final HatchPillState OUT_OF_CREDITS;
    public static final HatchPillState PAUSED;
    public static final HatchPillState RESETTING;
    public static final HatchPillState THINKING;
    public static final HatchPillState TYPING;
    public static final HatchPillState USING_TOOL;
    public static final HatchPillState WAITING_FOR_SUBAGENTS;
    public static final HatchPillState WAKING_UP;

    static {
        HatchPillState hatchPillState = new HatchPillState("DISCONNECTED", 0);
        DISCONNECTED = hatchPillState;
        HatchPillState hatchPillState2 = new HatchPillState("CONNECTING", 1);
        CONNECTING = hatchPillState2;
        HatchPillState hatchPillState3 = new HatchPillState("WAKING_UP", 2);
        WAKING_UP = hatchPillState3;
        HatchPillState hatchPillState4 = new HatchPillState("CONNECTION_ERROR", 3);
        CONNECTION_ERROR = hatchPillState4;
        HatchPillState hatchPillState5 = new HatchPillState("IDLE", 4);
        IDLE = hatchPillState5;
        HatchPillState hatchPillState6 = new HatchPillState("THINKING", 5);
        THINKING = hatchPillState6;
        HatchPillState hatchPillState7 = new HatchPillState("USING_TOOL", 6);
        USING_TOOL = hatchPillState7;
        HatchPillState hatchPillState8 = new HatchPillState("WAITING_FOR_SUBAGENTS", 7);
        WAITING_FOR_SUBAGENTS = hatchPillState8;
        HatchPillState hatchPillState9 = new HatchPillState("MAKING_SOMETHING", 8);
        MAKING_SOMETHING = hatchPillState9;
        HatchPillState hatchPillState10 = new HatchPillState("TYPING", 9);
        TYPING = hatchPillState10;
        HatchPillState hatchPillState11 = new HatchPillState("RESETTING", 10);
        RESETTING = hatchPillState11;
        HatchPillState hatchPillState12 = new HatchPillState("PAUSED", 11);
        PAUSED = hatchPillState12;
        HatchPillState hatchPillState13 = new HatchPillState("NEEDS_APPROVAL", 12);
        NEEDS_APPROVAL = hatchPillState13;
        HatchPillState hatchPillState14 = new HatchPillState("OUT_OF_CREDITS", 13);
        OUT_OF_CREDITS = hatchPillState14;
        HatchPillState[] hatchPillStateArr = {hatchPillState, hatchPillState2, hatchPillState3, hatchPillState4, hatchPillState5, hatchPillState6, hatchPillState7, hatchPillState8, hatchPillState9, hatchPillState10, hatchPillState11, hatchPillState12, hatchPillState13, hatchPillState14};
        $VALUES = hatchPillStateArr;
        $ENTRIES = C3cG.A0w(hatchPillStateArr);
    }

    public static Ey9<HatchPillState> getEntries() {
        return $ENTRIES;
    }

    public static HatchPillState valueOf(String str) {
        return (HatchPillState) Enum.valueOf(HatchPillState.class, str);
    }

    public static HatchPillState[] values() {
        return (HatchPillState[]) $VALUES.clone();
    }

    public HatchPillState(String str, int i) {
    }
}
