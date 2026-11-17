package com.facebook.aura.devices.link.ordering;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass002;
import X.BFI;
import X.BQG;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.C7BY;
import X.Ey9;
import X.HsJ;
import X.HtJ;
import X.HzP;
import com.facebook.aura.checkout.ui.HatchAddressSuggestion;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderEligibility;
import com.facebook.aura.devices.link.ordering.HatchLinkOrderResult;
import com.facebook.aura.json.HatchProblemJson;
import com.facebook.aura.json.HatchProblemJsonKt;
import com.facebook.aura.json.NetworkException;
import com.facebook.aura.network.stefi.AuraStefiClient;
import com.facebook.aura.partners.voice.viewmodel.VoiceSelectionRepositoryJsonKt;
import com.facebook.aura.subscription.model.AuraSubscriptionActionsKt;
import com.facebook.aura.subscription.repo.AuraSubscriptionRepository;
import com.facebook.aura.subscription.repo.HatchSubscriptionStatus;
import com.facebook.aura.subscription.repo.SubscriptionDetails;
import com.facebook.aura.subscription.repo.SubscriptionDetailsState;
import com.facebook.aura.subscription.repo.SubscriptionManagementAction;
import com.facebook.aura.subscription.repo.SubscriptionManagementActions;
import com.facebook.aura.subscription.repo.SubscriptionManagementCta;
import com.facebook.aura.utils.HatchUtil;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes4.dex */
public final class HatchLinkOrderRepository {
    public static final int $stable = 0;
    public static final int ADDRESS_FETCH_LIMIT = 10;
    public static final int ADDRESS_SUGGESTION_LIMIT = 3;
    public static final int HTTP_BAD_REQUEST = 400;
    public static final HatchLinkOrderRepository INSTANCE = new HatchLinkOrderRepository();
    public static final Set<HatchSubscriptionStatus> ORDERABLE_STATUSES = BFI.A0H(new HatchSubscriptionStatus[]{HatchSubscriptionStatus.ACTIVE, HatchSubscriptionStatus.CANCELED});
    public static final String PROBLEM_ADDRESS_VALIDATION_UNAVAILABLE = "addressValidationUnavailable";
    public static final String PROBLEM_INVALID_SHIPPING_ADDRESS = "invalidShippingAddress";
    public static final String SANDBOX_PURCHASE_PLATFORM = "META_SANDBOX";
    public static final int US_ZIP_LENGTH = 5;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class OrderEnvironment {
        public static final /* synthetic */ Ey9 $ENTRIES;
        public static final /* synthetic */ OrderEnvironment[] $VALUES;
        public static final OrderEnvironment PROD;
        public static final OrderEnvironment TEST;
        public final String sku;
        public final String wireValue;

        static {
            OrderEnvironment orderEnvironment = new OrderEnvironment("TEST", 0, "TEST", "SK-1002755-99");
            TEST = orderEnvironment;
            OrderEnvironment orderEnvironment2 = new OrderEnvironment("PROD", 1, "PROD", "SK-1002755-01");
            PROD = orderEnvironment2;
            OrderEnvironment[] orderEnvironmentArr = {orderEnvironment, orderEnvironment2};
            $VALUES = orderEnvironmentArr;
            $ENTRIES = C3cG.A0w(orderEnvironmentArr);
        }

        public static Ey9<OrderEnvironment> getEntries() {
            return $ENTRIES;
        }

        public static OrderEnvironment valueOf(String str) {
            return (OrderEnvironment) Enum.valueOf(OrderEnvironment.class, str);
        }

        public static OrderEnvironment[] values() {
            return (OrderEnvironment[]) $VALUES.clone();
        }

        public final String getSku() {
            return this.sku;
        }

        public final String getWireValue() {
            return this.wireValue;
        }

        public OrderEnvironment(String str, int i, String str2, String str3) {
            this.wireValue = str2;
            this.sku = str3;
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository", f = "HatchLinkOrderRepository.kt", l = {VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH}, m = "addressSuggestions", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$addressSuggestions$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLinkOrderRepository.this.addressSuggestions(null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository", f = "HatchLinkOrderRepository.kt", l = {270}, m = "createOrder", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$createOrder$1, reason: invalid class name and case insensitive filesystem */
    public final class C115801 extends HzP {
        public int I$0;
        public int I$1;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public Object L$8;
        public int label;
        public /* synthetic */ Object result;

        public C115801(HtJ<? super C115801> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLinkOrderRepository.this.createOrder(null, null, this);
        }
    }

    @DebugMetadata(c = "com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository", f = "HatchLinkOrderRepository.kt", l = {VoiceSelectionRepositoryJsonKt.MAX_VOICE_ID_LENGTH}, m = "fetchStatus", v = 2)
    /* renamed from: com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$fetchStatus$1, reason: invalid class name and case insensitive filesystem */
    public final class C115811 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public int label;
        public /* synthetic */ Object result;

        public C115811(HtJ<? super C115811> htJ) {
            super(htJ);
        }

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HatchLinkOrderRepository.this.fetchStatus(null, this);
        }
    }

