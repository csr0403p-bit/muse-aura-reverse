package X;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import java.util.Map;

/* renamed from: X.Dwj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C6141Dwj {
    public static final C6141Dwj A0V;

    @Deprecated
    public static final C6141Dwj A0W;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final C6145Dwn A0G;
    public final ImmutableList<String> A0H;
    public final ImmutableList<String> A0I;
    public final ImmutableList<String> A0J;
    public final ImmutableList<String> A0K;
    public final ImmutableList<String> A0L;
    public final ImmutableMap A0M;
    public final ImmutableSet<Integer> A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final boolean A0S;
    public final boolean A0T;
    public final boolean A0U;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                C6141Dwj c6141Dwj = (C6141Dwj) obj;
                if (this.A06 != c6141Dwj.A06 || this.A05 != c6141Dwj.A05 || this.A04 != c6141Dwj.A04 || this.A03 != c6141Dwj.A03 || this.A0A != c6141Dwj.A0A || this.A09 != c6141Dwj.A09 || this.A08 != c6141Dwj.A08 || this.A07 != c6141Dwj.A07 || this.A0U != c6141Dwj.A0U || this.A0F != c6141Dwj.A0F || this.A0E != c6141Dwj.A0E || this.A0R != c6141Dwj.A0R || !this.A0L.equals(c6141Dwj.A0L) || !this.A0K.equals(c6141Dwj.A0K) || this.A0D != c6141Dwj.A0D || !this.A0H.equals(c6141Dwj.A0H) || this.A0B != c6141Dwj.A0B || this.A02 != c6141Dwj.A02 || this.A01 != c6141Dwj.A01 || !this.A0I.equals(c6141Dwj.A0I) || !this.A0G.equals(c6141Dwj.A0G) || !this.A0J.equals(c6141Dwj.A0J) || this.A0C != c6141Dwj.A0C || this.A0T != c6141Dwj.A0T || this.A00 != c6141Dwj.A00 || this.A0S != c6141Dwj.A0S || this.A0Q != c6141Dwj.A0Q || this.A0P != c6141Dwj.A0P || this.A0O != c6141Dwj.A0O || !this.A0M.equals(c6141Dwj.A0M) || !this.A0N.equals(c6141Dwj.A0N)) {
                }
            }
            return false;
        }
        return true;
    }

    static {
        C6141Dwj c6141Dwj = new C6141Dwj(new C6140Dwi());
        A0V = c6141Dwj;
        A0W = c6141Dwj;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.A0N, AnonymousClass005.A0F(this.A0M, (((((((((((((AnonymousClass005.A0F(this.A0J, AnonymousClass005.A0F(this.A0G, AnonymousClass005.A0F(this.A0I, (((((AnonymousClass005.A0F(this.A0H, (AnonymousClass005.A0F(this.A0K, AnonymousClass005.A0F(this.A0L, (((((((((((((((((((((((this.A06 + 31) * 31) + this.A05) * 31) + this.A04) * 31) + this.A03) * 31) + this.A0A) * 31) + this.A09) * 31) + this.A08) * 31) + this.A07) * 31) + (this.A0U ? 1 : 0)) * 31) + this.A0F) * 31) + this.A0E) * 31) + (this.A0R ? 1 : 0)) * 31)) + this.A0D) * 31) + this.A0B) * 31) + this.A02) * 31) + this.A01) * 31))) + this.A0C) * 31) + (this.A0T ? 1 : 0)) * 31) + this.A00) * 31) + (this.A0S ? 1 : 0)) * 31) + (this.A0Q ? 1 : 0)) * 31) + (this.A0P ? 1 : 0)) * 31) + (this.A0O ? 1 : 0)) * 31));
    }

    public C6141Dwj(C6140Dwi c6140Dwi) {
        this.A06 = c6140Dwi.A06;
        this.A05 = c6140Dwi.A05;
        this.A04 = c6140Dwi.A04;
        this.A03 = c6140Dwi.A03;
        this.A0A = c6140Dwi.A0A;
        this.A09 = c6140Dwi.A09;
        this.A08 = c6140Dwi.A08;
        this.A07 = c6140Dwi.A07;
        this.A0F = c6140Dwi.A0F;
        this.A0E = c6140Dwi.A0E;
        this.A0R = c6140Dwi.A0R;
        this.A0U = c6140Dwi.A0U;
        this.A0L = c6140Dwi.A0L;
        this.A0K = c6140Dwi.A0K;
        this.A0D = c6140Dwi.A0D;
        this.A0H = c6140Dwi.A0H;
        this.A0B = c6140Dwi.A0B;
        this.A02 = c6140Dwi.A02;
        this.A01 = c6140Dwi.A01;
        this.A0I = c6140Dwi.A0I;
        this.A0G = c6140Dwi.A0G;
        this.A0J = c6140Dwi.A0J;
        this.A0C = c6140Dwi.A0C;
        this.A0T = c6140Dwi.A0T;
        this.A00 = c6140Dwi.A00;
        this.A0S = c6140Dwi.A0S;
        this.A0Q = c6140Dwi.A0Q;
        this.A0P = c6140Dwi.A0P;
        this.A0O = c6140Dwi.A0O;
        this.A0M = ImmutableMap.copyOf((Map) c6140Dwi.A0M);
        this.A0N = ImmutableSet.A01(c6140Dwi.A0N);
    }
}
