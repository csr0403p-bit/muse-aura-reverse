package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.G0U;
import com.facebook.aura.explore.repo.IdeaFeedback;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$4$1$1$1$4$1 extends AbstractC7559F3s implements G0U<IdeaContextMenuAction, Unit> {
    public final /* synthetic */ G0U<IdeaFeedback, Unit> $submitIdeaFeedback;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(IdeaContextMenuAction ideaContextMenuAction) {
        G0U<IdeaFeedback, Unit> g0u;
        IdeaFeedback ideaFeedback;
        int iA0E = AnonymousClass001.A0E(ideaContextMenuAction, 0);
        if (iA0E == 1) {
            g0u = this.$submitIdeaFeedback;
            ideaFeedback = IdeaFeedback.UP;
        } else if (iA0E != 2) {
            if (iA0E != 0) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        } else {
            g0u = this.$submitIdeaFeedback;
            ideaFeedback = IdeaFeedback.DOWN;
        }
        g0u.invoke(ideaFeedback);
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IdeaContextMenuAction.values().length];
            try {
                AnonymousClass002.A13(IdeaContextMenuAction.FEEDBACK_UP, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(IdeaContextMenuAction.FEEDBACK_DOWN, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(IdeaContextMenuAction.EXECUTE, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ExploreIdeaCardDetailSheetKt$ExploreIdeaCardDetailSheet$4$1$1$1$4$1(G0U<? super IdeaFeedback, Unit> g0u) {
        super(1);
        this.$submitIdeaFeedback = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(IdeaContextMenuAction ideaContextMenuAction) {
        invoke2(ideaContextMenuAction);
        return Unit.INSTANCE;
    }
}
