package com.facebook.aura.file.view;

import X.AnonymousClass006;
import X.C6tn;
import X.C6x2;
import X.C7384Etj;
import X.CFK;
import X.FGI;
import android.webkit.WebResourceResponse;
import com.facebook.aura.network.transport.cache.CachingHatchHttpClientKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/* loaded from: classes3.dex */
public final class PptxDataPathHandler implements C6x2 {
    public final File file;

    public PptxDataPathHandler(File file) {
        C7384Etj.A0Y(file, 0);
        this.file = file;
    }

    @Override // X.C6x2
    public WebResourceResponse handle(String str) {
        if (!PptxViewerKt.PPTX_VIEWER_DATA_FILE_NAME.equals(C6tn.A01(str))) {
            return null;
        }
        try {
            return new WebResourceResponse(PptxViewerKt.PPTX_MIME_TYPE, null, 200, "OK", AnonymousClass006.A10(CachingHatchHttpClientKt.CACHE_CONTROL_HEADER, "no-store"), new FileInputStream(this.file));
        } catch (FileNotFoundException e) {
            CFK.A06(PptxViewerKt.TAG, FGI.A0M("Staged presentation is gone: ", e.getMessage()));
            return PptxViewerKt.emptyResponse(404, "Not Found");
        }
    }
}
