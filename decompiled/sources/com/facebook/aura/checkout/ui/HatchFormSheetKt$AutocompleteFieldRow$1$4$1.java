package com.facebook.aura.checkout.ui;

import X.AHD;
import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.C0Hi;
import X.C7384Etj;
import X.G0U;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$AutocompleteFieldRow$1$4$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ HatchAddressAutocomplete $autocomplete;
    public final /* synthetic */ C0Hi $focusManager;
    public final /* synthetic */ HatchFormState $state;
    public final /* synthetic */ AHD<HatchAddressSuggestion> $suggestions;
    public final /* synthetic */ HatchAddressTypeahead $typeahead;

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        Object objA0A = AbstractC0878AGe.A0A(auraContextMenuItem.id, this.$suggestions);
        if (objA0A != null) {
            HatchFormState hatchFormState = this.$state;
            HatchAddressAutocomplete hatchAddressAutocomplete = this.$autocomplete;
            HatchAddressTypeahead hatchAddressTypeahead = this.$typeahead;
            C0Hi c0Hi = this.$focusManager;
            hatchFormState.fill$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui((Map) hatchAddressAutocomplete.fill.invoke(objA0A));
            hatchAddressTypeahead.onClose.invoke();
            c0Hi.A6G(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchFormSheetKt$AutocompleteFieldRow$1$4$1(AHD<HatchAddressSuggestion> ahd, HatchFormState hatchFormState, HatchAddressAutocomplete hatchAddressAutocomplete, HatchAddressTypeahead hatchAddressTypeahead, C0Hi c0Hi) {
        super(1);
        this.$suggestions = ahd;
        this.$state = hatchFormState;
        this.$autocomplete = hatchAddressAutocomplete;
        this.$typeahead = hatchAddressTypeahead;
        this.$focusManager = c0Hi;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
