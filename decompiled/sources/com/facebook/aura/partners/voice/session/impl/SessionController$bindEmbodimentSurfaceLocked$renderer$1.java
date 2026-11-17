package com.facebook.aura.partners.voice.session.impl;

import X.AbstractC7559F3s;
import X.C57m;
import com.facebook.aura.partners.voice.session.impl.SessionController;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class SessionController$bindEmbodimentSurfaceLocked$renderer$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $markerKey;
    public final /* synthetic */ SessionController.PendingEmbodimentSurface $pending;
    public final /* synthetic */ C57m $session;
    public final /* synthetic */ SessionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionController$bindEmbodimentSurfaceLocked$renderer$1(SessionController sessionController, C57m c57m, SessionController.PendingEmbodimentSurface pendingEmbodimentSurface, int i) {
        super(0);
        this.this$0 = sessionController;
        this.$session = c57m;
        this.$pending = pendingEmbodimentSurface;
        this.$markerKey = i;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.this$0.markEmbodimentReadyIfCurrent(this.$session, this.$pending)) {
            this.this$0.connectionTracker.point("first_frame_rendered", Integer.valueOf(this.$markerKey), false);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
