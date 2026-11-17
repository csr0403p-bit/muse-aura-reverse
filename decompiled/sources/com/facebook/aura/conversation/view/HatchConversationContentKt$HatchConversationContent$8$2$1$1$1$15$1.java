package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C1BO;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$15$1", f = "HatchConversationContent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$15$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ C1BO<Boolean> $isAppInForeground$delegate;
    public final /* synthetic */ MutableState<Long> $lastForegroundEdgeMs$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$15$1(C1BO<Boolean> c1bo, MutableState<Long> mutableState, HtJ<? super HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$15$1> htJ) {
        super(2, htJ);
        this.$isAppInForeground$delegate = c1bo;
        this.$lastForegroundEdgeMs$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$15$1(this.$isAppInForeground$delegate, this.$lastForegroundEdgeMs$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        if (C1BO.A0F(this.$isAppInForeground$delegate)) {
            HatchConversationContentKt$HatchConversationContent$8.AnonymousClass2.AnonymousClass1.C00971.invoke_8Feqmps$lambda$0$21(this.$lastForegroundEdgeMs$delegate, System.currentTimeMillis());
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationContentKt$HatchConversationContent$8$2$1$1$1$15$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
