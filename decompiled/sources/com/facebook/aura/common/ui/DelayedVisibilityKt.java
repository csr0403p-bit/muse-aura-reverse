package com.facebook.aura.common.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C7384Etj;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class DelayedVisibilityKt {

    /* renamed from: com.facebook.aura.common.ui.DelayedVisibilityKt$DelayedVisibility$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ long $delayMs;
        public final /* synthetic */ boolean $visible;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(boolean z, long j, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$visible = z;
            this.$delayMs = j;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            DelayedVisibilityKt.DelayedVisibility(this.$visible, this.$delayMs, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void DelayedVisibility(boolean z, long j, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        long j2 = j;
        C7384Etj.A0Y(g0v, 2);
        bfm.AgG(1680195208);
        int iA0n = (i & 6) == 0 ? AnonymousClass004.A0n(bfm, z) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0n |= 48;
        } else if ((i & 48) == 0) {
            iA0n |= AnonymousClass004.A0N(bfm, j);
        }
        if ((i & 384) == 0) {
            iA0n |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0n), bfm, iA0n)) {
            if (i3 != 0) {
                j2 = 5000;
            }
            if (rememberDelayedVisible(z, j2, bfm, iA0n & 126, 0)) {
                bfm.AgE(1146719367);
                AnonymousClass003.A13(bfm, g0v, iA0n >> 6);
            } else {
                bfm.AgE(1146737626);
            }
            AnonymousClass001.A1D(bfm);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(z, j2, g0v, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean rememberDelayedVisible(boolean r10, long r11, X.BFM r13, int r14, int r15) {
        /*
            r7 = r11
            r0 = r15 & 2
            if (r0 == 0) goto L7
            r7 = 5000(0x1388, double:2.4703E-320)
        L7:
            java.lang.Object r0 = r13.AaT()
            java.lang.Object r4 = X.C78N.A00
            r5 = 0
            java.lang.Object r9 = X.AnonymousClass005.A0g(r13, r0, r4, r5)
            androidx.compose.runtime.MutableState r9 = (androidx.compose.runtime.MutableState) r9
            r6 = r10
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            r0 = r14 & 14
            r0 = r0 ^ 6
            r1 = 4
            if (r0 <= r1) goto L26
            boolean r0 = r13.A66(r10)
            if (r0 != 0) goto L2b
        L26:
            r0 = r14 & 6
            r2 = 0
            if (r0 != r1) goto L2c
        L2b:
            r2 = 1
        L2c:
            r0 = r14 & 112(0x70, float:1.57E-43)
            r0 = r0 ^ 48
            r1 = 32
            if (r0 <= r1) goto L3a
            boolean r0 = r13.A64(r7)
            if (r0 != 0) goto L3e
        L3a:
            r0 = r14 & 48
            if (r0 != r1) goto L3f
        L3e:
            r5 = 1
        L3f:
            r2 = r2 | r5
            java.lang.Object r5 = r13.AaT()
            if (r2 != 0) goto L48
            if (r5 != r4) goto L51
        L48:
            r10 = 0
            com.facebook.aura.common.ui.DelayedVisibilityKt$rememberDelayedVisible$1$1 r5 = new com.facebook.aura.common.ui.DelayedVisibilityKt$rememberDelayedVisible$1$1
            r5.<init>(r6, r7, r9, r10)
            r13.Ai0(r5)
        L51:
            X.AnonymousClass001.A18(r13, r5, r3)
            boolean r0 = androidx.compose.runtime.MutableState.A0A(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.common.ui.DelayedVisibilityKt.rememberDelayedVisible(boolean, long, X.BFM, int, int):boolean");
    }
}
