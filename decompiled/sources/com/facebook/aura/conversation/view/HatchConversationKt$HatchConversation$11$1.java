package com.facebook.aura.conversation.view;

import X.AOW;
import X.AT5;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$11$1", f = "HatchConversation.kt", l = {384}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$11$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<String> $activeHighlightId$delegate;
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ AT5<Float, AOW> $highlightGlowAlpha;
    public final /* synthetic */ String $highlightedMessageId;
    public final /* synthetic */ int $highlightedMessageIndex;
    public final /* synthetic */ boolean $isDeeplinkRequest;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ Function0<Unit> $onClearHighlightedMessageIndex;
    public final /* synthetic */ Function0<Unit> $onHighlightConsumed;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$11$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<String, Unit> {
        public final /* synthetic */ MutableState<String> $activeHighlightId$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<String> mutableState) {
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
    public HatchConversationKt$HatchConversation$11$1(String str, boolean z, int i, LazyListState lazyListState, AT5<Float, AOW> at5, Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState, MutableState<String> mutableState2, HtJ<? super HatchConversationKt$HatchConversation$11$1> htJ) {
        super(2, htJ);
        this.$highlightedMessageId = str;
        this.$isDeeplinkRequest = z;
        this.$highlightedMessageIndex = i;
        this.$listState = lazyListState;
        this.$highlightGlowAlpha = at5;
        this.$onHighlightConsumed = function0;
        this.$onClearHighlightedMessageIndex = function02;
        this.$autoFollowEnabled$delegate = mutableState;
        this.$activeHighlightId$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$11$1(this.$highlightedMessageId, this.$isDeeplinkRequest, this.$highlightedMessageIndex, this.$listState, this.$highlightGlowAlpha, this.$onHighlightConsumed, this.$onClearHighlightedMessageIndex, this.$autoFollowEnabled$delegate, this.$activeHighlightId$delegate, htJ);
    }

    /* JADX WARN: Finally extract failed */
    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        try {
            if (i == 0) {
                Hwg.A00(obj);
                if (this.$highlightedMessageId != null && !this.$isDeeplinkRequest && this.$highlightedMessageIndex >= 0) {
                    MutableState.A09(false, this.$autoFollowEnabled$delegate);
                    int i2 = this.$highlightedMessageIndex;
                    String str = this.$highlightedMessageId;
                    LazyListState lazyListState = this.$listState;
                    AT5<Float, AOW> at5 = this.$highlightGlowAlpha;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$activeHighlightId$delegate);
                    this.label = 1;
                    if (HatchConversationScrollingKt.scrollToAndHighlight(i2, str, lazyListState, at5, anonymousClass1, this) == enumC10460Hji) {
                        return enumC10460Hji;
                    }
                }
                return Unit.INSTANCE;
            }
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            Function0<Unit> function0 = this.$onHighlightConsumed;
            if (function0 != null) {
                function0.invoke();
            }
            Function0<Unit> function02 = this.$onClearHighlightedMessageIndex;
            if (function02 != null) {
                function02.invoke();
            }
            return Unit.INSTANCE;
        } catch (Throwable th) {
            Function0<Unit> function03 = this.$onHighlightConsumed;
            if (function03 != null) {
                function03.invoke();
            }
            Function0<Unit> function04 = this.$onClearHighlightedMessageIndex;
            if (function04 == null) {
                throw th;
            }
            function04.invoke();
            throw th;
        }
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationKt$HatchConversation$11$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
