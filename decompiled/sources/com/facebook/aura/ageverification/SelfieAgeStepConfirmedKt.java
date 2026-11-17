package com.facebook.aura.ageverification;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.AnonymousClass006;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.G0V;
import com.facebook.aura.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class SelfieAgeStepConfirmedKt {

    /* renamed from: com.facebook.aura.ageverification.SelfieAgeStepConfirmedKt$SelfieAgeStepConfirmed$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $continueLoading;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onContinue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function0<Unit> function0, BRg bRg, boolean z, int i, int i2) {
            super(2);
            this.$onContinue = function0;
            this.$modifier = bRg;
            this.$continueLoading = z;
            this.$$changed = i;
            this.$$default = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SelfieAgeStepConfirmedKt.SelfieAgeStepConfirmed(this.$onContinue, this.$modifier, this.$continueLoading, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SelfieAgeStepConfirmed(Function0<Unit> function0, BRg bRg, boolean z, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1K = z;
        C7384Etj.A0Y(function0, 0);
        bfm.AgG(-888267977);
        int iA0T = (i & 6) == 0 ? AnonymousClass004.A0T(bfm, function0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            iA0T |= 384;
        } else if ((i & 384) == 0) {
            iA0T |= AnonymousClass004.A0p(bfm, zA1K);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0T), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            zA1K = C3cG.A1K(i4, zA1K);
            String strA0v = AnonymousClass006.A0v(bfm, R.string._name_removed__res_0x7f12006c);
            long j = C3cH.A0W(bfm).success;
            AgeStepMessageKt.m208AgeStepMessageFItCLgY(bRg2, Integer.valueOf(R.string._name_removed__res_0x7f12006d), null, false, new AgeStepAction(R.string._name_removed__res_0x7f12022f, function0), zA1K, null, Integer.valueOf(R.drawable.circle_check_wght400_filled_24), j, strA0v, bfm, AnonymousClass001.A08(iA0T << 9, ((iA0T >> 3) & 14) | (AgeStepAction.$stable << 12)), 76);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(function0, bRg2, zA1K, i, i2);
        }
    }
}
