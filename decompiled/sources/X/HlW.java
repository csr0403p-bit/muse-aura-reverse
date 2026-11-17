package X;

import com.instagram.common.bloks.lexer.ParsingException;

/* loaded from: classes6.dex */
public abstract class HlW {
    public static Integer A01(FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn) {
        return Integer.valueOf(A00(fdw, interfaceC10557Hsn, 0));
    }

    public static int A00(FDW fdw, InterfaceC10557Hsn interfaceC10557Hsn, int i) {
        try {
            return interfaceC10557Hsn.AOJ() ? HiY.A08(AbstractC7608F5v.A0o(fdw), i) : HiY.A08(AbstractC7608F5v.A0p(fdw), i);
        } catch (ParsingException unused) {
            FFI.A01(null, "Error parsing themed color", null);
            return i;
        }
    }
}
