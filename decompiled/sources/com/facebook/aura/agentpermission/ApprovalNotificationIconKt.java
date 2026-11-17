package com.facebook.aura.agentpermission;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.maplibre.android.R;

/* loaded from: classes2.dex */
public abstract class ApprovalNotificationIconKt {
    public static final String CALLER_CONTEXT = "AgentApprovalNotification";
    public static final long ICON_FETCH_TIMEOUT_MS = 3000;

    @DebugMetadata(c = "com.facebook.aura.agentpermission.ApprovalNotificationIconKt", f = "ApprovalNotificationIcon.kt", l = {R.styleable.maplibre_MapView_maplibre_uiCompassMarginLeft}, m = "approvalNotificationIcon", v = 2)
    /* renamed from: com.facebook.aura.agentpermission.ApprovalNotificationIconKt$approvalNotificationIcon$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ApprovalNotificationIconKt.approvalNotificationIcon(null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String approvalLogoUri(com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r4, X.G0U<? super java.lang.String, java.lang.String> r5) {
        /*
            java.lang.String r0 = r4.iconUrl
            r1 = 0
            java.lang.String r3 = X.C3cI.A0a(r0)
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRichPayload r2 = r4.richPayload
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval
            if (r0 == 0) goto L1c
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$BrowserTaskConfirmationApproval r2 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.BrowserTaskConfirmationApproval) r2
            java.lang.String r0 = r2.browserTaskId
            java.lang.Object r2 = r5.invoke(r0)
            java.lang.String r2 = (java.lang.String) r2
        L17:
            java.lang.String r0 = com.facebook.aura.agentpermission.CheckoutApprovalSharedKt.checkoutFaviconUri(r2, r1)
        L1b:
            return r0
        L1c:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.BrowserCheckoutApproval
            if (r0 == 0) goto L25
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$BrowserCheckoutApproval r2 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.BrowserCheckoutApproval) r2
            java.lang.String r2 = r2.merchantUrl
            goto L17
        L25:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.StripeLinkCheckoutApproval
            if (r0 == 0) goto L2e
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$StripeLinkCheckoutApproval r2 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.StripeLinkCheckoutApproval) r2
            java.lang.String r2 = r2.merchantUrl
            goto L17
        L2e:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.ShopifyCheckoutApproval
            if (r0 == 0) goto L4d
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$ShopifyCheckoutApproval r2 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.ShopifyCheckoutApproval) r2
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutMerchant r0 = r2.merchant
            if (r0 == 0) goto L42
            java.lang.String r0 = r0.iconUrl
            if (r0 == 0) goto L42
            java.lang.String r0 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
            if (r0 != 0) goto L1b
        L42:
            if (r3 != 0) goto L93
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutMerchant r0 = r2.merchant
        L46:
            if (r0 == 0) goto L66
            java.lang.String r2 = r0.url
            java.lang.String r1 = r0.name
            goto L17
        L4d:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutApproval
            if (r0 == 0) goto L68
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutApproval r2 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutApproval) r2
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutMerchant r0 = r2.merchant
            if (r0 == 0) goto L61
            java.lang.String r0 = r0.iconUrl
            if (r0 == 0) goto L61
            java.lang.String r0 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
            if (r0 != 0) goto L1b
        L61:
            if (r3 != 0) goto L93
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutMerchant r0 = r2.merchant
            goto L46
        L66:
            r2 = r1
            goto L17
        L68:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.ReservationCheckoutApproval
            if (r0 == 0) goto L7d
            if (r3 != 0) goto L93
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$ReservationCheckoutApproval r2 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.ReservationCheckoutApproval) r2
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$CheckoutMerchant r0 = r2.merchant
            if (r0 == 0) goto L94
            java.lang.String r0 = r0.iconUrl
            if (r0 == 0) goto L94
            java.lang.String r0 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
            return r0
        L7d:
            boolean r0 = r2 instanceof com.facebook.aura.gateway.DeliveryCheckoutApproval
            if (r0 != 0) goto L93
            boolean r0 = r2 instanceof com.facebook.aura.gateway.HatchAgentPermissionsRepository.CarRentalReservationApproval
            if (r0 != 0) goto L93
            boolean r0 = r2 instanceof com.facebook.aura.gateway.ConnectorOrderCheckout
            if (r0 != 0) goto L93
            if (r3 == 0) goto L94
            com.facebook.aura.gateway.AgentPermissionPayloadType r0 = r4.payloadType
            boolean r0 = r0.getRendersAsConnectorCard()
            if (r0 == 0) goto L94
        L93:
            return r3
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.ApprovalNotificationIconKt.approvalLogoUri(com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, X.G0U):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object approvalNotificationIcon(android.content.Context r7, com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval r8, X.G0U<? super java.lang.String, java.lang.String> r9, X.HtJ<? super android.graphics.Bitmap> r10) {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.agentpermission.ApprovalNotificationIconKt.AnonymousClass1
            if (r0 == 0) goto L9f
            r5 = r10
            com.facebook.aura.agentpermission.ApprovalNotificationIconKt$approvalNotificationIcon$1 r5 = (com.facebook.aura.agentpermission.ApprovalNotificationIconKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9f
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r1 = r5.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L33
            if (r0 != r4) goto La6
            java.lang.Object r8 = r5.L$1
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval r8 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval) r8
            java.lang.Object r7 = r5.L$0
            android.content.Context r7 = (android.content.Context) r7
            X.Hwg.A00(r1)
        L28:
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            if (r1 == 0) goto L69
            com.facebook.aura.notifications.attention.AttentionNotifications r0 = com.facebook.aura.notifications.attention.AttentionNotifications.INSTANCE
            android.graphics.Bitmap r6 = r0.iconTile(r7, r1)
        L32:
            return r6
        L33:
            X.Hwg.A00(r1)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            int r3 = r1.getDimensionPixelSize(r0)
            java.lang.String r2 = approvalLogoUri(r8, r9)
            r1 = 0
            if (r2 == 0) goto L69
            r0 = 0
            android.net.Uri r0 = X.C7Je.A01(r2)     // Catch: java.lang.Throwable -> L4d
        L4d:
            if (r0 == 0) goto L69
            com.facebook.aura.agentpermission.ApprovalNotificationIconKt$approvalNotificationIcon$logo$2$1 r2 = new com.facebook.aura.agentpermission.ApprovalNotificationIconKt$approvalNotificationIcon$logo$2$1
            r2.<init>(r0, r3, r1)
            r5.L$0 = r7
            r5.L$1 = r8
            r5.L$2 = r1
            r5.L$3 = r1
            r5.I$0 = r3
            r5.label = r4
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r1 = X.GAX.A01(r5, r2, r0)
            if (r1 != r6) goto L28
            return r6
        L69:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionRichPayload r0 = r8.richPayload
            if (r0 == 0) goto L85
            boolean r0 = r0 instanceof com.facebook.aura.gateway.ConnectorOrderCheckout
            if (r0 != 0) goto L85
            com.facebook.aura.notifications.attention.AttentionNotifications r3 = com.facebook.aura.notifications.attention.AttentionNotifications.INSTANCE
            r2 = 2131231142(0x7f0801a6, float:1.8078357E38)
        L76:
            r0 = -1728052215(0xffffffff99000409, float:-6.61826E-24)
            java.lang.Integer r1 = X.C3cG.A0R(r0)
            r0 = 1059252410(0x3f22e8ba, float:0.6363636)
            android.graphics.Bitmap r6 = r3.iconTile(r7, r2, r1, r0)
            return r6
        L85:
            java.lang.Integer r0 = r8.iconRes
            if (r0 == 0) goto L98
            int r3 = r0.intValue()
            com.facebook.aura.notifications.attention.AttentionNotifications r2 = com.facebook.aura.notifications.attention.AttentionNotifications.INSTANCE
            r1 = 0
            r0 = 1065353216(0x3f800000, float:1.0)
            android.graphics.Bitmap r6 = r2.iconTile(r7, r3, r1, r0)
            if (r6 != 0) goto L32
        L98:
            com.facebook.aura.notifications.attention.AttentionNotifications r3 = com.facebook.aura.notifications.attention.AttentionNotifications.INSTANCE
            int r2 = com.facebook.aura.agentpermission.AgentPermissionIconsKt.approvalGlyphRes(r8)
            goto L76
        L9f:
            com.facebook.aura.agentpermission.ApprovalNotificationIconKt$approvalNotificationIcon$1 r5 = new com.facebook.aura.agentpermission.ApprovalNotificationIconKt$approvalNotificationIcon$1
            r5.<init>(r10)
            goto L12
        La6:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.ApprovalNotificationIconKt.approvalNotificationIcon(android.content.Context, com.facebook.aura.gateway.HatchAgentPermissionsRepository$AgentPermissionApproval, X.G0U, X.HtJ):java.lang.Object");
    }
}
