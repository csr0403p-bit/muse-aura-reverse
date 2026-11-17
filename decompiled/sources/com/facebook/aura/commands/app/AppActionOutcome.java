package com.facebook.aura.commands.app;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.confidentialvm.vmswitch.CvmMigrationStatusJson;
import com.facebook.aura.pairs.ConnectionsActivityKt;
import com.facebook.aura.spacesharing.impl.SpaceShareUiCommandsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AppActionOutcome {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AppActionOutcome[] $VALUES;
    public static final AppActionOutcome ALREADY_DONE;
    public static final AppActionOutcome COMPLETED;
    public static final AppActionOutcome DECLINED;
    public static final AppActionOutcome EXPIRED;
    public static final AppActionOutcome FAILED;
    public static final AppActionOutcome IN_PROGRESS;
    public static final AppActionOutcome NOT_SHOWN;
    public static final AppActionOutcome UNSUPPORTED;
    public static final AppActionOutcome USE_PLAY_STORE;
    public final String wireValue;

    static {
        AppActionOutcome appActionOutcome = new AppActionOutcome("COMPLETED", 0, "completed");
        COMPLETED = appActionOutcome;
        AppActionOutcome appActionOutcome2 = new AppActionOutcome("DECLINED", 1, ConnectionsActivityKt.FILE_STATE_DECLINED);
        DECLINED = appActionOutcome2;
        AppActionOutcome appActionOutcome3 = new AppActionOutcome(CvmMigrationStatusJson.STAGE_FAILED, 2, "failed");
        FAILED = appActionOutcome3;
        AppActionOutcome appActionOutcome4 = new AppActionOutcome("EXPIRED", 3, "expired");
        EXPIRED = appActionOutcome4;
        AppActionOutcome appActionOutcome5 = new AppActionOutcome("NOT_SHOWN", 4, "not_shown");
        NOT_SHOWN = appActionOutcome5;
        AppActionOutcome appActionOutcome6 = new AppActionOutcome("ALREADY_DONE", 5, "already_done");
        ALREADY_DONE = appActionOutcome6;
        AppActionOutcome appActionOutcome7 = new AppActionOutcome("IN_PROGRESS", 6, "in_progress");
        IN_PROGRESS = appActionOutcome7;
        AppActionOutcome appActionOutcome8 = new AppActionOutcome("USE_PLAY_STORE", 7, "use_play_store");
        USE_PLAY_STORE = appActionOutcome8;
        AppActionOutcome appActionOutcome9 = new AppActionOutcome("UNSUPPORTED", 8, SpaceShareUiCommandsKt.ERROR_CODE_UNSUPPORTED);
        UNSUPPORTED = appActionOutcome9;
        AppActionOutcome[] appActionOutcomeArr = {appActionOutcome, appActionOutcome2, appActionOutcome3, appActionOutcome4, appActionOutcome5, appActionOutcome6, appActionOutcome7, appActionOutcome8, appActionOutcome9};
        $VALUES = appActionOutcomeArr;
        $ENTRIES = C3cG.A0w(appActionOutcomeArr);
    }

    public static Ey9<AppActionOutcome> getEntries() {
        return $ENTRIES;
    }

    public static AppActionOutcome valueOf(String str) {
        return (AppActionOutcome) Enum.valueOf(AppActionOutcome.class, str);
    }

    public static AppActionOutcome[] values() {
        return (AppActionOutcome[]) $VALUES.clone();
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    public AppActionOutcome(String str, int i, String str2) {
        this.wireValue = str2;
    }
}
