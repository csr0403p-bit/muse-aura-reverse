package X;

import android.text.TextUtils;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.util.Calendar;

/* renamed from: X.DdG, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5204DdG {
    public int A00;
    public long A01;
    public C5211DdN A02;
    public C5211DdN A03;
    public C5211DdN A04;
    public C5201DdD A05;
    public String A06;

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("time=");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(this.A01);
        sbA0x.append(String.format("%tm-%td %tH:%tM:%tS.%tL", calendar, calendar, calendar, calendar, calendar, calendar));
        sbA0x.append(" processed=");
        C5211DdN c5211DdN = this.A04;
        sbA0x.append(c5211DdN == null ? "<null>" : c5211DdN.A02());
        sbA0x.append(" org=");
        C5211DdN c5211DdN2 = this.A03;
        sbA0x.append(c5211DdN2 == null ? "<null>" : c5211DdN2.A02());
        sbA0x.append(" dest=");
        C5211DdN c5211DdN3 = this.A02;
        sbA0x.append(c5211DdN3 != null ? c5211DdN3.A02() : "<null>");
        sbA0x.append(" what=");
        String str = this.A05 != null ? null : "";
        if (TextUtils.isEmpty(str)) {
            int i = this.A00;
            sbA0x.append(i);
            sbA0x.append("(0x");
            BV4.A1N(sbA0x, i);
            str = ")";
        }
        sbA0x.append(str);
        if (!TextUtils.isEmpty(this.A06)) {
            sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
            sbA0x.append(this.A06);
        }
        return sbA0x.toString();
    }
}
