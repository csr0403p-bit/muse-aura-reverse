package X;

import java.util.Arrays;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Djr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5515Djr {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public Long A07;
    public int A08;
    public final Function0<Long> A09 = C6724EXi.A00(30);
    public final C6040Dub[] A0A = new C6040Dub[32];
    public volatile C5514Djq A0B = new C5514Djq(new C5469Dj4(0, 0, 0, 0, 0, 0, 0, false), null);

    public static final void A00(C5515Djr c5515Djr) {
        Long l = c5515Djr.A07;
        c5515Djr.A0B = new C5514Djq(new C5469Dj4(c5515Djr.A02, c5515Djr.A08, c5515Djr.A06, 0L, c5515Djr.A03, c5515Djr.A04, c5515Djr.A05, AnonymousClass002.A1X(l)), l);
    }

    public final void A01() {
        boolean zA1X = AnonymousClass002.A1X(this.A07);
        this.A07 = null;
        Arrays.fill(this.A0A, 0, 32, (Object) null);
        this.A00 = 0;
        this.A01 = 0;
        this.A02 = 0;
        this.A06 = 0L;
        if (zA1X) {
            this.A08++;
            this.A05 = this.A04;
            this.A04 = this.A03;
            this.A03 = -1L;
        }
        A00(this);
    }
}
