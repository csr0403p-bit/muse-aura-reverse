package com.facebook.aura.agentpermission;

import X.AnonymousClass002;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.flight.ui.FlightDetailRowKind;
import com.facebook.aura.gateway.FlightCheckoutDetailRowKind;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;

/* loaded from: classes2.dex */
public abstract class FlightSegmentUiMapperKt {
    public static final boolean hasRenderableContent(HatchAgentPermissionsRepository.FlightCheckoutSegment flightCheckoutSegment) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        C7384Etj.A0Y(flightCheckoutSegment, 0);
        String str6 = flightCheckoutSegment.title;
        return ((str6 == null || CheckoutRowPrimitivesKt.trimToNonEmpty(str6) == null) && ((str = flightCheckoutSegment.departingDisplay) == null || CheckoutRowPrimitivesKt.trimToNonEmpty(str) == null) && (((str2 = flightCheckoutSegment.arrivingDisplay) == null || CheckoutRowPrimitivesKt.trimToNonEmpty(str2) == null) && (((str3 = flightCheckoutSegment.seatsDisplay) == null || CheckoutRowPrimitivesKt.trimToNonEmpty(str3) == null) && (((str4 = flightCheckoutSegment.flightDisplay) == null || CheckoutRowPrimitivesKt.trimToNonEmpty(str4) == null) && flightCheckoutSegment.detailRows.isEmpty() && ((str5 = flightCheckoutSegment.airlineIconUrl) == null || CheckoutRowPrimitivesKt.trimToNonEmpty(str5) == null))))) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.facebook.aura.flight.ui.FlightSegmentUiModel rememberUiModel(com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutSegment r10, X.BFM r11, int r12) {
        /*
            r0 = 0
            X.C7384Etj.A0Y(r10, r0)
            java.lang.String r0 = r10.seatsDisplay
            r9 = 0
            java.lang.String r1 = X.C3cI.A0a(r0)
            if (r1 != 0) goto L88
            r0 = 375941180(0x1668683c, float:1.8773701E-25)
            X.AnonymousClass003.A0l(r11, r0)
            r1 = r9
        L14:
            r0 = r12 & 14
            r0 = r0 ^ 6
            r3 = 4
            if (r0 <= r3) goto L21
            boolean r0 = r11.A65(r10)
            if (r0 != 0) goto L26
        L21:
            r2 = r12 & 6
            r0 = 0
            if (r2 != r3) goto L27
        L26:
            r0 = 1
        L27:
            boolean r0 = X.AnonymousClass001.A1R(r11, r1, r0)
            java.lang.Object r3 = r11.AaT()
            if (r0 != 0) goto L35
            java.lang.Object r0 = X.C78N.A00
            if (r3 != r0) goto Laa
        L35:
            java.lang.String r0 = r10.title
            if (r0 == 0) goto L86
            java.lang.String r4 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
        L3d:
            java.lang.String r0 = r10.departingDisplay
            if (r0 == 0) goto L84
            java.lang.String r5 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
        L45:
            java.lang.String r0 = r10.arrivingDisplay
            if (r0 == 0) goto L82
            java.lang.String r6 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
        L4d:
            java.lang.String r0 = r10.flightDisplay
            java.lang.String r0 = X.C3cI.A0a(r0)
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r7 = X.BFI.A0F(r0)
            java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutDetailRow> r0 = r10.detailRows
            java.util.ArrayList r8 = X.AnonymousClass003.A0i(r0)
            java.util.Iterator r3 = r0.iterator()
        L65:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r3.next()
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutDetailRow r1 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutDetailRow) r1
            com.facebook.aura.gateway.FlightCheckoutDetailRowKind r0 = r1.kind
            com.facebook.aura.flight.ui.FlightDetailRowKind r2 = toUiKind(r0)
            java.lang.String r1 = r1.text
            com.facebook.aura.flight.ui.FlightDetailRow r0 = new com.facebook.aura.flight.ui.FlightDetailRow
            r0.<init>(r2, r1)
            r8.add(r0)
            goto L65
        L82:
            r6 = r9
            goto L4d
        L84:
            r5 = r9
            goto L45
        L86:
            r4 = r9
            goto L3d
        L88:
            r0 = 375941181(0x1668683d, float:1.8773703E-25)
            r11.AgE(r0)
            r0 = 2131886319(0x7f1200ef, float:1.9407213E38)
            java.lang.String r1 = X.AnonymousClass001.A0t(r11, r1, r0)
            X.AnonymousClass001.A1D(r11)
            goto L14
        L9a:
            java.lang.String r0 = r10.airlineIconUrl
            if (r0 == 0) goto La2
            java.lang.String r9 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
        La2:
            com.facebook.aura.flight.ui.FlightSegmentUiModel r3 = new com.facebook.aura.flight.ui.FlightSegmentUiModel
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r11.Ai0(r3)
        Laa:
            com.facebook.aura.flight.ui.FlightSegmentUiModel r3 = (com.facebook.aura.flight.ui.FlightSegmentUiModel) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.FlightSegmentUiMapperKt.rememberUiModel(com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutSegment, X.BFM, int):com.facebook.aura.flight.ui.FlightSegmentUiModel");
    }

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FlightCheckoutDetailRowKind.values().length];
            try {
                AnonymousClass002.A13(FlightCheckoutDetailRowKind.FARE_RULES, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(FlightCheckoutDetailRowKind.INCLUDED, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AnonymousClass002.A15(FlightCheckoutDetailRowKind.EXCLUDED, iArr);
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AnonymousClass002.A16(FlightCheckoutDetailRowKind.UNKNOWN, iArr);
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final FlightDetailRowKind toUiKind(FlightCheckoutDetailRowKind flightCheckoutDetailRowKind) {
        int iOrdinal = flightCheckoutDetailRowKind.ordinal();
        if (iOrdinal == 0) {
            return FlightDetailRowKind.FARE_RULES;
        }
        if (iOrdinal == 1) {
            return FlightDetailRowKind.INCLUDED;
        }
        if (iOrdinal == 2) {
            return FlightDetailRowKind.EXCLUDED;
        }
        if (iOrdinal == 3) {
            return FlightDetailRowKind.UNKNOWN;
        }
        throw C3cG.A0q();
    }
}
