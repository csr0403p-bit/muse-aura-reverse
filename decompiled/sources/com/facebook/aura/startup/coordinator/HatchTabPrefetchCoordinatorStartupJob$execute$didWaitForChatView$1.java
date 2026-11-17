package com.facebook.aura.startup.coordinator;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.startup.conversation.HatchConversationFirstDrawSignal;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.startup.coordinator.HatchTabPrefetchCoordinatorStartupJob$execute$didWaitForChatView$1", f = "HatchTabPrefetchCoordinatorStartupJob.kt", l = {102}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchTabPrefetchCoordinatorStartupJob$execute$didWaitForChatView$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Boolean>, Object> {
    public int label;

    public HatchTabPrefetchCoordinatorStartupJob$execute$didWaitForChatView$1(HtJ<? super HatchTabPrefetchCoordinatorStartupJob$execute$didWaitForChatView$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchTabPrefetchCoordinatorStartupJob$execute$didWaitForChatView$1(htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            HatchConversationFirstDrawSignal hatchConversationFirstDrawSignal = HatchConversationFirstDrawSignal.INSTANCE;
            this.label = 1;
            if (hatchConversationFirstDrawSignal.awaitFirstChatViewFinished(this) == enumC10460Hji) {
                return enumC10460Hji;
            }
        } else {
            if (i != 1) {
                throw AnonymousClass001.A0n();
            }
            Hwg.A00(obj);
        }
        return true;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Boolean> htJ) {
        return new HatchTabPrefetchCoordinatorStartupJob$execute$didWaitForChatView$1(htJ).invokeSuspend(Unit.INSTANCE);
    }
}
