package com.facebook.aura.file.view.api;

import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.C7384Etj;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.navigation.AuraBottomSheetNavKey;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.navigation.key.ContentViewerBottomActions;
import com.facebook.aura.navigation.key.ContentViewerScreenKey;
import com.facebook.aura.navigation.key.ContentViewerTarget;

/* loaded from: classes.dex */
public abstract class ContentViewerDataHolderKt {
    public static final void navigateToContentViewer(AuraNavigator auraNavigator, AHD<ContentItem> ahd, int i, boolean z, boolean z2, ContentViewerBottomActions contentViewerBottomActions, boolean z3) {
        ContentViewerTarget contentViewerTarget;
        AuraNavKey auraNavKeyCurrentKey = auraNavigator.currentKey(AnonymousClass002.A1a(auraNavigator, ahd));
        ContentItem contentItem = (ContentItem) AbstractC0878AGe.A0A(i, ahd);
        if (contentItem == null || (contentViewerTarget = toContentViewerTarget(contentItem)) == null) {
            contentViewerTarget = ContentViewerTarget.Media.INSTANCE;
        }
        if ((auraNavKeyCurrentKey instanceof ContentViewerScreenKey) && C7384Etj.areEqual(((ContentViewerScreenKey) auraNavKeyCurrentKey).target, contentViewerTarget)) {
            return;
        }
        ContentViewerScreenKey contentViewerScreenKey = new ContentViewerScreenKey(contentViewerTarget, z, !(auraNavKeyCurrentKey instanceof AuraBottomSheetNavKey), z2, contentViewerBottomActions, z3);
        if (C7384Etj.areEqual(auraNavKeyCurrentKey, contentViewerScreenKey)) {
            return;
        }
        ContentViewerDataHolder.INSTANCE.setItems(ahd, i);
        auraNavigator.navigate((AuraNavKey) contentViewerScreenKey, false);
    }

    public static final boolean navigateToFileViewerFromUrl(String str, String str2, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, String str3, boolean z) {
        String strDisplayNameForPath = str2;
        String str4 = str3;
        AnonymousClass005.A11(str, abstractC3358CGz, auraNavigator, 0);
        HatchFileUIUtils hatchFileUIUtils = HatchFileUIUtils.INSTANCE;
        String strResolvePreviewPathFromUrl = hatchFileUIUtils.resolvePreviewPathFromUrl(str);
        if (strResolvePreviewPathFromUrl == null) {
            return false;
        }
        if (str2 == null || str2.length() <= 0) {
            strDisplayNameForPath = hatchFileUIUtils.displayNameForPath(strResolvePreviewPathFromUrl);
        }
        ContentType contentTypeFromFileName = ContentTypeDetector.INSTANCE.fromFileName(strResolvePreviewPathFromUrl);
        String strResolveRawAssetUrl = WorkspaceUriResolver.INSTANCE.resolveRawAssetUrl(strResolvePreviewPathFromUrl, abstractC3358CGz);
        if (str3 == null) {
            str4 = "";
        }
        navigateToContentViewer(auraNavigator, AGI.A0E(new ContentItem(strDisplayNameForPath, contentTypeFromFileName, strResolvePreviewPathFromUrl, strResolveRawAssetUrl, null, null, str4, null, null, false, null, null, null, null, null)), 0, false, false, null, z);
        return true;
    }

    public static final ContentViewerTarget toContentViewerTarget(ContentItem contentItem) {
        String strNormalizeWorkspacePath;
        ContentViewerTarget artifact;
        C7384Etj.A0Y(contentItem, 0);
        if (contentItem.type.isMedia()) {
            artifact = ContentViewerTarget.Media.INSTANCE;
        } else {
            String str = contentItem.workspacePath;
            if (str == null || (strNormalizeWorkspacePath = WorkspaceUriResolver.INSTANCE.normalizeWorkspacePath(str, null)) == null) {
                strNormalizeWorkspacePath = contentItem.workspacePath;
            }
            artifact = new ContentViewerTarget.Artifact(strNormalizeWorkspacePath);
        }
        return artifact;
    }

    public static /* synthetic */ void navigateToContentViewer$default(AuraNavigator auraNavigator, AHD ahd, int i, boolean z, boolean z2, ContentViewerBottomActions contentViewerBottomActions, boolean z3, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 0;
        }
        boolean zA1P = AnonymousClass005.A1P(i2, z);
        boolean zA1Q = AnonymousClass005.A1Q(i2, z2);
        if ((i2 & 32) != 0) {
            contentViewerBottomActions = null;
        }
        if ((i2 & 64) != 0) {
            z3 = false;
        }
        navigateToContentViewer(auraNavigator, ahd, i, zA1P, zA1Q, contentViewerBottomActions, z3);
    }

    public static /* synthetic */ boolean navigateToFileViewerFromUrl$default(String str, String str2, AbstractC3358CGz abstractC3358CGz, AuraNavigator auraNavigator, String str3, boolean z, int i, Object obj) {
        if ((i & 16) != 0) {
            str3 = null;
        }
        return navigateToFileViewerFromUrl(str, str2, abstractC3358CGz, auraNavigator, str3, AnonymousClass002.A1R(i, z));
    }
}
