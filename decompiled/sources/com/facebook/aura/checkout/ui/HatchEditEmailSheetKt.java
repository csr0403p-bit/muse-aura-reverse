package com.facebook.aura.checkout.ui;

import X.AHD;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public abstract class HatchEditEmailSheetKt {

    /* renamed from: com.facebook.aura.checkout.ui.HatchEditEmailSheetKt$HatchEditEmailSheet$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ AHD<HatchSelectableOption> $emails;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onAddEmail;
        public final /* synthetic */ G0U<HatchSelectableOption, Unit> $onEmailMore;
        public final /* synthetic */ G0U<HatchSelectableOption, Unit> $onSelectEmail;
        public final /* synthetic */ String $selectedEmailId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(AHD<HatchSelectableOption> ahd, String str, G0U<? super HatchSelectableOption, Unit> g0u, Function0<Unit> function0, BRg bRg, G0U<? super HatchSelectableOption, Unit> g0u2, int i, int i2) {
            super(2);
            this.$emails = ahd;
            this.$selectedEmailId = str;
            this.$onSelectEmail = g0u;
            this.$onAddEmail = function0;
            this.$modifier = bRg;
            this.$onEmailMore = g0u2;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            HatchEditEmailSheetKt.HatchEditEmailSheet(this.$emails, this.$selectedEmailId, this.$onSelectEmail, this.$onAddEmail, this.$modifier, this.$onEmailMore, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void HatchEditEmailSheet(AHD<HatchSelectableOption> ahd, String str, G0U<? super HatchSelectableOption, Unit> g0u, Function0<Unit> function0, BRg bRg, G0U<? super HatchSelectableOption, Unit> g0u2, BFM bfm, int i, int i2) {
        G0U<? super HatchSelectableOption, Unit> g0u3 = g0u2;
        BRg bRg2 = bRg;
        AnonymousClass005.A11(ahd, g0u, function0, 0);
        bfm.AgG(1603685028);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, ahd) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0u);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0W(bfm, function0);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        int i4 = i2 & 32;
        int iA0Y = 196608;
        if (i4 != 0) {
            iA0d |= iA0Y;
        } else if ((196608 & i) == 0) {
            iA0Y = AnonymousClass004.A0Y(bfm, g0u3);
            iA0d |= iA0Y;
        }
        if (AnonymousClass001.A1b(AnonymousClass005.A1A(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                g0u3 = null;
            }
            HatchSelectableListSheetKt.HatchSelectableListSheet(ahd, str, g0u, bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206e4), null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1206d8), function0, g0u3, bfm, AnonymousClass001.A09(iA0d << 9, AnonymousClass001.A0C(iA0d << 12, (iA0d & 1022) | ((iA0d >> 3) & 7168))), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(ahd, str, g0u, function0, bRg2, g0u3, i, i2);
        }
    }
}
