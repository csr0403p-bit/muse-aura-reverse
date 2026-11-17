package com.facebook.aura.checkout.ui;

import X.AnonymousClass003;
import X.AnonymousClass005;
import X.C06G;
import X.C7384Etj;
import X.G0U;
import java.util.Map;

/* loaded from: classes4.dex */
public final class HatchAddressAutocomplete extends C06G {
    public static final int $stable = 0;
    public final G0U<HatchAddressSuggestion, Map<String, String>> fill;
    public final HatchAddressTypeahead typeahead;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HatchAddressAutocomplete) {
                HatchAddressAutocomplete hatchAddressAutocomplete = (HatchAddressAutocomplete) obj;
                if (!C7384Etj.areEqual(this.typeahead, hatchAddressAutocomplete.typeahead) || !C7384Etj.areEqual(this.fill, hatchAddressAutocomplete.fill)) {
                }
            }
            return false;
        }
        return true;
    }

    public static /* synthetic */ HatchAddressAutocomplete copy$default(HatchAddressAutocomplete hatchAddressAutocomplete, HatchAddressTypeahead hatchAddressTypeahead, G0U g0u, int i, Object obj) {
        if ((i & 1) != 0) {
            hatchAddressTypeahead = hatchAddressAutocomplete.typeahead;
        }
        if ((i & 2) != 0) {
            g0u = hatchAddressAutocomplete.fill;
        }
        AnonymousClass003.A0u(hatchAddressTypeahead, g0u);
        return new HatchAddressAutocomplete(hatchAddressTypeahead, g0u);
    }

    public final HatchAddressTypeahead component1() {
        return this.typeahead;
    }

    public final G0U<HatchAddressSuggestion, Map<String, String>> component2() {
        return this.fill;
    }

    public final G0U<HatchAddressSuggestion, Map<String, String>> getFill() {
        return this.fill;
    }

    public final HatchAddressTypeahead getTypeahead() {
        return this.typeahead;
    }

    public int hashCode() {
        return AnonymousClass005.A0G(this.fill, AnonymousClass005.A0E(this.typeahead));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HatchAddressAutocomplete(HatchAddressTypeahead hatchAddressTypeahead, G0U<? super HatchAddressSuggestion, ? extends Map<String, String>> g0u) {
        AnonymousClass003.A0u(hatchAddressTypeahead, g0u);
        this.typeahead = hatchAddressTypeahead;
        this.fill = g0u;
    }

    public final HatchAddressAutocomplete copy(HatchAddressTypeahead hatchAddressTypeahead, G0U<? super HatchAddressSuggestion, ? extends Map<String, String>> g0u) {
        AnonymousClass003.A0u(hatchAddressTypeahead, g0u);
        return new HatchAddressAutocomplete(hatchAddressTypeahead, g0u);
    }

    public String toString() {
        return super.toString();
    }
}
