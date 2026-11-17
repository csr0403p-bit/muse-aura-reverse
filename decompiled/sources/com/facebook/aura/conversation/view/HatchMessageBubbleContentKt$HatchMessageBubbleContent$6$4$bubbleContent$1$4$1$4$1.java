package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.G0V;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$4$bubbleContent$1$4$1$4$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ InlineContentCallbacks $inlineContentCallbacks;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageBubbleContentKt$HatchMessageBubbleContent$6$4$bubbleContent$1$4$1$4$1(InlineContentCallbacks inlineContentCallbacks) {
        super(2);
        this.$inlineContentCallbacks = inlineContentCallbacks;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        C7384Etj.A0Y(str, 0);
        G0V<String, String, Unit> g0v = this.$inlineContentCallbacks.onSlidesClick;
        if (g0v != null) {
            g0v.invoke(FGI.A0M("hatch-slides://", str), C7BY.A0V(str, CustomConnectorRegisterRepositoryKt.ROOT_PATH, str));
        }
    }
}
