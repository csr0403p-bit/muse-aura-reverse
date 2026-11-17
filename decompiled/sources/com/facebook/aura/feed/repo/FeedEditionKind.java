package com.facebook.aura.feed.repo;

import X.C06H;
import X.C7384Etj;
import X.Ey9;
import X.F3w;
import java.util.Iterator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class FeedEditionKind {
    public static final /* synthetic */ Ey9 $ENTRIES;
    public static final /* synthetic */ FeedEditionKind[] $VALUES;
    public static final FeedEditionKind ADHOC;
    public static final Companion Companion;
    public static final FeedEditionKind EVENING;
    public static final FeedEditionKind FILL;
    public static final FeedEditionKind MIDDAY;
    public static final FeedEditionKind MORNING;
    public static final FeedEditionKind UNKNOWN;
    public final String value;

    static {
        FeedEditionKind feedEditionKind = new FeedEditionKind("MORNING", 0, "morning");
        MORNING = feedEditionKind;
        FeedEditionKind feedEditionKind2 = new FeedEditionKind("MIDDAY", 1, "midday");
        MIDDAY = feedEditionKind2;
        FeedEditionKind feedEditionKind3 = new FeedEditionKind("EVENING", 2, "evening");
        EVENING = feedEditionKind3;
        FeedEditionKind feedEditionKind4 = new FeedEditionKind("ADHOC", 3, "adhoc");
        ADHOC = feedEditionKind4;
        FeedEditionKind feedEditionKind5 = new FeedEditionKind("FILL", 4, "fill");
        FILL = feedEditionKind5;
        FeedEditionKind feedEditionKind6 = new FeedEditionKind("UNKNOWN", 5, null);
        UNKNOWN = feedEditionKind6;
        FeedEditionKind[] feedEditionKindArr = {feedEditionKind, feedEditionKind2, feedEditionKind3, feedEditionKind4, feedEditionKind5, feedEditionKind6};
        $VALUES = feedEditionKindArr;
        $ENTRIES = new F3w(feedEditionKindArr);
        Companion = new Companion();
    }

    public static Ey9<FeedEditionKind> getEntries() {
        return $ENTRIES;
    }

    public static FeedEditionKind valueOf(String str) {
        return (FeedEditionKind) Enum.valueOf(FeedEditionKind.class, str);
    }

    public static FeedEditionKind[] values() {
        return (FeedEditionKind[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }

    public final class Companion {
        public final FeedEditionKind fromWire(String str) {
            FeedEditionKind next;
            C7384Etj.A0Y(str, 0);
            Iterator<FeedEditionKind> it = FeedEditionKind.getEntries().iterator();
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
            FeedEditionKind feedEditionKind = next;
            return feedEditionKind == null ? FeedEditionKind.UNKNOWN : feedEditionKind;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public FeedEditionKind(String str, int i, String str2) {
        this.value = str2;
    }
}
