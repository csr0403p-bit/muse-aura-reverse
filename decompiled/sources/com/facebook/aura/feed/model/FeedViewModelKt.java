package com.facebook.aura.feed.model;

import X.AnonymousClass003;
import X.C7384Etj;
import com.facebook.aura.common.prefs.HatchDeveloperPrefs;
import com.facebook.aura.feed.repo.FeedAttachment;
import com.facebook.aura.feed.repo.FeedCarouselUnit;
import com.facebook.aura.feed.repo.FeedHeroImageUnit;
import com.facebook.aura.feed.repo.FeedReaction;
import com.facebook.aura.feed.repo.FeedTextUnit;
import com.facebook.aura.feed.repo.FeedUnit;
import com.facebook.aura.feed.repo.FeedUnitContent;
import com.facebook.aura.feed.repo.FeedWidgetUnit;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public abstract class FeedViewModelKt {
    public static final long ANCHOR_STALE_AFTER_MS = 600000;
    public static final int FEED_SEEN_BATCH_CAP = 200;
    public static final long FEED_SEEN_MIN_DWELL_MS = 1000;
    public static final int FEED_VIEW_FLUSH_THRESHOLD = 100;
    public static final int PROMPT_SEED_MAX_RETRIES = 3;
    public static final long PROMPT_SEED_RETRY_DELAY_MS = 2000;
    public static final String TAG = "FeedViewModel";

    public static final FeedPaginationMode currentPaginationMode() {
        return HatchDeveloperPrefs.cachedIsInfiniteFeedPaginationEnabled ? FeedPaginationMode.INFINITE : FeedPaginationMode.CURSOR;
    }

    public static final FeedUnit withContent(FeedUnit feedUnit, FeedUnitContent feedUnitContent) {
        FeedUnit feedWidgetUnit;
        if (feedUnit instanceof FeedTextUnit) {
            C7384Etj.A0Y(feedUnitContent, 0);
            feedWidgetUnit = new FeedTextUnit(feedUnitContent);
        } else if (feedUnit instanceof FeedHeroImageUnit) {
            FeedAttachment.HeroImage heroImage = ((FeedHeroImageUnit) feedUnit).attachment;
            AnonymousClass003.A0u(feedUnitContent, heroImage);
            feedWidgetUnit = new FeedHeroImageUnit(feedUnitContent, heroImage);
        } else if (feedUnit instanceof FeedCarouselUnit) {
            FeedAttachment.Carousel carousel = ((FeedCarouselUnit) feedUnit).attachment;
            AnonymousClass003.A0u(feedUnitContent, carousel);
            feedWidgetUnit = new FeedCarouselUnit(feedUnitContent, carousel);
        } else {
            if (!(feedUnit instanceof FeedWidgetUnit)) {
                throw new NoWhenBranchMatchedException();
            }
            FeedAttachment.Widget widget = ((FeedWidgetUnit) feedUnit).attachment;
            AnonymousClass003.A0u(feedUnitContent, widget);
            feedWidgetUnit = new FeedWidgetUnit(feedUnitContent, widget);
        }
        return feedWidgetUnit;
    }

    public static final FeedUnit withInteractionStateFrom(FeedUnit feedUnit, FeedUnit feedUnit2) {
        return withContent(feedUnit, FeedUnitContent.copy$default(feedUnit.getContent(), null, null, null, null, null, 0L, 0, null, null, null, null, null, false, null, feedUnit2.getReaction(), feedUnit2.getDiscussCount(), null, null, null, false, null, null, null, null, null, null, null, 134168575, null));
    }

    public static final FeedUnit withReaction(FeedUnit feedUnit, FeedReaction feedReaction) {
        return withContent(feedUnit, FeedUnitContent.copy$default(feedUnit.getContent(), null, null, null, null, null, 0L, 0, null, null, null, null, null, false, null, feedReaction, 0, null, null, null, false, null, null, null, null, null, null, null, 134201343, null));
    }

    public static final boolean hasSameInteractionState(FeedUnit feedUnit, FeedUnit feedUnit2) {
        return feedUnit.getReaction() == feedUnit2.getReaction() && feedUnit.getDiscussCount() == feedUnit2.getDiscussCount();
    }
}
