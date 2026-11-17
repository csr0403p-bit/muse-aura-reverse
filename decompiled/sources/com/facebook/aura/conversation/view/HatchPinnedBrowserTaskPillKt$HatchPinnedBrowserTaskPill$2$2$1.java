package com.facebook.aura.conversation.view;

import X.AFs;
import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.model.BrowserTaskPresentation;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ Function0<Unit> $onScrollToCard;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ MutableState<String> $scrollTargetKey$delegate;
    public final /* synthetic */ String $sideChatSessionId;
    public final /* synthetic */ BrowserTaskPresentation $task;
    public final /* synthetic */ BrowserTaskMessage $taskMessage;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2$2$1$1", f = "HatchPinnedBrowserTaskPill.kt", l = {168}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ MutableState<String> $scrollTargetKey$delegate;
        public final /* synthetic */ BrowserTaskMessage $taskMessage;
        public int I$0;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(LazyListState lazyListState, BrowserTaskMessage browserTaskMessage, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, MutableState<String> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$listState = lazyListState;
            this.$taskMessage = browserTaskMessage;
            this.$currentItems$delegate = c1bo;
            this.$scrollTargetKey$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$listState, this.$taskMessage, this.$currentItems$delegate, this.$scrollTargetKey$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            try {
                if (i == 0) {
                    Hwg.A00(obj);
                    C1BO<AHD<HatchConversationListItem>> c1bo = this.$currentItems$delegate;
                    float f = HatchPinnedBrowserTaskPillKt.PinnedBrowserThumbnailHeight;
                    AHD<HatchConversationListItem> value = c1bo.getValue();
                    BrowserTaskMessage browserTaskMessage = this.$taskMessage;
                    Iterator it = value.iterator();
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        if (!C7384Etj.areEqual(((HatchConversationListItem) it.next()).getKey(), browserTaskMessage.messageKey)) {
                            i2++;
                        } else if (i2 >= 0) {
                            LazyListState lazyListState = this.$listState;
                            this.I$0 = i2;
                            this.label = 1;
                            AFs<LazyListState, ?> aFs = LazyListState.A0Q;
                            if (lazyListState.A05(i2, 0, this) == enumC10460Hji) {
                                return enumC10460Hji;
                            }
                        }
                    }
                } else {
                    if (i != 1) {
                        throw AnonymousClass001.A0n();
                    }
                    Hwg.A00(obj);
                }
                MutableState<String> mutableState = this.$scrollTargetKey$delegate;
                float f2 = HatchPinnedBrowserTaskPillKt.PinnedBrowserThumbnailHeight;
                if (C7384Etj.areEqual(mutableState.getValue(), this.$taskMessage.messageKey)) {
                    this.$scrollTargetKey$delegate.Af8(null);
                }
                return Unit.INSTANCE;
            } finally {
            }
        }

        @Override // X.G0V
        public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchPinnedBrowserTaskPillKt$HatchPinnedBrowserTaskPill$2$2$1(BrowserTaskPresentation browserTaskPresentation, String str, Function0<Unit> function0, BrowserTaskMessage browserTaskMessage, C3UX c3ux, MutableState<String> mutableState, LazyListState lazyListState, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
        super(0);
        this.$task = browserTaskPresentation;
        this.$sideChatSessionId = str;
        this.$onScrollToCard = function0;
        this.$taskMessage = browserTaskMessage;
        this.$scope = c3ux;
        this.$scrollTargetKey$delegate = mutableState;
        this.$listState = lazyListState;
        this.$currentItems$delegate = c1bo;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchPinnedBrowserTaskPillKt.logPinnedBrowserClick(HatchComponent.BROWSER_TASK_ROW, this.$task.browserTaskId, this.$sideChatSessionId);
        this.$onScrollToCard.invoke();
        this.$scrollTargetKey$delegate.Af8(this.$taskMessage.messageKey);
        AnonymousClass001.A1J(new AnonymousClass1(this.$listState, this.$taskMessage, this.$currentItems$delegate, this.$scrollTargetKey$delegate, null), this.$scope);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
