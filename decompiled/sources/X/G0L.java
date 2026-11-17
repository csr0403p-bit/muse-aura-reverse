package X;

/* loaded from: classes6.dex */
public final class G0L extends GF2 implements HrP {
    public static final int CALLING_PACKAGE_FIELD_NUMBER = 1;
    public static final G0L DEFAULT_INSTANCE;
    public static final int IS_IN_FOREGROUND_FIELD_NUMBER = 4;
    public static volatile G0P<G0L> PARSER = null;
    public static final int PERMISSION_TOKEN_FIELD_NUMBER = 3;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    public int bitField0_;
    public boolean isInForeground_;
    public int sdkVersion_;
    public String callingPackage_ = "";
    public String permissionToken_ = "";

    static {
        G0L g0l = new G0L();
        DEFAULT_INSTANCE = g0l;
        GF2.A02(g0l, G0L.class);
    }
}
