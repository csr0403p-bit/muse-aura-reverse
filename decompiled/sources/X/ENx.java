package X;

/* loaded from: classes5.dex */
public abstract class ENx {
    public static final EO0 A00(String str, String str2, String str3, String str4, EP0 ep0) {
        String strA0M = FGI.A0M("content://", str);
        return new EO0(C79.A0C, strA0M, str2, str4, new C6661ENm(strA0M, str3), new ENu(ep0));
    }

    public static final EO0 A01(String str, String str2, String str3, EP0 ep0) {
        String strA0M = FGI.A0M("content://", str2);
        return new EO0(C79.A0K, strA0M, str, str3, new Dt3(strA0M, 1), new EO1(ep0));
    }

    public static final EO0 A02(String str, EP0 ep0) {
        String strA0U = FGI.A0U("content://", str, ".provider.AccessLibraryContentProvider");
        return new EO0(C79.A01, strA0U, str, null, new Dt3(strA0U, 0), new ENv(ep0));
    }
}
