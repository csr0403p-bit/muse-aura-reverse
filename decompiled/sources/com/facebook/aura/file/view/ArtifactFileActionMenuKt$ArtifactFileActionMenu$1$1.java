package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.sharesheet.HatchShareSheetMCKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ArtifactFileActionMenuKt$ArtifactFileActionMenu$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $fileExtension;
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ boolean $isMedia;
    public final /* synthetic */ boolean $isPublishableArtifact;
    public final /* synthetic */ HatchScreen $loggingScreen;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $normalizedExtension;
    public final /* synthetic */ String $relativePath;
    public final /* synthetic */ Function0<Unit> $shareFile;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ArtifactFileActionMenuKt$ArtifactFileActionMenu$1$1(HatchScreen hatchScreen, String str, boolean z, String str2, AuraNavigator auraNavigator, String str3, Function0<Unit> function0, boolean z2, String str4, String str5) {
        super(0);
        this.$loggingScreen = hatchScreen;
        this.$fileExtension = str;
        this.$isMedia = z;
        this.$imageUri = str2;
        this.$navigator = auraNavigator;
        this.$normalizedExtension = str3;
        this.$shareFile = function0;
        this.$isPublishableArtifact = z2;
        this.$relativePath = str4;
        this.$fileName = str5;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ArtifactFileActionMenuKt.logFileMenuClick(this.$loggingScreen, HatchComponent.SHARE_BUTTON, this.$fileExtension);
        if (this.$isMedia && this.$imageUri != null) {
            AuraNavigator auraNavigator = this.$navigator;
            ShareType shareType = HatchFileUIUtils.FileExtensions.VIDEO.contains(this.$normalizedExtension) ? ShareType.VIDEO : ShareType.IMAGE;
            String str = this.$imageUri;
            HatchShareSheetMCKt.openHatchShareSheetOrElse(auraNavigator, shareType, str, null, str, null, new HatchShareDownloadTarget.Media(str), null, null, null, null, null, this.$shareFile);
            return;
        }
        if (!this.$isPublishableArtifact) {
            this.$shareFile.invoke();
            return;
        }
        AuraNavigator auraNavigator2 = this.$navigator;
        String str2 = this.$imageUri;
        if (str2 == null) {
            str2 = this.$relativePath;
        }
        auraNavigator2.navigate((AuraNavKey) new PublishArtifactSheetKey(str2, this.$fileName, this.$relativePath, null, false, HatchSurface.LIBRARY), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
