package X;

import java.util.Arrays;
import java.util.RandomAccess;

/* renamed from: X.GIm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9423GIm extends GI0 {
    public static final C9423GIm DEFAULT_INSTANCE;
    public static volatile GIZ PARSER = null;
    public static final GIr broadcastAction_converter_ = new C9427GIq();
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public C9543GNz billingResultDetails_;
    public int bitField0_;
    public int broadcastActionMemoizedSerializedSize;
    public boolean phoneskyHasRequiredPermission_;
    public int receiverEvent_;
    public boolean receiverRegisteredWithPermission_;
    public GNV registerFailure_;
    public String details_ = "";
    public GDX broadcastAction_ = GDW.A02;
    public InterfaceC9313GDp purchase_ = GDH.A02;

    static {
        C9423GIm c9423GIm = new C9423GIm();
        DEFAULT_INSTANCE = c9423GIm;
        GI0.A02(c9423GIm, C9423GIm.class);
    }

    public static void A0A(C9423GIm c9423GIm, G4i g4i) {
        c9423GIm.getClass();
        RandomAccess randomAccess = c9423GIm.broadcastAction_;
        boolean z = ((GDG) randomAccess).A00;
        RandomAccess randomAccess2 = randomAccess;
        if (!z) {
            GDW gdw = (GDW) randomAccess;
            int i2 = gdw.A00;
            int i3 = i2 * 2;
            if (i3 < i2) {
                throw BV4.A0P();
            }
            int[] iArrCopyOf = i3 == 0 ? GDW.A03 : Arrays.copyOf(gdw.A01, i3);
            int i4 = gdw.A00;
            GDW gdw2 = new GDW(true);
            gdw2.A01 = iArrCopyOf;
            gdw2.A00 = i4;
            c9423GIm.broadcastAction_ = gdw2;
            randomAccess2 = gdw2;
        }
        ((GDW) randomAccess2).A03(g4i.a);
    }
}
