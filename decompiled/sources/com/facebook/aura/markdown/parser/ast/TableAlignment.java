package com.facebook.aura.markdown.parser.ast;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TableAlignment {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TableAlignment[] $VALUES;
    public static final TableAlignment CENTER;
    public static final TableAlignment LEFT;
    public static final TableAlignment NONE;
    public static final TableAlignment RIGHT;

    static {
        TableAlignment tableAlignment = new TableAlignment("LEFT", 0);
        LEFT = tableAlignment;
        TableAlignment tableAlignment2 = new TableAlignment("CENTER", 1);
        CENTER = tableAlignment2;
        TableAlignment tableAlignment3 = new TableAlignment("RIGHT", 2);
        RIGHT = tableAlignment3;
        TableAlignment tableAlignment4 = new TableAlignment(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 3);
        NONE = tableAlignment4;
        TableAlignment[] tableAlignmentArr = {tableAlignment, tableAlignment2, tableAlignment3, tableAlignment4};
        $VALUES = tableAlignmentArr;
        $ENTRIES = C3cG.A0w(tableAlignmentArr);
    }

    public static Ey9<TableAlignment> getEntries() {
        return $ENTRIES;
    }

    public static TableAlignment valueOf(String str) {
        return (TableAlignment) Enum.valueOf(TableAlignment.class, str);
    }

    public static TableAlignment[] values() {
        return (TableAlignment[]) $VALUES.clone();
    }

    public TableAlignment(String str, int i) {
    }
}
