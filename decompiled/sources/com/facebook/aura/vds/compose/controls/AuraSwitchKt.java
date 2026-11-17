package com.facebook.aura.vds.compose.controls;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import X.InterfaceC1072AWd;
import com.facebook.aura.vds.compose.theme.AuraColorsSwitch;
import com.facebook.aura.vds.compose.theme.AuraDimensionsSwitch;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraSwitchKt {

    /* renamed from: com.facebook.aura.vds.compose.controls.AuraSwitchKt$AuraSwitch$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $checked;
        public final /* synthetic */ AuraColorsSwitch $colors;
        public final /* synthetic */ AuraDimensionsSwitch $dimensions;
        public final /* synthetic */ boolean $enabled;
        public final /* synthetic */ InterfaceC1072AWd $interactionSource;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ G0U<Boolean, Unit> $onCheckedChange;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(BRg bRg, boolean z, boolean z2, G0U<? super Boolean, Unit> g0u, InterfaceC1072AWd interfaceC1072AWd, AuraColorsSwitch auraColorsSwitch, AuraDimensionsSwitch auraDimensionsSwitch, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$enabled = z;
            this.$checked = z2;
            this.$onCheckedChange = g0u;
            this.$interactionSource = interfaceC1072AWd;
            this.$colors = auraColorsSwitch;
            this.$dimensions = auraDimensionsSwitch;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraSwitchKt.AuraSwitch(this.$modifier, this.$enabled, this.$checked, this.$onCheckedChange, this.$interactionSource, this.$colors, this.$dimensions, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.G0U<java.lang.Boolean, kotlin.Unit> withToggleHaptic(X.G0U<? super java.lang.Boolean, kotlin.Unit> r5, X.BFM r6, int r7) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r5, r0)
            X.0dx r4 = X.AnonymousClass002.A0T(r6)
            boolean r3 = r6.A67(r4)
            r0 = r7 & 14
            r0 = r0 ^ 6
            r2 = 4
            if (r0 <= r2) goto L19
            boolean r0 = r6.A65(r5)
            if (r0 != 0) goto L1e
        L19:
            r0 = r7 & 6
            r1 = 0
            if (r0 != r2) goto L1f
        L1e:
            r1 = 1
        L1f:
            r1 = r1 | r3
            java.lang.Object r0 = r6.AaT()
            if (r1 != 0) goto L2a
            java.lang.Object r1 = X.C78N.A00
            if (r0 != r1) goto L32
        L2a:
            com.facebook.aura.vds.compose.controls.AuraSwitchKt$withToggleHaptic$1$1 r0 = new com.facebook.aura.vds.compose.controls.AuraSwitchKt$withToggleHaptic$1$1
            r0.<init>(r4, r5)
            r6.Ai0(r0)
        L32:
            X.G0U r0 = (X.G0U) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.controls.AuraSwitchKt.withToggleHaptic(X.G0U, X.BFM, int):X.G0U");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x017d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AuraSwitch(X.BRg r19, boolean r20, boolean r21, X.G0U<? super java.lang.Boolean, kotlin.Unit> r22, X.InterfaceC1072AWd r23, com.facebook.aura.vds.compose.theme.AuraColorsSwitch r24, com.facebook.aura.vds.compose.theme.AuraDimensionsSwitch r25, X.BFM r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.vds.compose.controls.AuraSwitchKt.AuraSwitch(X.BRg, boolean, boolean, X.G0U, X.AWd, com.facebook.aura.vds.compose.theme.AuraColorsSwitch, com.facebook.aura.vds.compose.theme.AuraDimensionsSwitch, X.BFM, int, int):void");
    }
}
