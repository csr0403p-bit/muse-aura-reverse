package com.facebook.aura.explore.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass037;
import X.BFM;
import X.C1BO;
import X.G0U;
import X.G0V;
import X.G0W;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.explore.repo.IdeaCard;
import com.facebook.aura.explore.repo.IdeaCardExecutionState;
import com.facebook.aura.explore.repo.IdeaCardSection;
import com.facebook.aura.explore.repo.IdeaFeedback;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchIdeasTabScreenKt$ideaListSection$1$1 extends AbstractC7559F3s implements G0W<AnonymousClass037, BFM, Integer, Unit> {
    public final /* synthetic */ IdeaCard $card;
    public final /* synthetic */ C1BO<String> $dismissedIdeaCardId;
    public final /* synthetic */ Map<String, IdeaCardExecutionState> $executionStatuses;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isFirstSection;
    public final /* synthetic */ String $nextCardId;
    public final /* synthetic */ G0V<IdeaCard, Integer, Unit> $onCardClick;
    public final /* synthetic */ G0W<IdeaCard, Integer, IdeaContextMenuAction, Unit> $onContextMenuAction;
    public final /* synthetic */ G0V<IdeaCard, Integer, Unit> $onContextMenuDismiss;
    public final /* synthetic */ G0U<IdeaCard, Unit> $onDismissed;
    public final /* synthetic */ G0U<IdeaCard, Unit> $onImpression;
    public final /* synthetic */ G0V<IdeaCard, Integer, Unit> $onLongPress;
    public final /* synthetic */ G0W<IdeaCard, Integer, IdeaFeedback, Unit> $onSwipeFeedback;
    public final /* synthetic */ G0V<IdeaCard, Boolean, Unit> $onSwipingChange;
    public final /* synthetic */ IdeaCardSection $section;
    public final /* synthetic */ MutableState<String> $swipingIdeaCardId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchIdeasTabScreenKt$ideaListSection$1$1(IdeaCard ideaCard, Map<String, ? extends IdeaCardExecutionState> map, int i, IdeaCardSection ideaCardSection, boolean z, MutableState<String> mutableState, String str, G0V<? super IdeaCard, ? super Boolean, Unit> g0v, G0W<? super IdeaCard, ? super Integer, ? super IdeaFeedback, Unit> g0w, G0V<? super IdeaCard, ? super Integer, Unit> g0v2, G0V<? super IdeaCard, ? super Integer, Unit> g0v3, G0V<? super IdeaCard, ? super Integer, Unit> g0v4, G0W<? super IdeaCard, ? super Integer, ? super IdeaContextMenuAction, Unit> g0w2, C1BO<String> c1bo, G0U<? super IdeaCard, Unit> g0u, G0U<? super IdeaCard, Unit> g0u2) {
        super(3);
        this.$card = ideaCard;
        this.$executionStatuses = map;
        this.$index = i;
        this.$section = ideaCardSection;
        this.$isFirstSection = z;
        this.$swipingIdeaCardId = mutableState;
        this.$nextCardId = str;
        this.$onSwipingChange = g0v;
        this.$onSwipeFeedback = g0w;
        this.$onCardClick = g0v2;
        this.$onLongPress = g0v3;
        this.$onContextMenuDismiss = g0v4;
        this.$onContextMenuAction = g0w2;
        this.$dismissedIdeaCardId = c1bo;
        this.$onDismissed = g0u;
        this.$onImpression = g0u2;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(AnonymousClass037 anonymousClass037, BFM bfm, Integer num) {
        invoke(anonymousClass037, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke(X.AnonymousClass037 r46, X.BFM r47, int r48) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.explore.view.HatchIdeasTabScreenKt$ideaListSection$1$1.invoke(X.037, X.BFM, int):void");
    }
}
