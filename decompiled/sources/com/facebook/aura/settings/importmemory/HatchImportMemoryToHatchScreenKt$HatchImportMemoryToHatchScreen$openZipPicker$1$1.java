package com.facebook.aura.settings.importmemory;

import X.AbstractC7559F3s;
import X.AnonymousClass000;
import X.C60N;
import X.C7OU;
import X.CFK;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$openZipPicker$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchImportMemoryToHatchViewModel $viewModel;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $zipPickerLauncher;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Intent intent = new Intent(AnonymousClass000.A00(3));
        intent.addCategory(AnonymousClass000.A00(4));
        intent.setType("*/*");
        intent.putExtra(AnonymousClass000.A00(5), new String[]{C60N.A00(69), "application/x-zip-compressed"});
        try {
            A02(intent);
        } catch (ActivityNotFoundException e) {
            CFK.A0J(HatchImportMemoryToHatchScreenKt.TAG, e, "No activity found to pick a chat-export .zip");
            this.$viewModel.onChatPickerUnavailable();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$openZipPicker$1$1(C7OU<Intent, ActivityResult> c7ou, HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel) {
        super(0);
        this.$zipPickerLauncher = c7ou;
        this.$viewModel = hatchImportMemoryToHatchViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
