package com.facebook.aura.vds.compose.divider;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C0nM;
import X.G0V;
import com.facebook.aura.vds.compose.divider.AuraDividerStyle;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraDividerKt {

    /* renamed from: com.facebook.aura.vds.compose.divider.AuraDividerKt$AuraDivider$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $horizontal;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ AuraDividerStyle $style;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, AuraDividerStyle auraDividerStyle, boolean z, int i, int i2) {
            super(2);
            this.$modifier = bRg;
            this.$style = auraDividerStyle;
            this.$horizontal = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraDividerKt.AuraDivider(this.$modifier, this.$style, this.$horizontal, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.vds.compose.divider.AuraDividerKt$AuraRowDivider$1, reason: invalid class name and case insensitive filesystem */
    public final class C142801 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C142801(BRg bRg, int i, int i2) {
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
            AuraDividerKt.AuraRowDivider(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void AuraDivider(BRg bRg, AuraDividerStyle auraDividerStyle, boolean z, BFM bfm, int i, int i2) {
        boolean z2;
        BRg bRg2 = bRg;
        AuraDividerStyle auraDividerStyle2 = auraDividerStyle;
        bfm.AgG(-180264552);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, auraDividerStyle);
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                auraDividerStyle2 = AuraDividerStyle.Primary.INSTANCE;
            }
            z2 = i5 == 0 ? z : true;
            C0nM.A00(bfm, bRg2, auraDividerStyle2.mo2535thicknessD9Ej5fM(), (iA0d & 14) | ((iA0d << 3) & 7168), 0, auraDividerStyle2.mo2534colorWaAFU9c(bfm, (iA0d >> 3) & 14), z2);
        } else {
            bfm.Afo();
            z2 = z;
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, auraDividerStyle2, z2, i, i2);
        }
    }

    public static final void AuraRowDivider(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-990430027);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraDivider(bRg2, AuraRowDividerStyle.INSTANCE, false, bfm, (iA0d & 14) | 48, 4);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C142801(bRg2, i, i2);
        }
    }
}
