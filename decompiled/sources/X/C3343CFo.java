package X;

import com.facebook.aura.ccv.nativeflow.ui.HatchCcvLoggingKt;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.CFo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3343CFo implements InterfaceC3346CFr {
    public static C3343CFo A00;
    public static final C3347CFs A01 = new C3347CFs();

    @Override // X.InterfaceC3346CFr
    public final void AA5(AbstractC3342CFm abstractC3342CFm, Writer writer) throws IOException {
        int i;
        C7384Etj.A0Y(writer, 0);
        C7384Etj.A0Y(abstractC3342CFm, 1);
        if (abstractC3342CFm instanceof C3341CFl) {
            writer.write(123);
            A02((C3341CFl) abstractC3342CFm, writer);
            i = 125;
        } else {
            writer.write(91);
            A01((C3340CFk) abstractC3342CFm, writer);
            i = 93;
        }
        writer.write(i);
    }

    public static final synchronized C3343CFo A00() {
        C3343CFo c3343CFo;
        synchronized (A01) {
            c3343CFo = A00;
            if (c3343CFo == null) {
                c3343CFo = new C3343CFo();
                A00 = c3343CFo;
            }
            C7384Etj.A0X(c3343CFo);
        }
        return c3343CFo;
    }

    private final void A01(C3340CFk c3340CFk, Writer writer) throws IOException {
        ArrayList<Object> arrayList = c3340CFk.A00;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                writer.write(44);
            }
            A04(writer, arrayList.get(i), null);
        }
    }

    private final void A02(C3341CFl c3341CFl, Writer writer) throws IOException {
        int i = c3341CFl.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                writer.write(44);
            }
            String strA0D = c3341CFl.A0D(i2);
            C7384Etj.A0U(strA0D);
            writer.write(34);
            int length = strA0D.length();
            for (int i3 = 0; i3 < length; i3++) {
                A03(writer, strA0D.charAt(i3));
            }
            writer.write(34);
            writer.write(58);
            A04(writer, c3341CFl.A0C(i2), strA0D);
        }
    }

    public static final void A03(Writer writer, char c) throws IOException {
        String str;
        if (c == '\f') {
            writer.write(92);
            c = 'f';
        } else if (c == '\r') {
            writer.write(92);
            c = 'r';
        } else if (c != '\"' && c != '\\') {
            switch (c) {
                case '\b':
                    writer.write(92);
                    c = 'b';
                    break;
                case '\t':
                    writer.write(92);
                    c = 't';
                    break;
                case '\n':
                    writer.write(92);
                    str = "n";
                    writer.write(str);
                    return;
                default:
                    if (c <= 31 || c == '\u2028' || c == '\u2029') {
                        str = String.format("\\u%04x", Arrays.copyOf(new Object[]{Integer.valueOf(c)}, 1));
                        writer.write(str);
                        return;
                    }
                    break;
            }
        } else {
            writer.write(92);
        }
        writer.write(c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.CFr] */
    private final void A04(Writer writer, Object obj, String str) throws IOException {
        String str2;
        if (obj == null) {
            str2 = HatchCcvLoggingKt.NO_POSTAL_FIELD;
        } else {
            if (obj instanceof String) {
                String str3 = (String) obj;
                writer.write(34);
                int length = str3.length();
                for (int i = 0; i < length; i++) {
                    A03(writer, str3.charAt(i));
                }
                writer.write(34);
                return;
            }
            if (obj instanceof Number) {
                C3182C1m.A01.get().A00(writer, (Number) obj);
                return;
            }
            if (!(obj instanceof Boolean)) {
                if (!(obj instanceof AbstractC3342CFm)) {
                    String strA0U = str != null ? FGI.A0U(" (found in key '", str, "')") : "";
                    Class<?> cls = obj.getClass();
                    StringBuilder sb = new StringBuilder("The type ");
                    sb.append(cls);
                    sb.append(" is not supported");
                    sb.append(strA0U);
                    throw new IllegalArgumentException(sb.toString());
                }
                AbstractC3342CFm abstractC3342CFm = (AbstractC3342CFm) obj;
                Object obj2 = abstractC3342CFm.A02;
                Object obj3 = this;
                if (obj2 != null) {
                    obj3 = obj2;
                }
                Class<?> cls2 = obj3.getClass();
                if (cls2.equals(C3343CFo.class)) {
                    ?? r0 = abstractC3342CFm.A02;
                    if (r0 != 0) {
                        this = r0;
                    }
                    this.AA5(abstractC3342CFm, writer);
                    return;
                }
                StringBuilder sb2 = new StringBuilder("Unsupported encoder=");
                sb2.append(cls2);
                sb2.append(", flags=");
                sb2.append(0);
                sb2.append(" combination");
                throw new IllegalStateException(sb2.toString());
            }
            str2 = ((Boolean) obj).booleanValue() ? "true" : "false";
        }
        writer.write(str2);
    }

    public final void A05(AbstractC3342CFm abstractC3342CFm, Writer writer) throws IOException {
        if (abstractC3342CFm instanceof C3341CFl) {
            A02((C3341CFl) abstractC3342CFm, writer);
        } else {
            A01((C3340CFk) abstractC3342CFm, writer);
        }
    }
}
