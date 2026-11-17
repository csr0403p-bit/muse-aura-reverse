package X;

import android.net.Uri;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import com.facebook.tigon.iface.TigonRequest;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes5.dex */
public final class C1O {
    public static final C1O $redex_init_class = null;
    public final int A00;
    public final int A01;

    @Deprecated
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Uri A06;
    public final Object A07;
    public final String A08;
    public final Map<String, String> A09;
    public final byte[] A0A;

    static {
        C2369BVx.A00("media3.datasource");
    }

    @Deprecated
    public C1O(Uri uri, String str, long j, long j2) {
        this(uri, null, str, Collections.EMPTY_MAP, null, 1, 0, 0L, j, j2);
    }

    public final C1O A00(long j, long j2) {
        if (j == 0 && this.A03 == j2) {
            return this;
        }
        Uri uri = this.A06;
        long j3 = this.A05;
        int i = this.A01;
        byte[] bArr = this.A0A;
        Map<String, String> map = this.A09;
        long j4 = this.A04 + j;
        return new C1O(uri, this.A07, this.A08, map, bArr, i, this.A00, j3, j4, j2);
    }

    public final String toString() {
        String str;
        StringBuilder sbA0x = C60O.A0x("DataSpec[");
        int i = this.A01;
        if (i == 1) {
            str = TigonRequest.GET;
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw BV4.A0T();
            }
            str = TigonRequest.HEAD;
        }
        sbA0x.append(str);
        sbA0x.append(InviteCodeScratcherKt.CODE_SEPARATOR);
        sbA0x.append(this.A06);
        sbA0x.append(", ");
        sbA0x.append(this.A04);
        sbA0x.append(", ");
        sbA0x.append(this.A03);
        sbA0x.append(", ");
        sbA0x.append(this.A08);
        sbA0x.append(", ");
        sbA0x.append(this.A00);
        return AnonymousClass001.A0v("]", sbA0x);
    }

    /* JADX WARN: Incorrect types in method signature: (Landroid/net/Uri;JI[BLjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;JJLjava/lang/String;ILjava/lang/Object;)V */
    public C1O(Uri uri, Object obj, String str, Map map, byte[] bArr, int i, int i2, long j, long j2, long j3) {
        byte[] bArr2 = bArr;
        long j4 = j + j2;
        boolean z = true;
        C1G.A07(C8j3.A1Q((j4 > 0L ? 1 : (j4 == 0L ? 0 : -1))));
        C1G.A07(C8j3.A1Q((j2 > 0L ? 1 : (j2 == 0L ? 0 : -1))));
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        C1G.A07(z);
        uri.getClass();
        this.A06 = uri;
        this.A05 = j;
        this.A01 = i;
        this.A0A = (bArr == null || bArr2.length == 0) ? null : bArr2;
        this.A09 = BV5.A15(map);
        this.A04 = j2;
        this.A02 = j4;
        this.A03 = j3;
        this.A08 = str;
        this.A00 = i2;
        this.A07 = obj;
    }
}
