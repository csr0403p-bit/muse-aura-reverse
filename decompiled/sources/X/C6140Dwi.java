package X;

import androidx.media3.common.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.Dwi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6140Dwi {
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A06 = Integer.MAX_VALUE;
    public int A05 = Integer.MAX_VALUE;
    public int A04 = Integer.MAX_VALUE;
    public int A03 = Integer.MAX_VALUE;
    public int A0F = Integer.MAX_VALUE;
    public int A0E = Integer.MAX_VALUE;
    public boolean A0R = true;
    public boolean A0U = true;
    public ImmutableList<String> A0L = ImmutableList.of();
    public ImmutableList<String> A0K = ImmutableList.of();
    public int A0D = 0;
    public ImmutableList<String> A0H = ImmutableList.of();
    public int A0B = 0;
    public int A02 = Integer.MAX_VALUE;
    public int A01 = Integer.MAX_VALUE;
    public ImmutableList<String> A0I = ImmutableList.of();
    public C6145Dwn A0G = C6145Dwn.A00;
    public ImmutableList<String> A0J = ImmutableList.of();
    public int A0C = 0;
    public boolean A0T = true;
    public int A00 = 0;
    public boolean A0S = false;
    public boolean A0Q = false;
    public boolean A0P = false;
    public boolean A0O = false;
    public HashMap A0M = BV4.A0u();
    public HashSet<Integer> A0N = C60O.A13();

    public void A04(boolean z) {
        this.A0R = true;
        this.A0U = z;
        this.A0E = Integer.MAX_VALUE;
        this.A0F = Integer.MAX_VALUE;
    }

    public static void A01(C6140Dwi c6140Dwi, C6141Dwj c6141Dwj) {
        c6140Dwi.A06 = c6141Dwj.A06;
        c6140Dwi.A05 = c6141Dwj.A05;
        c6140Dwi.A04 = c6141Dwj.A04;
        c6140Dwi.A03 = c6141Dwj.A03;
        c6140Dwi.A0A = c6141Dwj.A0A;
        c6140Dwi.A09 = c6141Dwj.A09;
        c6140Dwi.A08 = c6141Dwj.A08;
        c6140Dwi.A07 = c6141Dwj.A07;
        c6140Dwi.A0F = c6141Dwj.A0F;
        c6140Dwi.A0E = c6141Dwj.A0E;
        c6140Dwi.A0R = c6141Dwj.A0R;
        c6140Dwi.A0U = c6141Dwj.A0U;
        c6140Dwi.A0L = c6141Dwj.A0L;
        c6140Dwi.A0K = c6141Dwj.A0K;
        c6140Dwi.A0D = c6141Dwj.A0D;
        c6140Dwi.A0H = c6141Dwj.A0H;
        c6140Dwi.A0B = c6141Dwj.A0B;
        c6140Dwi.A02 = c6141Dwj.A02;
        c6140Dwi.A01 = c6141Dwj.A01;
        c6140Dwi.A0I = c6141Dwj.A0I;
        c6140Dwi.A0G = c6141Dwj.A0G;
        c6140Dwi.A0J = c6141Dwj.A0J;
        c6140Dwi.A0C = c6141Dwj.A0C;
        c6140Dwi.A0T = c6141Dwj.A0T;
        c6140Dwi.A00 = c6141Dwj.A00;
        c6140Dwi.A0S = c6141Dwj.A0S;
        c6140Dwi.A0Q = c6141Dwj.A0Q;
        c6140Dwi.A0P = c6141Dwj.A0P;
        c6140Dwi.A0O = c6141Dwj.A0O;
        c6140Dwi.A0N = BV4.A0x(c6141Dwj.A0N);
        c6140Dwi.A0M = BV4.A0w(c6141Dwj.A0M);
    }

    public void A02(int i, boolean z) {
        HashSet<Integer> hashSet = this.A0N;
        Integer numValueOf = Integer.valueOf(i);
        if (z) {
            hashSet.add(numValueOf);
        } else {
            hashSet.remove(numValueOf);
        }
    }

    /* JADX WARN: Incorrect return type in method signature: (Ljava/util/Set<Ljava/lang/Integer;>;)LX/Dwi; */
    public void A03(Set set) {
        HashSet<Integer> hashSet = this.A0N;
        hashSet.clear();
        hashSet.addAll(set);
    }

    public static ImmutableList<String> A00(String[] strArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (String str : strArr) {
            str.getClass();
            builder.add((ImmutableList.Builder) Util.A0I(str));
        }
        return builder.build();
    }

    public void A05(String... strArr) {
        this.A0H = A00(strArr);
    }

    public void A06(String... strArr) {
        this.A0J = A00(strArr);
        this.A0T = false;
    }
}
