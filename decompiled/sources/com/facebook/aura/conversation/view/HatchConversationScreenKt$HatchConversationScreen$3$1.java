package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import com.facebook.aura.conversation.viewmodel.ReplyContext;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$3$1", f = "HatchConversationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$3$1 extends AbstractC07127nr implements G0V<ReplyContext, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$3$1(HatchConversationViewModel hatchConversationViewModel, HtJ<? super HatchConversationScreenKt$HatchConversationScreen$3$1> htJ) {
        super(2, htJ);
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HatchConversationScreenKt$HatchConversationScreen$3$1 hatchConversationScreenKt$HatchConversationScreen$3$1 = new HatchConversationScreenKt$HatchConversationScreen$3$1(this.$viewModel, htJ);
        hatchConversationScreenKt$HatchConversationScreen$3$1.L$0 = obj;
        return hatchConversationScreenKt$HatchConversationScreen$3$1;
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        ReplyContext replyContext = (ReplyContext) this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$viewModel.setReplyContext(replyContext);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(ReplyContext replyContext, HtJ<? super Unit> htJ) {
        return ((HatchConversationScreenKt$HatchConversationScreen$3$1) create(replyContext, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
