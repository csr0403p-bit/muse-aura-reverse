package com.facebook.aura.flights;

import X.ADq;
import X.AEs;
import X.AGH;
import X.AbstractC0878AGe;
import X.AbstractC0885AGm;
import X.AbstractC3358CGz;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass006;
import X.C3cG;
import X.C7384Etj;
import com.facebook.aura.common.mvvm.AuraViewModelFactory;
import com.facebook.aura.conversation.view.FlightOfferBookingRequest;
import com.facebook.aura.flights.FlightDetailPrimaryAction;
import com.facebook.aura.model.FlightRowData;
import com.facebook.aura.model.FlightRowSlice;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class FlightDetailViewModel extends AEs {
    public static final int $stable = 8;
    public final FlightDetail detail;
    public final String sessionId;

    public final class Factory extends AuraViewModelFactory<FlightDetailViewModel> {
        public static final int $stable = 8;
        public final FlightDetailScreenKey key;
        public final AbstractC3358CGz userSession;

        private final FlightFarePrice farePrice(FlightRowData flightRowData, boolean z) {
            if (z) {
                String str = flightRowData.fromPricePerPassenger;
                if (str != null) {
                    return new FlightFarePrice(str, true, true);
                }
                String str2 = flightRowData.fromPrice;
                if (str2 != null) {
                    return new FlightFarePrice(str2, false, true);
                }
                return null;
            }
            String str3 = flightRowData.pricePerPassenger;
            if (str3 != null) {
                return new FlightFarePrice(str3, true, false);
            }
            String str4 = flightRowData.price;
            if (str4 != null) {
                return new FlightFarePrice(str4, false, false);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0014  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private final com.facebook.aura.flights.FlightDetail flightDetail(com.facebook.aura.flights.FlightResults r9, com.facebook.aura.model.FlightRowData r10) {
            /*
                r8 = this;
                r3 = r9
                com.facebook.aura.flights.FlightSelectionStage r1 = r9.stage
                com.facebook.aura.flights.FlightSelectionStage r0 = com.facebook.aura.flights.FlightSelectionStage.DEPARTING
                boolean r2 = X.AnonymousClass002.A1Z(r1, r0)
                com.facebook.aura.flights.FlightDetailScreenKey r0 = r8.key
                boolean r0 = r0.booking
                if (r0 != 0) goto L14
                com.facebook.aura.flights.FlightSelectionStage r0 = com.facebook.aura.flights.FlightSelectionStage.COMPLETE
                r9 = 1
                if (r1 != r0) goto L15
            L14:
                r9 = 0
            L15:
                r4 = r10
                java.lang.String r1 = r10.ctaText
                r5 = 0
                if (r1 == 0) goto L4f
                java.lang.String r0 = r10.responseMessage
                int r0 = r0.length()
                if (r0 <= 0) goto L4f
            L23:
                if (r9 == 0) goto L47
                if (r2 != 0) goto L47
                com.facebook.aura.flights.FlightDetailPrimaryAction$ReviewBooking r5 = com.facebook.aura.flights.FlightDetailPrimaryAction.ReviewBooking.INSTANCE
            L29:
                com.facebook.aura.flights.FlightDetailPrimaryAction r5 = (com.facebook.aura.flights.FlightDetailPrimaryAction) r5
                java.util.Map r6 = r8.changeTargets(r3, r10)
                int r1 = r3.getFocusSliceIndex()
                java.util.List<com.facebook.aura.model.FlightRowSlice> r0 = r10.slices
                X.ADq r0 = X.AbstractC0885AGm.A12(r0)
                int r7 = X.ATD.A06(r0, r1)
                com.facebook.aura.flights.FlightFarePrice r8 = r8.farePrice(r10, r2)
                com.facebook.aura.flights.FlightDetail r2 = new com.facebook.aura.flights.FlightDetail
                r2.<init>(r3, r4, r5, r6, r7, r8, r9)
                return r2
            L47:
                if (r1 == 0) goto L29
                com.facebook.aura.flights.FlightDetailPrimaryAction$SendSelection r5 = new com.facebook.aura.flights.FlightDetailPrimaryAction$SendSelection
                r5.<init>(r1)
                goto L29
            L4f:
                r1 = r5
                goto L23
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.flights.FlightDetailViewModel.Factory.flightDetail(com.facebook.aura.flights.FlightResults, com.facebook.aura.model.FlightRowData):com.facebook.aura.flights.FlightDetail");
        }

        private final Map<Integer, String> changeTargets(FlightResults flightResults, FlightRowData flightRowData) {
            String str;
            if (flightResults.stage == FlightSelectionStage.DEPARTING) {
                return AGH.A0E();
            }
            ADq aDqA12 = AbstractC0885AGm.A12(flightRowData.slices);
            LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass005.A0C(aDqA12));
            Iterator<Integer> it = aDqA12.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                next.intValue();
                linkedHashMap.put(next, flightResults.presentationId);
            }
            if (flightResults.stage != FlightSelectionStage.RETURNING) {
                return linkedHashMap;
            }
            FlightResults flightResultsDepartingOptionsFor = FlightResultsRepository.Companion.getInstance(this.userSession).departingOptionsFor((FlightRowSlice) AbstractC0878AGe.A0F(flightRowData.slices));
            if (flightResultsDepartingOptionsFor == null || (str = flightResultsDepartingOptionsFor.presentationId) == null) {
                str = flightResults.presentationId;
            }
            return AnonymousClass006.A11(0, str, linkedHashMap);
        }

        @Override // com.facebook.aura.common.mvvm.AuraViewModelFactory
        public FlightDetailViewModel create() {
            FlightRowData flightRowData;
            List<FlightRowData> list;
            FlightRowData next;
            FlightResults flightResults = FlightResultsRepository.Companion.getInstance(this.userSession).get(this.key.presentationId);
            FlightDetail flightDetail = null;
            if (flightResults == null || (list = flightResults.offers) == null) {
                flightRowData = null;
            } else {
                Iterator<FlightRowData> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    FlightRowData flightRowData2 = next;
                    if (C7384Etj.areEqual(flightRowData2.id, this.key.offerId) && !flightRowData2.slices.isEmpty()) {
                        break;
                    }
                }
                flightRowData = next;
            }
            String str = this.key.sessionId;
            if (flightResults != null && flightRowData != null) {
                flightDetail = flightDetail(flightResults, flightRowData);
            }
            return new FlightDetailViewModel(str, flightDetail);
        }

        public Factory(FlightDetailScreenKey flightDetailScreenKey, AbstractC3358CGz abstractC3358CGz) {
            AnonymousClass003.A0u(flightDetailScreenKey, abstractC3358CGz);
            this.key = flightDetailScreenKey;
            this.userSession = abstractC3358CGz;
        }
    }

    public FlightDetailViewModel(String str, FlightDetail flightDetail) {
        C7384Etj.A0Y(str, 0);
        this.sessionId = str;
        this.detail = flightDetail;
    }

    private final void sendSelection(FlightRowData flightRowData) {
        FlightOfferBookingRequest.INSTANCE.stageOffer(this.sessionId, flightRowData.id, flightRowData.responseMessage);
    }

    public final FlightDetail getDetail() {
        return this.detail;
    }

    public final FlightDetailNavigation onPrimaryAction() {
        FlightDetail flightDetail = this.detail;
        FlightDetailPrimaryAction flightDetailPrimaryAction = flightDetail != null ? flightDetail.primaryAction : null;
        if (flightDetailPrimaryAction instanceof FlightDetailPrimaryAction.SendSelection) {
            sendSelection(flightDetail.offer);
            return FlightDetailNavigation.CLOSE_FLOW;
        }
        if (C7384Etj.areEqual(flightDetailPrimaryAction, FlightDetailPrimaryAction.ReviewBooking.INSTANCE)) {
            return FlightDetailNavigation.OPEN_BOOKING;
        }
        if (flightDetailPrimaryAction != null) {
            throw C3cG.A0q();
        }
        return null;
    }
}
