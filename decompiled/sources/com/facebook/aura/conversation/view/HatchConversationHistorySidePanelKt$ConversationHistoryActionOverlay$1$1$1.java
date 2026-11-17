package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.view.Window;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Window $dialogWindow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$1$1(Window window) {
        super(1);
        this.$dialogWindow = window;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Window window = this.$dialogWindow;
        if (window != null) {
            window.clearFlags(2);
        }
        Window window2 = this.$dialogWindow;
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$ConversationHistoryActionOverlay$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
