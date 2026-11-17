package com.facebook.aura.file.utils;

import X.C3cH;
import X.C60O;
import X.C60S;
import X.FGI;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.login.nativeflow.NativeLoginCheckpointContinuationKt;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class HtmlPreviewIsolationKt {
    public static final Set<String> ASSET_ROOTS;
    public static final int HTTP_FORBIDDEN = 403;
    public static final Set<String> LOCAL_SCHEMES;
    public static final Set<String> MEDIA_EXTENSIONS;
    public static final String PREVIEW_ISOLATION_META;
    public static final String VIEWER_CONNECT_SOURCE = "https://external.xx.fbcdn.net/maps/";
    public static final List<String> VIEWER_FRAME_SOURCES;
    public static final String VIEWER_ISOLATION_META;

    static {
        List<String> listAsList = Arrays.asList("https://www.facebook.com/plugins/", "https://www.instagram.com/p/", "https://www.instagram.com/reel/", "https://www.youtube.com/embed/", "https://www.youtube-nocookie.com/embed/", "https://player.vimeo.com/video/", "https://docs.google.com/document/d/", "https://docs.google.com/spreadsheets/d/", "https://docs.google.com/presentation/d/", "https://drive.google.com/file/d/", "https://open.spotify.com/embed/", "https://www.openstreetmap.org/export/embed.html");
        VIEWER_FRAME_SOURCES = listAsList;
        PREVIEW_ISOLATION_META = isolationMeta("'none'", "'none'");
        VIEWER_ISOLATION_META = isolationMeta(C3cH.A0e(InviteCodeScratcherKt.CODE_SEPARATOR, listAsList), VIEWER_CONNECT_SOURCE);
        LOCAL_SCHEMES = C60O.A1A("data", NativeLoginCheckpointContinuationKt.BLOB_PARAM, "about");
        ASSET_ROOTS = C60O.A1A("skills", "templates", "workspace");
        MEDIA_EXTENSIONS = C60S.A02();
    }

    public static final String isolationMeta(String str, String str2) {
        return FGI.A0U("<meta http-equiv=\"Content-Security-Policy\" content=\"", FGI.A0h("default-src 'none'; script-src 'unsafe-inline' 'unsafe-eval' data: blob:; style-src 'unsafe-inline'; img-src hatch-asset: data: blob:; media-src hatch-asset: data: blob:; font-src data: blob:; connect-src ", str2, "; frame-src ", str, "; child-src 'none'; worker-src 'none'; object-src 'none'; form-action 'none'"), "\"><meta http-equiv=\"x-dns-prefetch-control\" content=\"off\">");
    }
}
