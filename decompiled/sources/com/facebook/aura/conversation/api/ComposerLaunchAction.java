package com.facebook.aura.conversation.api;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import android.content.Intent;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ComposerLaunchAction {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ComposerLaunchAction[] $VALUES;
    public static final Companion Companion;
    public static final ComposerLaunchAction DICTATION;
    public static final String EXTRA = "com.facebook.aura.extra.COMPOSER_LAUNCH_ACTION";
    public static final ComposerLaunchAction KEYBOARD;

    static {
        ComposerLaunchAction composerLaunchAction = new ComposerLaunchAction("KEYBOARD", 0);
        KEYBOARD = composerLaunchAction;
        ComposerLaunchAction composerLaunchAction2 = new ComposerLaunchAction("DICTATION", 1);
        DICTATION = composerLaunchAction2;
        ComposerLaunchAction[] composerLaunchActionArr = {composerLaunchAction, composerLaunchAction2};
        $VALUES = composerLaunchActionArr;
        $ENTRIES = C3cG.A0w(composerLaunchActionArr);
        Companion = new Companion();
    }

    public static Ey9<ComposerLaunchAction> getEntries() {
        return $ENTRIES;
    }

    public static ComposerLaunchAction valueOf(String str) {
        return (ComposerLaunchAction) Enum.valueOf(ComposerLaunchAction.class, str);
    }

    public static ComposerLaunchAction[] values() {
        return (ComposerLaunchAction[]) $VALUES.clone();
    }

    public final class Companion {
        public final ComposerLaunchAction fromIntent(Intent intent) {
            ComposerLaunchAction next;
            C7384Etj.A0Y(intent, 0);
            String stringExtra = intent.getStringExtra(ComposerLaunchAction.EXTRA);
            Iterator<ComposerLaunchAction> it = ComposerLaunchAction.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.name().equals(stringExtra)) {
                    break;
                }
            }
            return next;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public ComposerLaunchAction(String str, int i) {
    }
}
