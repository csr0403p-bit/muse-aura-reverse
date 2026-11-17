package com.facebook.aura.gateway.parser;

import X.A6B;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C06827l3;
import X.C06G;
import X.C0881AGi;
import X.C1Lu;
import X.C3cG;
import X.C7384Etj;
import X.C7BY;
import X.C8iC;
import X.G0U;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class HatchWidgetTokenParser {
    public static final String HATCH_WIDGET_TOKEN_PREFIX = "[[hatch_widget:";
    public static final String HATCH_WIDGET_TOKEN_SUFFIX = "]]";
    public static final HatchWidgetTokenParser INSTANCE = new HatchWidgetTokenParser();
    public static final C06827l3 HATCH_WIDGET_TOKEN_RE = C06827l3.A02("\\[\\[hatch_widget:([A-Za-z0-9._:-]+)\\]\\]");
    public static final C06827l3 TRAILING_SPACES_BEFORE_NEWLINE_RE = C06827l3.A02("[ \\t]+\\n");

    public interface ContentPart {
    }

    public final class TextPart extends C06G implements ContentPart {
        public final String text;

        public TextPart(String str) {
            C7384Etj.A0Y(str, 0);
            this.text = str;
        }

        public final TextPart copy(String str) {
            C7384Etj.A0Y(str, 0);
            return new TextPart(str);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof TextPart) && C7384Etj.areEqual(this.text, ((TextPart) obj).text));
        }

        public static /* synthetic */ TextPart copy$default(TextPart textPart, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = textPart.text;
            }
            C7384Etj.A0Y(str, 0);
            return new TextPart(str);
        }

        public final String component1() {
            return this.text;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    public final class WidgetTokenPart extends C06G implements ContentPart {
        public final List<String> widgetTokenIds;

        public WidgetTokenPart(List<String> list) {
            C7384Etj.A0Y(list, 0);
            this.widgetTokenIds = list;
        }

        public final WidgetTokenPart copy(List<String> list) {
            C7384Etj.A0Y(list, 0);
            return new WidgetTokenPart(list);
        }

        public boolean equals(Object obj) {
            return this == obj || ((obj instanceof WidgetTokenPart) && C7384Etj.areEqual(this.widgetTokenIds, ((WidgetTokenPart) obj).widgetTokenIds));
        }

        public static /* synthetic */ WidgetTokenPart copy$default(WidgetTokenPart widgetTokenPart, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = widgetTokenPart.widgetTokenIds;
            }
            C7384Etj.A0Y(list, 0);
            return new WidgetTokenPart(list);
        }

        public final List<String> component1() {
            return this.widgetTokenIds;
        }

        public final List<String> getWidgetTokenIds() {
            return this.widgetTokenIds;
        }

        public int hashCode() {
            return this.widgetTokenIds.hashCode();
        }

        public String toString() {
            return super.toString();
        }
    }

    /* renamed from: com.facebook.aura.gateway.parser.HatchWidgetTokenParser$extractTokenIds$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<C1Lu, String> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public final String invoke(C1Lu c1Lu) {
            String strA0l;
            C7384Etj.A0Y(c1Lu, 0);
            String str = (String) AbstractC0878AGe.A0A(1, c1Lu.AG1());
            if (str == null || (strA0l = AnonymousClass002.A0l(str)) == null || strA0l.length() <= 0) {
                return null;
            }
            return strA0l;
        }
    }

    public final String dropIncompleteTrailingToken(String str) {
        C7384Etj.A0Y(str, 0);
        int iA0C = C7BY.A0C(str, "[[", str.length() - 1, false);
        if (iA0C < 0) {
            return str;
        }
        String strSubstring = str.substring(iA0C);
        return (HATCH_WIDGET_TOKEN_PREFIX.startsWith(strSubstring) || (strSubstring.startsWith(HATCH_WIDGET_TOKEN_PREFIX) && !C7BY.A0q(strSubstring, HATCH_WIDGET_TOKEN_SUFFIX, false))) ? str.substring(0, iA0C) : str;
    }

    public final List<String> extractTokenIds(String str) {
        C7384Etj.A0Y(str, 0);
        if (!C7BY.A0q(str, HATCH_WIDGET_TOKEN_PREFIX, false)) {
            return C0881AGi.A00;
        }
        return A6B.A02(A6B.A04(AnonymousClass1.INSTANCE, C06827l3.A00(str, HATCH_WIDGET_TOKEN_RE)));
    }

    public final List<ContentPart> splitTextAtTokens(String str, boolean z) {
        TextPart textPart;
        String strA0l;
        C7384Etj.A0Y(str, 0);
        if (z) {
            str = dropIncompleteTrailingToken(str);
        }
        int i = 0;
        if (C7BY.A0q(str, HATCH_WIDGET_TOKEN_PREFIX, false)) {
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            C8iC c8iC = new C8iC(C06827l3.A00(str, HATCH_WIDGET_TOKEN_RE));
            while (c8iC.hasNext()) {
                C1Lu c1Lu = (C1Lu) c8iC.next();
                String str2 = (String) AbstractC0878AGe.A0A(1, c1Lu.AG1());
                if (str2 != null && (strA0l = AnonymousClass002.A0l(str2)) != null && strA0l.length() > 0) {
                    splitTextAtTokens$addTextPart(arrayListA0h, arrayListA0h2, str.substring(i, c1Lu.AJM().A00));
                    arrayListA0h2.add(strA0l);
                    i = c1Lu.AJM().A01 + 1;
                }
            }
            String strSubstring = str.substring(i);
            if (C7BY.A0j(stripTokens(strSubstring))) {
                splitTextAtTokens$flushWidgetTokens(arrayListA0h2, arrayListA0h);
            } else {
                splitTextAtTokens$addTextPart(arrayListA0h, arrayListA0h2, strSubstring);
            }
            if (!arrayListA0h.isEmpty()) {
                return arrayListA0h;
            }
            textPart = new TextPart(INSTANCE.stripTokens(str));
        } else {
            textPart = new TextPart(str);
        }
        return Collections.singletonList(textPart);
    }

    public final String stripTokens(String str) {
        C7384Etj.A0Y(str, 0);
        if (!C7BY.A0q(str, HATCH_WIDGET_TOKEN_PREFIX, false)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        int iA0B = 0;
        while (true) {
            if (iA0B >= length) {
                break;
            }
            int iA0B2 = C7BY.A0B(str, HATCH_WIDGET_TOKEN_PREFIX, iA0B, false);
            if (iA0B2 < 0) {
                sb.append((CharSequence) str, iA0B, length);
                break;
            }
            sb.append((CharSequence) str, iA0B, iA0B2);
            int i = iA0B2 + 15;
            iA0B = C7BY.A0B(str, HATCH_WIDGET_TOKEN_PREFIX, i, false);
            int iA0B3 = C7BY.A0B(str, HATCH_WIDGET_TOKEN_SUFFIX, i, false);
            if (iA0B3 < 0 || (iA0B >= 0 && iA0B3 >= iA0B)) {
                int iIndexAfterWidgetTokenId = indexAfterWidgetTokenId(str, i);
                if (iA0B < 0) {
                    iA0B = length;
                }
                sb.append((CharSequence) str, iIndexAfterWidgetTokenId, iA0B);
            } else {
                iA0B = iA0B3 + 2;
            }
        }
        return TRAILING_SPACES_BEFORE_NEWLINE_RE.A03(sb.toString(), PairsDiscretionDocument.TERMINATOR);
    }

    public static final void splitTextAtTokens$addTextPart(List<ContentPart> list, List<String> list2, String str) {
        String strA03 = TRAILING_SPACES_BEFORE_NEWLINE_RE.A03(INSTANCE.stripTokens(str), PairsDiscretionDocument.TERMINATOR);
        if (C7BY.A0j(strA03)) {
            return;
        }
        splitTextAtTokens$flushWidgetTokens(list2, list);
        list.add(new TextPart(strA03));
    }

    private final int indexAfterWidgetTokenId(String str, int i) {
        while (i < str.length() && isWidgetTokenIdChar(str.charAt(i))) {
            i++;
        }
        return i;
    }

    private final boolean isWidgetTokenIdChar(char c) {
        return Character.isLetterOrDigit(c) || c == '.' || c == '_' || c == ':' || c == '-';
    }

    public static final void splitTextAtTokens$flushWidgetTokens(List<String> list, List<ContentPart> list2) {
        if (list.isEmpty()) {
            return;
        }
        list2.add(new WidgetTokenPart(AbstractC0878AGe.A0X(list)));
        list.clear();
    }
}
