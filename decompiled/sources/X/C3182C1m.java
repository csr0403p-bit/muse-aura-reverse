package X;

import java.io.IOException;
import java.io.Writer;

/* renamed from: X.C1m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3182C1m {
    public static final ThreadLocal<C3182C1m> A01 = new C3183C1n();
    public final StringBuilder A00 = BV4.A0p(20);

    public final void A00(Writer writer, Number number) throws IOException {
        int iByteValue;
        StringBuilder sb = this.A00;
        sb.delete(0, sb.length());
        if (number instanceof Float) {
            sb.append(number.floatValue());
        } else if (number instanceof Double) {
            sb.append(number.doubleValue());
        } else {
            if (number instanceof Integer) {
                iByteValue = number.intValue();
            } else if (number instanceof Long) {
                sb.append(number.longValue());
            } else if (number instanceof Short) {
                iByteValue = number.shortValue();
            } else {
                if (!(number instanceof Byte)) {
                    StringBuilder sb2 = new StringBuilder("Type ");
                    sb2.append(number.getClass());
                    sb2.append(" not supported");
                    throw new UnsupportedOperationException(sb2.toString());
                }
                iByteValue = number.byteValue();
            }
            sb.append(iByteValue);
        }
        int length = sb.length();
        for (int i = 0; i < length; i++) {
            writer.write(sb.charAt(i));
        }
    }
}
