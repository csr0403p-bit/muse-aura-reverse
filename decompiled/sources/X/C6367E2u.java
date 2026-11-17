package X;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Util;
import com.facebook.aura.network.transport.flipper.FlipperNoiseReporter;
import com.facebook.aura.sharesheet.HatchShareSheetRepository;
import com.google.common.collect.ImmutableList;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.E2u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6367E2u implements InterfaceC5458Dit {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public E1P A0D;
    public InterfaceC6413E4p A0E;
    public C6371E2y A0F;
    public ImmutableList<DQC> A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public InterfaceC5563Dkg[] A0K;
    public InterfaceC5563Dkg[] A0L;
    public final int A0M;
    public final SparseArray<C6371E2y> A0N;
    public final E1P A0O;
    public final E1P A0P;
    public final E1P A0Q;
    public final E1P A0R;
    public final E1P A0S;
    public final E33 A0T;
    public final C5592DlS A0U;
    public final InterfaceC5563Dkg A0V;
    public final DA0 A0W;
    public final ArrayDeque<C6358E2k> A0X;
    public final ArrayDeque<E57> A0Y;
    public final List<C6154Dwx> A0Z;
    public final byte[] A0a;
    public final InterfaceC5885DrL A0b;
    public static final byte[] A0d = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C6154Dwx A0c = C6162Dx5.A02(C6162Dx5.A00(), "application/x-emsg");

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        DQC dqcA00 = AbstractC6360E2m.A00(e2k, true);
        this.A0G = dqcA00 != null ? ImmutableList.of(dqcA00) : ImmutableList.of();
        return AnonymousClass002.A1Y(dqcA00);
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    @Deprecated
    public C6367E2u() {
        this(null, InterfaceC5885DrL.A00, ImmutableList.of(), 32);
    }

    public static Pair<Long, C5591DlR> A00(E1P e1p, long j) throws ParserException {
        long jA0I;
        long jA0I2;
        int iA06 = BV8.A06(e1p);
        e1p.A0S(4);
        long jA0H = e1p.A0H();
        if (iA06 == 0) {
            jA0I = e1p.A0H();
            jA0I2 = e1p.A0H();
        } else {
            jA0I = e1p.A0I();
            jA0I2 = e1p.A0I();
        }
        long j2 = j + jA0I2;
        RoundingMode roundingMode = RoundingMode.DOWN;
        long jA0F = Util.A0F(roundingMode, jA0I, 1000000L, jA0H);
        e1p.A0S(2);
        int iA0D = e1p.A0D();
        int[] iArr = new int[iA0D];
        long[] jArr = new long[iA0D];
        long[] jArr2 = new long[iA0D];
        long[] jArr3 = new long[iA0D];
        for (int i = 0; i < iA0D; i++) {
            int iA05 = e1p.A05();
            if ((Integer.MIN_VALUE & iA05) != 0) {
                throw BV8.A0c("Unhandled indirect reference");
            }
            long jA0H2 = e1p.A0H();
            iArr[i] = iA05 & Integer.MAX_VALUE;
            jArr[i] = j2;
            jArr3[i] = jA0F;
            jA0I += jA0H2;
            jA0F = Util.A0F(roundingMode, jA0I, 1000000L, jA0H);
            jArr2[i] = jA0F - jArr3[i];
            e1p.A0S(4);
            j2 += iArr[i];
        }
        return Pair.create(Long.valueOf(jA0F), new C5591DlR(iArr, jArr, jArr2, jArr3));
    }

    public static void A02(E1P e1p, E3G e3g, int i) throws ParserException {
        int iA05 = BV6.A05(e1p, i + 8);
        byte[] bArr = E2Q.A00;
        int i2 = iA05 & 16777215;
        if ((i2 & 1) != 0) {
            throw ParserException.A00("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean zA1L = AnonymousClass002.A1L(i2 & 2);
        int iA0C = e1p.A0C();
        if (iA0C == 0) {
            Arrays.fill(e3g.A0E, 0, e3g.A00, false);
            return;
        }
        int i3 = e3g.A00;
        if (iA0C != i3) {
            throw BV8.A0c(FGI.A0T("Senc sample count ", " is different from fragment sample count", iA0C, i3));
        }
        E3G.A00(e1p, e3g, iA0C, zA1L);
    }

    @Override // X.InterfaceC5458Dit
    public final /* bridge */ /* synthetic */ List AKl() {
        return this.A0G;
    }

    @Override // X.InterfaceC5458Dit
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        int i;
        int i2 = this.A0M;
        if ((i2 & 32) == 0) {
            interfaceC6413E4p = new C6195Dxf(interfaceC6413E4p, this.A0b);
        }
        this.A0E = interfaceC6413E4p;
        this.A02 = 0;
        this.A00 = 0;
        InterfaceC5563Dkg[] interfaceC5563DkgArr = new InterfaceC5563Dkg[2];
        this.A0L = interfaceC5563DkgArr;
        InterfaceC5563Dkg interfaceC5563Dkg = this.A0V;
        int i3 = 0;
        if (interfaceC5563Dkg != null) {
            interfaceC5563DkgArr[0] = interfaceC5563Dkg;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = i2 & 4;
        int i5 = 100;
        if (i4 != 0) {
            interfaceC5563DkgArr[i] = interfaceC6413E4p.AhC(100, 5);
            i5 = FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE;
            i++;
        }
        InterfaceC5563Dkg[] interfaceC5563DkgArr2 = this.A0L;
        C1G.A07(BV7.A1S(i, interfaceC5563DkgArr2.length));
        InterfaceC5563Dkg[] interfaceC5563DkgArr3 = (InterfaceC5563Dkg[]) Arrays.copyOf(interfaceC5563DkgArr2, i);
        this.A0L = interfaceC5563DkgArr3;
        for (InterfaceC5563Dkg interfaceC5563Dkg2 : interfaceC5563DkgArr3) {
            interfaceC5563Dkg2.ABq(A0c);
        }
        List<C6154Dwx> list = this.A0Z;
        InterfaceC5563Dkg[] interfaceC5563DkgArr4 = new InterfaceC5563Dkg[list.size()];
        this.A0K = interfaceC5563DkgArr4;
        while (i3 < interfaceC5563DkgArr4.length) {
            InterfaceC5563Dkg interfaceC5563DkgAhC = this.A0E.AhC(i5, 3);
            interfaceC5563DkgAhC.ABq(list.get(i3));
            interfaceC5563DkgArr4 = this.A0K;
            interfaceC5563DkgArr4[i3] = interfaceC5563DkgAhC;
            i3++;
            i5++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:483:0x0a93, code lost:
    
        r53.A02 = 0;
        r53.A00 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0aca, code lost:
    
        if (r53.A02 != 3) goto L532;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0ace, code lost:
    
        if (r9.A06 != false) goto L524;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0ad0, code lost:
    
        r2 = r9.A05.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0ad4, code lost:
    
        r53.A06 = r2[r9.A01];
        r2 = r9.A05.A03.A08.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0ae9, code lost:
    
        if (X.C6xC.A00(r2, "video/avc") == false) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0aeb, code lost:
    
        r2 = r53.A0M & 64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0aef, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0af0, code lost:
    
        if (r2 != 0) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0af2, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0af3, code lost:
    
        r53.A0I = !r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:505:0x0afb, code lost:
    
        if (r9.A01 >= r9.A03) goto L525;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0afd, code lost:
    
        r54.Afm(r53.A06);
        r1 = r9.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0b06, code lost:
    
        if (r1 == null) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0b08, code lost:
    
        r4 = r9.A0A;
        r3 = r4.A0G;
        r1 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0b0e, code lost:
    
        if (r1 == 0) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0b10, code lost:
    
        r3.A0S(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0b13, code lost:
    
        r2 = r9.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0b17, code lost:
    
        if (r4.A07 == false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0b1d, code lost:
    
        if (r4.A0E[r2] == false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0b1f, code lost:
    
        r3.A0S(r3.A0D() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0b2c, code lost:
    
        if (r9.A04() != false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0b2e, code lost:
    
        r53.A0F = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0b30, code lost:
    
        r53.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0b35, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0b3d, code lost:
    
        if (X.C6xC.A00(r2, "video/hevc") == false) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0b3f, code lost:
    
        r2 = r53.A0M & 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0b44, code lost:
    
        r2 = r9.A0A.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0b4f, code lost:
    
        if (r9.A05.A03.A02 != 1) goto L528;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0b51, code lost:
    
        r53.A06 -= 8;
        r54.Afm(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0b5b, code lost:
    
        r2 = "audio/ac4".equals(r9.A05.A03.A08.A0b);
        r1 = r53.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0b6b, code lost:
    
        if (r2 == false) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0b6d, code lost:
    
        r53.A04 = r9.A01(r1, 7);
        r1 = r53.A06;
        r2 = r53.A0S;
        X.AbstractC6355E2h.A04(r2, r1);
        r9.A09.Abv(r2, 7);
        r2 = r53.A04 + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0b84, code lost:
    
        r53.A04 = r2;
        r53.A06 += r2;
        r53.A02 = 4;
        r53.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0b91, code lost:
    
        r2 = r9.A05;
        r15 = r2.A03;
        r14 = r9.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0b99, code lost:
    
        if (r9.A06 != false) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0b9b, code lost:
    
        r18 = r2.A07[r9.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0ba1, code lost:
    
        r13 = r15.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0ba3, code lost:
    
        if (r13 == 0) goto L591;
     */
    /* JADX WARN: Code restructure failed: missing block: B:537:0x0ba5, code lost:
    
        r8 = r53.A0P;
        r6 = r8.A02;
        r6[0] = 0;
        r6[1] = 0;
        r6[2] = 0;
        r20 = 4 - r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0bb1, code lost:
    
        r1 = r53.A04;
        r2 = r53.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:539:0x0bb5, code lost:
    
        if (r1 >= r2) goto L754;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0bb7, code lost:
    
        r2 = r53.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:541:0x0bb9, code lost:
    
        if (r2 != 0) goto L755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0bbe, code lost:
    
        if (r53.A0K.length > 0) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0bc2, code lost:
    
        if (r53.A0I != false) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:0x0bc4, code lost:
    
        r2 = X.AbstractC6381E3i.A00(r15.A08);
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0bd1, code lost:
    
        if ((r13 + r2) > (r53.A06 - r53.A04)) goto L574;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0bd3, code lost:
    
        r54.readFully(r6, r20, r13 + r2);
        r1 = X.BV6.A05(r8, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0bde, code lost:
    
        if (r1 < 0) goto L756;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0be0, code lost:
    
        r53.A05 = r1 - r2;
        r3 = r53.A0Q;
        r3.A0R(0);
        r14.Abv(r3, 4);
        r53.A04 += 4;
        r53.A06 += r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0bfc, code lost:
    
        if (r53.A0K.length <= 0) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0bfe, code lost:
    
        if (r2 <= 0) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0c00, code lost:
    
        r4 = r15.A08;
        r16 = r6[4];
        r5 = r4.A0b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0c0d, code lost:
    
        if (X.C6xC.A00(r5, "video/avc") != false) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0c15, code lost:
    
        if (X.AbstractC6161Dx4.A0B(r4.A0W, "video/avc") == false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:558:0x0c1b, code lost:
    
        if ((r16 & 31) == 6) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0c24, code lost:
    
        if (X.C6xC.A00(r5, "video/hevc") != false) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0c2c, code lost:
    
        if (X.AbstractC6161Dx4.A0B(r4.A0W, "video/hevc") == false) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0c33, code lost:
    
        if (((r16 & 126) >> 1) != 39) goto L573;
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0c35, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0c36, code lost:
    
        r53.A0J = r1;
        r14.Abv(r8, r2);
        r53.A04 += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0c40, code lost:
    
        if (r2 <= 0) goto L763;
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0c44, code lost:
    
        if (r53.A0I != false) goto L764;
     */
    /* JADX WARN: Code restructure failed: missing block: B:571:0x0c4c, code lost:
    
        if (X.AbstractC6381E3i.A07(r15.A08, r6, r2) == false) goto L765;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0c4e, code lost:
    
        r53.A0I = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0c52, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0c54, code lost:
    
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0c59, code lost:
    
        if (r53.A0J == false) goto L588;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0c5b, code lost:
    
        r5 = r53.A0R;
        r5.A0P(r2);
        r54.readFully(r5.A02, 0, r2);
        r14.Abv(r5, r53.A05);
        r4 = r53.A05;
        r1 = X.AbstractC6381E3i.A01(r5.A02, r5.A00);
        r5.A0R(0);
        r5.A0Q(r1);
        r2 = r15.A08.A0F;
        r3 = r53.A0T;
        r1 = r3.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0c88, code lost:
    
        if (r2 != (-1)) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0c8a, code lost:
    
        if (r1 == 0) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0c8c, code lost:
    
        r3.A01(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0c8f, code lost:
    
        r3.A02(r5, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0c9a, code lost:
    
        if ((r9.A00() & 4) == 0) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0c9c, code lost:
    
        X.E33.A00(r3, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0c9f, code lost:
    
        r53.A04 += r4;
        r53.A05 -= r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0cad, code lost:
    
        if (r1 == r2) goto L581;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0caf, code lost:
    
        r3.A01(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:588:0x0cb3, code lost:
    
        r4 = r14.Abu(r54, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0cb8, code lost:
    
        r18 = r9.A0A.A0C[r9.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0cc2, code lost:
    
        r2 = r9.A01(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:591:0x0cc8, code lost:
    
        r1 = r53.A04;
        r2 = r53.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0ccc, code lost:
    
        if (r1 >= r2) goto L771;
     */
    /* JADX WARN: Code restructure failed: missing block: B:593:0x0cce, code lost:
    
        r53.A04 += r14.Abu(r54, r2 - r1, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:594:0x0cd9, code lost:
    
        r4 = r9.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0cdf, code lost:
    
        if (r53.A0I != false) goto L597;
     */
    /* JADX WARN: Code restructure failed: missing block: B:596:0x0ce1, code lost:
    
        r4 = r4 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0ce4, code lost:
    
        r1 = r9.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:598:0x0ce8, code lost:
    
        if (r1 == null) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:599:0x0cea, code lost:
    
        r1 = r1.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:600:0x0cec, code lost:
    
        r14.Abz(r1, r4, r2, 0, r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:601:0x0cf5, code lost:
    
        r2 = r53.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:602:0x0cfb, code lost:
    
        if (r2.isEmpty() != false) goto L767;
     */
    /* JADX WARN: Code restructure failed: missing block: B:603:0x0cfd, code lost:
    
        r3 = r2.removeFirst();
        r1 = r53.A03;
        r7 = r3.A00;
        r53.A03 = r1 - r7;
        r1 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:604:0x0d0e, code lost:
    
        if (r3.A02 == false) goto L606;
     */
    /* JADX WARN: Code restructure failed: missing block: B:605:0x0d10, code lost:
    
        r1 = r1 + r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:606:0x0d12, code lost:
    
        r6 = r53.A0L;
        r5 = r6.length;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:607:0x0d16, code lost:
    
        if (r4 >= r5) goto L770;
     */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0d18, code lost:
    
        r6[r4].Abz(null, 1, r7, r53.A03, r1);
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:609:0x0d2c, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:611:0x0d32, code lost:
    
        if (r9.A04() != false) goto L519;
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0d34, code lost:
    
        r53.A0F = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:615:0x0d46, code lost:
    
        throw X.BV6.A0V("Invalid NAL length", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:627:0x0d6d, code lost:
    
        r1 = X.C60O.A0x(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:629:0x0d7d, code lost:
    
        r1.append(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:631:0x0d88, code lost:
    
        throw X.BV7.A0c(r1.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x0d89 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r54, X.C5542DkK r55) throws androidx.media3.common.ParserException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 3472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6367E2u.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        SparseArray<C6371E2y> sparseArray = this.A0N;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).A03();
        }
        this.A0Y.clear();
        this.A03 = 0;
        this.A0T.A03.clear();
        this.A0A = j2;
        this.A0X.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public static DrmInitData A01(List<C6419E4v> list) {
        int size = list.size();
        ArrayList arrayListA0h = null;
        for (int i = 0; i < size; i++) {
            C6419E4v c6419E4v = list.get(i);
            if (((AbstractC6398E4a) c6419E4v).A00 == 1886614376) {
                if (arrayListA0h == null) {
                    arrayListA0h = C3cG.A0h();
                }
                byte[] bArr = c6419E4v.A00.A02;
                C5399Dhq c5399DhqA00 = AbstractC5508Djk.A00(bArr);
                if (c5399DhqA00 == null) {
                    CNC.A04("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayListA0h.add(new DrmInitData.SchemeData(null, HatchShareSheetRepository.MUTED_VIDEO_MIME, c5399DhqA00.A01, bArr));
                }
            }
        }
        if (arrayListA0h == null) {
            return null;
        }
        return new DrmInitData(null, (DrmInitData.SchemeData[]) arrayListA0h.toArray(new DrmInitData.SchemeData[0]), false);
    }

    public C6367E2u(InterfaceC5563Dkg interfaceC5563Dkg, InterfaceC5885DrL interfaceC5885DrL, List list, int i) {
        this.A0b = interfaceC5885DrL;
        this.A0M = i;
        this.A0Z = Collections.unmodifiableList(list);
        this.A0V = interfaceC5563Dkg;
        this.A0W = new DA0();
        this.A0O = BV6.A0Y(16);
        this.A0Q = BV6.A0Z(AbstractC6381E3i.A01);
        this.A0P = BV6.A0Y(6);
        this.A0R = BV6.A0X();
        byte[] bArr = new byte[16];
        this.A0a = bArr;
        this.A0S = BV6.A0Z(bArr);
        this.A0X = BV4.A0s();
        this.A0Y = BV4.A0s();
        this.A0N = BV4.A0B();
        this.A0G = ImmutableList.of();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = InterfaceC6413E4p.A00;
        this.A0L = new InterfaceC5563Dkg[0];
        this.A0K = new InterfaceC5563Dkg[0];
        this.A0T = new E33(new F5Y(this, 0));
        this.A0U = new C5592DlS();
        this.A0B = -1L;
    }
}
