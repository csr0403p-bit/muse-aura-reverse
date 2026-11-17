package com.facebook.aura.agentpermission;

import X.AKQ;
import X.AVy;
import X.AbstractC2271BQs;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass011;
import X.AxM;
import X.B18;
import X.BBI;
import X.BBb;
import X.BFM;
import X.BOf;
import X.BRg;
import X.BS0;
import X.C00x;
import X.C07C;
import X.C1062ATq;
import X.C10G;
import X.C11U;
import X.C1515AkP;
import X.C1822Arm;
import X.C1D8;
import X.C1SA;
import X.C3U4;
import X.C3cG;
import X.C3cH;
import X.C7384Etj;
import X.C78N;
import X.C90l;
import X.C90m;
import X.F60;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC1380AiA;
import X.InterfaceC1516AkQ;
import com.facebook.aura.R;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.ui.HatchSectionKt;
import com.facebook.aura.vds.compose.base.AuraDimensKt;
import com.facebook.aura.vds.compose.base.ComponentsKt;
import com.facebook.aura.vds.compose.text.AuraTextKt;
import com.facebook.aura.vds.compose.theme.AuraTheme;
import com.facebook.common.dextricks.RuntimeInternals;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public abstract class CheckoutPayWithLinkSheetKt {
    public static final long FALLBACK_CARD_EXPIRY_MS = 43200000;
    public static final long MS_PER_HOUR = 3600000;
    public static final long MS_PER_MINUTE = 60000;

    /* renamed from: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt$CheckoutPayWithLinkSheet$3, reason: invalid class name */
    public final class AnonymousClass3 extends AbstractC7559F3s implements G0W<C07C, BFM, Integer, Unit> {
        public final /* synthetic */ PayWithLinkDetails $details;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(PayWithLinkDetails payWithLinkDetails) {
            super(3);
            this.$details = payWithLinkDetails;
        }

        public final void invoke(C07C c07c, BFM bfm, int i) {
            if (!AnonymousClass001.A1b(AnonymousClass002.A1P(i & 17, 16), bfm, i)) {
                bfm.Afo();
            } else {
                PayWithLinkDetails payWithLinkDetails = this.$details;
                CheckoutPayWithLinkSheetKt.PayWithLinkBody(payWithLinkDetails, CheckoutPayWithLinkSheetKt.cardExpiry(payWithLinkDetails.cardExpiresInMs), true, true, null, bfm, 3456, 16);
            }
        }

        @Override // X.G0W
        public /* bridge */ /* synthetic */ Unit invoke(C07C c07c, BFM bfm, Integer num) {
            invoke(c07c, bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt$CheckoutPayWithLinkSheet$4, reason: invalid class name */
    public final class AnonymousClass4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ String $approvalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(String str, int i) {
            super(2);
            this.$approvalId = str;
            this.$$changed = i;
        }

        public final void invoke(BFM bfm, int i) {
            CheckoutPayWithLinkSheetKt.CheckoutPayWithLinkSheet(this.$approvalId, bfm, AnonymousClass011.A00(this.$$changed));
        }

        @Override // X.G0V
        public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
            invoke(bfm, AnonymousClass001.A0F(num));
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt$PayWithLinkBody$2, reason: invalid class name */
    public final class AnonymousClass2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ PayWithLinkDetails $details;
        public final /* synthetic */ CardExpiry $expiry;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ boolean $showDescription;
        public final /* synthetic */ boolean $showHeader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(PayWithLinkDetails payWithLinkDetails, CardExpiry cardExpiry, boolean z, boolean z2, BRg bRg, int i, int i2) {
            super(2);
            this.$details = payWithLinkDetails;
            this.$expiry = cardExpiry;
            this.$showHeader = z;
            this.$showDescription = z2;
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
            CheckoutPayWithLinkSheetKt.PayWithLinkBody(this.$details, this.$expiry, this.$showHeader, this.$showDescription, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* renamed from: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt$PayWithLinkHeader$2, reason: invalid class name and case insensitive filesystem */
    public final class C108072 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ BRg $modifier;
        public final /* synthetic */ String $paymentMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C108072(String str, BRg bRg, int i, int i2) {
            super(2);
            this.$paymentMethod = str;
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
            CheckoutPayWithLinkSheetKt.PayWithLinkHeader(this.$paymentMethod, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void CheckoutPayWithLinkSheet(java.lang.String r21, X.BFM r22, int r23) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt.CheckoutPayWithLinkSheet(java.lang.String, X.BFM, int):void");
    }

    public static final PayWithLinkDetails toPayWithLinkDetails(HatchAgentPermissionsRepository.BrowserCheckoutApproval browserCheckoutApproval) {
        C7384Etj.A0Y(browserCheckoutApproval, 0);
        String str = browserCheckoutApproval.amount;
        String str2 = browserCheckoutApproval.currency;
        String str3 = browserCheckoutApproval.paymentMethodLabel;
        String str4 = browserCheckoutApproval.cardBrand;
        String str5 = browserCheckoutApproval.cardLast4;
        Long l = browserCheckoutApproval.cardExpiresInMs;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = browserCheckoutApproval.getPaymentSelection();
        return new PayWithLinkDetails(str, str2, str3, str4, str5, l, paymentSelection != null ? paymentSelection.paymentMethod : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0108  */
    /* renamed from: InfoRow-88mDfTA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m187InfoRow88mDfTA(X.C07C r39, java.lang.Integer r40, X.G0V<? super X.BFM, ? super java.lang.Integer, kotlin.Unit> r41, java.lang.String r42, java.lang.String r43, X.BRg r44, int r45, long r46, X.BFM r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt.m187InfoRow88mDfTA(X.07C, java.lang.Integer, X.G0V, java.lang.String, java.lang.String, X.BRg, int, long, X.BFM, int, int):void");
    }

    public static final void PayWithLinkBody(PayWithLinkDetails payWithLinkDetails, CardExpiry cardExpiry, boolean z, boolean z2, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        boolean zA1a = AnonymousClass002.A1a(payWithLinkDetails, cardExpiry);
        bfm.AgG(1323368377);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, payWithLinkDetails) | i : i;
        if ((i & 48) == 0) {
            iA0d |= AnonymousClass004.A0e(bfm, cardExpiry);
        }
        if ((i & 384) == 0) {
            iA0d |= AnonymousClass004.A0p(bfm, z);
        }
        if ((i & 3072) == 0) {
            iA0d |= AnonymousClass004.A0q(bfm, z2);
        }
        int i3 = i2 & 16;
        if (i3 != 0) {
            iA0d |= RuntimeInternals.IOPRIO_BACKGROUND;
        } else if ((i & RuntimeInternals.IOPRIO_BACKGROUND) == 0) {
            iA0d |= AnonymousClass004.A0h(bfm, bRg2);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1N(iA0d), bfm, iA0d)) {
            if (i3 != 0) {
                bRg2 = BRg.A00;
            }
            boolean zIsShopPayPaymentMethod = CheckoutApprovalSharedKt.isShopPayPaymentMethod(payWithLinkDetails.paymentMethod);
            C1062ATq c1062ATq = C10G.A02;
            BRg bRgThen = bRg2.then(c1062ATq);
            float f = AuraDimensKt.SpacingLarge;
            BRg bRgA07 = C3U4.A07(bRgThen, f);
            InterfaceC1380AiA interfaceC1380AiAA0U = AnonymousClass002.A0U(bfm);
            BBI bbi = (BBI) bfm;
            int iA02 = C3cG.A02(bbi.A06);
            AKQ akqA04 = BBI.A04(bbi);
            BRg bRgA01 = AxM.A01(bfm, bRgA07);
            Function0<InterfaceC1516AkQ> function0 = C1515AkP.A00;
            if (bbi.A0V == null) {
                C00x.A00();
                throw F60.createAndThrow();
            }
            AnonymousClass005.A0n(bfm, bbi, function0);
            AnonymousClass005.A0p(bfm, interfaceC1380AiAA0U, akqA04, bRgA01, iA02);
            C90l c90l = C90l.A00;
            if (z) {
                bfm.AgE(-440012583);
                PayWithLinkHeader(payWithLinkDetails.paymentMethod, null, bfm, 0, 2);
            } else {
                bfm.AgE(-439945313);
            }
            BBI.A0R(bbi, false);
            if (z2) {
                bfm.AgE(-439902440);
                if (z) {
                    bfm.AgE(-439894132);
                    ComponentsKt.m2403AuraVerticalSpacer8Feqmps(AuraDimensKt.SpacingMedium, bfm, 0);
                } else {
                    bfm.AgE(-439845121);
                }
                BBI.A0R(bbi, false);
                int i4 = R.string._name_removed__res_0x7f12008b;
                if (zIsShopPayPaymentMethod) {
                    i4 = R.string._name_removed__res_0x7f12009a;
                }
                String strA01 = AbstractC2271BQs.A01(bfm, i4);
                AuraTheme auraTheme = AuraTheme.INSTANCE;
                AuraTextKt.m2639AuraTextUY9GdpU(strA01, c1062ATq, C3cH.A07(bfm, auraTheme), C3cH.A0E(bfm, auraTheme), null, null, null, false, 0, 0, 0, null, null, null, bfm, 48, 0, 16368);
            } else {
                bfm.AgE(-439372929);
            }
            BBI.A0R(bbi, false);
            if (z || z2) {
                bfm.AgE(-439331823);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
            } else {
                bfm.AgE(-439287617);
            }
            BBI.A0R(bbi, false);
            if (zIsShopPayPaymentMethod) {
                bfm.AgE(-438408705);
            } else {
                bfm.AgE(-439239970);
                G0V<BFM, Integer, Unit> g0v = ComposableSingletons$CheckoutPayWithLinkSheetKt.lambda$2069905148;
                boolean zA1F = AnonymousClass004.A1F(iA0d) | AnonymousClass003.A1C(iA0d);
                Object objAaT = bfm.AaT();
                if (zA1F || objAaT == C78N.A00) {
                    objAaT = new CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$1$1(cardExpiry, payWithLinkDetails);
                    bfm.Ai0(objAaT);
                }
                HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, g0v, 0L, (G0U) objAaT, bfm, 390, 5);
                ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
            }
            BBI.A0R(bbi, false);
            G0V<BFM, Integer, Unit> g0v2 = ComposableSingletons$CheckoutPayWithLinkSheetKt.lambda$156165712;
            boolean zA1F2 = AnonymousClass004.A1F(iA0d);
            Object objAaT2 = bfm.AaT();
            if (zA1F2 || objAaT2 == C78N.A00) {
                objAaT2 = new CheckoutPayWithLinkSheetKt$PayWithLinkBody$1$2$1(payWithLinkDetails);
                bfm.Ai0(objAaT2);
            }
            HatchSectionKt.m2326HatchSectionuDo3WH8(c90l, false, g0v2, 0L, (G0U) objAaT2, bfm, 390, 5);
            ComponentsKt.m2403AuraVerticalSpacer8Feqmps(f, bfm, 0);
            BBI.A0R(bbi, zA1a);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new AnonymousClass2(payWithLinkDetails, cardExpiry, z, z2, bRg2, i, i2);
        }
    }

    public static final void PayWithLinkHeader(String str, BRg bRg, BFM bfm, int i, int i2) {
        BRg bRg2 = bRg;
        bfm.AgG(1747829672);
        int iA0d = (i & 6) == 0 ? AnonymousClass004.A0d(bfm, str) | i : i;
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
            String strCheckoutPaymentProviderLabel = CheckoutApprovalSharedKt.checkoutPaymentProviderLabel(str, bfm, iA0d & 14);
            AuraTheme auraTheme = AuraTheme.INSTANCE;
            C1822Arm c1822Arm = auraTheme.getTypography(bfm, 6).title3Medium;
            long jA06 = C3cH.A06(bfm, auraTheme);
            BS0 bs0 = BRg.A00;
            AuraTextKt.m2639AuraTextUY9GdpU(strCheckoutPaymentProviderLabel, c90m.AiP(bs0, 1.0f, true), jA06, c1822Arm, null, null, null, false, 0, 0, 0, null, null, null, bfm, 0, 0, 16368);
            C1SA.A00(bfm, null, C11U.A03(C10G.A07(bs0, 40.0f), C1D8.A02(33)), null, BOf.A00(bfm, CheckoutApprovalSharedKt.checkoutPaymentProviderIconRes(str), 0), B18.A01, null, 0.0f, AVy.$stable | 24624, 104);
            BBI.A0R(bbi, true);
        } else {
            bfm.Afo();
        }
        BBb bBbAAc = bfm.AAc();
        if (bBbAAc != null) {
            bBbAAc.A06 = new C108072(str, bRg2, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.agentpermission.CardExpiry cardExpiry(java.lang.Long r6) {
        /*
            if (r6 == 0) goto L30
            long r3 = r6.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L30
        Lc:
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 < 0) goto L25
            r2 = 2131755008(0x7f100000, float:1.9140883E38)
            r0 = 1800000(0x1b7740, double:8.89318E-318)
            long r3 = r3 + r0
            long r3 = r3 / r5
        L1a:
            int r1 = (int) r3
            r0 = 1
            if (r1 >= r0) goto L1f
            r1 = 1
        L1f:
            com.facebook.aura.agentpermission.CardExpiry r0 = new com.facebook.aura.agentpermission.CardExpiry
            r0.<init>(r2, r1)
            return r0
        L25:
            r2 = 2131755009(0x7f100001, float:1.9140885E38)
            r0 = 30000(0x7530, double:1.4822E-319)
            long r3 = r3 + r0
            r0 = 60000(0xea60, double:2.9644E-319)
            long r3 = r3 / r0
            goto L1a
        L30:
            r3 = 43200000(0x2932e00, double:2.1343636E-316)
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.CheckoutPayWithLinkSheetKt.cardExpiry(java.lang.Long):com.facebook.aura.agentpermission.CardExpiry");
    }

    public static final PayWithLinkDetails toPayWithLinkDetails(HatchAgentPermissionsRepository.ReservationCheckoutApproval reservationCheckoutApproval, String str) {
        String str2;
        AnonymousClass003.A0u(reservationCheckoutApproval, str);
        String currencyCode = reservationCheckoutApproval.currency.getCurrencyCode();
        String str3 = reservationCheckoutApproval.paymentMethodLabel;
        String str4 = reservationCheckoutApproval.cardBrand;
        String str5 = reservationCheckoutApproval.cardLast4;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = reservationCheckoutApproval.getPaymentSelection();
        if (paymentSelection != null) {
            str2 = paymentSelection.paymentMethod;
        } else {
            str2 = null;
        }
        return new PayWithLinkDetails(str, currencyCode, str3, str4, str5, null, str2);
    }

    public static final PayWithLinkDetails toPayWithLinkDetails(HatchAgentPermissionsRepository.ShopifyCheckoutApproval shopifyCheckoutApproval) {
        String str;
        C7384Etj.A0Y(shopifyCheckoutApproval, 0);
        String str2 = shopifyCheckoutApproval.amount;
        String str3 = shopifyCheckoutApproval.currency;
        String str4 = shopifyCheckoutApproval.paymentMethodLabel;
        String str5 = shopifyCheckoutApproval.cardBrand;
        String str6 = shopifyCheckoutApproval.cardLast4;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = shopifyCheckoutApproval.getPaymentSelection();
        if (paymentSelection != null) {
            str = paymentSelection.paymentMethod;
        } else {
            str = null;
        }
        return new PayWithLinkDetails(str2, str3, str4, str5, str6, null, str);
    }

    public static final PayWithLinkDetails toPayWithLinkDetails(HatchAgentPermissionsRepository.StripeLinkCheckoutApproval stripeLinkCheckoutApproval) {
        String str;
        C7384Etj.A0Y(stripeLinkCheckoutApproval, 0);
        String str2 = stripeLinkCheckoutApproval.amount;
        String str3 = stripeLinkCheckoutApproval.currency;
        String str4 = stripeLinkCheckoutApproval.paymentMethodLabel;
        String str5 = stripeLinkCheckoutApproval.cardBrand;
        String str6 = stripeLinkCheckoutApproval.cardLast4;
        Long l = stripeLinkCheckoutApproval.cardExpiresInMs;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = stripeLinkCheckoutApproval.getPaymentSelection();
        if (paymentSelection != null) {
            str = paymentSelection.paymentMethod;
        } else {
            str = null;
        }
        return new PayWithLinkDetails(str2, str3, str4, str5, str6, l, str);
    }

    public static final PayWithLinkDetails toPayWithLinkDetails(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval) {
        String str;
        C7384Etj.A0Y(flightCheckoutApproval, 0);
        String str2 = flightCheckoutApproval.amount;
        String str3 = flightCheckoutApproval.currency;
        String str4 = flightCheckoutApproval.paymentMethodLabel;
        String str5 = flightCheckoutApproval.cardBrand;
        String str6 = flightCheckoutApproval.cardLast4;
        HatchAgentPermissionsRepository.CheckoutPaymentSelection paymentSelection = flightCheckoutApproval.getPaymentSelection();
        if (paymentSelection != null) {
            str = paymentSelection.paymentMethod;
        } else {
            str = null;
        }
        return new PayWithLinkDetails(str2, str3, str4, str5, str6, null, str);
    }
}
