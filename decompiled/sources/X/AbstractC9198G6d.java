package X;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.G6d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9198G6d extends C9202G6h {
    public final boolean makeHttpsAutoLinks;
    public final InterfaceC9244G7z markerProcessorFactory;
    public final G7Z sequentialParserManager;

    @Override // X.C9202G6h
    public Map<G72, G6J> createHtmlGeneratingProviders(C9211G6r c9211G6r, URI uri) {
        C7384Etj.A0Y(c9211G6r, 0);
        Map<G72, G6J> mapCreateHtmlGeneratingProviders = super.createHtmlGeneratingProviders(c9211G6r, uri);
        HxE[] hxEArr = {C3cG.A0r(AbstractC9212G6s.A05, new G6L(AbstractC9213G6t.A06)), C3cG.A0r(AbstractC9212G6s.A06, new G64()), C3cG.A0r(AbstractC9213G6t.A01, new G6O()), C3cG.A0r(AbstractC9205G6l.A05, new G6A()), C3cG.A0r(AbstractC9206G6m.A0A, new G67()), C3cG.A0r(AbstractC9213G6t.A04, new C10655I0z(this, 1)), C3cG.A0r(AbstractC9206G6m.A0L, new G6V()), C3cG.A0r(AbstractC9212G6s.A03, new G6K(true)), C3cG.A0r(AbstractC9212G6s.A01, new G6K(false))};
        HashMap mapA0v = BV4.A0v(AIW.A0H(9));
        AGH.A0G(mapA0v, hxEArr);
        return AGH.A02(mapCreateHtmlGeneratingProviders, mapA0v);
    }

    @Override // X.C9202G6h
    public C9207G6n createInlinesLexer() {
        return new C9207G6n(new C9203G6j());
    }

    @Override // X.C9202G6h
    public InterfaceC9244G7z getMarkerProcessorFactory() {
        return this.markerProcessorFactory;
    }

    public AbstractC9198G6d(boolean z, boolean z2, boolean z3) {
        super(z, z2);
        this.makeHttpsAutoLinks = z3;
        this.markerProcessorFactory = C9235G7q.A00;
        this.sequentialParserManager = new G8F();
    }

    @Override // X.C9202G6h
    public G7Z getSequentialParserManager() {
        throw F60.createAndThrow();
    }
}
