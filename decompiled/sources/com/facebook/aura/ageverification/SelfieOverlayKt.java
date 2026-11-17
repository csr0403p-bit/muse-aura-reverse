package com.facebook.aura.ageverification;

import X.AGI;
import X.AHD;
import X.ART;
import X.AT3;
import X.AT5;
import X.AT8;
import X.ATD;
import X.AW9;
import X.AWA;
import X.AWx;
import X.AaI;
import X.AaJ;
import X.AbstractC1561Alb;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0zJ;
import X.C1710Aot;
import X.C1BO;
import X.C3cG;
import X.C7384Etj;
import X.C78N;
import X.C8j3;
import X.C8j4;
import X.G0U;
import X.G0V;
import X.InterfaceC1279AgP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class SelfieOverlayKt {
    public static final int COMPLETION_FLASH_FADE_MS = 200;
    public static final long COMPLETION_FLASH_HOLD_MS = 400;
    public static final float LEFT_ARC_CENTER = 180.0f;
    public static final float RIGHT_ARC_CENTER = 0.0f;
    public static final float RING_ARC_SPAN_DEGREES = 86.0f;
    public static final float SELFIE_RING_INSET = 12.0f;
    public static final float TOP_ARC_CENTER = 270.0f;

    /* renamed from: com.facebook.aura.ageverification.SelfieOverlayKt$SelfieMovementOverlay$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HeadMovement $current;
        public final /* synthetic */ AHD<CompletionFlash> $flashes;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Float> $progress;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HeadMovement headMovement, Function0<Float> function0, AHD<CompletionFlash> ahd, BRg bRg, int i, int i2) {
            super(2);
            this.$current = headMovement;
            this.$progress = function0;
            this.$flashes = ahd;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieOverlayKt.SelfieMovementOverlay(this.$current, this.$progress, this.$flashes, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: drawRingArc-3IgeMak, reason: not valid java name */
    public static final void m230drawRingArc3IgeMak(AT3 at3, long j, AaJ aaJ, float f, float f2, float f3) {
        if (f3 > 0.0f) {
            float fA03 = ATD.A03(f3, 0.0f, 1.0f) * 86.0f;
            long jADU = at3.ADU();
            long jA0P = C8j3.A0P(f);
            at3.A9K(null, aaJ, f2 - (fA03 / 2.0f), fA03, 1.0f, 3, j, AWx.A04(jADU, (jA0P << 32) | (jA0P & 4294967295L)), C8j4.A0J(2.0f * f), false);
        }
    }

    public static final AHD<CompletionFlash> rememberCompletionFlashes(AHD<? extends HeadMovement> ahd, BFM bfm, int i) {
        C7384Etj.A0Y(ahd, 0);
        bfm.AgE(1551093622);
        ArrayList arrayListA0i = AnonymousClass003.A0i(ahd);
        for (HeadMovement headMovement : ahd) {
            bfm.Ag8(-2092238489, headMovement);
            CompletionFlash completionFlash = new CompletionFlash(headMovement, completionFlash(bfm, 0));
            AnonymousClass001.A1D(bfm);
            arrayListA0i.add(completionFlash);
        }
        AnonymousClass001.A1D(bfm);
        return AGI.A07(arrayListA0i);
    }

    /* loaded from: classes3.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HeadMovement.values().length];
            try {
                AnonymousClass002.A13(HeadMovement.RIGHT, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HeadMovement.UP, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(HeadMovement.LEFT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void SelfieMovementOverlay(HeadMovement headMovement, Function0<Float> function0, AHD<CompletionFlash> ahd, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass003.A0x(function0, ahd);
        bfm.AgG(888075265);
        int iA0D = (i & 6) == 0 ? AnonymousClass004.A0D(bfm, AnonymousClass003.A0K(headMovement)) | i : i;
        if ((i & 48) == 0) {
            iA0D |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, ahd);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0D |= 3072;
        } else if ((i & 3072) == 0) {
            iA0D |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            long j = auraTheme.getColors(bfm, 6).background;
            long j2 = auraTheme.getColors(bfm, 6).elevatedBorder;
            long j3 = auraTheme.getColors(bfm, 6).accent;
            long j4 = auraTheme.getColors(bfm, 6).success;
            boolean zA1T = AnonymousClass002.A1T(bfm, j3, AnonymousClass002.A1T(bfm, j4, bfm.A64(j) | bfm.A64(j2), AnonymousClass004.A1K(iA0D)), AnonymousClass004.A1F(iA0D)) | ((iA0D & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) == 32);
            Object objAaT = bfm.AaT();
            if (zA1T || objAaT == C78N.A00) {
                objAaT = new SelfieOverlayKt$SelfieMovementOverlay$1$1(j, j2, ahd, headMovement, j3, function0, j4);
                BBI.A0T(bfm, objAaT);
            }
            C0zJ.A00(bRg2, (G0U) objAaT, bfm, (iA0D >> 9) & 14);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(headMovement, function0, ahd, bRg2, i, i2);
        }
    }

    /* renamed from: drawSelfieFrame-IbeAmgk, reason: not valid java name */
    public static final float m231drawSelfieFrameIbeAmgk(AT3 at3, long j, long j2, AaJ aaJ) {
        float fA01 = AWA.A01(at3.AKb()) / 2.0f;
        float f = SELFIE_RING_INSET;
        float fAh4 = fA01 - at3.Ah4(2.0f * f);
        C1710Aot c1710AotA00 = AbstractC1561Alb.A00();
        long jADU = at3.ADU();
        float fA03 = AnonymousClass003.A03(jADU);
        float fA00 = AnonymousClass004.A00(jADU);
        c1710AotA00.A00(C8j3.A0f(fA03 - fAh4, fA00 - fAh4, fA03 + fAh4, fA00 + fAh4));
        InterfaceC1279AgP interfaceC1279AgPAEq = at3.AEq();
        AaI aaI = (AaI) interfaceC1279AgPAEq;
        AW9 aw9 = aaI.A02.A02;
        long jA00 = AW9.A00(aw9);
        try {
            aaI.A01.A6M(c1710AotA00, 0);
            ART.A03(null, at3, 0.0f, 126, j, 0L, 0L);
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            float fAh42 = fAh4 + at3.Ah4(f);
            Iterator<HeadMovement> it = HeadMovement.getEntries().iterator();
            while (it.hasNext()) {
                m230drawRingArc3IgeMak(at3, j2, aaJ, fAh42, getArcCenter(it.next()), 1.0f);
            }
            return fAh42;
        } catch (Throwable th) {
            AW9.A02(aw9, interfaceC1279AgPAEq, jA00);
            throw th;
        }
    }

    public static final float getSELFIE_RING_INSET() {
        return SELFIE_RING_INSET;
    }

    public static final C1BO<Float> completionFlash(BFM bfm, int i) {
        Object objAaT = bfm.AaT();
        Object obj = C78N.A00;
        if (objAaT == obj) {
            objAaT = AT8.A00(1.0f);
            bfm.Ai0(objAaT);
        }
        AT5 at5 = (AT5) objAaT;
        boolean zA67 = bfm.A67(at5);
        Object objAaT2 = bfm.AaT();
        if (zA67 || objAaT2 == obj) {
            objAaT2 = new SelfieOverlayKt$completionFlash$1$1(at5, null);
            BBI.A0T(bfm, objAaT2);
        }
        AnonymousClass001.A18(bfm, objAaT2, at5);
        return at5.A04;
    }

    public static final float getArcCenter(HeadMovement headMovement) {
        int iOrdinal = headMovement.ordinal();
        if (iOrdinal == 0) {
            return 0.0f;
        }
        if (iOrdinal == 1) {
            return 270.0f;
        }
        if (iOrdinal == 2) {
            return 180.0f;
        }
        throw C3cG.A0q();
    }
}
