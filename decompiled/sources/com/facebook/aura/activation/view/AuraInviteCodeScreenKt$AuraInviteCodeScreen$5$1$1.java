package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraInviteCodeScreenKt$AuraInviteCodeScreen$5$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ String $code;
    public final /* synthetic */ G0U<String, Unit> $onCodeChange;
    public final /* synthetic */ Function0<Unit> $onContinueClick;

    /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void invoke2(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 0
            X.C7384Etj.A0Y(r4, r0)
            int r0 = r4.length()
            r2 = 6
            if (r0 != r2) goto L14
            java.lang.String r0 = r3.$code
            int r0 = r0.length()
            r1 = 1
            if (r0 < r2) goto L15
        L14:
            r1 = 0
        L15:
            X.G0U<java.lang.String, kotlin.Unit> r0 = r3.$onCodeChange
            r0.invoke(r4)
            if (r1 == 0) goto L21
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r3.$onContinueClick
            r0.invoke()
        L21:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.activation.view.AuraInviteCodeScreenKt$AuraInviteCodeScreen$5$1$1.invoke2(java.lang.String):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraInviteCodeScreenKt$AuraInviteCodeScreen$5$1$1(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0) {
        super(1);
        this.$code = str;
        this.$onCodeChange = g0u;
        this.$onContinueClick = function0;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