    public final HatchLinkOrderBlockReason blockReason(AbstractC3358CGz abstractC3358CGz) {
        HatchLinkOrderEligibility.Blocked blocked;
        C7384Etj.A0Y(abstractC3358CGz, 0);
        HatchLinkOrderEligibility hatchLinkOrderEligibilityResolveEligibility = resolveEligibility(AuraSubscriptionRepository.Companion.getInstance(abstractC3358CGz).subscriptionDetailsState.getValue(), AuraStefiClient.INSTANCE.hasAuth());
        if (!(hatchLinkOrderEligibilityResolveEligibility instanceof HatchLinkOrderEligibility.Blocked) || (blocked = (HatchLinkOrderEligibility.Blocked) hatchLinkOrderEligibilityResolveEligibility) == null) {
            return null;
        }
        return blocked.reason;
    }

    public final boolean canSubscribe(SubscriptionDetailsState subscriptionDetailsState) {
        SubscriptionDetailsState.Success success;
        SubscriptionDetails subscriptionDetails;
        C7384Etj.A0Y(subscriptionDetailsState, 0);
        if ((subscriptionDetailsState instanceof SubscriptionDetailsState.Success) && (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) != null && (subscriptionDetails = success.details) != null && AuraSubscriptionActionsKt.purchaseBlock(subscriptionDetails, true) == null) {
            HatchUtil hatchUtil = HatchUtil.INSTANCE;
            if (hatchUtil.isLinkDeviceOrderingEnabled() && hatchUtil.isSubscriptionEnabled()) {
                return true;
            }
        }
        return false;
    }

    public final HatchLinkOrderBlockReason entryBlockReason(SubscriptionDetailsState subscriptionDetailsState) {
        SubscriptionDetailsState.Success success;
        SubscriptionDetails subscriptionDetails;
        C7384Etj.A0Y(subscriptionDetailsState, 0);
        HatchLinkOrderEligibility hatchLinkOrderEligibilityResolveEligibility = resolveEligibility(subscriptionDetailsState, AuraStefiClient.INSTANCE.hasAuth());
        if (hatchLinkOrderEligibilityResolveEligibility instanceof HatchLinkOrderEligibility.Blocked) {
            return ((HatchLinkOrderEligibility.Blocked) hatchLinkOrderEligibilityResolveEligibility).reason;
        }
        if (!(hatchLinkOrderEligibilityResolveEligibility instanceof HatchLinkOrderEligibility.Eligible)) {
            throw C3cG.A0q();
        }
        HatchLinkOrderBlockReason hatchLinkOrderBlockReason = HatchLinkOrderBlockReason.CLAIM_UNAVAILABLE;
        if (!(subscriptionDetailsState instanceof SubscriptionDetailsState.Success) || (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) == null || (subscriptionDetails = success.details) == null || !INSTANCE.canClaimHomeLink(subscriptionDetails)) {
            return hatchLinkOrderBlockReason;
        }
        return null;
    }

