package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class AssistIdentityHost$createView$2$1$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ComposeView $composeView;
    public final /* synthetic */ AssistIdentityHost this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssistIdentityHost$createView$2$1$2$1$1$1(ComposeView composeView, AssistIdentityHost assistIdentityHost) {
        super(0);
        this.$composeView = composeView;
        this.this$0 = assistIdentityHost;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposeView composeView = this.$composeView;
        final AssistIdentityHost assistIdentityHost = this.this$0;
        composeView.post(new Runnable() { // from class: com.facebook.aura.assist.AssistIdentityHost$createView$2$1$2$1$1$1.1
            @Override // java.lang.Runnable
            public final void run() {
                assistIdentityHost.onCallEnded.invoke();
            }
        });
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
