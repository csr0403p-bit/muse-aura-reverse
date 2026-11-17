package X;

import java.util.Map;

/* loaded from: classes5.dex */
public abstract class DDU {
    public static final DDU DEFAULT_FACTORY;
    public static DDU defaultFactory;
    public static DDU vodDefaultFactory;

    public static final CXK A00(CXB cxb, C3159C0h c3159C0h, String str) {
        AnonymousClass003.A0v(str, c3159C0h);
        return defaultFactory.createInstance(str, cxb, null, 8000, 8000, c3159C0h);
    }

    public static final InterfaceC4891DDk createHttpDataSource(String str, CXB cxb, C3159C0h c3159C0h, int i) {
        AnonymousClass003.A0v(str, c3159C0h);
        return defaultFactory.createInstance(str, cxb, null, 8000, i, c3159C0h);
    }

    public static final CXK createVodHttpDataSource(String str, CXO cxo, int i, int i2, C3159C0h c3159C0h) {
        AnonymousClass003.A0u(str, cxo);
        C7384Etj.A0Y(c3159C0h, 4);
        return vodDefaultFactory.createInstance(str, null, cxo, i, i2, c3159C0h);
    }

    public static final void setDefault(DDU ddu) {
        C7384Etj.A0Y(ddu, 0);
        defaultFactory = ddu;
    }

    public static final void setVodDefault(DDU ddu) {
        C7384Etj.A0Y(ddu, 0);
        vodDefaultFactory = ddu;
    }

    public abstract CXK createInstance(String str, CXB cxb, CXO cxo, int i, int i2, C3159C0h c3159C0h);

    public abstract Map<String, String> getBugReportFiles(String str);

    public abstract String getFactoryName();

    static {
        CXI cxi = new CXI();
        DEFAULT_FACTORY = cxi;
        defaultFactory = cxi;
        vodDefaultFactory = cxi;
    }

    public static final DDU getDefault() {
        return defaultFactory;
    }

    public static final DDU getVodDefault() {
        return vodDefaultFactory;
    }

    public static final void resetDefault() {
        defaultFactory = DEFAULT_FACTORY;
    }

    public static final void resetVodDefault() {
        vodDefaultFactory = DEFAULT_FACTORY;
    }

    public static final InterfaceC4891DDk createHttpDataSource(String str, CXB cxb, C3159C0h c3159C0h) {
        return A00(cxb, c3159C0h, str);
    }

    public static final InterfaceC4891DDk createHttpDataSource(String str, CXB cxb, CXO cxo, int i, int i2, C3159C0h c3159C0h) {
        AnonymousClass002.A1D(str, 0, c3159C0h);
        return defaultFactory.createInstance(str, cxb, cxo, i, i2, c3159C0h);
    }
}
