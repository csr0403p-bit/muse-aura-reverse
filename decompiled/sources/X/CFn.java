package X;

import java.io.IOException;
import java.io.Writer;

/* loaded from: classes5.dex */
public final class CFn implements InterfaceC3346CFr {
    public static CFn A00;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.CFr] */
    @Override // X.InterfaceC3346CFr
    public final void AA5(AbstractC3342CFm abstractC3342CFm, Writer writer) throws IOException {
        C83 c83 = new C83(writer);
        C3341CFl c3341CFl = (C3341CFl) abstractC3342CFm;
        int i = c3341CFl.A00;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                writer.write(38);
            }
            c83.write(c3341CFl.A0D(i2));
            Object objA0C = c3341CFl.A0C(i2);
            writer.write(61);
            if (objA0C != null) {
                if (objA0C instanceof String) {
                    c83.write((String) objA0C);
                } else if (objA0C instanceof Number) {
                    C3182C1m.A01.get().A00(c83, (Number) objA0C);
                } else {
                    if (!(objA0C instanceof AbstractC3342CFm)) {
                        throw C60O.A0i(FGI.A0h("The type of '", c3341CFl.A0D(i2), " is ", objA0C.getClass().toString(), " is not allowed"));
                    }
                    AbstractC3342CFm abstractC3342CFm2 = (AbstractC3342CFm) objA0C;
                    CFn cFn = this;
                    ?? r0 = abstractC3342CFm2.A02;
                    if (r0 != 0) {
                        cFn = r0;
                    }
                    cFn.AA5(abstractC3342CFm2, c83);
                }
            }
        }
    }
}
