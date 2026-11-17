package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CommandProgress {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ CommandProgress[] $VALUES;
    public static final Companion Companion;
    public static final CommandProgress FILL_AND_SUBMIT_ACKNOWLEDGED;
    public static final CommandProgress FILL_APPLIED;
    public static final CommandProgress FILL_APPLIED_SUBMIT_NOT_SENT;
    public static final CommandProgress FILL_APPLIED_SUBMIT_SUPPRESSED;
    public static final CommandProgress FILL_APPLIED_SUBMIT_UNKNOWN;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        CommandProgress commandProgress = new CommandProgress("FILL_APPLIED", 0);
        FILL_APPLIED = commandProgress;
        CommandProgress commandProgress2 = new CommandProgress("FILL_APPLIED_SUBMIT_NOT_SENT", 1);
        FILL_APPLIED_SUBMIT_NOT_SENT = commandProgress2;
        CommandProgress commandProgress3 = new CommandProgress("FILL_APPLIED_SUBMIT_SUPPRESSED", 2);
        FILL_APPLIED_SUBMIT_SUPPRESSED = commandProgress3;
        CommandProgress commandProgress4 = new CommandProgress("FILL_AND_SUBMIT_ACKNOWLEDGED", 3);
        FILL_AND_SUBMIT_ACKNOWLEDGED = commandProgress4;
        CommandProgress commandProgress5 = new CommandProgress("FILL_APPLIED_SUBMIT_UNKNOWN", 4);
        FILL_APPLIED_SUBMIT_UNKNOWN = commandProgress5;
        CommandProgress[] commandProgressArr = {commandProgress, commandProgress2, commandProgress3, commandProgress4, commandProgress5};
        $VALUES = commandProgressArr;
        $ENTRIES = C3cG.A0w(commandProgressArr);
        Companion = new Companion();
    }

    public static Ey9<CommandProgress> getEntries() {
        return $ENTRIES;
    }

    public static CommandProgress valueOf(String str) {
        return (CommandProgress) Enum.valueOf(CommandProgress.class, str);
    }

    public static CommandProgress[] values() {
        return (CommandProgress[]) $VALUES.clone();
    }

    public CommandProgress(String str, int i) {
    }
}
