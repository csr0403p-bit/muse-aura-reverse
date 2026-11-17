package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class Dl9 {
    public final double A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List<C5493DjV> A0C;
    public final List<C5493DjV> A0D;
    public final List<AbstractC5553DkW> A0E;
    public final List<C5493DjV> A0F;
    public final boolean A0G;
    public final boolean A0H;

    public static Dl9 A01(Dl9 dl9, List list, int i, int i2) {
        List<C5493DjV> list2 = dl9.A0C;
        List<C5493DjV> list3 = dl9.A0D;
        List<C5493DjV> list4 = dl9.A0F;
        String str = dl9.A0A;
        String str2 = dl9.A0B;
        String str3 = dl9.A09;
        double d = dl9.A00;
        boolean z = dl9.A0G;
        boolean z2 = dl9.A0H;
        int i3 = dl9.A04;
        int i4 = dl9.A03;
        return new Dl9(str, str2, str3, dl9.A08, dl9.A07, list, list2, list3, list4, d, dl9.A02, dl9.A01, i, i2, i3, i4, z, z2);
    }

    public static Iterator A02(Dl9 dl9) {
        return dl9.A0E.iterator();
    }

    /* JADX WARN: Incorrect types in method signature: (IILjava/util/List<LX/DkW;>;Ljava/util/List<LX/DjV;>;Ljava/util/List<LX/DjV;>;Ljava/util/List<LX/DjV;>;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DZZIIFFLjava/lang/String;Ljava/lang/String;)V */
    public Dl9(String str, String str2, String str3, String str4, String str5, List list, List list2, List list3, List list4, double d, float f, float f2, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        this.A05 = i;
        this.A06 = i2;
        this.A0E = Collections.unmodifiableList(list);
        this.A0C = Collections.unmodifiableList(list2);
        this.A0D = Collections.unmodifiableList(list3);
        this.A0F = Collections.unmodifiableList(list4);
        this.A0A = str;
        this.A0B = str2;
        this.A09 = str3;
        this.A00 = d;
        this.A0G = z;
        this.A0H = z2;
        this.A04 = i3;
        this.A03 = i4;
        this.A02 = f;
        this.A01 = f2;
        this.A08 = str4;
        this.A07 = str5;
    }

    public static List A03(List list, int i) {
        return ((Dl9) list.get(i)).A0E;
    }
}
