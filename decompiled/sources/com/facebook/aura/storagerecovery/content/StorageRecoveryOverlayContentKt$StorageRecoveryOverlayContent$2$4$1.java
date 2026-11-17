package com.facebook.aura.storagerecovery.content;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.storagerecovery.StorageRecoveryViewModel;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$2$4$1 extends C7438Evz implements G0U<String, Unit> {
    public StorageRecoveryOverlayContentKt$StorageRecoveryOverlayContent$2$4$1(Object obj) {
        super(1, obj, StorageRecoveryViewModel.class, "onEntryTap", "onEntryTap(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((StorageRecoveryViewModel) AnonymousClass006.A0o(str, this)).onEntryTap(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
