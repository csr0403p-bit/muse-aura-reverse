package com.facebook.aura.devices.link.ordering;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BJe;
import X.BRg;
import X.C10G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.ext.AuraDrawableSourceKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class HomeLinkProductImageKt {

    /* renamed from: com.facebook.aura.devices.link.ordering.HomeLinkProductImageKt$HomeLinkProductImage$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BRg bRg, int i, int i2) {
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
            HomeLinkProductImageKt.HomeLinkProductImage(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void HomeLinkProductImage(BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-238599208);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraImageKt.AuraImage(AuraDrawableSourceKt.auraDrawableSource(R.drawable.muse_home_link, bfm, 0), BJe.A00(AnonymousClass001.A0R(C10G.A0D(bRg2, Float.NaN, 406.0f)), 1.3782108f, false), null, null, false, false, null, false, null, bfm, 196992, 472);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(bRg2, i, i2);
        }
    }
}
