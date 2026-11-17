package com.facebook.aura.file.view.api;

import X.ADq;
import X.AbstractC3358CGz;
import X.AnonymousClass006;
import X.BNt;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import com.facebook.aura.audio.podcast.PodcastPresentationResolver;
import com.facebook.aura.file.utils.HatchFileUIUtils;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.gateway.WorkspaceUriResolver;
import com.facebook.aura.maps.model.HatchMapSceneKt;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class ModelGeneratedLinkRoutingKt {
    public static final String HATCH_SLIDES_SCHEME = "hatch-slides://";
    public static final String WWW_PREFIX = "www.";

    public static final boolean hasUriSchemeSyntax(String str) {
        int iA08 = C7BY.A08(str, HatchMapSceneKt.ARTIFACT_ID_SEPARATOR, 0);
        if (iA08 > 0 && isAsciiLetter(str.charAt(0))) {
            Iterable aDq = new ADq(1, iA08 - 1);
            if (!(aDq instanceof Collection) || !((Collection) aDq).isEmpty()) {
                Iterator<Integer> it = aDq.iterator();
                while (it.hasNext()) {
                    char cCharAt = str.charAt(((BNt) it).A00());
                    if (!isAsciiLetter(cCharAt)) {
                        if ('0' <= cCharAt) {
                            if (cCharAt < ':') {
                            }
                        } else if (cCharAt == '+' || cCharAt == '-' || cCharAt == '.') {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public static final String normalizeModelGeneratedLinkUrl(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass006.A1b("www.", str) ? FGI.A0M("https://", str) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String resolveModelGeneratedWorkspaceLink(java.lang.String r8, X.AbstractC3358CGz r9, java.lang.String r10, boolean r11) {
        /*
            r2 = 0
            X.AnonymousClass002.A1a(r8, r9)
            java.lang.String r0 = normalizeModelGeneratedLinkUrl(r8)
            java.lang.String r1 = normalizeWrappedWorkspaceReference(r0)
            java.lang.String r0 = X.AnonymousClass002.A0l(r1)
            java.lang.String r8 = android.net.Uri.decode(r0)
            r7 = 0
            r6 = 0
            android.net.Uri r6 = X.C7Je.A01(r0)     // Catch: java.lang.Throwable -> L1a
        L1a:
            if (r6 != 0) goto L2c
            boolean r0 = hasUriSchemeSyntax(r0)
            if (r0 == 0) goto L2c
            X.C7384Etj.A0X(r8)
            boolean r0 = isExplicitWorkspaceReference(r8)
            if (r0 != 0) goto L2c
            return r7
        L2c:
            r0 = 0
            android.net.Uri r0 = X.C7Je.A01(r8)     // Catch: java.lang.Throwable -> L31
        L31:
            java.lang.String r5 = "https"
            java.lang.String r4 = "http"
            if (r0 == 0) goto L67
            java.lang.String r3 = r0.getScheme()
            if (r3 == 0) goto L67
            boolean r0 = r3.equalsIgnoreCase(r4)
            if (r0 != 0) goto L49
            boolean r0 = r3.equalsIgnoreCase(r5)
            if (r0 == 0) goto L67
        L49:
            if (r6 == 0) goto L52
            java.lang.String r0 = r6.getScheme()
            if (r0 == 0) goto L52
            r3 = r0
        L52:
            if (r3 == 0) goto L5a
            boolean r0 = r3.equalsIgnoreCase(r4)
            if (r0 != 0) goto L62
        L5a:
            if (r3 == 0) goto L69
            boolean r0 = r3.equalsIgnoreCase(r5)
            if (r0 == 0) goto L69
        L62:
            java.lang.String r0 = resolveCurrentWorkspaceAssetPath(r1, r9)
            return r0
        L67:
            r3 = r7
            goto L49
        L69:
            if (r3 == 0) goto L75
            X.C7384Etj.A0X(r8)
            boolean r0 = isExplicitWorkspaceReference(r8)
            if (r0 != 0) goto L75
            return r7
        L75:
            if (r11 == 0) goto L9a
            X.C7384Etj.A0X(r8)
            boolean r0 = isExplicitWorkspaceReference(r8)
            if (r0 != 0) goto L9a
        L80:
            com.facebook.aura.gateway.WorkspaceUriResolver r0 = com.facebook.aura.gateway.WorkspaceUriResolver.INSTANCE
            java.lang.String r0 = r0.normalizeWorkspacePath(r1, r10)
            if (r0 != 0) goto L9d
            java.lang.String r0 = "hatch-slides://"
            X.C7384Etj.A0Y(r1, r2)
            boolean r0 = X.AnonymousClass006.A1b(r0, r1)
            if (r0 == 0) goto L9c
            com.facebook.aura.file.utils.HatchFileUIUtils r0 = com.facebook.aura.file.utils.HatchFileUIUtils.INSTANCE
            java.lang.String r0 = r0.resolvePreviewPathFromUrl(r1)
            return r0
        L9a:
            r10 = r7
            goto L80
        L9c:
            return r7
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.file.view.api.ModelGeneratedLinkRoutingKt.resolveModelGeneratedWorkspaceLink(java.lang.String, X.CGz, java.lang.String, boolean):java.lang.String");
    }

    public static final boolean isAsciiLetter(char c) {
        if ('A' > c) {
            return false;
        }
        if (c >= '[') {
            return 'a' <= c && c < '{';
        }
        return true;
    }

    public static final boolean isExplicitWorkspaceReference(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass006.A1b(ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, str) || AnonymousClass006.A1b("hatch-slides://", str) || AnonymousClass006.A1b("workspace/", str) || AnonymousClass006.A1b("/workspace/", str) || AnonymousClass006.A1b(PodcastPresentationResolver.VM_HOME_PREFIX, str) || str.startsWith("~/");
    }

    public static final String normalizeWrappedWorkspaceReference(String str) {
        C7384Etj.A0Y(str, 0);
        return (AnonymousClass006.A1b("http://sandbox://", str) || AnonymousClass006.A1b("http://workspace/", str)) ? str.substring(7) : str;
    }

    public static final String resolveCurrentWorkspaceAssetPath(String str, AbstractC3358CGz abstractC3358CGz) {
        String strResolvePreviewPathFromUrl;
        String strResolveRawAssetUrl;
        WorkspaceUriResolver workspaceUriResolver = WorkspaceUriResolver.INSTANCE;
        String strNormalizeWorkspacePath = workspaceUriResolver.normalizeWorkspacePath(str, null);
        if (strNormalizeWorkspacePath == null || (strResolvePreviewPathFromUrl = HatchFileUIUtils.INSTANCE.resolvePreviewPathFromUrl(str)) == null || (strResolveRawAssetUrl = workspaceUriResolver.resolveRawAssetUrl(strNormalizeWorkspacePath, abstractC3358CGz)) == null) {
            return null;
        }
        String strA0S = C7BY.A0S(strResolveRawAssetUrl, strResolveRawAssetUrl, '?');
        String strA0S2 = C7BY.A0S(strA0S, strA0S, '#');
        String strA0S3 = C7BY.A0S(str, str, '?');
        if (C7384Etj.areEqual(strA0S2, C7BY.A0S(strA0S3, strA0S3, '#'))) {
            return strResolvePreviewPathFromUrl;
        }
        return null;
    }
}
