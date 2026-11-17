package X;

import android.net.Uri;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.DDx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4904DDx {
    public int A00;
    public int A01;
    public int A03;
    public long A04;
    public long A05;
    public Uri A07;
    public Uri A08;
    public BY2 A09;
    public BXX A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0J;
    public String A0M;
    public String A0N;
    public String A0O;
    public String A0P;
    public String A0Q;
    public List<SubtitleConfiguration> A0R;
    public List<String> A0S;
    public Map<String, String> A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c;
    public byte[] A0e;
    public String A0L = null;
    public String A0I = null;
    public String A0K = null;
    public int A02 = 0;
    public boolean A0d = false;
    public Uri A06 = null;
    public String A0E = null;
    public boolean A0X = false;

    /* JADX WARN: Failed to parse method signature: (Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LX/BXX;JJIZZLjava/lang/String;ZZZZZLjava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/String;ZLX/BY2;Ljava/lang/String;ILjava/lang/String;[BLjava/util/List<Lcom/facebook/video/heroplayer/ipc/SubtitleConfiguration;>;I)V
    jadx.core.utils.exceptions.JadxRuntimeException: Arguments count limit reached: 20
    	at jadx.core.dex.nodes.parser.SignatureParser.consumeMethodArgs(SignatureParser.java:342)
    	at jadx.core.dex.visitors.SignatureProcessor.parseMethodSignature(SignatureProcessor.java:187)
    	at jadx.core.dex.visitors.SignatureProcessor.visit(SignatureProcessor.java:40)
     */
    public C4904DDx(Uri uri, BY2 by2, BXX bxx, String str, String str2, String str3, String str4, String str5, Map map) {
        this.A03 = -1;
        this.A0P = null;
        this.A0J = null;
        this.A08 = uri;
        String queryParameter = null;
        if (uri != null) {
            try {
                queryParameter = uri.getQueryParameter("bitrate");
            } catch (UnsupportedOperationException unused) {
            }
        }
        this.A0P = queryParameter;
        String queryParameter2 = null;
        if (uri != null) {
            try {
                queryParameter2 = uri.getQueryParameter("tag");
            } catch (UnsupportedOperationException unused2) {
            }
        }
        this.A0J = queryParameter2;
        this.A0Q = str;
        this.A0D = str2;
        this.A0O = null;
        this.A0S = null;
        this.A07 = null;
        this.A0F = str3;
        this.A0G = str4;
        this.A0H = "UNKNOWN";
        this.A0A = bxx;
        this.A04 = -1L;
        this.A05 = -1L;
        this.A01 = -1;
        this.A0Y = false;
        this.A0c = false;
        this.A0N = null;
        this.A0T = map;
        this.A0a = false;
        this.A0b = false;
        this.A0U = false;
        this.A0Z = false;
        this.A0V = false;
        this.A0M = str5;
        this.A0W = false;
        this.A09 = by2;
        this.A0B = null;
        this.A00 = -1;
        this.A0C = null;
        this.A0e = null;
        this.A0R = null;
        this.A03 = -1;
    }

    public final boolean equals(Object obj) {
        Uri uri;
        Uri uri2;
        String str;
        String str2;
        BY2 by2;
        BY2 by22;
        boolean z;
        String str3;
        String str4;
        if (this != obj) {
            if (obj instanceof C4904DDx) {
                C4904DDx c4904DDx = (C4904DDx) obj;
                if (this.A0A != c4904DDx.A0A || (((uri = this.A08) != (uri2 = c4904DDx.A08) && (uri == null || !uri.equals(uri2))) || (((str = this.A0Q) != (str2 = c4904DDx.A0Q) && (str == null || !str.equals(str2))) || (((by2 = this.A09) != (by22 = c4904DDx.A09) && (by2 == null || !by2.equals(by22))) || this.A02 != c4904DDx.A02 || this.A0d != c4904DDx.A0d || (z = this.A0X) != c4904DDx.A0X || (z && (str3 = this.A0D) != (str4 = c4904DDx.A0D) && (str3 == null || !str3.equals(str4))))))) {
                }
            }
            return false;
        }
        return true;
    }

    public static boolean A00(DmR dmR) {
        return dmR.A03.A04();
    }

    public static boolean A01(C4904DDx c4904DDx, String... strArr) {
        List<String> list = c4904DDx.A0S;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String strA0j = AnonymousClass005.A0j(it);
                if (strA0j != null) {
                    int i = 0;
                    while (!strA0j.startsWith(strArr[i])) {
                        i++;
                        if (i < 2) {
                        }
                    }
                    return true;
                }
            }
        } else {
            String str = c4904DDx.A0O;
            if (str != null) {
                int i2 = 0;
                while (!str.startsWith(strArr[i2])) {
                    i2++;
                    if (i2 >= 2) {
                        return false;
                    }
                }
                return true;
            }
            if (c4904DDx.A0D != null) {
                int i3 = 0;
                while (!c4904DDx.A0D.contains(FGI.A0M("codecs=\"", strArr[i3]))) {
                    i3++;
                    if (i3 < 2) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final C4904DDx A02() {
        BXX bxx = this.A0A;
        if (!AnonymousClass002.A1Z(bxx, BXX.MOQ) || this.A06 == null) {
            return null;
        }
        C4904DDx c4904DDx = new C4904DDx();
        c4904DDx.A03 = -1;
        c4904DDx.A0P = null;
        c4904DDx.A0J = null;
        c4904DDx.A0L = null;
        c4904DDx.A0I = null;
        c4904DDx.A0K = null;
        c4904DDx.A02 = 0;
        c4904DDx.A0d = false;
        c4904DDx.A06 = null;
        c4904DDx.A0E = null;
        c4904DDx.A0X = false;
        c4904DDx.A08 = this.A08;
        c4904DDx.A0J = this.A0J;
        c4904DDx.A0P = this.A0P;
        c4904DDx.A0I = this.A0I;
        c4904DDx.A0L = this.A0L;
        c4904DDx.A0K = this.A0K;
        c4904DDx.A0Q = this.A0Q;
        c4904DDx.A0D = this.A0D;
        c4904DDx.A0O = this.A0O;
        c4904DDx.A0S = this.A0S;
        c4904DDx.A07 = this.A07;
        c4904DDx.A0F = this.A0F;
        c4904DDx.A0G = this.A0G;
        c4904DDx.A0H = this.A0H;
        c4904DDx.A0A = bxx;
        c4904DDx.A04 = this.A04;
        c4904DDx.A05 = this.A05;
        c4904DDx.A01 = this.A01;
        c4904DDx.A0Y = this.A0Y;
        c4904DDx.A0c = this.A0c;
        c4904DDx.A0N = this.A0N;
        c4904DDx.A0T = this.A0T;
        c4904DDx.A0a = this.A0a;
        c4904DDx.A0b = this.A0b;
        c4904DDx.A0U = this.A0U;
        c4904DDx.A0Z = this.A0Z;
        c4904DDx.A0V = this.A0V;
        c4904DDx.A0M = this.A0M;
        c4904DDx.A0W = this.A0W;
        c4904DDx.A09 = this.A09;
        c4904DDx.A0B = this.A0B;
        c4904DDx.A00 = this.A00;
        c4904DDx.A0C = this.A0C;
        c4904DDx.A0e = this.A0e;
        c4904DDx.A0R = this.A0R;
        c4904DDx.A03 = this.A03;
        c4904DDx.A02 = this.A02;
        c4904DDx.A0d = this.A0d;
        c4904DDx.A06 = this.A06;
        c4904DDx.A0E = this.A0E;
        c4904DDx.A0X = this.A0X;
        c4904DDx.A0A = BXX.DASH_LIVE;
        c4904DDx.A08 = this.A06;
        c4904DDx.A0D = this.A0E;
        c4904DDx.A06 = null;
        c4904DDx.A0E = null;
        return c4904DDx;
    }

    public final boolean A03() {
        List<String> list = this.A0S;
        if (list != null) {
            for (int i = 0; i < list.toArray().length; i++) {
                if (!C60Q.A0n(list, i).startsWith("av01")) {
                }
            }
        }
        String str = this.A0O;
        if (str != null) {
            return str.startsWith("av01");
        }
        String str2 = this.A0D;
        return str2 != null && str2.contains("codecs=\"av01");
    }

    public final boolean A04() {
        BXX bxx = this.A0A;
        return bxx == BXX.DASH_LIVE || bxx == BXX.MOQ;
    }

    public final boolean A05() {
        boolean zContains;
        List<String> list = this.A0S;
        if (list != null) {
            for (int i = 0; i < list.toArray().length; i++) {
                if (C60Q.A0n(list, i).startsWith("vp9") || C60Q.A0n(list, i).startsWith("vp09")) {
                    return true;
                }
            }
        }
        String str = this.A0O;
        if (str != null) {
            if (!str.startsWith("vp9")) {
                zContains = str.startsWith("vp09");
            }
            return true;
        }
        String str2 = this.A0D;
        if (str2 != null) {
            zContains = str2.contains("codecs=\"vp");
        }
        return zContains;
    }

    public final int hashCode() {
        int iA0E = ((((((((AnonymousClass005.A0E(this.A0A) + BV7.A0I(this.A0Q)) * 31) + C60R.A01(this.A08)) * 31) + C60R.A01(this.A09)) * 31) + this.A02) * 31) + (this.A0d ? 1 : 0);
        if (!this.A0X) {
            return iA0E;
        }
        int i = iA0E * 31;
        String str = this.A0D;
        return ((i + (str != null ? str.hashCode() : 0)) * 31) + 1;
    }

    public final String toString() {
        StringBuilder sbA0x = C60O.A0x("Type: ");
        sbA0x.append(this.A0A);
        String str = this.A0Q;
        if (str != null) {
            sbA0x.append("\n\tId: ");
            sbA0x.append(str);
        }
        Uri uri = this.A08;
        if (uri != null) {
            sbA0x.append("\n\tUri: ");
            sbA0x.append(AbstractC7385Etm.A00(uri, false));
        }
        String str2 = this.A0F;
        if (str2 != null) {
            sbA0x.append("\n\tOrigin: ");
            sbA0x.append(str2);
        }
        String str3 = this.A0G;
        if (str3 != null) {
            sbA0x.append("\n\tSubOrigin: ");
            sbA0x.append(str3);
        }
        String str4 = this.A0H;
        if (str4 != null) {
            sbA0x.append("\n\tPrefetchOrigin: ");
            sbA0x.append(str4);
        }
        sbA0x.append("\n\tDashMPD: ");
        String str5 = this.A0D;
        sbA0x.append(str5 == null ? "NULL" : Integer.valueOf(str5.length()));
        String str6 = this.A0O;
        if (str6 != null) {
            sbA0x.append("\n\tCodec: ");
            sbA0x.append(str6);
        }
        List<String> list = this.A0S;
        if (list != null) {
            sbA0x.append("\n\tCodecs: ");
            sbA0x.append(list);
        }
        Uri uri2 = this.A07;
        if (uri2 != null) {
            sbA0x.append("\n\tSubtitle: ");
            sbA0x.append(uri2);
        }
        sbA0x.append("\n\tliveLatency: ");
        sbA0x.append(this.A04);
        sbA0x.append("\n\tliveLatencyTolerance: ");
        sbA0x.append(this.A05);
        sbA0x.append("\n\tisSpherical: ");
        sbA0x.append(this.A0a);
        sbA0x.append("\n\tisSponsored: ");
        sbA0x.append(this.A0b);
        sbA0x.append("\n\tisAdBreak: ");
        sbA0x.append(this.A0U);
        sbA0x.append("\n\tisLiveTraceEnabled: ");
        sbA0x.append(this.A0Z);
        sbA0x.append("\n\trenderMode: ");
        sbA0x.append(this.A0M);
        sbA0x.append("\n\tisBroadcast: ");
        sbA0x.append(this.A0W);
        sbA0x.append("\n\tcontentType: ");
        sbA0x.append(this.A09);
        sbA0x.append("\n\tpinRoleFlags: ");
        sbA0x.append(this.A02);
        sbA0x.append("\n\tisAudioDataListenerEnabled: ");
        sbA0x.append(this.A0V);
        sbA0x.append("\n\tliveViewerCount: ");
        return BV4.A0l(sbA0x, this.A00);
    }
}
