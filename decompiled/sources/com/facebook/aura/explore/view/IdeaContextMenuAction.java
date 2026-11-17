package com.facebook.aura.explore.view;

import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class IdeaContextMenuAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ IdeaContextMenuAction[] $VALUES;
    public static final IdeaContextMenuAction EXECUTE;
    public static final IdeaContextMenuAction FEEDBACK_DOWN;
    public static final IdeaContextMenuAction FEEDBACK_UP;

    static {
        IdeaContextMenuAction ideaContextMenuAction = new IdeaContextMenuAction("EXECUTE", 0);
        EXECUTE = ideaContextMenuAction;
        IdeaContextMenuAction ideaContextMenuAction2 = new IdeaContextMenuAction("FEEDBACK_UP", 1);
        FEEDBACK_UP = ideaContextMenuAction2;
        IdeaContextMenuAction ideaContextMenuAction3 = new IdeaContextMenuAction("FEEDBACK_DOWN", 2);
        FEEDBACK_DOWN = ideaContextMenuAction3;
        IdeaContextMenuAction[] ideaContextMenuActionArr = {ideaContextMenuAction, ideaContextMenuAction2, ideaContextMenuAction3};
        $VALUES = ideaContextMenuActionArr;
        $ENTRIES = new F3w(ideaContextMenuActionArr);
    }

    public static Ey9<IdeaContextMenuAction> getEntries() {
        return $ENTRIES;
    }

    public static IdeaContextMenuAction valueOf(String str) {
        return (IdeaContextMenuAction) Enum.valueOf(IdeaContextMenuAction.class, str);
    }

    public static IdeaContextMenuAction[] values() {
        return (IdeaContextMenuAction[]) $VALUES.clone();
    }

    public IdeaContextMenuAction(String str, int i) {
    }
}
