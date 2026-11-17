package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3UX;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistIdentityDragKt$assistIdentityMoveActions$actions$1$1$1 extends AbstractC7559F3s implements Function0<Boolean> {
    public final /* synthetic */ AssistIdentityEdge $edge;
    public final /* synthetic */ C3UX $scope;
    public final /* synthetic */ AssistIdentityState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityDragKt$assistIdentityMoveActions$actions$1$1$1(AssistIdentityState assistIdentityState, AssistIdentityEdge assistIdentityEdge, C3UX c3ux) {
        super(0);
        this.$state = assistIdentityState;
        this.$edge = assistIdentityEdge;
        this.$scope = c3ux;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        this.$state.dockPosition.moveTo(this.$edge, this.$scope);
        return AnonymousClass001.A0i();
    }
}
