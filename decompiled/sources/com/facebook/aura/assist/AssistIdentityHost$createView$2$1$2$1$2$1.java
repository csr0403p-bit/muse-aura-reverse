package com.facebook.aura.assist;

import X.AaC;
import X.Ab3;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.graphics.Rect;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class AssistIdentityHost$createView$2$1$2$1$2$1 extends AbstractC7559F3s implements G0U<AaC, Unit> {
    public final /* synthetic */ ComposeView $composeView;
    public final /* synthetic */ AssistIdentityHost this$0;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AaC aaC) {
        C7384Etj.A0Y(aaC, 0);
        if (this.this$0.state.isInteractive()) {
            Rect rect = new Rect(Ab3.A01(aaC.A01), Ab3.A01(aaC.A03), Ab3.A01(aaC.A02), Ab3.A01(aaC.A00));
            if (rect.equals(this.this$0.touchableBounds)) {
                return;
            }
            this.this$0.touchableBounds.set(rect);
            this.$composeView.requestLayout();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityHost$createView$2$1$2$1$2$1(AssistIdentityHost assistIdentityHost, ComposeView composeView) {
        super(1);
        this.this$0 = assistIdentityHost;
        this.$composeView = composeView;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AaC aaC) {
        invoke2(aaC);
        return Unit.INSTANCE;
    }
}
