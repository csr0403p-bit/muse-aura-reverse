package X;

import android.app.PendingIntent;
import java.util.List;

/* renamed from: X.CIn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3381CIn extends CJN {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final PendingIntent A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof CJN) {
                C3381CIn c3381CIn = (C3381CIn) ((CJN) obj);
                if (this.A00 == c3381CIn.A00 && this.A01 == c3381CIn.A01 && this.A02 == c3381CIn.A02 && this.A03 == c3381CIn.A03 && this.A04 == c3381CIn.A04) {
                    List list = this.A06;
                    List list2 = c3381CIn.A06;
                    if (list != null ? list.equals(list2) : list2 == null) {
                        List list3 = this.A07;
                        List list4 = c3381CIn.A07;
                        if (list3 != null ? list3.equals(list4) : list4 == null) {
                            PendingIntent pendingIntent = this.A05;
                            PendingIntent pendingIntent2 = c3381CIn.A05;
                            if (pendingIntent != null ? pendingIntent.equals(pendingIntent2) : pendingIntent2 == null) {
                                List list5 = this.A08;
                                List list6 = c3381CIn.A08;
                                if (list5 != null ? list5.equals(list6) : list6 == null) {
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((((this.A00 ^ 1000003) * 1000003) ^ this.A01) * 1000003) ^ this.A02;
        long j = this.A03;
        long j2 = this.A04;
        long j3 = j2 ^ (j2 >>> 32);
        int i2 = i * 1000003;
        return ((((((((((i2 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) j3)) * 1000003) ^ AnonymousClass006.A0D(this.A06)) * 1000003) ^ AnonymousClass006.A0D(this.A07)) * 1000003) ^ AnonymousClass006.A0D(this.A05)) * 1000003) ^ C3cH.A02(this.A08);
    }

    public final String toString() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A02;
        long j = this.A03;
        long j2 = this.A04;
        String strValueOf = String.valueOf(this.A06);
        String strValueOf2 = String.valueOf(this.A07);
        String strValueOf3 = String.valueOf(this.A05);
        String strValueOf4 = String.valueOf(this.A08);
        StringBuilder sbA0y = C60O.A0y("SplitInstallSessionState{sessionId=", i);
        sbA0y.append(", status=");
        sbA0y.append(i2);
        sbA0y.append(", errorCode=");
        sbA0y.append(i3);
        sbA0y.append(", bytesDownloaded=");
        sbA0y.append(j);
        sbA0y.append(", totalBytesToDownload=");
        sbA0y.append(j2);
        sbA0y.append(", moduleNamesNullable=");
        sbA0y.append(strValueOf);
        sbA0y.append(", languagesNullable=");
        sbA0y.append(strValueOf2);
        sbA0y.append(", resolutionIntent=");
        sbA0y.append(strValueOf3);
        sbA0y.append(", splitFileIntents=");
        sbA0y.append(strValueOf4);
        return BV7.A11(sbA0y);
    }

    public C3381CIn(PendingIntent pendingIntent, List list, List list2, List list3, int i, int i2, int i3, long j, long j2) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A04 = j2;
        this.A06 = list;
        this.A07 = list2;
        this.A05 = pendingIntent;
        this.A08 = list3;
    }
}
