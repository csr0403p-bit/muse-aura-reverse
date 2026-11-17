package com.facebook.aura.ui;

import X.B6A;
import X.BFM;
import X.BRg;
import X.C7384Etj;
import X.C78N;
import X.HtJ;
import X.HzP;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import org.maplibre.android.R;

/* loaded from: classes.dex */
public abstract class HatchHighlightGlowKt {
    public static final float HighlightGlowBlurRadius = 8.0f;
    public static final int HighlightGlowFadeInMs = 300;
    public static final int HighlightGlowFadeOutMs = 500;
    public static final float HighlightGlowPeakOpacity = 0.6f;
    public static final long HighlightGlowTotalMs = 800;

    @DebugMetadata(c = "com.facebook.aura.ui.HatchHighlightGlowKt", f = "HatchHighlightGlow.kt", l = {44, R.styleable.maplibre_MapView_maplibre_uiLogoMarginLeft, R.styleable.maplibre_MapView_maplibre_uiLogoMarginRight, R.styleable.maplibre_MapView_maplibre_uiLogoMarginTop}, m = "playHighlightGlow", v = 2)
    /* renamed from: com.facebook.aura.ui.HatchHighlightGlowKt$playHighlightGlow$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchHighlightGlowKt.playHighlightGlow(null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* renamed from: highlightGlow-uQhol8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.BRg m2317highlightGlowuQhol8o(X.BRg r15, kotlin.jvm.functions.Function0<java.lang.Float> r16, long r17, float r19, float r20, X.B6A r21, X.BFM r22, int r23, int r24) {
        /*
            r8 = r16
            r9 = r20
            r14 = r21
            r4 = r23
            boolean r1 = X.AnonymousClass002.A1a(r15, r8)
            r0 = r24 & 8
            r7 = 0
            if (r0 == 0) goto L12
            r9 = 0
        L12:
            r0 = r24 & 16
            if (r0 == 0) goto L17
            r14 = 0
        L17:
            r5 = r22
            java.lang.Object r13 = r5.AaT()
            java.lang.Object r3 = X.C78N.A00
            if (r13 != r3) goto L2c
            android.graphics.Paint r13 = new android.graphics.Paint
            r13.<init>()
            r13.setAntiAlias(r1)
            r5.Ai0(r13)
        L2c:
            android.graphics.Paint r13 = (android.graphics.Paint) r13
            r0 = r23 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L3c
            boolean r0 = r5.A65(r8)
            if (r0 != 0) goto L41
        L3c:
            r0 = r23 & 48
            r6 = 0
            if (r0 != r1) goto L42
        L41:
            r6 = 1
        L42:
            r0 = 57344(0xe000, float:8.0356E-41)
            r0 = r0 & r23
            r0 = r0 ^ 24576(0x6000, float:3.4438E-41)
            r2 = 16384(0x4000, float:2.2959E-41)
            if (r0 <= r2) goto L53
            boolean r0 = r5.A62(r9)
            if (r0 != 0) goto L58
        L53:
            r1 = r4 & 24576(0x6000, float:3.4438E-41)
            r0 = 0
            if (r1 != r2) goto L59
        L58:
            r0 = 1
        L59:
            r6 = r6 | r0
            r0 = r4 & 7168(0x1c00, float:1.0045E-41)
            r0 = r0 ^ 3072(0xc00, float:4.305E-42)
            r2 = 2048(0x800, float:2.87E-42)
            r10 = r19
            if (r0 <= r2) goto L6a
            boolean r0 = r5.A62(r10)
            if (r0 != 0) goto L6f
        L6a:
            r1 = r4 & 3072(0xc00, float:4.305E-42)
            r0 = 0
            if (r1 != r2) goto L70
        L6f:
            r0 = 1
        L70:
            r6 = r6 | r0
            r0 = r4 & 896(0x380, float:1.256E-42)
            r0 = r0 ^ 384(0x180, float:5.38E-43)
            r2 = 256(0x100, float:3.59E-43)
            r11 = r17
            if (r0 <= r2) goto L81
            boolean r0 = r5.A64(r11)
            if (r0 != 0) goto L86
        L81:
            r1 = r4 & 384(0x180, float:5.38E-43)
            r0 = 0
            if (r1 != r2) goto L87
        L86:
            r0 = 1
        L87:
            boolean r6 = X.AnonymousClass002.A1V(r5, r13, r6, r0)
            r0 = 458752(0x70000, float:6.42848E-40)
            r0 = r0 & r23
            r2 = 196608(0x30000, float:2.75506E-40)
            r0 = r0 ^ r2
            r1 = 131072(0x20000, float:1.83671E-40)
            if (r0 <= r1) goto L9c
            boolean r0 = r5.A65(r14)
            if (r0 != 0) goto La0
        L9c:
            r4 = r23 & r2
            if (r4 != r1) goto La1
        La0:
            r7 = 1
        La1:
            r6 = r6 | r7
            java.lang.Object r7 = r5.AaT()
            if (r6 != 0) goto Laa
            if (r7 != r3) goto Lb2
        Laa:
            com.facebook.aura.ui.HatchHighlightGlowKt$highlightGlow$2$1 r7 = new com.facebook.aura.ui.HatchHighlightGlowKt$highlightGlow$2$1
            r7.<init>(r8, r9, r10, r11, r13, r14)
            r5.Ai0(r7)
        Lb2:
            X.G0U r7 = (X.G0U) r7
            X.BRg r0 = X.AEk.A01(r15, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchHighlightGlowKt.m2317highlightGlowuQhol8o(X.BRg, kotlin.jvm.functions.Function0, long, float, float, X.B6A, X.BFM, int, int):X.BRg");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object playHighlightGlow(X.AT5<java.lang.Float, X.AOW> r9, X.HtJ<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.ui.HatchHighlightGlowKt.AnonymousClass1
            if (r0 == 0) goto L85
            r5 = r10
            com.facebook.aura.ui.HatchHighlightGlowKt$playHighlightGlow$1 r5 = (com.facebook.aura.ui.HatchHighlightGlowKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L85
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r2 = r5.result
            X.Hji r4 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r6 = 4
            r8 = 3
            r7 = 2
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L2d
            if (r0 == r1) goto L3f
            if (r0 == r7) goto L5c
            if (r0 == r8) goto L68
            if (r0 != r6) goto L8b
            X.Hwg.A00(r2)
        L2a:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L2d:
            X.Hwg.A00(r2)
            java.lang.Float r0 = X.AnonymousClass001.A0l()
            r5.L$0 = r9
            r5.label = r1
            java.lang.Object r0 = r9.A04(r0, r5)
            if (r0 != r4) goto L46
            return r4
        L3f:
            java.lang.Object r9 = r5.L$0
            X.AT5 r9 = (X.AT5) r9
            X.Hwg.A00(r2)
        L46:
            java.lang.Float r2 = X.AnonymousClass001.A0m()
            r1 = 300(0x12c, float:4.2E-43)
            r0 = 0
            X.ASj r0 = X.AnonymousClass001.A0K(r1, r0)
            r5.L$0 = r9
            r5.label = r7
            java.lang.Object r0 = X.AnonymousClass002.A0i(r9, r0, r2, r5, r3)
            if (r0 != r4) goto L63
            return r4
        L5c:
            java.lang.Object r9 = r5.L$0
            X.AT5 r9 = (X.AT5) r9
            X.Hwg.A00(r2)
        L63:
            r5.L$0 = r9
            r5.label = r8
            goto L6f
        L68:
            java.lang.Object r9 = r5.L$0
            X.AT5 r9 = (X.AT5) r9
            X.Hwg.A00(r2)
        L6f:
            java.lang.Float r2 = X.AnonymousClass001.A0l()
            r1 = 500(0x1f4, float:7.0E-43)
            r0 = 0
            X.ASj r0 = X.AnonymousClass001.A0K(r1, r0)
            r5.L$0 = r3
            r5.label = r6
            java.lang.Object r0 = X.AnonymousClass002.A0i(r9, r0, r2, r5, r3)
            if (r0 != r4) goto L2a
            return r4
        L85:
            com.facebook.aura.ui.HatchHighlightGlowKt$playHighlightGlow$1 r5 = new com.facebook.aura.ui.HatchHighlightGlowKt$playHighlightGlow$1
            r5.<init>(r10)
            goto L12
        L8b:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.ui.HatchHighlightGlowKt.playHighlightGlow(X.AT5, X.HtJ):java.lang.Object");
    }

    /* renamed from: highlightGlow-uQhol8o, reason: not valid java name */
    public static final BRg m2316highlightGlowuQhol8o(BRg bRg, float f, long j, float f2, float f3, B6A b6a, BFM bfm, int i, int i2) {
        float f4 = f3;
        B6A b6a2 = b6a;
        C7384Etj.A0Y(bRg, 0);
        if ((i2 & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 16) != 0) {
            b6a2 = null;
        }
        boolean z = (((i & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) ^ 48) > 32 && bfm.A62(f)) || (i & 48) == 32;
        Object objAaT = bfm.AaT();
        if (z || objAaT == C78N.A00) {
            objAaT = new HatchHighlightGlowKt$highlightGlow$1$1(f);
            bfm.Ai0(objAaT);
        }
        return m2317highlightGlowuQhol8o(bRg, (Function0<Float>) objAaT, j, f2, f4, b6a2, bfm, i & 524174, 0);
    }
}
