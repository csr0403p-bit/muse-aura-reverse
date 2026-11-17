package com.facebook.aura.rentalcars;

import X.AKQ;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.C00x;
import X.C1515AkP;
import X.C1D8;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.F60;
import X.G0V;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.skills.connect.repository.CustomConnectorRegisterRepositoryKt;
import com.facebook.aura.ui.sharedelement.HatchSharedElementKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class RentalCarImageKt {

    /* renamed from: com.facebook.aura.rentalcars.RentalCarImageKt$RentalCarImagePlaceholder$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(BRg bRg, int i, int i2) {
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
            RentalCarImageKt.RentalCarImagePlaceholder(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: RentalCarImage-6PoWaU8, reason: not valid java name */
    public static final void m1882RentalCarImage6PoWaU8(String str, String str2, BRg bRg, float f, float f2, BFM bfm, int i, int i2) {
        float f3 = f;
        float f4 = f2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str2, 1);
        bfm.AgG(367926222);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A07(bfm, f3);
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A08(bfm, f4);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (i4 != 0) {
                f3 = 8.0f;
            }
            if (i5 != 0) {
                f4 = 160.0f;
            }
            HatchSharedElementKt.HatchSharedElement(str2, C1D8.A00(f3), bRg2, null, null, 350, B1V.A00(bfm, new RentalCarImageKt$RentalCarImage$1(str, f4), -408802556), bfm, ((iA0d >> 3) & 14) | 1769472 | (iA0d & 896), 24);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new RentalCarImageKt$RentalCarImage$2(str, str2, bRg2, f3, f4, i, i2);
        }
    }

    public static final void RentalCarImagePlaceholder(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(1594797551);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0a = AnonymousClass001.A0a();
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0a, akqA04, bRgA01, iA0J);
            AuraIconKt.m2568AuraIconFyETyZw(null, BOf.A00(bfm, R.drawable.car_outline_24_wght400, 0), 24.0f, null, C3cH.A0W(bfm).tertiaryText, null, bfm, AnonymousClass001.A04(), 33);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(bRg, i, i2);
        }
    }

    public static final String rentalCarImageSharedKey(String str, String str2, int i, boolean z) {
        AnonymousClass003.A0u(str, str2);
        StringBuilder sbA0x = C3cI.A0x("rentalcar/", z ? "list" : "card");
        sbA0x.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        sbA0x.append(str);
        sbA0x.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        sbA0x.append(str2);
        sbA0x.append(CustomConnectorRegisterRepositoryKt.ROOT_PATH);
        sbA0x.append(i);
        return sbA0x.toString();
    }
}
