package com.facebook.aura.commands.alarm;

import X.AnonymousClass001;
import X.C06H;
import X.C3cG;
import X.Ey9;
import com.facebook.aura.nodes.cards.HatchNodeCardJsonKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class AlarmType {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ AlarmType[] $VALUES;
    public static final AlarmType ALARM;
    public static final Companion Companion;
    public static final AlarmType REMINDER;

    public final class Companion {
        public final AlarmType fromWire(String str) {
            return HatchNodeCardJsonKt.TYPE_REMINDER.equals(str != null ? AnonymousClass001.A0u(str) : null) ? AlarmType.REMINDER : AlarmType.ALARM;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    static {
        AlarmType alarmType = new AlarmType("ALARM", 0);
        ALARM = alarmType;
        AlarmType alarmType2 = new AlarmType("REMINDER", 1);
        REMINDER = alarmType2;
        AlarmType[] alarmTypeArr = {alarmType, alarmType2};
        $VALUES = alarmTypeArr;
        $ENTRIES = C3cG.A0w(alarmTypeArr);
        Companion = new Companion();
    }

    public static Ey9<AlarmType> getEntries() {
        return $ENTRIES;
    }

    public static AlarmType valueOf(String str) {
        return (AlarmType) Enum.valueOf(AlarmType.class, str);
    }

    public static AlarmType[] values() {
        return (AlarmType[]) $VALUES.clone();
    }

    public AlarmType(String str, int i) {
    }
}
