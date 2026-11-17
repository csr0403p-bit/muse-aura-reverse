package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AbstractC2159Azp;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C7384Etj;
import X.C7BY;
import X.FGI;
import X.G0U;
import android.net.Uri;
import com.facebook.aura.audio.podcast.PodcastPresentationResolver;
import com.facebook.aura.file.view.ArtifactFileActionMenuKt;
import com.facebook.aura.gateway.store.HatchGatewayPrefsStore;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.network.http.HatchHttpApi;
import com.facebook.aura.opengraph.HatchWebPageParserKt;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class WorkspaceUriResolver {
    public static final int $stable = 0;
    public static final WorkspaceUriResolver INSTANCE = new WorkspaceUriResolver();

    private final String mediaRawWorkspacePath(String str) {
        int iA0B = C7BY.A0B(str, "/media/raw/", 0, false);
        if (iA0B < 0) {
            return null;
        }
        String strSubstring = str.substring(iA0B + 11);
        return normalizeWorkspacePath(C7BY.A0S(strSubstring, strSubstring, '?'), null);
    }

    private final String resolveAsset(String str, G0U<? super String, String> g0u) {
        String strInvoke;
        String strSubstring;
        String strSubstring2;
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        if (!str.startsWith("content://")) {
            if (str.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) || str.startsWith("https://")) {
                String strMediaRawWorkspacePath = mediaRawWorkspacePath(str);
                if (strMediaRawWorkspacePath == null || (strInvoke = g0u.invoke(strMediaRawWorkspacePath)) == null) {
                }
            } else {
                int iA08 = C7BY.A08(str, '?', 0);
                if (iA08 >= 0) {
                    strSubstring = str.substring(0, iA08);
                    strSubstring2 = str.substring(iA08 + 1);
                } else {
                    strSubstring = str;
                    strSubstring2 = "";
                }
                String strNormalizeWorkspacePath = normalizeWorkspacePath(strSubstring, null);
                if (strNormalizeWorkspacePath == null || (strInvoke = g0u.invoke(strNormalizeWorkspacePath)) == null) {
                    return null;
                }
                if (strSubstring2.length() != 0) {
                    return FGI.A0O(strInvoke, strSubstring2, C7BY.A0k(strInvoke, '?') ? '&' : '?');
                }
            }
            return strInvoke;
        }
        return str;
    }

    public final String decodeWorkspacePath(String str) {
        C7384Etj.A0Y(str, 0);
        try {
            String strDecode = URLDecoder.decode(AbstractC2159Azp.A0z(str, "+", "%2B"), HatchWebPageParserKt.UTF_8);
            C7384Etj.A0X(strDecode);
            return strDecode;
        } catch (Exception unused) {
            return str;
        }
    }

    public final boolean isDaemonApiReference(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return false;
        }
        return strA0l.startsWith("/api/") || strA0l.startsWith("api/");
    }

    public final String normalizeWorkspacePath(String str, String str2) {
        String strA0l;
        StringBuilder sb;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0 || AnonymousClass006.A1b(HatchWebPageParserKt.DATA_URI_PREFIX, strA0l) || AnonymousClass006.A1b("blob:", strA0l)) {
            return null;
        }
        int iA0D = C7BY.A0D(strA0l, new char[]{'?', '#'}, 0);
        if (iA0D >= 0) {
            strA0l = strA0l.substring(0, iA0D);
        }
        if (strA0l.length() == 0) {
            return null;
        }
        String strDecode = Uri.decode(strA0l);
        C7384Etj.A0U(strDecode);
        String strReplace = strDecode.replace('\\', '/');
        if (strReplace.startsWith(ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX)) {
            strReplace = C7BY.A0K(ArtifactFileActionMenuKt.SANDBOX_REFERENCE_PREFIX, strReplace);
        } else if (strReplace.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) || strReplace.startsWith("https://")) {
            strReplace = workspacePathFromAbsoluteUrlPath(strReplace);
            if (strReplace == null) {
                return null;
            }
        } else if (strReplace.startsWith("content://")) {
            return null;
        }
        if ((AnonymousClass005.A1a(strReplace, HatchUrlSegments.FS_RAW_SEGMENT) || strReplace.startsWith(HatchUrlSegments.FS_THUMBNAIL_SEGMENT) || strReplace.startsWith("/media/raw/")) && (strReplace = workspacePathFromAbsoluteUrlPath(strReplace)) == null) {
            return null;
        }
        String strA0K = C7BY.A0K(PodcastPresentationResolver.VM_HOME_PREFIX, strReplace);
        if (AnonymousClass005.A1a(strA0K, "~/")) {
            strA0K = C7BY.A0K("~/", strA0K);
        }
        if (AnonymousClass005.A1a(strA0K, "/workspace/")) {
            strA0K = C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0K);
        }
        int iA0B = C7BY.A0B(strA0K, "/workspace/", 0, false);
        if ((AnonymousClass005.A1a(strA0K, "/home/") || strA0K.startsWith("/Users/")) && iA0B >= 0) {
            strA0K = FGI.A0M("workspace/", strA0K.substring(iA0B + 11));
        }
        if (!AnonymousClass005.A1a(strA0K, CustomConnectorRegisterRepositoryKt.ROOT_PATH) && !C7BY.A0q(strA0K, "://", false) && !strA0K.startsWith("workspace/")) {
            if (str2 != null) {
                String strNormalizeWorkspacePath = normalizeWorkspacePath(str2, null);
                if (strNormalizeWorkspacePath == null) {
                    return null;
                }
                String strA0X = C7BY.A0X(strNormalizeWorkspacePath, CustomConnectorRegisterRepositoryKt.ROOT_PATH, "");
                if (strA0X.length() == 0) {
                    return null;
                }
                sb = new StringBuilder();
                sb.append(strA0X);
                sb.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
            } else {
                sb = new StringBuilder("workspace/");
            }
            strA0K = AnonymousClass001.A0v(strA0K, sb);
        }
        return normalizeWorkspaceAssetPath(strA0K);
    }

    public final String resolveDaemonApiUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        String strA0l;
        C7384Etj.A0Y(abstractC3358CGz, 1);
        if (str != null && (strA0l = AnonymousClass002.A0l(str)) != null && strA0l.length() > 0) {
            if (strA0l.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) || strA0l.startsWith("https://")) {
                return strA0l;
            }
            if (isDaemonApiReference(strA0l)) {
                String strJarvisHttpBaseUrl = HatchHttpApi.INSTANCE.jarvisHttpBaseUrl(HatchGatewayPrefsStore.Companion.getInstance(abstractC3358CGz).getGatewayUrl());
                if (strJarvisHttpBaseUrl != null) {
                    return FGI.A0M(strJarvisHttpBaseUrl, C7BY.A0K(CustomConnectorRegisterRepositoryKt.ROOT_PATH, strA0l));
                }
            }
        }
        return null;
    }

    public final String resolveRawAssetUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        String strBuildFSRawFileUrl;
        String strSubstring;
        String strSubstring2;
        C7384Etj.A0Y(abstractC3358CGz, 1);
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        if (!str.startsWith("content://")) {
            if (str.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) || str.startsWith("https://")) {
                String strMediaRawWorkspacePath = mediaRawWorkspacePath(str);
                if (strMediaRawWorkspacePath == null || (strBuildFSRawFileUrl = HatchFileOperations.INSTANCE.buildFSRawFileUrl(strMediaRawWorkspacePath, abstractC3358CGz)) == null) {
                }
            } else {
                int iA08 = C7BY.A08(str, '?', 0);
                if (iA08 >= 0) {
                    strSubstring = str.substring(0, iA08);
                    strSubstring2 = str.substring(iA08 + 1);
                } else {
                    strSubstring = str;
                    strSubstring2 = "";
                }
                String strNormalizeWorkspacePath = normalizeWorkspacePath(strSubstring, null);
                if (strNormalizeWorkspacePath == null || (strBuildFSRawFileUrl = HatchFileOperations.INSTANCE.buildFSRawFileUrl(strNormalizeWorkspacePath, abstractC3358CGz)) == null) {
                    return null;
                }
                if (strSubstring2.length() != 0) {
                    return FGI.A0O(strBuildFSRawFileUrl, strSubstring2, C7BY.A0k(strBuildFSRawFileUrl, '?') ? '&' : '?');
                }
            }
            return strBuildFSRawFileUrl;
        }
        return str;
    }

    public final String resolveRawFileSystemUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 1);
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        return HatchFileOperations.INSTANCE.buildFSRawFileUrl(str, abstractC3358CGz);
    }

    public final String resolveScreenshotUrl(String str, AbstractC3358CGz abstractC3358CGz) {
        C7384Etj.A0Y(abstractC3358CGz, 1);
        return isDaemonApiReference(str) ? resolveDaemonApiUrl(str, abstractC3358CGz) : resolveRawAssetUrl(str, abstractC3358CGz);
    }

    public final String resolveThumbnailUrl(String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize) {
        String strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway;
        String strSubstring;
        String strSubstring2;
        C7384Etj.A0Y(abstractC3358CGz, 1);
        if (str == null || C7BY.A0j(str)) {
            return null;
        }
        if (!str.startsWith("content://")) {
            if (str.startsWith(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX) || str.startsWith("https://")) {
                String strMediaRawWorkspacePath = mediaRawWorkspacePath(str);
                if (strMediaRawWorkspacePath == null || (strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = HatchFileOperations.INSTANCE.buildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(strMediaRawWorkspacePath, abstractC3358CGz, hatchThumbnailDisplaySize)) == null) {
                }
            } else {
                int iA08 = C7BY.A08(str, '?', 0);
                if (iA08 >= 0) {
                    strSubstring = str.substring(0, iA08);
                    strSubstring2 = str.substring(iA08 + 1);
                } else {
                    strSubstring = str;
                    strSubstring2 = "";
                }
                String strNormalizeWorkspacePath = normalizeWorkspacePath(strSubstring, null);
                if (strNormalizeWorkspacePath == null || (strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway = HatchFileOperations.INSTANCE.buildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(strNormalizeWorkspacePath, abstractC3358CGz, hatchThumbnailDisplaySize)) == null) {
                    return null;
                }
                if (strSubstring2.length() != 0) {
                    return FGI.A0O(strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, strSubstring2, C7BY.A0k(strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway, '?') ? '&' : '?');
                }
            }
            return strBuildFSThumbnailUrl$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway;
        }
        return str;
    }

    private final String normalizeWorkspaceAssetPath(String str) {
        ArrayList arrayList = new ArrayList();
        C7384Etj.A0Y(str, 0);
        Iterator it = C7BY.A0i(str.replace('\\', '/'), new String[]{CustomConnectorRegisterRepositoryKt.ROOT_PATH}, 0).iterator();
        while (true) {
            if (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (strA0j.length() != 0 && !".".equals(strA0j)) {
                    if (!"..".equals(strA0j)) {
                        arrayList.add(strA0j);
                    } else {
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            } else if (arrayList.size() >= 2 && C7384Etj.areEqual(AbstractC0878AGe.A0F(arrayList), "workspace")) {
                return AbstractC0878AGe.A0L(CustomConnectorRegisterRepositoryKt.ROOT_PATH, "", "", arrayList, null);
            }
        }
        return null;
    }

    public static /* synthetic */ String resolveThumbnailUrl$default(WorkspaceUriResolver workspaceUriResolver, String str, AbstractC3358CGz abstractC3358CGz, HatchThumbnailDisplaySize hatchThumbnailDisplaySize, int i, Object obj) {
        if ((i & 4) != 0) {
            hatchThumbnailDisplaySize = HatchThumbnailDisplaySize.SMALL;
        }
        return workspaceUriResolver.resolveThumbnailUrl(str, abstractC3358CGz, hatchThumbnailDisplaySize);
    }

    private final String workspacePathFromAbsoluteUrlPath(String str) {
        for (String str2 : Arrays.asList(HatchUrlSegments.FS_RAW_SEGMENT, "/media/raw/", HatchUrlSegments.FS_THUMBNAIL_SEGMENT)) {
            int iA0B = C7BY.A0B(str, str2, 0, false);
            if (iA0B >= 0) {
                return str.substring(iA0B + str2.length());
            }
        }
        int iA0B2 = C7BY.A0B(str, "/workspace/", 0, false);
        if (iA0B2 >= 0) {
            return FGI.A0M("workspace/", str.substring(iA0B2 + 11));
        }
        return null;
    }
}
