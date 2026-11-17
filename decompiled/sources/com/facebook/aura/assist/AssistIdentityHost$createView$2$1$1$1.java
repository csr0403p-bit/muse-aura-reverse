package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.ui.platform.ComposeView;

/* loaded from: classes2.dex */
public final class AssistIdentityHost$createView$2$1$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ ComposeView $composeView;
    public final /* synthetic */ boolean $interactive;
    public final /* synthetic */ AssistIdentityHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityHost$createView$2$1$1$1(boolean z, AssistIdentityHost assistIdentityHost, ComposeView composeView) {
        super(1);
        this.$interactive = z;
        this.this$0 = assistIdentityHost;
        this.$composeView = composeView;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (!this.$interactive) {
            this.this$0.touchableBounds.setEmpty();
        }
        this.$composeView.requestLayout();
        return new C78g() { // from class: com.facebook.aura.assist.AssistIdentityHost$createView$2$1$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
