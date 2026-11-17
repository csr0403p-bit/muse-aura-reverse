package com.facebook.aura.feed.repo;

import X.AII;
import X.AIM;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3cG;
import X.C9sR;
import X.C9sU;
import X.HxE;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;

/* loaded from: classes3.dex */
public abstract class FeedRepositoryKt {
    public static final long FEED_INFINITE_IDLE_TIMEOUT_SECONDS = 60;
    public static final C9sU FEED_INFINITE_JSON = C9sR.A00(FeedRepositoryKt$FEED_INFINITE_JSON$1.INSTANCE, C9sU.A03);
    public static final long FEED_INFINITE_REQUEST_TIMEOUT_SECONDS = 180;
    public static final long FEED_TIMEOUT_SECONDS = 60;
    public static final String SKIP_RECEIPTS_PARAM = "skip_receipts";
    public static final String TAG = "FeedRepository";
    public static final String TIMEZONE_PARAM = "timezone";

    public static final String toWireValue(FeedReaction feedReaction) {
        int iOrdinal;
        if (feedReaction == null || (iOrdinal = feedReaction.ordinal()) == -1) {
            return null;
        }
        if (iOrdinal == 0) {
            return "like";
        }
        if (iOrdinal == 1) {
            return "love";
        }
        if (iOrdinal == 2) {
            return "dislike";
        }
        throw C3cG.A0q();
    }

    /* loaded from: classes.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FeedReaction.values().length];
            try {
                AnonymousClass002.A13(FeedReaction.LIKE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FeedReaction.LOVE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FeedReaction.DISLIKE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final HxE<String, Object>[] feedCursorQueryParams(String str, String str2) {
        HxE hxEA0r;
        AII aiiA17 = AIM.A17();
        if (str2 == null || str2.length() <= 0) {
            if (str != null && str.length() > 0) {
                hxEA0r = C3cG.A0r("cursor", str);
            }
            return (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
        }
        hxEA0r = C3cG.A0r("unit_id", str2);
        aiiA17.add(hxEA0r);
        return (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
    }

    public static final HxE<String, Object>[] infiniteFeedQueryParams() {
        AII aiiA17 = AIM.A17();
        if (HatchDeveloperPrefs.cachedSkipInfiniteFeedReceipts) {
            AnonymousClass002.A1J(SKIP_RECEIPTS_PARAM, AnonymousClass001.A0i(), aiiA17);
        }
        return (HxE[]) AIM.A18(aiiA17).toArray(new HxE[0]);
    }
}
