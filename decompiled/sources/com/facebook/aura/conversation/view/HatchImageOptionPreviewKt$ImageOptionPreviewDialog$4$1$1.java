package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.view.Window;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Window $window;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$1$1(Window window) {
        super(1);
        this.$window = window;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Window window = this.$window;
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        Window window2 = this.$window;
        if (window2 != null) {
            window2.setWindowAnimations(0);
        }
        return new C78g() { // from class: com.facebook.aura.conversation.view.HatchImageOptionPreviewKt$ImageOptionPreviewDialog$4$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
