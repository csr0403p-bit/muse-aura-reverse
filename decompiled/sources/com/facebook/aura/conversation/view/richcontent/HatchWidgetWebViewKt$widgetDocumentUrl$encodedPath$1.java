package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.C6tn;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.opengraph.HatchWebPageParserKt;

/* loaded from: classes3.dex */
public final class HatchWidgetWebViewKt$widgetDocumentUrl$encodedPath$1 extends AbstractC7559F3s implements G0U<String, CharSequence> {
    public static final HatchWidgetWebViewKt$widgetDocumentUrl$encodedPath$1 INSTANCE = new HatchWidgetWebViewKt$widgetDocumentUrl$encodedPath$1();

    public HatchWidgetWebViewKt$widgetDocumentUrl$encodedPath$1() {
        super(1);
    }

    @Override // X.G0U
    public final CharSequence invoke(String str) {
        C7384Etj.A0Y(str, 0);
        return C6tn.A06(str, HatchWebPageParserKt.UTF_8);
    }
}
