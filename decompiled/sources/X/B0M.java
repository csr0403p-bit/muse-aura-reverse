package X;

import android.text.Editable;
import android.text.Html;
import org.xml.sax.XMLReader;

/* loaded from: classes4.dex */
public final class B0M implements Html.TagHandler {
    @Override // android.text.Html.TagHandler
    public final void handleTag(boolean z, String str, Editable editable, XMLReader xMLReader) {
        if (xMLReader == null || editable == null || !z || !"ContentHandlerReplacementTag".equals(str)) {
            return;
        }
        xMLReader.setContentHandler(new B0L(editable, xMLReader.getContentHandler()));
    }
}
