package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import com.facebook.aura.perf.HatchActivationQplLogger;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraInviteCodeScreenKt$AuraInviteCodeScreen$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ String $code;
    public final /* synthetic */ String $initialCode;
    public final /* synthetic */ G0U<String, Unit> $onCodeChange;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraInviteCodeScreenKt$AuraInviteCodeScreen$2$1(String str, String str2, G0U<? super String, Unit> g0u) {
        super(1);
        this.$initialCode = str;
        this.$code = str2;
        this.$onCodeChange = g0u;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        String str = this.$initialCode;
        if (str.length() > 0 && this.$code.length() == 0) {
            this.$onCodeChange.invoke(str);
            HatchActivationQplLogger.INSTANCE.annotateFlow("has_prefill_code", true);
        }
        return new C78g() { // from class: com.facebook.aura.activation.view.AuraInviteCodeScreenKt$AuraInviteCodeScreen$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
