package X;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: X.GhC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9794GhC extends AbstractC9795GhD {
    public final void A03(AbstractC9919GlE abstractC9919GlE, Object obj) {
        if (this instanceof C9900Gkg) {
            throw C8j3.A18("Not implemented for ObjectReader");
        }
        C9899Gkf c9899Gkf = (C9899Gkf) this;
        AbstractC9910Gks abstractC9910Gks = C9899Gkf.A00;
        C9963Gma c9963Gma = c9899Gkf._serializationConfig;
        if (c9963Gma.A0E(EnumC9975Gmp.INDENT_OUTPUT) && abstractC9919GlE.A00 == null) {
            InterfaceC10049GoT interfaceC10049GoTA7r = c9963Gma._defaultPrettyPrinter;
            if (interfaceC10049GoTA7r instanceof InterfaceC10158GqR) {
                interfaceC10049GoTA7r = ((InterfaceC10158GqR) interfaceC10049GoTA7r).A7r();
            }
            abstractC9919GlE.A00 = interfaceC10049GoTA7r;
        }
        if (!c9963Gma.A0E(EnumC9975Gmp.CLOSE_CLOSEABLE) || !(obj instanceof Closeable)) {
            c9899Gkf.A05(c9963Gma).A0a(abstractC9919GlE, obj);
            if (c9963Gma.A0E(EnumC9975Gmp.FLUSH_AFTER_WRITE_VALUE)) {
                abstractC9919GlE.flush();
                return;
            }
            return;
        }
        Closeable closeable = (Closeable) obj;
        try {
            c9899Gkf.A05(c9963Gma).A0a(abstractC9919GlE, obj);
            if (c9963Gma.A0E(EnumC9975Gmp.FLUSH_AFTER_WRITE_VALUE)) {
                abstractC9919GlE.flush();
            }
            closeable.close();
        } catch (Exception e) {
            C10104GpS[] c10104GpSArr = AbstractC9855Gj3.A01;
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e2) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e2);
                }
            }
            if (e instanceof IOException) {
                throw e;
            }
            AbstractC9855Gj3.A0F(e);
            throw BV4.A0e(e);
        }
    }
}
