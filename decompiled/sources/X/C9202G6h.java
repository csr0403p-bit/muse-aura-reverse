package X;

import com.facebook.aura.wearablebroadcast.MetaAiAppBroadcastSender;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.G6h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C9202G6h {
    public final boolean absolutizeAnchorLinks;
    public final InterfaceC9244G7z markerProcessorFactory;
    public final G7Z sequentialParserManager;
    public final boolean useSafeLinks;

    public C9202G6h() {
        this(true, false);
    }

    public Map<G72, G6J> createHtmlGeneratingProviders(C9211G6r c9211G6r, URI uri) {
        C7384Etj.A0Y(c9211G6r, 0);
        HxE[] hxEArr = new HxE[34];
        HxE hxEA00 = A00(AbstractC9206G6m.A0M, MetaAiAppBroadcastSender.EXTRA_BODY);
        HxE hxEA0r = C3cG.A0r(AbstractC9206G6m.A0D, new G6E());
        HxE hxEA0r2 = C3cG.A0r(AbstractC9205G6l.A0M, new C10654I0y(0));
        HxE hxEA002 = A00(AbstractC9206G6m.A07, "blockquote");
        HxE hxEA0r3 = C3cG.A0r(AbstractC9206G6m.A0N, new C9195G6a());
        HxE hxEA003 = A00(AbstractC9206G6m.A0T, "ul");
        HxE hxEA0r4 = C3cG.A0r(AbstractC9206G6m.A0L, new G6U());
        HxE hxEA0r5 = C3cG.A0r(AbstractC9205G6l.A0Y, new G6O());
        HxE hxEA004 = A00(AbstractC9206G6m.A0P, "h1");
        HxE hxEA005 = A00(AbstractC9206G6m.A0Q, "h2");
        HxE hxEA0r6 = C3cG.A0r(AbstractC9205G6l.A00, new G6O());
        HxE hxEA006 = A00(AbstractC9206G6m.A00, "h1");
        HxE hxEA007 = A00(AbstractC9206G6m.A01, "h2");
        HxE hxEA008 = A00(AbstractC9206G6m.A02, "h3");
        HxE hxEA009 = A00(AbstractC9206G6m.A03, "h4");
        HxE hxEA0010 = A00(AbstractC9206G6m.A04, "h5");
        HxE hxEA0011 = A00(AbstractC9206G6m.A05, "h6");
        HxE hxEA0r7 = C3cG.A0r(AbstractC9206G6m.A06, new C10655I0z(this, 0));
        HxE hxEA0r8 = C3cG.A0r(AbstractC9206G6m.A0I, new G6N("", 0, 0));
        HxE hxEA0r9 = C3cG.A0r(AbstractC9206G6m.A0J, new G6N("", 0, 0));
        HxE hxEA0r10 = C3cG.A0r(AbstractC9206G6m.A0K, new G6N("", 0, 0));
        G72 g72 = AbstractC9206G6m.A0F;
        boolean z = this.absolutizeAnchorLinks;
        AbstractC9200G6f c9197G6c = new C9197G6c(uri, z);
        boolean z2 = this.useSafeLinks;
        if (z2) {
            c9197G6c = new C9210G6q(c9197G6c.A00, c9197G6c, c9197G6c.A01);
        }
        HxE hxEA0r11 = C3cG.A0r(g72, c9197G6c);
        G72 g722 = AbstractC9206G6m.A0C;
        AbstractC9200G6f c9199G6e = new C9199G6e(uri, c9211G6r, z);
        if (z2) {
            c9199G6e = new C9210G6q(c9199G6e.A00, c9199G6e, c9199G6e.A01);
        }
        HxE hxEA0r12 = C3cG.A0r(g722, c9199G6e);
        G72 g723 = AbstractC9206G6m.A0R;
        AbstractC9200G6f c9199G6e2 = new C9199G6e(uri, c9211G6r, z);
        if (z2) {
            c9199G6e2 = new C9210G6q(c9199G6e2.A00, c9199G6e2, c9199G6e2.A01);
        }
        HxE hxEA0r13 = C3cG.A0r(g723, c9199G6e2);
        G72 g724 = AbstractC9206G6m.A0E;
        AbstractC9200G6f c9201G6g = new C9201G6g(uri, c9211G6r);
        if (z2) {
            c9201G6g = new C9210G6q(c9201G6g.A00, c9201G6g, c9201G6g.A01);
        }
        System.arraycopy(new HxE[]{hxEA00, hxEA0r, hxEA0r2, hxEA002, hxEA0r3, hxEA003, hxEA0r4, hxEA0r5, hxEA004, hxEA005, hxEA0r6, hxEA006, hxEA007, hxEA008, hxEA009, hxEA0010, hxEA0011, hxEA0r7, hxEA0r8, hxEA0r9, hxEA0r10, hxEA0r11, hxEA0r12, hxEA0r13, C3cG.A0r(g724, c9201G6g), C3cG.A0r(AbstractC9206G6m.A0G, new C10654I0y(1)), C3cG.A0r(AbstractC9206G6m.A09, new G6D())}, 0, hxEArr, 0, 27);
        System.arraycopy(new HxE[]{C3cG.A0r(AbstractC9206G6m.A08, new C10654I0y(2)), C3cG.A0r(AbstractC9205G6l.A0K, new C10654I0y(3)), C3cG.A0r(AbstractC9205G6l.A0J, new C10654I0y(4)), C3cG.A0r(AbstractC9206G6m.A0O, new G6P()), C3cG.A0r(AbstractC9206G6m.A0B, new G6M("em", 1, -1)), C3cG.A0r(AbstractC9206G6m.A0S, new G6M("strong", 2, -2)), C3cG.A0r(AbstractC9206G6m.A0A, new G6F())}, 0, hxEArr, 27, 7);
        HashMap mapA0v = BV4.A0v(AIW.A0H(34));
        AGH.A0G(mapA0v, hxEArr);
        return mapA0v;
    }

    public static HxE A00(Object obj, String str) {
        return new HxE(obj, new G6W(str));
    }

    public C9207G6n createInlinesLexer() {
        return new C9207G6n(new C9204G6k());
    }

    public final boolean getAbsolutizeAnchorLinks() {
        return this.absolutizeAnchorLinks;
    }

    public InterfaceC9244G7z getMarkerProcessorFactory() {
        return this.markerProcessorFactory;
    }

    public G7Z getSequentialParserManager() {
        return this.sequentialParserManager;
    }

    public final boolean getUseSafeLinks() {
        return this.useSafeLinks;
    }

    public C9202G6h(boolean z, boolean z2) {
        this.useSafeLinks = z;
        this.absolutizeAnchorLinks = z2;
        this.markerProcessorFactory = C9237G7s.A00;
        this.sequentialParserManager = new G8H();
    }

    public /* synthetic */ C9202G6h(boolean z, boolean z2, int i, C06H c06h) {
        this((i & 1) != 0 ? true : z, AnonymousClass001.A1Q(i, z2));
    }
}
