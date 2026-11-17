package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C3UX;
import android.content.Context;
import com.facebook.aura.conversation.viewmodel.HatchMessageUiModel;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.file.view.api.ContentType;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ ContentItem $media;
    public final /* synthetic */ HatchMessageUiModel $message;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $path;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageShareLauncherKt$rememberHatchMessageMediaActions$1$1(AuraNavigator auraNavigator, String str, ContentItem contentItem, String str2, Context context, AbstractC3358CGz abstractC3358CGz, C3UX c3ux, HatchMessageUiModel hatchMessageUiModel) {
        super(0);
        this.$navigator = auraNavigator;
        this.$path = str;
        this.$media = contentItem;
        this.$imageUri = str2;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
        this.$coroutineScope = c3ux;
        this.$message = hatchMessageUiModel;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        String str = this.$path;
        ContentItem contentItem = this.$media;
        String str2 = contentItem.name;
        String str3 = this.$imageUri;
        String str4 = contentItem.thumbnailUri;
        String str5 = contentItem.messageId;
        boolean z = contentItem.type instanceof ContentType.Video;
        Context context = this.$context;
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        C3UX c3ux = this.$coroutineScope;
        String str6 = this.$message.sessionId;
        if (str6 == null || str6.equals("primary_session_id")) {
            str6 = null;
        }
        HatchWorkspaceMediaShareKt.shareWorkspaceMedia(auraNavigator, str, str2, str3, str4, str5, z, context, abstractC3358CGz, c3ux, str6, contentItem.getDance());
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
