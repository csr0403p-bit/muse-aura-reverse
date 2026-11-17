package X;

import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;

/* renamed from: X.Avk, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC1979Avk {
    public static final AbstractC2062AxZ A01 = new C1988Avt(C2VU.A05);
    public static final AbstractC2062AxZ A00 = new C1987Avs(C2VU.A02);

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/1Yd;LX/Ado;LX/1AC;IILX/Avu;LX/G0W<-LX/0A3;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0174  */
    @kotlin.Deprecated(message = "The overflow parameter has been deprecated")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.InterfaceC04981Yd r21, X.InterfaceC1185Ado r22, X.C1989Avu r23, X.BFM r24, X.C1AC r25, X.BRg r26, final X.G0W r27, int r28, int r29, final int r30, final int r31) {
        /*
            Method dump skipped, instructions count: 579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1979Avk.A01(X.1Yd, X.Ado, X.Avu, X.BFM, X.1AC, X.BRg, X.G0W, int, int, int, int):void");
    }

    /* JADX WARN: Incorrect types in method signature: (LX/BRg;LX/1Yd;LX/Ado;LX/1AC;IILX/G0W<-LX/0A3;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A02(InterfaceC04981Yd interfaceC04981Yd, InterfaceC1185Ado interfaceC1185Ado, BFM bfm, C1AC c1ac, BRg bRg, final G0W g0w, int i, int i2, final int i3, final int i4) {
        int i5 = i;
        int i6 = i2;
        BRg bRg2 = bRg;
        InterfaceC04981Yd interfaceC04981Yd2 = interfaceC04981Yd;
        InterfaceC1185Ado interfaceC1185Ado2 = interfaceC1185Ado;
        C1AC c1ac2 = c1ac;
        bfm.AgG(-1303174015);
        int i7 = i4 & 1;
        int iA0d = i7 != 0 ? i3 | 6 : (i3 & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg2) | i3 : i3;
        int i8 = i4 & 2;
        if (i8 != 0) {
            iA0d |= 48;
        } else if ((i3 & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, interfaceC04981Yd);
        }
        int i9 = i4 & 4;
        if (i9 != 0) {
            iA0d |= 384;
        } else if ((i3 & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, interfaceC1185Ado);
        }
        int i10 = i4 & 8;
        if (i10 != 0) {
            iA0d |= 3072;
        } else if ((i3 & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, c1ac2);
        }
        int i11 = i4 & 16;
        if (i11 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i3 & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0G(bfm, i5);
        }
        int i12 = i4 & 32;
        int iA0H = 196608;
        if (i12 != 0) {
            iA0d |= iA0H;
        } else if ((196608 & i3) == 0) {
            iA0H = AnonymousClass004.A0H(bfm, i6);
            iA0d |= iA0H;
        }
        if ((i3 & 1572864) == 0) {
            iA0d |= AnonymousClass004.A0Z(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1H(iA0d), bfm, iA0d)) {
            if (i7 != 0) {
                bRg2 = BRg.A00;
            }
            if (i8 != 0) {
                interfaceC04981Yd2 = AcQ.A01;
            }
            if (i9 != 0) {
                interfaceC1185Ado2 = AcQ.A06;
            }
            if (i10 != 0) {
                c1ac2 = C2VU.A05;
            }
            if (i11 != 0) {
                i5 = Integer.MAX_VALUE;
            }
            if (i12 != 0) {
                i6 = Integer.MAX_VALUE;
            }
            InterfaceC04981Yd interfaceC04981Yd3 = interfaceC04981Yd2;
            A01(interfaceC04981Yd3, interfaceC1185Ado2, C1989Avu.A01, bfm, c1ac2, bRg2, g0w, i5, i6, AnonymousClass001.A0C(iA0d << 3, AnonymousClass004.A02(iA0d, AnonymousClass003.A06(iA0d, (iA0d & 14) | 1572864))), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            final InterfaceC04981Yd interfaceC04981Yd4 = interfaceC04981Yd2;
            final InterfaceC1185Ado interfaceC1185Ado3 = interfaceC1185Ado2;
            final C1AC c1ac3 = c1ac2;
            final BRg bRg3 = bRg2;
            final int i13 = i5;
            final int i14 = i6;
            bBbAAc.A06 = new G0V() { // from class: X.0Cg
                @Override // X.G0V
                public final Object invoke(Object obj, Object obj2) {
                    BRg bRg4 = bRg3;
                    InterfaceC04981Yd interfaceC04981Yd5 = interfaceC04981Yd4;
                    InterfaceC1185Ado interfaceC1185Ado4 = interfaceC1185Ado3;
                    C1AC c1ac4 = c1ac3;
                    int i15 = i13;
                    int i16 = i14;
                    G0W g0w2 = g0w;
                    int i17 = i3;
                    AbstractC1979Avk.A02(interfaceC04981Yd5, interfaceC1185Ado4, (BFM) obj, c1ac4, bRg4, g0w2, i15, i16, AnonymousClass011.A00(i17), i4);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final long A00(C3TG c3tg, G0U g0u, long j) {
        int iA0Z;
        int iA0Y;
        C1983Avo c1983AvoA00 = AbstractC2103AyT.A00(c3tg);
        if (c1983AvoA00 == null || c1983AvoA00.A00 == 0.0f) {
            AbstractC2103AyT.A00(c3tg);
            AZE azeAQW = c3tg.AQW(j);
            g0u.invoke(azeAQW);
            iA0Z = azeAQW.A0Z();
            iA0Y = azeAQW.A0Y();
        } else {
            iA0Z = c3tg.AQq(Integer.MAX_VALUE);
            iA0Y = c3tg.AQo(iA0Z);
        }
        return C8j3.A0T(iA0Z, iA0Y);
    }
}
