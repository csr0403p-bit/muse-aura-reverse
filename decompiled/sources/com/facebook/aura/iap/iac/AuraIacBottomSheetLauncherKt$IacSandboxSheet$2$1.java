package com.facebook.aura.iap.iac;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.C9xk;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class AuraIacBottomSheetLauncherKt$IacSandboxSheet$2$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ C9xk $content;
    public final /* synthetic */ Function0<Unit> $dismiss;
    public final /* synthetic */ MutableState<Boolean> $resolved$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraIacBottomSheetLauncherKt$IacSandboxSheet$2$1(C9xk c9xk, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(1);
        this.$content = c9xk;
        this.$dismiss = function0;
        this.$resolved$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        if (MutableState.A0A((MutableState) this.$resolved$delegate) && this.$content == null) {
            this.$dismiss.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.iap.iac.AuraIacBottomSheetLauncherKt$IacSandboxSheet$2$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
