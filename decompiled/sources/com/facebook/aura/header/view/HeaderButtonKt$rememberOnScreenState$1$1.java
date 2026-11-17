package com.facebook.aura.header.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;

/* loaded from: classes.dex */
public final class HeaderButtonKt$rememberOnScreenState$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ OnScreenState $onScreen;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HeaderButtonKt$rememberOnScreenState$1$1(OnScreenState onScreenState) {
        super(1);
        this.$onScreen = onScreenState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        this.$onScreen.value = true;
        return new C78g() { // from class: com.facebook.aura.header.view.HeaderButtonKt$rememberOnScreenState$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
