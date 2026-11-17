package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.C3UX;
import X.G0V;
import X.HtJ;
import com.facebook.aura.conversation.viewmodel.HatchConversationViewModel;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$9$1", f = "HatchConversationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchConversationScreenKt$HatchConversationScreen$9$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ boolean $isMainTab;
    public final /* synthetic */ HatchConversationViewModel $viewModel;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConversationScreenKt$HatchConversationScreen$9$1(boolean z, HatchConversationViewModel hatchConversationViewModel, HtJ<? super HatchConversationScreenKt$HatchConversationScreen$9$1> htJ) {
        super(2, htJ);
        this.$isMainTab = z;
        this.$viewModel = hatchConversationViewModel;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchConversationScreenKt$HatchConversationScreen$9$1(this.$isMainTab, this.$viewModel, htJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0010  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.HatchConversationScreenKt$HatchConversationScreen$9$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchConversationScreenKt$HatchConversationScreen$9$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
