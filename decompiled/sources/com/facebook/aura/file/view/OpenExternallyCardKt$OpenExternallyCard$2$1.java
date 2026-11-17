package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import android.content.Context;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.ExternalFileSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class OpenExternallyCardKt$OpenExternallyCard$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $mimeType;
    public final /* synthetic */ MutableState<Boolean> $noHandler$delegate;
    public final /* synthetic */ ExternalFileSource $source;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenExternallyCardKt$OpenExternallyCard$2$1(Context context, ExternalFileSource externalFileSource, String str, MutableState<Boolean> mutableState) {
        super(0);
        this.$context = context;
        this.$source = externalFileSource;
        this.$mimeType = str;
        this.$noHandler$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExternalFileSource.Staged staged;
        HatchInteractionLogger.INSTANCE.logClick(HatchSurface.LIBRARY, null, HatchScreen.FILE_EDITOR, HatchComponent.OPEN_EXTERNALLY_BUTTON, null, null, null);
        boolean zLaunchOpenWith = OpenExternallyCardKt.launchOpenWith(this.$context, this.$source, this.$mimeType);
        if (zLaunchOpenWith) {
            ExternalFileSource externalFileSource = this.$source;
            if ((externalFileSource instanceof ExternalFileSource.Staged) && (staged = (ExternalFileSource.Staged) externalFileSource) != null) {
                StagedFileHandoff.INSTANCE.markHandedOff(staged.file);
            }
        }
        MutableState.A09(!zLaunchOpenWith, this.$noHandler$delegate);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
