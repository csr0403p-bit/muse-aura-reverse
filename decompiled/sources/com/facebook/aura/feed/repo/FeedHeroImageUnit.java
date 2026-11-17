package com.facebook.aura.feed.repo;

import X.AHD;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import com.facebook.aura.feed.repo.FeedAttachment;
import com.facebook.aura.feed.repo.FeedUnit;

/* loaded from: classes6.dex */
public final class FeedHeroImageUnit extends C06G implements FeedUnit {
    public static final int $stable = 0;
    public final FeedAttachment.HeroImage attachment;
    public final FeedUnitContent content;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FeedHeroImageUnit) {
                FeedHeroImageUnit feedHeroImageUnit = (FeedHeroImageUnit) obj;
                if (!C7384Etj.areEqual(this.content, feedHeroImageUnit.content) || !C7384Etj.areEqual(this.attachment, feedHeroImageUnit.attachment)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ FeedHeroImageUnit copy$default(FeedHeroImageUnit feedHeroImageUnit, FeedUnitContent feedUnitContent, FeedAttachment.HeroImage heroImage, int i, Object obj) {
        if ((i & 1) != 0) {
            feedUnitContent = feedHeroImageUnit.content;
        }
        if ((i & 2) != 0) {
            heroImage = feedHeroImageUnit.attachment;
        }
        AnonymousClass003.A0u(feedUnitContent, heroImage);
        return new FeedHeroImageUnit(feedUnitContent, heroImage);
    }

    public final FeedUnitContent component1() {
        return this.content;
    }

    public final FeedAttachment.HeroImage component2() {
        return this.attachment;
    }

    public final FeedAttachment.HeroImage getAttachment() {
        return this.attachment;
    }

    @Override // com.facebook.aura.feed.repo.FeedUnit
    public FeedUnitContent getContent() {
        return this.content;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.attachment, AnonymousClass005.A0E(this.content));
    }

    public FeedHeroImageUnit(FeedUnitContent feedUnitContent, FeedAttachment.HeroImage heroImage) {
        AnonymousClass003.A0u(feedUnitContent, heroImage);
        this.content = feedUnitContent;
        this.attachment = heroImage;
    }

    public final FeedHeroImageUnit copy(FeedUnitContent feedUnitContent, FeedAttachment.HeroImage heroImage) {
        AnonymousClass003.A0u(feedUnitContent, heroImage);
        return new FeedHeroImageUnit(feedUnitContent, heroImage);
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
