package com.facebook.aura.agentpermission;

import X.AGH;
import X.AGI;
import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC0882AGj;
import X.AnonymousClass002;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C3cG;
import X.C3cH;
import X.C3cI;
import X.C7384Etj;
import X.C7BY;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.gateway.WalletCatalog;
import com.facebook.aura.gateway.WalletPaymentOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class CheckoutWalletSheetViewModelKt {
    public static final String DEFAULT_PAYMENT_TYPE = "card";

    public static final WalletOptionKey getKey(WalletPaymentOption walletPaymentOption) {
        C7384Etj.A0Y(walletPaymentOption, 0);
        return new WalletOptionKey(walletPaymentOption.paymentMethod, walletPaymentOption.paymentId);
    }

    public static final WalletOptionKey resolveSelection(List<WalletPaymentMethodGroup> list, HatchAgentPermissionsRepository.CheckoutPaymentSelection checkoutPaymentSelection) {
        String str;
        WalletPaymentOption walletPaymentOptionFindOption;
        if (checkoutPaymentSelection != null && (str = checkoutPaymentSelection.paymentId) != null && !C7BY.A0j(str)) {
            String str2 = checkoutPaymentSelection.paymentMethod;
            if (str2 == null || C7BY.A0j(str2)) {
                ArrayList arrayListA0h = C3cG.A0h();
                Iterator<WalletPaymentMethodGroup> it = list.iterator();
                while (it.hasNext()) {
                    AbstractC0882AGj.A0r(it.next().paymentOptions, arrayListA0h);
                }
                ArrayList arrayListA0h2 = C3cG.A0h();
                for (Object obj : arrayListA0h) {
                    C3cI.A1J(((WalletPaymentOption) obj).paymentId, obj, str, arrayListA0h2);
                }
                walletPaymentOptionFindOption = (WalletPaymentOption) AbstractC0878AGe.A0K(arrayListA0h2);
            } else {
                walletPaymentOptionFindOption = findOption(list, new WalletOptionKey(str2, str));
            }
            if (walletPaymentOptionFindOption != null) {
                return getKey(walletPaymentOptionFindOption);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [X.9jH] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.AbstractMap, java.util.LinkedHashMap] */
    public static final List<WalletPaymentOption> paymentOptionsFor(WalletCatalog walletCatalog, HatchAgentPermissionsRepository.CheckoutApprovalPayload checkoutApprovalPayload) {
        ?? A0E;
        List<WalletPaymentOption> paymentOptions;
        if (checkoutApprovalPayload == null || (paymentOptions = checkoutApprovalPayload.getPaymentOptions()) == null) {
            A0E = AGH.A0E();
        } else {
            A0E = new LinkedHashMap(AnonymousClass005.A0C(paymentOptions));
            for (WalletPaymentOption walletPaymentOption : paymentOptions) {
                A0E.put(getKey(walletPaymentOption), walletPaymentOption);
            }
        }
        List<WalletPaymentOption> list = walletCatalog.paymentOptions;
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (WalletPaymentOption walletPaymentOptionCopy$default : list) {
            WalletPaymentOption walletPaymentOption2 = (WalletPaymentOption) A0E.get(getKey(walletPaymentOptionCopy$default));
            boolean z = walletPaymentOption2 != null ? walletPaymentOption2.isEligible : walletPaymentOptionCopy$default.isEligible;
            if (z != walletPaymentOptionCopy$default.isEligible) {
                walletPaymentOptionCopy$default = WalletPaymentOption.copy$default(walletPaymentOptionCopy$default, null, null, null, null, null, null, null, z, null, 383, null);
            }
            arrayListA0m.add(walletPaymentOptionCopy$default);
        }
        return arrayListA0m;
    }

    public static final WalletPaymentOption findOption(List<WalletPaymentMethodGroup> list, WalletOptionKey walletOptionKey) {
        Object obj;
        WalletPaymentMethodGroup next;
        AHD<WalletPaymentOption> ahd;
        Iterator<WalletPaymentMethodGroup> it = list.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (C7384Etj.areEqual(next.paymentMethod, walletOptionKey.paymentMethod)) {
                break;
            }
        }
        WalletPaymentMethodGroup walletPaymentMethodGroup = next;
        if (walletPaymentMethodGroup == null || (ahd = walletPaymentMethodGroup.paymentOptions) == null) {
            return null;
        }
        Iterator it2 = ahd.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (C7384Etj.areEqual(((WalletPaymentOption) next2).paymentId, walletOptionKey.paymentId)) {
                obj = next2;
                break;
            }
        }
        return (WalletPaymentOption) obj;
    }

    public static final AHD<WalletPaymentMethodGroup> groupByPaymentMethod(List<WalletPaymentOption> list) {
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (WalletPaymentOption walletPaymentOption : list) {
            String str = walletPaymentOption.paymentMethod;
            Object objA0h = linkedHashMapA0j.get(str);
            if (objA0h == null) {
                objA0h = C3cG.A0h();
                linkedHashMapA0j.put(str, objA0h);
            }
            ((List) objA0h).add(walletPaymentOption);
        }
        ArrayList arrayList = new ArrayList(linkedHashMapA0j.size());
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            String str2 = (String) entryA0l.getKey();
            List list2 = (List) entryA0l.getValue();
            ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(((WalletPaymentOption) it.next()).displayName);
            }
            arrayList.add(new WalletPaymentMethodGroup(str2, (String) AbstractC0878AGe.A0K(C3cG.A0m(arrayListA0i)), AGI.A07(list2)));
        }
        return AGI.A07(arrayList);
    }
}
