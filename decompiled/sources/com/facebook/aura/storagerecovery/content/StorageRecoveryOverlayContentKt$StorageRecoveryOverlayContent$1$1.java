package com.facebook.aura.storagerecovery.content;

import X.C7438Evz;
import com.facebook.aura.storagerecovery.StorageRecoveryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$1$1 extends C7438Evz implements Function0<Unit> {
    public StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$1$1(Object obj) {
        super(0, obj, StorageRecoveryViewModel.class, "onNavigateBack", "onNavigateBack()V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((StorageRecoveryViewModel) this.receiver).onNavigateBack();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
