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
public final class DocxDataPathHandler implements C6x2 {
    public final File file;

    public DocxDataPathHandler(File file) {
        C7384Etj.A0Y(file, 0);
        this.file = file;
    }

    @Override // X.C6x2
    public WebResourceResponse handle(String str) {
        if (!DocxWebViewerKt.DOCX_VIEWER_DATA_FILE_NAME.equals(C6tn.A01(str))) {
            return null;
        }
        try {
            return new WebResourceResponse("application/vnd.openxmlformats-officedocument.wordprocessingml.document", null, 200, "OK", AnonymousClass006.A10(CachingHatchHttpClientKt.CACHE_CONTROL_HEADER, "no-store"), new FileInputStream(this.file));
        } catch (FileNotFoundException e) {
            CFK.A06(DocxWebViewerKt.TAG, FGI.A0M("Staged document is gone: ", e.getMessage()));
            return DocxWebViewerKt.docxEmptyResponse(404, "Not Found");
        }
    }
}
