package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$11$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ MutableState<Boolean> $isVisible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$11$1(MutableState<Boolean> mutableState) {
        super(1);
        this.$isVisible$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MutableState.A09(true, this.$isVisible$delegate);
        return new C78g() { // from class: com.facebook.aura.assist.HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$11$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
