package X;

import com.instagram.common.bloks.lexer.ParsingException;

/* renamed from: X.FIh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC7869FIh {
    public static final FCR A00 = FCR.A00(C8631Fhi.A00(9));
    public static final FCR A01 = FCR.A00(C8631Fhi.A00(10));

    public static final FI4 A00(FDW fdw, boolean z) {
        FDW fdwA0C;
        try {
            FDW fdwA0C2 = fdw.A0C(38);
            if (fdwA0C2 == null || (fdwA0C = fdwA0C2.A0C(77)) == null) {
                return null;
            }
            return AbstractC7855FHr.A06(fdwA0C, z);
        } catch (ParsingException e) {
            FFI.A01(null, "Error parsing border widths", e);
            return null;
        }
    }
}
