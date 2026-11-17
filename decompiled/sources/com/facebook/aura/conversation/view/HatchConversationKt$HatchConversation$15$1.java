package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.HatchConversationScrollingKt;
import com.facebook.aura.partners.wearables.linking.MC;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$15$1", f = "HatchConversation.kt", l = {MC.android_lobster_wearables_v2.__CONFIG__}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$15$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<Boolean> $autoFollowEnabled$delegate;
    public final /* synthetic */ Function0<Boolean> $isEditingWidgetField;
    public final /* synthetic */ LazyListState $listState;
    public final /* synthetic */ MutableState<String> $observedTrailingReactionSignature$delegate;
    public final /* synthetic */ String $trailingReactionSignature;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$15$1(String str, LazyListState lazyListState, Function0<Boolean> function0, MutableState<String> mutableState, MutableState<Boolean> mutableState2, HtJ<? super HatchConversationKt$HatchConversation$15$1> htJ) {
        super(2, htJ);
        this.$trailingReactionSignature = str;
        this.$listState = lazyListState;
        this.$isEditingWidgetField = function0;
        this.$observedTrailingReactionSignature$delegate = mutableState;
        this.$autoFollowEnabled$delegate = mutableState2;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$15$1(this.$trailingReactionSignature, this.$listState, this.$isEditingWidgetField, this.$observedTrailingReactionSignature$delegate, this.$autoFollowEnabled$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            String strA05 = MutableState.A05(this.$observedTrailingReactionSignature$delegate);
            this.$observedTrailingReactionSignature$delegate.Af8(this.$trailingReactionSignature);
            if (strA05 != null && !strA05.equals(this.$trailingReactionSignature) && MutableState.A0A((MutableState) this.$autoFollowEnabled$delegate)) {
                LazyListState lazyListState = this.$listState;
                Function0<Boolean> function0 = this.$isEditingWidgetField;
                this.L$0 = null;
                this.label = 1;
                if (HatchConversationScrollingKt.pinToBottomWhileSettling(lazyListState, 350L, null, null, HatchConversationScrollingKt.C114542.INSTANCE, HatchConversationScrollingKt.C114553.INSTANCE, false, false, HatchConversationScrollingKt.C114564.INSTANCE, HatchConversationScrollingKt.AnonymousClass5.INSTANCE, function0, this) == enumC10460Hji) {
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
        return ((HatchConversationKt$HatchConversation$15$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
