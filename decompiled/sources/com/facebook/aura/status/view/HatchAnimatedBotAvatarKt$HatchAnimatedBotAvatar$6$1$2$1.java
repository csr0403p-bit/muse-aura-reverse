package com.facebook.aura.status.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.G0U;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchAnimatedBotAvatarKt$HatchAnimatedBotAvatar$6$1$2$1 extends AbstractC7559F3s implements G0U<Boolean, Unit> {
    public final /* synthetic */ MutableState<Boolean> $baseImageLoaded$delegate;
    public final /* synthetic */ MutableState<Uri> $failedFrameUri$delegate;
    public final /* synthetic */ Uri $frameUri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchAnimatedBotAvatarKt$HatchAnimatedBotAvatar$6$1$2$1(Uri uri, MutableState<Boolean> mutableState, MutableState<Uri> mutableState2) {
        super(1);
        this.$frameUri = uri;
        this.$baseImageLoaded$delegate = mutableState;
        this.$failedFrameUri$delegate = mutableState2;
    }

    public final void invoke(boolean z) {
        MutableState.A09(z, this.$baseImageLoaded$delegate);
        if (z) {
            return;
        }
        this.$failedFrameUri$delegate.Af8(this.$frameUri);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(AnonymousClass001.A1X(bool));
        return Unit.INSTANCE;
    }
}
