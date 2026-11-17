package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class TransitionKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ TransitionKind[] $VALUES;
    public static final Companion Companion;
    public static final TransitionKind NAVIGATION;
    public static final TransitionKind NO_NAVIGATION;
    public static final TransitionKind RENDER;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        TransitionKind transitionKind = new TransitionKind("NAVIGATION", 0);
        NAVIGATION = transitionKind;
        TransitionKind transitionKind2 = new TransitionKind("RENDER", 1);
        RENDER = transitionKind2;
        TransitionKind transitionKind3 = new TransitionKind("NO_NAVIGATION", 2);
        NO_NAVIGATION = transitionKind3;
        TransitionKind[] transitionKindArr = {transitionKind, transitionKind2, transitionKind3};
        $VALUES = transitionKindArr;
        $ENTRIES = C3cG.A0w(transitionKindArr);
        Companion = new Companion();
    }

    public static Ey9<TransitionKind> getEntries() {
        return $ENTRIES;
    }

    public static TransitionKind valueOf(String str) {
        return (TransitionKind) Enum.valueOf(TransitionKind.class, str);
    }

    public static TransitionKind[] values() {
        return (TransitionKind[]) $VALUES.clone();
    }

    public TransitionKind(String str, int i) {
    }
}
