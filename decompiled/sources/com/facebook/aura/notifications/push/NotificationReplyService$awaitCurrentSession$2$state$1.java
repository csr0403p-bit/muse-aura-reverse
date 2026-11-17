package com.facebook.aura.notifications.push;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3cG;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.auth.AuraSessionManager;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.notifications.push.NotificationReplyService$awaitCurrentSession$2$state$1", f = "NotificationReplyService.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class NotificationReplyService$awaitCurrentSession$2$state$1 extends AbstractC07127nr implements G0V<AuraSessionManager.SessionState, HtJ<? super Boolean>, Object> {
    public /* synthetic */ Object L$0;
    public int label;

    public NotificationReplyService$awaitCurrentSession$2$state$1(HtJ<? super NotificationReplyService$awaitCurrentSession$2$state$1> htJ) {
        super(2, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        NotificationReplyService$awaitCurrentSession$2$state$1 notificationReplyService$awaitCurrentSession$2$state$1 = new NotificationReplyService$awaitCurrentSession$2$state$1(htJ);
        notificationReplyService$awaitCurrentSession$2$state$1.L$0 = obj;
        return notificationReplyService$awaitCurrentSession$2$state$1;
    }

    @Override // X.G0V
    public final Object invoke(AuraSessionManager.SessionState sessionState, HtJ<? super Boolean> htJ) {
        NotificationReplyService$awaitCurrentSession$2$state$1 notificationReplyService$awaitCurrentSession$2$state$1 = new NotificationReplyService$awaitCurrentSession$2$state$1(htJ);
        notificationReplyService$awaitCurrentSession$2$state$1.L$0 = sessionState;
        return notificationReplyService$awaitCurrentSession$2$state$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return C3cG.A0P(obj2 instanceof AuraSessionManager.SessionState.Initializing);
    }
}
