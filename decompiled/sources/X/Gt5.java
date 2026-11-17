package X;

import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.aura.main.AuraDeeplinkHandlerActivity;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.Collector;

/* loaded from: classes6.dex */
public abstract class Gt5 {
    public static final String[] A04 = {"", InviteCodeScratcherKt.CODE_SEPARATOR, "  ", "   ", "    ", "     ", "      ", "       ", "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};
    public static final Pattern A01 = Pattern.compile("^/(?>(?>\\.\\.?/)+)");
    public static final Pattern A02 = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");
    public static final Pattern A00 = Pattern.compile("[\\x00-\\x1f]*");
    public static final C7318Ekj<StringBuilder> A03 = new C7318Ekj<>(new C8927Ftj(0));

    public static boolean A08(String str) {
        if (str != null && !str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!A07(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean A09(String str, String[] strArr) {
        if (strArr.length > 8) {
            return Arrays.binarySearch(strArr, str) >= 0;
        }
        for (String str2 : strArr) {
            if (!str.equals(str2)) {
            }
        }
    }

    public static Collector<CharSequence, ?, String> A02(final String str) {
        return Collector.of(new Supplier() { // from class: X.Gu8
            @Override // java.util.function.Supplier
            public final Object get() {
                String str2 = str;
                C7318Ekj<StringBuilder> c7318Ekj = Gt5.A03;
                return new C10280Gtk(str2);
            }
        }, new BiConsumer() { // from class: X.GuF
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((C10280Gtk) obj).A00(obj2);
            }
        }, new BinaryOperator() { // from class: X.Gtl
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                C10280Gtk c10280Gtk = (C10280Gtk) obj;
                C10280Gtk c10280Gtk2 = (C10280Gtk) obj2;
                String strA01 = Gt5.A01(c10280Gtk2.A00);
                c10280Gtk2.A00 = null;
                StringBuilder sb = c10280Gtk.A00;
                C10293Gtx.A00(sb);
                sb.append((Object) strA01);
                return c10280Gtk;
            }
        }, new C10651I0v(3), new Collector.Characteristics[0]);
    }

    public static boolean A05(char c) {
        return c >= 'a' ? c <= 'z' : c >= 'A' && c <= 'Z';
    }

    public static boolean A06(char c) {
        if (c < '0') {
            return false;
        }
        if (c > '9') {
            return c >= 'a' ? c <= 'f' : c >= 'A' && c <= 'F';
        }
        return true;
    }

    public static boolean A07(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/util/Iterator<*>;Ljava/lang/String;)Ljava/lang/String; */
    public static String A00(String str, Iterator it) {
        if (!it.hasNext()) {
            return "";
        }
        String string = it.next().toString();
        if (!it.hasNext()) {
            return string;
        }
        C10280Gtk c10280Gtk = new C10280Gtk(str);
        c10280Gtk.A00(string);
        while (it.hasNext()) {
            c10280Gtk.A00(it.next());
        }
        return A01(c10280Gtk.A00);
    }

    public static String A01(StringBuilder sb) {
        C10293Gtx.A00(sb);
        String string = sb.toString();
        if (sb.length() <= 8192) {
            sb.delete(0, sb.length());
            A03.A01(sb);
        }
        return string;
    }

    public static void A03(String str, StringBuilder sb, boolean z) {
        int length = str.length();
        int iCharCount = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt == 32 || iCodePointAt == 9 || iCodePointAt == 10 || iCodePointAt == 12 || iCodePointAt == 13 || iCodePointAt == 160) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (iCodePointAt != 8203 && iCodePointAt != 173) {
                sb.appendCodePoint(iCodePointAt);
                z2 = true;
                z3 = false;
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
    }

    public static void A04(URL url) {
        String protocol = url.getProtocol();
        if ((protocol.equalsIgnoreCase(AuraDeeplinkHandlerActivity.HTTP) || protocol.equalsIgnoreCase("https")) && url.getHost().isEmpty()) {
            throw new MalformedURLException("Invalid URL: host is missing");
        }
    }
}
