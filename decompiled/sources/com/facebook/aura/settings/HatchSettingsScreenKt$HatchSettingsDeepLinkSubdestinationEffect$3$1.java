package com.facebook.aura.settings;

import X.AbstractC7559F3s;
import X.C0Yr;
import X.C78g;
import X.G0U;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchSettingsScreenKt$HatchSettingsDeepLinkSubdestinationEffect$3$1 extends AbstractC7559F3s implements G0U<C0Yr, C78g> {
    public final /* synthetic */ Function0<Unit> $action;
    public final /* synthetic */ MutableState<Boolean> $handled$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchSettingsScreenKt$HatchSettingsDeepLinkSubdestinationEffect$3$1(Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(1);
        this.$action = function0;
        this.$handled$delegate = mutableState;
    }

    @Override // X.G0U
    public final C78g invoke(C0Yr c0Yr) {
        MutableState.A09(true, this.$handled$delegate);
        Function0<Unit> function0 = this.$action;
        if (function0 != null) {
            function0.invoke();
        }
        return new C78g() { // from class: com.facebook.aura.settings.HatchSettingsScreenKt$HatchSettingsDeepLinkSubdestinationEffect$3$1$invoke$$inlined$onDispose$1
            @Override // X.C78g
            public void dispose() {
            }
        };
    }
}
