package com.facebook.aura.file.docx;

import X.C3cG;
import X.Ey9;
import com.facebook.aura.conversation.offline.HatchPersistedMessageJson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ListStyle {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ListStyle[] $VALUES;
    public static final ListStyle BULLET;
    public static final ListStyle NONE;
    public static final ListStyle NUMBERED;

    static {
        ListStyle listStyle = new ListStyle(HatchPersistedMessageJson.UNSEND_STATUS_NONE, 0);
        NONE = listStyle;
        ListStyle listStyle2 = new ListStyle("BULLET", 1);
        BULLET = listStyle2;
        ListStyle listStyle3 = new ListStyle("NUMBERED", 2);
        NUMBERED = listStyle3;
        ListStyle[] listStyleArr = {listStyle, listStyle2, listStyle3};
        $VALUES = listStyleArr;
        $ENTRIES = C3cG.A0w(listStyleArr);
    }

    public static Ey9<ListStyle> getEntries() {
        return $ENTRIES;
    }

    public static ListStyle valueOf(String str) {
        return (ListStyle) Enum.valueOf(ListStyle.class, str);
    }

    public static ListStyle[] values() {
        return (ListStyle[]) $VALUES.clone();
    }

    public ListStyle(String str, int i) {
    }
}
