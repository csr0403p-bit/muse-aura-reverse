package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C1BO;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class NativeLoginRoutesKt$NativeLoginIntroRoute$1$1 extends AbstractC7559F3s implements Function0<NativeLoginInitialDestination> {
    public final /* synthetic */ C1BO<NativeLoginInitialDestination> $destination$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginRoutesKt$NativeLoginIntroRoute$1$1(C1BO<? extends NativeLoginInitialDestination> c1bo) {
        super(0);
        this.$destination$delegate = c1bo;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final NativeLoginInitialDestination invoke() {
        return this.$destination$delegate.getValue();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ NativeLoginInitialDestination invoke() {
        return this.$destination$delegate.getValue();
    }
}
