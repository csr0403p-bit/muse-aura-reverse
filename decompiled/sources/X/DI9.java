package X;

import android.os.Process;
import com.facebook.quicklog.QPLConfigConstants;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class DI9 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final String A08;
    public final TimeUnit A09;

    public DI9(Object obj, Object obj2, String str, String str2, TimeUnit timeUnit, int i, int i2, int i3, long j) {
        int iMyTid = QPLConfigConstants.LOG_TIDS_IN_QPL_OPERATIONS ? Process.myTid() : 0;
        this.A03 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = j;
        this.A09 = timeUnit;
        this.A07 = str;
        this.A05 = obj;
        this.A06 = obj2;
        this.A08 = str2;
        this.A02 = iMyTid;
    }
}
