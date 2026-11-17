package X;

import java.io.IOException;
import java.io.Serializable;

/* renamed from: X.Go9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10033Go9 implements InterfaceC10049GoT, Serializable {
    public static final long serialVersionUID = 1;
    public String _rootValueSeparator = InterfaceC10049GoT.A00.toString();
    public C10055Goa _separators;

    public C10033Go9() {
        C10055Goa c10055Goa = InterfaceC10049GoT.A01;
        EnumC9660Gd0 enumC9660Gd0 = EnumC9660Gd0.NONE;
        if (c10055Goa.objectFieldValueSpacing != enumC9660Gd0) {
            String str = c10055Goa.rootSeparator;
            char c = c10055Goa.objectFieldValueSeparator;
            char c2 = c10055Goa.objectEntrySeparator;
            c10055Goa = new C10055Goa(enumC9660Gd0, c10055Goa.objectEntrySpacing, c10055Goa.arrayValueSpacing, str, c10055Goa.objectEmptySeparator, c10055Goa.arrayEmptySeparator, c, c2, c10055Goa.arrayValueSeparator);
        }
        this._separators = c10055Goa;
    }

    @Override // X.InterfaceC10049GoT
    public final void A53(AbstractC9919GlE abstractC9919GlE) {
    }

    @Override // X.InterfaceC10049GoT
    public final void A54(AbstractC9919GlE abstractC9919GlE) {
    }

    @Override // X.InterfaceC10049GoT
    public final void Aid(AbstractC9919GlE abstractC9919GlE) {
        abstractC9919GlE.A0U(this._separators.arrayValueSeparator);
    }

    @Override // X.InterfaceC10049GoT
    public final void Aii(AbstractC9919GlE abstractC9919GlE, int i) {
        abstractC9919GlE.A0U(']');
    }

    @Override // X.InterfaceC10049GoT
    public final void Aij(AbstractC9919GlE abstractC9919GlE, int i) {
        abstractC9919GlE.A0U('}');
    }

    @Override // X.InterfaceC10049GoT
    public final void Aip(AbstractC9919GlE abstractC9919GlE) {
        abstractC9919GlE.A0U(this._separators.objectEntrySeparator);
    }

    @Override // X.InterfaceC10049GoT
    public final void Aiq(AbstractC9919GlE abstractC9919GlE) {
        abstractC9919GlE.A0U(this._separators.objectFieldValueSeparator);
    }

    @Override // X.InterfaceC10049GoT
    public final void Aiu(AbstractC9919GlE abstractC9919GlE) throws IOException {
        String str = this._rootValueSeparator;
        if (str != null) {
            abstractC9919GlE.A0q(str);
        }
    }

    @Override // X.InterfaceC10049GoT
    public final void Aix(AbstractC9919GlE abstractC9919GlE) {
        abstractC9919GlE.A0U('[');
    }

    @Override // X.InterfaceC10049GoT
    public final void Aiy(AbstractC9919GlE abstractC9919GlE) {
        abstractC9919GlE.A0U('{');
    }
}
