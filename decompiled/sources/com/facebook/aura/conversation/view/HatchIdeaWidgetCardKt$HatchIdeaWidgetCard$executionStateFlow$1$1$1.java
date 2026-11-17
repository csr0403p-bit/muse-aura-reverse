package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.C3b6;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardSection;

/* loaded from: classes.dex */
public final class HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$executionStateFlow$1$1$1 extends AbstractC7559F3s implements G0U<IdeaCardSection, C3b6<? extends IdeaCard>> {
    public static final HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$executionStateFlow$1$1$1 INSTANCE = new HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$executionStateFlow$1$1$1();

    public HatchIdeaWidgetCardKt$HatchIdeaWidgetCard$executionStateFlow$1$1$1() {
        super(1);
    }

    @Override // X.G0U
    public final C3b6<IdeaCard> invoke(IdeaCardSection ideaCardSection) {
        C7384Etj.A0Y(ideaCardSection, 0);
        return AbstractC0878AGe.A06(ideaCardSection.cards);
    }
}
