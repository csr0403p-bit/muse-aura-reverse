package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import java.io.IOException;

/* renamed from: X.GpK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10096GpK extends AbstractC10177Gqm {
    public static final C10096GpK A00;
    public static final String A01;
    public static final long serialVersionUID = 1;
    public final int charsPerLevel;
    public final String eol;
    public final char[] indents;

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = PairsDiscretionDocument.TERMINATOR;
        }
        A01 = property;
        A00 = new C10096GpK(property);
    }

    public C10096GpK() {
        this(A01);
    }

    @Override // X.InterfaceC10163GqY
    public final void Aim(AbstractC9919GlE abstractC9919GlE, int i) throws IOException {
        abstractC9919GlE.A0q(this.eol);
        if (i <= 0) {
            return;
        }
        int length = i * this.charsPerLevel;
        while (true) {
            char[] cArr = this.indents;
            int length2 = cArr.length;
            if (length <= length2) {
                abstractC9919GlE.A0x(cArr, length);
                return;
            } else {
                abstractC9919GlE.A0x(cArr, length2);
                length -= this.indents.length;
            }
        }
    }

    @Override // X.InterfaceC10163GqY
    public final boolean isInline() {
        return false;
    }

    public C10096GpK(String str) {
        int length = "  ".length();
        this.charsPerLevel = length;
        this.indents = new char[length * 16];
        int i = 0;
        int i2 = 0;
        do {
            "  ".getChars(0, length, this.indents, i2);
            i2 += length;
            i++;
        } while (i < 16);
        this.eol = str;
    }
}
