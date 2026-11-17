package com.facebook.aura.conversation.view.typewritertext;

import X.ATD;
import X.AbstractC1913AtY;
import X.AbstractC7559F3s;
import X.Am0;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.B6A;
import X.BBb;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C0Hi;
import X.C0v5;
import X.C1731ApS;
import X.C1786Aqw;
import X.C1809ArT;
import X.C1824Aro;
import X.C1JY;
import X.C78N;
import X.C79;
import X.G0V;
import X.G0W;
import X.HDi;
import X.HxS;
import X.InterfaceC1072AWd;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public abstract class HatchTrailingFadeTypewriterTextKt {
    public static final int CATCHUP_OFFSET = 20;
    public static final long DEFAULT_TYPING_SPEED_MS = 8;
    public static final float FADE_IN_CHAR_OVERLAP = 6.0f;
    public static final int MAXIMUM_GAP_FROM_END = 100;

    /* renamed from: com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTypewriterSelectionContainer$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w) {
            super(2);
            this.$content = g0w;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AnonymousClass001.A1G(BRg.A00, bfm, this.$content, 6);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt$HatchTypewriterSelectionContainer$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<BRg, BFM, Integer, Unit> $content;
        public final /* synthetic */ boolean $enableSelection;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass5(BRg bRg, boolean z, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$enableSelection = z;
            this.$content = g0w;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            HatchTrailingFadeTypewriterTextKt.HatchTypewriterSelectionContainer(this.$modifier, this.$enableSelection, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HatchTypewriterSelectionContainer(BRg bRg, boolean z, G0W<? super BRg, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-63339815);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0o(bfm, z);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1JY c1jy = (C1JY) bfm.A6v(Am0.A0F);
            C0Hi c0HiA0Z = AnonymousClass001.A0Z(bfm);
            if (z) {
                bfm.AgE(-1465504332);
                BS0 bs0 = BRg.A00;
                Object objAaT = bfm.AaT();
                Object obj = C78N.A00;
                InterfaceC1072AWd interfaceC1072AWd = (InterfaceC1072AWd) AnonymousClass004.A16(bfm, objAaT, obj);
                Object objAaT2 = bfm.AaT();
                if (objAaT2 == obj) {
                    objAaT2 = HatchTrailingFadeTypewriterTextKt$HatchTypewriterSelectionContainer$2$1.INSTANCE;
                    bfm.Ai0(objAaT2);
                }
                Function0 function0 = (Function0) objAaT2;
                boolean zA1M = AnonymousClass003.A1M(bfm, c1jy, c0HiA0Z);
                Object objAaT3 = bfm.AaT();
                if (zA1M || objAaT3 == obj) {
                    objAaT3 = new HatchTrailingFadeTypewriterTextKt$HatchTypewriterSelectionContainer$3$1(c1jy, c0HiA0Z);
                    bfm.Ai0(objAaT3);
                }
                AbstractC1913AtY.A01(C0v5.A00(null, interfaceC1072AWd, bs0, null, null, null, function0, (Function0) objAaT3, true).then(bRg2), B1V.A00(bfm, new AnonymousClass4(g0w), 741113435), bfm, 48, 0);
            } else {
                bfm.AgE(-1465016082);
                AnonymousClass001.A1G(bRg2, bfm, g0w, (iA0d & 14) | ((iA0d >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX));
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(bRg2, z, g0w, i, i2);
        }
    }

    /* renamed from: applyTrailingFade-Bx497Mc, reason: not valid java name */
    public static final void m699applyTrailingFadeBx497Mc(C1731ApS c1731ApS, float f, int i, long j, boolean z, int i2) {
        if (z) {
            int i3 = (int) (f - 3.0f);
            if (i3 < i2) {
                i3 = i2;
            }
            int i4 = (int) (f + 3.0f);
            int i5 = i - 1;
            if (i4 > i5) {
                i4 = i5;
            }
            int i6 = i4 + 1;
            while (i3 < i6) {
                float fA03 = ATD.A03(((f - i3) + 3.0f) / 6.0f, 0.0f, 1.0f);
                if (fA03 < 1.0f) {
                    long jA04 = HxS.A04(HDi.A0O[(int) (j & 63)], B6A.A03(j), B6A.A02(j), B6A.A01(j), fA03);
                    long j2 = C1809ArT.A01;
                    c1731ApS.A0A(new C1824Aro(null, null, null, null, null, null, null, null, null, null, null, jA04, j2, j2, B6A.A07), i3, i3 + 1);
                }
                i3++;
            }
        }
    }

    public static final void removeSelectionFocus(C1JY c1jy, C0Hi c0Hi) {
        C1786Aqw c1786Aqw = (C1786Aqw) c1jy;
        if (c1786Aqw.A00 == C79.A00) {
            c1786Aqw.A00 = C79.A01;
        }
        c0Hi.A6G(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00eb  */
    /* renamed from: HatchTrailingFadeTypewriterText-YXPlkAI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m698HatchTrailingFadeTypewriterTextYXPlkAI(java.lang.String r78, X.ApQ r79, int r80, X.BRg r81, int r82, boolean r83, long r84, int r86, int r87, X.C3UX r88, X.C1822Arm r89, long r90, X.G0U<? super java.lang.Integer, kotlin.Unit> r92, X.G0U<? super java.lang.Integer, kotlin.Unit> r93, X.G0U<? super java.lang.Integer, kotlin.Unit> r94, X.B0A r95, X.C1736ApY r96, long r97, boolean r99, int r100, X.G0U<? super X.C1958Aux, kotlin.Unit> r101, X.C1810ArU r102, X.BO6<java.lang.String, X.C14P> r103, kotlin.jvm.functions.Function0<kotlin.Unit> r104, boolean r105, X.BFM r106, int r107, int r108, int r109, int r110) {
        /*
            Method dump skipped, instructions count: 1319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.conversation.view.typewritertext.HatchTrailingFadeTypewriterTextKt.m698HatchTrailingFadeTypewriterTextYXPlkAI(java.lang.String, X.ApQ, int, X.BRg, int, boolean, long, int, int, X.3UX, X.Arm, long, X.G0U, X.G0U, X.G0U, X.B0A, X.ApY, long, boolean, int, X.G0U, X.ArU, X.BO6, kotlin.jvm.functions.Function0, boolean, X.BFM, int, int, int, int):void");
    }
}
