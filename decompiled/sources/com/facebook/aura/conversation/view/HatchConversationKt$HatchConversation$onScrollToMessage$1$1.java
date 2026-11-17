package com.facebook.aura.conversation.view;

import X.AHD;
import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.C7384Etj;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$onScrollToMessage$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ MutableState<String> $activeHighlightId$delegate;
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ AT5<Float, AOW> $highlightGlowAlpha;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ C3UX $scope;

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$onScrollToMessage$1$1$1", f = "HatchConversation.kt", l = {325}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$onScrollToMessage$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
        public final /* synthetic */ MutableState<String> $activeHighlightId$delegate;
        public final /* synthetic */ AT5<Float, AOW> $highlightGlowAlpha;
        public final /* synthetic */ int $idx;
        public final /* synthetic */ LazyListState $listState;
        public final /* synthetic */ HatchMessageUiModel $target;
        public int label;

        /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$onScrollToMessage$1$1$1$1, reason: invalid class name and collision with other inner class name */
        public final class C01001 extends AbstractC7559F3s implements G0U<String, Unit> {
            public final /* synthetic */ MutableState<String> $activeHighlightId$delegate;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01001(MutableState<String> mutableState) {
                super(1);
                this.$activeHighlightId$delegate = mutableState;
            }

            @Override // X.G0U
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                this.$activeHighlightId$delegate.Af8(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, HatchMessageUiModel hatchMessageUiModel, LazyListState lazyListState, AT5<Float, AOW> at5, MutableState<String> mutableState, HtJ<? super AnonymousClass1> htJ) {
            super(2, htJ);
            this.$idx = i;
            this.$target = hatchMessageUiModel;
            this.$listState = lazyListState;
            this.$highlightGlowAlpha = at5;
            this.$activeHighlightId$delegate = mutableState;
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            return new AnonymousClass1(this.$idx, this.$target, this.$listState, this.$highlightGlowAlpha, this.$activeHighlightId$delegate, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
            int i = this.label;
            if (i == 0) {
                Hwg.A00(obj);
                int i2 = this.$idx;
                String str = this.$target.id;
                LazyListState lazyListState = this.$listState;
                AT5<Float, AOW> at5 = this.$highlightGlowAlpha;
                C01001 c01001 = new C01001(this.$activeHighlightId$delegate);
                this.label = 1;
                if (HatchConversationScrollingKt.scrollToAndHighlight(i2, str, lazyListState, at5, c01001, this) == enumC10460Hji) {
                    return enumC10460Hji;
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
            return ((AnonymousClass1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        HatchMessageUiModel hatchMessageUiModel;
        HatchConversationListItem.Message message;
        HatchMessageUiModel hatchMessageUiModel2;
        HatchConversationListItem.Message message2;
        C7384Etj.A0Y(str, 0);
        Iterator itA09 = C1BO.A09(this.$currentItems$delegate);
        while (true) {
            if (!itA09.hasNext()) {
                hatchMessageUiModel = null;
                break;
            }
            HatchConversationListItem hatchConversationListItem = (HatchConversationListItem) itA09.next();
            if ((hatchConversationListItem instanceof HatchConversationListItem.Message) && (message2 = (HatchConversationListItem.Message) hatchConversationListItem) != null && (hatchMessageUiModel = message2.message) != null && (str.equals(hatchMessageUiModel.id) || str.equals(hatchMessageUiModel.serverMessageId) || str.equals(hatchMessageUiModel.messageId))) {
                break;
            }
        }
        Iterator itA092 = C1BO.A09(this.$currentItems$delegate);
        int i = 0;
        while (true) {
            if (!itA092.hasNext()) {
                i = -1;
                break;
            }
            HatchConversationListItem hatchConversationListItem2 = (HatchConversationListItem) itA092.next();
            if (C7384Etj.areEqual((!(hatchConversationListItem2 instanceof HatchConversationListItem.Message) || (message = (HatchConversationListItem.Message) hatchConversationListItem2) == null || (hatchMessageUiModel2 = message.message) == null) ? null : hatchMessageUiModel2.id, hatchMessageUiModel != null ? hatchMessageUiModel.id : null)) {
                break;
            } else {
                i++;
            }
        }
        if (hatchMessageUiModel == null || i < 0) {
            return;
        }
        MutableState.A09(false, this.$autoFollowEnabled$delegate);
        AnonymousClass001.A1J(new AnonymousClass1(i, hatchMessageUiModel, this.$listState, this.$highlightGlowAlpha, this.$activeHighlightId$delegate, null), this.$scope);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$onScrollToMessage$1$1(C3UX c3ux, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, MutableState<Boolean> mutableState, LazyListState lazyListState, AT5<Float, AOW> at5, MutableState<String> mutableState2) {
        super(1);
        this.$scope = c3ux;
        this.$currentItems$delegate = c1bo;
        this.$autoFollowEnabled$delegate = mutableState;
        this.$listState = lazyListState;
        this.$highlightGlowAlpha = at5;
        this.$activeHighlightId$delegate = mutableState2;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
