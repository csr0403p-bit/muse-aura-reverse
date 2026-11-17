package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AbstractC0878AGe;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.AnonymousClass011;
import X.AxM;
import X.B1V;
import X.BBI;
import X.BBb;
import X.BFI;
import X.BFM;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C01N;
import X.C07C;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1b8;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C3cJ;
import X.C7384Etj;
import X.C78N;
import X.C90m;
import X.F60;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import android.icu.text.ListFormatter;
import com.facebook.aura.R;
import com.facebook.aura.common.appname.HatchAppName;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.sharesheet.HatchMessageShareDocumentRenderer;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.divider.AuraDividerKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CarRentalReservationApprovalCardKt {
    public static final int MAX_LEGAL_LINKS = 4;

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationApprovalCard$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
            super(3);
            this.$approval = agentPermissionApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                bfm.Afo();
            } else {
                CarRentalReservationApprovalCardKt.CarRentalReservationHeader(this.$approval, null, bfm, HatchAgentPermissionsRepository.AgentPermissionApproval.$stable, 2);
                AgentPermissionPendingCardKt.AgentPermissionReviewText(this.$approval.reviewText, null, false, bfm, 0, 6);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationApprovalCard$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.CarRentalReservationApproval $checkout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval) {
            super(3);
            this.$checkout = carRentalReservationApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (AnonymousClass001.A1b(AnonymousClass004.A1G(i), bfm, i)) {
                CarRentalReservationApprovalCardKt.CarRentalReservationLegalFooter(this.$checkout, null, bfm, HatchAgentPermissionsRepository.CarRentalReservationApproval.$stable, 2);
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

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationApprovalCard$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ HatchAgentPermissionsRepository.CarRentalReservationApproval $checkout;

        /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationApprovalCard$3$1, reason: invalid class name */
        public final class AnonymousClass1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ HatchAgentPermissionsRepository.CarRentalReservationApproval $checkout;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval) {
                super(2);
                this.$checkout = carRentalReservationApproval;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    CarRentalReservationApprovalCardKt.CarRentalReservationDetailRows(this.$checkout, bfm, HatchAgentPermissionsRepository.CarRentalReservationApproval.$stable);
                    CarRentalReservationApprovalCardKt.CarRentalReservationDivider(null, bfm, 0, 1);
                    String strA01 = AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12057f);
                    HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval = this.$checkout;
                    Locale locale = Locale.getDefault();
                    C7384Etj.A0U(locale);
                    CheckoutRowPrimitivesKt.CheckoutTotalRow(strA01, CarRentalReservationFormattingKt.formattedTotal(carRentalReservationApproval, locale), null, null, null, null, bfm, 0, 60);
                    return;
                }
                bfm.Afo();
            }
        }

        /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationApprovalCard$3$2, reason: invalid class name */
        public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
            public final /* synthetic */ HatchAgentPermissionsRepository.CarRentalReservationApproval $checkout;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval) {
                super(2);
                this.$checkout = carRentalReservationApproval;
            }

            @Override // X.G0V
            public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
                invoke(bfm, AnonymousClass001.A0F(num));
                return Unit.INSTANCE;
            }

            public final void invoke(BFM bfm, int i) {
                if (AnonymousClass001.A1b(AnonymousClass002.A1P(i & 3, 2), bfm, i)) {
                    CheckoutRowPrimitivesKt.CheckoutTextRow(AnonymousClass001.A0t(bfm, this.$checkout.supplierName, R.string._name_removed__res_0x7f12057d), AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f12057c), null, 0, null, null, bfm, 0, 60);
                } else {
                    bfm.Afo();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval) {
            super(3);
            this.$checkout = carRentalReservationApproval;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
                return;
            }
            CarRentalReservationApprovalCardKt.CarRentalReservationSection(null, B1V.A00(bfm, new AnonymousClass1(this.$checkout), -1618078018), bfm, 48, 1);
            if (this.$checkout.isPostpaid) {
                bfm.AgE(-1077684337);
                CarRentalReservationApprovalCardKt.CarRentalReservationSection(null, B1V.A00(bfm, new AnonymousClass2(this.$checkout), -1263857085), bfm, 48, 1);
            } else {
                bfm.AgE(-1077330689);
            }
            AnonymousClass002.A19(bfm);
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationApprovalCard$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ HatchAgentPermissionsRepository.CarRentalReservationApproval $checkout;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ RichApprovalSurface $surface;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval, RichApprovalSurface richApprovalSurface, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
            this.$checkout = carRentalReservationApproval;
            this.$surface = richApprovalSurface;
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
            CarRentalReservationApprovalCardKt.CarRentalReservationApprovalCard(this.$approval, this.$checkout, this.$surface, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationDetailRows$5, reason: invalid class name */
    public final class AnonymousClass5 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ HatchAgentPermissionsRepository.CarRentalReservationApproval $checkout;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval, int i) {
            super(2);
            this.$checkout = carRentalReservationApproval;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            CarRentalReservationApprovalCardKt.CarRentalReservationDetailRows(this.$checkout, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationDivider$1, reason: invalid class name and case insensitive filesystem */
    public final class C107811 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107811(BRg bRg, int i, int i2) {
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
            CarRentalReservationApprovalCardKt.CarRentalReservationDivider(this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C107822 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.AgentPermissionApproval $approval;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107822(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$approval = agentPermissionApproval;
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
            CarRentalReservationApprovalCardKt.CarRentalReservationHeader(this.$approval, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationLegalFooter$1, reason: invalid class name and case insensitive filesystem */
    public final class C107831 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ HatchAgentPermissionsRepository.CarRentalReservationApproval $checkout;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C107831(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval, BRg bRg, int i, int i2) {
            super(2);
            this.$checkout = carRentalReservationApproval;
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
            CarRentalReservationApprovalCardKt.CarRentalReservationLegalFooter(this.$checkout, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CarRentalReservationApprovalCardKt$CarRentalReservationSection$2, reason: invalid class name and case insensitive filesystem */
    public final class C107842 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ G0V<BFM, Integer, Unit> $content;
        public final /* synthetic */ BRg $modifier;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C107842(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, int i, int i2) {
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
            CarRentalReservationApprovalCardKt.CarRentalReservationSection(this.$modifier, this.$content, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    public static final void CarRentalReservationLegalFooter(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval, BRg bRg, BFM bfm, int i, int i2) {
        int i3;
        Object[] objArr;
        BRg bRg2 = bRg;
        bfm.AgG(1041807683);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(carRentalReservationApproval, bfm, i) ? 1 : 0) | i : i;
        int i4 = i2 & 2;
        if (i4 != 0) {
            iA05 |= 48;
        } else if ((i & 48) == 0) {
            iA05 |= AnonymousClass004.A0e(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 19, 18), bfm, iA05)) {
            if (i4 != 0) {
                bRg2 = BRg.A00;
            }
            List<HatchAgentPermissionsRepository.CarRentalReservationLegalLink> listA0a = AbstractC0878AGe.A0a(carRentalReservationApproval.legalLinks, 4);
            ArrayList arrayListA0m = AnonymousClass002.A0m(listA0a);
            for (HatchAgentPermissionsRepository.CarRentalReservationLegalLink carRentalReservationLegalLink : listA0a) {
                arrayListA0m.add(new LegalLink(carRentalReservationLegalLink.title, carRentalReservationLegalLink.url));
            }
            if (arrayListA0m.isEmpty()) {
                bfm.AgE(1059312894);
                i3 = R.string._name_removed__res_0x7f12057b;
                objArr = new Object[]{HatchAppName.value, carRentalReservationApproval.supplierName};
            } else {
                bfm.AgE(1059481410);
                i3 = R.string._name_removed__res_0x7f12057a;
                String str = carRentalReservationApproval.supplierName;
                ListFormatter listFormatter = ListFormatter.getInstance(Locale.getDefault());
                ArrayList arrayListA0m2 = AnonymousClass002.A0m(arrayListA0m);
                Iterator it = arrayListA0m.iterator();
                while (it.hasNext()) {
                    arrayListA0m2.add(((LegalLink) it.next()).label);
                }
                String str2 = listFormatter.format(arrayListA0m2);
                C7384Etj.A0U(str2);
                objArr = new Object[]{HatchAppName.value, str, str2};
            }
            String strA02 = AbstractC2271BQs.A02(bfm, objArr, i3);
            AnonymousClass001.A1D(bfm);
            CheckoutRowPrimitivesKt.CheckoutLegalFooter(CheckoutRowPrimitivesKt.m189rememberCheckoutLegalTextXOJAsU(strA02, arrayListA0m, C3cH.A0W(bfm).accent, bfm, 0), bRg2, bfm, iA05 & HatchMessageShareDocumentRenderer.CHIP_HEIGHT_PX, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107831(carRentalReservationApproval, bRg2, i, i2);
        }
    }

    public static final void CarRentalReservationApprovalCard(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval, RichApprovalSurface richApprovalSurface, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        AnonymousClass005.A0x(agentPermissionApproval, carRentalReservationApproval, richApprovalSurface);
        bfm.AgG(-1004842641);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
        if ((i & 48) == 0) {
            iA05 |= AnonymousClass002.A06(AnonymousClass004.A1Y(carRentalReservationApproval, bfm, i) ? 1 : 0);
        }
        if ((i & 384) == 0) {
            iA05 |= AnonymousClass003.A05(AnonymousClass004.A1Z(richApprovalSurface, bfm, i) ? 1 : 0);
        }
        int i3 = i2 & 8;
        if (i3 != 0) {
            iA05 |= 3072;
        } else if ((i & 3072) == 0) {
            iA05 |= AnonymousClass004.A0g(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1L(iA05), bfm, iA05)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            ApprovalCardScaffoldKt.ApprovalCardScaffold(agentPermissionApproval.decisionOptions, richApprovalSurface, B1V.A00(bfm, new AnonymousClass1(agentPermissionApproval), 205671623), bRg2, null, B1V.A00(bfm, new AnonymousClass2(carRentalReservationApproval), -1386091868), B1V.A00(bfm, new AnonymousClass3(carRentalReservationApproval), -485023933), bfm, C3cJ.A01(iA05), 16);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass4(agentPermissionApproval, carRentalReservationApproval, richApprovalSurface, bRg2, i, i2);
        }
    }

    public static final void CarRentalReservationHeader(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(841319698);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(agentPermissionApproval, bfm, i) ? 1 : 0) | i : i;
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
            InterfaceC1380AiA interfaceC1380AiAA0W = AnonymousClass003.A0W(bfm);
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
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0W, akqA04, bRgA01, iA0J);
            C90m c90m = C90m.A00;
            String strA0a = C3cI.A0a(agentPermissionApproval.iconUrl);
            BS0 bs0 = BRg.A00;
            CheckoutApprovalSharedKt.CheckoutMerchantFavicon(strA0a, C10G.A07(C3U4.A0C(bs0, AuraDimensKt.SpacingMicro, 0.0f, 0.0f, 0.0f), 24.0f), bfm, 0, 0);
            C01N.A09(bfm, bs0, AuraDimensKt.SpacingSmall);
            String strAgentPermissionHeadline = AgentPermissionTitleKt.agentPermissionHeadline(agentPermissionApproval, null, AnonymousClass001.A0t(bfm, AgentPermissionTitleKt.agentPermissionAgentName(bfm, 0), R.string._name_removed__res_0x7f12057e), bfm, C3cH.A01(iA05), 2);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).subheadlineMedium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BRg bRgA0O = AnonymousClass001.A0O(c90m, bs0, true);
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = CarRentalReservationApprovalCardKt$CarRentalReservationHeader$1$1$1.INSTANCE;
                bfm.Ai0(objAaT);
            }
            AuraTextKt.m2639AuraTextUY9GdpU(strAgentPermissionHeadline, AnonymousClass001.A0Y(bRgA0O, objAaT, false), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107822(agentPermissionApproval, bRg2, i, i2);
        }
    }

    public static final void CarRentalReservationDetailRows(HatchAgentPermissionsRepository.CarRentalReservationApproval carRentalReservationApproval, BFM bfm, int i) {
        String strA0Y;
        BBI bbiA07;
        bfm.AgG(1940373120);
        int iA05 = (i & 6) == 0 ? AnonymousClass002.A05(AnonymousClass004.A1X(carRentalReservationApproval, bfm, i) ? 1 : 0) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA05 & 3, 2), bfm, iA05)) {
            HatchAgentPermissionsRepository.CarRentalReservationStop carRentalReservationStop = carRentalReservationApproval.pickup;
            String str = carRentalReservationStop.locationName;
            if (str == null) {
                str = carRentalReservationStop.address;
            }
            HatchAgentPermissionsRepository.CarRentalReservationStop carRentalReservationStop2 = carRentalReservationApproval.dropoff;
            String str2 = carRentalReservationStop2.locationName;
            if (str2 == null) {
                str2 = carRentalReservationStop2.address;
            }
            String str3 = carRentalReservationApproval.vehicleName;
            String str4 = carRentalReservationApproval.supplierName;
            String strCarRentalClass = CarRentalReservationFormattingKt.carRentalClass(carRentalReservationApproval.category, bfm, 0);
            String strCarRentalTransmission = CarRentalReservationFormattingKt.carRentalTransmission(carRentalReservationApproval.transmission, bfm, 0);
            Integer num = carRentalReservationApproval.seats;
            if (num == null) {
                bbiA07 = AnonymousClass002.A0M(bfm, -308714790);
                strA0Y = null;
            } else {
                bfm.AgE(-308714789);
                strA0Y = AnonymousClass007.A0Y(num.intValue(), bfm, R.plurals._name_removed__res_0x7f100016);
                bbiA07 = C3cG.A07(bfm);
            }
            CheckoutRowPrimitivesKt.CheckoutTextRow(str3, AbstractC0878AGe.A0L(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f1205a7), "", "", BFI.A0F(new String[]{str4, strCarRentalClass, strCarRentalTransmission, strA0Y}), null), null, 0, null, null, bfm, 0, 60);
            CarRentalReservationDivider(null, bfm, 0, 1);
            CheckoutRowPrimitivesKt.CheckoutTextRow(str == null ? carRentalReservationApproval.supplierName : str, CarRentalReservationFormattingKt.formatCarRentalPeriod(carRentalReservationApproval.pickup, carRentalReservationApproval.dropoff), null, 0, null, null, bfm, 0, 60);
            if (str2 == null || str2.equals(str)) {
                bfm.AgE(-308302583);
                BBI.A0R(bbiA07, false);
            } else {
                bfm.AgE(-308302582);
                CarRentalReservationDivider(null, bfm, 0, 1);
                CheckoutRowPrimitivesKt.CheckoutTextRow(str2, AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120594), null, 0, null, null, bfm, 0, 60);
                BBI.A0R(bbiA07, false);
            }
            String str5 = carRentalReservationApproval.driverName;
            if (str5 == null) {
                bfm.AgE(-308127402);
            } else {
                bfm.AgE(-308127401);
                CarRentalReservationDivider(null, bfm, 0, 1);
                CheckoutRowPrimitivesKt.CheckoutTextRow(AbstractC2271BQs.A01(bfm, R.string._name_removed__res_0x7f120579), str5, null, 0, null, null, bfm, 0, 60);
            }
            BBI.A0R(bbiA07, false);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass5(carRentalReservationApproval, i);
        }
    }

    public static final void CarRentalReservationDivider(BRg bRg, BFM bfm, int i, int i2) {
        bfm.AgG(-1119937163);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 3, 2), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            AuraDividerKt.AuraRowDivider(C3U4.A07(bRg, AuraDimensKt.SpacingMedium), bfm, 0, 0);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C107811(bRg, i, i2);
        }
    }

    public static final void CarRentalReservationSection(BRg bRg, G0V<? super BFM, ? super Integer, Unit> g0v, BFM bfm, int i, int i2) {
        bfm.AgG(1476918952);
        int i3 = i2 & 1;
        int iA0d = i3 != 0 ? i | 6 : (i & 6) == 0 ? AnonymousClass004.A0d(bfm, bRg) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0U(bfm, g0v);
        }
        if (AnonymousClass001.A1b(AnonymousClass002.A1P(iA0d & 19, 18), bfm, iA0d)) {
            if (i3 != 0) {
                bRg = BRg.A00;
            }
            BRg bRgA01 = C1b8.A01(C11U.A03(AnonymousClass001.A0R(bRg), CheckoutRowPrimitivesKt.CheckoutSectionShape), C3cH.A0W(bfm).secondaryButtonBackground);
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
            bBbAAc.A06 = new C107842(bRg, g0v, i, i2);
        }
    }
}
