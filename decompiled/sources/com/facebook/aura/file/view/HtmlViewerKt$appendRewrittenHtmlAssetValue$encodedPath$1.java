package com.facebook.aura.file.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class HtmlViewerKt$appendRewrittenHtmlAssetValue$encodedPath$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final HtmlViewerKt$appendRewrittenHtmlAssetValue$encodedPath$1 INSTANCE = new HtmlViewerKt$appendRewrittenHtmlAssetValue$encodedPath$1();

    public HtmlViewerKt$appendRewrittenHtmlAssetValue$encodedPath$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        C7384Etj.A0Y(str, 0);
        String strEncode = Uri.encode(str);
        C7384Etj.A0U(strEncode);
        return strEncode;
    }
}
