package com.facebook.aura.agentpermission;

import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AnonymousClass003;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.gateway.ConnectorOrderCheckout;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class ConnectorOrderCheckoutRowsKt {
    public static final String DETAIL_SEPARATOR = " \u00b7 ";
    public static final String TOTAL_TYPE = "total";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.List] */
    public static final ConnectorOrderAddressRow addressRow(ConnectorOrderCheckout connectorOrderCheckout) {
        ArrayList arrayListA0P;
        String str;
        String str2;
        C7384Etj.A0Y(connectorOrderCheckout, 0);
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField = connectorOrderCheckout.address;
        String strTrimToNonEmpty = (agentPermissionRequestPreviewField == null || (str2 = agentPermissionRequestPreviewField.value) == null) ? null : CheckoutRowPrimitivesKt.trimToNonEmpty(str2);
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField2 = connectorOrderCheckout.fulfillment;
        String strTrimToNonEmpty2 = (agentPermissionRequestPreviewField2 == null || (str = agentPermissionRequestPreviewField2.value) == null) ? null : CheckoutRowPrimitivesKt.trimToNonEmpty(str);
        List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> list = connectorOrderCheckout.arrivals;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> it = list.iterator();
        while (it.hasNext()) {
            String strTrimToNonEmpty3 = CheckoutRowPrimitivesKt.trimToNonEmpty(it.next().value);
            if (strTrimToNonEmpty3 != null) {
                arrayListA0h.add(strTrimToNonEmpty3);
            }
        }
        if (strTrimToNonEmpty != null) {
            arrayListA0P = AbstractC0878AGe.A0P(arrayListA0h, AbstractC0885AGm.A0z(strTrimToNonEmpty2));
        } else if (strTrimToNonEmpty2 == null) {
            strTrimToNonEmpty = (String) AbstractC0878AGe.A0G(arrayListA0h);
            if (strTrimToNonEmpty == null) {
                return null;
            }
            arrayListA0P = AbstractC0878AGe.A0Z(arrayListA0h, 1);
        } else {
            strTrimToNonEmpty = strTrimToNonEmpty2;
            arrayListA0P = arrayListA0h;
        }
        return new ConnectorOrderAddressRow(strTrimToNonEmpty, arrayListA0P.isEmpty() ? null : AbstractC0878AGe.A0L(DETAIL_SEPARATOR, "", "", arrayListA0P, null));
    }

    public static final String merchantMonogram(String str) {
        if (str != null) {
            for (int i = 0; i < str.length(); i++) {
                char cCharAt = str.charAt(i);
                if (Character.isLetterOrDigit(cCharAt)) {
                    return String.valueOf(Character.toUpperCase(cCharAt));
                }
            }
        }
        return null;
    }

    public static final List<HatchAgentPermissionsRepository.CheckoutTotal> priceDetailsTotals(ConnectorOrderCheckout connectorOrderCheckout, String str) {
        AnonymousClass003.A0u(connectorOrderCheckout, str);
        if (connectorOrderCheckout.priceDetails.isEmpty()) {
            return null;
        }
        List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> list = connectorOrderCheckout.priceDetails;
        ArrayList arrayListA0i = AnonymousClass003.A0i(list);
        for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField : list) {
            arrayListA0i.add(new HatchAgentPermissionsRepository.CheckoutTotal(null, agentPermissionRequestPreviewField.label, agentPermissionRequestPreviewField.value, null));
        }
        String strTrimToNonEmpty = CheckoutRowPrimitivesKt.trimToNonEmpty(connectorOrderCheckout.total.label);
        if (strTrimToNonEmpty != null) {
            str = strTrimToNonEmpty;
        }
        return AbstractC0878AGe.A0Q(new HatchAgentPermissionsRepository.CheckoutTotal("total", str, connectorOrderCheckout.total.value, null), arrayListA0i);
    }
}
