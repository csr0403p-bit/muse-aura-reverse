package com.meta.maps.fancypins;

import X.AnonymousClass005;
import X.C06H;
import X.C3cG;
import X.C7384Etj;
import X.C9jH;
import X.FGI;
import android.util.Log;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinMeasurer {
    public static final Companion Companion = new Companion();

    @Deprecated
    public static final String TAG = "FancyPinMeasurer";
    public final FancyPinPartRegistrationSnapshot registrations;

    public FancyPinMeasurer(FancyPinPartRegistrationSnapshot fancyPinPartRegistrationSnapshot) {
        C7384Etj.A0Y(fancyPinPartRegistrationSnapshot, 0);
        this.registrations = fancyPinPartRegistrationSnapshot;
    }

    public final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(C06H c06h) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List measure$default(FancyPinMeasurer fancyPinMeasurer, List list, Map map, Map map2, int i, Object obj) {
        if ((i & 4) != 0) {
            map2 = C9jH.A00;
        }
        return fancyPinMeasurer.measure(list, map, map2);
    }

    public final List<PinMeasurement> measure(List<FancyPin> list, Map<String, FancyPinBlueprint> map, Map<String, FancyPinRuntimeClusterContext> map2) {
        FancyPinErasedPartRegistration fancyPinErasedPartRegistrationRegistration;
        AnonymousClass005.A0x(list, map, map2);
        ArrayList arrayListA0h = C3cG.A0h();
        for (FancyPin fancyPin : list) {
            FancyPinBlueprint fancyPinBlueprint = map.get(fancyPin.blueprintId);
            if (fancyPinBlueprint != null) {
                Map<String, Object> mapDecodeProperties = FancyPinMeasurerKt.decodeProperties(fancyPin);
                LinkedHashMap linkedHashMapA0j = C3cG.A0j();
                for (FancyPinVariant fancyPinVariant : fancyPinBlueprint.variants) {
                    LinkedHashMap linkedHashMapA0j2 = C3cG.A0j();
                    for (FancyPinPart fancyPinPart : fancyPinVariant.parts) {
                        if (fancyPinPart.size.constraint == SizeConstraint.AUTO && (fancyPinErasedPartRegistrationRegistration = this.registrations.registration(fancyPinBlueprint.id, fancyPinPart.id)) != null) {
                            LayoutSize layoutSize = fancyPinPart.size;
                            SizeF sizeF = new SizeF(FancyPinMeasurerKt.toConstraint(layoutSize.width), FancyPinMeasurerKt.toConstraint(layoutSize.height));
                            SizeF sizeFMeasure = fancyPinErasedPartRegistrationRegistration.measure(new FancyPinPartResolveContext(fancyPinPart.attachedConfig, fancyPinPart.style, mapDecodeProperties, map2.get(fancyPin.id)), sizeF);
                            if (sizeFMeasure == null || !FancyPinMeasurerKt.isValidWithin(sizeFMeasure, sizeF)) {
                                Log.e(TAG, FGI.A0h("FancyPins: Auto-sized part '", fancyPinPart.id, "' returned an invalid size for pin '", fancyPin.id, "'"));
                            } else {
                                String str = fancyPinPart.id;
                                linkedHashMapA0j2.put(str, new PartMeasurement(str, sizeFMeasure.getWidth(), sizeFMeasure.getHeight()));
                            }
                        }
                    }
                    String str2 = fancyPinVariant.id;
                    linkedHashMapA0j.put(str2, new VariantMeasurement(str2, linkedHashMapA0j2));
                }
                arrayListA0h.add(new PinMeasurement(fancyPin.id, linkedHashMapA0j));
            }
        }
        return arrayListA0h;
    }
}
