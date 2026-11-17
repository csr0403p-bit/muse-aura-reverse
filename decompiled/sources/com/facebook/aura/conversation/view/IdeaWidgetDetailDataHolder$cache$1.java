package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.model.IdeaWidgetData;

/* loaded from: classes.dex */
public final class IdeaWidgetDetailDataHolder$cache$1 extends AbstractC7559F3s implements G0V<String, IdeaWidgetData, Long> {
    public static final IdeaWidgetDetailDataHolder$cache$1 INSTANCE = new IdeaWidgetDetailDataHolder$cache$1();

    public IdeaWidgetDetailDataHolder$cache$1() {
        super(2);
    }

    @Override // X.G0V
    public final Long invoke(String str, IdeaWidgetData ideaWidgetData) {
        C7384Etj.A0Y(ideaWidgetData, 1);
        return Long.valueOf(IdeaWidgetDetailDataHolder.INSTANCE.estimatedWeightBytes(ideaWidgetData));
    }
}
