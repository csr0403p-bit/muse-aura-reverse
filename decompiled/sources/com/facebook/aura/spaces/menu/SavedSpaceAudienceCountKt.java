package com.facebook.aura.spaces.menu;

import X.AbstractC07539Wl;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass004;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.BBb;
import X.BFM;
import X.BRg;
import X.C06G;
import X.G0V;
import com.facebook.aura.R;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public abstract class SavedSpaceAudienceCountKt {

    /* renamed from: com.facebook.aura.spaces.menu.SavedSpaceAudienceCountKt$SavedSpaceAudienceCount$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $count;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$count = i;
            this.$modifier = bRg;
            this.$$changed = i2;
            this.$$default = i3;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            SavedSpaceAudienceCountKt.SavedSpaceAudienceCount(this.$count, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void SavedSpaceAudienceCount(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(1253228604);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 19, 18), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraTextKt.m2639AuraTextUY9GdpU(AnonymousClass007.A0Y(i, bfm, R.plurals._name_removed__res_0x7f10001d), AbstractC07539Wl.A00(bRg2, "hatch-saved-space-audience-count"), C06G.A08(bfm), C06G.A0T(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(i, bRg2, i2, i3);
        }
    }
}
