package com.facebook.aura.whatsapp.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.C78N;
import X.G0U;
import X.G0V;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.components.phone.CountryDialCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ Function0<Unit> $onCountryOptionTapped;
    public final /* synthetic */ Function0<Unit> $onCountryPickerOpened;
    public final /* synthetic */ MutableState<CountryDialCode> $selectedCountry$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$2(Function0<Unit> function0, Function0<Unit> function02, MutableState<CountryDialCode> mutableState) {
        super(2);
        this.$onCountryPickerOpened = function0;
        this.$onCountryOptionTapped = function02;
        this.$selectedCountry$delegate = mutableState;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        if (AnonymousClass001.A1b(AnonymousClass004.A1E(i), bfm, i)) {
            CountryDialCode value = this.$selectedCountry$delegate.getValue();
            MutableState<CountryDialCode> mutableState = this.$selectedCountry$delegate;
            Object objAaT = bfm.AaT();
            if (objAaT == C78N.A00) {
                objAaT = new WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$2$1$1(mutableState);
                bfm.Ai0(objAaT);
            }
            WhatsAppCompanionPhoneInputContentKt.CountryCodeSelector(value, (G0U) objAaT, this.$onCountryPickerOpened, this.$onCountryOptionTapped, null, bfm, 48, 16);
            return;
        }
        bfm.Afo();
    }
}
