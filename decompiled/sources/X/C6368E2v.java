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

/* renamed from: X.E2v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6368E2v implements InterfaceC5458Dit {
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
    public C6370E2x A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC5563Dkg[] A0I;
    public InterfaceC5563Dkg[] A0J;
    public final int A0K;
    public final SparseArray<C6370E2x> A0L;
    public final E1P A0M;
    public final E1P A0N;
    public final E1P A0O;
    public final E1P A0P;
    public final E1P A0Q;
    public final E33 A0R;
    public final C5592DlS A0S;
    public final InterfaceC5563Dkg A0T;
    public final DA0 A0U;
    public final ArrayDeque<C6358E2k> A0V;
    public final ArrayDeque<E56> A0W;
    public final List<C6154Dwx> A0X;
    public final byte[] A0Y;
    public static final byte[] A0a = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final C6154Dwx A0Z = C6162Dx5.A02(C6162Dx5.A00(), "application/x-emsg");

    public C6368E2v() {
        this(null, Collections.EMPTY_LIST, 0);
    }

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ InterfaceC5458Dit AMF() {
        return this;
    }

    @Override // X.InterfaceC5458Dit
    public final boolean Afs(E2K e2k) {
        return AnonymousClass002.A1Y(AbstractC6360E2m.A00(e2k, true));
    }

    @Override // X.InterfaceC5458Dit
    public final void release() {
    }

    public static Pair<Long, C5591DlR> A01(E1P e1p, long j) throws ParserException {
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

    public static void A03(E1P e1p, E3G e3g, int i) throws ParserException {
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
    public final void ANb(InterfaceC6413E4p interfaceC6413E4p) {
        int i;
        this.A0E = interfaceC6413E4p;
        this.A02 = 0;
        this.A00 = 0;
        InterfaceC5563Dkg[] interfaceC5563DkgArr = new InterfaceC5563Dkg[2];
        this.A0J = interfaceC5563DkgArr;
        InterfaceC5563Dkg interfaceC5563Dkg = this.A0T;
        int i2 = 0;
        if (interfaceC5563Dkg != null) {
            interfaceC5563DkgArr[0] = interfaceC5563Dkg;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.A0K & 4) != 0) {
            interfaceC5563DkgArr[i] = interfaceC6413E4p.AhC(100, 5);
            i3 = FlipperNoiseReporter.SWITCHING_PROTOCOLS_STATUS_CODE;
            i++;
        }
        InterfaceC5563Dkg[] interfaceC5563DkgArr2 = this.A0J;
        C1G.A07(BV7.A1S(i, interfaceC5563DkgArr2.length));
        InterfaceC5563Dkg[] interfaceC5563DkgArr3 = (InterfaceC5563Dkg[]) Arrays.copyOf(interfaceC5563DkgArr2, i);
        this.A0J = interfaceC5563DkgArr3;
        for (InterfaceC5563Dkg interfaceC5563Dkg2 : interfaceC5563DkgArr3) {
            interfaceC5563Dkg2.ABq(A0Z);
        }
        List<C6154Dwx> list = this.A0X;
        InterfaceC5563Dkg[] interfaceC5563DkgArr4 = new InterfaceC5563Dkg[list.size()];
        this.A0I = interfaceC5563DkgArr4;
        while (i2 < interfaceC5563DkgArr4.length) {
            InterfaceC5563Dkg interfaceC5563DkgAhC = this.A0E.AhC(i3, 3);
            interfaceC5563DkgAhC.ABq(list.get(i2));
            interfaceC5563DkgArr4 = this.A0I;
            interfaceC5563DkgArr4[i2] = interfaceC5563DkgAhC;
            i2++;
            i3++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:483:0x0a8b, code lost:
    
        r48.A02 = 0;
        r48.A00 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0abb, code lost:
    
        if (r48.A02 != 3) goto L521;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0abf, code lost:
    
        if (r13.A06 != false) goto L513;
     */
    /* JADX WARN: Code restructure failed: missing block: B:495:0x0ac1, code lost:
    
        r1 = r13.A05.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0ac5, code lost:
    
        r4 = r13.A01;
        r2 = r1[r4];
        r48.A06 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0acd, code lost:
    
        if (r4 >= r13.A03) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x0acf, code lost:
    
        r49.Afm(r2);
        r1 = r13.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0ad6, code lost:
    
        if (r1 == null) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x0ad8, code lost:
    
        r4 = r13.A0A;
        r3 = r4.A0G;
        r1 = r1.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0ade, code lost:
    
        if (r1 == 0) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0ae0, code lost:
    
        r3.A0S(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0ae3, code lost:
    
        r2 = r13.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0ae7, code lost:
    
        if (r4.A07 == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0aed, code lost:
    
        if (r4.A0E[r2] == false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0aef, code lost:
    
        r3.A0S(r3.A0D() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:509:0x0afc, code lost:
    
        if (r13.A04() != false) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:510:0x0afe, code lost:
    
        r48.A0F = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:511:0x0b02, code lost:
    
        r48.A02 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:512:0x0b07, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:513:0x0b08, code lost:
    
        r1 = r13.A0A.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0b13, code lost:
    
        if (r13.A05.A03.A02 != 1) goto L517;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x0b15, code lost:
    
        r48.A06 = r2 - 8;
        r49.Afm(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0b1d, code lost:
    
        r2 = "audio/ac4".equals(r13.A05.A03.A08.A0b);
        r1 = r48.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:518:0x0b2d, code lost:
    
        if (r2 == false) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:519:0x0b2f, code lost:
    
        r48.A04 = r13.A01(r1, 7);
        r1 = r48.A06;
        r2 = r48.A0Q;
        X.AbstractC6355E2h.A04(r2, r1);
        r13.A09.Abv(r2, 7);
        r2 = r48.A04 + 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:520:0x0b46, code lost:
    
        r48.A04 = r2;
        r48.A06 += r2;
        r48.A02 = 4;
        r48.A05 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:521:0x0b53, code lost:
    
        r2 = r13.A05;
        r15 = r2.A03;
        r12 = r13.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:522:0x0b5b, code lost:
    
        if (r13.A06 != false) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:523:0x0b5d, code lost:
    
        r1 = r2.A07[r13.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:524:0x0b63, code lost:
    
        r4 = r15.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:525:0x0b65, code lost:
    
        if (r4 == 0) goto L565;
     */
    /* JADX WARN: Code restructure failed: missing block: B:526:0x0b67, code lost:
    
        r10 = r48.A0O;
        r9 = r10.A02;
        r9[0] = 0;
        r9[1] = 0;
        r9[2] = 0;
        r19 = r4 + 1;
        r18 = 4 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0b79, code lost:
    
        if (r48.A04 >= r48.A06) goto L739;
     */
    /* JADX WARN: Code restructure failed: missing block: B:529:0x0b7b, code lost:
    
        r4 = r48.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:530:0x0b7d, code lost:
    
        if (r4 != 0) goto L740;
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0b7f, code lost:
    
        r49.readFully(r9, r18, r19);
        r3 = X.BV6.A05(r10, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:532:0x0b8a, code lost:
    
        if (r3 < 1) goto L741;
     */
    /* JADX WARN: Code restructure failed: missing block: B:533:0x0b8c, code lost:
    
        r48.A05 = r3 - 1;
        r4 = r48.A0P;
        r4.A0R(0);
        r12.Abv(r4, 4);
        r12.Abv(r10, 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0ba0, code lost:
    
        if (r48.A0I.length <= 0) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:535:0x0ba2, code lost:
    
        r5 = r15.A08.A0b;
        r6 = r9[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:0x0baf, code lost:
    
        if ("video/avc".equals(r5) == false) goto L539;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0bb5, code lost:
    
        if ((r6 & 31) == 6) goto L543;
     */
    /* JADX WARN: Code restructure failed: missing block: B:540:0x0bbe, code lost:
    
        if ("video/hevc".equals(r5) == false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:542:0x0bc5, code lost:
    
        if (((r6 & 126) >> 1) != 39) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:543:0x0bc7, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:544:0x0bc8, code lost:
    
        r48.A0H = r3;
        r48.A04 += 5;
        r48.A06 += r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:545:0x0bd7, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:547:0x0bdb, code lost:
    
        if (r48.A0H == false) goto L562;
     */
    /* JADX WARN: Code restructure failed: missing block: B:548:0x0bdd, code lost:
    
        r8 = r48.A0N;
        r8.A0P(r4);
        r49.readFully(r8.A02, 0, r4);
        r12.Abv(r8, r48.A05);
        r6 = r48.A05;
        r16 = X.AbstractC6381E3i.A01(r8.A02, r8.A00);
        r4 = r15.A08;
        r8.A0R("video/hevc".equals(r4.A0b) ? 1 : 0);
        r8.A0Q(r16);
        r5 = r48.A0R;
     */
    /* JADX WARN: Code restructure failed: missing block: B:549:0x0c0b, code lost:
    
        if (r5 == null) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:550:0x0c0d, code lost:
    
        r4 = r4.A0F;
        r3 = r5.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:551:0x0c17, code lost:
    
        if (r4 != (-1)) goto L558;
     */
    /* JADX WARN: Code restructure failed: missing block: B:552:0x0c19, code lost:
    
        if (r3 == 0) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:553:0x0c1b, code lost:
    
        r5.A01(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:554:0x0c1e, code lost:
    
        r5.A02(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:555:0x0c27, code lost:
    
        if ((r13.A00() & 4) == 0) goto L557;
     */
    /* JADX WARN: Code restructure failed: missing block: B:556:0x0c29, code lost:
    
        X.E33.A00(r5, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:557:0x0c2c, code lost:
    
        r48.A04 += r6;
        r48.A05 -= r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:559:0x0c3a, code lost:
    
        if (r3 == r4) goto L554;
     */
    /* JADX WARN: Code restructure failed: missing block: B:560:0x0c3c, code lost:
    
        r5.A01(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:561:0x0c40, code lost:
    
        X.E3M.A00(r8, r48.A0I, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:562:0x0c46, code lost:
    
        r6 = r12.Abu(r49, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:563:0x0c4b, code lost:
    
        r1 = r13.A0A.A0C[r13.A01];
     */
    /* JADX WARN: Code restructure failed: missing block: B:564:0x0c55, code lost:
    
        r2 = r13.A01(r1, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:565:0x0c5b, code lost:
    
        r4 = r48.A04;
        r3 = r48.A06;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0c5f, code lost:
    
        if (r4 >= r3) goto L750;
     */
    /* JADX WARN: Code restructure failed: missing block: B:567:0x0c61, code lost:
    
        r48.A04 += r12.Abu(r49, r3 - r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:568:0x0c6c, code lost:
    
        r6 = r13.A00();
        r3 = r13.A02();
     */
    /* JADX WARN: Code restructure failed: missing block: B:569:0x0c74, code lost:
    
        if (r3 == null) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:570:0x0c76, code lost:
    
        r5 = r3.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:572:0x0c7e, code lost:
    
        if (X.AbstractC5653Dmh.A03(X.EnumC5618Dlz.A1x) != false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:573:0x0c80, code lost:
    
        r3 = r48.A0F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:574:0x0c82, code lost:
    
        if (r3 == null) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:576:0x0c92, code lost:
    
        if ("application/x-mp4-vtt".equals(r3.A05.A03.A08.A0b) == false) goto L578;
     */
    /* JADX WARN: Code restructure failed: missing block: B:577:0x0c94, code lost:
    
        r6 = r6 | 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:578:0x0c96, code lost:
    
        r12.Abz(r5, r6, r48.A06, 0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:579:0x0c9f, code lost:
    
        r4 = r48.A0W;
     */
    /* JADX WARN: Code restructure failed: missing block: B:580:0x0ca5, code lost:
    
        if (r4.isEmpty() != false) goto L746;
     */
    /* JADX WARN: Code restructure failed: missing block: B:581:0x0ca7, code lost:
    
        r5 = r4.removeFirst();
        r3 = r48.A03;
        r9 = r5.A00;
        r48.A03 = r3 - r9;
        r3 = r5.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:582:0x0cb8, code lost:
    
        if (r5.A02 == false) goto L584;
     */
    /* JADX WARN: Code restructure failed: missing block: B:583:0x0cba, code lost:
    
        r3 = r3 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:584:0x0cbb, code lost:
    
        r8 = r48.A0J;
        r7 = r8.length;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:585:0x0cbf, code lost:
    
        if (r6 >= r7) goto L749;
     */
    /* JADX WARN: Code restructure failed: missing block: B:586:0x0cc1, code lost:
    
        r8[r6].Abz(null, 1, r9, r48.A03, r3);
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:587:0x0cd5, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:589:0x0cdb, code lost:
    
        if (r13.A04() != false) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:590:0x0cdd, code lost:
    
        r48.A0F = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:592:0x0ceb, code lost:
    
        r1 = "Invalid NAL length";
     */
    /* JADX WARN: Code restructure failed: missing block: B:595:0x0cf6, code lost:
    
        throw X.BV6.A0V(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:610:0x0d1f, code lost:
    
        r1 = X.C60O.A0x(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:612:0x0d2f, code lost:
    
        r1.append(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:614:0x0d3a, code lost:
    
        throw X.BV7.A0c(r1.toString());
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0d3b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // X.InterfaceC5458Dit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int AZ4(X.E2K r49, X.C5542DkK r50) throws androidx.media3.common.ParserException, java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 3394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6368E2v.AZ4(X.E2K, X.DkK):int");
    }

    @Override // X.InterfaceC5458Dit
    public final void AcL(long j, long j2) {
        SparseArray<C6370E2x> sparseArray = this.A0L;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            sparseArray.valueAt(i).A03();
        }
        this.A0W.clear();
        this.A03 = 0;
        E33 e33 = this.A0R;
        if (e33 != null) {
            e33.A03.clear();
        }
        this.A0A = j2;
        this.A0V.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public static long A00(E1P e1p) throws ParserException {
        if (BV8.A06(e1p) != 1) {
            return e1p.A0H();
        }
        if (!AbstractC5653Dmh.A03(EnumC5618Dlz.A1q)) {
            return e1p.A0I();
        }
        long jA0G = e1p.A0G();
        if (jA0G < 0) {
            throw BV7.A0c(FGI.A0J("Corrupt tfdt: baseMediaDecodeTime has bit 63 set (", jA0G, ")"));
        }
        return jA0G;
    }

    public static DrmInitData A02(List<C6419E4v> list) {
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

    @Override // X.InterfaceC5458Dit
    public final /* synthetic */ List AKl() {
        return ImmutableList.of();
    }

    public C6368E2v(InterfaceC5563Dkg interfaceC5563Dkg, List list, int i) {
        E33 e33;
        this.A0K = i;
        this.A0X = Collections.unmodifiableList(list);
        this.A0T = interfaceC5563Dkg;
        this.A0U = new DA0();
        this.A0M = BV6.A0Y(16);
        this.A0P = BV6.A0Z(AbstractC6381E3i.A01);
        this.A0O = BV6.A0Y(5);
        this.A0N = BV6.A0X();
        byte[] bArr = new byte[16];
        this.A0Y = bArr;
        this.A0Q = BV6.A0Z(bArr);
        this.A0V = BV4.A0s();
        this.A0W = BV4.A0s();
        this.A0L = BV4.A0B();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = InterfaceC6413E4p.A00;
        this.A0J = new InterfaceC5563Dkg[0];
        this.A0I = new InterfaceC5563Dkg[0];
        if (AbstractC5653Dmh.A03(EnumC5618Dlz.A0t)) {
            e33 = new E33(new F5Y(this, 1));
        } else {
            e33 = null;
        }
        this.A0R = e33;
        this.A0S = new C5592DlS();
        this.A0B = -1L;
    }
}
