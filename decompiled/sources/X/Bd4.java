package X;

import android.util.Range;
import android.util.Size;
import java.util.Map;

/* loaded from: classes5.dex */
public final class Bd4 implements InterfaceC2529BdA<BdF> {
    public final Range<Integer> A00;
    public final Size A01;
    public final C2507Bcd A02;
    public final BWz A03;
    public final AbstractC2440BbT A04;
    public final String A05;
    public static final Size A07 = BV6.A0P(1280, 720);
    public static final Range<Integer> A06 = new Range<>(BV4.A0W(), 60);

    @Override // X.InterfaceC2529BdA
    public final /* bridge */ /* synthetic */ BdF get() {
        Number numberA0b;
        Range<Integer> range = this.A00;
        Range<Integer> range2 = BmM.A0F;
        int iA0F = !C6xC.A00(range, range2) ? AnonymousClass001.A0F(A06.clamp(range.getUpper())) : 30;
        Integer numValueOf = Integer.valueOf(iA0F);
        boolean zA00 = C6xC.A00(range, range2);
        Object obj = range;
        if (!zA00) {
            obj = "<UNSPECIFIED>";
        }
        AbstractC2875Bni.A01("VidEncCfgDefaultRslvr", String.format("Default resolved frame rate: %dfps. [Expected operating range: %s]", numValueOf, obj));
        AbstractC2875Bni.A01("VidEncCfgDefaultRslvr", FGI.A0I("Resolved VIDEO frame rate: ", iA0F, "fps"));
        Range<Integer> range3 = ((Bd8) this.A04).A01;
        AbstractC2875Bni.A01("VidEncCfgDefaultRslvr", "Using fallback VIDEO bitrate");
        C2507Bcd c2507Bcd = this.A02;
        int i = c2507Bcd.A00;
        Size size = this.A01;
        int width = size.getWidth();
        Size size2 = A07;
        int iA00 = Bd2.A00(range3, 14000000, i, 8, iA0F, 30, width, size2.getWidth(), size.getHeight(), size2.getHeight());
        String str = this.A05;
        Map<C2507Bcd, Integer> map = AbstractC2508Bce.A02.get(str);
        int iIntValue = (map == null || (numberA0b = BV4.A0b(c2507Bcd, map)) == null) ? -1 : numberA0b.intValue();
        Bd6 bd6A03 = Bd2.A03(str, iIntValue);
        Bd6 bd6 = Bd6.A00;
        if (str == null) {
            throw BV4.A0a("Null mimeType");
        }
        BWz bWz = this.A03;
        if (bWz == null) {
            throw BV4.A0a("Null inputTimebase");
        }
        Integer numValueOf2 = Integer.valueOf(iIntValue);
        if ("".isEmpty()) {
            return new Bd7(size, bWz, bd6A03, str, numValueOf2.intValue(), numValueOf.intValue(), iA00);
        }
        throw BV8.A0l("");
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;LX/BWz;LX/BbT;Landroid/util/Size;LX/Bcd;Landroid/util/Range<Ljava/lang/Integer;>;)V */
    public Bd4(Range range, Size size, C2507Bcd c2507Bcd, BWz bWz, AbstractC2440BbT abstractC2440BbT, String str) {
        this.A05 = str;
        this.A03 = bWz;
        this.A04 = abstractC2440BbT;
        this.A01 = size;
        this.A02 = c2507Bcd;
        this.A00 = range;
    }
}
