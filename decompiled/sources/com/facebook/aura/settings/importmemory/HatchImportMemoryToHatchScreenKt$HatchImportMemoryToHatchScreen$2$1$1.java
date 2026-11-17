package com.facebook.aura.settings.importmemory;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$1$1 extends C7438Evz implements G0U<String, Unit> {
    public HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$1$1(Object obj) {
        super(1, obj, HatchImportMemoryToHatchViewModel.class, "onPastedTextChanged", "onPastedTextChanged(Ljava/lang/String;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ((HatchImportMemoryToHatchViewModel) AnonymousClass006.A0o(str, this)).onPastedTextChanged(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
