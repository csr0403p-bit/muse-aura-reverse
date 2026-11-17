package X;

import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.jvm.functions.Function0;

/* renamed from: X.0sT, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0sT {
    public static final C1003AOr<Float> A01 = new C1003AOr<>(null, 1.0f, 300.0f);
    public static final C1003AOr<AWx> A00 = new C1003AOr<>(null, 1.0f, 1500.0f);
    public static final C1003AOr<Float> A03 = new C1003AOr<>(null, 0.75f, 700.0f);
    public static final C1003AOr<AWx> A02 = new C1003AOr<>(null, 1.0f, 500.0f);

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/lang/String;LX/BRg;FLkotlin/jvm/functions/Function0<Ljava/lang/Float;>;LX/AOe<Ljava/lang/Float;>;LX/AOe<LX/AWx;>;LX/AOe<Ljava/lang/Float;>;Lkotlin/jvm/functions/Function0<Ljava/lang/Boolean;>;LX/G0W<-Ljava/lang/Boolean;-LX/BFM;-Ljava/lang/Integer;Lkotlin/Unit;>;LX/BFM;II)V */
    public static final void A00(AOe aOe, AOe aOe2, AOe aOe3, BFM bfm, BRg bRg, String str, String str2, Function0 function0, Function0 function02, G0W g0w, float f, int i, int i2) {
        BBb bBbAAc;
        C04831Xm c04831Xm;
        float f2 = f;
        BRg bRg2 = bRg;
        Function0 function03 = function0;
        AOe aOeA0E = aOe2;
        AOe aOeA0E2 = aOe3;
        Function0 function04 = function02;
        AnonymousClass002.A1F(str2, 1, g0w);
        bfm.AgG(1177477312);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f2);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0X(bfm, function03);
        }
        int i6 = i2 & 32;
        int iA02 = 196608;
        if (i6 != 0) {
            iA0d |= iA02;
        } else if ((i & 196608) == 0) {
            iA02 = AnonymousClass002.A02(AnonymousClass004.A1R(bfm, aOe, i, 262144) ? 1 : 0);
            iA0d |= iA02;
        }
        int i7 = i2 & 64;
        int iA01 = 1572864;
        if (i7 != 0) {
            iA0d |= iA01;
        } else if ((i & 1572864) == 0) {
            iA01 = AnonymousClass002.A01(AnonymousClass004.A1R(bfm, aOeA0E, i, 2097152) ? 1 : 0);
            iA0d |= iA01;
        }
        int i8 = i2 & 128;
        int i9 = 12582912;
        if (i8 != 0) {
            iA0d |= i9;
        } else if ((i & 12582912) == 0) {
            i9 = 4194304;
            if (AnonymousClass004.A1R(bfm, aOeA0E2, i, HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES)) {
                i9 = 8388608;
            }
            iA0d |= i9;
        }
        int i10 = i2 & 256;
        int iA0b = 100663296;
        if (i10 != 0) {
            iA0d |= iA0b;
        } else if ((i & 100663296) == 0) {
            i10 = 0;
            iA0b = AnonymousClass004.A0b(bfm, function04);
            iA0d |= iA0b;
        }
        if ((i & 805306368) == 0) {
            iA0d |= AnonymousClass004.A0c(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1I(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f2 = 0.0f;
            }
            if (i5 != 0) {
                Object objAaT = bfm.AaT();
                if (objAaT == C78N.A00) {
                    objAaT = new C05443bq(20);
                    bfm.Ai0(objAaT);
                }
                function03 = (Function0) objAaT;
            }
            if (i6 != 0) {
                aOe = AnonymousClass007.A0E();
            }
            if (i7 != 0) {
                aOeA0E = AnonymousClass007.A0E();
            }
            if (i8 != 0) {
                aOeA0E2 = AnonymousClass007.A0E();
            }
            if (i10 != 0) {
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == C78N.A00) {
                    objAaT2 = new C05443bq(21);
                    bfm.Ai0(objAaT2);
                }
                function04 = (Function0) objAaT2;
            }
            boolean zA08 = C1DG.A08(f2, 0.0f);
            BRg bRgA01 = BRg.A00;
            if (!zA08) {
                bRgA01 = C11U.A01(bRgA01, f2);
            }
            BRg bRgThen = bRg2.then(bRgA01);
            bfm.A6v(C0sU.A00);
            bfm.AgE(1229381981);
            InterfaceC1380AiA interfaceC1380AiAA0c = AnonymousClass001.A0c(true);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function05 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function05);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0c, akqA04, bRgA012, iA0J);
            AnonymousClass001.A1G(false, bfm, g0w, ((iA0d >> 24) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 6);
            BBI.A0R(bbi, true);
            bBbAAc = AnonymousClass001.A0L(bfm, bbi);
            if (bBbAAc == null) {
                return;
            } else {
                c04831Xm = new C04831Xm(aOe, aOeA0E, aOeA0E2, bRg2, str, str2, function03, function04, g0w, f2, i, i2, 0);
            }
        } else {
            bfm.Afo();
            bBbAAc = bfm.AAc();
            if (bBbAAc == null) {
                return;
            } else {
                c04831Xm = new C04831Xm(aOe, aOeA0E, aOeA0E2, bRg2, str, str2, function03, function04, g0w, f2, i, i2, 1);
            }
        }
        bBbAAc.A06 = c04831Xm;
    }
}
