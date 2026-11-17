package X;

/* loaded from: classes4.dex */
public abstract class AT8 {
    public static final AOW A00;
    public static final ARY A02;
    public static final ATA A04;
    public static final ATA A05;
    public static final AT9 A06;
    public static final AT9 A07;
    public static final AOW A01 = AOW.A00(Float.POSITIVE_INFINITY);
    public static final ARY A03 = new ARY(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);

    static {
        ATA ata = new ATA();
        ata.A00 = Float.POSITIVE_INFINITY;
        ata.A01 = Float.POSITIVE_INFINITY;
        ata.A02 = Float.POSITIVE_INFINITY;
        A05 = ata;
        AT9 at9 = new AT9();
        at9.A00 = Float.POSITIVE_INFINITY;
        at9.A01 = Float.POSITIVE_INFINITY;
        at9.A02 = Float.POSITIVE_INFINITY;
        at9.A03 = Float.POSITIVE_INFINITY;
        A07 = at9;
        A00 = AOW.A00(Float.NEGATIVE_INFINITY);
        A02 = new ARY(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        ATA ata2 = new ATA();
        ata2.A00 = Float.NEGATIVE_INFINITY;
        ata2.A01 = Float.NEGATIVE_INFINITY;
        ata2.A02 = Float.NEGATIVE_INFINITY;
        A04 = ata2;
        AT9 at92 = new AT9();
        at92.A00 = Float.NEGATIVE_INFINITY;
        at92.A01 = Float.NEGATIVE_INFINITY;
        at92.A02 = Float.NEGATIVE_INFINITY;
        at92.A03 = Float.NEGATIVE_INFINITY;
        A06 = at92;
    }

    public static final AT5 A00(float f) {
        return new AT5(AVd.A02, Float.valueOf(f), Float.valueOf(0.01f));
    }
}
