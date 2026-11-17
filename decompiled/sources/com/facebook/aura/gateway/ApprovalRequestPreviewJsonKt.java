package com.facebook.aura.gateway;

import X.C06827l3;
import X.C10571Hud;
import X.C3cG;
import X.C3cI;
import X.C7BY;
import X.C7Je;
import X.C9sU;
import X.CFK;
import android.net.Uri;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.json.HatchJsonKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;

/* loaded from: classes2.dex */
public abstract class ApprovalRequestPreviewJsonKt {
    public static final C06827l3 CONTENT_TYPE_PATTERN = new C06827l3("^[a-z0-9][a-z0-9!#$&^_.+-]*/[a-z0-9][a-z0-9!#$&^_.+-]*$");
    public static final int MAX_ATTACHMENTS = 40;
    public static final long MAX_ATTACHMENT_SIZE_BYTES = 1073741824;
    public static final int MAX_BLOCKS = 8;
    public static final int MAX_COLLECTION_ITEMS = 32;
    public static final int MAX_CONTENT_TYPE_BYTES = 127;
    public static final int MAX_FILE_NAME_SCALARS = 255;
    public static final int MAX_KEY_BYTES = 64;
    public static final int MAX_LABEL_SCALARS = 80;
    public static final int MAX_MEDIA_DIMENSION = 32768;
    public static final int MAX_SERIALIZED_DOCUMENT_BYTES = 16384;
    public static final int MAX_URL_BYTES = 2048;
    public static final int MAX_VALUE_SCALARS = 1024;
    public static final int REQUEST_PREVIEW_VERSION = 2;
    public static final String TAG = "ApprovalRequestPreview";

    public static final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument decodeApprovalRequestPreviewDocument(JsonElement jsonElement) {
        Object objA0s;
        String str;
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument domainOrNull = null;
        if (jsonElement != null && !(jsonElement instanceof JsonNull)) {
            if (C3cG.A1S(jsonElement.toString()).length <= 16384) {
                try {
                    C9sU c9sU = HatchJsonKt.HatchJson;
                    int i = ApprovalRequestPreviewDocumentJson.$stable;
                    objA0s = (ApprovalRequestPreviewDocumentJson) C3cI.A0T(ApprovalRequestPreviewDocumentJson$$serializer.INSTANCE, c9sU, jsonElement);
                } catch (Throwable th) {
                    objA0s = C3cG.A0s(th);
                }
                if (objA0s instanceof C10571Hud) {
                    objA0s = null;
                }
                ApprovalRequestPreviewDocumentJson approvalRequestPreviewDocumentJson = (ApprovalRequestPreviewDocumentJson) objA0s;
                str = (approvalRequestPreviewDocumentJson == null || (domainOrNull = approvalRequestPreviewDocumentJson.toDomainOrNull()) == null) ? "Rejected invalid approval request preview document" : "Rejected oversized approval request preview document";
            }
            CFK.A06(TAG, str);
        }
        return domainOrNull;
    }

    public static final int unicodeScalarCount(String str) {
        return str.codePointCount(0, str.length());
    }

    public static final boolean isValidOptionalLabel(String str) {
        return str == null || isValidLabel(str);
    }

    public static final boolean isValidContentType(String str) {
        return C3cG.A1S(str).length <= 127 && CONTENT_TYPE_PATTERN.A08(str);
    }

    public static final boolean isValidFieldOrListValue(String str) {
        return unicodeScalarCount(str) <= 1024;
    }

    public static final boolean isValidFileName(String str) {
        if (C7BY.A0j(str) || unicodeScalarCount(str) > 255 || C7BY.A0k(str, '/') || C7BY.A0k(str, '\\')) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt < ' ' || cCharAt == '\u007f') {
                return false;
            }
        }
        return true;
    }

    public static final boolean isValidHttpsUrl(String str) {
        String scheme;
        String host;
        if (C3cG.A1S(str).length <= 2048) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(str);
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 != null && (scheme = uriA01.getScheme()) != null && scheme.equalsIgnoreCase("https") && (host = uriA01.getHost()) != null && !C7BY.A0j(host)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValidKey(String str) {
        return !C7BY.A0j(str) && C3cG.A1S(str).length <= 64;
    }

    public static final boolean isValidLabel(String str) {
        return !C7BY.A0j(str) && unicodeScalarCount(str) <= 80;
    }

    public static final boolean isValidWorkspaceUrl(String str) {
        return C3cG.A1S(str).length <= 2048 && str.startsWith("sandbox://workspace/") && WorkspaceUriResolver.INSTANCE.normalizeWorkspacePath(str, null) != null;
    }

    public static final int utf8Size(String str) {
        return C3cG.A1S(str).length;
    }
}
