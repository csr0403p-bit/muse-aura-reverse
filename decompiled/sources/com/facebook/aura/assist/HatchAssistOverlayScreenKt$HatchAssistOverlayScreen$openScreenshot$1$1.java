package com.facebook.aura.assist;

import X.AbstractC7559F3s;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.toast.api.ToastApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$openScreenshot$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ boolean $isDictating;
    public final /* synthetic */ Function0<Unit> $onEndDictation;
    public final /* synthetic */ Bitmap $screenScreenshot;
    public final /* synthetic */ String $secureAppToastText;
    public final /* synthetic */ MutableState<Boolean> $showEnableScreenshotDialog$delegate;
    public final /* synthetic */ MutableState<Boolean> $showScreenshotMode$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAssistOverlayScreenKt$HatchAssistOverlayScreen$openScreenshot$1$1(boolean z, Function0<Unit> function0, Bitmap bitmap, Context context, String str, MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2) {
        super(0);
        this.$isDictating = z;
        this.$onEndDictation = function0;
        this.$screenScreenshot = bitmap;
        this.$context = context;
        this.$secureAppToastText = str;
        this.$showScreenshotMode$delegate = mutableState;
        this.$showEnableScreenshotDialog$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        if (this.$isDictating) {
            this.$onEndDictation.invoke();
        }
        if (this.$screenScreenshot != null) {
            MutableState.A09(true, this.$showScreenshotMode$delegate);
        } else if (HatchAssistOverlayScreenKt.isAssistScreenshotEnabled(this.$context)) {
            ToastApi.INSTANCE.showToast(this.$secureAppToastText);
        } else {
            MutableState.A09(true, this.$showEnableScreenshotDialog$delegate);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
