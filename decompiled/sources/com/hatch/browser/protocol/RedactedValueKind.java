package com.hatch.browser.protocol;

import X.C06H;
import X.C3cG;
import X.Ey9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class RedactedValueKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ RedactedValueKind[] $VALUES;
    public static final Companion Companion;
    public static final RedactedValueKind PASSWORD;

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    static {
        RedactedValueKind redactedValueKind = new RedactedValueKind("PASSWORD", 0);
        PASSWORD = redactedValueKind;
        RedactedValueKind[] redactedValueKindArr = {redactedValueKind};
        $VALUES = redactedValueKindArr;
        $ENTRIES = C3cG.A0w(redactedValueKindArr);
        Companion = new Companion();
    }

    public static Ey9<RedactedValueKind> getEntries() {
        return $ENTRIES;
    }

    public static RedactedValueKind valueOf(String str) {
        return (RedactedValueKind) Enum.valueOf(RedactedValueKind.class, str);
    }

    public static RedactedValueKind[] values() {
        return (RedactedValueKind[]) $VALUES.clone();
    }

    public RedactedValueKind(String str, int i) {
    }
}
