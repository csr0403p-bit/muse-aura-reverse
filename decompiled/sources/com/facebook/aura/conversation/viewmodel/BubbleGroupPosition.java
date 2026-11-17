package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass002;
import X.Ey9;
import X.F3w;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class BubbleGroupPosition {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ BubbleGroupPosition[] $VALUES;
    public static final BubbleGroupPosition FIRST;
    public static final BubbleGroupPosition LAST;
    public static final BubbleGroupPosition MIDDLE;
    public static final BubbleGroupPosition STANDALONE;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BubbleGroupPosition.values().length];
            try {
                AnonymousClass002.A13(BubbleGroupPosition.STANDALONE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(BubbleGroupPosition.LAST, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        BubbleGroupPosition bubbleGroupPosition = new BubbleGroupPosition("STANDALONE", 0);
        STANDALONE = bubbleGroupPosition;
        BubbleGroupPosition bubbleGroupPosition2 = new BubbleGroupPosition("FIRST", 1);
        FIRST = bubbleGroupPosition2;
        BubbleGroupPosition bubbleGroupPosition3 = new BubbleGroupPosition("MIDDLE", 2);
        MIDDLE = bubbleGroupPosition3;
        BubbleGroupPosition bubbleGroupPosition4 = new BubbleGroupPosition("LAST", 3);
        LAST = bubbleGroupPosition4;
        BubbleGroupPosition[] bubbleGroupPositionArr = {bubbleGroupPosition, bubbleGroupPosition2, bubbleGroupPosition3, bubbleGroupPosition4};
        $VALUES = bubbleGroupPositionArr;
        $ENTRIES = new F3w(bubbleGroupPositionArr);
    }

    public static Ey9<BubbleGroupPosition> getEntries() {
        return $ENTRIES;
    }

    public static BubbleGroupPosition valueOf(String str) {
        return (BubbleGroupPosition) Enum.valueOf(BubbleGroupPosition.class, str);
    }

    public static BubbleGroupPosition[] values() {
        return (BubbleGroupPosition[]) $VALUES.clone();
    }

    public BubbleGroupPosition(String str, int i) {
    }

    public final BubbleGroupPosition promoteToGroupInterior() {
        int iOrdinal = ordinal();
        return iOrdinal != 0 ? iOrdinal != 3 ? this : MIDDLE : FIRST;
    }
}
