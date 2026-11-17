package com.facebook.aura.localbrowser;

import X.C78g;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class LocalBrowserAddressBarKt$LocalBrowserAddressInput$lambda$4$0$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ Function0 $onEditingEnded$inlined;

    public LocalBrowserAddressBarKt$LocalBrowserAddressInput$lambda$4$0$$inlined$onDispose$1(Function0 function0) {
        this.$onEditingEnded$inlined = function0;
    }

    @Override // X.C78g
    public void dispose() {
        this.$onEditingEnded$inlined.invoke();
    }
}
