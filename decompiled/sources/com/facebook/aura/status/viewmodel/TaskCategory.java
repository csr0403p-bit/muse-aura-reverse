package com.facebook.aura.status.viewmodel;

import X.AnonymousClass002;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import com.facebook.aura.model.HatchTaskCadence;
import com.facebook.aura.model.HatchTaskCadenceKind;
import com.facebook.aura.model.HatchTaskEntry;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class TaskCategory {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TaskCategory[] $VALUES;
    public static final Companion Companion;
    public static final TaskCategory DAILY;
    public static final TaskCategory INTERVAL;
    public static final TaskCategory MONTHLY;
    public static final TaskCategory REMINDERS;
    public static final TaskCategory WEEKLY;
    public static final TaskCategory YEARLY;

    public final class Companion {
        public final TaskCategory classify(HatchTaskEntry hatchTaskEntry) {
            C7384Etj.A0Y(hatchTaskEntry, 0);
            if (hatchTaskEntry.isHeartbeat) {
                return null;
            }
            String str = hatchTaskEntry.mode;
            if ("heartbeat".equals(str)) {
                return null;
            }
            if (!HatchNodeCardJsonKt.TYPE_REMINDER.equals(str)) {
                HatchTaskCadence hatchTaskCadence = hatchTaskEntry.cadence;
                if (hatchTaskCadence != null) {
                    switch (hatchTaskCadence.kind.ordinal()) {
                        case 0:
                            break;
                        case 1:
                            return TaskCategory.INTERVAL;
                        case 2:
                            return TaskCategory.DAILY;
                        case 3:
                            return TaskCategory.WEEKLY;
                        case 4:
                            return TaskCategory.MONTHLY;
                        case 5:
                            return TaskCategory.YEARLY;
                        default:
                            throw C3cG.A0q();
                    }
                } else {
                    String str2 = hatchTaskEntry.scheduleKey;
                    if (str2 == null) {
                        return null;
                    }
                    if (!str2.startsWith("runonce@")) {
                        if (!str2.startsWith("interval@") && !str2.startsWith("hourly@")) {
                            if (!str2.startsWith("daily@")) {
                                if (!str2.startsWith("weekly@")) {
                                    if (!str2.startsWith("monthly@")) {
                                        if (!str2.startsWith("yearly@")) {
                                            return null;
                                        }
                                        return TaskCategory.YEARLY;
                                    }
                                    return TaskCategory.MONTHLY;
                                }
                                return TaskCategory.WEEKLY;
                            }
                            return TaskCategory.DAILY;
                        }
                        return TaskCategory.INTERVAL;
                    }
                }
            }
            return TaskCategory.REMINDERS;
        }

        public abstract /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HatchTaskCadenceKind.values().length];
                try {
                    AnonymousClass002.A13(HatchTaskCadenceKind.RUNONCE, iArr);
                } catch (NoSuchFieldError unused) {
                }
                try {
                    AnonymousClass002.A14(HatchTaskCadenceKind.INTERVAL, iArr);
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    AnonymousClass002.A15(HatchTaskCadenceKind.DAILY, iArr);
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    AnonymousClass002.A16(HatchTaskCadenceKind.WEEKLY, iArr);
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    AnonymousClass002.A17(HatchTaskCadenceKind.MONTHLY, iArr);
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    AnonymousClass002.A18(HatchTaskCadenceKind.YEARLY, iArr);
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        TaskCategory taskCategory = new TaskCategory("REMINDERS", 0);
        REMINDERS = taskCategory;
        TaskCategory taskCategory2 = new TaskCategory("INTERVAL", 1);
        INTERVAL = taskCategory2;
        TaskCategory taskCategory3 = new TaskCategory("DAILY", 2);
        DAILY = taskCategory3;
        TaskCategory taskCategory4 = new TaskCategory("WEEKLY", 3);
        WEEKLY = taskCategory4;
        TaskCategory taskCategory5 = new TaskCategory("MONTHLY", 4);
        MONTHLY = taskCategory5;
        TaskCategory taskCategory6 = new TaskCategory("YEARLY", 5);
        YEARLY = taskCategory6;
        TaskCategory[] taskCategoryArr = {taskCategory, taskCategory2, taskCategory3, taskCategory4, taskCategory5, taskCategory6};
        $VALUES = taskCategoryArr;
        $ENTRIES = C3cG.A0w(taskCategoryArr);
        Companion = new Companion();
    }

    public static Ey9<TaskCategory> getEntries() {
        return $ENTRIES;
    }

    public static TaskCategory valueOf(String str) {
        return (TaskCategory) Enum.valueOf(TaskCategory.class, str);
    }

    public static TaskCategory[] values() {
        return (TaskCategory[]) $VALUES.clone();
    }

    public TaskCategory(String str, int i) {
    }
}
