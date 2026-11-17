package com.facebook.aura.opengraph;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.BV4;
import X.C10571Hud;
import X.C3cG;
import X.C60N;
import X.C60O;
import X.C60P;
import X.C60Q;
import X.C7384Etj;
import X.C9tI;
import X.DCl;
import X.FGI;
import android.text.Html;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.commands.invite.InviteUpsellHandlerKt;
import com.facebook.aura.model.ExternalLinkPresentationJsonKt;
import com.facebook.aura.opengraph.HatchWebPageParseResult;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public abstract class HatchWebPageParserKt {
    public static final Set<String> ALLOWED_ATTRS;
    public static final String APPLE_TOUCH_ICON_REL = "apple-touch-icon";
    public static final String[] BODY_IMAGE_URL_ATTRS;
    public static final Pattern CHARSET_PATTERN;
    public static final String DATA_URI_PREFIX = "data:";
    public static final String DESCRIPTION = "description";
    public static final String DIMENSIONS_ATTR = "data-image-dimensions";
    public static final Pattern DIMENSIONS_PATTERN;
    public static final Set<String> FAVICON_RELS;
    public static final Pattern HEAD_PATTERN;
    public static final String HEIGHT_ATTR = "height";
    public static final String IMAGE = "image";
    public static final String[] IMAGE_PROPERTY_ORDER;
    public static final String IMAGE_SRC_REL = "image_src";
    public static final Pattern IMG_PATTERN;
    public static final Pattern KEY_VALUE_PATTERN;
    public static final Pattern LINK_PATTERN;
    public static final int MAX_BODY_IMAGE_CANDIDATES = 3;
    public static final Pattern META_PATTERN;
    public static final int MIN_BODY_IMAGE_PX = 200;
    public static final String OG_DESCRIPTION = "og:description";
    public static final String OG_IMAGE = "og:image";
    public static final String OG_SITE_NAME = "og:site_name";
    public static final String OG_THUMBNAIL = "og:thumbnail";
    public static final String OG_TITLE = "og:title";
    public static final String OG_URL = "og:url";
    public static final String THUMBNAIL = "thumbnail";
    public static final String TITLE = "title";
    public static final Pattern TITLE_PATTERN;
    public static final String TWITTER_DESCRIPTION = "twitter:description";
    public static final String TWITTER_IMAGE = "twitter:image";
    public static final String TWITTER_TITLE = "twitter:title";
    public static final String TWITTER_URL = "twitter:url";
    public static final String UTF_8 = "UTF-8";
    public static final String WIDTH_ATTR = "width";

    public static final String absoluteUrl(String str, String str2) {
        String strTrimOrNull;
        Object objA0s;
        if (str == null || (strTrimOrNull = trimOrNull(str)) == null) {
            return null;
        }
        if (AnonymousClass006.A1b(ExternalLinkPresentationJsonKt.HTTP_SCHEME_PREFIX, strTrimOrNull) || AnonymousClass006.A1b("https://", strTrimOrNull)) {
            return strTrimOrNull;
        }
        try {
            objA0s = new URI(str2).resolve(strTrimOrNull).toString();
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        return (String) (objA0s instanceof C10571Hud ? null : objA0s);
    }

    public static final String bestProperty(Map<String, String> map, String... strArr) {
        String strTrimOrNull;
        for (String str : strArr) {
            String strA0p = C60O.A0p(str, map);
            if (strA0p != null && (strTrimOrNull = trimOrNull(strA0p)) != null) {
                return strTrimOrNull;
            }
        }
        return null;
    }

    public static final String trimOrNull(String str) {
        String strA0l;
        if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
            return null;
        }
        return strA0l;
    }

    static {
        Pattern patternCompile = Pattern.compile("<head[^>]*>(.*)</head>", 34);
        C7384Etj.A0U(patternCompile);
        HEAD_PATTERN = patternCompile;
        Pattern patternCompile2 = Pattern.compile("<title[^>]*>(.*?)</title>", 34);
        C7384Etj.A0U(patternCompile2);
        TITLE_PATTERN = patternCompile2;
        Pattern patternCompile3 = Pattern.compile("<meta([^>]+?)/?>", 34);
        C7384Etj.A0U(patternCompile3);
        META_PATTERN = patternCompile3;
        Pattern patternCompile4 = Pattern.compile("<link([^>]+?)/?>", 34);
        C7384Etj.A0U(patternCompile4);
        LINK_PATTERN = patternCompile4;
        Pattern patternCompile5 = Pattern.compile("\\s*([^=\\s]+)\\s*=\\s*(?:\"([^\"]+)\"|\\'([^\\']+)\\'|([^\\s\"\\']+)\\s+)", 34);
        C7384Etj.A0U(patternCompile5);
        KEY_VALUE_PATTERN = patternCompile5;
        Pattern patternCompile6 = Pattern.compile("<img([^>]+?)/?>", 34);
        C7384Etj.A0U(patternCompile6);
        IMG_PATTERN = patternCompile6;
        Pattern patternCompile7 = Pattern.compile("(\\d+)\\s*[xX]\\s*(\\d+)");
        C7384Etj.A0U(patternCompile7);
        DIMENSIONS_PATTERN = patternCompile7;
        Pattern patternCompile8 = Pattern.compile("(?i)\\bcharset=\\s*\"?([^\\s;\"]*)", 2);
        C7384Etj.A0U(patternCompile8);
        CHARSET_PATTERN = patternCompile8;
        ALLOWED_ATTRS = BFI.A0H(new String[]{OG_TITLE, OG_DESCRIPTION, OG_SITE_NAME, OG_URL, OG_IMAGE, OG_THUMBNAIL, TWITTER_TITLE, TWITTER_DESCRIPTION, TWITTER_URL, TWITTER_IMAGE, "title", DESCRIPTION, "image", THUMBNAIL});
        IMAGE_PROPERTY_ORDER = new String[]{OG_IMAGE, TWITTER_IMAGE, "image", OG_THUMBNAIL, THUMBNAIL};
        FAVICON_RELS = C60O.A1A("icon", "shortcut icon", "apple-touch-icon-precomposed");
        BODY_IMAGE_URL_ATTRS = new String[]{"data-src", "data-image", InviteUpsellHandlerKt.SRC_PARAM};
    }

    public static final boolean clearsFloor(int i, int i2) {
        return i >= 200 && i2 >= 200;
    }

    public static final String declaredCharset(Map<String, String> map) {
        String strA0p;
        String strGroup;
        String strA0l;
        String strA0p2 = C60O.A0p("charset", map);
        if (strA0p2 != null && strA0p2.length() > 0) {
            String strA0l2 = AnonymousClass002.A0l(strA0p2);
            Locale locale = Locale.US;
            C7384Etj.A0V(locale);
            return strA0l2.toUpperCase(locale);
        }
        if ("Content-Type".equalsIgnoreCase(C60O.A0p("http-equiv", map)) && (strA0p = C60O.A0p("content", map)) != null && strA0p.length() > 0) {
            Matcher matcher = CHARSET_PATTERN.matcher(strA0p);
            if (matcher.find() && (strGroup = matcher.group(1)) != null && (strA0l = AnonymousClass002.A0l(strGroup)) != null) {
                Locale locale2 = Locale.US;
                C7384Etj.A0V(locale2);
                String upperCase = strA0l.toUpperCase(locale2);
                if (upperCase.length() > 0) {
                    return upperCase;
                }
            }
        }
        return null;
    }

    public static final Map<String, String> parseAttributes(String str) {
        String strA0l;
        if (str == null || str.length() == 0) {
            return AGH.A0E();
        }
        HashMap mapA0u = BV4.A0u();
        Matcher matcher = KEY_VALUE_PATTERN.matcher(FGI.A0M(str, InviteCodeScratcherKt.CODE_SEPARATOR));
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (strGroup != null && (strA0l = AnonymousClass002.A0l(strGroup)) != null) {
                String strA0g = C60Q.A0g(strA0l);
                String strGroup2 = matcher.group(2);
                if (strGroup2 == null && (strGroup2 = matcher.group(3)) == null) {
                    strGroup2 = matcher.group(4);
                }
                mapA0u.put(strA0g, strGroup2);
            }
        }
        return mapA0u;
    }

    public static final LinkTagUrls parseLinkTags(String str) {
        String strTrimOrNull;
        String strA0p;
        String strTrimOrNull2;
        Matcher matcher = LINK_PATTERN.matcher(str);
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (matcher.find()) {
            Map<String, String> attributes = parseAttributes(matcher.group(1));
            String strA0p2 = C60O.A0p("rel", attributes);
            if (strA0p2 != null && (strTrimOrNull = trimOrNull(C60Q.A0g(strA0p2))) != null && (strA0p = C60O.A0p("href", attributes)) != null && (strTrimOrNull2 = trimOrNull(strA0p)) != null) {
                if (strTrimOrNull.equals(APPLE_TOUCH_ICON_REL)) {
                    str2 = strTrimOrNull2;
                } else if (strTrimOrNull.equals(IMAGE_SRC_REL)) {
                    str4 = strTrimOrNull2;
                } else if (FAVICON_RELS.contains(strTrimOrNull)) {
                    str3 = strTrimOrNull2;
                }
            }
        }
        if (str2 == null) {
            str2 = str3;
        }
        return new LinkTagUrls(str2, str4);
    }

    public static /* synthetic */ HatchWebPageParseResult parseWebPage$default(String str, String str2, String str3, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        return parseWebPage(str, str2, str3);
    }

    public static /* synthetic */ HatchWebPageMetadata parseWebPageBytes$default(byte[] bArr, String str, String str2, int i, Object obj) {
        if ((i & 4) != 0) {
            str2 = null;
        }
        return parseWebPageBytes(bArr, str, str2);
    }

    public static final String titleTag(String str) {
        String strGroup;
        String string;
        Matcher matcher = TITLE_PATTERN.matcher(str);
        if (!matcher.find() || (strGroup = matcher.group(1)) == null || (string = Html.fromHtml(strGroup).toString()) == null) {
            return null;
        }
        return trimOrNull(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r4 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean isContentSized(java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
            java.lang.String r0 = "width"
            java.lang.String r0 = X.C60O.A0p(r0, r5)
            r4 = 0
            if (r0 == 0) goto L61
            java.lang.Integer r1 = toPositivePxOrNull(r0)
        Le:
            java.lang.String r0 = "height"
            java.lang.String r0 = X.C60O.A0p(r0, r5)
            if (r0 == 0) goto L1a
            java.lang.Integer r4 = toPositivePxOrNull(r0)
        L1a:
            if (r1 == 0) goto L2b
            if (r4 == 0) goto L2b
            int r3 = r1.intValue()
        L22:
            int r0 = r4.intValue()
            boolean r0 = clearsFloor(r3, r0)
            return r0
        L2b:
            java.lang.String r0 = "data-image-dimensions"
            java.lang.String r1 = X.C60O.A0p(r0, r5)
            r2 = 0
            if (r1 == 0) goto L63
            java.util.regex.Pattern r0 = com.facebook.aura.opengraph.HatchWebPageParserKt.DIMENSIONS_PATTERN
            java.util.regex.Matcher r1 = r0.matcher(r1)
            if (r1 == 0) goto L63
            boolean r0 = r1.find()
            if (r0 == 0) goto L63
            r0 = 1
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L63
            java.lang.Integer r0 = toPositivePxOrNull(r0)
            if (r0 == 0) goto L63
            int r3 = r0.intValue()
            r0 = 2
            java.lang.String r0 = r1.group(r0)
            if (r0 == 0) goto L63
            java.lang.Integer r4 = toPositivePxOrNull(r0)
            if (r4 == 0) goto L63
            goto L22
        L61:
            r1 = r4
            goto Le
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.opengraph.HatchWebPageParserKt.isContentSized(java.util.Map):boolean");
    }

    public static final List<String> orderedProperties(Map<String, String> map, String... strArr) {
        String strTrimOrNull;
        ArrayList arrayListA0h = C3cG.A0h();
        for (String str : strArr) {
            String strA0p = C60O.A0p(str, map);
            if (strA0p != null && (strTrimOrNull = trimOrNull(strA0p)) != null) {
                arrayListA0h.add(strTrimOrNull);
            }
        }
        return arrayListA0h;
    }

    public static final AHD<String> parseBodyImageCandidates(byte[] bArr, String str) {
        String strTrimOrNull;
        String strAbsoluteUrl;
        boolean zA1a = AnonymousClass002.A1a(bArr, str);
        Matcher matcher = IMG_PATTERN.matcher(new String(bArr, DCl.A00));
        ArrayList arrayListA0h = C3cG.A0h();
        while (matcher.find()) {
            Map<String, String> attributes = parseAttributes(matcher.group(zA1a ? 1 : 0));
            if (isContentSized(attributes)) {
                String[] strArr = BODY_IMAGE_URL_ATTRS;
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String strA0p = C60O.A0p(strArr[i], attributes);
                    if (strA0p == null || (strTrimOrNull = trimOrNull(strA0p)) == null) {
                        i++;
                    } else if (!AnonymousClass006.A1b(DATA_URI_PREFIX, strTrimOrNull) && (strAbsoluteUrl = absoluteUrl(strTrimOrNull, str)) != null) {
                        arrayListA0h.add(strAbsoluteUrl);
                    }
                }
            }
        }
        return AGI.A07(AbstractC0878AGe.A0a(AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayListA0h)), 3));
    }

    public static final HatchWebPageParseResult parseWebPage(String str, String str2, String str3) {
        String strDisplayHost;
        String strDeclaredCharset;
        String strA0p;
        boolean zA1Y = C60P.A1Y(str, str2);
        Matcher matcher = HEAD_PATTERN.matcher(str);
        if (matcher.find() && (str = matcher.group(zA1Y ? 1 : 0)) == null) {
            str = "";
        }
        HashMap mapA0u = BV4.A0u();
        Matcher matcher2 = META_PATTERN.matcher(str);
        while (matcher2.find()) {
            Map<String, String> attributes = parseAttributes(matcher2.group(zA1Y ? 1 : 0));
            if ((str3 == null || str3.length() == 0) && (strDeclaredCharset = declaredCharset(attributes)) != null && !UTF_8.equalsIgnoreCase(strDeclaredCharset)) {
                return new HatchWebPageParseResult.NeedsCharset(strDeclaredCharset);
            }
            String strA0p2 = C60O.A0p(C60N.A00(29), attributes);
            if ((strA0p2 != null && strA0p2.length() > 0) || (((strA0p2 = C60O.A0p("name", attributes)) != null && strA0p2.length() > 0) || ((strA0p2 = C60O.A0p("itemprop", attributes)) != null && strA0p2.length() > 0))) {
                if (ALLOWED_ATTRS.contains(strA0p2) && (strA0p = C60O.A0p("content", attributes)) != null) {
                    mapA0u.put(strA0p2, Html.fromHtml(strA0p).toString());
                }
            }
        }
        LinkTagUrls linkTags = parseLinkTags(str);
        String[] strArr = IMAGE_PROPERTY_ORDER;
        ArrayList arrayListA0P = AbstractC0878AGe.A0P(AbstractC0885AGm.A0z(linkTags.imageSrc), orderedProperties(mapA0u, (String[]) Arrays.copyOf(strArr, strArr.length)));
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = arrayListA0P.iterator();
        while (it.hasNext()) {
            String strAbsoluteUrl = absoluteUrl(AnonymousClass005.A0j(it), str2);
            if (strAbsoluteUrl != null) {
                arrayListA0h.add(strAbsoluteUrl);
            }
        }
        AHD ahdA07 = AGI.A07(AbstractC0878AGe.A0X(AbstractC0878AGe.A0f(arrayListA0h)));
        String strBestProperty = bestProperty(mapA0u, OG_TITLE, TWITTER_TITLE, "title");
        if (strBestProperty == null) {
            strBestProperty = titleTag(str);
        }
        String strBestProperty2 = bestProperty(mapA0u, OG_DESCRIPTION, TWITTER_DESCRIPTION, DESCRIPTION);
        String strA0h = BV4.A0h(OG_SITE_NAME, mapA0u);
        if (strA0h == null || (strDisplayHost = trimOrNull(strA0h)) == null) {
            strDisplayHost = HatchUrlDisplayKt.displayHost(str2);
        }
        String strBestProperty3 = bestProperty(mapA0u, OG_URL, TWITTER_URL);
        String strAbsoluteUrl2 = absoluteUrl(linkTags.favicon, str2);
        if (strAbsoluteUrl2 == null) {
            strAbsoluteUrl2 = HatchUrlDisplayKt.faviconUri(str2);
        }
        return new HatchWebPageParseResult.Parsed(new HatchWebPageMetadata(strBestProperty, strBestProperty2, strDisplayHost, strBestProperty3, ahdA07, strAbsoluteUrl2));
    }

    public static final HatchWebPageMetadata parseWebPageBytes(byte[] bArr, String str, String str2) {
        Charset charsetOrNull;
        HatchWebPageParseResult.Parsed parsed;
        HatchWebPageMetadata hatchWebPageMetadata;
        AnonymousClass003.A0u(bArr, str);
        if (str2 == null || (charsetOrNull = toCharsetOrNull(str2)) == null) {
            charsetOrNull = DCl.A05;
        }
        HatchWebPageParseResult webPage = parseWebPage(new String(bArr, charsetOrNull), str, str2);
        if (webPage instanceof HatchWebPageParseResult.Parsed) {
            return ((HatchWebPageParseResult.Parsed) webPage).metadata;
        }
        if (!(webPage instanceof HatchWebPageParseResult.NeedsCharset)) {
            throw C3cG.A0q();
        }
        HatchWebPageParseResult.NeedsCharset needsCharset = (HatchWebPageParseResult.NeedsCharset) webPage;
        Charset charsetOrNull2 = toCharsetOrNull(needsCharset.charset);
        if (charsetOrNull2 != null) {
            HatchWebPageParseResult webPage2 = parseWebPage(new String(bArr, charsetOrNull2), str, needsCharset.charset);
            if ((webPage2 instanceof HatchWebPageParseResult.Parsed) && (parsed = (HatchWebPageParseResult.Parsed) webPage2) != null && (hatchWebPageMetadata = parsed.metadata) != null) {
                return hatchWebPageMetadata;
            }
        }
        return HatchWebPageMetadata.EMPTY;
    }

    public static final Charset toCharsetOrNull(String str) {
        Object objA0s;
        try {
            objA0s = Charset.forName(str);
        } catch (Throwable th) {
            objA0s = C3cG.A0s(th);
        }
        if (objA0s instanceof C10571Hud) {
            objA0s = null;
        }
        return (Charset) objA0s;
    }

    public static final Integer toPositivePxOrNull(String str) {
        Integer numA0r = C9tI.A0r(str);
        if (numA0r == null || numA0r.intValue() <= 0) {
            return null;
        }
        return numA0r;
    }
}
