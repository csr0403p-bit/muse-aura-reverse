package X;

import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;

/* renamed from: X.Gua, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10320Gua {
    public static final String[] A06;
    public static final String[] A04 = {"applet", "caption", "html", "marquee", "object", "select", "table", "td", "template", "th"};
    public static final String[] A03 = {"annotation-xml", "mi", "mn", "mo", "ms", "mtext"};
    public static final String[] A07 = {"desc", "foreignobject", "title"};
    public static final String[] A02 = {"ol", "ul"};
    public static final String[] A00 = {BrowserOperationCatalogKt.BUTTON};
    public static final String[] A08 = {"html", "table", "template"};
    public static final String[] A05 = {"optgroup", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION};
    public static final String[] A01 = {"dd", "dt", "li", "optgroup", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, HatchUrlSegments.THUMBNAIL_SIZE_PARAM, "rb", "rp", "rt", "rtc"};
    public static final String[] A09 = {"caption", "colgroup", "dd", "dt", "li", "optgroup", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, HatchUrlSegments.THUMBNAIL_SIZE_PARAM, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};

    static {
        String[] strArr = new String[83];
        System.arraycopy(new String[]{"address", "applet", "area", "article", "aside", "base", "basefont", "bgsound", "blockquote", MetaAiAppBroadcastSender.EXTRA_BODY, "br", BrowserOperationCatalogKt.BUTTON, "caption", "center", "col", "colgroup", "dd", "details", "dir", "div", "dl", "dt", "embed", "fieldset", "figcaption", "figure", "footer"}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"form", "frame", "frameset", "h1", "h2", "h3", "h4", "h5", "h6", "head", "header", "hgroup", "hr", "html", "iframe", "img", "input", "keygen", "li", "link", "listing", "main", "marquee", "menu", "meta", "nav", "noembed"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"noframes", "noscript", "object", "ol", HatchUrlSegments.THUMBNAIL_SIZE_PARAM, "param", "plaintext", "pre", "script", AuraDeeplinkRouteMapper.SEARCH_ROUTE, AuraDeeplinkRouteMapper.SECTION_PARAM, "select", PhotosSearchHandlerKt.PARAM_SOURCE, "style", "summary", "table", "tbody", "td", "template", "textarea", "tfoot", "th", "thead", "title", "tr", "track", "ul"}, 0, strArr, 54, 27);
        System.arraycopy(new String[]{"wbr", "xmp"}, 0, strArr, 81, 2);
        A06 = strArr;
    }
}
