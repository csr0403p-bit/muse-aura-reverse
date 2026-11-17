package com.facebook.aura.spaces.view.cards;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C3cG;
import X.C3cH;
import X.C7OU;
import X.G0U;
import X.HsJ;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.activity.result.ActivityResult;
import com.facebook.aura.spaces.repo.HtmlSpacesWebViewSession;
import com.facebook.aura.spaces.repo.SpacesUserError;
import com.facebook.aura.utils.HatchPermissionUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$cameraCapturePermissionLauncher$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Function0<Unit> $endFileRequest;
    public final /* synthetic */ C7OU<Intent, ActivityResult> $fileChooserLauncher;
    public final /* synthetic */ HtmlSpacesWebViewSession $session;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpacesWebViewHostBindingsKt$installSpacesWebViewHostBindings$cameraCapturePermissionLauncher$1$1(HtmlSpacesWebViewSession htmlSpacesWebViewSession, Activity activity, Context context, Function0<Unit> function0, C7OU<Intent, ActivityResult> c7ou) {
        super(1);
        this.$session = htmlSpacesWebViewSession;
        this.$activity = activity;
        this.$context = context;
        this.$endFileRequest = function0;
        this.$fileChooserLauncher = c7ou;
    }

    public final void invoke(boolean z) {
        Object objA0s;
        Function0<Unit> function0;
        Intent intent = this.$session.pendingCameraIntent;
        this.$session.pendingCameraIntent = null;
        if (intent != null) {
            if (z) {
                try {
                    A01(null, intent);
                    objA0s = Unit.INSTANCE;
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                HtmlSpacesWebViewSession htmlSpacesWebViewSession = this.$session;
                function0 = this.$endFileRequest;
                Throwable thA00 = HsJ.A00(objA0s);
                if (thA00 == null) {
                    return;
                }
                C3cH.A1B("post-permission camera launch failed: ", thA00.getMessage(), SpacesWebViewHostBindingsKt.SPACES_HOST_TAG, thA00);
                htmlSpacesWebViewSession.emitUserError(SpacesUserError.PICKER_FAILED);
                ValueCallback<Uri[]> valueCallback = htmlSpacesWebViewSession.pendingFileCallback;
                if (valueCallback != null) {
                    valueCallback.onReceiveValue(new Uri[0]);
                }
            } else {
                Activity activity = this.$activity;
                if (activity != null && !activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                    this.$session.emitUserError(SpacesUserError.CAMERA_PERMISSION_DENIED);
                    HatchPermissionUtils.INSTANCE.openAppSettings(this.$context);
                }
                ValueCallback<Uri[]> valueCallback2 = this.$session.pendingFileCallback;
                if (valueCallback2 != null) {
                    valueCallback2.onReceiveValue(new Uri[0]);
                }
                function0 = this.$endFileRequest;
            }
            function0.invoke();
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
