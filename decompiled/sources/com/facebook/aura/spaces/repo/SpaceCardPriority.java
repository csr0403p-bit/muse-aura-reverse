package com.facebook.aura.spaces.repo;

import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.Ey9;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class SpaceCardPriority {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ SpaceCardPriority[] $VALUES;
    public static final Companion Companion;
    public static final SpaceCardPriority HIGH;
    public static final SpaceCardPriority LOW;
    public static final SpaceCardPriority MEDIUM;
    public final int order;
    public final String value;

    static {
        SpaceCardPriority spaceCardPriority = new SpaceCardPriority("HIGH", 0, "high", 0);
        HIGH = spaceCardPriority;
        SpaceCardPriority spaceCardPriority2 = new SpaceCardPriority("MEDIUM", 1, "medium", 1);
        MEDIUM = spaceCardPriority2;
        SpaceCardPriority spaceCardPriority3 = new SpaceCardPriority("LOW", 2, "low", 2);
        LOW = spaceCardPriority3;
        SpaceCardPriority[] spaceCardPriorityArr = {spaceCardPriority, spaceCardPriority2, spaceCardPriority3};
        $VALUES = spaceCardPriorityArr;
        $ENTRIES = C3cG.A0w(spaceCardPriorityArr);
        Companion = new Companion();
    }

    public final class Companion {
        public final SpaceCardPriority fromInt(int i) {
            return i != 1 ? i != 2 ? SpaceCardPriority.LOW : SpaceCardPriority.MEDIUM : SpaceCardPriority.HIGH;
        }

        public final SpaceCardPriority fromString(String str) {
            SpaceCardPriority next;
            C7384Etj.A0Y(str, 0);
            Iterator<SpaceCardPriority> it = SpaceCardPriority.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (str.equals(next.getValue())) {
                    break;
                }
            }
            SpaceCardPriority spaceCardPriority = next;
            return spaceCardPriority == null ? SpaceCardPriority.MEDIUM : spaceCardPriority;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public static Ey9<SpaceCardPriority> getEntries() {
        return $ENTRIES;
    }

    public static SpaceCardPriority valueOf(String str) {
        return (SpaceCardPriority) Enum.valueOf(SpaceCardPriority.class, str);
    }

    public static SpaceCardPriority[] values() {
        return (SpaceCardPriority[]) $VALUES.clone();
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getValue() {
        return this.value;
    }

    public SpaceCardPriority(String str, int i, String str2, int i2) {
        this.value = str2;
        this.order = i2;
    }
}
