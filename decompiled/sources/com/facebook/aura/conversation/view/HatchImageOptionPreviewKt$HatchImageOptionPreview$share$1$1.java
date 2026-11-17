package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C3UX;
import android.content.Context;
import com.facebook.aura.file.view.api.ContentItem;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.sharesheet.HatchWorkspaceMediaShareKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$HatchImageOptionPreview$share$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ C3UX $coroutineScope;
    public final /* synthetic */ String $imageUri;
    public final /* synthetic */ ContentItem $item;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ AbstractC3358CGz $userSession;
    public final /* synthetic */ String $workspacePath;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$HatchImageOptionPreview$share$1$1(AuraNavigator auraNavigator, String str, ContentItem contentItem, String str2, Context context, AbstractC3358CGz abstractC3358CGz, C3UX c3ux) {
        super(0);
        this.$navigator = auraNavigator;
        this.$workspacePath = str;
        this.$item = contentItem;
        this.$imageUri = str2;
        this.$context = context;
        this.$userSession = abstractC3358CGz;
        this.$coroutineScope = c3ux;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AuraNavigator auraNavigator = this.$navigator;
        String str = this.$workspacePath;
        ContentItem contentItem = this.$item;
        HatchWorkspaceMediaShareKt.shareWorkspaceMedia(auraNavigator, str, contentItem.name, this.$imageUri, contentItem.thumbnailUri, contentItem.messageId, false, this.$context, this.$userSession, this.$coroutineScope, null, null);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
