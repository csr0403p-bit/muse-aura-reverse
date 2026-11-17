package com.facebook.aura.sharesheet;

import X.AbstractC7559F3s;
import X.HxS;
import android.content.Context;
import com.facebook.aura.model.HatchDanceShare;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.vds.compose.theme.AuraColors;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchShareSheetKt$HatchShareSheet$3$5$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $artifactSubtitle;
    public final /* synthetic */ AuraColors $colors;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ HatchDanceShare $dance;
    public final /* synthetic */ String $instagramStoriesStickerUri;
    public final /* synthetic */ String $previewTitle;
    public final /* synthetic */ String $previewUri;
    public final /* synthetic */ ShareType $shareType;
    public final /* synthetic */ String $uri;
    public final /* synthetic */ HatchShareSheetViewModel $viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchShareSheetKt$HatchShareSheet$3$5$1$1(ShareType shareType, HatchShareSheetViewModel hatchShareSheetViewModel, Context context, String str, String str2, String str3, String str4, AuraColors auraColors, String str5, HatchDanceShare hatchDanceShare) {
        super(0);
        this.$shareType = shareType;
        this.$viewModel = hatchShareSheetViewModel;
        this.$context = context;
        this.$uri = str;
        this.$previewUri = str2;
        this.$previewTitle = str3;
        this.$artifactSubtitle = str4;
        this.$colors = auraColors;
        this.$instagramStoriesStickerUri = str5;
        this.$dance = hatchDanceShare;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        boolean zIsPublishLinkShare = HatchShareSheetModelsKt.isPublishLinkShare(this.$shareType);
        HatchShareSheetViewModel hatchShareSheetViewModel = this.$viewModel;
        if (!zIsPublishLinkShare) {
            hatchShareSheetViewModel.shareToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(this.$context, this.$uri, this.$instagramStoriesStickerUri, this.$dance);
            return;
        }
        Context context = this.$context;
        String str = this.$uri;
        String str2 = this.$previewUri;
        String str3 = this.$previewTitle;
        if (str3 == null) {
            str3 = "";
        }
        hatchShareSheetViewModel.shareArtifactToFacebookStories$fbandroid_express_aura_java_com_facebook_aura_sharesheet_sharesheet(context, str, str2, str3, this.$artifactSubtitle, HxS.A01(this.$colors.secondaryButtonBackground), HxS.A01(this.$colors.primaryText), HxS.A01(this.$colors.secondaryText));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
