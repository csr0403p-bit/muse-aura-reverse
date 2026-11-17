package com.facebook.aura.file.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.content.Context;
import com.facebook.aura.browser.AuraBrowserLauncherKt;
import com.facebook.aura.file.view.api.ContentViewerDataHolderKt;
import com.facebook.aura.file.view.api.ModelGeneratedLinkRoutingKt;
import com.facebook.aura.library.repo.WorkspaceEntry;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class FileViewerContentKt$rememberFileViewerMarkdownLinkHandler$1$1 extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ WorkspaceEntry $entry;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ boolean $resolveDocumentRelative;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        String strResolveModelGeneratedWorkspaceLink;
        C7384Etj.A0Y(str, 0);
        String strNormalizeModelGeneratedLinkUrl = ModelGeneratedLinkRoutingKt.normalizeModelGeneratedLinkUrl(str);
        AbstractC3358CGz abstractC3358CGz = this.$userSession;
        if (abstractC3358CGz != null) {
            WorkspaceEntry workspaceEntry = this.$entry;
            strResolveModelGeneratedWorkspaceLink = ModelGeneratedLinkRoutingKt.resolveModelGeneratedWorkspaceLink(strNormalizeModelGeneratedLinkUrl, abstractC3358CGz, workspaceEntry.relativePath, this.$resolveDocumentRelative);
        } else {
            strResolveModelGeneratedWorkspaceLink = null;
        }
        AbstractC3358CGz abstractC3358CGz2 = this.$userSession;
        if (abstractC3358CGz2 == null || strResolveModelGeneratedWorkspaceLink == null || !ContentViewerDataHolderKt.navigateToFileViewerFromUrl(strResolveModelGeneratedWorkspaceLink, null, abstractC3358CGz2, this.$navigator, null, false)) {
            AuraBrowserLauncherKt.openModelGeneratedLink(strNormalizeModelGeneratedLinkUrl, this.$context);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileViewerContentKt$rememberFileViewerMarkdownLinkHandler$1$1(AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, Context context, WorkspaceEntry workspaceEntry, boolean z) {
        super(1);
        this.$userSession = abstractC3358CGz;
        this.$navigator = auraNavigator;
        this.$context = context;
        this.$entry = workspaceEntry;
        this.$resolveDocumentRelative = z;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }
}
