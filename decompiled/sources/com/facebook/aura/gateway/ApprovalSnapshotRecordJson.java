package com.facebook.aura.gateway;

import X.AbstractC5321DgF;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C06G;
import X.C06H;
import X.C07779iq;
import X.C0881AGi;
import X.C0KA;
import X.C2hx;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C79;
import X.C9hr;
import X.C9iI;
import X.C9iZ;
import X.C9j1;
import X.C9j5;
import X.CFK;
import X.F0C;
import X.F60;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.json.JsonElement;

@Serializable
/* loaded from: classes2.dex */
public final class ApprovalSnapshotRecordJson extends C06G {
    public static final int $stable = 8;
    public final String approval_id;
    public final String attention_mode;
    public final String checkout_provider;
    public final Long decided_at_ms;
    public final String decision;
    public final List<ApprovalDecisionOptionJson> decision_options;
    public final ApprovalSnapshotDisplayJson display;
    public final boolean editable_message_available;
    public final boolean is_exclusive;
    public final Long message_revision;
    public final ApprovalSnapshotPayloadJson payload;
    public final long requested_at_ms;
    public final ApprovalSnapshotScopeJson scope;
    public final String status;
    public static final Companion Companion = new Companion();
    public static final F0C<C9hr<Object>>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, AbstractC5321DgF.A02(C79.A01, ApprovalSnapshotRecordJson$Companion$$childSerializers$1.INSTANCE), null, null, null};

    public final class Companion {
        public final C9hr<ApprovalSnapshotRecordJson> serializer() {
            return ApprovalSnapshotRecordJson$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    public final ApprovalSnapshotRecordJson copy(String str, String str2, boolean z, String str3, long j, Long l, String str4, boolean z2, Long l2, String str5, List<ApprovalDecisionOptionJson> list, ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson, ApprovalSnapshotScopeJson approvalSnapshotScopeJson, ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson) {
        C7384Etj.A0Y(str2, 1);
        AnonymousClass002.A1G(list, 10, approvalSnapshotDisplayJson);
        AnonymousClass003.A11(approvalSnapshotScopeJson, approvalSnapshotPayloadJson);
        return new ApprovalSnapshotRecordJson(str, str2, z, str3, j, l, str4, z2, l2, str5, list, approvalSnapshotDisplayJson, approvalSnapshotScopeJson, approvalSnapshotPayloadJson);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ApprovalSnapshotRecordJson) {
                ApprovalSnapshotRecordJson approvalSnapshotRecordJson = (ApprovalSnapshotRecordJson) obj;
                if (!C7384Etj.areEqual(this.checkout_provider, approvalSnapshotRecordJson.checkout_provider) || !C7384Etj.areEqual(this.approval_id, approvalSnapshotRecordJson.approval_id) || this.is_exclusive != approvalSnapshotRecordJson.is_exclusive || !C7384Etj.areEqual(this.attention_mode, approvalSnapshotRecordJson.attention_mode) || this.requested_at_ms != approvalSnapshotRecordJson.requested_at_ms || !C7384Etj.areEqual(this.decided_at_ms, approvalSnapshotRecordJson.decided_at_ms) || !C7384Etj.areEqual(this.status, approvalSnapshotRecordJson.status) || this.editable_message_available != approvalSnapshotRecordJson.editable_message_available || !C7384Etj.areEqual(this.message_revision, approvalSnapshotRecordJson.message_revision) || !C7384Etj.areEqual(this.decision, approvalSnapshotRecordJson.decision) || !C7384Etj.areEqual(this.decision_options, approvalSnapshotRecordJson.decision_options) || !C7384Etj.areEqual(this.display, approvalSnapshotRecordJson.display) || !C7384Etj.areEqual(this.scope, approvalSnapshotRecordJson.scope) || !C7384Etj.areEqual(this.payload, approvalSnapshotRecordJson.payload)) {
                }
            }
            return false;
        }
        return true;
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AgentPermissionPayloadType.values().length];
            try {
                AnonymousClass002.A13(AgentPermissionPayloadType.PURCHASE_PREAPPROVAL, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(AgentPermissionPayloadType.BROWSER_TASK_CONFIRMATION, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(AgentPermissionPayloadType.BROWSER_CHECKOUT, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(AgentPermissionPayloadType.STRIPE_LINK_CHECKOUT, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AnonymousClass002.A17(AgentPermissionPayloadType.SHOPIFY_CHECKOUT, iArr);
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AnonymousClass002.A18(AgentPermissionPayloadType.FLIGHT_CHECKOUT, iArr);
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AnonymousClass006.A1G(AgentPermissionPayloadType.RESERVATION_CHECKOUT, iArr);
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AnonymousClass006.A1H(AgentPermissionPayloadType.CAR_RENTAL_RESERVATION, iArr);
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AnonymousClass006.A1I(AgentPermissionPayloadType.OUTGOING_MEDIA, iArr);
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AnonymousClass006.A1J(AgentPermissionPayloadType.DELIVERY_CHECKOUT, iArr);
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AnonymousClass006.A1K(AgentPermissionPayloadType.BROWSER_ACTION, iArr);
            } catch (NoSuchFieldError unused11) {
            }
            try {
                AnonymousClass006.A1L(AgentPermissionPayloadType.CONNECTOR, iArr);
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[AgentPermissionPayloadType.DEVICE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[AgentPermissionPayloadType.NETWORK.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[AgentPermissionPayloadType.UNKNOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ ApprovalSnapshotRecordJson copy$default(ApprovalSnapshotRecordJson approvalSnapshotRecordJson, String str, String str2, boolean z, String str3, long j, Long l, String str4, boolean z2, Long l2, String str5, List list, ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson, ApprovalSnapshotScopeJson approvalSnapshotScopeJson, ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson, int i, Object obj) {
        boolean z3 = z;
        String str6 = str3;
        long j2 = j;
        Long l3 = l;
        String str7 = str4;
        boolean z4 = z2;
        Long l4 = l2;
        String str8 = str5;
        List list2 = list;
        ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson2 = approvalSnapshotDisplayJson;
        ApprovalSnapshotScopeJson approvalSnapshotScopeJson2 = approvalSnapshotScopeJson;
        ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson2 = approvalSnapshotPayloadJson;
        if ((i & 1) != 0) {
            str = approvalSnapshotRecordJson.checkout_provider;
        }
        if ((i & 2) != 0) {
            str2 = approvalSnapshotRecordJson.approval_id;
        }
        if ((i & 4) != 0) {
            z3 = approvalSnapshotRecordJson.is_exclusive;
        }
        if ((i & 8) != 0) {
            str6 = approvalSnapshotRecordJson.attention_mode;
        }
        if ((i & 16) != 0) {
            j2 = approvalSnapshotRecordJson.requested_at_ms;
        }
        if ((i & 32) != 0) {
            l3 = approvalSnapshotRecordJson.decided_at_ms;
        }
        if ((i & 64) != 0) {
            str7 = approvalSnapshotRecordJson.status;
        }
        if ((i & 128) != 0) {
            z4 = approvalSnapshotRecordJson.editable_message_available;
        }
        if ((i & 256) != 0) {
            l4 = approvalSnapshotRecordJson.message_revision;
        }
        if ((i & 512) != 0) {
            str8 = approvalSnapshotRecordJson.decision;
        }
        if ((i & 1024) != 0) {
            list2 = approvalSnapshotRecordJson.decision_options;
        }
        if ((i & 2048) != 0) {
            approvalSnapshotDisplayJson2 = approvalSnapshotRecordJson.display;
        }
        if ((i & 4096) != 0) {
            approvalSnapshotScopeJson2 = approvalSnapshotRecordJson.scope;
        }
        if ((i & 8192) != 0) {
            approvalSnapshotPayloadJson2 = approvalSnapshotRecordJson.payload;
        }
        return approvalSnapshotRecordJson.copy(str, str2, z3, str6, j2, l3, str7, z4, l4, str8, list2, approvalSnapshotDisplayJson2, approvalSnapshotScopeJson2, approvalSnapshotPayloadJson2);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval toDomain(java.util.List<com.facebook.aura.gateway.AgentPermissionDecisionOption> r42) {
        /*
            Method dump skipped, instructions count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.gateway.ApprovalSnapshotRecordJson.toDomain(java.util.List):com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval");
    }

    private final HatchAgentPermissionsRepository.AgentPermissionRichPayload toRichDomainOrNull(AgentPermissionPresentationKind agentPermissionPresentationKind, AgentPermissionPayloadType agentPermissionPayloadType, String str, boolean z) {
        HatchAgentPermissionsRepository.AgentPermissionRichPayload domain = null;
        if (agentPermissionPresentationKind != AgentPermissionPresentationKind.RICH) {
            return null;
        }
        switch (agentPermissionPayloadType.ordinal()) {
            case 0:
                PurchasePreapprovalJson purchasePreapprovalJson = this.display.purchase_preapproval;
                if (purchasePreapprovalJson != null) {
                    domain = purchasePreapprovalJson.toDomain();
                    break;
                }
                break;
            case 1:
                BrowserTaskConfirmationApprovalJson browserTaskConfirmationApprovalJson = this.payload.browser_task_confirmation_payload;
                if (browserTaskConfirmationApprovalJson != null) {
                    domain = browserTaskConfirmationApprovalJson.toDomainOrNull();
                    break;
                }
                break;
            case 2:
                BrowserCheckoutApprovalJson browserCheckoutApprovalJson = this.payload.browser_checkout_payload;
                if (browserCheckoutApprovalJson != null) {
                    domain = browserCheckoutApprovalJson.toDomain();
                    break;
                }
                break;
            case 3:
                StripeLinkCheckoutApprovalJson stripeLinkCheckoutApprovalJson = this.payload.stripe_link_checkout_payload;
                if (stripeLinkCheckoutApprovalJson != null) {
                    domain = stripeLinkCheckoutApprovalJson.toDomain();
                    break;
                }
                break;
            case 4:
                ShopifyCheckoutApprovalJson shopifyCheckoutApprovalJson = this.payload.shopify_checkout_payload;
                if (shopifyCheckoutApprovalJson != null) {
                    domain = shopifyCheckoutApprovalJson.toDomain(str);
                    break;
                }
                break;
            case 5:
                FlightCheckoutApprovalJson flightCheckoutApprovalJson = this.payload.flight_checkout_payload;
                if (flightCheckoutApprovalJson != null) {
                    domain = flightCheckoutApprovalJson.toDomain();
                    break;
                }
                break;
            case 6:
                ReservationCheckoutApprovalJson reservationCheckoutApprovalJson = this.payload.reservation_checkout_payload;
                if (reservationCheckoutApprovalJson != null) {
                    domain = reservationCheckoutApprovalJson.toDomainOrNull(z);
                    break;
                }
                break;
            case 7:
                JsonElement jsonElement = this.payload.car_rental_reservation_payload;
                if (jsonElement != null) {
                    domain = HatchAgentPermissionsRepositoryJsonKt.toCarRentalReservationOrNull(jsonElement);
                    break;
                }
                break;
            case 8:
                JsonElement jsonElement2 = this.payload.delivery_checkout_payload;
                if (jsonElement2 != null) {
                    domain = DeliveryCheckoutJsonKt.toDeliveryCheckoutOrNull(jsonElement2);
                    break;
                }
                break;
            case 9:
                OutgoingMediaApprovalJson outgoingMediaApprovalJson = this.payload.outgoing_media_payload;
                if (outgoingMediaApprovalJson != null) {
                    domain = outgoingMediaApprovalJson.toDomain();
                    break;
                }
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return null;
            default:
                throw C3cG.A0q();
        }
        return domain;
    }

    public static final /* synthetic */ void write$Self$fbandroid_express_aura_java_com_facebook_aura_gateway_gateway(ApprovalSnapshotRecordJson approvalSnapshotRecordJson, C9j5 c9j5, C9iZ c9iZ) {
        F0C<C9hr<Object>>[] f0cArr = $childSerializers;
        boolean zAfR = c9j5.AfR();
        if (zAfR || approvalSnapshotRecordJson.checkout_provider != null) {
            c9j5.AAP(approvalSnapshotRecordJson.checkout_provider, C07779iq.A01, c9iZ, 0);
        }
        c9j5.AAV(approvalSnapshotRecordJson.approval_id, c9iZ, 1);
        if (zAfR || approvalSnapshotRecordJson.is_exclusive) {
            c9j5.AA7(c9iZ, 2, approvalSnapshotRecordJson.is_exclusive);
        }
        if (zAfR || approvalSnapshotRecordJson.attention_mode != null) {
            c9j5.AAP(approvalSnapshotRecordJson.attention_mode, C07779iq.A01, c9iZ, 3);
        }
        if (zAfR || approvalSnapshotRecordJson.requested_at_ms != 0) {
            c9j5.AAN(c9iZ, 4, approvalSnapshotRecordJson.requested_at_ms);
        }
        if (zAfR || approvalSnapshotRecordJson.decided_at_ms != null) {
            c9j5.AAP(approvalSnapshotRecordJson.decided_at_ms, C9j1.A00, c9iZ, 5);
        }
        if (zAfR || approvalSnapshotRecordJson.status != null) {
            c9j5.AAP(approvalSnapshotRecordJson.status, C07779iq.A01, c9iZ, 6);
        }
        if (zAfR || approvalSnapshotRecordJson.editable_message_available) {
            c9j5.AA7(c9iZ, 7, approvalSnapshotRecordJson.editable_message_available);
        }
        if (zAfR || approvalSnapshotRecordJson.message_revision != null) {
            c9j5.AAP(approvalSnapshotRecordJson.message_revision, C9j1.A00, c9iZ, 8);
        }
        if (zAfR || approvalSnapshotRecordJson.decision != null) {
            c9j5.AAP(approvalSnapshotRecordJson.decision, C07779iq.A01, c9iZ, 9);
        }
        if (zAfR || !C3cG.A1L(approvalSnapshotRecordJson.decision_options)) {
            c9j5.AAQ(approvalSnapshotRecordJson.decision_options, C3cH.A15(f0cArr, 10), c9iZ, 10);
        }
        if (zAfR || !C7384Etj.areEqual(approvalSnapshotRecordJson.display, new ApprovalSnapshotDisplayJson(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C0881AGi.A00))) {
            c9j5.AAQ(approvalSnapshotRecordJson.display, ApprovalSnapshotDisplayJson$$serializer.INSTANCE, c9iZ, 11);
        }
        if (zAfR || !C7384Etj.areEqual(approvalSnapshotRecordJson.scope, new ApprovalSnapshotScopeJson(null, null, null))) {
            c9j5.AAQ(approvalSnapshotRecordJson.scope, ApprovalSnapshotScopeJson$$serializer.INSTANCE, c9iZ, 12);
        }
        if (zAfR || !C7384Etj.areEqual(approvalSnapshotRecordJson.payload, new ApprovalSnapshotPayloadJson("", null, null, null, null, null, null, null, null, null, null, null, null))) {
            c9j5.AAQ(approvalSnapshotRecordJson.payload, ApprovalSnapshotPayloadJson$$serializer.INSTANCE, c9iZ, 13);
        }
    }

    public final String component1() {
        return this.checkout_provider;
    }

    public final String component10() {
        return this.decision;
    }

    public final List<ApprovalDecisionOptionJson> component11() {
        return this.decision_options;
    }

    public final ApprovalSnapshotDisplayJson component12() {
        return this.display;
    }

    public final ApprovalSnapshotScopeJson component13() {
        return this.scope;
    }

    public final ApprovalSnapshotPayloadJson component14() {
        return this.payload;
    }

    public final String component2() {
        return this.approval_id;
    }

    public final boolean component3() {
        return this.is_exclusive;
    }

    public final String component4() {
        return this.attention_mode;
    }

    public final long component5() {
        return this.requested_at_ms;
    }

    public final Long component6() {
        return this.decided_at_ms;
    }

    public final String component7() {
        return this.status;
    }

    public final boolean component8() {
        return this.editable_message_available;
    }

    public final Long component9() {
        return this.message_revision;
    }

    public final String getApproval_id() {
        return this.approval_id;
    }

    public final String getAttention_mode() {
        return this.attention_mode;
    }

    public final String getCheckout_provider() {
        return this.checkout_provider;
    }

    public final Long getDecided_at_ms() {
        return this.decided_at_ms;
    }

    public final String getDecision() {
        return this.decision;
    }

    public final List<ApprovalDecisionOptionJson> getDecision_options() {
        return this.decision_options;
    }

    public final ApprovalSnapshotDisplayJson getDisplay() {
        return this.display;
    }

    public final boolean getEditable_message_available() {
        return this.editable_message_available;
    }

    public final Long getMessage_revision() {
        return this.message_revision;
    }

    public final ApprovalSnapshotPayloadJson getPayload() {
        return this.payload;
    }

    public final long getRequested_at_ms() {
        return this.requested_at_ms;
    }

    public final ApprovalSnapshotScopeJson getScope() {
        return this.scope;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.payload, AnonymousClass005.A0F(this.scope, AnonymousClass005.A0F(this.display, AnonymousClass005.A0F(this.decision_options, (((C0KA.A01(((((AnonymousClass006.A05(this.requested_at_ms, (C0KA.A01(AnonymousClass005.A0I(this.approval_id, AnonymousClass006.A0G(this.checkout_provider) * 31), this.is_exclusive) + AnonymousClass006.A0G(this.attention_mode)) * 31) * 31) + AnonymousClass006.A0D(this.decided_at_ms)) * 31) + AnonymousClass006.A0G(this.status)) * 31, this.editable_message_available) + AnonymousClass006.A0D(this.message_revision)) * 31) + AnonymousClass005.A0H(this.decision)) * 31))));
    }

    public final boolean is_exclusive() {
        return this.is_exclusive;
    }

    public final HatchAgentPermissionsRepository.AgentPermissionApproval toPendingDomainOrNull() {
        List<ApprovalDecisionOptionJson> list = this.decision_options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ApprovalDecisionOptionJson> it = list.iterator();
        while (it.hasNext()) {
            AgentPermissionDecisionOption domainOrNull = it.next().toDomainOrNull();
            if (domainOrNull != null) {
                arrayListA0h.add(domainOrNull);
            }
        }
        if (!arrayListA0h.isEmpty()) {
            return ApprovalCardOnlyKt.withCardOnlyDecisionApplied(toDomain(arrayListA0h));
        }
        CFK.A04(HatchAgentPermissionsRepositoryJsonKt.TAG, AnonymousClass006.A0y(this.decision_options, " with missing or invalid decision_options: ", C3cI.A0x("Skipping pending snapshot approval ", this.approval_id)));
        return null;
    }

    public String toString() {
        return super.toString();
    }

    public /* synthetic */ ApprovalSnapshotRecordJson(String str, String str2, boolean z, String str3, long j, Long l, String str4, boolean z2, Long l2, String str5, List list, ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson, ApprovalSnapshotScopeJson approvalSnapshotScopeJson, ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson, int i, C06H c06h) {
        this((i & 1) != 0 ? null : str, str2, C3cG.A1K(i & 4, z), (i & 8) != 0 ? null : str3, C3cH.A03(i & 16, j), (i & 32) != 0 ? null : l, (i & 64) != 0 ? null : str4, C3cH.A1N(i, z2), (i & 256) != 0 ? null : l2, (i & 512) != 0 ? null : str5, (i & 1024) != 0 ? C0881AGi.A00 : list, (i & 2048) != 0 ? new ApprovalSnapshotDisplayJson(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C0881AGi.A00) : approvalSnapshotDisplayJson, (i & 4096) != 0 ? new ApprovalSnapshotScopeJson(null, null, null) : approvalSnapshotScopeJson, (i & 8192) != 0 ? new ApprovalSnapshotPayloadJson("", null, null, null, null, null, null, null, null, null, null, null, null) : approvalSnapshotPayloadJson);
    }

    public final HatchAgentPermissionsRepository.AgentPermissionApproval toDomain() {
        List<ApprovalDecisionOptionJson> list = this.decision_options;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<ApprovalDecisionOptionJson> it = list.iterator();
        while (it.hasNext()) {
            AgentPermissionDecisionOption domainOrNull = it.next().toDomainOrNull();
            if (domainOrNull != null) {
                arrayListA0h.add(domainOrNull);
            }
        }
        return ApprovalCardOnlyKt.withCardOnlyDecisionApplied(toDomain(arrayListA0h));
    }

    public /* synthetic */ ApprovalSnapshotRecordJson(int i, String str, String str2, boolean z, String str3, long j, Long l, String str4, boolean z2, Long l2, String str5, List list, ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson, ApprovalSnapshotScopeJson approvalSnapshotScopeJson, ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson, C2hx c2hx) {
        long j2 = j;
        ApprovalSnapshotScopeJson approvalSnapshotScopeJson2 = approvalSnapshotScopeJson;
        ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson2 = approvalSnapshotPayloadJson;
        List list2 = list;
        if (2 != (i & 2)) {
            C9iI.A00(ApprovalSnapshotRecordJson$$serializer.descriptor, i, 2);
            throw F60.createAndThrow();
        }
        if ((i & 1) == 0) {
            this.checkout_provider = null;
        } else {
            this.checkout_provider = str;
        }
        this.approval_id = str2;
        if ((i & 4) == 0) {
            this.is_exclusive = false;
        } else {
            this.is_exclusive = z;
        }
        if ((i & 8) == 0) {
            this.attention_mode = null;
        } else {
            this.attention_mode = str3;
        }
        this.requested_at_ms = (i & 16) == 0 ? 0L : j2;
        if ((i & 32) == 0) {
            this.decided_at_ms = null;
        } else {
            this.decided_at_ms = l;
        }
        if ((i & 64) == 0) {
            this.status = null;
        } else {
            this.status = str4;
        }
        if ((i & 128) == 0) {
            this.editable_message_available = false;
        } else {
            this.editable_message_available = z2;
        }
        if ((i & 256) == 0) {
            this.message_revision = null;
        } else {
            this.message_revision = l2;
        }
        if ((i & 512) == 0) {
            this.decision = null;
        } else {
            this.decision = str5;
        }
        this.decision_options = (i & 1024) == 0 ? C0881AGi.A00 : list2;
        if ((i & 2048) == 0) {
            this.display = new ApprovalSnapshotDisplayJson(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, C0881AGi.A00);
        } else {
            this.display = approvalSnapshotDisplayJson;
        }
        this.scope = (i & 4096) == 0 ? new ApprovalSnapshotScopeJson(null, null, null) : approvalSnapshotScopeJson2;
        this.payload = (i & 8192) == 0 ? new ApprovalSnapshotPayloadJson("", null, null, null, null, null, null, null, null, null, null, null, null) : approvalSnapshotPayloadJson2;
    }

    public ApprovalSnapshotRecordJson(String str, String str2, boolean z, String str3, long j, Long l, String str4, boolean z2, Long l2, String str5, List<ApprovalDecisionOptionJson> list, ApprovalSnapshotDisplayJson approvalSnapshotDisplayJson, ApprovalSnapshotScopeJson approvalSnapshotScopeJson, ApprovalSnapshotPayloadJson approvalSnapshotPayloadJson) {
        C7384Etj.A0Y(str2, 1);
        AnonymousClass002.A1G(list, 10, approvalSnapshotDisplayJson);
        AnonymousClass003.A11(approvalSnapshotScopeJson, approvalSnapshotPayloadJson);
        this.checkout_provider = str;
        this.approval_id = str2;
        this.is_exclusive = z;
        this.attention_mode = str3;
        this.requested_at_ms = j;
        this.decided_at_ms = l;
        this.status = str4;
        this.editable_message_available = z2;
        this.message_revision = l2;
        this.decision = str5;
        this.decision_options = list;
        this.display = approvalSnapshotDisplayJson;
        this.scope = approvalSnapshotScopeJson;
        this.payload = approvalSnapshotPayloadJson;
    }
}
