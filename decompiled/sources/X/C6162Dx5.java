package X;

import androidx.media3.common.DrmInitData;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* renamed from: X.Dx5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6162Dx5 {
    public int A09;
    public int A0A;
    public int A0H;
    public int A0I;
    public int A0K;
    public C6180DxO A0Q;
    public DrmInitData A0R;
    public C5402Dhv A0S;
    public Object A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public List<byte[]> A0a;
    public boolean A0c;
    public byte[] A0d;
    public List<C6219DyA> A0b = ImmutableList.of();
    public int A03 = -1;
    public int A0G = -1;
    public int A0C = -1;
    public int A0D = -1;
    public long A0P = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
    public int A0O = -1;
    public int A0B = -1;
    public int A08 = -1;
    public int A07 = -1;
    public float A00 = -1.0f;
    public float A01 = 1.0f;
    public int A0L = -1;
    public int A0E = -1;
    public int A04 = -1;
    public int A0J = -1;
    public int A0F = -1;
    public int A02 = -1;
    public int A06 = 1;
    public int A0M = -1;
    public int A0N = -1;
    public int A05 = 0;

    public static C6162Dx5 A00() {
        return new C6162Dx5();
    }

    public static C6162Dx5 A01(C6154Dwx c6154Dwx) {
        C6162Dx5 c6162Dx5 = new C6162Dx5();
        c6162Dx5.A0W = c6154Dwx.A0Y;
        c6162Dx5.A0X = c6154Dwx.A0Z;
        c6162Dx5.A0b = c6154Dwx.A0d;
        c6162Dx5.A0Y = c6154Dwx.A0a;
        c6162Dx5.A0K = c6154Dwx.A0M;
        c6162Dx5.A0H = c6154Dwx.A0J;
        c6162Dx5.A03 = c6154Dwx.A04;
        c6162Dx5.A0G = c6154Dwx.A0I;
        c6162Dx5.A0U = c6154Dwx.A0W;
        c6162Dx5.A0S = c6154Dwx.A0U;
        c6162Dx5.A0T = c6154Dwx.A0V;
        c6162Dx5.A0V = c6154Dwx.A0X;
        c6162Dx5.A0Z = c6154Dwx.A0b;
        c6162Dx5.A0C = c6154Dwx.A0E;
        c6162Dx5.A0D = c6154Dwx.A0F;
        c6162Dx5.A0a = c6154Dwx.A0c;
        c6162Dx5.A0R = c6154Dwx.A0T;
        c6162Dx5.A0P = c6154Dwx.A0R;
        c6162Dx5.A0c = c6154Dwx.A0e;
        c6162Dx5.A0O = c6154Dwx.A0Q;
        c6162Dx5.A0B = c6154Dwx.A0D;
        c6162Dx5.A08 = c6154Dwx.A0A;
        c6162Dx5.A07 = c6154Dwx.A09;
        c6162Dx5.A00 = c6154Dwx.A01;
        c6162Dx5.A0I = c6154Dwx.A0K;
        c6162Dx5.A01 = c6154Dwx.A02;
        c6162Dx5.A0d = c6154Dwx.A0f;
        c6162Dx5.A0L = c6154Dwx.A0N;
        c6162Dx5.A0Q = c6154Dwx.A0S;
        c6162Dx5.A0E = c6154Dwx.A0G;
        c6162Dx5.A04 = c6154Dwx.A06;
        c6162Dx5.A0J = c6154Dwx.A0L;
        c6162Dx5.A0F = c6154Dwx.A0H;
        c6162Dx5.A09 = c6154Dwx.A0B;
        c6162Dx5.A0A = c6154Dwx.A0C;
        c6162Dx5.A02 = c6154Dwx.A03;
        c6162Dx5.A06 = c6154Dwx.A08;
        c6162Dx5.A0M = c6154Dwx.A0O;
        c6162Dx5.A0N = c6154Dwx.A0P;
        c6162Dx5.A05 = c6154Dwx.A07;
        return c6162Dx5;
    }

    public final void A04(DrmInitData drmInitData) {
        this.A0R = drmInitData;
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0u) || drmInitData == null || this.A05 != 0) {
            return;
        }
        this.A05 = 2;
    }

    public static C6154Dwx A02(C6162Dx5 c6162Dx5, String str) {
        c6162Dx5.A06(str);
        return new C6154Dwx(c6162Dx5);
    }

    public static void A03(C6162Dx5 c6162Dx5, String str, int i, int i2) {
        c6162Dx5.A06(str);
        c6162Dx5.A04 = i;
        c6162Dx5.A0J = i2;
    }

    public final void A05(String str) {
        this.A0V = AbstractC6161Dx4.A06(str);
    }

    public final void A06(String str) {
        this.A0Z = AbstractC6161Dx4.A06(str);
    }
}
