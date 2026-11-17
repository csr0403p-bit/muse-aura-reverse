package com.facebook.aura.conversation.viewmodel;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.uicontrol.UiControlActionSink;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class HatchConversationViewModel$acceptPendingSuggestion$2$result$1 extends C7438Evz implements G0U<String, Unit> {
    public HatchConversationViewModel$acceptPendingSuggestion$2$result$1(Object obj) {
        super(1, obj, UiControlActionSink.class, "publishNavigation", "publishNavigation(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((UiControlActionSink) AnonymousClass006.A0o(str, this)).publishNavigation(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
