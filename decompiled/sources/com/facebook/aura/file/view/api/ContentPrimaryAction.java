package com.facebook.aura.file.view.api;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class ContentPrimaryAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ContentPrimaryAction[] $VALUES;
    public static final ContentPrimaryAction Download;
    public static final ContentPrimaryAction Share;

    static {
        ContentPrimaryAction contentPrimaryAction = new ContentPrimaryAction("Download", 0);
        Download = contentPrimaryAction;
        ContentPrimaryAction contentPrimaryAction2 = new ContentPrimaryAction("Share", 1);
        Share = contentPrimaryAction2;
        ContentPrimaryAction[] contentPrimaryActionArr = {contentPrimaryAction, contentPrimaryAction2};
        $VALUES = contentPrimaryActionArr;
        $ENTRIES = new F3w(contentPrimaryActionArr);
    }

    public static Ey9<ContentPrimaryAction> getEntries() {
        return $ENTRIES;
    }

    public static ContentPrimaryAction valueOf(String str) {
        return (ContentPrimaryAction) Enum.valueOf(ContentPrimaryAction.class, str);
    }

    public static ContentPrimaryAction[] values() {
        return (ContentPrimaryAction[]) $VALUES.clone();
    }

    public ContentPrimaryAction(String str, int i) {
    }
}
