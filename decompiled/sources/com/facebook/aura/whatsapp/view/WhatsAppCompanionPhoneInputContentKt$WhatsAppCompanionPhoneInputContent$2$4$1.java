package com.facebook.aura.whatsapp.view;

import X.AbstractC7559F3s;
import X.FGI;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.components.phone.CountryDialCode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$4$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0U<String, Unit> $onPhoneSubmit;
    public final /* synthetic */ MutableState<String> $phoneNumber$delegate;
    public final /* synthetic */ MutableState<CountryDialCode> $selectedCountry$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WhatsAppCompanionPhoneInputContentKt$WhatsAppCompanionPhoneInputContent$2$4$1(G0U<? super String, Unit> g0u, MutableState<CountryDialCode> mutableState, MutableState<String> mutableState2) {
        super(0);
        this.$onPhoneSubmit = g0u;
        this.$selectedCountry$delegate = mutableState;
        this.$phoneNumber$delegate = mutableState2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onPhoneSubmit.invoke(FGI.A08(this.$selectedCountry$delegate.getValue().dialCode, MutableState.A05(this.$phoneNumber$delegate)));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
