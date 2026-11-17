package com.facebook.aura.overlay.api;

import X.AGI;
import X.AHD;
import X.AHI;
import X.AbstractC0878AGe;
import X.AbstractC3358CGz;
import X.BLG;
import X.C06H;
import X.C1BN;
import X.C3Pi;
import X.C7384Etj;
import X.C9286GCn;
import X.HnJ;
import X.InterfaceC7549F2g;
import com.facebook.aura.navigation.AuraNavKey;
import java.util.Comparator;

/* loaded from: classes2.dex */
public final class OverlayApi implements InterfaceC7549F2g {
    public static final Companion Companion = new Companion();
    public final BLG<AHD<AuraNavKey>> _activeOverlays;
    public final C1BN<AHD<AuraNavKey>> activeOverlays;

    public final void hideOverlay(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        removeKey(this._activeOverlays, auraNavKey);
    }

    public final void showOverlay(AuraNavKey auraNavKey) {
        C7384Etj.A0Y(auraNavKey, 0);
        addKey(this._activeOverlays, auraNavKey);
    }

    @Override // X.InterfaceC7549F2g
    public void clearUserData() {
        this._activeOverlays.Af8(AHI.A01);
    }

    public final C1BN<AHD<AuraNavKey>> getActiveOverlays() {
        return this.activeOverlays;
    }

    public final class Companion {
        public final OverlayApi getInstance(AbstractC3358CGz abstractC3358CGz) {
            C7384Etj.A0Y(abstractC3358CGz, 0);
            return (OverlayApi) abstractC3358CGz.A03(OverlayApi.class, OverlayApi$Companion$getInstance$1.INSTANCE);
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }

    private final void addKey(BLG<AHD<AuraNavKey>> blg, AuraNavKey auraNavKey) {
        AHD<AuraNavKey> value;
        if (blg.getValue().contains(auraNavKey)) {
            return;
        }
        do {
            value = blg.getValue();
        } while (!blg.A6e(value, AGI.A0C(AbstractC0878AGe.A0c(AbstractC0878AGe.A0Q(auraNavKey, value), new Comparator() { // from class: com.facebook.aura.overlay.api.OverlayApi$addKey$lambda$0$$inlined$sortedByDescending$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return Integer.valueOf(this.this$0.getOverlayPriority((AuraNavKey) t2)).compareTo(Integer.valueOf(this.this$0.getOverlayPriority((AuraNavKey) t)));
            }
        }))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getOverlayPriority(AuraNavKey auraNavKey) {
        for (OverlayPriority overlayPriority : OverlayPriority.values()) {
            if (C7384Etj.areEqual(overlayPriority.getKey(), auraNavKey)) {
                return overlayPriority.ordinal();
            }
        }
        return Integer.MAX_VALUE;
    }

    private final void removeKey(BLG<AHD<AuraNavKey>> blg, AuraNavKey auraNavKey) {
        AHD<AuraNavKey> value;
        if (blg.getValue().contains(auraNavKey)) {
            do {
                value = blg.getValue();
            } while (!blg.A6e(value, AGI.A0C(AbstractC0878AGe.A0b(value, auraNavKey))));
        }
    }

    public /* synthetic */ OverlayApi(C06H c06h) {
        this();
    }

    public OverlayApi() {
        C9286GCn c9286GCnA01 = HnJ.A01(AHI.A01);
        this._activeOverlays = c9286GCnA01;
        this.activeOverlays = C3Pi.A00(c9286GCnA01);
    }
}
