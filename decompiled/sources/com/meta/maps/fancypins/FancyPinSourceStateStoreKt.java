package com.meta.maps.fancypins;

import X.AnonymousClass006;
import X.C3cI;
import X.C60O;
import X.C60Q;
import X.C7354EnR;
import X.C7438Evz;
import X.C8j3;
import X.G0U;
import com.facebook.aura.ageverification.intf.AgeCheckFunnelLogging;
import com.meta.maps.fancypins.OwnedLayout;
import com.meta.maps.fancypins.OwnedMeasurement;
import com.meta.maps.fancypins.OwnedPin;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes6.dex */
public abstract class FancyPinSourceStateStoreKt {

    /* renamed from: com.meta.maps.fancypins.FancyPinSourceStateStoreKt$ownedLayoutsById$2, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass2 extends C7438Evz implements G0U<PinLayout, OwnedLayout> {
        public AnonymousClass2(Object obj) {
            super(1, obj, OwnedLayout.Companion.class, "from", "from(Lcom/meta/maps/fancypins/PinLayout;)Lcom/meta/maps/fancypins/OwnedLayout;", 0);
        }

        @Override // X.G0U
        public final OwnedLayout invoke(PinLayout pinLayout) {
            return ((OwnedLayout.Companion) AnonymousClass006.A0o(pinLayout, this)).from(pinLayout);
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinSourceStateStoreKt$ownedMeasurementsById$2, reason: invalid class name and case insensitive filesystem */
    public final /* synthetic */ class C144892 extends C7438Evz implements G0U<PinMeasurement, OwnedMeasurement> {
        public C144892(Object obj) {
            super(1, obj, OwnedMeasurement.Companion.class, "from", "from(Lcom/meta/maps/fancypins/PinMeasurement;)Lcom/meta/maps/fancypins/OwnedMeasurement;", 0);
        }

        @Override // X.G0U
        public final OwnedMeasurement invoke(PinMeasurement pinMeasurement) {
            return ((OwnedMeasurement.Companion) AnonymousClass006.A0o(pinMeasurement, this)).from(pinMeasurement);
        }
    }

    /* renamed from: com.meta.maps.fancypins.FancyPinSourceStateStoreKt$ownedPinsById$3, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass3 extends C7438Evz implements G0U<FancyPin, OwnedPin> {
        public AnonymousClass3(Object obj) {
            super(1, obj, OwnedPin.Companion.class, "from", "from(Lcom/meta/maps/fancypins/FancyPin;)Lcom/meta/maps/fancypins/OwnedPin;", 0);
        }

        @Override // X.G0U
        public final OwnedPin invoke(FancyPin fancyPin) {
            return ((OwnedPin.Companion) AnonymousClass006.A0o(fancyPin, this)).from(fancyPin);
        }
    }

    public static final LinkedHashMap<String, OwnedLayout> ownedLayoutsById(List<PinLayout> list) {
        return uniqueById(list, new C7354EnR() { // from class: com.meta.maps.fancypins.FancyPinSourceStateStoreKt.ownedLayoutsById.1
            @Override // X.C7354EnR, X.InterfaceC7356EnT
            public Object get(Object obj) {
                return ((PinLayout) obj).id;
            }
        }, AgeCheckFunnelLogging.KEY_LAYOUT, new AnonymousClass2(OwnedLayout.Companion));
    }

    public static final LinkedHashMap<String, OwnedMeasurement> ownedMeasurementsById(List<PinMeasurement> list) {
        return uniqueById(list, new C7354EnR() { // from class: com.meta.maps.fancypins.FancyPinSourceStateStoreKt.ownedMeasurementsById.1
            @Override // X.C7354EnR, X.InterfaceC7356EnT
            public Object get(Object obj) {
                return ((PinMeasurement) obj).id;
            }
        }, "measurement", new C144892(OwnedMeasurement.Companion));
    }

    public static final void validateSourcePinId(String str) {
        if (FancyPinRuntimeClusterId.INSTANCE.isRuntimeClusterId(str)) {
            throw C60Q.A0V("FancyPin source id '", str, "' uses the reserved cluster namespace");
        }
    }

    public static final LinkedHashMap<String, OwnedPin> ownedPinsById(List<FancyPin> list) {
        Iterator<FancyPin> it = list.iterator();
        while (it.hasNext()) {
            validateSourcePinId(it.next().id);
        }
        return uniqueById(list, new C7354EnR() { // from class: com.meta.maps.fancypins.FancyPinSourceStateStoreKt.ownedPinsById.2
            @Override // X.C7354EnR, X.InterfaceC7356EnT
            public Object get(Object obj) {
                return ((FancyPin) obj).id;
            }
        }, "pin", new AnonymousClass3(OwnedPin.Companion));
    }

    public static final <Value, Id, Owned> LinkedHashMap<Id, Owned> uniqueById(List<? extends Value> list, G0U<? super Value, ? extends Id> g0u, String str, G0U<? super Value, ? extends Owned> g0u2) {
        LinkedHashMap<Id, Owned> linkedHashMapA15 = C60O.A15(list.size());
        for (Value value : list) {
            Id idInvoke = g0u.invoke(value);
            if (linkedHashMapA15.put(idInvoke, g0u2.invoke(value)) != null) {
                StringBuilder sbA0x = C3cI.A0x("Duplicate FancyPin ", str);
                sbA0x.append(" id '");
                sbA0x.append(idInvoke);
                throw C8j3.A0w("'", sbA0x);
            }
        }
        return linkedHashMapA15;
    }
}
