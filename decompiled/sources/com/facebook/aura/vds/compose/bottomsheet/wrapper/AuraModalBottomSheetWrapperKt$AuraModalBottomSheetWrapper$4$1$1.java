package com.facebook.aura.vds.compose.bottomsheet.wrapper;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import android.view.Window;

/* loaded from: classes.dex */
public final class AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$4$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Window $dialogWindow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$4$1$1(Window window) {
        super(1);
        this.$dialogWindow = window;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        Window window = this.$dialogWindow;
        if (window != null) {
            window.setWindowAnimations(0);
        }
        Window window2 = this.$dialogWindow;
        if (window2 != null) {
            window2.setNavigationBarContrastEnforced(false);
        }
        return new C78g() { // from class: com.facebook.aura.vds.compose.bottomsheet.wrapper.AuraModalBottomSheetWrapperKt$AuraModalBottomSheetWrapper$4$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
