package com.facebook.aura.gateway;

import X.AbstractC0878AGe;
import X.AnonymousClass003;
import X.C0881AGi;
import X.C3cG;
import X.C60Q;
import X.C7384Etj;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import com.facebook.aura.gateway.parser.HatchWidgetTokenParser;
import com.facebook.aura.model.HatchMessage;
import com.facebook.aura.model.HatchMessageRole;
import com.facebook.aura.model.HatchWidgetPresentation;
import com.facebook.aura.model.HatchWidgetPresentationKt;
import com.facebook.aura.model.WidgetPresentationData;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class HatchPresentationTokenBinderKt {
    public static final List<HatchWidgetPresentation> mergeWidgetPresentation(List<HatchWidgetPresentation> list, HatchWidgetPresentation hatchWidgetPresentation) {
        C7384Etj.A0Y(hatchWidgetPresentation, 1);
        if (list == null) {
            list = C0881AGi.A00;
        }
        ArrayList arrayListA0R = AbstractC0878AGe.A0R(list);
        Iterator it = arrayListA0R.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!C7384Etj.areEqual(((HatchWidgetPresentation) it.next()).presentationId, hatchWidgetPresentation.presentationId)) {
                i++;
            } else if (i >= 0) {
                arrayListA0R.set(i, HatchWidgetPresentationKt.preserveWidgetPresentationState((HatchWidgetPresentation) arrayListA0R.get(i), hatchWidgetPresentation));
            }
        }
        arrayListA0R.add(hatchWidgetPresentation);
        return AbstractC0878AGe.A0c(arrayListA0R, new Comparator() { // from class: com.facebook.aura.gateway.HatchPresentationTokenBinderKt$mergeWidgetPresentation$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                Long l = ((HatchWidgetPresentation) t).seq;
                long jLongValue = LinkEncryptedPairingKt.LINK_COUNTER_MAX;
                Long lValueOf = Long.valueOf(l != null ? l.longValue() : LinkEncryptedPairingKt.LINK_COUNTER_MAX);
                Long l2 = ((HatchWidgetPresentation) t2).seq;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                return C60Q.A01(lValueOf, jLongValue);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List<com.facebook.aura.model.HatchMessage>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    public static final List<HatchMessage> bindWidgetPresentationsToTokenHosts(List<HatchMessage> list) {
        ?? A0i = list;
        C7384Etj.A0Y(A0i, 0);
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (HatchMessage hatchMessage : A0i) {
            if (hatchMessage.role == HatchMessageRole.AGENT) {
                String str = hatchMessage.content;
                if (str.length() != 0) {
                    Iterator<String> it = HatchWidgetTokenParser.INSTANCE.extractTokenIds(str).iterator();
                    while (it.hasNext()) {
                        linkedHashMapA0j.putIfAbsent(it.next(), hatchMessage.id);
                    }
                }
            }
        }
        if (!linkedHashMapA0j.isEmpty()) {
            LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
            ArrayList<HatchMessage> arrayListA0h = C3cG.A0h();
            for (HatchMessage hatchMessageCopy$default : A0i) {
                List<HatchWidgetPresentation> list2 = hatchMessageCopy$default.presentations;
                if (list2 != null && !list2.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (HatchWidgetPresentation hatchWidgetPresentation : list2) {
                        String str2 = (String) linkedHashMapA0j.get(hatchWidgetPresentation.presentationId);
                        if (!(hatchWidgetPresentation.data instanceof WidgetPresentationData) || str2 == null || str2.equals(hatchMessageCopy$default.id)) {
                            arrayList.add(hatchWidgetPresentation);
                        } else {
                            Object arrayList2 = linkedHashMapA0j2.get(str2);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                                linkedHashMapA0j2.put(str2, arrayList2);
                            }
                            ((List) arrayList2).add(HatchWidgetPresentation.copy$default(hatchWidgetPresentation, null, null, null, null, str2, null, null, null, null, null, false, 2031, null));
                        }
                    }
                    if (!arrayList.isEmpty() || hatchMessageCopy$default.content.length() != 0 || hatchMessageCopy$default.transcript != null) {
                        hatchMessageCopy$default = HatchMessage.copy$default(hatchMessageCopy$default, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, arrayList.isEmpty() ? null : arrayList, false, null, null, false, null, -268435457, 3, null);
                        if (hatchMessageCopy$default != null) {
                        }
                    }
                }
                arrayListA0h.add(hatchMessageCopy$default);
            }
            if (!linkedHashMapA0j2.isEmpty()) {
                A0i = AnonymousClass003.A0i(arrayListA0h);
                for (HatchMessage hatchMessageCopy$default2 : arrayListA0h) {
                    List list3 = (List) linkedHashMapA0j2.get(hatchMessageCopy$default2.id);
                    if (list3 != null) {
                        List<HatchWidgetPresentation> listMergeWidgetPresentation = hatchMessageCopy$default2.presentations;
                        Iterator it2 = list3.iterator();
                        while (it2.hasNext()) {
                            listMergeWidgetPresentation = mergeWidgetPresentation(listMergeWidgetPresentation, (HatchWidgetPresentation) it2.next());
                        }
                        hatchMessageCopy$default2 = HatchMessage.copy$default(hatchMessageCopy$default2, null, null, null, 0L, null, null, null, null, null, null, null, null, null, null, false, null, null, false, null, null, null, null, null, null, null, null, null, null, listMergeWidgetPresentation, false, null, null, false, null, -268435457, 3, null);
                    }
                    A0i.add(hatchMessageCopy$default2);
                }
            }
        }
        return A0i;
    }

    public static final String findWidgetTokenHostMessageId(Iterable<HatchMessage> iterable, HatchWidgetPresentation hatchWidgetPresentation) {
        HatchMessage next;
        AnonymousClass003.A0u(iterable, hatchWidgetPresentation);
        if (!(hatchWidgetPresentation.data instanceof WidgetPresentationData)) {
            return null;
        }
        Iterator<HatchMessage> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            HatchMessage hatchMessage = next;
            if (hatchMessage.role == HatchMessageRole.AGENT && HatchWidgetTokenParser.INSTANCE.extractTokenIds(hatchMessage.content).contains(hatchWidgetPresentation.presentationId)) {
                break;
            }
        }
        HatchMessage hatchMessage2 = next;
        if (hatchMessage2 != null) {
            return hatchMessage2.id;
        }
        return null;
    }
}
