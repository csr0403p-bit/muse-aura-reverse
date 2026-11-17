package com.facebook.aura.settings.importmemory;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$zipPickerLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchImportMemoryToHatchViewModel $viewModel;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        Intent intent;
        Uri data;
        C7384Etj.A0Y(activityResult, 0);
        if (activityResult.A00 != -1 || (intent = activityResult.A01) == null || (data = intent.getData()) == null) {
            return;
        }
        this.$viewModel.uploadChatsZip(this.$context, data);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImportMemoryToHatchScreenKt$HatchImportMemoryToHatchScreen$zipPickerLauncher$1$1(HatchImportMemoryToHatchViewModel hatchImportMemoryToHatchViewModel, Context context) {
        super(1);
        this.$viewModel = hatchImportMemoryToHatchViewModel;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
