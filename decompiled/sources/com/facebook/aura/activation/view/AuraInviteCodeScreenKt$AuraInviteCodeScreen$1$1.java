package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.perf.HatchActivationQplLogger;

/* loaded from: classes.dex */
public final class AuraInviteCodeScreenKt$AuraInviteCodeScreen$1$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $initialCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraInviteCodeScreenKt$AuraInviteCodeScreen$1$1(String str) {
        super(1);
        this.$initialCode = str;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        HatchActivationQplLogger hatchActivationQplLogger = HatchActivationQplLogger.INSTANCE;
        hatchActivationQplLogger.pointFlow("invite_code_screen_shown");
        hatchActivationQplLogger.annotateFlow("has_prefill_code", AnonymousClass002.A1N(this.$initialCode.length()));
        return new C78g() { // from class: com.facebook.aura.activation.view.AuraInviteCodeScreenKt$AuraInviteCodeScreen$1$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
