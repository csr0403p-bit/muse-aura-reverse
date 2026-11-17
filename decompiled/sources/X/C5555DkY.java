package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.DkY, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C5555DkY extends AbstractC5553DkW {
    public final long A00;
    public final Uri A01;
    public final C5325DgJ A02;
    public final C5556DkZ A03;
    public final C5557Dka A04;
    public final String A05;
    public final String A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5555DkY(C6154Dwx c6154Dwx, C5556DkZ c5556DkZ, String str, String str2, List list, List list2, List list3, List list4, long j, long j2) {
        super(c6154Dwx, c5556DkZ, list, list2, list3, list4, j);
        String strA0z = str;
        this.A01 = Uri.parse(((C5376DhT) C8j4.A0p(list)).A03);
        long j3 = c5556DkZ.A00;
        C5325DgJ c5325DgJ = j3 <= 0 ? null : new C5325DgJ(null, c5556DkZ.A01, j3);
        this.A02 = c5325DgJ;
        if (strA0z == null) {
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append(c6154Dwx.A0Z);
            sbA0w.append(".");
            sbA0w.append(c6154Dwx.A0Y);
            strA0z = BV7.A0z(".", sbA0w, j);
        }
        this.A05 = strA0z;
        this.A06 = str2;
        this.A00 = j2;
        this.A04 = c5325DgJ != null ? null : new C5557Dka(new C5325DgJ(null, 0L, -1L));
        this.A03 = c5556DkZ;
    }
}
