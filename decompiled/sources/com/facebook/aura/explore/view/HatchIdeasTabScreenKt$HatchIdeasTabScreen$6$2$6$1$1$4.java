package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.explore.repo.IdeaCard;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$4 extends AbstractC7559F3s implements G0V<IdeaCard, Integer, Unit> {
    public static final HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$4 INSTANCE = new HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$4();

    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$4() {
        super(2);
    }

    public final void invoke(IdeaCard ideaCard, int i) {
        C7384Etj.A0Y(ideaCard, 0);
        HatchIdeasTabScreenKt.logIdeaCardLongPress(ideaCard.ideaCardId, i);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(IdeaCard ideaCard, Integer num) {
        invoke(ideaCard, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
