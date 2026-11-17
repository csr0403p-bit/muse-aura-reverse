package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchConversationPresentationsKt$HatchPresentation$3$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ G0V<String, String, Unit> $handleAction;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        this.$handleAction.invoke(str, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationPresentationsKt$HatchPresentation$3$1(G0V<? super String, ? super String, Unit> g0v) {
        super(1);
        this.$handleAction = g0v;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
