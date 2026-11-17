package com.facebook.aura.utils;

import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass007;
import X.C06827l3;
import X.C06847l8;
import X.C3cG;
import X.C3up;
import X.C60O;
import X.C60P;
import X.C7384Etj;
import X.C7AG;
import X.C7AH;
import X.C7BY;
import X.C8iN;
import X.EnumC06837l4;
import X.G0U;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchStringUtils {
    public static final int $stable = 0;
    public static final C06827l3 BARE_HATCH_URI;
    public static final C06827l3 BLOCKQUOTE;
    public static final C06827l3 BLOCK_MATH_BRACKET;
    public static final C06827l3 BLOCK_MATH_DOLLAR;
    public static final C06827l3 BULLET_LISTS;
    public static final C06827l3 CITATION_ID;
    public static final C06827l3 CODE_FENCE;
    public static final C06827l3 HEADINGS;
    public static final C06827l3 HTML_TAG;
    public static final C06827l3 IMAGE_LINK;
    public static final C06827l3 INLINE_CITATION_LINK;
    public static final C06827l3 INLINE_IMAGE_TOKEN;
    public static final C06827l3 INLINE_MATH_DOLLAR;
    public static final C06827l3 INLINE_MATH_PAREN;
    public static final C06827l3 LINK;
    public static final C06827l3 MERMAID_NODE_CARD_BLOCK;
    public static final C06827l3 NODE_CARD_LINK;
    public static final C06827l3 NUMBERED_LISTS;
    public static final C06827l3 UPLOAD_TOKEN;
    public static final C06827l3 WHITESPACE;
    public static final C06827l3 WIDGET_TOKEN;
    public static final C06827l3 WORKSPACE_PATH;
    public static final HatchStringUtils INSTANCE = new HatchStringUtils();
    public static final C06827l3 BOLD_ASTERISK = C06827l3.A02("\\*\\*(.+?)\\*\\*");
    public static final C06827l3 BOLD_UNDERSCORE = C06827l3.A02("__(.+?)__");
    public static final C06827l3 ITALIC_ASTERISK = C06827l3.A02("\\*(.+?)\\*");
    public static final C06827l3 ITALIC_UNDERSCORE = C06827l3.A02("_(.+?)_");
    public static final C06827l3 STRIKETHROUGH = C06827l3.A02("~~(.+?)~~");
    public static final C06827l3 CODE = C06827l3.A02("`(.+?)`");

    /* renamed from: com.facebook.aura.utils.HatchStringUtils$humanizeSlug$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0U<String, CharSequence> {
        public static final AnonymousClass2 INSTANCE = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // X.G0U
        public final CharSequence invoke(String str) {
            C7384Etj.A0Y(str, 0);
            if (str.length() <= 0) {
                return str;
            }
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append((Object) C3up.A00(str.charAt(0)));
            return AnonymousClass001.A0v(str.substring(1), sbA0w);
        }
    }

    public final String artifactDisplayName(String str) {
        C7384Etj.A0Y(str, 0);
        String strA0Y = C7BY.A0Y(str, ' ', '/');
        if (strA0Y.length() == 0) {
            return str;
        }
        List listA0g = C7BY.A0g(strA0Y, new char[]{'-', '_'});
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0g.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        return (arrayListA0h.size() <= 1 || !isGeneratedIdentifier((String) AbstractC0878AGe.A0H(arrayListA0h))) ? humanizeSlug(strA0Y) : humanizeSlug(AbstractC06907md.A01("-", AbstractC0878AGe.A0d(arrayListA0h, 1), null));
    }

    public final String extractImageReference(String str) {
        List<String> listAG1;
        String str2;
        List<String> listAG12;
        String str3;
        String strA0l;
        C7384Etj.A0Y(str, 0);
        C06847l8 c06847l8A01 = C06827l3.A01(str, IMAGE_LINK);
        if (c06847l8A01 != null && (listAG12 = c06847l8A01.AG1()) != null && (str3 = (String) AbstractC0878AGe.A0A(2, listAG12)) != null && (strA0l = AnonymousClass002.A0l(str3)) != null && strA0l.length() > 0) {
            return strA0l;
        }
        C06847l8 c06847l8A012 = C06827l3.A01(str, INLINE_IMAGE_TOKEN);
        if (c06847l8A012 != null && (listAG1 = c06847l8A012.AG1()) != null && (str2 = (String) AbstractC0878AGe.A0A(1, listAG1)) != null) {
            String strA0l2 = AnonymousClass002.A0l(str2);
            String strA0l3 = AnonymousClass002.A0l(C7BY.A0R(strA0l2, strA0l2, ' '));
            if (strA0l3.length() > 0) {
                return strA0l3;
            }
        }
        return null;
    }

    public final String humanizeSlug(String str) {
        C7384Etj.A0Y(str, 0);
        List listA0g = C7BY.A0g(str, new char[]{'-', '_'});
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA0g.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        String strA01 = AbstractC06907md.A01(InviteCodeScratcherKt.CODE_SEPARATOR, arrayListA0h, AnonymousClass2.INSTANCE);
        return !C7BY.A0j(strA01) ? strA01 : str;
    }

    public final String sanitizeForNotification(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass002.A0l(WHITESPACE.A03(NUMBERED_LISTS.A03(BULLET_LISTS.A03(BLOCKQUOTE.A03(HEADINGS.A03(HTML_TAG.A03(NODE_CARD_LINK.A03(WORKSPACE_PATH.A03(BARE_HATCH_URI.A03(INLINE_MATH_PAREN.A03(INLINE_MATH_DOLLAR.A03(CITATION_ID.A03(UPLOAD_TOKEN.A03(LINK.A03(INLINE_CITATION_LINK.A03(IMAGE_LINK.A03(CODE.A03(STRIKETHROUGH.A03(ITALIC_UNDERSCORE.A03(ITALIC_ASTERISK.A03(BOLD_UNDERSCORE.A03(BOLD_ASTERISK.A03(WIDGET_TOKEN.A03(BLOCK_MATH_BRACKET.A03(BLOCK_MATH_DOLLAR.A03(CODE_FENCE.A03(MERMAID_NODE_CARD_BLOCK.A03(str, ""), ""), "$1"), "$1"), ""), "$1"), "$1"), "$1"), "$1"), "$1"), "$1"), "$1"), "$1"), "$1"), ""), ""), "$1"), "$1"), ""), ""), ""), ""), ""), ""), ""), ""), InviteCodeScratcherKt.CODE_SEPARATOR));
    }

    public final String sanitizeForNotificationOrNull(String str) {
        C7384Etj.A0Y(str, 0);
        String strSanitizeForNotification = sanitizeForNotification(str);
        if (C7BY.A0j(strSanitizeForNotification)) {
            return null;
        }
        return strSanitizeForNotification;
    }

    public final String stripMarkdown(String str) {
        C7384Etj.A0Y(str, 0);
        return AnonymousClass002.A0l(LINK.A03(IMAGE_LINK.A03(NUMBERED_LISTS.A03(BULLET_LISTS.A03(HEADINGS.A03(CODE.A03(STRIKETHROUGH.A03(ITALIC_UNDERSCORE.A03(ITALIC_ASTERISK.A03(BOLD_UNDERSCORE.A03(BOLD_ASTERISK.A03(str, "$1"), "$1"), "$1"), "$1"), "$1"), "$1"), ""), ""), ""), "$1"), "$1"));
    }

    static {
        EnumC06837l4 enumC06837l4 = EnumC06837l4.A04;
        HEADINGS = new C06827l3("^#{1,6}\\s+", enumC06837l4);
        BULLET_LISTS = new C06827l3("^[*\\-+]\\s+", enumC06837l4);
        NUMBERED_LISTS = new C06827l3("^\\d+\\.\\s+", enumC06837l4);
        IMAGE_LINK = C06827l3.A02("!\\[(.+?)]\\((.+?)\\)");
        LINK = C06827l3.A02("\\[(.+?)]\\((.+?)\\)");
        INLINE_IMAGE_TOKEN = C06827l3.A02("\\[image:([^\\]]*)]");
        CODE_FENCE = C06827l3.A02("```[^\n`]*");
        HTML_TAG = C06827l3.A02("<[^>\n]+>");
        BLOCKQUOTE = new C06827l3("^\\s{0,3}>\\s?", enumC06837l4);
        UPLOAD_TOKEN = C06827l3.A02("\\[(?:image|file):[^\\]]*]");
        WHITESPACE = C06827l3.A02("\\s+");
        MERMAID_NODE_CARD_BLOCK = C06827l3.A02("```(?:mermaid|hatch-node-card)\\b[\\s\\S]*?```");
        BLOCK_MATH_DOLLAR = C06827l3.A02("\\$\\$([\\s\\S]+?)\\$\\$");
        BLOCK_MATH_BRACKET = C06827l3.A02("\\\\\\[([\\s\\S]+?)\\\\\\]");
        WIDGET_TOKEN = C06827l3.A02("\\[\\[hatch_widget:[A-Za-z0-9._:-]+]]");
        INLINE_CITATION_LINK = C06827l3.A02("\\^\\[(.+?)]\\((.+?)\\)");
        CITATION_ID = C06827l3.A02("[ \\t]?\\[(?=[a-zA-Z0-9]*\\d)[a-zA-Z0-9]{3,6}]");
        INLINE_MATH_DOLLAR = C06827l3.A02("(?<!\\$)\\$(?!\\$)([^$\\n]*[\\\\{}^_][^$\\n]*)\\$(?!\\$)");
        INLINE_MATH_PAREN = C06827l3.A02("\\\\\\((.+?)\\\\\\)");
        BARE_HATCH_URI = C06827l3.A02("\\b(?:sandbox|hatch-slides|slides|file|content)://\\S+");
        WORKSPACE_PATH = C06827l3.A02("\\bworkspace/\\S+");
        NODE_CARD_LINK = C06827l3.A02("\\bhatch://node-card\\?\\S*");
    }

    private final boolean isGeneratedIdentifier(String str) {
        int length = str.length();
        if (length < 6) {
            return false;
        }
        int i = 0;
        while (Character.isLetterOrDigit(str.charAt(i))) {
            i++;
            if (i >= length) {
                int i2 = 0;
                while (!Character.isLetter(str.charAt(i2))) {
                    i2++;
                    if (i2 >= length) {
                        return false;
                    }
                }
                int i3 = 0;
                while (!Character.isDigit(str.charAt(i3))) {
                    i3++;
                    if (i3 >= length) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final String feedDiscussionPreview(String str, String str2) {
        Object next;
        boolean zA1Y = C60P.A1Y(str, str2);
        if (!C7BY.A0j(str)) {
            return str;
        }
        C7AH c7ah = new C7AH(new C7AG(new HatchStringUtils$feedDiscussionPreview$1$1(INSTANCE), new C8iN(str2, zA1Y ? 1 : 0)));
        while (true) {
            if (!c7ah.hasNext()) {
                next = null;
                break;
            }
            next = c7ah.next();
            if (!C7BY.A0j((String) next)) {
                break;
            }
        }
        String str3 = (String) next;
        return str3 == null ? "" : str3;
    }
}
