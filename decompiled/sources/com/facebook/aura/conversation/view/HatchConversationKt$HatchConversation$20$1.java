package com.facebook.aura.conversation.view;

import X.AHD;
import X.AbstractC07127nr;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchConversationListItem;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1", f = "HatchConversation.kt", l = {916, 918, 922}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$20$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
    public final /* synthetic */ String $highlightedMessageId;
    public final /* synthetic */ boolean $isDeeplinkRequest;
    public final /* synthetic */ MutableState<Boolean> $isWaitingForDeeplinkedMessage$delegate;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ Function0<Unit> $onDeeplinkConsumed;
    public int I$0;
    public int label;

    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Integer> {
        public final /* synthetic */ C1BO<AHD<HatchConversationListItem>> $currentItems$delegate;
        public final /* synthetic */ String $highlightedMessageId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(String str, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo) {
            super(0);
            this.$highlightedMessageId = str;
            this.$currentItems$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(HatchConversationScrollingKt.indexOfDeeplinkedMessage(this.$currentItems$delegate.getValue(), this.$highlightedMessageId));
        }
    }

    @DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1$2", f = "HatchConversation.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC07127nr implements G0V<Integer, HtJ<? super Boolean>, Object> {
        public /* synthetic */ int I$0;
        public int label;

        public AnonymousClass2(HtJ<? super AnonymousClass2> htJ) {
            super(2, htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(htJ);
            anonymousClass2.I$0 = AnonymousClass001.A0F(obj);
            return anonymousClass2;
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            int i = this.I$0;
            if (this.label != 0) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
            return Boolean.valueOf(i >= 0);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Object invoke(Integer num, HtJ<? super Boolean> htJ) {
            return invoke(AnonymousClass001.A0F(num), htJ);
        }

        public final Object invoke(int i, HtJ<? super Boolean> htJ) {
            return ((AnonymousClass2) create(Integer.valueOf(i), htJ)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationKt$HatchConversation$20$1(boolean z, String str, LazyListState lazyListState, Function0<Unit> function0, C1BO<? extends AHD<? extends HatchConversationListItem>> c1bo, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, HtJ<? super HatchConversationKt$HatchConversation$20$1> htJ) {
        super(2, htJ);
        this.$isDeeplinkRequest = z;
        this.$highlightedMessageId = str;
        this.$listState = lazyListState;
        this.$onDeeplinkConsumed = function0;
        this.$currentItems$delegate = c1bo;
        this.$autoFollowEnabled$delegate = mutableState;
        this.$isWaitingForDeeplinkedMessage$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$20$1(this.$isDeeplinkRequest, this.$highlightedMessageId, this.$listState, this.$onDeeplinkConsumed, this.$currentItems$delegate, this.$autoFollowEnabled$delegate, this.$isWaitingForDeeplinkedMessage$delegate, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 3
            r6 = 2
            r3 = 1
            if (r0 == 0) goto L22
            if (r0 == r3) goto L47
            if (r0 == r6) goto L55
            if (r0 != r5) goto L7d
            X.Hwg.A00(r8)
        L12:
            androidx.compose.runtime.MutableState<java.lang.Boolean> r1 = r7.$isWaitingForDeeplinkedMessage$delegate
            r0 = 0
            androidx.compose.runtime.MutableState.A09(r0, r1)
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r7.$onDeeplinkConsumed
            if (r0 == 0) goto L1f
            r0.invoke()
        L1f:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L22:
            X.Hwg.A00(r8)
            boolean r0 = r7.$isDeeplinkRequest
            if (r0 == 0) goto L1f
            java.lang.String r2 = r7.$highlightedMessageId
            if (r2 == 0) goto L1f
            X.1BO<X.AHD<com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r1 = r7.$currentItems$delegate
            com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1$1 r0 = new com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1$1
            r0.<init>(r2, r1)
            r2 = 0
            X.3ul r1 = X.C6v3.A01(r0)
            com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1$2 r0 = new com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1$2
            r0.<init>(r2)
            r7.label = r3
            java.lang.Object r0 = X.AbstractC9777Gfy.A00(r7, r0, r1)
            if (r0 != r4) goto L4a
            return r4
        L47:
            X.Hwg.A00(r8)
        L4a:
            r7.label = r6
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r0 = X.C7Bq.A01(r0, r7)
            if (r0 != r4) goto L58
            return r4
        L55:
            X.Hwg.A00(r8)
        L58:
            X.1BO<X.AHD<com.facebook.aura.conversation.viewmodel.HatchConversationListItem>> r0 = r7.$currentItems$delegate
            java.lang.Object r1 = r0.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r0 = r7.$highlightedMessageId
            int r3 = com.facebook.aura.conversation.view.HatchConversationScrollingKt.indexOfDeeplinkedMessage(r1, r0)
            if (r3 < 0) goto L1f
            androidx.compose.runtime.MutableState<java.lang.Boolean> r0 = r7.$autoFollowEnabled$delegate
            r2 = 0
            androidx.compose.runtime.MutableState.A09(r2, r0)
            androidx.compose.foundation.lazy.LazyListState r1 = r7.$listState
            r7.I$0 = r3
            r7.label = r5
            X.AFs<androidx.compose.foundation.lazy.LazyListState, ?> r0 = androidx.compose.foundation.lazy.LazyListState.A0Q
            java.lang.Object r0 = r1.A05(r3, r2, r7)
            if (r0 != r4) goto L12
            return r4
        L7d:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$20$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationKt$HatchConversation$20$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
