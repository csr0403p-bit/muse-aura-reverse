package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ boolean $isVisible;
    public final /* synthetic */ MutableState<SidePanelMode> $mode$delegate;
    public final /* synthetic */ G0U<Function0<Boolean>, Unit> $onBackPressedHandlerChanged;
    public final /* synthetic */ Function0<Unit> $onSearchBack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1(boolean z, G0U<? super Function0<Boolean>, Unit> g0u, MutableState<SidePanelMode> mutableState, Function0<Unit> function0) {
        super(1);
        this.$isVisible = z;
        this.$onBackPressedHandlerChanged = g0u;
        this.$mode$delegate = mutableState;
        this.$onSearchBack = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // X.G0U
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C78g invoke(X.C0Yr r4) {
        /*
            r3 = this;
            boolean r0 = r3.$isVisible
            if (r0 == 0) goto L26
            androidx.compose.runtime.MutableState<com.facebook.aura.conversation.view.SidePanelMode> r1 = r3.$mode$delegate
            float r0 = com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt.SidePanelBottomActionSize
            java.lang.Object r1 = r1.getValue()
            com.facebook.aura.conversation.view.SidePanelMode r0 = com.facebook.aura.conversation.view.SidePanelMode.DEFAULT
            if (r1 == r0) goto L26
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r3.$onSearchBack
            androidx.compose.runtime.MutableState<com.facebook.aura.conversation.view.SidePanelMode> r0 = r3.$mode$delegate
            com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1$backHandler$1 r2 = new com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1$backHandler$1
            r2.<init>(r1, r0)
        L19:
            X.G0U<kotlin.jvm.functions.Function0<java.lang.Boolean>, kotlin.Unit> r0 = r3.$onBackPressedHandlerChanged
            r0.invoke(r2)
            X.G0U<kotlin.jvm.functions.Function0<java.lang.Boolean>, kotlin.Unit> r1 = r3.$onBackPressedHandlerChanged
            com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1$invoke$$inlined$onDispose$1 r0 = new com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1$invoke$$inlined$onDispose$1
            r0.<init>()
            return r0
        L26:
            r2 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationHistorySidePanelKt$HatchConversationHistorySidePanelContent$8$1.invoke(X.0Yr):X.78g");
    }
}
