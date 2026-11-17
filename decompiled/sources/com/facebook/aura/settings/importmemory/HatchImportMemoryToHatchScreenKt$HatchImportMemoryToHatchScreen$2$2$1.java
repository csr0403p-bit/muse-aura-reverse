package com.facebook.aura.settings.importmemory;

import X.AbstractC7559F3s;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchImportMemoryToHatchViewModel $viewModel;
    public final /* synthetic */ String $wrapperTemplate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$2$1(HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel, String str) {
        super(0);
        this.$viewModel = hatchImportMemoryToHatchViewModel;
        this.$wrapperTemplate = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$viewModel.addMemory(this.$wrapperTemplate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
