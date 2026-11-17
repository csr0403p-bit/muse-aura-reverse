package com.facebook.aura.agentpermission;

import X.AKQ;
import X.ARD;
import X.AbstractC0885AGm;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BOD;
import X.BPg;
import X.BRg;
import X.C00x;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1BO;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cJ;
import X.C5wL;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.HxE;
import X.InterfaceC1380AiA;
import X.InterfaceC1492Ajz;
import X.InterfaceC1516AkQ;
import android.content.res.Configuration;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.aura.R;
import com.facebook.aura.agentpermission.AgentPermissionTaskDetailsViewModel;
import com.facebook.aura.agentpermission.FlightCheckoutPassengerViewModel;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.navigation.AuraNavigator;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.bottomsheet.AuraBottomSheetContentKt;
import com.facebook.aura.vds.compose.bottomsheet.model.AuraBottomSheetHeaderConfig;
import com.facebook.aura.vds.compose.button.AuraButtonKt;
import com.facebook.aura.vds.compose.button.AuraButtonSize;
import com.facebook.aura.vds.compose.button.AuraButtonStyles;
import com.facebook.aura.vds.compose.image.AuraImageKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraContainer;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class FlightCheckoutPassengersSheetKt {
    public static final float SeatLogoSize = 32.0f;
    public static final float SeatRowTextStart = 56.0f;

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCarrierLogo$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $carrierName;
        public final /* synthetic */ String $iconUrl;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$iconUrl = str;
            this.$carrierName = str2;
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
            FlightCheckoutPassengersSheetKt.FlightCarrierLogo(this.$iconUrl, this.$carrierName, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCheckoutPassengerSheet$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ int $passengerIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, int i, int i2) {
            super(2);
            this.$approvalId = str;
            this.$passengerIndex = i;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightCheckoutPassengersSheetKt.FlightCheckoutPassengerSheet(this.$approvalId, this.$passengerIndex, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCheckoutPassengerSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ AuraNavigator $navigator;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(AuraNavigator auraNavigator) {
            super(2);
            this.$navigator = auraNavigator;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
                AuraNavigator auraNavigator = this.$navigator;
                boolean zA67 = bfm.A67(auraNavigator);
                Object objAaT = bfm.AaT();
                if (zA67 || objAaT == C78N.A00) {
                    objAaT = new FlightCheckoutPassengersSheetKt$FlightCheckoutPassengerSheet$3$1$1(auraNavigator);
                    bfm.Ai0(objAaT);
                }
                FlightCheckoutPassengersSheetKt.PassengerSheetFooter((Function0) objAaT, C3U4.A0B(BRg.A00, AuraDimensKt.SpacingLarge, AuraDimensKt.SpacingSmall), bfm, 0, 0);
                return;
            }
            bfm.Afo();
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCheckoutPassengerSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ FlightCheckoutPassengerUiState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(FlightCheckoutPassengerUiState flightCheckoutPassengerUiState) {
            super(3);
            this.$state = flightCheckoutPassengerUiState;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                FlightCheckoutPassengersSheetKt.PassengerDetails(this.$state, null, bfm, FlightCheckoutPassengerUiState.$stable, 2);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCheckoutPassengerSheet$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ int $passengerIndex;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(String str, int i, int i2) {
            super(2);
            this.$approvalId = str;
            this.$passengerIndex = i;
            this.$$changed = i2;
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }

        public final void invoke(BFM bfm, int i) {
            FlightCheckoutPassengersSheetKt.FlightCheckoutPassengerSheet(this.$approvalId, this.$passengerIndex, bfm, AnonymousClass011.A00(this.$$changed));
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCheckoutPassengersSheet$1, reason: invalid class name and case insensitive filesystem */
    public final class C108331 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108331(String str, int i) {
            super(2);
            this.$approvalId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            FlightCheckoutPassengersSheetKt.FlightCheckoutPassengersSheet(this.$approvalId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCheckoutPassengersSheet$2, reason: invalid class name and case insensitive filesystem */
    public final class C108342 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ String $approvalId;
        public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
        public final /* synthetic */ AuraNavigator $navigator;

        /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCheckoutPassengersSheet$2$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ String $approvalId;
            public final /* synthetic */ HatchAgentPermissionsRepository.FlightCheckoutApproval $checkout;
            public final /* synthetic */ AuraNavigator $navigator;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, AuraNavigator auraNavigator, String str) {
                super(2);
                this.$checkout = flightCheckoutApproval;
                this.$navigator = auraNavigator;
                this.$approvalId = str;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass003.A16(i & 3), bfm, i)) {
                    List<HatchAgentPermissionsRepository.FlightCheckoutPassenger> list = this.$checkout.passengers;
                    AuraNavigator auraNavigator = this.$navigator;
                    String str = this.$approvalId;
                    int i2 = 0;
                    for (HatchAgentPermissionsRepository.FlightCheckoutPassenger flightCheckoutPassenger : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            AbstractC0885AGm.A14();
                            throw F60.createAndThrow();
                        }
                        HatchAgentPermissionsRepository.FlightCheckoutPassenger flightCheckoutPassenger2 = flightCheckoutPassenger;
                        String strTrimToNonEmpty = null;
                        if (i2 > 0) {
                            C3cJ.A0Z(bfm, -1728541045);
                        } else {
                            bfm.AgE(-2045096610);
                        }
                        AnonymousClass001.A1D(bfm);
                        String str2 = flightCheckoutPassenger2.displayName;
                        if (str2 != null) {
                            strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(str2);
                        }
                        String strPassengerTypeLabel = FlightCheckoutPassengersSheetKt.passengerTypeLabel(flightCheckoutPassenger2.type, bfm, 0);
                        boolean zA1a = AnonymousClass001.A1a(AnonymousClass003.A1N(bfm, auraNavigator, str), bfm, i2);
                        Object objAaT = bfm.AaT();
                        if (zA1a || objAaT == C78N.A00) {
                            objAaT = new FlightCheckoutPassengersSheetKt$FlightCheckoutPassengersSheet$2$1$1$1$1(auraNavigator, str, i2);
                            bfm.Ai0(objAaT);
                        }
                        CheckoutRowPrimitivesKt.CheckoutTextRow(strTrimToNonEmpty, strPassengerTypeLabel, null, 0, (Function0) objAaT, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200f6), bfm, 0, 12);
                        i2 = i3;
                    }
                    return;
                }
                bfm.Afo();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108342(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, AuraNavigator auraNavigator, String str) {
            super(3);
            this.$checkout = flightCheckoutApproval;
            this.$navigator = auraNavigator;
            this.$approvalId = str;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                FlightCheckoutPassengersSheetKt.PassengerSectionCard(null, B1V.A00(bfm, new AnonymousClass1(this.$checkout, this.$navigator, this.$approvalId), -745960729), bfm, 48, 1);
            } else {
                bfm.Afo();
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$FlightCheckoutPassengersSheet$3, reason: invalid class name and case insensitive filesystem */
    public final class C108353 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108353(String str, int i) {
            super(2);
            this.$approvalId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            FlightCheckoutPassengersSheetKt.FlightCheckoutPassengersSheet(this.$approvalId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerDetailRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C108363 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ String $label;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108363(String str, String str2, BRg bRg, int i, int i2) {
            super(2);
            this.$label = str;
            this.$value = str2;
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
            FlightCheckoutPassengersSheetKt.PassengerDetailRow(this.$label, this.$value, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerDetails$2, reason: invalid class name and case insensitive filesystem */
    public final class C108372 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightCheckoutPassengerUiState $uiState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108372(FlightCheckoutPassengerUiState flightCheckoutPassengerUiState, BRg bRg, int i, int i2) {
            super(2);
            this.$uiState = flightCheckoutPassengerUiState;
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
            FlightCheckoutPassengersSheetKt.PassengerDetails(this.$uiState, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerSeatRow$3, reason: invalid class name and case insensitive filesystem */
    public final class C108383 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ FlightCheckoutPassengerSeat $seat;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108383(FlightCheckoutPassengerSeat flightCheckoutPassengerSeat, BRg bRg, int i, int i2) {
            super(2);
            this.$seat = flightCheckoutPassengerSeat;
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
            FlightCheckoutPassengersSheetKt.PassengerSeatRow(this.$seat, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerSeatsSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C108391 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<FlightCheckoutPassengerSeat> $seats;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108391(List<FlightCheckoutPassengerSeat> list, BRg bRg, int i, int i2) {
            super(2);
            this.$seats = list;
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
            FlightCheckoutPassengersSheetKt.PassengerSeatsSection(this.$seats, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerSeatsSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C108403 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<FlightCheckoutPassengerSeat> $seats;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108403(List<FlightCheckoutPassengerSeat> list, BRg bRg, int i, int i2) {
            super(2);
            this.$seats = list;
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
            FlightCheckoutPassengersSheetKt.PassengerSeatsSection(this.$seats, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerSection$1, reason: invalid class name and case insensitive filesystem */
    public final class C108411 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<HxE<String, String>> $rows;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108411(String str, List<HxE<String, String>> list, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$rows = list;
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
            FlightCheckoutPassengersSheetKt.PassengerSection(this.$title, this.$rows, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerSection$3, reason: invalid class name and case insensitive filesystem */
    public final class C108423 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ List<HxE<String, String>> $rows;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108423(String str, List<HxE<String, String>> list, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
            this.$rows = list;
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
            FlightCheckoutPassengersSheetKt.PassengerSection(this.$title, this.$rows, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerSectionCard$2, reason: invalid class name and case insensitive filesystem */
    public final class C108432 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C108432(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
            super(2);
            this.$modifier = bRg;
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
            FlightCheckoutPassengersSheetKt.PassengerSectionCard(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerSectionHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C108442 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $title;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108442(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$title = str;
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
            FlightCheckoutPassengersSheetKt.PassengerSectionHeader(this.$title, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.FlightCheckoutPassengersSheetKt$PassengerSheetFooter$2, reason: invalid class name and case insensitive filesystem */
    public final class C108452 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ Function0<Unit> $onDone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108452(Function0<Unit> function0, BRg bRg, int i, int i2) {
            super(2);
            this.$onDone = function0;
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
            FlightCheckoutPassengersSheetKt.PassengerSheetFooter(this.$onDone, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void FlightCheckoutPassengerSheet(String str, int i, BFM bfm, int i2) {
        BBb bBbAAc;
        Object anonymousClass5;
        String strTrimToNonEmpty;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(-889761449);
        int iA0d = (i2 & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i2 : i2;
        if ((i2 & 48) == 0) {
            iA0d |= AnonymousClass004.A0E(bfm, i);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            FlightCheckoutPassengerViewModel.Factory factory = new FlightCheckoutPassengerViewModel.Factory(AnonymousClass002.A0h(bfm), str, i);
            BOD bodA00 = C5wL.A00(bfm);
            if (bodA00 == null) {
                throw AnonymousClass001.A0o();
            }
            FlightCheckoutPassengerUiState flightCheckoutPassengerUiState = (FlightCheckoutPassengerUiState) C1BO.A07(bfm, ((FlightCheckoutPassengerViewModel) C3cH.A0H(factory, bodA00, AnonymousClass005.A0Y(bodA00), C3cG.A0x(FlightCheckoutPassengerViewModel.class))).uiState);
            Boolean boolValueOf = Boolean.valueOf(AnonymousClass002.A1Y(flightCheckoutPassengerUiState));
            boolean zA1M = AnonymousClass003.A1M(bfm, flightCheckoutPassengerUiState, auraNavigatorA0b);
            Object objAaT = bfm.AaT();
            if (zA1M || objAaT == C78N.A00) {
                objAaT = new FlightCheckoutPassengersSheetKt$FlightCheckoutPassengerSheet$1$1(flightCheckoutPassengerUiState, auraNavigatorA0b);
                bfm.Ai0(objAaT);
            }
            AnonymousClass001.A17(bfm, objAaT, boolValueOf);
            if (flightCheckoutPassengerUiState == null) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    anonymousClass5 = new AnonymousClass2(str, i, i2);
                    C3cG.A1D(bBbAAc, anonymousClass5);
                }
                return;
            }
            AuraContainer.SecondaryBottomSheet secondaryBottomSheet = AuraContainer.SecondaryBottomSheet.INSTANCE;
            String str2 = flightCheckoutPassengerUiState.passenger.displayName;
            if (str2 == null || (strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(str2)) == null) {
                strTrimToNonEmpty = "";
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(secondaryBottomSheet, null, null, new AuraBottomSheetHeaderConfig(strTrimToNonEmpty, passengerTypeLabel(flightCheckoutPassengerUiState.passenger.type, bfm, 0), null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), B1V.A00(bfm, new AnonymousClass3(auraNavigatorA0b), 1342350526), null, null, false, false, false, null, B1V.A00(bfm, new AnonymousClass4(flightCheckoutPassengerUiState), -198822278), bfm, 24582, 48, 2022);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            anonymousClass5 = new AnonymousClass5(str, i, i2);
            C3cG.A1D(bBbAAc, anonymousClass5);
        }
    }

    public static final void FlightCheckoutPassengersSheet(String str, BFM bfm, int i) {
        BBb bBbAAc;
        Object c108353;
        C7384Etj.A0Y(str, 0);
        bfm.AgG(758731571);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass003.A1A(iA0d), bfm, iA0d)) {
            AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
            HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApprovalFlightCheckout = flightCheckout(str, bfm, iA0d & 14);
            if (flightCheckoutApprovalFlightCheckout == null || flightCheckoutApprovalFlightCheckout.passengers.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c108353 = new C108331(str, i);
                    C3cG.A1D(bBbAAc, c108353);
                }
                return;
            }
            AuraBottomSheetContentKt.AuraBottomSheetContent(AuraContainer.SecondaryBottomSheet.INSTANCE, null, null, new AuraBottomSheetHeaderConfig(C3cJ.A0I(bfm, flightCheckoutApprovalFlightCheckout.passengers, R.plurals._name_removed__res_0x7f100004, flightCheckoutApprovalFlightCheckout.passengers.size()), null, null, null, null, AuraBottomSheetHeaderConfig.Style.DEFAULT, null), null, null, null, false, false, false, null, B1V.A00(bfm, new C108342(flightCheckoutApprovalFlightCheckout, auraNavigatorA0b, str), 611989744), bfm, 6, 48, 2038);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c108353 = new C108353(str, i);
            C3cG.A1D(bBbAAc, c108353);
        }
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightCheckoutBagType.values().length];
            try {
                AnonymousClass002.A13(FlightCheckoutBagType.CARRY_ON, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FlightCheckoutBagType.CHECKED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void FlightCarrierLogo(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(961732272);
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
            AuraImageKt.m2573AuraImageXRP3Ue8(str, C1b8.A01(C11U.A02(bRg2, SeatLogoSize), AuraTheme.INSTANCE.getColors(bfm, 6).background), null, str2, null, false, null, 0L, false, false, false, null, null, null, null, bfm, (iA0d & 14) | ((iA0d << 6) & 7168), 48, 30708);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass1(str, str2, bRg2, i, i2);
        }
    }

    public static final void PassengerDetailRow(String str, String str2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(-1560163096);
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
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingSmall;
            BRg bRgA0B = C3U4.A0B(bRgA0R, f, f2);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightCheckoutPassengersSheetKt$PassengerDetailRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0B, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f2);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0K, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(str, c90m.AiP(BRg.A00, 1.0f, true), C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
            AuraTextKt.m2639AuraTextUY9GdpU(str2, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, C3cH.A0F(6), false, 0, 0, 0, null, null, null, bfm, (iA0d >> 3) & 14, 0, 16306);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108363(str, str2, bRg2, i, i2);
        }
    }

    public static final void PassengerDetails(FlightCheckoutPassengerUiState flightCheckoutPassengerUiState, BRg bRg, BFM bfm, int i, int i2) {
        HxE hxEA0S;
        HxE hxEA0S2;
        HxE hxEA0S3;
        HxE hxEA0S4;
        HxE hxEA0S5;
        HxE hxEA0S6;
        List<HxE<String, String>> listBagRows;
        BRg bRg2 = bRg;
        bfm.AgG(-517235790);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(flightCheckoutPassengerUiState, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            HatchAgentPermissionsRepository.FlightCheckoutPassenger flightCheckoutPassenger = flightCheckoutPassengerUiState.passenger;
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200e9);
            String str = flightCheckoutPassenger.bornOnDisplay;
            if (str == null) {
                bfm.AgE(-1516967225);
                BBI.A0R(bbi, false);
                hxEA0S = null;
            } else {
                bfm.AgE(-1516967224);
                hxEA0S = C3cJ.A0S(bfm, bbi, str, R.string._name_removed__res_0x7f1200d9);
            }
            String str2 = flightCheckoutPassenger.genderDisplay;
            if (str2 == null) {
                bfm.AgE(-1516811698);
                BBI.A0R(bbi, false);
                hxEA0S2 = null;
            } else {
                bfm.AgE(-1516811697);
                hxEA0S2 = C3cJ.A0S(bfm, bbi, str2, R.string._name_removed__res_0x7f1200dc);
            }
            String str3 = flightCheckoutPassenger.email;
            if (str3 == null) {
                bfm.AgE(-1516670865);
                BBI.A0R(bbi, false);
                hxEA0S3 = null;
            } else {
                bfm.AgE(-1516670864);
                hxEA0S3 = C3cJ.A0S(bfm, bbi, str3, R.string._name_removed__res_0x7f1200db);
            }
            String str4 = flightCheckoutPassenger.phoneNumber;
            if (str4 == null) {
                bfm.AgE(-1516525041);
                BBI.A0R(bbi, false);
                hxEA0S4 = null;
            } else {
                bfm.AgE(-1516525040);
                hxEA0S4 = C3cJ.A0S(bfm, bbi, str4, R.string._name_removed__res_0x7f1200ea);
            }
            String str5 = flightCheckoutPassenger.knownTravelerNumberDisplay;
            if (str5 == null) {
                bfm.AgE(-1516363841);
                BBI.A0R(bbi, false);
                hxEA0S5 = null;
            } else {
                bfm.AgE(-1516363840);
                hxEA0S5 = C3cJ.A0S(bfm, bbi, str5, R.string._name_removed__res_0x7f1200dd);
            }
            String str6 = flightCheckoutPassenger.redressNumberDisplay;
            if (str6 == null) {
                bfm.AgE(-1516193434);
                BBI.A0R(bbi, false);
                hxEA0S6 = null;
            } else {
                bfm.AgE(-1516193433);
                hxEA0S6 = C3cJ.A0S(bfm, bbi, str6, R.string._name_removed__res_0x7f1200ec);
            }
            PassengerSection(strA01, BFI.A0F(new HxE[]{hxEA0S, hxEA0S2, hxEA0S3, hxEA0S4, hxEA0S5, hxEA0S6}), null, bfm, 0, 4);
            String strA012 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200e4);
            List<String> list = flightCheckoutPassenger.loyaltyAccounts;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass002.A1J(it.next(), null, arrayListA0i);
            }
            PassengerSection(strA012, arrayListA0i, null, bfm, 0, 4);
            if (flightCheckoutPassengerUiState.seatsUnavailable) {
                bfm.AgE(-1515855719);
                PassengerSection(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200f0), unavailableRows(bfm, 0), null, bfm, 0, 4);
                BBI.A0R(bbi, false);
            } else {
                bfm.AgE(-1515693248);
                PassengerSeatsSection(flightCheckoutPassengerUiState.seats, null, bfm, 0, 2);
                BBI.A0R(bbi, false);
            }
            String strA013 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200d6);
            if (flightCheckoutPassengerUiState.bagsUnavailable) {
                bfm.AgE(643849689);
                listBagRows = unavailableRows(bfm, 0);
            } else {
                bfm.AgE(643850429);
                listBagRows = bagRows(flightCheckoutPassengerUiState.bags, bfm, 0);
            }
            BBI.A0R(bbi, false);
            PassengerSection(strA013, listBagRows, null, bfm, 0, 4);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108372(flightCheckoutPassengerUiState, bRg2, i, i2);
        }
    }

    public static final void PassengerSeatRow(FlightCheckoutPassengerSeat flightCheckoutPassengerSeat, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(939433233);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(flightCheckoutPassengerSeat, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg2);
            float f = flightCheckoutPassengerSeat.airlineIconUrl != null ? AuraDimensKt.SpacingSmall : AuraDimensKt.SpacingMedium;
            float f2 = AuraDimensKt.SpacingMedium;
            float f3 = AuraDimensKt.SpacingSmall;
            BRg bRgA0C = C3U4.A0C(bRgA0R, f, f3, f2, f3);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightCheckoutPassengersSheetKt$PassengerSeatRow$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            BRg bRgA0Y = AnonymousClass001.A0Y(bRgA0C, objAaT, true);
            InterfaceC1380AiA interfaceC1380AiAA0K = AnonymousClass007.A0K(bfm, f3);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA0Y);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            G0V g0vA0v = C3cH.A0v(bfm, interfaceC1380AiAA0K);
            G0V<InterfaceC1516AkQ, InterfaceC1492Ajz, Unit> g0v = C1515AkP.A06;
            G0V g0vA19 = AnonymousClass004.A19(bfm, akqA04, g0v, iA02);
            G0U<InterfaceC1516AkQ, Unit> g0u = C1515AkP.A02;
            G0V g0vA0u = AnonymousClass002.A0u(bfm, bRgA01, g0u);
            C90m c90m = C90m.A00;
            String str = flightCheckoutPassengerSeat.airlineIconUrl;
            if (str == null) {
                bfm.AgE(-1921266451);
            } else {
                bfm.AgE(-1921266450);
                FlightCarrierLogo(str, flightCheckoutPassengerSeat.carrierName, null, bfm, 0, 4);
            }
            BBI.A0R(bbi, false);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, BRg.A00, true);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            int iA0D = AnonymousClass001.A0D(bbi);
            AKQ akqA042 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA0O);
            AnonymousClass005.A0n(bfm, bbi, function0);
            BPg.A02(bfm, interfaceC1380AiAA0U, g0vA0v);
            BPg.A02(bfm, akqA042, g0v);
            AnonymousClass003.A15(g0u, g0vA19, bfm, iA0D);
            BPg.A02(bfm, bRgA012, g0vA0u);
            String strFlightSliceTitle = flightCheckoutPassengerSeat.segmentTitle;
            if (strFlightSliceTitle == null) {
                bfm.AgE(1490917856);
                strFlightSliceTitle = FlightCheckoutApprovalCardKt.flightSliceTitle(flightCheckoutPassengerSeat.slice, bfm, HatchAgentPermissionsRepository.FlightCheckoutSlice.$stable);
                if (strFlightSliceTitle == null) {
                    strFlightSliceTitle = "";
                }
            } else {
                bfm.AgE(1490916306);
            }
            BBI.A0R(bbi, false);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strFlightSliceTitle, null, C3cH.A06(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            String strSeatDetail = seatDetail(flightCheckoutPassengerSeat, bfm, FlightCheckoutPassengerSeat.$stable | (iA05 & 14));
            if (strSeatDetail == null) {
                bfm.AgE(-1026039655);
                BBI.A0R(bbi, false);
            } else {
                AuraTextKt.m2639AuraTextUY9GdpU(strSeatDetail, null, C3cH.A07(bfm, auraTheme), C3cH.A0X(bfm, auraTheme, -1026039654).subheadlineRegular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
                BBI.A0R(bbi, false);
            }
            BBI.A0R(bbi, true);
            AuraTextKt.m2639AuraTextUY9GdpU(flightCheckoutPassengerSeat.designator, null, C3cH.A07(bfm, auraTheme), C3cH.A0C(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16370);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108383(flightCheckoutPassengerSeat, bRg2, i, i2);
        }
    }

    public static final void PassengerSectionHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(606750426);
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
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).footnoteMedium;
            long jA07 = C3cH.A07(bfm, auraTheme);
            float f = AuraDimensKt.SpacingMedium;
            BRg bRgA0C = C3U4.A0C(bRg2, f + f, f, f, AuraDimensKt.SpacingXsmall);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = FlightCheckoutPassengersSheetKt$PassengerSectionHeader$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(str, ARD.A01(bRgA0C, (G0U) objAaT, false), jA07, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, iA0d & 14, 0, 16368);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108442(str, bRg2, i, i2);
        }
    }

    public static final void PassengerSheetFooter(Function0<Unit> function0, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(768509989);
        int iA0T = (i & 6) == 0 ? i | AnonymousClass004.A0T(bfm, function0) : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA0T |= 48;
        } else if ((i & 48) == 0) {
            iA0T |= AnonymousClass004.A0e(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0T & 19, 18), bfm, iA0T)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgThen);
            Function0<InterfaceC1516AkQ> function02 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function02);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200e5);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            AuraTextKt.m2639AuraTextUY9GdpU(strA01, C3U4.A0C(BRg.A00, 0.0f, 0.0f, 0.0f, AuraDimensKt.SpacingSmall), C3cH.A07(bfm, auraTheme), auraTheme.getTypography(bfm, 6).caption1Regular, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            AuraButtonKt.m2408AuraButtonnL3aKkM(null, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200da), null, c1062ATq, AuraButtonStyles.INSTANCE.primary(null, bfm, 48, 1), AuraButtonSize.LARGE, null, false, false, false, false, false, null, null, function0, null, null, null, null, null, null, null, null, false, 0, false, 0, bfm, 199680, (iA0T << 12) & 57344, 0, 134201285);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108452(function0, bRg2, i, i2);
        }
    }

    public static final String passengerTypeLabel(String str, BFM bfm, int i) {
        int i2;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != 92676538) {
                if (iHashCode != 94631196) {
                    if (iHashCode == 2057238613 && str.equals("infant_without_seat")) {
                        bfm.AgE(-751448047);
                        i2 = R.string._name_removed__res_0x7f1200e8;
                        return AnonymousClass003.A0e(bfm, i2);
                    }
                } else if (str.equals("child")) {
                    bfm.AgE(-751451248);
                    i2 = R.string._name_removed__res_0x7f1200e7;
                    return AnonymousClass003.A0e(bfm, i2);
                }
            } else if (str.equals("adult")) {
                bfm.AgE(-751454000);
                i2 = R.string._name_removed__res_0x7f1200e6;
                return AnonymousClass003.A0e(bfm, i2);
            }
        }
        AnonymousClass004.A1A(bfm, -1819971663);
        return null;
    }

    public static final String seatDetail(FlightCheckoutPassengerSeat flightCheckoutPassengerSeat, BFM bfm, int i) {
        String str;
        BBI bbiA07;
        Locale locale = ((Configuration) bfm.A6v(AndroidCompositionLocals_androidKt.A00)).getLocales().get(0);
        LocalDate localDate = flightCheckoutPassengerSeat.departingDate;
        if (localDate == null) {
            bbiA07 = AnonymousClass002.A0M(bfm, -1816563845);
            str = null;
        } else {
            bfm.AgE(-1816563844);
            boolean zA1K = AnonymousClass003.A1K(bfm, localDate, locale);
            Object objAaT = bfm.AaT();
            if (zA1K || objAaT == C78N.A00) {
                objAaT = DateTimeFormatter.ofPattern(DateFormat.getBestDateTimePattern(locale, "EEEMMMd"), locale).format(localDate);
                bfm.Ai0(objAaT);
            }
            str = (String) objAaT;
            bbiA07 = C3cG.A07(bfm);
            if (str != null && flightCheckoutPassengerSeat.flightNumber != null) {
                bfm.AgE(-335685461);
                String strA0w = AnonymousClass006.A0w(bfm, str, flightCheckoutPassengerSeat.flightNumber, R.string._name_removed__res_0x7f1200ee);
                BBI.A0R(bbiA07, false);
                return strA0w;
            }
        }
        bfm.AgE(-1816215497);
        BBI.A0R(bbiA07, false);
        return str == null ? flightCheckoutPassengerSeat.flightNumber : str;
    }

    public static final void PassengerSeatsSection(List<FlightCheckoutPassengerSeat> list, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c108403;
        bfm.AgG(-1665726006);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(list, bfm, i) ? 1 : 0) | i : i;
        int i3 = i2 & 2;
        if (i3 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c108403 = new C108391(list, bRg, i, i2);
                    C3cG.A1D(bBbAAc, c108403);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            PassengerSectionHeader(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200f0), null, bfm, 0, 2);
            PassengerSectionCard(null, B1V.A00(bfm, new FlightCheckoutPassengersSheetKt$PassengerSeatsSection$2$1(list), -293371061), bfm, 48, 1);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c108403 = new C108403(list, bRg, i, i2);
            C3cG.A1D(bBbAAc, c108403);
        }
    }

    public static final void PassengerSection(String str, List<HxE<String, String>> list, BRg bRg, BFM bfm, int i, int i2) {
        BBb bBbAAc;
        Object c108423;
        bfm.AgG(643964497);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass002.A06(AnonymousClass004.A1Y(list, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 4;
        if (i3 != 0) {
            iA0d |= 384;
        } else if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0f(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 147, 146), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            if (list.isEmpty()) {
                bBbAAc = bfm.AAc();
                if (bBbAAc != null) {
                    c108423 = new C108411(str, list, bRg, i, i2);
                    C3cG.A1D(bBbAAc, c108423);
                }
                return;
            }
            BRg bRgA0R = AnonymousClass001.A0R(bRg);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA0J);
            PassengerSectionHeader(str, null, bfm, iA0d & 14, 2);
            PassengerSectionCard(null, B1V.A00(bfm, new FlightCheckoutPassengersSheetKt$PassengerSection$2$1(list), 922106770), bfm, 48, 1);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            c108423 = new C108423(str, list, bRg, i, i2);
            C3cG.A1D(bBbAAc, c108423);
        }
    }

    public static final void PassengerSectionCard(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        bfm.AgG(-1078439691);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A03(C3U4.A07(AnonymousClass001.A0R(bRg), AuraDimensKt.SpacingMedium), CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).card);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA0J = AnonymousClass003.A0J(bbi);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA012 = AxM.A01(bfm, bRgA01);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA012, iA0J);
            AnonymousClass005.A0q(bbi, bfm, g0v, iA0d >> 3);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108432(bRg, g0v, i, i2);
        }
    }

    public static final List<HxE<String, String>> bagRows(List<FlightCheckoutPassengerBag> list, BFM bfm, int i) {
        int i2;
        String strA0Y;
        bfm.AgE(-2101301623);
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (FlightCheckoutPassengerBag flightCheckoutPassengerBag : list) {
            int iOrdinal = flightCheckoutPassengerBag.type.ordinal();
            if (iOrdinal == 0) {
                bfm.AgE(1296097393);
                i2 = R.string._name_removed__res_0x7f1200d7;
            } else {
                if (iOrdinal != 1) {
                    throw AnonymousClass005.A0k(bfm, 1296095051);
                }
                bfm.AgE(1296101456);
                i2 = R.string._name_removed__res_0x7f1200d8;
            }
            String strA01 = AbstractC2271BQs.A01(bfm, i2);
            BBI bbiA07 = C3cG.A07(bfm);
            if (flightCheckoutPassengerBag.quantity <= 0) {
                bfm.AgE(1296105909);
                strA0Y = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200d5);
            } else {
                bfm.AgE(1296109180);
                strA0Y = AnonymousClass007.A0Y(flightCheckoutPassengerBag.quantity, bfm, R.plurals._name_removed__res_0x7f100003);
            }
            BBI.A0R(bbiA07, false);
            AnonymousClass002.A1J(strA01, strA0Y, arrayListA0i);
        }
        AnonymousClass002.A19(bfm);
        return arrayListA0i;
    }

    public static final HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckout(String str, BFM bfm, int i) {
        AuraNavigator auraNavigatorA0b = AnonymousClass002.A0b(bfm);
        AgentPermissionTaskDetailsViewModel.Factory factory = new AgentPermissionTaskDetailsViewModel.Factory(AnonymousClass002.A0h(bfm), str);
        BOD bodA00 = C5wL.A00(bfm);
        if (bodA00 == null) {
            throw AnonymousClass001.A0o();
        }
        HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval = (HatchAgentPermissionsRepository.AgentPermissionApproval) C1BO.A07(bfm, ((AgentPermissionTaskDetailsViewModel) C3cH.A0G(factory, bodA00, AnonymousClass005.A0Y(bodA00), AgentPermissionTaskDetailsViewModel.class)).approval);
        Object obj = agentPermissionApproval != null ? agentPermissionApproval.richPayload : null;
        HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval = obj instanceof HatchAgentPermissionsRepository.FlightCheckoutApproval ? (HatchAgentPermissionsRepository.FlightCheckoutApproval) obj : null;
        boolean zA1M = AnonymousClass003.A1M(bfm, flightCheckoutApproval, auraNavigatorA0b);
        Object objAaT = bfm.AaT();
        if (zA1M || objAaT == C78N.A00) {
            objAaT = new FlightCheckoutPassengersSheetKt$flightCheckout$1$1(flightCheckoutApproval, auraNavigatorA0b);
            bfm.Ai0(objAaT);
        }
        AnonymousClass001.A17(bfm, objAaT, flightCheckoutApproval);
        return flightCheckoutApproval;
    }

    public static final List<HxE<String, String>> unavailableRows(BFM bfm, int i) {
        return Collections.singletonList(C3cG.A0r(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1200f3), null));
    }
}