    public final boolean hasActivePaidSubscription(SubscriptionDetailsState subscriptionDetailsState) {
        C7384Etj.A0Y(subscriptionDetailsState, 0);
        return subscriptionBlockReason(subscriptionDetailsState) == null;
    }

    public final boolean isTestEnvironment(SubscriptionDetailsState subscriptionDetailsState) {
        C7384Etj.A0Y(subscriptionDetailsState, 0);
        return environment(subscriptionDetailsState) == OrderEnvironment.TEST;
    }

    private final DeviceOrderCreateRequestJson buildRequest(String str, OrderEnvironment orderEnvironment, HatchLinkOrderInput hatchLinkOrderInput) {
        DeviceOrderRecipientJson deviceOrderRecipientJson = new DeviceOrderRecipientJson(AnonymousClass002.A0l(hatchLinkOrderInput.firstName), AnonymousClass002.A0l(hatchLinkOrderInput.lastName));
        DeviceOrderContactJson deviceOrderContactJson = new DeviceOrderContactJson(AnonymousClass002.A0l(hatchLinkOrderInput.email), AnonymousClass002.A0l(hatchLinkOrderInput.phone));
        String strA0l = AnonymousClass002.A0l(hatchLinkOrderInput.street1);
        String strA0l2 = AnonymousClass002.A0l(hatchLinkOrderInput.city);
        String strA0l3 = AnonymousClass002.A0l(hatchLinkOrderInput.state);
        String strA0l4 = AnonymousClass002.A0l(hatchLinkOrderInput.postalCode);
        String strA0l5 = AnonymousClass002.A0l(hatchLinkOrderInput.street2);
        if (C7BY.A0j(strA0l5)) {
            strA0l5 = null;
        }
        return new DeviceOrderCreateRequestJson(str, deviceOrderRecipientJson, deviceOrderContactJson, new DeviceOrderAddressJson(strA0l, strA0l2, strA0l3, strA0l4, "US", strA0l5), Collections.singletonList(new DeviceOrderItemJson(orderEnvironment.getSku(), 1)), orderEnvironment.getWireValue());
    }

