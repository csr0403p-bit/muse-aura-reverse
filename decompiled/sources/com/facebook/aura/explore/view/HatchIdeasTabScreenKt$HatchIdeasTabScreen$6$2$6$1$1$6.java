package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.explore.model.HatchExploreViewModel;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardDetailOrigin;
import com.facebook.aura.explore.repo.IdeaFeedback;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$6 extends AbstractC7559F3s implements G0W<IdeaCard, Integer, IdeaContextMenuAction, Unit> {
    public final /* synthetic */ HatchExploreViewModel $viewModel;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdeaContextMenuAction.values().length];
            try {
                AnonymousClass002.A13(IdeaContextMenuAction.EXECUTE, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(IdeaContextMenuAction.FEEDBACK_UP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(IdeaContextMenuAction.FEEDBACK_DOWN, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchIdeasTabScreenKt$HatchIdeasTabScreen$6$2$6$1$1$6(HatchExploreViewModel hatchExploreViewModel) {
        super(3);
        this.$viewModel = hatchExploreViewModel;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(IdeaCard ideaCard, Integer num, IdeaContextMenuAction ideaContextMenuAction) {
        invoke(ideaCard, AnonymousClass001.A0F(num), ideaContextMenuAction);
        return Unit.INSTANCE;
    }

    public final void invoke(IdeaCard ideaCard, int i, IdeaContextMenuAction ideaContextMenuAction) {
        String str;
        IdeaFeedback ideaFeedback;
        C7384Etj.A0Y(ideaCard, 0);
        int iA0E = AnonymousClass001.A0E(ideaContextMenuAction, 2);
        if (iA0E != 0) {
            if (iA0E != 1) {
                if (iA0E == 2) {
                    str = ideaCard.ideaCardId;
                    ideaFeedback = IdeaFeedback.DOWN;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                str = ideaCard.ideaCardId;
                ideaFeedback = IdeaFeedback.UP;
            }
            HatchIdeasTabScreenKt.logIdeaFeedback(str, i, ideaFeedback, HatchSubsurface.DOT_MENU);
            this.$viewModel.submitFeedback(ideaCard.ideaCardId, ideaFeedback, null);
            return;
        }
        HatchIdeasTabScreenKt.logIdeaCardExecute(ideaCard.ideaCardId, i);
        this.$viewModel.recordIdeaCardClick(ideaCard.ideaCardId, HatchIdeasTabScreenKt.CARD_TYPE);
        this.$viewModel.executeCard(ideaCard.ideaCardId, null, IdeaCardDetailOrigin.FEED, null);
    }
}
