package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.AnonymousClass006;
import android.content.Context;
import com.facebook.aura.analytics.hatch.HatchComponent;
import com.facebook.aura.analytics.hatch.HatchInteractionLogger;
import com.facebook.aura.analytics.hatch.HatchMetadataKey;
import com.facebook.aura.analytics.hatch.HatchScreen;
import com.facebook.aura.analytics.hatch.HatchSocialSourceApp;
import com.facebook.aura.analytics.hatch.HatchSurface;
import com.facebook.aura.file.view.api.ContentSocialSource;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class MediaViewerContentKt$MediaViewerSocialAttribution$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $postUrl;
    public final /* synthetic */ ContentSocialSource $source;
    public final /* synthetic */ String $sourceName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaViewerContentKt$MediaViewerSocialAttribution$1$1$1(String str, ContentSocialSource contentSocialSource, Context context, String str2) {
        super(0);
        this.$sourceName = str;
        this.$source = contentSocialSource;
        this.$context = context;
        this.$postUrl = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchInteractionLogger hatchInteractionLogger = HatchInteractionLogger.INSTANCE;
        HatchSurface hatchSurface = HatchSurface.MEDIA_VIEWER;
        HatchScreen hatchScreen = HatchScreen.MEDIA_FULLSCREEN;
        HatchComponent hatchComponent = HatchComponent.SOCIAL_SOURCE_LINK;
        HatchSocialSourceApp hatchSocialSourceAppFromSourceName = HatchSocialSourceApp.Companion.fromSourceName(this.$sourceName);
        hatchInteractionLogger.logClick(hatchSurface, null, hatchScreen, hatchComponent, null, hatchSocialSourceAppFromSourceName != null ? AnonymousClass006.A10(HatchMetadataKey.SOCIAL_SOURCE_APP.getValue(), hatchSocialSourceAppFromSourceName.getValue()) : null, null);
        Function0<Unit> function0 = this.$source.onOpen;
        if (function0 != null) {
            function0.invoke();
        }
        MediaViewerContentKt.openExternalUri(this.$context, this.$postUrl);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
