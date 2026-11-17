package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass004;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.BFI;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ConnectorOrderCheckoutKt {
    public static final String ADDRESS_KEY = "address";
    public static final String ADJUSTMENT_PREFIX = "adjustments.";
    public static final String ARRIVAL_PREFIX = "arrivals.";
    public static final String CHARGE_NOTICE_KEY = "charge_notice";
    public static final String FULFILLMENT_KEY = "fulfillment";
    public static final String ITEMS_CONTINUATION_PREFIX = "items_";
    public static final String ITEMS_KEY = "items";
    public static final Set<String> PRICE_DETAIL_KEYS = BFI.A0H(new String[]{"subtotal", "tax", "tip"});
    public static final String TOTAL_KEY = "total";

    public static final ConnectorOrderCheckout connectorOrderCheckout(HatchAgentPermissionsRepository.AgentPermissionApproval agentPermissionApproval) {
        C7384Etj.A0Y(agentPermissionApproval, 0);
        HatchAgentPermissionsRepository.AgentPermissionRichPayload agentPermissionRichPayload = agentPermissionApproval.richPayload;
        if (agentPermissionRichPayload instanceof ConnectorOrderCheckout) {
            return (ConnectorOrderCheckout) agentPermissionRichPayload;
        }
        return null;
    }

    public static final ConnectorOrderCheckout toConnectorOrderCheckoutOrNull(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument) {
        String strA0l;
        C7384Etj.A0Y(agentPermissionRequestPreviewDocument, 0);
        if (agentPermissionRequestPreviewDocument.truncated) {
            return null;
        }
        List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock> list = agentPermissionRequestPreviewDocument.blocks;
        ArrayList arrayList = new ArrayList();
        for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock agentPermissionRequestPreviewBlock : list) {
            if (agentPermissionRequestPreviewBlock instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList) {
                arrayList.add(agentPermissionRequestPreviewBlock);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            String str = ((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList) obj).key;
            if (ITEMS_KEY.equals(str) || isIndexed(str, ITEMS_CONTINUATION_PREFIX)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList) it.next()).items, arrayList3);
        }
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField = (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField) AbstractC0878AGe.A0K(fieldRows(agentPermissionRequestPreviewDocument, "total"));
        if (agentPermissionRequestPreviewField == null || C7BY.A0j(agentPermissionRequestPreviewField.value)) {
            agentPermissionRequestPreviewField = null;
        }
        if (arrayList3.isEmpty() || agentPermissionRequestPreviewField == null) {
            return null;
        }
        List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> listFieldRows = fieldRows(agentPermissionRequestPreviewDocument);
        ArrayList arrayList4 = new ArrayList();
        for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField2 : listFieldRows) {
            AnonymousClass006.A1F(agentPermissionRequestPreviewField2.value, agentPermissionRequestPreviewField2, arrayList4);
        }
        ArrayList arrayListA0i = AnonymousClass003.A0i(arrayList3);
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayListA0i.add(new ConnectorOrderItem(AnonymousClass005.A0j(it2)));
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj2 : arrayList4) {
            String str2 = ((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField) obj2).key;
            if (str2 != null && (PRICE_DETAIL_KEYS.contains(str2) || isIndexed(str2, ADJUSTMENT_PREFIX))) {
                arrayList5.add(obj2);
            }
        }
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField connectorOrderCheckoutOrNull$row = toConnectorOrderCheckoutOrNull$row(arrayList4, FULFILLMENT_KEY);
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField connectorOrderCheckoutOrNull$row2 = toConnectorOrderCheckoutOrNull$row(arrayList4, "address");
        ArrayList arrayList6 = new ArrayList();
        for (Object obj3 : arrayList4) {
            String str3 = ((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField) obj3).key;
            if (str3 != null && isIndexed(str3, ARRIVAL_PREFIX)) {
                arrayList6.add(obj3);
            }
        }
        String strTextBlock = textBlock(agentPermissionRequestPreviewDocument, CHARGE_NOTICE_KEY);
        if (strTextBlock == null || (strA0l = AnonymousClass002.A0l(strTextBlock)) == null || strA0l.length() <= 0) {
            strA0l = null;
        }
        return new ConnectorOrderCheckout(arrayListA0i, agentPermissionRequestPreviewField, arrayList5, connectorOrderCheckoutOrNull$row, connectorOrderCheckoutOrNull$row2, arrayList6, strA0l);
    }

    public static final List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> fieldRows(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, String str) {
        AnonymousClass003.A0u(agentPermissionRequestPreviewDocument, str);
        List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> listFieldRows = fieldRows(agentPermissionRequestPreviewDocument);
        ArrayList arrayList = new ArrayList();
        for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField agentPermissionRequestPreviewField : listFieldRows) {
            if (str.equals(agentPermissionRequestPreviewField.key)) {
                arrayList.add(agentPermissionRequestPreviewField);
            }
        }
        return arrayList;
    }

    public static final boolean isIndexed(String str, String str2) {
        String strSubstring;
        int length;
        boolean zA1b = AnonymousClass004.A1b(str, str2);
        if (!str.startsWith(str2) || (length = (strSubstring = str.substring(str2.length())).length()) <= 0) {
            return zA1b;
        }
        int i = 0;
        do {
            char cCharAt = strSubstring.charAt(i);
            if ('0' > cCharAt || cCharAt >= ':') {
                return zA1b;
            }
            i++;
        } while (i < length);
        return true;
    }

    public static final List<String> listItems(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, String str) {
        List<String> list;
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList itemList;
        AnonymousClass003.A0u(agentPermissionRequestPreviewDocument, str);
        Iterator<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock> it = agentPermissionRequestPreviewDocument.blocks.iterator();
        while (true) {
            list = null;
            if (!it.hasNext()) {
                break;
            }
            HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock next = it.next();
            if ((next instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList) && (itemList = (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.ItemList) next) != null && str.equals(itemList.key) && (list = itemList.items) != null) {
                break;
            }
        }
        return list;
    }

    public static final String textBlock(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument, String str) {
        String str2;
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text text;
        AnonymousClass003.A0u(agentPermissionRequestPreviewDocument, str);
        Iterator<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock> it = agentPermissionRequestPreviewDocument.blocks.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock next = it.next();
            if ((next instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text) && (text = (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Text) next) != null && str.equals(text.key) && (str2 = text.text) != null) {
                break;
            }
        }
        return str2;
    }

    public static final HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField toConnectorOrderCheckoutOrNull$row(List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> list, String str) {
        HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField next;
        Iterator<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.key, str)) {
                break;
            }
        }
        return next;
    }

    public static final List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewField> fieldRows(HatchAgentPermissionsRepository.AgentPermissionRequestPreviewDocument agentPermissionRequestPreviewDocument) {
        List<HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock> list = agentPermissionRequestPreviewDocument.blocks;
        ArrayList arrayList = new ArrayList();
        for (HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock agentPermissionRequestPreviewBlock : list) {
            if (agentPermissionRequestPreviewBlock instanceof HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields) {
                arrayList.add(agentPermissionRequestPreviewBlock);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(((HatchAgentPermissionsRepository.AgentPermissionRequestPreviewBlock.Fields) it.next()).rows, arrayList2);
        }
        return arrayList2;
    }
}
