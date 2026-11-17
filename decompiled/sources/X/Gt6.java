package X;

import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import com.facebook.aura.partners.voice.infra.VoiceCallActivityRepository;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class Gt6 implements Map.Entry<String, String>, Cloneable {
    public static final String[] A03;
    public static final Pattern A04;
    public static final Pattern A05;
    public String A00;
    public String A01;
    public Gt7 A02;

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                Gt6 gt6 = (Gt6) obj;
                if (!C6xC.A00(this.A00, gt6.A00) || !C6xC.A00(this.A01, gt6.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        String[] strArr = new String[30];
        System.arraycopy(new String[]{"sortable", "truespeed", "typemustmatch"}, BV5.A1U(new String[]{"allowfullscreen", "async", "autofocus", BrowserOperationCatalogKt.CHECKED, "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", VoiceCallActivityRepository.MIC_STATUS_MUTED, "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", "required", "reversed", "seamless", "selected"}, strArr) ? 1 : 0, strArr, 27, 3);
        A03 = strArr;
        A05 = Pattern.compile("[^-a-zA-Z0-9_:.]+");
        A04 = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]+");
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String getKey() {
        return this.A00;
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String getValue() {
        String str = this.A01;
        return str == null ? "" : str;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return BV7.A0D(this.A00, this.A01);
    }

    @Override // java.util.Map.Entry
    public final /* bridge */ /* synthetic */ String setValue(String str) {
        String str2;
        int iA06;
        String str3 = str;
        String strA08 = this.A01;
        Gt7 gt7 = this.A02;
        if (gt7 != null && (iA06 = gt7.A06((str2 = this.A00))) != -1) {
            strA08 = gt7.A08(str2);
            gt7.A01[iA06] = str3;
        }
        this.A01 = str3;
        return strA08 == null ? "" : strA08;
    }

    public static String A00(String str) {
        if (str.isEmpty()) {
            return "_";
        }
        int length = str.length();
        if (length != 0) {
            for (int i = 0; i < length; i++) {
                char cCharAt = str.charAt(i);
                if (cCharAt > 31) {
                    if (cCharAt >= '\u007f') {
                        if (cCharAt > '\u009f') {
                        }
                    } else if (cCharAt != ' ' && cCharAt != '\"' && cCharAt != '\'' && cCharAt != '/' && cCharAt != '=') {
                    }
                }
            }
            return str;
        }
        return A04.matcher(str).replaceAll("_");
    }

    public static void A01(String str, String str2, Hy9 hy9, C10532Hqa c10532Hqa) {
        hy9.A02(str);
        if (str2 != null) {
            if ((str2.isEmpty() || str2.equalsIgnoreCase(str)) && Arrays.binarySearch(A03, Gu9.A00(str)) >= 0) {
                return;
            }
            hy9.A02("=\"");
            HuP.A00(str2, hy9, c10532Hqa, 2);
            hy9.A01('\"');
        }
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw BV4.A0e(e);
        }
    }

    public final String toString() {
        StringBuilder sbA0t = AbstractC7609F5w.A0t();
        Hy9 hy9A00 = Hy9.A00(sbA0t);
        C10532Hqa c10532Hqa = new C10532Hqa();
        String str = this.A00;
        A01(A00(str), this.A01, hy9A00, c10532Hqa);
        return Gt5.A01(sbA0t);
    }
}
