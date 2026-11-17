package com.facebook.aura.vds.compose.theme;

import X.AGO;
import X.AKH;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.C1822Arm;
import X.G0V;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class AuraTypographyKt {
    public static final AKH<C1822Arm> LocalAuraTextStyle = AnonymousClass002.A0L(AuraTypographyKt$LocalAuraTextStyle$1.INSTANCE);
    public static final AKH<AuraTypography> LocalAuraTypography = new AGO(AuraTypographyKt$LocalAuraTypography$1.INSTANCE);

    /* renamed from: com.facebook.aura.vds.compose.theme.AuraTypographyKt$ProvideAuraTextStyle$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ C1822Arm $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1822Arm c1822Arm, G0V<? super BFM, ? super Integer, Unit> g0v, int i) {
            super(2);
            this.$value = c1822Arm;
            this.$content = g0v;
            this.$$changed = i;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            AuraTypographyKt.ProvideAuraTextStyle(this.$value, this.$content, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    public static final AKH<C1822Arm> getLocalAuraTextStyle() {
        return LocalAuraTextStyle;
    }

    public static final AKH<AuraTypography> getLocalAuraTypography() {
        return LocalAuraTypography;
    }

    public static final void ProvideAuraTextStyle(C1822Arm c1822Arm, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i) {
        AnonymousClass003.A0u(c1822Arm, g0v);
        bfm.AgG(-579952069);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, c1822Arm) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AKH<C1822Arm> akh = LocalAuraTextStyle;
            AnonymousClass001.A14(bfm, akh.A04(((C1822Arm) bfm.A6v(akh)).A02(c1822Arm)), g0v, iA0d);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(c1822Arm, g0v, i);
        }
    }
}
