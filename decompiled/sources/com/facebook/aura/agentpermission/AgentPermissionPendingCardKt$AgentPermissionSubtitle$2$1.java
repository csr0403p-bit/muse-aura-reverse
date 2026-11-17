package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.ApQ;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AgentPermissionPendingCardKt$AgentPermissionSubtitle$2$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ ApQ $annotatedText;
    public final /* synthetic */ Function0<Unit> $onSeeDetailsClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentPermissionPendingCardKt$AgentPermissionSubtitle$2$1(ApQ apQ, Function0<Unit> function0) {
        super(1);
        this.$annotatedText = apQ;
        this.$onSeeDetailsClick = function0;
    }

    public final void invoke(int i) {
        if (AbstractC0878AGe.A0G(this.$annotatedText.A04(i, i)) != null) {
            this.$onSeeDetailsClick.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
