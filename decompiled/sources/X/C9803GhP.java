package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.GhP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9803GhP extends AbstractC9787Ggw {
    public AbstractC9842Gii A00;
    public final AbstractC9941Glq A01;

    @Override // X.InterfaceC9786Ggu
    public final void AcY(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii) throws JsonGenerationException {
        C9522GMp c9522GMp;
        Iterator<?> itA04;
        this.A00 = abstractC9842Gii;
        AbstractC9941Glq abstractC9941Glq = this.A01;
        if (abstractC9941Glq instanceof C9809Ghf) {
            abstractC9941Glq.A05();
            abstractC9919GlE.A0n(this);
            c9522GMp = new C9522GMp();
            itA04 = AnonymousClass002.A0n(((C9809Ghf) abstractC9941Glq)._children);
        } else {
            if (!(abstractC9941Glq instanceof C9805GhS)) {
                abstractC9941Glq.AcY(abstractC9919GlE, abstractC9842Gii);
                return;
            }
            abstractC9941Glq.A05();
            abstractC9919GlE.A0l(this);
            c9522GMp = new C9522GMp();
            itA04 = abstractC9941Glq.A04();
        }
        while (true) {
            if (itA04.hasNext()) {
                Object next = itA04.next();
                if (next instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) next;
                    abstractC9919GlE.A0o(C60O.A0t(entry));
                    next = entry.getValue();
                }
                AbstractC9804GhQ abstractC9804GhQ = (AbstractC9804GhQ) next;
                if (abstractC9804GhQ instanceof C9809Ghf) {
                    c9522GMp.A00(itA04);
                    itA04 = AnonymousClass002.A0n(((C9809Ghf) abstractC9804GhQ)._children);
                    abstractC9804GhQ.A05();
                    abstractC9919GlE.A0n(abstractC9804GhQ);
                } else if (abstractC9804GhQ instanceof C9805GhS) {
                    c9522GMp.A00(itA04);
                    itA04 = abstractC9804GhQ.A04();
                    abstractC9804GhQ.A05();
                    abstractC9919GlE.A0l(abstractC9804GhQ);
                } else {
                    boolean z = abstractC9804GhQ instanceof C9788Ggx;
                    AbstractC9842Gii abstractC9842Gii2 = this.A00;
                    if (z) {
                        try {
                            abstractC9804GhQ.AcY(abstractC9919GlE, abstractC9842Gii2);
                        } catch (IOException | RuntimeException e) {
                            abstractC9919GlE.A0s(String.format("[ERROR: (%s) %s]", C60Q.A0e(e), e.getMessage()));
                        }
                    } else {
                        abstractC9804GhQ.AcY(abstractC9919GlE, abstractC9842Gii2);
                    }
                }
            } else {
                if (((AbstractC10020Gns) (abstractC9919GlE instanceof C9913Gl1 ? ((C9913Gl1) abstractC9919GlE).A03 : ((AbstractC9932GlT) abstractC9919GlE).A02)).A02 == 1) {
                    abstractC9919GlE.A0P();
                } else {
                    abstractC9919GlE.A0Q();
                }
                int i = c9522GMp.A00;
                if (i == 0) {
                    return;
                }
                Iterator<?>[] itArr = c9522GMp.A01;
                int i2 = i - 1;
                c9522GMp.A00 = i2;
                itA04 = itArr[i2];
                if (itA04 == null) {
                    return;
                }
            }
        }
    }

    public C9803GhP(AbstractC9941Glq abstractC9941Glq) {
        this.A01 = abstractC9941Glq;
    }

    @Override // X.InterfaceC9786Ggu
    public final void AcZ(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP) throws JsonGenerationException {
        AcY(abstractC9919GlE, abstractC9842Gii);
    }
}
