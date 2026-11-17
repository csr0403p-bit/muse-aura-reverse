package X;

import android.util.Range;
import android.util.Size;

/* loaded from: classes5.dex */
public final class Bd3 implements InterfaceC2529BdA<BdF> {
    public final Range<Integer> A00;
    public final Size A01;
    public final C2507Bcd A02;
    public final AbstractC2509Bcf A03;
    public final BWz A04;
    public final AbstractC2440BbT A05;
    public final String A06;

    @Override // X.InterfaceC2529BdA
    public final /* bridge */ /* synthetic */ BdF get() {
        C2520Bcr c2520Bcr = (C2520Bcr) this.A03;
        int i = c2520Bcr.A04;
        Range<Integer> range = this.A00;
        Range<Integer> range2 = BmM.A0F;
        int iA05 = !C6xC.A00(range, range2) ? BV8.A05(range, i) : i;
        Integer numValueOf = Integer.valueOf(iA05);
        Integer numValueOf2 = Integer.valueOf(i);
        boolean zA00 = C6xC.A00(range, range2);
        Object obj = range;
        if (!zA00) {
            obj = "<UNSPECIFIED>";
        }
        AbstractC2875Bni.A01("VidEncVdPrflRslvr", String.format("Resolved frame rate %dfps [Video profile frame rate: %dfps, Expected operating range: %s]", numValueOf, numValueOf2, obj));
        AbstractC2875Bni.A01("VidEncVdPrflRslvr", FGI.A0I("Resolved VIDEO frame rate: ", iA05, "fps"));
        Range<Integer> range3 = ((Bd8) this.A05).A01;
        AbstractC2875Bni.A01("VidEncVdPrflRslvr", "Using resolved VIDEO bitrate from EncoderProfiles");
        int i2 = c2520Bcr.A01;
        int i3 = this.A02.A00;
        int i4 = c2520Bcr.A00;
        Size size = this.A01;
        int iA00 = Bd2.A00(range3, i2, i3, i4, iA05, i, size.getWidth(), c2520Bcr.A08, size.getHeight(), c2520Bcr.A06);
        int i5 = c2520Bcr.A07;
        String str = this.A06;
        Bd6 bd6A03 = Bd2.A03(str, i5);
        Bd6 bd6 = Bd6.A00;
        if (str == null) {
            throw BV4.A0a("Null mimeType");
        }
        BWz bWz = this.A04;
        if (bWz == null) {
            throw BV4.A0a("Null inputTimebase");
        }
        if ("".isEmpty()) {
            return new Bd7(size, bWz, bd6A03, str, i5, numValueOf.intValue(), iA00);
        }
        throw BV8.A0l("");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/BWz;LX/BbT;Landroid/util/Size;LX/Bcf;LX/Bcd;Landroid/util/Range<Ljava/lang/Integer;>;)V */
    public Bd3(Range range, Size size, C2507Bcd c2507Bcd, AbstractC2509Bcf abstractC2509Bcf, BWz bWz, AbstractC2440BbT abstractC2440BbT, String str) {
        this.A06 = str;
        this.A04 = bWz;
        this.A05 = abstractC2440BbT;
        this.A01 = size;
        this.A03 = abstractC2509Bcf;
        this.A02 = c2507Bcd;
        this.A00 = range;
    }
}
