package com.facebook.aura.devices.pairing;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.B1V;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C05253Tt;
import X.C0Ig;
import X.C1822Arm;
import X.C1868Asi;
import X.C2KR;
import X.C3IL;
import X.C7384Etj;
import X.C78N;
import X.G0V;
import X.G0W;
import androidx.compose.ui.unit.Constraints;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class FittedMuseGadgetNameKt {
    public static final String ELLIPSIS = "\u2026";

    /* renamed from: com.facebook.aura.devices.pairing.FittedMuseGadgetNameKt$FittedMuseGadgetName$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C0Ig, BFM, Integer, Unit> {
        public final /* synthetic */ G0W<String, BFM, Integer, Unit> $content;
        public final /* synthetic */ C1868Asi $measurer;
        public final /* synthetic */ String $name;
        public final /* synthetic */ C1822Arm $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(String str, C1822Arm c1822Arm, C1868Asi c1868Asi, G0W<? super String, ? super BFM, ? super Integer, Unit> g0w) {
            super(3);
            this.$name = str;
            this.$style = c1822Arm;
            this.$measurer = c1868Asi;
            this.$content = g0w;
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C0Ig c0Ig, BFM bfm, Integer num) {
            invoke(c0Ig, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(C0Ig c0Ig, BFM bfm, int i) {
            C7384Etj.A0Y(c0Ig, 0);
            if ((i & 6) == 0) {
                i |= AnonymousClass004.A0d(bfm, c0Ig);
            }
            if (AnonymousClass001.A1b(AnonymousClass004.A1H(i), bfm, i)) {
                int iA01 = Constraints.A01(((C05253Tt) c0Ig).A00);
                boolean zA1R = AnonymousClass001.A1R(bfm, this.$measurer, AnonymousClass002.A1S(bfm, iA01, bfm.A65(this.$name), bfm.A65(this.$style)));
                String str = this.$name;
                C1868Asi c1868Asi = this.$measurer;
                C1822Arm c1822Arm = this.$style;
                Object objAaT = bfm.AaT();
                if (zA1R || objAaT == C78N.A00) {
                    objAaT = FittedMuseGadgetNameKt.shortenMuseGadgetName(str, new FittedMuseGadgetNameKt$FittedMuseGadgetName$2$fitted$1$1(c1868Asi, c1822Arm, iA01));
                    bfm.Ai0(objAaT);
                }
                AnonymousClass001.A1G(objAaT, bfm, this.$content, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.devices.pairing.FittedMuseGadgetNameKt$FittedMuseGadgetName$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0W<String, BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $name;
        public final /* synthetic */ C1822Arm $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(String str, C1822Arm c1822Arm, BRg bRg, G0W<? super String, ? super BFM, ? super Integer, Unit> g0w, int i, int i2) {
            super(2);
            this.$name = str;
            this.$style = c1822Arm;
            this.$modifier = bRg;
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
            FittedMuseGadgetNameKt.FittedMuseGadgetName(this.$name, this.$style, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FittedMuseGadgetName(String str, C1822Arm c1822Arm, BRg bRg, G0W<? super String, ? super BFM, ? super Integer, Unit> g0w, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str, 0);
        AnonymousClass002.A1B(c1822Arm, 1, g0w);
        bfm.AgG(-1646221647);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, c1822Arm);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, g0w);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1868Asi c1868AsiA00 = C2KR.A00(bfm, 0, 1);
            boolean zA1M = AnonymousClass001.A1M(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new FittedMuseGadgetNameKt$FittedMuseGadgetName$1$1(str);
                bfm.Ai0(objAaT);
            }
            C3IL.A00(bfm, null, AnonymousClass001.A0X(bRg2, objAaT), B1V.A00(bfm, new AnonymousClass2(str, c1822Arm, c1868AsiA00, g0w), 370557211), 3072, 6, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(str, c1822Arm, bRg2, g0w, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String shortenMuseGadgetName(java.lang.String r8, X.G0U<? super java.lang.String, java.lang.Boolean> r9) {
        /*
            boolean r0 = X.AnonymousClass003.A1X(r8, r9)
            if (r0 != 0) goto L62
            java.lang.String r0 = com.facebook.aura.devices.intf.MuseGadgetNamesKt.museGadgetNamePrefix(r8)
            if (r0 == 0) goto L62
            int r0 = r0.length()
            r5 = 0
            java.lang.String r1 = r8.substring(r5, r0)
            r7 = 2
            char[] r0 = new char[r7]
            r0 = {x0064: FILL_ARRAY_DATA , data: [45, 32} // fill-array
            java.lang.String r6 = X.C7BY.A0Z(r1, r0)
            int r0 = r6.length()
            java.lang.String r3 = r8.substring(r0)
            java.lang.String r4 = "\u2026"
            if (r0 <= r7) goto L40
            int r2 = r0 + (-1)
        L2d:
            if (r2 <= 0) goto L40
            java.lang.String r0 = X.BQG.A17(r6, r2)
            java.lang.String r1 = X.FGI.A0U(r0, r4, r3)
            boolean r0 = X.AnonymousClass003.A1X(r1, r9)
            if (r0 != 0) goto L60
            int r2 = r2 + (-1)
            goto L2d
        L40:
            char[] r0 = new char[r7]
            r0 = {x006a: FILL_ARRAY_DATA , data: [45, 32} // fill-array
            java.lang.String r3 = X.C7BY.A0a(r3, r0)
            int r2 = r3.length()
        L4d:
            if (r5 >= r2) goto L61
            java.lang.String r0 = r3.substring(r5)
            java.lang.String r1 = X.FGI.A0M(r4, r0)
            boolean r0 = X.AnonymousClass003.A1X(r1, r9)
            if (r0 != 0) goto L60
            int r5 = r5 + 1
            goto L4d
        L60:
            return r1
        L61:
            return r4
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.pairing.FittedMuseGadgetNameKt.shortenMuseGadgetName(java.lang.String, X.G0U):java.lang.String");
    }
}
