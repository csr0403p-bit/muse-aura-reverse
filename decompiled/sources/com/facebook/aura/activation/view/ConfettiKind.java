package com.facebook.aura.activation.view;

import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class ConfettiKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ ConfettiKind[] $VALUES;
    public static final ConfettiKind CIRCLE;
    public static final ConfettiKind RECTANGLE;
    public static final ConfettiKind RIBBON;
    public static final ConfettiKind SQUARE;

    static {
        ConfettiKind confettiKind = new ConfettiKind("RECTANGLE", 0);
        RECTANGLE = confettiKind;
        ConfettiKind confettiKind2 = new ConfettiKind("SQUARE", 1);
        SQUARE = confettiKind2;
        ConfettiKind confettiKind3 = new ConfettiKind("CIRCLE", 2);
        CIRCLE = confettiKind3;
        ConfettiKind confettiKind4 = new ConfettiKind("RIBBON", 3);
        RIBBON = confettiKind4;
        ConfettiKind[] confettiKindArr = {confettiKind, confettiKind2, confettiKind3, confettiKind4};
        $VALUES = confettiKindArr;
        $ENTRIES = C3cG.A0w(confettiKindArr);
    }

    public static Ey9<ConfettiKind> getEntries() {
        return $ENTRIES;
    }

    public static ConfettiKind valueOf(String str) {
        return (ConfettiKind) Enum.valueOf(ConfettiKind.class, str);
    }

    public static ConfettiKind[] values() {
        return (ConfettiKind[]) $VALUES.clone();
    }

    public ConfettiKind(String str, int i) {
    }
}
