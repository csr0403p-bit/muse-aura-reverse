package com.facebook.aura.feed.repo;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.feed.repo.FeedAttachment;
import com.facebook.aura.feed.repo.FeedUnit;

/* loaded from: classes6.dex */
public final class FeedCarouselUnit extends C06G implements FeedUnit {
    public static final int $stable = 0;
    public final FeedAttachment.Carousel attachment;
    public final FeedUnitContent content;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedCarouselUnit) {
                FeedCarouselUnit feedCarouselUnit = (FeedCarouselUnit) obj;
                if (!C7384Etj.areEqual(this.content, feedCarouselUnit.content) || !C7384Etj.areEqual(this.attachment, feedCarouselUnit.attachment)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedCarouselUnit copy$default(FeedCarouselUnit feedCarouselUnit, FeedUnitContent feedUnitContent, FeedAttachment.Carousel carousel, int i, Object obj) {
        if ((i & 1) != 0) {
            feedUnitContent = feedCarouselUnit.content;
        }
        if ((i & 2) != 0) {
            carousel = feedCarouselUnit.attachment;
        }
        AnonymousClass003.A0u(feedUnitContent, carousel);
        return new FeedCarouselUnit(feedUnitContent, carousel);
    }

    public final FeedUnitContent component1() {
        return this.content;
    }

    public final FeedAttachment.Carousel component2() {
        return this.attachment;
    }

    public final FeedAttachment.Carousel getAttachment() {
        return this.attachment;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public FeedUnitContent getContent() {
        return this.content;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.attachment, AnonymousClass005.A0E(this.content));
    }

    public FeedCarouselUnit(FeedUnitContent feedUnitContent, FeedAttachment.Carousel carousel) {
        AnonymousClass003.A0u(feedUnitContent, carousel);
        this.content = feedUnitContent;
        this.attachment = carousel;
    }

    public final FeedCarouselUnit copy(FeedUnitContent feedUnitContent, FeedAttachment.Carousel carousel) {
        AnonymousClass003.A0u(feedUnitContent, carousel);
        return new FeedCarouselUnit(feedUnitContent, carousel);
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getBodyMarkdown() {
        return getContent().bodyMarkdown;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getCategory() {
        return getContent().category;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getConnectorAttribution() {
        return getContent().connectorAttribution;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ int getDiscussCount() {
        return getContent().discussCount;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ long getEditionGeneratedAtMs() {
        return getContent().editionGeneratedAtMs;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ FeedEditionKind getEditionKind() {
        return getContent().editionKind;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getEditionLocalDate() {
        return getContent().editionLocalDate;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getEditionTitle() {
        return getContent().editionTitle;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getEmoji() {
        return getContent().emoji;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getIconUrl() {
        return getContent().iconUrl;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getId() {
        return getContent().id;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ FeedIdeaAction getIdeaAction() {
        return getContent().ideaAction;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getKicker() {
        return getContent().kicker;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ FeedUnitOrigin getOrigin() {
        return getContent().origin;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ int getPosition() {
        return getContent().position;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ FeedPostMetadata getPostMetadata() {
        return FeedUnit.CC.$default$getPostMetadata(this);
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getPromptId() {
        return getContent().promptId;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ FeedReaction getReaction() {
        return getContent().reaction;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getRunId() {
        return getContent().runId;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ Long getSeenAtMs() {
        return getContent().seenAtMs;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ FeedSocialEmbed getSocialEmbed() {
        return getContent().socialEmbed;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ AHD<FeedStat> getStats() {
        return getContent().stats;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getTitle() {
        return getContent().title;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ FeedVideo getVideo() {
        return getContent().video;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ String getWhyDidISeeThis() {
        return getContent().whyDidISeeThis;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ boolean isEditionStart() {
        return getContent().isEditionStart;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public /* bridge */ boolean isReflective() {
        return getContent().isReflective;
    }

    public String toString() {
        return super.toString();
    }
}
