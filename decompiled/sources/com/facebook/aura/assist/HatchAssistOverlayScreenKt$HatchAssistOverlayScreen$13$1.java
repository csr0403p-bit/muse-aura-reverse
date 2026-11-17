package com.facebook.aura.assist;

import X.AFs;
import X.AHD;
import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$13$1", f = "HatchAssistOverlayScreen.kt", l = {262}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$13$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ LazyListState $conversationListState;
    public final /* synthetic */ AHD<HatchConversationListItem> $listItems;
    public final /* synthetic */ C1BO<AHD<ConversationTimelineContent>> $timelineContents$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$13$1(AHD<? extends HatchConversationListItem> ahd, LazyListState lazyListState, C1BO<? extends AHD<? extends ConversationTimelineContent>> c1bo, HtJ<? super HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$13$1> htJ) {
        super(2, htJ);
        this.$listItems = ahd;
        this.$conversationListState = lazyListState;
        this.$timelineContents$delegate = c1bo;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$13$1(this.$listItems, this.$conversationListState, this.$timelineContents$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            if (!this.$listItems.isEmpty() || !C1BO.A0E(this.$timelineContents$delegate)) {
                LazyListState lazyListState = this.$conversationListState;
                this.label = 1;
                AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                if (lazyListState.A06(0, 0, this) == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$13$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
