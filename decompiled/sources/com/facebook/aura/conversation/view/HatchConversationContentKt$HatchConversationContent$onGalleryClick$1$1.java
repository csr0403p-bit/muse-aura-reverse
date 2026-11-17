package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C3Hc;
import X.C3Hd;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationContentKt$HatchConversationContent$onGalleryClick$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<C3Hd, Unit> $launchVisualMediaPicker;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationContentKt$HatchConversationContent$onGalleryClick$1$1(G0U<? super C3Hd, Unit> g0u) {
        super(0);
        this.$launchVisualMediaPicker = g0u;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$launchVisualMediaPicker.invoke(C3Hc.A00);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