    private final boolean canClaimHomeLink(SubscriptionDetails subscriptionDetails) {
        SubscriptionManagementActions subscriptionManagementActions = subscriptionDetails.managementActions;
        if (subscriptionManagementActions != null) {
            ArrayList arrayListA0P = AbstractC0878AGe.A0P(subscriptionManagementActions.rows, AbstractC0885AGm.A0z(subscriptionManagementActions.primaryCta));
            if (!(arrayListA0P instanceof Collection) || !arrayListA0P.isEmpty()) {
                Iterator it = arrayListA0P.iterator();
                while (it.hasNext()) {
                    if (((SubscriptionManagementCta) it.next()).action == SubscriptionManagementAction.CLAIM_META_HOME_LINK) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private final OrderEnvironment environment(SubscriptionDetailsState subscriptionDetailsState) {
        SubscriptionDetailsState.Success success;
        SubscriptionDetails subscriptionDetails;
        String str = null;
        if ((subscriptionDetailsState instanceof SubscriptionDetailsState.Success) && (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) != null && (subscriptionDetails = success.details) != null) {
            str = subscriptionDetails.purchasePlatform;
        }
        return (str == null || !str.equalsIgnoreCase(SANDBOX_PURCHASE_PLATFORM)) ? OrderEnvironment.PROD : OrderEnvironment.TEST;
    }

    private final HatchLinkOrderEligibility resolveEligibility(SubscriptionDetailsState subscriptionDetailsState, boolean z) {
        HatchLinkOrderBlockReason hatchLinkOrderBlockReasonSubscriptionBlockReason;
        if (z) {
            hatchLinkOrderBlockReasonSubscriptionBlockReason = subscriptionBlockReason(subscriptionDetailsState);
            if (hatchLinkOrderBlockReasonSubscriptionBlockReason == null) {
                if (HatchUtil.INSTANCE.isLinkDeviceOrderingEnabled()) {
                    C7384Etj.A0Z(subscriptionDetailsState, "null cannot be cast to non-null type com.facebook.aura.subscription.repo.SubscriptionDetailsState.Success");
                    return new HatchLinkOrderEligibility.Eligible(((SubscriptionDetailsState.Success) subscriptionDetailsState).details.id);
                }
                hatchLinkOrderBlockReasonSubscriptionBlockReason = HatchLinkOrderBlockReason.ORDERING_DISABLED;
            }
        } else {
            hatchLinkOrderBlockReasonSubscriptionBlockReason = HatchLinkOrderBlockReason.NOT_AUTHENTICATED;
        }
        return new HatchLinkOrderEligibility.Blocked(hatchLinkOrderBlockReasonSubscriptionBlockReason);
    }

    private final HatchLinkOrderSubmitError submitErrorFor(String str) {
        return PROBLEM_INVALID_SHIPPING_ADDRESS.equals(str) ? HatchLinkOrderSubmitError.INVALID_SHIPPING_ADDRESS : PROBLEM_ADDRESS_VALIDATION_UNAVAILABLE.equals(str) ? HatchLinkOrderSubmitError.ADDRESS_CHECK_UNAVAILABLE : HatchLinkOrderSubmitError.GENERIC;
    }

    private final HatchLinkOrderBlockReason subscriptionBlockReason(SubscriptionDetailsState subscriptionDetailsState) {
        SubscriptionDetailsState.Success success;
        SubscriptionDetails subscriptionDetails;
        if ((subscriptionDetailsState instanceof SubscriptionDetailsState.Success) && (success = (SubscriptionDetailsState.Success) subscriptionDetailsState) != null && (subscriptionDetails = success.details) != null) {
            if (!subscriptionDetails.isPaidTier) {
                return HatchLinkOrderBlockReason.NO_SUBSCRIPTION;
            }
            if (!C7BY.A0j(subscriptionDetails.id)) {
                if (AbstractC0878AGe.A0k(ORDERABLE_STATUSES, subscriptionDetails.subscriptionStatus)) {
                    return null;
                }
                return HatchLinkOrderBlockReason.SUBSCRIPTION_NOT_ENTITLED;
            }
        }
        return HatchLinkOrderBlockReason.SUBSCRIPTION_NOT_READY;
    }

    private final HatchAddressSuggestion toAddressSuggestion(PlacesTypeaheadItemJson placesTypeaheadItemJson) {
        String str;
        String str2;
        String str3;
        String strNormalizedUsStateCode;
        PlacesTypeaheadAddressJson placesTypeaheadAddressJson = placesTypeaheadItemJson.address;
        if (placesTypeaheadAddressJson == null || (str = placesTypeaheadAddressJson.country) == null || !str.equalsIgnoreCase("US") || (str2 = placesTypeaheadAddressJson.streetaddress) == null || C7BY.A0j(str2) || (str3 = placesTypeaheadAddressJson.stateprovince) == null || (strNormalizedUsStateCode = HatchLinkOrderStateMachineKt.normalizedUsStateCode(str3)) == null) {
            return null;
        }
        String str4 = placesTypeaheadItemJson.title;
        String str5 = placesTypeaheadItemJson.subtitle;
        String str6 = placesTypeaheadAddressJson.city;
        if (str6 == null) {
            str6 = "";
        }
        String str7 = placesTypeaheadAddressJson.postalcode;
        String str8 = str7 != null ? str7 : "";
        StringBuilder sbA0w = C60O.A0w();
        int length = str8.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str8.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sbA0w.append(cCharAt);
            }
        }
        return new HatchAddressSuggestion(str4, str5, str2, str6, strNormalizedUsStateCode, BQG.A17(sbA0w.toString(), 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object addressSuggestions(java.lang.String r16, X.HtJ<? super X.AHD<com.facebook.aura.checkout.ui.HatchAddressSuggestion>> r17) {
        /*
            r15 = this;
            r3 = r17
            boolean r0 = r3 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.AnonymousClass1
            if (r0 == 0) goto L92
            r5 = r3
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$addressSuggestions$1 r5 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L92
            int r2 = r2 - r1
            r5.label = r2
        L14:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 3
            r3 = 1
            if (r0 == 0) goto L54
            if (r0 != r3) goto La2
            java.lang.Object r2 = X.AnonymousClass001.A0q(r1)
        L24:
            boolean r1 = r2 instanceof X.C10571Hud
            r0 = 0
            if (r1 == 0) goto L2a
            r2 = r0
        L2a:
            com.facebook.aura.devices.link.ordering.PlacesTypeaheadResponseJson r2 = (com.facebook.aura.devices.link.ordering.PlacesTypeaheadResponseJson) r2
            if (r2 == 0) goto L32
            java.util.List<com.facebook.aura.devices.link.ordering.PlacesTypeaheadItemJson> r0 = r2.items
            if (r0 != 0) goto L34
        L32:
            X.AGi r0 = X.C0881AGi.A00
        L34:
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L99
            java.lang.Object r1 = r2.next()
            com.facebook.aura.devices.link.ordering.PlacesTypeaheadItemJson r1 = (com.facebook.aura.devices.link.ordering.PlacesTypeaheadItemJson) r1
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository r0 = com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.INSTANCE
            com.facebook.aura.checkout.ui.HatchAddressSuggestion r0 = r0.toAddressSuggestion(r1)
            if (r0 == 0) goto L3c
            r3.add(r0)
            goto L3c
        L54:
            com.facebook.aura.network.http.HatchHttpApi r8 = X.C60O.A06(r1)
            com.facebook.aura.devices.link.ordering.DeviceOrderStefiPath$PlacesTypeahead r11 = com.facebook.aura.devices.link.ordering.DeviceOrderStefiPath.PlacesTypeahead.INSTANCE
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.GET
            java.lang.String r0 = "query"
            r1 = r16
            X.HxE r7 = X.C3cG.A0r(r0, r1)
            java.lang.String r1 = "types"
            java.lang.String r0 = "address"
            X.HxE r2 = X.C3cG.A0r(r1, r0)
            java.lang.String r1 = "num_results"
            java.lang.String r0 = "10"
            java.util.Map r16 = X.C3cH.A0m(r1, r0, r7, r2)
            X.9jH r15 = X.C9jH.A00
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$addressSuggestions$$inlined$executeStefiRequest-bMdYcbs$default$1 r9 = com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$addressSuggestions$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r10 = 0
            r13 = 0
            r5.L$0 = r13
            r5.L$1 = r13
            r5.L$2 = r13
            r5.L$3 = r13
            r5.L$4 = r13
            r5.L$5 = r13
            r5.label = r3
            r14 = r13
            r17 = r5
            java.lang.Object r2 = r8.m1596executeBodylessStefiRequestWithtZkwj4A(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r2 != r6) goto L24
            return r6
        L92:
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$addressSuggestions$1 r5 = new com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$addressSuggestions$1
            r5.<init>(r3)
            goto L14
        L99:
            java.util.List r0 = X.AbstractC0878AGe.A0a(r3, r4)
            X.AHD r6 = X.AGI.A07(r0)
            return r6
        La2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.addressSuggestions(java.lang.String, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object createOrder(com.facebook.aura.subscription.repo.SubscriptionDetailsState r16, com.facebook.aura.devices.link.ordering.HatchLinkOrderInput r17, X.HtJ<? super com.facebook.aura.devices.link.ordering.HatchLinkOrderResult> r18) {
        /*
            r15 = this;
            r5 = r18
            boolean r0 = r5 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.C115801
            r4 = r15
            if (r0 == 0) goto L7d
            r3 = r5
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$createOrder$1 r3 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.C115801) r3
            int r2 = r3.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7d
            int r2 = r2 - r1
            r3.label = r2
        L15:
            java.lang.Object r1 = r3.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r3.label
            r14 = 1
            if (r0 == 0) goto L29
            if (r0 != r14) goto L83
            java.lang.Object r0 = X.AnonymousClass001.A0q(r1)
        L24:
            com.facebook.aura.devices.link.ordering.HatchLinkOrderResult r0 = r4.toOrderResult(r0)
            return r0
        L29:
            X.Hwg.A00(r1)
            com.facebook.aura.network.stefi.AuraStefiClient r0 = com.facebook.aura.network.stefi.AuraStefiClient.INSTANCE
            boolean r0 = r0.hasAuth()
            r5 = r16
            com.facebook.aura.devices.link.ordering.HatchLinkOrderEligibility r1 = r15.resolveEligibility(r5, r0)
            boolean r0 = r1 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderEligibility.Eligible
            if (r0 == 0) goto L88
            com.facebook.aura.devices.link.ordering.HatchLinkOrderEligibility$Eligible r1 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderEligibility.Eligible) r1
            java.lang.String r1 = r1.subscriptionId
            com.facebook.aura.network.http.HatchHttpApi r6 = com.facebook.aura.network.http.HatchHttpApi.INSTANCE
            com.facebook.aura.devices.link.ordering.DeviceOrderStefiPath$DeviceOrders r10 = com.facebook.aura.devices.link.ordering.DeviceOrderStefiPath.DeviceOrders.INSTANCE
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$OrderEnvironment r0 = r15.environment(r5)
            r5 = r17
            com.facebook.aura.devices.link.ordering.DeviceOrderCreateRequestJson r11 = r15.buildRequest(r1, r0, r5)
            com.facebook.aura.network.http.RequestType r12 = com.facebook.aura.network.http.RequestType.POST
            X.9jH r13 = X.C9jH.A00
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$createOrder$$inlined$executeStefiRequest-tZkwj4A$default$1 r7 = com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$createOrder$$inlined$executeStefiRequesttZkwj4A$default$1.INSTANCE
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$createOrder$$inlined$executeStefiRequest-tZkwj4A$default$2 r8 = com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$createOrder$$inlined$executeStefiRequesttZkwj4A$default$2.INSTANCE
            r9 = 0
            r15 = 0
            r3.L$0 = r15
            r3.L$1 = r15
            r3.L$2 = r15
            r3.L$3 = r15
            r3.L$4 = r15
            r3.L$5 = r15
            r3.L$6 = r15
            r3.L$7 = r15
            r3.L$8 = r15
            r3.I$0 = r14
            r3.I$1 = r9
            r3.label = r14
            r16 = r9
            r17 = r15
            r18 = r3
            java.lang.Object r0 = r6.m1604executeStefiRequestWithjLovISM(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r2) goto L24
            return r2
        L7d:
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$createOrder$1 r3 = new com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$createOrder$1
            r3.<init>(r5)
            goto L15
        L83:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L88:
            boolean r0 = r1 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderEligibility.Blocked
            if (r0 == 0) goto L96
            com.facebook.aura.devices.link.ordering.HatchLinkOrderEligibility$Blocked r1 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderEligibility.Blocked) r1
            com.facebook.aura.devices.link.ordering.HatchLinkOrderBlockReason r0 = r1.reason
            com.facebook.aura.devices.link.ordering.HatchLinkOrderResult$Blocked r2 = new com.facebook.aura.devices.link.ordering.HatchLinkOrderResult$Blocked
            r2.<init>(r0)
            return r2
        L96:
            kotlin.NoWhenBranchMatchedException r0 = X.C3cG.A0q()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.createOrder(com.facebook.aura.subscription.repo.SubscriptionDetailsState, com.facebook.aura.devices.link.ordering.HatchLinkOrderInput, X.HtJ):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchStatus(java.lang.String r14, X.HtJ<? super com.facebook.aura.devices.link.ordering.HatchLinkOrderResult> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.C115811
            if (r0 == 0) goto L4e
            r12 = r15
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$fetchStatus$1 r12 = (com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.C115811) r12
            int r2 = r12.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r12.label = r2
        L12:
            java.lang.Object r3 = r12.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r1 = r12.label
            r0 = 1
            if (r1 == 0) goto L26
            if (r1 != r0) goto L54
            java.lang.Object r0 = X.AnonymousClass001.A0q(r3)
        L21:
            com.facebook.aura.devices.link.ordering.HatchLinkOrderResult r0 = r13.toOrderResult(r0)
            return r0
        L26:
            com.facebook.aura.network.http.HatchHttpApi r3 = X.C60O.A06(r3)
            com.facebook.aura.devices.link.ordering.DeviceOrderStefiPath$DeviceOrderStatus r6 = new com.facebook.aura.devices.link.ordering.DeviceOrderStefiPath$DeviceOrderStatus
            r6.<init>(r14)
            com.facebook.aura.network.http.RequestType r7 = com.facebook.aura.network.http.RequestType.GET
            X.9jH r10 = X.C9jH.A00
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$fetchStatus$$inlined$executeStefiRequest-bMdYcbs$default$1 r4 = com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$fetchStatus$$inlined$executeStefiRequestbMdYcbs$default$1.INSTANCE
            r5 = 0
            r8 = 0
            r12.L$0 = r8
            r12.L$1 = r8
            r12.L$2 = r8
            r12.L$3 = r8
            r12.L$4 = r8
            r12.L$5 = r8
            r12.label = r0
            r9 = r8
            r11 = r10
            java.lang.Object r0 = r3.m1596executeBodylessStefiRequestWithtZkwj4A(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            if (r0 != r2) goto L21
            return r2
        L4e:
            com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$fetchStatus$1 r12 = new com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository$fetchStatus$1
            r12.<init>(r15)
            goto L12
        L54:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.devices.link.ordering.HatchLinkOrderRepository.fetchStatus(java.lang.String, X.HtJ):java.lang.Object");
    }

    public final boolean isOrderingEnabled() {
        return HatchUtil.INSTANCE.isLinkDeviceOrderingEnabled();
    }

    private final HatchLinkOrderResult toOrderResult(Object obj) {
        Throwable thA00 = HsJ.A00(obj);
        if (thA00 == null) {
            return new HatchLinkOrderResult.Success(((DeviceOrderResponseJson) obj).toDomain());
        }
        NetworkException networkException = thA00 instanceof NetworkException ? (NetworkException) thA00 : null;
        String message = thA00.getMessage();
        if (message == null) {
            message = HatchLinkOrderViewModelKt.ORDER_REQUEST_FAILED;
        }
        HatchLinkOrderRepository hatchLinkOrderRepository = INSTANCE;
        HatchProblemJson hatchProblemJsonHatchProblemOf = HatchProblemJsonKt.hatchProblemOf(networkException != null ? networkException.getMessage() : null);
        HatchLinkOrderSubmitError hatchLinkOrderSubmitErrorSubmitErrorFor = hatchLinkOrderRepository.submitErrorFor(hatchProblemJsonHatchProblemOf != null ? hatchProblemJsonHatchProblemOf.type : null);
        return (networkException == null || networkException.httpResponseCode != 400) ? new HatchLinkOrderResult.Failed(message, hatchLinkOrderSubmitErrorSubmitErrorFor) : new HatchLinkOrderResult.Rejected(message, hatchLinkOrderSubmitErrorSubmitErrorFor);
    }
}
