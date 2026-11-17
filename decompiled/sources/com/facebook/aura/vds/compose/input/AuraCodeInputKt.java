package com.facebook.aura.vds.compose.input;

import X.ASj;
import X.AbstractC1046ASq;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.C1041ASi;
import X.C1050ASu;
import X.C10G;
import X.C1D3;
import X.C1D8;
import X.C1b8;
import X.C2HU;
import X.C78N;
import X.C79;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraCodeInputKt {
    public static final float CODE_CELL_BORDER_WIDTH = 2.0f;
    public static final float CODE_CELL_CURSOR_HEIGHT = 24.0f;
    public static final float CODE_CELL_CURSOR_WIDTH = 2.0f;
    public static final float CODE_CELL_DOT_SIZE = 14.0f;
    public static final C1D3 CODE_CELL_SHAPE = C1D8.A00(20.0f);
    public static final int CURSOR_BLINK_MILLIS = 500;
    public static final float DISABLED_ALPHA = 0.5f;

    /* renamed from: com.facebook.aura.vds.compose.input.AuraCodeInputKt$BlinkingCursor$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraCodeInputKt.BlinkingCursor(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.input.AuraCodeInputKt$CodeCell$2, reason: invalid class name and case insensitive filesystem */
    public final class C142892 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Character $char;
        public final /* synthetic */ boolean $isActive;
        public final /* synthetic */ boolean $isError;
        public final /* synthetic */ boolean $masked;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142892(Character ch, boolean z, boolean z2, boolean z3, BRg bRg, int i, int i2) {
            super(2);
            this.$char = ch;
            this.$masked = z;
            this.$isActive = z2;
            this.$isError = z3;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraCodeInputKt.CodeCell(this.$char, this.$masked, this.$isActive, this.$isError, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:169:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[PHI: r0
  0x0097: PHI (r0v17 int) = (r0v16 int), (r0v84 int) binds: [B:33:0x008b, B:36:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8 A[PHI: r0
  0x00a8: PHI (r0v19 int) = (r0v18 int), (r0v81 int) binds: [B:39:0x009c, B:42:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ba A[PHI: r0 r4
  0x00ba: PHI (r0v21 int) = (r0v20 int), (r0v78 int) binds: [B:45:0x00ad, B:48:0x00b3] A[DONT_GENERATE, DONT_INLINE]
  0x00ba: PHI (r4v1 int) = (r4v0 int), (r4v10 int) binds: [B:45:0x00ad, B:48:0x00b3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* renamed from: AuraCodeInput-OOXMnFM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m2586AuraCodeInputOOXMnFM(java.lang.String r42, X.G0U<? super java.lang.String, kotlin.Unit> r43, int r44, X.BRg r45, float r46, boolean r47, boolean r48, int r49, int r50, boolean r51, boolean r52, boolean r53, java.lang.String r54, java.lang.String r55, X.BFM r56, int r57, int r58, int r59) {
        /*
            Method dump skipped, instructions count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraCodeInputKt.m2586AuraCodeInputOOXMnFM(java.lang.String, X.G0U, int, X.BRg, float, boolean, boolean, int, int, boolean, boolean, boolean, java.lang.String, java.lang.String, X.BFM, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CodeCell(java.lang.Character r30, boolean r31, boolean r32, boolean r33, X.BRg r34, X.BFM r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.input.AuraCodeInputKt.CodeCell(java.lang.Character, boolean, boolean, boolean, X.BRg, X.BFM, int, int):void");
    }

    public static final void BlinkingCursor(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(308818748);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            C1050ASu c1050ASuA00 = AbstractC1046ASq.A00(new C1041ASi(new ASj(C2HU.A02, 500, 0), C79.A01, 0L), AbstractC1046ASq.A01(bfm), bfm, 1.0f, 0.0f);
            BRg bRgA0C = C10G.A0C(bRg, CODE_CELL_CURSOR_WIDTH, CODE_CELL_CURSOR_HEIGHT);
            boolean zA65 = bfm.A65(c1050ASuA00);
            Object objAaT = bfm.AaT();
            if (zA65 || objAaT == C78N.A00) {
                objAaT = new AuraCodeInputKt$BlinkingCursor$1$1(c1050ASuA00);
                bfm.Ai0(objAaT);
            }
            C1b8.A04(bfm, AnonymousClass001.A0W(bRgA0C, objAaT), C06G.A0D(bfm));
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i, i2);
        }
    }
}
