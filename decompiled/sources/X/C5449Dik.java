package X;

/* renamed from: X.Dik, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5449Dik {
    public int A00;
    public long A01 = -1;
    public final C5440Dib A02;
    public final C5431DiS A03;
    public final C4908DEb A04;
    public final boolean A05;

    public static void A00(String str, StringBuilder sb, long j) {
        if (j >= 0) {
            sb.append(';');
            BV7.A1I(sb, str);
            sb.append(j);
        }
    }

    public C5449Dik(C5431DiS c5431DiS, C4908DEb c4908DEb, boolean z) {
        boolean z2 = true;
        boolean zA1L = AnonymousClass002.A1L(c4908DEb.A03 ? 1 : 0);
        if (!z || (!c5431DiS.A04() && !zA1L)) {
            z2 = false;
        }
        this.A05 = z2;
        this.A03 = c5431DiS;
        C5440Dib c5440DibA01 = null;
        this.A04 = (z2 && zA1L) ? c4908DEb : null;
        if (z2 && c5431DiS.A04()) {
            c5440DibA01 = c5431DiS.A01();
        }
        this.A02 = c5440DibA01;
    }
}
