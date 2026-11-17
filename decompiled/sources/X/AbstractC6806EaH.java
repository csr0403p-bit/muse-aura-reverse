package X;

import com.airbnb.lottie.parser.moshi.JsonDataException;
import com.airbnb.lottie.parser.moshi.JsonEncodingException;
import java.io.Closeable;
import java.util.Arrays;

/* renamed from: X.EaH, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC6806EaH implements Closeable {
    public static final String[] A04;
    public int A00;
    public int[] A02 = new int[32];
    public String[] A03 = new String[32];
    public int[] A01 = new int[32];

    public abstract double A09();

    public abstract int A0A();

    public abstract int A0B(C6823Eab c6823Eab);

    public abstract Integer A0C();

    public abstract String A0D();

    public abstract String A0E();

    public abstract void A0F();

    public abstract void A0G();

    public abstract void A0H();

    public abstract void A0I();

    public abstract void A0J();

    public abstract void A0K();

    public abstract boolean A0L();

    public abstract boolean A0M();

    static {
        String[] strArr = new String[128];
        A04 = strArr;
        int i = 0;
        do {
            strArr[i] = String.format("\\u%04x", Integer.valueOf(i));
            i++;
        } while (i <= 31);
        BV5.A1M(strArr);
    }

    public final String A06() {
        int i = this.A00;
        int[] iArr = this.A02;
        String[] strArr = this.A03;
        int[] iArr2 = this.A01;
        StringBuilder sbA0x = C60O.A0x("$");
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            if (i3 == 1 || i3 == 2) {
                sbA0x.append('[');
                sbA0x.append(iArr2[i2]);
                sbA0x.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sbA0x.append('.');
                String str = strArr[i2];
                if (str != null) {
                    sbA0x.append(str);
                }
            }
        }
        return sbA0x.toString();
    }

    public final void A07(int i) {
        int i2 = this.A00;
        int[] iArr = this.A02;
        int length = iArr.length;
        if (i2 == length) {
            if (i2 == 256) {
                throw new JsonDataException(FGI.A0M("Nesting too deep at ", A06()));
            }
            this.A02 = Arrays.copyOf(iArr, length * 2);
            String[] strArr = this.A03;
            this.A03 = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.A01;
            this.A01 = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.A02;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        iArr3[i3] = i;
    }

    public final void A08(String str) throws JsonEncodingException {
        throw new JsonEncodingException(FGI.A0U(str, " at path ", A06()));
    }
}
