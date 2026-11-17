package com.facebook.aura.checkpoint.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.net.Uri;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$fileChooserLauncher$1$1 extends AbstractC7559F3s implements G0U<ActivityResult, Unit> {
    public final /* synthetic */ MutableState<ValueCallback<Uri[]>> $pendingFileCallback$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(ActivityResult activityResult) {
        C7384Etj.A0Y(activityResult, 0);
        ValueCallback<Uri[]> value = this.$pendingFileCallback$delegate.getValue();
        if (value != null) {
            value.onReceiveValue(WebChromeClient.FileChooserParams.parseResult(activityResult.A00, activityResult.A01));
        }
        this.$pendingFileCallback$delegate.Af8(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchCheckpointFileChooserKt$HatchCheckpointFileChooser$fileChooserLauncher$1$1(MutableState<ValueCallback<Uri[]>> mutableState) {
        super(1);
        this.$pendingFileCallback$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
        invoke2(activityResult);
        return Unit.INSTANCE;
    }
}
