package com.facebook.aura.checkout.ui;

import X.AHD;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchAddressTypeahead extends C06G {
    public static final int $stable = 0;
    public final Function0<Unit> onClose;
    public final G0U<String, Unit> onQueryChange;
    public final AHD<HatchAddressSuggestion> suggestions;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAddressTypeahead) {
                HatchAddressTypeahead hatchAddressTypeahead = (HatchAddressTypeahead) obj;
                if (!C7384Etj.areEqual(this.suggestions, hatchAddressTypeahead.suggestions) || !C7384Etj.areEqual(this.onQueryChange, hatchAddressTypeahead.onQueryChange) || !C7384Etj.areEqual(this.onClose, hatchAddressTypeahead.onClose)) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HatchAddressTypeahead copy$default(HatchAddressTypeahead hatchAddressTypeahead, AHD ahd, G0U g0u, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            ahd = hatchAddressTypeahead.suggestions;
        }
        if ((i & 2) != 0) {
            g0u = hatchAddressTypeahead.onQueryChange;
        }
        if ((i & 4) != 0) {
            function0 = hatchAddressTypeahead.onClose;
        }
        return hatchAddressTypeahead.copy(ahd, g0u, function0);
    }

    public final AHD<HatchAddressSuggestion> component1() {
        return this.suggestions;
    }

    public final G0U<String, Unit> component2() {
        return this.onQueryChange;
    }

    public final Function0<Unit> component3() {
        return this.onClose;
    }

    public final Function0<Unit> getOnClose() {
        return this.onClose;
    }

    public final G0U<String, Unit> getOnQueryChange() {
        return this.onQueryChange;
    }

    public final AHD<HatchAddressSuggestion> getSuggestions() {
        return this.suggestions;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.onClose, AnonymousClass005.A0F(this.onQueryChange, AnonymousClass005.A0E(this.suggestions)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchAddressTypeahead(AHD<HatchAddressSuggestion> ahd, G0U<? super String, Unit> g0u, Function0<Unit> function0) {
        AnonymousClass005.A0x(ahd, g0u, function0);
        this.suggestions = ahd;
        this.onQueryChange = g0u;
        this.onClose = function0;
    }

    public final HatchAddressTypeahead copy(AHD<HatchAddressSuggestion> ahd, G0U<? super String, Unit> g0u, Function0<Unit> function0) {
        AnonymousClass005.A0x(ahd, g0u, function0);
        return new HatchAddressTypeahead(ahd, g0u, function0);
    }

    public String toString() {
        return super.toString();
    }
}
