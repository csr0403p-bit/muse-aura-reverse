package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.AnonymousClass003;
import X.G0V;
import android.content.Context;
import com.facebook.aura.file.actions.HatchShare;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.gateway.HatchThumbnailDisplaySize;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.PublishArtifactSheetKey;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.sharesheet.HatchShareSheetMCKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$shareArtifact$1$1 extends AbstractC7559F3s implements G0V<String, String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ PublishArtifactSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: com.facebook.aura.file.view.HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$shareArtifact$1$1$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Context context, String str) {
            super(0);
            this.$context = context;
            this.$url = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HatchShare.INSTANCE.shareUrl(this.$context, this.$url, null, null);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
        PublishArtifactSheetKey publishArtifactSheetKey = this.$navKey;
        String str3 = publishArtifactSheetKey.sourcePath;
        if (str3 == null) {
            str3 = publishArtifactSheetKey.url;
        }
        String strResolvePreviewPathFromUrl = hatchFileUIUtils.resolvePreviewPathFromUrl(str3);
        String strResolveThumbnailUrl = strResolvePreviewPathFromUrl != null ? WorkspaceUriResolver.INSTANCE.resolveThumbnailUrl(strResolvePreviewPathFromUrl, this.$userSession, HatchThumbnailDisplaySize.LARGE) : null;
        AuraNavigator auraNavigator = this.$navigator;
        ShareType shareType = ShareType.ARTIFACT;
        String str4 = this.$navKey.sourcePath;
        HatchShareSheetMCKt.openHatchShareSheetOrElse(auraNavigator, shareType, strResolveThumbnailUrl, str2, strResolveThumbnailUrl, str, str4 != null ? new HatchShareDownloadTarget.Artifact(str4, str2) : null, null, null, null, null, null, new AnonymousClass2(this.$context, str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishArtifactSheetKt$HatchPublishArtifactSheet$shareArtifact$1$1(PublishArtifactSheetKey publishArtifactSheetKey, AuraNavigator auraNavigator, AbstractC3358CGz abstractC3358CGz, Context context) {
        super(2);
        this.$navKey = publishArtifactSheetKey;
        this.$navigator = auraNavigator;
        this.$userSession = abstractC3358CGz;
        this.$context = context;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke2(str, str2);
        return Unit.INSTANCE;
    }
}
