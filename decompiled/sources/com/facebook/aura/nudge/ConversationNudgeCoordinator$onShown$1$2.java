package com.facebook.aura.nudge;

import X.AbstractC07127nr;
import X.AbstractC9777Gfy;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.lifecycle.AuraAppLifecycleManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.nudge.ConversationNudgeCoordinator$onShown$1$2", f = "ConversationNudgeCoordinator.kt", l = {158}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class ConversationNudgeCoordinator$onShown$1$2 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ ConversationNudge $nudge;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationNudgeCoordinator$onShown$1$2(ConversationNudge conversationNudge, HtJ<? super ConversationNudgeCoordinator$onShown$1$2> htJ) {
        super(2, htJ);
        this.$nudge = conversationNudge;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new ConversationNudgeCoordinator$onShown$1$2(this.$nudge, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            ConversationNudgeCoordinator$onShown$1$2$invokeSuspend$$inlined$filter$1 conversationNudgeCoordinator$onShown$1$2$invokeSuspend$$inlined$filter$1 = new ConversationNudgeCoordinator$onShown$1$2$invokeSuspend$$inlined$filter$1(AuraAppLifecycleManager.isAppInForegroundFlow);
            this.label = 1;
            if (AbstractC9777Gfy.A02(conversationNudgeCoordinator$onShown$1$2$invokeSuspend$$inlined$filter$1, this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        ConversationNudgeCoordinator.INSTANCE.dismiss(this.$nudge, NudgeDismissReason.BACKGROUND);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return new ConversationNudgeCoordinator$onShown$1$2(this.$nudge, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
