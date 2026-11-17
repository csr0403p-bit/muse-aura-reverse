package com.facebook.aura.partners.voice.ui;

import X.AEk;
import X.ATD;
import X.AWA;
import X.AaC;
import X.Ab3;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass005;
import X.BRg;
import X.C2J7;
import X.C3UC;
import X.C3cG;
import X.C7384Etj;
import X.C8j3;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class EmbodimentReferenceFramingKt {
    /* renamed from: embodimentReferenceBounds-e4CFRc8, reason: not valid java name */
    public static final AaC m1801embodimentReferenceBoundse4CFRc8(long j, long j2, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, float f) {
        float f2;
        float f3;
        if (referenceFraming != null) {
            f2 = referenceFraming.cropTopFraction;
            f3 = referenceFraming.cropBottomFraction;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        float fA01 = AnonymousClass001.A01(j, 4294967295L) * ((1.0f - f2) - f3);
        if (AWA.A06(j) || fA01 <= 0.0f) {
            return C2J7.A00(0L, j2);
        }
        float fA00 = AnonymousClass001.A00(j2);
        float fA002 = fA00 / AnonymousClass001.A00(j);
        float fA012 = AnonymousClass001.A01(j2, 4294967295L);
        float f4 = fA012 / fA01;
        long jA02 = AWA.A02(j, z ? Math.max(fA002, f4) : Math.min(fA002, f4));
        float fA013 = AnonymousClass001.A01(jA02, 4294967295L);
        float f5 = (-f2) * fA013;
        return C2J7.A00(AnonymousClass005.A0L(C8j3.A00(fA00, AnonymousClass001.A00(jA02)), f5 + ((((fA012 - fA013) + (f3 * fA013)) - f5) * ATD.A03(f, 0.0f, 1.0f))), jA02);
    }

    /* renamed from: embodimentReferenceFraming-5oXFXW4, reason: not valid java name */
    public static final BRg m1803embodimentReferenceFraming5oXFXW4(BRg bRg, AWA awa, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, Function0<Float> function0) {
        AnonymousClass002.A1C(bRg, 0, function0);
        return (awa == null || AWA.A06(awa.A00)) ? bRg : C3UC.A00(AEk.A03(bRg, new EmbodimentReferenceFramingKt$embodimentReferenceFraming$2(awa, referenceFraming, z, function0)), new EmbodimentReferenceFramingKt$embodimentReferenceFraming$3(awa, referenceFraming, z, function0));
    }

    /* renamed from: frameEmbodimentBitmap-eZhPAX0, reason: not valid java name */
    public static final Bitmap m1805frameEmbodimentBitmapeZhPAX0(Bitmap bitmap, long j, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, float f) {
        C7384Etj.A0Y(bitmap, 0);
        if (AWA.A06(j)) {
            return null;
        }
        AaC aaCM1801embodimentReferenceBoundse4CFRc8 = m1801embodimentReferenceBoundse4CFRc8((C8j3.A0P(bitmap.getHeight()) & 4294967295L) | (C8j3.A0P(bitmap.getWidth()) << 32), j, referenceFraming, z, f);
        int iA01 = Ab3.A01(AnonymousClass001.A00(j));
        float fA01 = AnonymousClass001.A01(j, 4294967295L);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iA01, Ab3.A01(fA01), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(HatchEmbodimentVideoKt.HATCH_VIDEO_FALLBACK_BACKDROP);
        float f2 = aaCM1801embodimentReferenceBoundse4CFRc8.A01;
        float f3 = aaCM1801embodimentReferenceBoundse4CFRc8.A03;
        float f4 = referenceFraming != null ? referenceFraming.cropTopFraction : 0.0f;
        float f5 = aaCM1801embodimentReferenceBoundse4CFRc8.A00;
        float f6 = f5 - f3;
        float fA03 = ATD.A03((f4 * f6) + f3, 0.0f, fA01);
        float f7 = aaCM1801embodimentReferenceBoundse4CFRc8.A02;
        canvas.clipRect(f2, fA03, f7, ATD.A03(f5 - ((referenceFraming != null ? referenceFraming.cropBottomFraction : 0.0f) * f6), 0.0f, fA01));
        canvas.translate(f2, f3);
        float width = (f7 - f2) / bitmap.getWidth();
        canvas.scale(width, width);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, new Paint(2));
        return bitmapCreateBitmap;
    }

    /* renamed from: embodimentReferenceBounds-e4CFRc8$default, reason: not valid java name */
    public static /* synthetic */ AaC m1802embodimentReferenceBoundse4CFRc8$default(long j, long j2, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            referenceFraming = null;
        }
        boolean zA1K = C3cG.A1K(i & 8, z);
        if ((i & 16) != 0) {
            f = 0.0f;
        }
        return m1801embodimentReferenceBoundse4CFRc8(j, j2, referenceFraming, zA1K, f);
    }

    /* renamed from: embodimentReferenceFraming-5oXFXW4$default, reason: not valid java name */
    public static /* synthetic */ BRg m1804embodimentReferenceFraming5oXFXW4$default(BRg bRg, AWA awa, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            referenceFraming = null;
        }
        boolean zA1O = AnonymousClass005.A1O(i, z);
        if ((i & 8) != 0) {
            function0 = EmbodimentReferenceFramingKt$embodimentReferenceFraming$1.INSTANCE;
        }
        return m1803embodimentReferenceFraming5oXFXW4(bRg, awa, referenceFraming, zA1O, function0);
    }

    /* renamed from: frameEmbodimentBitmap-eZhPAX0$default, reason: not valid java name */
    public static /* synthetic */ Bitmap m1806frameEmbodimentBitmapeZhPAX0$default(Bitmap bitmap, long j, VoiceEmbodimentMedia.ReferenceFraming referenceFraming, boolean z, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            referenceFraming = null;
        }
        boolean zA1K = C3cG.A1K(i & 8, z);
        if ((i & 16) != 0) {
            f = 0.0f;
        }
        return m1805frameEmbodimentBitmapeZhPAX0(bitmap, j, referenceFraming, zA1K, f);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /* renamed from: rememberEmbodimentReferencePlaceholder-eZhPAX0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.InterfaceC2178B0w m1807rememberEmbodimentReferencePlaceholdereZhPAX0(X.InterfaceC2178B0w r14, long r15, com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia.ReferenceFraming r17, X.BFM r18, int r19) {
        /*
            r6 = r19
            r0 = r19 & 14
            r2 = r0 ^ 6
            r9 = 4
            r11 = r14
            r4 = r18
            if (r2 <= r9) goto L12
            boolean r0 = r4.A65(r14)
            if (r0 != 0) goto L17
        L12:
            r0 = r19 & 6
            r10 = 0
            if (r0 != r9) goto L18
        L17:
            r10 = 1
        L18:
            r0 = r6 & 896(0x380, float:1.256E-42)
            r7 = r0 ^ 384(0x180, float:5.38E-43)
            r5 = 256(0x100, float:3.59E-43)
            r14 = r17
            if (r7 <= r5) goto L28
            boolean r0 = r4.A65(r14)
            if (r0 != 0) goto L2d
        L28:
            r1 = r6 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r5) goto L2e
        L2d:
            r0 = 1
        L2e:
            r10 = r10 | r0
            r0 = r19 & 112(0x70, float:1.57E-43)
            r1 = r0 ^ 48
            r8 = 32
            r12 = r15
            if (r1 <= r8) goto L3e
            boolean r0 = r4.A64(r12)
            if (r0 != 0) goto L43
        L3e:
            r3 = r19 & 48
            r0 = 0
            if (r3 != r8) goto L44
        L43:
            r0 = 1
        L44:
            r0 = r0 | r10
            java.lang.Object r15 = r4.AaT()
            if (r0 != 0) goto L4f
            java.lang.Object r0 = X.C78N.A00
            if (r15 != r0) goto L54
        L4f:
            r0 = 0
            androidx.compose.runtime.ParcelableSnapshotMutableState r15 = X.AbstractC1798ArH.A07(r0, r4)
        L54:
            androidx.compose.runtime.MutableState r15 = (androidx.compose.runtime.MutableState) r15
            X.AWA r3 = new X.AWA
            r3.<init>(r12)
            if (r2 <= r9) goto L63
            boolean r0 = r4.A67(r11)
            if (r0 != 0) goto L68
        L63:
            r0 = r19 & 6
            r2 = 0
            if (r0 != r9) goto L69
        L68:
            r2 = 1
        L69:
            if (r1 <= r8) goto L71
            boolean r0 = r4.A64(r12)
            if (r0 != 0) goto L76
        L71:
            r1 = r19 & 48
            r0 = 0
            if (r1 != r8) goto L77
        L76:
            r0 = 1
        L77:
            boolean r2 = X.AnonymousClass002.A1W(r4, r15, r2, r0)
            if (r7 <= r5) goto L83
            boolean r0 = r4.A65(r14)
            if (r0 != 0) goto L88
        L83:
            r1 = r6 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r5) goto L89
        L88:
            r0 = 1
        L89:
            r2 = r2 | r0
            java.lang.Object r10 = r4.AaT()
            if (r2 != 0) goto L94
            java.lang.Object r0 = X.C78N.A00
            if (r10 != r0) goto L9e
        L94:
            r16 = 0
            com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1 r10 = new com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt$rememberEmbodimentReferencePlaceholder$1$1
            r10.<init>(r11, r12, r14, r15, r16)
            X.BBI.A0T(r4, r10)
        L9e:
            X.G0V r10 = (X.G0V) r10
            X.C78e.A02(r4, r11, r14, r3, r10)
            java.lang.Object r0 = r15.getValue()
            X.B0w r0 = (X.InterfaceC2178B0w) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.partners.voice.ui.EmbodimentReferenceFramingKt.m1807rememberEmbodimentReferencePlaceholdereZhPAX0(X.B0w, long, com.facebook.aura.partners.voice.intf.VoiceEmbodimentMedia$ReferenceFraming, X.BFM, int):X.B0w");
    }
}
