package com.facebook.aura.conversation.search;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1518AkS;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.search.ConversationSearchScreenKt$SearchTextField$3$1", f = "ConversationSearchScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$3$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ MutableState<Boolean> $isTextFieldPositioned$delegate;
    public final /* synthetic */ boolean $requestFocusOnMount;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationSearchScreenKt$SearchTextField$3$1(boolean z, C1518AkS c1518AkS, MutableState<Boolean> mutableState, HtJ<? super ConversationSearchScreenKt$SearchTextField$3$1> htJ) {
        super(2, htJ);
        this.$requestFocusOnMount = z;
        this.$focusRequester = c1518AkS;
        this.$isTextFieldPositioned$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConversationSearchScreenKt$SearchTextField$3$1(this.$requestFocusOnMount, this.$focusRequester, this.$isTextFieldPositioned$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (this.$requestFocusOnMount) {
            MutableState<Boolean> mutableState = this.$isTextFieldPositioned$delegate;
            float f = ConversationSearchScreenKt.SearchFieldCornerRadius;
            if (MutableState.A0A((MutableState) mutableState)) {
                C1518AkS.A00(this.$focusRequester);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((ConversationSearchScreenKt$SearchTextField$3$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
