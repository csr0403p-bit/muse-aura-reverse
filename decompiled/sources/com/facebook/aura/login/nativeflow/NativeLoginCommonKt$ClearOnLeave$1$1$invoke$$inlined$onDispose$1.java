package com.facebook.aura.login.nativeflow;

import X.C1BO;
import X.C78g;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$ClearOnLeave$1$1$invoke$$inlined$onDispose$1 implements C78g {
    public final /* synthetic */ C1BO $currentOnLeave$delegate$inlined;

    public NativeLoginCommonKt$ClearOnLeave$1$1$invoke$$inlined$onDispose$1(C1BO c1bo) {
        this.$currentOnLeave$delegate$inlined = c1bo;
    }

    @Override // X.C78g
    public void dispose() {
        C1BO c1bo = this.$currentOnLeave$delegate$inlined;
        int i = NativeLoginCommonKt.IME_EDGE_UNSET;
        C1BO.A0D(c1bo);
    }
}
