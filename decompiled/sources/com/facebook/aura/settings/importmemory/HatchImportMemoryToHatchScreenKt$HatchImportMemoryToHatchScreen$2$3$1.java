package com.facebook.aura.settings.importmemory;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSubsurface;
import com.facebook.aura.analytics.hatch.HatchSurface;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$3$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Function0<Unit> $openZipPicker;
    public final /* synthetic */ HatchImportMemoryToHatchViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$2$3$1(HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel, Function0<Unit> function0) {
        super(0);
        this.$viewModel = hatchImportMemoryToHatchViewModel;
        this.$openZipPicker = function0;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.SETTINGS, HatchSubsurface.IMPORT_MEMORY_TO_HATCH, HatchScreen.IMPORT_MEMORY_TO_HATCH, HatchComponent.UPLOAD_FILE_BUTTON, null, null, null);
        this.$viewModel.onChatPickerOpened();
        this.$openZipPicker.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
