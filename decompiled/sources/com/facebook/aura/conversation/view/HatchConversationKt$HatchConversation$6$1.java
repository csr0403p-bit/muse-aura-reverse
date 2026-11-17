package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC07127nr;
import X.C00r;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchConversationUiState;
import com.facebook.aura.conversation.widget.api.ConversationTimelineContent;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$6$1", f = "HatchConversation.kt", l = {249, 251, 256, 274}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$6$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ C00r $bottomRevealRequestGeneration$delegate;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ C00r $handledBottomRevealRequestGeneration$delegate;
    public final /* synthetic */ HighlightRequest $highlightRequest;
    public final /* synthetic */ MutableState<String> $initialScrollAppliedOwnerId$delegate;
    public final /* synthetic */ MutableState<String> $initialScrollOwnerId$delegate;
    public final /* synthetic */ Function0<Boolean> $isEditingWidgetField;
    public final /* synthetic */ MutableState<Float> $lastPinnedBottomPaddingPx$delegate;
    public final /* synthetic */ AHD<HatchConversationListItem> $listItems;
    public final /* synthetic */ String $listOwnerId;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ ConversationRestoreAnchor $restoreAnchor;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ C1BO<AHD<ConversationTimelineContent>> $timelineContents$delegate;
    public final /* synthetic */ HatchConversationUiState $uiState;
    public int I$0;
    public int I$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$6$1(AHD<? extends HatchConversationListItem> ahd, String str, HighlightRequest highlightRequest, HatchConversationUiState hatchConversationUiState, ConversationRestoreAnchor conversationRestoreAnchor, LazyListState lazyListState, Function0<Boolean> function0, float f, String str2, C1BO<? extends AHD<? extends ConversationTimelineContent>> c1bo, MutableState<String> mutableState, C00r c00r, C00r c00r2, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo2, MutableState<String> mutableState2, MutableState<Boolean> mutableState3, MutableState<Float> mutableState4, HtJ<? super HatchConversationKt$HatchConversation$6$1> htJ) {
        super(2, htJ);
        this.$listItems = ahd;
        this.$listOwnerId = str;
        this.$highlightRequest = highlightRequest;
        this.$uiState = hatchConversationUiState;
        this.$restoreAnchor = conversationRestoreAnchor;
        this.$listState = lazyListState;
        this.$isEditingWidgetField = function0;
        this.$bottomPadding = f;
        this.$sideChatSessionId = str2;
        this.$timelineContents$delegate = c1bo;
        this.$initialScrollOwnerId$delegate = mutableState;
        this.$bottomRevealRequestGeneration$delegate = c00r;
        this.$handledBottomRevealRequestGeneration$delegate = c00r2;
        this.$currentItems$delegate = c1bo2;
        this.$initialScrollAppliedOwnerId$delegate = mutableState2;
        this.$autoFollowEnabled$delegate = mutableState3;
        this.$lastPinnedBottomPaddingPx$delegate = mutableState4;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$6$1(this.$listItems, this.$listOwnerId, this.$highlightRequest, this.$uiState, this.$restoreAnchor, this.$listState, this.$isEditingWidgetField, this.$bottomPadding, this.$sideChatSessionId, this.$timelineContents$delegate, this.$initialScrollOwnerId$delegate, this.$bottomRevealRequestGeneration$delegate, this.$handledBottomRevealRequestGeneration$delegate, this.$currentItems$delegate, this.$initialScrollAppliedOwnerId$delegate, this.$autoFollowEnabled$delegate, this.$lastPinnedBottomPaddingPx$delegate, htJ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[Catch: all -> 0x0134, TryCatch #1 {all -> 0x0134, blocks: (B:47:0x00d7, B:49:0x00db, B:52:0x00e4), top: B:81:0x00d7 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$6$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationKt$HatchConversation$6$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
