package X;

import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;

/* renamed from: X.GoZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC10054GoZ {
    public static final Gn1 A00;
    public static final Gn1 A01;
    public static final Gn1 A02;
    public static final Gn1 A03;

    static {
        Gn1 gn1 = new Gn1("MIME", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=', 76, true);
        A00 = gn1;
        boolean z = gn1._writePadding;
        A01 = new Gn1(gn1._paddingReadBehaviour, gn1, "MIME-NO-LINEFEEDS", gn1._paddingChar, Integer.MAX_VALUE, z);
        A03 = new Gn1(gn1._paddingReadBehaviour, gn1, "PEM", '=', 64, true);
        StringBuilder sbA0x = C60O.A0x("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        sbA0x.setCharAt(sbA0x.indexOf("+"), '-');
        sbA0x.setCharAt(sbA0x.indexOf(CustomConnectorRegisterRepositoryKt.ROOT_PATH), '_');
        A02 = new Gn1("MODIFIED-FOR-URL", sbA0x.toString(), (char) 0, Integer.MAX_VALUE, false);
    }
}
