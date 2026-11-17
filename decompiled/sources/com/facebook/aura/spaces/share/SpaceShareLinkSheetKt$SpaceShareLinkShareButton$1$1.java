package com.facebook.aura.spaces.share;

import X.AbstractC7559F3s;
import android.content.Context;
import com.facebook.aura.file.actions.HatchShare;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.HatchShareDownloadTarget;
import com.facebook.aura.navigation.key.PublishSpaceSheetKey;
import com.facebook.aura.navigation.key.ShareType;
import com.facebook.aura.sharesheet.HatchShareSheetMCKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class SpaceShareLinkSheetKt$SpaceShareLinkShareButton$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ boolean $canDownload;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ PublishSpaceSheetKey $navKey;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $url;

    /* renamed from: com.facebook.aura.spaces.share.SpaceShareLinkSheetKt$SpaceShareLinkShareButton$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Unit> {
        public final /* synthetic */ Context $context;
        public final /* synthetic */ String $url;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Context context, String str) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceShareLinkSheetKt$SpaceShareLinkShareButton$1$1(AuraNavigator auraNavigator, PublishSpaceSheetKey publishSpaceSheetKey, String str, boolean z, Context context) {
        super(0);
        this.$navigator = auraNavigator;
        this.$navKey = publishSpaceSheetKey;
        this.$url = str;
        this.$canDownload = z;
        this.$context = context;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        ShareType shareType = ShareType.SPACE;
        PublishSpaceSheetKey publishSpaceSheetKey = this.$navKey;
        String str = publishSpaceSheetKey.previewUri;
        String str2 = publishSpaceSheetKey.title;
        String str3 = str2;
        if (str2 == null) {
            str3 = "";
        }
        HatchShareSheetMCKt.openHatchShareSheetOrElse(auraNavigator, shareType, str, str3, str, this.$url, this.$canDownload ? new HatchShareDownloadTarget.Space(publishSpaceSheetKey.slug, str2) : null, null, null, null, null, null, new AnonymousClass1(this.$context, this.$url));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
