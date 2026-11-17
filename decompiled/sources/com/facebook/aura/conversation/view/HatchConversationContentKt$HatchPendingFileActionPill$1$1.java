package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.conversation.viewmodel.HatchPendingFileAction;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationContentKt$HatchPendingFileActionPill$1$1", f = "HatchConversationContent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchPendingFileActionPill$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchPendingFileAction $action;
    public final /* synthetic */ MutableState<HatchPendingFileAction> $lastAction$delegate;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationContentKt$HatchPendingFileActionPill$1$1(HatchPendingFileAction hatchPendingFileAction, MutableState<HatchPendingFileAction> mutableState, HtJ<? super HatchConversationContentKt$HatchPendingFileActionPill$1$1> htJ) {
        super(2, htJ);
        this.$action = hatchPendingFileAction;
        this.$lastAction$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationContentKt$HatchPendingFileActionPill$1$1(this.$action, this.$lastAction$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        HatchPendingFileAction hatchPendingFileAction = this.$action;
        if (hatchPendingFileAction != null) {
            this.$lastAction$delegate.Af8(hatchPendingFileAction);
        }
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationContentKt$HatchPendingFileActionPill$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
