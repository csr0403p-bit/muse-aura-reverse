package X;

import com.fasterxml.jackson.core.JsonGenerationException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.Ghf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9809Ghf extends AbstractC9807GhW<C9809Ghf> implements Serializable {
    public static final long serialVersionUID = 1;
    public final Map<String, AbstractC9804GhQ> _children;

    public static final Map A00(AbstractC9842Gii abstractC9842Gii, C9809Ghf c9809Ghf) {
        if (abstractC9842Gii._config._datatypeFeatures.A00(EnumC9819GiD.WRITE_PROPERTIES_SORTED) && !c9809Ghf._children.isEmpty()) {
            Map<String, AbstractC9804GhQ> map = c9809Ghf._children;
            if (!(map instanceof TreeMap)) {
                return new TreeMap(map);
            }
        }
        return c9809Ghf._children;
    }

    @Override // X.InterfaceC9786Ggu
    public final void AcZ(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, AbstractC9996GnP abstractC9996GnP) throws JsonGenerationException {
        boolean z;
        boolean z2;
        if (abstractC9842Gii != null) {
            EnumC9975Gmp enumC9975Gmp = EnumC9975Gmp.WRITE_EMPTY_JSON_ARRAYS;
            C9963Gma c9963Gma = abstractC9842Gii._config;
            z = !c9963Gma.A0E(enumC9975Gmp);
            z2 = !c9963Gma._datatypeFeatures.A00(EnumC9819GiD.WRITE_NULL_PROPERTIES);
        } else {
            z = false;
            z2 = false;
        }
        C10091GpF c10091GpFA00 = AbstractC9996GnP.A00(abstractC9919GlE, EnumC9834GiY.START_OBJECT, abstractC9996GnP, this);
        if (z || z2) {
            A01(abstractC9919GlE, abstractC9842Gii, this, z, z2);
        } else {
            Iterator itA0n = AnonymousClass002.A0n(A00(abstractC9842Gii, this));
            while (itA0n.hasNext()) {
                Map.Entry entryA0l = C3cH.A0l(itA0n);
                AbstractC9787Ggw abstractC9787Ggw = (AbstractC9787Ggw) entryA0l.getValue();
                abstractC9919GlE.A0o(C60O.A0t(entryA0l));
                abstractC9787Ggw.AcY(abstractC9919GlE, abstractC9842Gii);
            }
        }
        abstractC9996GnP.A03(abstractC9919GlE, c10091GpFA00);
    }

    @Override // X.AbstractC9804GhQ
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C9809Ghf)) {
            return false;
        }
        return this._children.equals(((C9809Ghf) obj)._children);
    }

    @Override // X.AbstractC9941Glq
    public final int hashCode() {
        return this._children.hashCode();
    }

    public C9809Ghf(C9808GhY c9808GhY) {
        super(c9808GhY);
        this._children = C3cG.A0j();
    }

    public static final void A01(AbstractC9919GlE abstractC9919GlE, AbstractC9842Gii abstractC9842Gii, C9809Ghf c9809Ghf, boolean z, boolean z2) throws JsonGenerationException {
        Iterator itA0n = AnonymousClass002.A0n(A00(abstractC9842Gii, c9809Ghf));
        while (itA0n.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0n);
            AbstractC9804GhQ abstractC9804GhQ = (AbstractC9804GhQ) entryA0l.getValue();
            if (z && (abstractC9804GhQ instanceof C9805GhS)) {
                if (abstractC9804GhQ instanceof C9809Ghf ? ((C9809Ghf) abstractC9804GhQ)._children.isEmpty() : ((C9805GhS) abstractC9804GhQ)._children.isEmpty()) {
                }
            }
            if (!z2 || abstractC9804GhQ.A03() != C79.A0P) {
                abstractC9919GlE.A0o(C60O.A0t(entryA0l));
                abstractC9804GhQ.AcY(abstractC9919GlE, abstractC9842Gii);
            }
        }
    }
}
