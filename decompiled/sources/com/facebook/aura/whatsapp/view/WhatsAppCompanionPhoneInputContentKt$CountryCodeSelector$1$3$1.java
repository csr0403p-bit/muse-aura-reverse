package com.facebook.aura.whatsapp.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.components.phone.CountryDialCodesKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$1$3$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ G0U<CountryDialCode, Unit> $onCountrySelected;
    public final /* synthetic */ Function0<Unit> $onOptionTapped;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onOptionTapped.invoke();
        this.$onCountrySelected.invoke(CountryDialCodesKt.COUNTRY_DIAL_CODES.get(auraContextMenuItem.id));
        MutableState.A09(false, this.$expanded$delegate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WhatsAppCompanionPhoneInputContentKt$CountryCodeSelector$1$3$1(Function0<Unit> function0, G0U<? super CountryDialCode, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$onOptionTapped = function0;
        this.$onCountrySelected = g0u;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
