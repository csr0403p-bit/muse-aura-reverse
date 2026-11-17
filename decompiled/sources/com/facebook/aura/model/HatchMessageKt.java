package com.facebook.aura.model;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class HatchMessageKt {
    public static final String ACTIVITY_DISCUSSION_SCHEME = "activity://";
    public static final String FEED_DISCUSSION_SCHEME = "feed://";
    public static final String FILE_DISCUSSION_SCHEME = "file://";
    public static final String GOAL_DISCUSSION_SCHEME = "goal://";
    public static final String HATCH_DELIVERY_VOICEOVER = "voiceover";

    public static final String createAttachmentHandleForDiscussionItem(String str, DiscussionItemType discussionItemType) {
        String str2;
        boolean zA1a = AnonymousClass002.A1a(str, discussionItemType);
        int iOrdinal = discussionItemType.ordinal();
        if (iOrdinal == 0) {
            str2 = FEED_DISCUSSION_SCHEME;
        } else if (iOrdinal == zA1a) {
            str2 = ACTIVITY_DISCUSSION_SCHEME;
        } else if (iOrdinal == 2) {
            str2 = FILE_DISCUSSION_SCHEME;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = GOAL_DISCUSSION_SCHEME;
        }
        return FGI.A0M(str2, str);
    }

    public static final String feedUnitIdFromDiscussionHandle(String str) {
        String strA0K;
        C7384Etj.A0Y(str, 0);
        if (!str.startsWith(FEED_DISCUSSION_SCHEME) || (strA0K = C7BY.A0K(FEED_DISCUSSION_SCHEME, str)) == null || strA0K.length() <= 0) {
            return null;
        }
        return strA0K;
    }

    public static final String getAnalyticsValue(HatchMessageRole hatchMessageRole) {
        int iA0E = AnonymousClass001.A0E(hatchMessageRole, 0);
        if (iA0E == 0) {
            return "user";
        }
        if (iA0E == 1) {
            return "assistant";
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final String goalIdFromDiscussionHandle(String str) {
        String strA0K;
        C7384Etj.A0Y(str, 0);
        if (!str.startsWith(GOAL_DISCUSSION_SCHEME) || (strA0K = C7BY.A0K(GOAL_DISCUSSION_SCHEME, str)) == null || strA0K.length() <= 0) {
            return null;
        }
        return strA0K;
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[HatchMessageRole.values().length];
            try {
                AnonymousClass005.A0v(HatchMessageRole.USER, iArr, 1);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass005.A0v(HatchMessageRole.AGENT, iArr, 2);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DiscussionItemType.values().length];
            try {
                AnonymousClass005.A0v(DiscussionItemType.FeedCard, iArr2, 1);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass005.A0v(DiscussionItemType.Activity, iArr2, 2);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A15(DiscussionItemType.File, iArr2);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A16(DiscussionItemType.Goal, iArr2);
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
