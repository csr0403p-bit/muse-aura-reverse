package X;

import com.facebook.aura.commands.photos.PhotosSearchHandlerKt;
import com.facebook.aura.deeplink.AuraDeeplinkRouteMapper;
import com.facebook.aura.gateway.service.NodeCommandFallbackWorker;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.network.api.HatchUrlSegments;
import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* renamed from: X.GuX, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10317GuX {
    public static final C10317GuX A03;
    public ArrayList<Consumer<C10322Guc>> A00;
    public final Map<String, Map<String, C10322Guc>> A01;
    public final C10317GuX A02;

    public C10317GuX() {
        this(null, null);
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/lang/String;[Ljava/lang/String;Ljava/util/function/Consumer<LX/Guc;>;)LX/GuX; */
    private void A01(String str, Consumer consumer, String[] strArr) {
        for (String str2 : strArr) {
            C10322Guc c10322GucA00 = A00(str2, str);
            if (c10322GucA00 == null) {
                c10322GucA00 = new C10322Guc(str2, str2, str);
                c10322GucA00.A00 = 0;
                c10322GucA00.A00 = 1;
                A03(c10322GucA00);
            }
            consumer.accept(c10322GucA00);
        }
    }

    static {
        String[] strArr = new String[64];
        System.arraycopy(new String[]{"html", "head", MetaAiAppBroadcastSender.EXTRA_BODY, "frameset", "script", "noscript", "style", "meta", "link", "title", "frame", "noframes", AuraDeeplinkRouteMapper.SECTION_PARAM, "nav", "aside", "hgroup", "header", "footer", HatchUrlSegments.THUMBNAIL_SIZE_PARAM, "h1", "h2", "h3", "h4", "h5", "h6", "dialog", AuraDeeplinkRouteMapper.SEARCH_ROUTE}, 0, strArr, 0, 27);
        System.arraycopy(new String[]{"ul", "ol", "pre", "div", "blockquote", "hr", "address", "figure", "figcaption", "form", "fieldset", "dl", "dt", "dd", "li", "table", "caption", "thead", "tfoot", "tbody", "colgroup", "col", "tr", "th", "td", "details", "menu"}, 0, strArr, 27, 27);
        System.arraycopy(new String[]{"plaintext", "template", "article", "main", "center", "dir", "applet", "marquee", "listing", "#root"}, 0, strArr, 54, 10);
        String[] strArr2 = new String[72];
        System.arraycopy(new String[]{"object", "base", "font", "tt", "i", CRD.__redex_internal_original_name, "u", "big", "small", "em", "strong", "dfn", AuraDeeplinkRouteMapper.CODE_PARAM, "samp", "kbd", "var", "cite", "abbr", "time", "acronym", "mark", "ruby", "rt", "rp", "rtc", "a", "img"}, 0, strArr2, 0, 27);
        System.arraycopy(new String[]{"wbr", "map", AuraDeeplinkRouteMapper.QUERY_PARAM, "sub", "sup", "bdo", "iframe", "embed", "span", "input", "select", "textarea", "label", "audio", "video", "canvas", "optgroup", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, "legend", "datalist", "keygen", "output", "progress", "meter", "area", "param", PhotosSearchHandlerKt.PARAM_SOURCE}, 0, strArr2, 27, 27);
        System.arraycopy(new String[]{"track", "summary", NodeCommandFallbackWorker.KEY_COMMAND, "device", "basefont", "bgsound", "menuitem", "data", "bdi", "s", "strike", "nobr", "ins", "del", BrowserOperationCatalogKt.BUTTON, "picture", "slot", "rb"}, 0, strArr2, 54, 18);
        String[] strArr3 = {"title", HatchUrlSegments.THUMBNAIL_SIZE_PARAM, "h1", "h2", "h3", "h4", "h5", "h6", "pre", "address", "li", "th", "td", "script", "style"};
        String[] strArr4 = {"meta", "link", "base", "frame", "img", "br", "wbr", "embed", "hr", "input", "keygen", "col", NodeCommandFallbackWorker.KEY_COMMAND, "device", "area", "basefont", "bgsound", "menuitem", "param", PhotosSearchHandlerKt.PARAM_SOURCE, "track"};
        String[] strArr5 = GuP.A00;
        String[] strArr6 = {BrowserOperationCatalogKt.BUTTON, "input", "select", "textarea", HatchWidgetPresentationKt.HATCH_WIDGET_KIND_OPTION, "output", "progress", "meter", "img", "picture", "audio", "video", "canvas", "object", "embed", "iframe"};
        C10317GuX c10317GuX = new C10317GuX(null, null);
        c10317GuX.A01("http://www.w3.org/1999/xhtml", new C10636I0g(5), strArr);
        A02("http://www.w3.org/1999/xhtml", c10317GuX, strArr2, 10);
        A02("http://www.w3.org/1999/xhtml", c10317GuX, strArr3, 11);
        A02("http://www.w3.org/1999/xhtml", c10317GuX, strArr4, 12);
        A02("http://www.w3.org/1999/xhtml", c10317GuX, new String[]{"pre", "plaintext", "title", "textarea", "script"}, 13);
        A02("http://www.w3.org/1999/xhtml", c10317GuX, new String[]{"title", "textarea"}, 0);
        A02("http://www.w3.org/1999/xhtml", c10317GuX, new String[]{"iframe", "noembed", "noframes", "script", "style", "xmp"}, 1);
        A02("http://www.w3.org/1999/xhtml", c10317GuX, strArr5, 2);
        A02("http://www.w3.org/1999/xhtml", c10317GuX, strArr6, 3);
        c10317GuX.A01("http://www.w3.org/1998/Math/MathML", new C10636I0g(4), new String[]{"math"});
        A02("http://www.w3.org/1998/Math/MathML", c10317GuX, new String[]{"mi", "mo", "msup", "mn", "mtext"}, 6);
        c10317GuX.A01("http://www.w3.org/2000/svg", new C10636I0g(7), new String[]{"svg", "femerge", "femergenode"});
        A02("http://www.w3.org/2000/svg", c10317GuX, new String[]{"text"}, 8);
        A02("http://www.w3.org/2000/svg", c10317GuX, new String[]{"script"}, 9);
        A03 = c10317GuX;
    }

    public static void A02(String str, C10317GuX c10317GuX, String[] strArr, int i) {
        c10317GuX.A01(str, new C10636I0g(i), strArr);
    }

    private void A03(C10322Guc c10322Guc) {
        ArrayList<Consumer<C10322Guc>> arrayList = this.A00;
        if (arrayList != null) {
            Iterator<Consumer<C10322Guc>> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().accept(c10322Guc);
            }
        }
        c10322Guc.A02();
        this.A01.computeIfAbsent(c10322Guc.A02, new C10651I0v(6)).put(c10322Guc.A04, c10322Guc);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C10317GuX) {
            return C6xC.A00(this.A01, ((C10317GuX) obj).A01);
        }
        return false;
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    private final C10322Guc A00(String str, String str2) {
        C10322Guc c10322GucA00;
        C10322Guc c10322Guc;
        C10293Gtx.A00(str);
        C10293Gtx.A00(str2);
        Map<String, C10322Guc> map = this.A01.get(str2);
        if (map != null && (c10322Guc = map.get(str)) != null) {
            return c10322Guc;
        }
        C10317GuX c10317GuX = this.A02;
        if (c10317GuX == null || (c10322GucA00 = c10317GuX.A00(str, str2)) == null) {
            return null;
        }
        C10322Guc c10322GucClone = c10322GucA00.clone();
        A03(c10322GucClone);
        return c10322GucClone;
    }

    public final C10322Guc A04(String str, String str2, String str3, boolean z) {
        C10322Guc c10322Guc;
        C10293Gtx.A00(str);
        C10293Gtx.A00(str3);
        if (str2 == null) {
            str = str.trim();
        }
        C10293Gtx.A01(str);
        C10322Guc c10322GucA00 = A00(str, str3);
        if (c10322GucA00 == null) {
            if (str2 == null) {
                str2 = Gu9.A00(str).trim();
            }
            if (!z) {
                str = str2;
            }
            c10322GucA00 = A00(str2, str3);
            if (c10322GucA00 == null) {
                c10322Guc = new C10322Guc(str, str2, str3);
            } else if (z && !str.equals(str2)) {
                c10322Guc = c10322GucA00.clone();
                c10322Guc.A04 = str;
            }
            A03(c10322Guc);
            return c10322Guc;
        }
        return c10322GucA00;
    }

    /* JADX WARN: Incorrect types in method signature: (LX/GuX;Ljava/util/ArrayList<Ljava/util/function/Consumer<LX/Guc;>;>;)V */
    public C10317GuX(ArrayList arrayList, C10317GuX c10317GuX) {
        this.A01 = BV4.A0u();
        this.A02 = c10317GuX;
        this.A00 = arrayList;
    }
}
