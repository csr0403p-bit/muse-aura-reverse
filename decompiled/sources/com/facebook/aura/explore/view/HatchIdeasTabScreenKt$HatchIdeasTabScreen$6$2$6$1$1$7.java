package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C7384Etj;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.explore.repo.IdeaCard;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$7 extends AbstractC7559F3s implements G0V<IdeaCard, Boolean, Unit> {
    public final /* synthetic */ MutableState<String> $swipingIdeaCardId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$7(MutableState<String> mutableState) {
        super(2);
        this.$swipingIdeaCardId = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(IdeaCard ideaCard, Boolean bool) {
        invoke(ideaCard, AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }

    public final void invoke(IdeaCard ideaCard, boolean z) {
        String str;
        C7384Etj.A0Y(ideaCard, 0);
        MutableState<String> mutableState = this.$swipingIdeaCardId;
        if (z) {
            str = ideaCard.ideaCardId;
        } else {
            if (!C7384Etj.areEqual(mutableState.getValue(), ideaCard.ideaCardId)) {
                return;
            }
            mutableState = this.$swipingIdeaCardId;
            str = null;
        }
        mutableState.Af8(str);
    }
}
