package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;

/* renamed from: X.Gni, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10010Gni {
    public Object A00;
    public boolean A01 = false;
    public final AbstractC9848Gir<?> A02;

    public final void A00(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, C10060Goh c10060Goh) throws IOException {
        this.A01 = true;
        if (abstractC9919GlE instanceof C9913Gl1) {
            C9913Gl1 c9913Gl1 = (C9913Gl1) abstractC9919GlE;
            if (c9913Gl1.A09) {
                Object obj = this.A00;
                c9913Gl1.A06 = obj == null ? null : String.valueOf(obj);
                c9913Gl1.A08 = true;
                return;
            }
        }
        InterfaceC10180Gqq interfaceC10180Gqq = c10060Goh.A01;
        if (interfaceC10180Gqq != null) {
            abstractC9919GlE.A0c(interfaceC10180Gqq);
            c10060Goh.A03.A0C(abstractC9919GlE, abstractC9842Gii, this.A00);
        }
    }

    public final boolean A01(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, C10060Goh c10060Goh) throws JsonGenerationException {
        Object obj = this.A00;
        if (obj == null) {
            return false;
        }
        if (!this.A01 && !c10060Goh.A04) {
            return false;
        }
        if ((abstractC9919GlE instanceof C9913Gl1) && ((C9913Gl1) abstractC9919GlE).A09) {
            String.valueOf(obj);
            throw new JsonGenerationException(abstractC9919GlE, "No native support for writing Object Ids");
        }
        c10060Goh.A03.A0C(abstractC9919GlE, abstractC9842Gii, obj);
        return true;
    }

    public C10010Gni(AbstractC9848Gir<?> abstractC9848Gir) {
        this.A02 = abstractC9848Gir;
    }
}
