package com.facebook.aura.feed.repo;

import X.AHD;
import X.AHI;

/* loaded from: classes.dex */
public interface FeedUnit {
    String getBodyMarkdown();

    String getCategory();

    String getConnectorAttribution();

    FeedUnitContent getContent();

    int getDiscussCount();

    long getEditionGeneratedAtMs();

    FeedEditionKind getEditionKind();

    String getEditionLocalDate();

    String getEditionTitle();

    String getEmoji();

    String getIconUrl();

    String getId();

    FeedIdeaAction getIdeaAction();

    String getKicker();

    FeedUnitOrigin getOrigin();

    int getPosition();

    FeedPostMetadata getPostMetadata();

    String getPromptId();

    FeedReaction getReaction();

    String getRunId();

    Long getSeenAtMs();

    FeedSocialEmbed getSocialEmbed();

    AHD<FeedStat> getStats();

    String getTitle();

    FeedVideo getVideo();

    String getWhyDidISeeThis();

    boolean isEditionStart();

    boolean isReflective();

    /* renamed from: com.facebook.aura.feed.repo.FeedUnit$-CC, reason: invalid class name */
    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class CC {
        public static FeedPostMetadata $default$getPostMetadata(FeedUnit feedUnit) {
            FeedPostMetadata feedPostMetadata = feedUnit.getContent().postMetadata;
            if (feedPostMetadata != null) {
                return feedPostMetadata;
            }
            long editionGeneratedAtMs = feedUnit.getEditionGeneratedAtMs();
            Long lValueOf = Long.valueOf(editionGeneratedAtMs);
            if (editionGeneratedAtMs <= 0) {
                lValueOf = null;
            }
            return new FeedPostMetadata(lValueOf, feedUnit.getWhyDidISeeThis(), AHI.A01);
        }
    }

    /* loaded from: classes6.dex */
    public abstract class DefaultImpls {
        @Deprecated
        public static String getBodyMarkdown(FeedUnit feedUnit) {
            return feedUnit.getContent().bodyMarkdown;
        }

        @Deprecated
        public static String getCategory(FeedUnit feedUnit) {
            return feedUnit.getContent().category;
        }

        @Deprecated
        public static String getConnectorAttribution(FeedUnit feedUnit) {
            return feedUnit.getContent().connectorAttribution;
        }

        @Deprecated
        public static int getDiscussCount(FeedUnit feedUnit) {
            return feedUnit.getContent().discussCount;
        }

        @Deprecated
        public static long getEditionGeneratedAtMs(FeedUnit feedUnit) {
            return feedUnit.getContent().editionGeneratedAtMs;
        }

        @Deprecated
        public static FeedEditionKind getEditionKind(FeedUnit feedUnit) {
            return feedUnit.getContent().editionKind;
        }

        @Deprecated
        public static String getEditionLocalDate(FeedUnit feedUnit) {
            return feedUnit.getContent().editionLocalDate;
        }

        @Deprecated
        public static String getEditionTitle(FeedUnit feedUnit) {
            return feedUnit.getContent().editionTitle;
        }

        @Deprecated
        public static String getEmoji(FeedUnit feedUnit) {
            return feedUnit.getContent().emoji;
        }

        @Deprecated
        public static String getIconUrl(FeedUnit feedUnit) {
            return feedUnit.getContent().iconUrl;
        }

        @Deprecated
        public static String getId(FeedUnit feedUnit) {
            return feedUnit.getContent().id;
        }

        @Deprecated
        public static FeedIdeaAction getIdeaAction(FeedUnit feedUnit) {
            return feedUnit.getContent().ideaAction;
        }

        @Deprecated
        public static String getKicker(FeedUnit feedUnit) {
            return feedUnit.getContent().kicker;
        }

        @Deprecated
        public static FeedUnitOrigin getOrigin(FeedUnit feedUnit) {
            return feedUnit.getContent().origin;
        }

        @Deprecated
        public static int getPosition(FeedUnit feedUnit) {
            return feedUnit.getContent().position;
        }

        @Deprecated
        public static FeedPostMetadata getPostMetadata(FeedUnit feedUnit) {
            return CC.$default$getPostMetadata(feedUnit);
        }

        @Deprecated
        public static String getPromptId(FeedUnit feedUnit) {
            return feedUnit.getContent().promptId;
        }

        @Deprecated
        public static FeedReaction getReaction(FeedUnit feedUnit) {
            return feedUnit.getContent().reaction;
        }

        @Deprecated
        public static String getRunId(FeedUnit feedUnit) {
            return feedUnit.getContent().runId;
        }

        @Deprecated
        public static Long getSeenAtMs(FeedUnit feedUnit) {
            return feedUnit.getContent().seenAtMs;
        }

        @Deprecated
        public static FeedSocialEmbed getSocialEmbed(FeedUnit feedUnit) {
            return feedUnit.getContent().socialEmbed;
        }

        @Deprecated
        public static AHD<FeedStat> getStats(FeedUnit feedUnit) {
            return feedUnit.getContent().stats;
        }

        @Deprecated
        public static String getTitle(FeedUnit feedUnit) {
            return feedUnit.getContent().title;
        }

        @Deprecated
        public static FeedVideo getVideo(FeedUnit feedUnit) {
            return feedUnit.getContent().video;
        }

        @Deprecated
        public static String getWhyDidISeeThis(FeedUnit feedUnit) {
            return feedUnit.getContent().whyDidISeeThis;
        }

        @Deprecated
        public static boolean isEditionStart(FeedUnit feedUnit) {
            return feedUnit.getContent().isEditionStart;
        }

        @Deprecated
        public static boolean isReflective(FeedUnit feedUnit) {
            return feedUnit.getContent().isReflective;
        }
    }
}
