package com.facebook.aura.whatsapp.view;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.components.phone.CountryDialCode;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$2$1$1 extends AbstractC7559F3s implements G0U<CountryDialCode, Unit> {
    public final /* synthetic */ MutableState<CountryDialCode> $selectedCountry$delegate;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CountryDialCode countryDialCode) {
        C7384Etj.A0Y(countryDialCode, 0);
        this.$selectedCountry$delegate.Af8(countryDialCode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$2$1$1(MutableState<CountryDialCode> mutableState) {
        super(1);
        this.$selectedCountry$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(CountryDialCode countryDialCode) {
        invoke2(countryDialCode);
        return Unit.INSTANCE;
    }
}
