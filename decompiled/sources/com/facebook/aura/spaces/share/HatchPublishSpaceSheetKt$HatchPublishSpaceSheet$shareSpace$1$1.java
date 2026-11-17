package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.sharesheet.HatchShareSheetMCKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$shareSpace$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ boolean $canDownload;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ PublishSpaceSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $shareTitle;
    public final /* synthetic */ HatchPublishSpaceViewModel $viewModel;

    /* renamed from: com.facebook.aura.spaces.share.HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$shareSpace$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $url;
        public final /* synthetic */ HatchPublishSpaceViewModel $viewModel;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchPublishSpaceViewModel hatchPublishSpaceViewModel, Context context, String str) {
            super(0);
            this.$viewModel = hatchPublishSpaceViewModel;
            this.$context = context;
            this.$url = str;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$viewModel.shareUrl(this.$context, this.$url);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        C7384Etj.A0Y(str, 0);
        AuraNavigator auraNavigator = this.$navigator;
        ShareType shareType = ShareType.SPACE;
        PublishSpaceSheetKey publishSpaceSheetKey = this.$navKey;
        String str2 = publishSpaceSheetKey.previewUri;
        HatchShareSheetMCKt.openHatchShareSheetOrElse(auraNavigator, shareType, str2, this.$shareTitle, str2, str, this.$canDownload ? new HatchShareDownloadTarget.Space(publishSpaceSheetKey.slug, publishSpaceSheetKey.title) : null, null, null, null, null, null, new AnonymousClass1(this.$viewModel, this.$context, str));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchPublishSpaceSheetKt$HatchPublishSpaceSheet$shareSpace$1$1(AuraNavigator auraNavigator, PublishSpaceSheetKey publishSpaceSheetKey, String str, boolean z, HatchPublishSpaceViewModel hatchPublishSpaceViewModel, Context context) {
        super(1);
        this.$navigator = auraNavigator;
        this.$navKey = publishSpaceSheetKey;
        this.$shareTitle = str;
        this.$canDownload = z;
        this.$viewModel = hatchPublishSpaceViewModel;
        this.$context = context;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
