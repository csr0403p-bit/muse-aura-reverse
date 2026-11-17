package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.gateway.HatchDeleteLogger;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ArtifactFileActionMenuKt$ArtifactFileActionMenu$9$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $deleteSource;
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ HatchScreen $loggingScreen;
    public final /* synthetic */ Function0<Unit> $onDeleted;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ MutableState<Boolean> $showDeleteConfirmation$delegate;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtifactFileActionMenuKt$ArtifactFileActionMenu$9$1(HatchScreen hatchScreen, String str, String str2, String str3, String str4, AbstractC3358CGz abstractC3358CGz, Function0<Unit> function0, MutableState<Boolean> mutableState) {
        super(0);
        this.$loggingScreen = hatchScreen;
        this.$fileExtension = str;
        this.$deleteSource = str2;
        this.$relativePath = str3;
        this.$fileName = str4;
        this.$userSession = abstractC3358CGz;
        this.$onDeleted = function0;
        this.$showDeleteConfirmation$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ArtifactFileActionMenuKt.logFileMenuClick(this.$loggingScreen, HatchComponent.DELETE_CONFIRM_BUTTON, this.$fileExtension);
        MutableState.A09(false, this.$showDeleteConfirmation$delegate);
        HatchDeleteLogger.INSTANCE.logDeleteConfirmed(this.$deleteSource, this.$relativePath, this.$fileName);
        HatchMediaDeletionManager.Companion.getInstance(this.$userSession).deleteMedia(this.$relativePath, false);
        this.$onDeleted.invoke();
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
