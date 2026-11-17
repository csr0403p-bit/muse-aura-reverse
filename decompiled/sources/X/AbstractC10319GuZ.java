package X;

import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;

/* renamed from: X.GuZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10319GuZ {
    public static final String[] A0I;
    public static final String[] A0J = {"base", "basefont", "bgsound", NodeCommandFallbackWorker.KEY_COMMAND, "link"};
    public static final String[] A0L = {"noframes", "style"};
    public static final String[] A0K = {MetaAiAppBroadcastSender.EXTRA_BODY, "br", "html"};
    public static final String[] A00 = {MetaAiAppBroadcastSender.EXTRA_BODY, "br", "html"};
    public static final String[] A01 = {MetaAiAppBroadcastSender.EXTRA_BODY, "br", "head", "html"};
    public static final String[] A0C = {"base", "basefont", "bgsound", NodeCommandFallbackWorker.KEY_COMMAND, "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] A0B = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", HatchUrlSegments.THUMBNAIL_SIZE_PARAM, AuraDeeplinkRouteMapper.SECTION_PARAM, "summary", "ul"};
    public static final String[] A03 = {"h1", "h2", "h3", "h4", "h5", "h6"};
    public static final String[] A09 = {"address", "div", HatchUrlSegments.THUMBNAIL_SIZE_PARAM};
    public static final String[] A02 = {"dd", "dt"};
    public static final String[] A07 = {"applet", "marquee", "object"};
    public static final String[] A0A = {"param", PhotosSearchHandlerKt.PARAM_SOURCE, "track"};
    public static final String[] A08 = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] A05 = {"address", "article", "aside", "blockquote", BrowserOperationCatalogKt.BUTTON, "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", AuraDeeplinkRouteMapper.SECTION_PARAM, "summary", "ul"};
    public static final String[] A06 = {MetaAiAppBroadcastSender.EXTRA_BODY, "dd", "dt", "html", "li", "optgroup", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, HatchUrlSegments.THUMBNAIL_SIZE_PARAM, "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] A04 = {"a", CRD.__redex_internal_original_name, "big", AuraDeeplinkRouteMapper.CODE_PARAM, "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
    public static final String[] A0W = {"tbody", "tfoot", "thead"};
    public static final String[] A0Q = {"td", "th", "tr"};
    public static final String[] A0X = {"script", "style", "template"};
    public static final String[] A0G = {"td", "th"};
    public static final String[] A0E = {MetaAiAppBroadcastSender.EXTRA_BODY, "caption", "col", "colgroup", "html"};
    public static final String[] A0H = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] A0F = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] A0T = {MetaAiAppBroadcastSender.EXTRA_BODY, "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] A0V = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] A0S = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] A0R = {MetaAiAppBroadcastSender.EXTRA_BODY, "caption", "col", "colgroup", "html", "td", "th", "tr"};
    public static final String[] A0N = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
    public static final String[] A0M = {MetaAiAppBroadcastSender.EXTRA_BODY, "caption", "col", "colgroup", "html", "td", "th"};
    public static final String[] A0O = {"input", "keygen", "textarea"};
    public static final String[] A0P = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] A0U = {"tbody", "tfoot", "thead"};
    public static final String[] A0D = {MetaAiAppBroadcastSender.EXTRA_BODY, "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] A0Y = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] A0Z = {"caption", "colgroup", "tbody", "tfoot", "thead"};

    static {
        String[] strArr = new String[44];
        System.arraycopy(new String[]{"nobr", "ol", HatchUrlSegments.THUMBNAIL_SIZE_PARAM, "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"}, BV5.A1U(new String[]{CRD.__redex_internal_original_name, "big", "blockquote", MetaAiAppBroadcastSender.EXTRA_BODY, "br", "center", AuraDeeplinkRouteMapper.CODE_PARAM, "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta"}, strArr) ? 1 : 0, strArr, 27, 17);
        A0I = strArr;
    }
}
