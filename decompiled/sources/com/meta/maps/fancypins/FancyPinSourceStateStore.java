package com.meta.maps.fancypins;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C0881AGi;
import X.C3cG;
import X.C7384Etj;
import X.C9jH;
import com.facebook.aura.devices.pairing.LinkEncryptedPairingKt;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class FancyPinSourceStateStore {
    public FancyPinSourceState current = FancyPinSourceState.EMPTY;

    public final FancyPinSourceState adding(List<FancyPin> list) {
        C7384Etj.A0Y(list, 0);
        return this.current.adding(list);
    }

    public final void commit(FancyPinSourceState fancyPinSourceState) {
        C7384Etj.A0Y(fancyPinSourceState, 0);
        this.current = fancyPinSourceState;
    }

    public final FancyPinSourceState removing(List<String> list) {
        C7384Etj.A0Y(list, 0);
        return this.current.removing(list);
    }

    public final FancyPinSourceState updating(List<FancyPin> list) {
        C7384Etj.A0Y(list, 0);
        return this.current.updating(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FancyPinSourceState replacement$default(FancyPinSourceStateStore fancyPinSourceStateStore, List list, List list2, List list3, List list4, Map map, Map map2, Map map3, Map map4, int i, Object obj) {
        if ((i & 4) != 0) {
            list3 = C0881AGi.A00;
        }
        if ((i & 8) != 0) {
            list4 = C0881AGi.A00;
        }
        if ((i & 16) != 0) {
            map = C9jH.A00;
        }
        if ((i & 32) != 0) {
            map2 = C9jH.A00;
        }
        if ((i & 64) != 0) {
            map3 = C9jH.A00;
        }
        if ((i & 128) != 0) {
            map4 = C9jH.A00;
        }
        return fancyPinSourceStateStore.replacement(list, list2, list3, list4, map, map2, map3, map4);
    }

    public final FancyPinSourceState getCurrent() {
        return this.current;
    }

    public final FancyPinSourceState replacement(List<FancyPin> list, List<FancyPinBlueprint> list2, List<PinMeasurement> list3, List<PinLayout> list4, Map<String, String> map, Map<String, Integer> map2, Map<String, Float> map3, Map<String, Long> map4) {
        AnonymousClass005.A17(list, list2, list3, list4, map);
        AnonymousClass003.A0z(map2, map3);
        C7384Etj.A0Y(map4, 7);
        long j = this.current.catalogGeneration;
        if (j != LinkEncryptedPairingKt.LINK_COUNTER_MAX) {
            return FancyPinSourceState.Companion.create(j + 1, list, list2, list3, list4, map, map2, map3, map4);
        }
        throw C3cG.A0Q("FancyPin catalog generation overflow");
    }
}
