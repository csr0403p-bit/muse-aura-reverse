package com.facebook.aura.settings;

import X.C7438Evz;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final /* synthetic */ class HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$2$1 extends C7438Evz implements Function0<Unit> {
    public HatchSecureStorageScreenKt$HatchSecureStorageScreen$3$2$1(Object obj) {
        super(0, obj, HatchCredentialsViewModel.class, "loadCredentials", "loadCredentials()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((HatchCredentialsViewModel) this.receiver).loadCredentials();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
