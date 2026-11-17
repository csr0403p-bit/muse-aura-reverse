package com.facebook.aura.composer.camera;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.auth.AuraSessionManager;
import com.facebook.aura.utils.HatchPermissionUtils;
import java.io.File;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final class HatchInAppCameraKt$HatchInAppCameraHost$permission$1$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ MutableState<G0U<File, Unit>> $receiver$delegate;
    public final /* synthetic */ AbstractC3358CGz $session;
    public final /* synthetic */ MutableState<Boolean> $visible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchInAppCameraKt$HatchInAppCameraHost$permission$1$1(AbstractC3358CGz abstractC3358CGz, Context context, MutableState<G0U<File, Unit>> mutableState, MutableState<Boolean> mutableState2) {
        super(1);
        this.$session = abstractC3358CGz;
        this.$context = context;
        this.$receiver$delegate = mutableState;
        this.$visible$delegate = mutableState2;
    }

    public final void invoke(boolean z) {
        if (this.$receiver$delegate.getValue() == null || !AuraSessionManager.INSTANCE.isCurrentSession(this.$session)) {
            this.$receiver$delegate.Af8(null);
        } else if (z) {
            MutableState.A09(true, this.$visible$delegate);
        } else {
            this.$receiver$delegate.Af8(null);
            HatchPermissionUtils.INSTANCE.openAppSettings(this.$context);
        }
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
