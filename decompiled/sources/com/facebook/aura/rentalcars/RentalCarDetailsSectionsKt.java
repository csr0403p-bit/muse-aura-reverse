package com.facebook.aura.rentalcars;

import X.AEk;
import X.AKQ;
import X.ARL;
import X.AVy;
import X.AbstractC06907md;
import X.AbstractC0878AGe;
import X.AbstractC1979Avk;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AcQ;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.B1V;
import X.BA2;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BJe;
import X.BOf;
import X.BPg;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C06G;
import X.C06I;
import X.C0A3;
import X.C0A8;
import X.C0v5;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1AC;
import X.C1D3;
import X.C1D8;
import X.C1DI;
import X.C1b8;
import X.C2VU;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C60O;
import X.C60Q;
import X.C7384Etj;
import X.C78N;
import X.C7BY;
import X.C7Je;
import X.C7mU;
import X.C90m;
import X.C9m9;
import X.F60;
import X.FGI;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.CarRentalReservationFormattingKt;
import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.dialog.AuraAlertDialogKt;
import com.facebook.aura.vds.compose.icons.AuraIconKt;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.aura.vds.compose.theme.BaseColors;
import java.time.LocalTime;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class RentalCarDetailsSectionsKt {

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarDateTime$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RentalCarStop $stop;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(RentalCarStop rentalCarStop, String str, BRg bRg, int i, int i2) {
            super(2);
            this.$stop = rentalCarStop;
            this.$label = str;
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
            RentalCarDetailsSectionsKt.RentalCarDateTime(this.$stop, this.$label, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarDatesSection$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ RentalCarStop $dropoff;
        public final /* synthetic */ RentalCarStop $pickup;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RentalCarStop rentalCarStop, RentalCarStop rentalCarStop2) {
            super(2);
            this.$pickup = rentalCarStop;
            this.$dropoff = rentalCarStop2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                BS0 bs0 = BRg.A00;
                C1062ATq c1062ATq = C10G.A02;
                C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMedium);
                RentalCarStop rentalCarStop = this.$pickup;
                RentalCarStop rentalCarStop2 = this.$dropoff;
                InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, C2VU.A05, 0);
                BBI bbi = (BBI) bfm;
                int iA0J = AnonymousClass003.A0J(bbi);
                AKQ akqA04 = BBI.A04(bbi);
                BRg bRgA01 = AxM.A01(bfm, c1062ATq);
                Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                if (bbi.A0V == null) {
                    C00x.A00();
                    throw F60.createAndThrow();
                }
                AnonymousClass005.A0n(bfm, bbi, function0);
                AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
                C90m c90m = C90m.A00;
                String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a0);
                BRg bRgAiP = c90m.AiP(bs0, 1.0f, true);
                int i2 = RentalCarStop.$stable;
                RentalCarDetailsSectionsKt.RentalCarDateTime(rentalCarStop, strA01, bRgAiP, bfm, i2, 0);
                RentalCarDetailsSectionsKt.RentalCarDateTime(rentalCarStop2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120594), c90m.AiP(bs0, 1.0f, true), bfm, i2, 0);
                BBI.A0R(bbi, true);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarDatesSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C134462 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RentalCarStop $dropoff;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RentalCarStop $pickup;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134462(RentalCarStop rentalCarStop, RentalCarStop rentalCarStop2, BRg bRg, int i, int i2) {
            super(2);
            this.$pickup = rentalCarStop;
            this.$dropoff = rentalCarStop2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarDatesSection(this.$pickup, this.$dropoff, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarDetailIcon$1, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C134471 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134471(int i, BRg bRg, int i2, int i3) {
            super(2);
            this.$icon = i;
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
            RentalCarDetailsSectionsKt.RentalCarDetailIcon(this.$icon, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarDetailsHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C134482 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RentalCarRate $rate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134482(RentalCarRate rentalCarRate, BRg bRg, int i, int i2) {
            super(2);
            this.$rate = rentalCarRate;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarDetailsHeader(this.$rate, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarHeroImage$2, reason: invalid class name and case insensitive filesystem */
    public final class C134492 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $imageUrl;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $sharedKey;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134492(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$imageUrl = str;
            this.$sharedKey = str2;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarHeroImage(this.$imageUrl, this.$sharedKey, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarInfoRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C134502 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ int $icon;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onClick;
        public final /* synthetic */ String $text;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134502(int i, String str, BRg bRg, Function0<Unit> function0, int i2, int i3) {
            super(2);
            this.$icon = i;
            this.$text = str;
            this.$modifier = bRg;
            this.$onClick = function0;
            this.$$changed = i2;
            this.$$default = i3;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarInfoRow(this.$icon, this.$text, this.$modifier, this.$onClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarLocationRows$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RentalCarRate $rate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(RentalCarRate rentalCarRate, BRg bRg, int i, int i2) {
            super(2);
            this.$rate = rentalCarRate;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarLocationRows(this.$rate, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarLocationSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C134511 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ RentalCarRate $rate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134511(RentalCarRate rentalCarRate) {
            super(2);
            this.$rate = rentalCarRate;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                RentalCarDetailsSectionsKt.RentalCarLocationRows(this.$rate, null, bfm, 0, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarLocationSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C134522 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RentalCarRate $rate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134522(RentalCarRate rentalCarRate, BRg bRg, int i, int i2) {
            super(2);
            this.$rate = rentalCarRate;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarLocationSection(this.$rate, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarOpenMapsDialog$1, reason: invalid class name and case insensitive filesystem */
    public final class C134531 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ String $cancelText;
        public final /* synthetic */ String $confirmText;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134531(String str, Function0<Unit> function0, String str2, Function0<Unit> function02) {
            super(2);
            this.$confirmText = str;
            this.$onConfirm = function0;
            this.$cancelText = str2;
            this.$onDismiss = function02;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                bfm.Afo();
                return;
            }
            boolean zA1R = AnonymousClass001.A1R(bfm, this.$onDismiss, AnonymousClass001.A1R(bfm, this.$cancelText, AnonymousClass001.A1R(bfm, this.$onConfirm, bfm.A65(this.$confirmText))));
            String str = this.$confirmText;
            Function0<Unit> function0 = this.$onConfirm;
            String str2 = this.$cancelText;
            Function0<Unit> function02 = this.$onDismiss;
            Object objAaT = bfm.AaT();
            if (zA1R || objAaT == C78N.A00) {
                objAaT = new RentalCarDetailsSectionsKt$RentalCarOpenMapsDialog$1$1$1(str, function0, str2, function02);
                bfm.Ai0(objAaT);
            }
            AnonymousClass007.A14(bfm, objAaT);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarOpenMapsDialog$2, reason: invalid class name and case insensitive filesystem */
    public final class C134542 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RentalCarLocation $location;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onConfirm;
        public final /* synthetic */ Function0<Unit> $onDismiss;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134542(RentalCarLocation rentalCarLocation, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, int i, int i2) {
            super(2);
            this.$location = rentalCarLocation;
            this.$onConfirm = function0;
            this.$onDismiss = function02;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarOpenMapsDialog(this.$location, this.$onConfirm, this.$onDismiss, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarPriceRow$2, reason: invalid class name and case insensitive filesystem */
    public final class C134552 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ boolean $emphasized;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134552(String str, String str2, boolean z, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$value = str2;
            this.$emphasized = z;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarPriceRow(this.$label, this.$value, this.$emphasized, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarPriceSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C134561 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ RentalCarRate $rate;
        public final /* synthetic */ String $total;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134561(RentalCarRate rentalCarRate, String str) {
            super(2);
            this.$rate = rentalCarRate;
            this.$total = str;
        }

        public final void invoke(BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                bfm.Afo();
                return;
            }
            C9m9 c9m9A00 = AcQ.A00(AuraDimensKt.SpacingMicroPlusNano);
            RentalCarRate rentalCarRate = this.$rate;
            String str = this.$total;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C06I.A00(c9m9A00, bfm, C2VU.A02, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bs0);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA00, akqA04, bRgA01, iA0J);
            RentalCarDetailsSectionsKt.RentalCarPriceRow(AnonymousClass001.A0t(bfm, rentalCarRate.total.currency, R.string._name_removed__res_0x7f1205ab), str, true, null, bfm, 384, 8);
            if (rentalCarRate.paymentType == RentalCarPaymentType.POSTPAID) {
                bfm.AgE(1342646348);
                RentalCarDetailsSectionsKt.RentalCarPriceRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120597), str, false, null, bfm, 384, 8);
            } else {
                bfm.AgE(1342825094);
            }
            BBI.A0R(bbi, false);
            String strA0t = AnonymousClass001.A0t(bfm, rentalCarRate.supplier.name, R.string._name_removed__res_0x7f1205a1);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA0t, null, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarPriceSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C134572 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RentalCarRate $rate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134572(RentalCarRate rentalCarRate, BRg bRg, int i, int i2) {
            super(2);
            this.$rate = rentalCarRate;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarPriceSection(this.$rate, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C134582 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C134582(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$title = str;
            this.$modifier = bRg;
            this.$content = g0v;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarSection(this.$title, this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarSpecsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C134591 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RentalCarVehicle $car;
        public final /* synthetic */ RentalCarMileage $mileage;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134591(RentalCarVehicle rentalCarVehicle, RentalCarMileage rentalCarMileage, BRg bRg, int i, int i2) {
            super(2);
            this.$car = rentalCarVehicle;
            this.$mileage = rentalCarMileage;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarSpecsSection(this.$car, this.$mileage, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarSpecsSection$2, reason: invalid class name and case insensitive filesystem */
    /* loaded from: classes.dex */
    public final class C134602 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ List<HxE<Integer, String>> $specs;

        /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarSpecsSection$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C0A3, BFM, Integer, Unit> {
            public final /* synthetic */ List<HxE<Integer, String>> $specs;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(List<HxE<Integer, String>> list) {
                super(3);
                this.$specs = list;
            }

            @Override // X.G0W
            public /* bridge */ /* synthetic */ Unit invoke(C0A3 c0a3, BFM bfm, Integer num) {
                invoke(c0a3, bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(C0A3 c0a3, BFM bfm, int i) {
                int iA0d = i;
                C7384Etj.A0Y(c0a3, 0);
                if ((i & 6) == 0) {
                    iA0d = i | AnonymousClass004.A0d(bfm, c0a3);
                }
                if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
                    for (HxE<Integer, String> hxE : this.$specs) {
                        int iA0F = AnonymousClass001.A0F(hxE.first);
                        String str = hxE.second;
                        BRg bRgAiP = c0a3.AiP(BRg.A00, 1.0f, true);
                        InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, AuraDimensKt.SpacingXsmall);
                        BBI bbi = (BBI) bfm;
                        int iA0J = AnonymousClass003.A0J(bbi);
                        AKQ akqA04 = BBI.A04(bbi);
                        BRg bRgA01 = AxM.A01(bfm, bRgAiP);
                        Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
                        if (bbi.A0V == null) {
                            C00x.A00();
                            throw F60.createAndThrow();
                        }
                        AnonymousClass005.A0n(bfm, bbi, function0);
                        AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
                        RentalCarDetailsSectionsKt.RentalCarDetailIcon(iA0F, null, bfm, 0, 2);
                        AuraTextKt.m2639AuraTextUY9GdpU(str, null, C06G.A0C(bfm), C06G.A0Z(bfm), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                        BBI.A0R(bbi, true);
                    }
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134602(List<HxE<Integer, String>> list) {
            super(2);
            this.$specs = list;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                AbstractC1979Avk.A02(AcQ.A00(AuraDimensKt.SpacingSmall), AcQ.A00(AuraDimensKt.SpacingXsmall), bfm, null, C10G.A02, B1V.A00(bfm, new AnonymousClass1(this.$specs), 1285903478), 2, 0, 1597446, 40);
            } else {
                bfm.Afo();
            }
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarSpecsSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C134613 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ RentalCarVehicle $car;
        public final /* synthetic */ RentalCarMileage $mileage;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134613(RentalCarVehicle rentalCarVehicle, RentalCarMileage rentalCarMileage, BRg bRg, int i, int i2) {
            super(2);
            this.$car = rentalCarVehicle;
            this.$mileage = rentalCarMileage;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarSpecsSection(this.$car, this.$mileage, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.rentalcars.RentalCarDetailsSectionsKt$RentalCarSupplierLogo$1, reason: invalid class name and case insensitive filesystem */
    public final class C134621 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $logoUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C134621(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$logoUrl = str;
            this.$modifier = bRg;
            this.$$changed = i;
            this.$$default = i2;
        }

        public final void invoke(BFM bfm, int i) {
            RentalCarDetailsSectionsKt.RentalCarSupplierLogo(this.$logoUrl, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    public static final void RentalCarDatesSection(RentalCarStop rentalCarStop, RentalCarStop rentalCarStop2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1b = AnonymousClass004.A1b(rentalCarStop, rentalCarStop2);
        bfm.AgG(1337386158);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(rentalCarStop, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(rentalCarStop2, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            RentalCarSection(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a4), bRg2, B1V.A00(bfm, new AnonymousClass1(rentalCarStop, rentalCarStop2), -949063566), bfm, ((iA05 >> 3) & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, zA1b ? 1 : 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134462(rentalCarStop, rentalCarStop2, bRg2, i, i2);
        }
    }

    public static final void RentalCarHeroImage(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(str2, 1);
        bfm.AgG(-2055356641);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1J(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            long j = C3cH.A0W(bfm).photoBorder;
            BRg bRgA00 = BJe.A00(AnonymousClass001.A0R(bRg2), 1.4035715f, false);
            boolean zA64 = bfm.A64(j);
            Object objAaT = bfm.AaT();
            if (zA64 || objAaT == C78N.A00) {
                objAaT = new RentalCarDetailsSectionsKt$RentalCarHeroImage$1$1(j);
                bfm.Ai0(objAaT);
            }
            RentalCarImageKt.m1882RentalCarImage6PoWaU8(str, str2, AEk.A03(bRgA00, (G0U) objAaT), 0.0f, 400.0f, bfm, (iA0d & 14) | 27648 | (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX), 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134492(str, str2, bRg2, i, i2);
        }
    }

    public static final void RentalCarLocationSection(RentalCarRate rentalCarRate, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(rentalCarRate, 0);
        bfm.AgG(-1751211214);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, rentalCarRate) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            RentalCarSection(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a5), bRg2, B1V.A00(bfm, new C134511(rentalCarRate), -1163343378), bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134522(rentalCarRate, bRg2, i, i2);
        }
    }

    public static final void RentalCarPriceSection(RentalCarRate rentalCarRate, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(rentalCarRate, 0);
        bfm.AgG(1824324322);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, rentalCarRate) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            RentalCarSection(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a6), bRg2, B1V.A00(bfm, new C134561(rentalCarRate, RentalCarFormattingKt.formatted(rentalCarRate.total, C60Q.A0w(), false)), 1213640102), bfm, (iA0d & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134572(rentalCarRate, bRg2, i, i2);
        }
    }

    public static final void RentalCarSpecsSection(RentalCarVehicle rentalCarVehicle, RentalCarMileage rentalCarMileage, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c134613;
        HxE hxEA0r;
        BBI bbiA07;
        HxE hxEA0r2;
        BRg bRg2 = bRg;
        C7384Etj.A0Y(rentalCarVehicle, 0);
        bfm.AgG(-1801494451);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, rentalCarVehicle) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(rentalCarMileage, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Integer num = rentalCarVehicle.maxPassengers;
            if (num == null) {
                bbiA07 = AnonymousClass002.A0M(bfm, 1590322798);
                hxEA0r = null;
            } else {
                bfm.AgE(1590322799);
                hxEA0r = C3cG.A0r(Integer.valueOf(R.drawable.ic_person_outline_24), AnonymousClass007.A0Y(num.intValue(), bfm, R.plurals._name_removed__res_0x7f100016));
                bbiA07 = C3cG.A07(bfm);
            }
            String strRentalCarBags = RentalCarFormattingKt.rentalCarBags(rentalCarVehicle, bfm, iA0d & 14);
            HxE hxEA0y = strRentalCarBags != null ? C60Q.A0y(strRentalCarBags, R.drawable.luggage_outline_24_wght400) : null;
            String strCarRentalTransmission = CarRentalReservationFormattingKt.carRentalTransmission(rentalCarVehicle.transmission, bfm, 0);
            HxE hxEA0y2 = strCarRentalTransmission != null ? C60Q.A0y(strCarRentalTransmission, R.drawable.gear_outline_24) : null;
            String strRentalCarFuel = RentalCarFormattingKt.rentalCarFuel(rentalCarVehicle.fuel, bfm, 0);
            HxE hxEA0y3 = strRentalCarFuel != null ? C60Q.A0y(strRentalCarFuel, R.drawable.gaspump_outline_24_wght400) : null;
            if (AnonymousClass002.A1b(rentalCarVehicle.airConditioning, true)) {
                bfm.AgE(1590746383);
                hxEA0r2 = C3cG.A0r(Integer.valueOf(R.drawable.snowflake_outline_24_wght400), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120578));
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(1590881791);
                BBI.A0R(bbiA07, false);
                hxEA0r2 = null;
            }
            int i4 = iA0d >> 3;
            String strRentalCarMileage = RentalCarFormattingKt.rentalCarMileage(rentalCarMileage, bfm, i4 & 14);
            List listA0F = BFI.A0F(new HxE[]{hxEA0r, hxEA0y, hxEA0y2, hxEA0y3, hxEA0r2, strRentalCarMileage != null ? C60Q.A0y(strRentalCarMileage, R.drawable.road_outline_24_wght400) : null});
            if (listA0F.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c134613 = new C134591(rentalCarVehicle, rentalCarMileage, bRg2, i, i2);
                    C3cG.A1D(bBbAAc, c134613);
                }
                return;
            }
            RentalCarSection(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a3), bRg2, B1V.A00(bfm, new C134602(listA0F), -1450702575), bfm, (i4 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX) | 384, 0);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c134613 = new C134613(rentalCarVehicle, rentalCarMileage, bRg2, i, i2);
            C3cG.A1D(bBbAAc, c134613);
        }
    }

    public static final void RentalCarDateTime(RentalCarStop rentalCarStop, String str, BRg bRg, BFM bfm, int i, int i2) {
        String strA01;
        BRg bRg2 = bRg;
        bfm.AgG(1750279794);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(rentalCarStop, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, str);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA05 |= 384;
        } else if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0f(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 147, 146), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingNano, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRg2);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            String rentalDate = RentalCarFormattingKt.formatRentalDate(rentalCarStop.date, C60Q.A0w());
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(rentalDate, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            LocalTime localTime = rentalCarStop.time;
            if (localTime == null) {
                bfm.AgE(1480768669);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1480768670);
                strA01 = AbstractC06907md.A01(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7), C60O.A16(str, RentalCarFormattingKt.formatRentalTime(localTime, C60Q.A0w())), null);
                BBI.A0R(bbi, false);
                if (strA01 == null) {
                }
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, true);
            }
            strA01 = str;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(rentalCarStop, str, bRg2, i, i2);
        }
    }

    public static final void RentalCarDetailIcon(int i, BRg bRg, BFM bfm, int i2, int i3) {
        BRg bRg2 = bRg;
        bfm.AgG(348142543);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        int i4 = i3 & 2;
        if (i4 != 0) {
            iA0D |= 48;
        } else if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0D), bfm, iA0D)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            AuraIconKt.m2568AuraIconFyETyZw(bRg2, BOf.A00(bfm, i, iA0D & 14), 16.0f, null, C3cH.A0W(bfm).secondaryText, null, bfm, ((iA0D >> 3) & 14) | 3456 | (AVy.$stable << 3), 32);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134471(i, bRg2, i2, i3);
        }
    }

    public static final void RentalCarDetailsHeader(RentalCarRate rentalCarRate, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        C7384Etj.A0Y(rentalCarRate, 0);
        bfm.AgG(930644081);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, rentalCarRate) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMicro;
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, f, 0);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0X);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C9m9 c9m9A00 = AcQ.A00(f);
            C1AC c1ac = C2VU.A04;
            BS0 bs0 = BRg.A00;
            InterfaceC1380AiA interfaceC1380AiAA00 = C0A8.A00(c9m9A00, bfm, c1ac, 48);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bs0);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA00, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String str = rentalCarRate.supplier.logoUrl;
            if (str == null) {
                bfm.AgE(-1757033313);
            } else {
                bfm.AgE(-1757033312);
                RentalCarSupplierLogo(str, null, bfm, 0, 2);
            }
            BBI.A0R(bbi, false);
            String str2 = rentalCarRate.supplier.name;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
            String str3 = rentalCarRate.car.name;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title2Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = RentalCarDetailsSectionsKt$RentalCarDetailsHeader$1$2$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str3, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(RentalCarFormattingKt.rentalCarSummaryLine(rentalCarRate, bfm, iA0d & 14), null, C3cH.A06(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134482(rentalCarRate, bRg2, i, i2);
        }
    }

    public static final void RentalCarInfoRow(int i, String str, BRg bRg, Function0<Unit> function0, BFM bfm, int i2, int i3) {
        BRg bRgA04;
        BRg bRg2;
        BRg bRg3 = bRg;
        Function0<Unit> function02 = function0;
        bfm.AgG(801541756);
        int iA0D = (i2 & 6) == 0 ? AnonymousClass004.A0D(bfm, i) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0D |= AnonymousClass004.A0e(bfm, str);
        }
        int i4 = i3 & 4;
        if (i4 != 0) {
            iA0D |= 384;
        } else if ((i2 & 384) == 0) {
            iA0D |= AnonymousClass004.A0f(bfm, bRg3);
        }
        int i5 = i3 & 8;
        if (i5 != 0) {
            iA0D |= 3072;
        } else if ((i2 & 3072) == 0) {
            iA0D |= AnonymousClass004.A0W(bfm, function02);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0D & 1171, 1170), bfm, iA0D)) {
            if (i4 != 0) {
                bRg3 = BRg.A00;
            }
            if (i5 != 0) {
                function02 = null;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg3);
            if (function02 != null) {
                bRg2 = BRg.A00;
                bRgA04 = C0v5.A04(bRg2, C3cG.A0A(0), null, function02, true);
            } else {
                bRgA04 = BRg.A00;
                bRg2 = bRgA04;
            }
            BRg bRgThen = bRgA0R.then(bRgA04);
            float f = AuraDimensKt.SpacingXsmall;
            BRg bRgA0B = C3U4.A0B(bRgThen, 0.0f, f);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, f, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0B);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            RentalCarDetailIcon(i, C3U4.A0C(bRg2, 0.0f, AuraDimensKt.SpacingNano, 0.0f, 0.0f), bfm, iA0D & 14, 0);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(bRg2, 1.0f, true), C3cH.A07(bfm, auraTheme), C3cH.A0B(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, (iA0D >> 3) & 14, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134502(i, str, bRg3, function02, i2, i3);
        }
    }

    public static final void RentalCarLocationRows(RentalCarRate rentalCarRate, BRg bRg, BFM bfm, int i, int i2) {
        Function0 function0;
        String strA0t;
        Function0 function02;
        BRg bRg2 = bRg;
        bfm.AgG(-1868132044);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, rentalCarRate) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            Context contextA0H = AnonymousClass002.A0H(bfm);
            RentalCarLocation rentalCarLocation = rentalCarRate.pickup.location;
            RentalCarLocation rentalCarLocation2 = rentalCarRate.dropoff.location;
            boolean zA1B = AnonymousClass003.A1B(iA0d);
            Object objAaT = bfm.AaT();
            if (zA1B || objAaT == C78N.A00) {
                objAaT = AnonymousClass004.A11(bfm, null);
            }
            MutableState mutableState = (MutableState) objAaT;
            String strA0L = AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", C60Q.A0v(AbstractC0878AGe.A0L(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7), "", "", C60Q.A0v(rentalCarRate.supplier.name, rentalCarLocation.name), null), rentalCarLocation.address), null);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function03 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function03);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            if (mapsQuery(rentalCarLocation) == null) {
                bfm.AgE(1592359638);
                BBI.A0R(bbi, false);
                function0 = null;
            } else {
                bfm.AgE(1592359639);
                boolean zA1J = AnonymousClass003.A1J(bfm, mutableState, rentalCarLocation);
                Object objAaT2 = bfm.AaT();
                if (zA1J || objAaT2 == C78N.A00) {
                    objAaT2 = new RentalCarDetailsSectionsKt$RentalCarLocationRows$1$1$1$1(rentalCarLocation, mutableState);
                    bfm.Ai0(objAaT2);
                }
                function0 = (Function0) objAaT2;
                BBI.A0R(bbi, false);
            }
            RentalCarInfoRow(R.drawable.locationpin_outline_24_wght400, strA0L, null, function0, bfm, 0, 4);
            RentalCarAccess rentalCarAccess = rentalCarLocation.access;
            if (rentalCarAccess == null) {
                bfm.AgE(1592420615);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1592420616);
                RentalCarInfoRow(R.drawable.car_outline_24_wght400, RentalCarFormattingKt.rentalCarAccess(rentalCarAccess, bfm, 0), null, null, bfm, 0, 12);
                BBI.A0R(bbi, false);
            }
            List listA0v = C60Q.A0v(rentalCarLocation2.name, rentalCarLocation2.address);
            if (listA0v.isEmpty()) {
                bfm.AgE(1593025240);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(1592613932);
                if (isSamePlaceAs(rentalCarLocation2, rentalCarLocation)) {
                    bfm.AgE(1592726524);
                    strA0t = AnonymousClass001.A0s(bfm, bbi, R.string._name_removed__res_0x7f120596);
                } else {
                    bfm.AgE(1592824422);
                    strA0t = AnonymousClass001.A0t(bfm, AbstractC0878AGe.A0L(PairsDiscretionDocument.TERMINATOR, "", "", listA0v, null), R.string._name_removed__res_0x7f120595);
                    BBI.A0R(bbi, false);
                }
                if (mapsQuery(rentalCarLocation2) == null) {
                    bfm.AgE(1592977685);
                    BBI.A0R(bbi, false);
                    function02 = null;
                } else {
                    bfm.AgE(1592977686);
                    boolean zA1J2 = AnonymousClass003.A1J(bfm, mutableState, rentalCarLocation2);
                    Object objAaT3 = bfm.AaT();
                    if (zA1J2 || objAaT3 == C78N.A00) {
                        objAaT3 = new RentalCarDetailsSectionsKt$RentalCarLocationRows$1$3$1$1(rentalCarLocation2, mutableState);
                        bfm.Ai0(objAaT3);
                    }
                    function02 = (Function0) objAaT3;
                    BBI.A0R(bbi, false);
                }
                RentalCarInfoRow(R.drawable.locationpin_outline_24_wght400, strA0t, null, function02, bfm, 0, 4);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            RentalCarLocation rentalCarLocation3 = (RentalCarLocation) mutableState.getValue();
            if (rentalCarLocation3 == null) {
                bfm.AgE(665816637);
            } else {
                bfm.AgE(665816638);
                boolean zA1O = C3cH.A1O(bfm, mutableState, contextA0H, rentalCarLocation3);
                Object objAaT4 = bfm.AaT();
                if (zA1O || objAaT4 == C78N.A00) {
                    objAaT4 = new RentalCarDetailsSectionsKt$RentalCarLocationRows$2$1$1(contextA0H, rentalCarLocation3, mutableState);
                    bfm.Ai0(objAaT4);
                }
                Function0 function04 = (Function0) objAaT4;
                boolean zA65 = bfm.A65(mutableState);
                Object objAaT5 = bfm.AaT();
                if (zA65 || objAaT5 == C78N.A00) {
                    objAaT5 = new RentalCarDetailsSectionsKt$RentalCarLocationRows$2$2$1(mutableState);
                    bfm.Ai0(objAaT5);
                }
                RentalCarOpenMapsDialog(rentalCarLocation3, function04, (Function0) objAaT5, null, bfm, RentalCarLocation.$stable, 8);
            }
            BBI.A0R(bbi, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass3(rentalCarRate, bRg2, i, i2);
        }
    }

    public static final void RentalCarOpenMapsDialog(RentalCarLocation rentalCarLocation, Function0<Unit> function0, Function0<Unit> function02, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-996961700);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(rentalCarLocation, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0U(bfm, function0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass004.A0V(bfm, function02);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 1171, 1170), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            AuraAlertDialogKt.AuraAlertDialog(bRg2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12059e), AbstractC06907md.A01(PairsDiscretionDocument.TERMINATOR, C60Q.A0v(rentalCarLocation.name, rentalCarLocation.address), null), (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) null, (G0V<? super BFM, ? super Integer, Unit>) B1V.A00(bfm, new C134531(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12059c), function0, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12059d), function02), 1761634925), function02, (BA2) null, false, false, (G0U<? super String, Unit>) null, bfm, AnonymousClass001.A05(iA05 << 12, ((iA05 >> 9) & 14) | 196608), 0, 1944);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134542(rentalCarLocation, function0, function02, bRg2, i, i2);
        }
    }

    public static final void RentalCarPriceRow(String str, String str2, boolean z, BRg bRg, BFM bfm, int i, int i2) {
        AuraTheme auraTheme;
        C1822Arm c1822ArmA0E;
        long jA07;
        BRg bRg2 = bRg;
        bfm.AgG(-513077233);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, str2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA0d |= 3072;
        } else if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 1171, 1170), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            if (z) {
                bfm.AgE(854023961);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0E = C60Q.A0D(bfm, auraTheme);
            } else {
                bfm.AgE(854025150);
                auraTheme = AuraTheme.INSTANCE;
                c1822ArmA0E = C3cH.A0E(bfm, auraTheme);
            }
            BBI bbiA07 = C3cG.A07(bfm);
            if (z) {
                bfm.AgE(854027162);
                jA07 = C3cH.A06(bfm, auraTheme);
            } else {
                bfm.AgE(854028252);
                jA07 = C3cH.A07(bfm, auraTheme);
            }
            BBI.A0R(bbiA07, false);
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0S = AnonymousClass006.A0S(bfm, AuraDimensKt.SpacingMicroPlusNano, 0);
            int iA0J = AnonymousClass003.A0J(bbiA07);
            AKQ akqA04 = BBI.A04(bbiA07);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbiA07.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbiA07, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0S, akqA04, bRgA01, iA0J);
            AuraTextKt.m2639AuraTextUY9GdpU(str, C90m.A00.AiP(BRg.A00, 1.0f, true), jA07, c1822ArmA0E, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, jA07, c1822ArmA0E, null, null, C3cH.A0F(6), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16306);
            BBI.A0R(bbiA07, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134552(str, str2, z, bRg2, i, i2);
        }
    }

    public static final void RentalCarSection(String str, BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-122837453);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0V(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0X = AnonymousClass003.A0X(bfm, AuraDimensKt.SpacingXsmall, 0);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0R);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0X, akqA04, bRgA01, iA0J);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = RentalCarDetailsSectionsKt$RentalCarSection$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, AnonymousClass001.A0Y(bs0, objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            AnonymousClass005.A0q(bbi, bfm, g0v, iA0d >> 6);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134582(str, bRg2, g0v, i, i2);
        }
    }

    public static final void RentalCarSupplierLogo(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-783040932);
        int iA0d = (i & 6) == 0 ? i | AnonymousClass004.A0d(bfm, str) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0d |= 48;
        } else if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ARL arl = B18.A02;
            BRg bRgA07 = C10G.A07(bRg2, 16.0f);
            C1D3 c1d3 = C1D8.A00;
            AuraImageKt.m2573AuraImageXRP3Ue8(str, C3U4.A09(C1DI.A02(C1b8.A01(C11U.A03(bRgA07, c1d3), BaseColors.WHITE), c1d3, 0.5f, C3cH.A0W(bfm).photoBorder), 2.0f), arl, null, null, false, null, 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | 3456, 48, 30704);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C134621(str, bRg2, i, i2);
        }
    }

    public static final boolean isSamePlaceAs(RentalCarLocation rentalCarLocation, RentalCarLocation rentalCarLocation2) {
        return C7384Etj.areEqual(rentalCarLocation.name, rentalCarLocation2.name) && C7384Etj.areEqual(rentalCarLocation.address, rentalCarLocation2.address);
    }

    public static final String mapsQuery(RentalCarLocation rentalCarLocation) {
        String strA01 = AbstractC06907md.A01(", ", C60Q.A0v(rentalCarLocation.name, rentalCarLocation.address), null);
        if (C7BY.A0j(strA01)) {
            return null;
        }
        return strA01;
    }

    public static final boolean launchRentalCarMaps(Context context, Intent intent) {
        try {
            return C7mU.A00().A04().A05(context, intent);
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    public static final void openRentalCarMaps(Context context, RentalCarLocation rentalCarLocation) {
        String strMapsQuery = mapsQuery(rentalCarLocation);
        if (strMapsQuery != null) {
            Uri uriA01 = null;
            try {
                uriA01 = C7Je.A01(FGI.A0M("geo:0,0?q=", Uri.encode(strMapsQuery)));
            } catch (SecurityException | UnsupportedOperationException unused) {
            }
            if (uriA01 == null || !launchRentalCarMaps(context, new Intent("android.intent.action.VIEW", uriA01))) {
                Uri uriA012 = null;
                try {
                    uriA012 = C7Je.A01(FGI.A0M("https://www.google.com/maps/search/?api=1&query=", Uri.encode(strMapsQuery)));
                } catch (SecurityException | UnsupportedOperationException unused2) {
                }
                if (uriA012 != null) {
                    launchRentalCarMaps(context, new Intent("android.intent.action.VIEW", uriA012));
                }
            }
        }
    }
}
