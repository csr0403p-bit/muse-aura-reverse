package com.facebook.aura.agentpermission;

import X.AEs;
import X.AEu;
import X.AbstractC0882AGj;
import X.AbstractC3358CGz;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass441;
import X.C1BN;
import X.C3Ek;
import X.C3cG;
import X.C3cH;
import X.G0V;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.gateway.HatchAgentPermissionsRepository;
import com.facebook.aura.localbrowser.core.BrowserOperationCatalogKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class FlightCheckoutPassengerViewModel extends AEs {
    public static final int $stable = 8;
    public final String approvalId;
    public final int passengerIndex;
    public final HatchAgentPermissionsRepository repository;
    public final C1BN<FlightCheckoutPassengerUiState> uiState;

    public final class Factory extends AuraViewModelFactory<FlightCheckoutPassengerViewModel> {
        public static final int $stable = 8;
        public final String approvalId;
        public final int passengerIndex;
        public final AbstractC3358CGz userSession;

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public FlightCheckoutPassengerViewModel create() {
            return new FlightCheckoutPassengerViewModel(this.userSession, this.approvalId, this.passengerIndex);
        }

        public Factory(AbstractC3358CGz abstractC3358CGz, String str, int i) {
            AnonymousClass003.A0u(abstractC3358CGz, str);
            this.userSession = abstractC3358CGz;
            this.approvalId = str;
            this.passengerIndex = i;
        }
    }

    private final List<FlightCheckoutPassengerBag> bags(HatchAgentPermissionsRepository.FlightCheckoutApproval flightCheckoutApproval, G0V<? super Integer, ? super String, Boolean> g0v) {
        FlightCheckoutBagType flightCheckoutBagType;
        int i;
        List<HatchAgentPermissionsRepository.FlightCheckoutSlice> list = flightCheckoutApproval.slices;
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator<HatchAgentPermissionsRepository.FlightCheckoutSlice> it = list.iterator();
        while (it.hasNext()) {
            AbstractC0882AGj.A0r(it.next().segments, arrayListA0h);
        }
        ArrayList arrayListA0h2 = C3cG.A0h();
        Iterator it2 = arrayListA0h.iterator();
        while (it2.hasNext()) {
            AbstractC0882AGj.A0r(((HatchAgentPermissionsRepository.FlightCheckoutSegment) it2.next()).baggage, arrayListA0h2);
        }
        ArrayList arrayListA0h3 = C3cG.A0h();
        for (Object obj : arrayListA0h2) {
            HatchAgentPermissionsRepository.FlightCheckoutBaggage flightCheckoutBaggage = (HatchAgentPermissionsRepository.FlightCheckoutBaggage) obj;
            if (AnonymousClass001.A1X(g0v.invoke(flightCheckoutBaggage.passengerIndex, flightCheckoutBaggage.passengerName))) {
                arrayListA0h3.add(obj);
            }
        }
        LinkedHashMap linkedHashMapA0j = C3cG.A0j();
        for (Object obj2 : arrayListA0h3) {
            String str = ((HatchAgentPermissionsRepository.FlightCheckoutBaggage) obj2).type;
            Object objA0h = linkedHashMapA0j.get(str);
            if (objA0h == null) {
                objA0h = C3cG.A0h();
                linkedHashMapA0j.put(str, objA0h);
            }
            ((List) objA0h).add(obj2);
        }
        ArrayList arrayListA0h4 = C3cG.A0h();
        Iterator itA0i = C3cG.A0i(linkedHashMapA0j);
        while (itA0i.hasNext()) {
            Map.Entry entryA0l = C3cH.A0l(itA0i);
            Object key = entryA0l.getKey();
            List list2 = (List) entryA0l.getValue();
            if ("carry_on".equals(key)) {
                flightCheckoutBagType = FlightCheckoutBagType.CARRY_ON;
            } else if (BrowserOperationCatalogKt.CHECKED.equals(key)) {
                flightCheckoutBagType = FlightCheckoutBagType.CHECKED;
            } else {
                continue;
            }
            Iterator it3 = list2.iterator();
            if (!it3.hasNext()) {
                throw new NoSuchElementException();
            }
            int i2 = ((HatchAgentPermissionsRepository.FlightCheckoutBaggage) it3.next()).quantity;
            while (true) {
                i = i2;
                while (it3.hasNext()) {
                    i2 = ((HatchAgentPermissionsRepository.FlightCheckoutBaggage) it3.next()).quantity;
                    if (i < i2) {
                        break;
                    }
                }
            }
            arrayListA0h4.add(new FlightCheckoutPassengerBag(flightCheckoutBagType, i));
        }
        return arrayListA0h4;
    }

    private final boolean hasTitle(HatchAgentPermissionsRepository.FlightCheckoutSlice flightCheckoutSlice) {
        String str;
        String str2 = flightCheckoutSlice.originDisplayName;
        if (str2 != null && CheckoutRowPrimitivesKt.trimToNonEmpty(str2) != null && (str = flightCheckoutSlice.destinationDisplayName) != null && CheckoutRowPrimitivesKt.trimToNonEmpty(str) != null) {
            return true;
        }
        String str3 = flightCheckoutSlice.title;
        return (str3 == null || CheckoutRowPrimitivesKt.trimToNonEmpty(str3) == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.util.List<com.facebook.aura.agentpermission.FlightCheckoutPassengerSeat> seats(com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutApproval r19, X.G0V<? super java.lang.Integer, ? super java.lang.String, java.lang.Boolean> r20) {
        /*
            r18 = this;
            r0 = r19
            java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutSlice> r0 = r0.slices
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r8 = r0.iterator()
        Lc:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r11 = r8.next()
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutSlice r11 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutSlice) r11
            java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutSegment> r0 = r11.segments
            java.util.ArrayList r2 = X.C3cG.A0h()
            java.util.Iterator r7 = r0.iterator()
        L22:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L8c
            java.lang.Object r4 = r7.next()
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutSegment r4 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutSegment) r4
            java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutSeatAssignment> r0 = r4.seatAssignments
            java.util.Iterator r6 = r0.iterator()
        L34:
            boolean r0 = r6.hasNext()
            r14 = 0
            if (r0 == 0) goto L8a
            java.lang.Object r5 = r6.next()
            r0 = r5
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutSeatAssignment r0 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutSeatAssignment) r0
            java.lang.Integer r1 = r0.passengerIndex
            java.lang.String r0 = r0.passengerName
            r9 = r20
            java.lang.Object r0 = r9.invoke(r1, r0)
            boolean r0 = X.AnonymousClass001.A1X(r0)
            if (r0 == 0) goto L34
        L52:
            com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutSeatAssignment r5 = (com.facebook.aura.gateway.HatchAgentPermissionsRepository.FlightCheckoutSeatAssignment) r5
            if (r5 == 0) goto L22
            java.lang.String r0 = r4.title
            if (r0 == 0) goto L88
            java.lang.String r10 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
            if (r10 != 0) goto L69
        L60:
            r0 = r18
            boolean r0 = r0.hasTitle(r11)
            if (r0 != 0) goto L69
            goto L22
        L69:
            java.lang.String r12 = r5.designator
            java.lang.String r13 = r5.cabinLabel
            java.lang.String r0 = r4.airlineIconUrl
            if (r0 == 0) goto L75
            java.lang.String r14 = com.facebook.aura.agentpermission.CheckoutRowPrimitivesKt.trimToNonEmpty(r0)
        L75:
            java.lang.String r15 = r4.carrierName
            java.lang.String r1 = r4.flightNumber
            java.time.LocalDate r0 = r4.departingDate
            com.facebook.aura.agentpermission.FlightCheckoutPassengerSeat r9 = new com.facebook.aura.agentpermission.FlightCheckoutPassengerSeat
            r16 = r1
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r2.add(r9)
            goto L22
        L88:
            r10 = r14
            goto L60
        L8a:
            r5 = r14
            goto L52
        L8c:
            X.AbstractC0882AGj.A0r(r2, r3)
            goto Lc
        L91:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.FlightCheckoutPassengerViewModel.seats(com.facebook.aura.gateway.HatchAgentPermissionsRepository$FlightCheckoutApproval, X.G0V):java.util.List");
    }

    public final C1BN<FlightCheckoutPassengerUiState> getUiState() {
        return this.uiState;
    }

    public FlightCheckoutPassengerViewModel(AbstractC3358CGz abstractC3358CGz, String str, int i) {
        AnonymousClass003.A0u(abstractC3358CGz, str);
        this.approvalId = str;
        this.passengerIndex = i;
        HatchAgentPermissionsRepository companion = HatchAgentPermissionsRepository.Companion.getInstance(abstractC3358CGz);
        this.repository = companion;
        FlightCheckoutPassengerViewModel$special$$inlined$map$1 flightCheckoutPassengerViewModel$special$$inlined$map$1 = new FlightCheckoutPassengerViewModel$special$$inlined$map$1(companion.pendingApprovals, this);
        this.uiState = AnonymousClass441.A00(uiStateFor(companion.pendingApprovals.getValue()), AEu.A00(this), flightCheckoutPassengerViewModel$special$$inlined$map$1, C3Ek.A00);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[LOOP:2: B:26:0x0062->B:28:0x0068, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.aura.agentpermission.FlightCheckoutPassengerUiState uiStateFor(java.util.List<com.facebook.aura.gateway.HatchAgentPermissionsRepository.AgentPermissionApproval> r11) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.agentpermission.FlightCheckoutPassengerViewModel.uiStateFor(java.util.List):com.facebook.aura.agentpermission.FlightCheckoutPassengerUiState");
    }
}
