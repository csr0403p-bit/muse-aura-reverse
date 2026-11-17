package com.facebook.aura.partners.voice.avatar;

import com.facebook.aura.network.sandbox.AuraSandbox;
import com.facebook.aura.settings.HatchDataExportRepositoryKt;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* loaded from: classes5.dex */
public abstract class HatchAvatarAssetServiceKt {
    public static final String ABRA_GRAPH_URL_PROD = "https://graph.meta.ai/graphql";
    public static final String CUSTOM_AVATARS_DOC_ID = "29045950825092570";
    public static final String CUSTOM_AVATARS_OP = "ClawmagotchiAbraCustomAvatars";
    public static final String CUSTOM_AVATARS_WITH_HATCH_IDLE_DOC_ID = "28681665694847817";
    public static final long DOWNLOAD_TIMEOUT_MS = 6000;
    public static final String ECTO_UPLOAD_URL_PROD = "https://rupload.meta.ai/gen_ai_document_gen_ai_tenant/";
    public static final int GRAPH_ERROR_LOG_LIMIT = 512;
    public static final long GRAPH_TIMEOUT_MS = 6000;
    public static final String IMAGE_CALLER_CONTEXT = "HatchAvatarReference";
    public static final String SET_CUSTOM_AVATAR_DOC_ID = "36805194462428540";
    public static final String SET_CUSTOM_AVATAR_OP = "ClawmagotchiAbraSetCustomAvatar";
    public static final String TAG = "HatchAvatarAssetService";
    public static final long UPLOAD_TIMEOUT_MS = 6000;

    public static final String classifyFailure(Throwable th) {
        return th instanceof SocketTimeoutException ? "timeout" : th instanceof UnknownHostException ? "dns" : th instanceof ConnectException ? "connect" : HatchDataExportRepositoryKt.FAILURE_TRANSPORT;
    }

    public static final String getAbraGraphUrl() {
        AuraSandbox auraSandbox = AuraSandbox.INSTANCE;
        return auraSandbox.rewriteUrl("https://graph.meta.ai/graphql", auraSandbox.getGraphqlHost());
    }

    public static final String getEctoUploadUrl() {
        AuraSandbox auraSandbox = AuraSandbox.INSTANCE;
        return auraSandbox.rewriteUrl(ECTO_UPLOAD_URL_PROD, auraSandbox.getHttpHost());
    }
}
