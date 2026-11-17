package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.C7Bq;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationKt$HatchConversation$19$1", f = "HatchConversation.kt", l = {903}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationKt$HatchConversation$19$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isDeeplinkRequest;
    public final /* synthetic */ MutableState<Boolean> $isWaitingForDeeplinkedMessage$delegate;
    public final /* synthetic */ Function0<Unit> $onDeeplinkConsumed;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationKt$HatchConversation$19$1(boolean z, Function0<Unit> function0, MutableState<Boolean> mutableState, HtJ<? super HatchConversationKt$HatchConversation$19$1> htJ) {
        super(2, htJ);
        this.$isDeeplinkRequest = z;
        this.$onDeeplinkConsumed = function0;
        this.$isWaitingForDeeplinkedMessage$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationKt$HatchConversation$19$1(this.$isDeeplinkRequest, this.$onDeeplinkConsumed, this.$isWaitingForDeeplinkedMessage$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            boolean z = this.$isDeeplinkRequest;
            MutableState<Boolean> mutableState = this.$isWaitingForDeeplinkedMessage$delegate;
            if (!z) {
                MutableState.A09(false, mutableState);
                return Unit.INSTANCE;
            }
            MutableState.A09(true, mutableState);
            this.label = 1;
            if (C7Bq.A01(5000L, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        if (MutableState.A0A((MutableState) this.$isWaitingForDeeplinkedMessage$delegate)) {
            MutableState.A09(false, this.$isWaitingForDeeplinkedMessage$delegate);
            Function0<Unit> function0 = this.$onDeeplinkConsumed;
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationKt$HatchConversation$19$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
