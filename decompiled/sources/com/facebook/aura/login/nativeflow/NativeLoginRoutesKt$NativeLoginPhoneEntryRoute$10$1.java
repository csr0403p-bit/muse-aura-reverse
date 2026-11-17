package com.facebook.aura.login.nativeflow;

import X.AnonymousClass006;
import X.C7438Evz;
import X.G0U;
import com.facebook.aura.components.phone.CountryDialCode;
import kotlin.Unit;

/* loaded from: classes2.dex */
public final /* synthetic */ class NativeLoginRoutesKt$NativeLoginPhoneEntryRoute$10$1 extends C7438Evz implements G0U<CountryDialCode, Unit> {
    public NativeLoginRoutesKt$NativeLoginPhoneEntryRoute$10$1(Object obj) {
        super(1, obj, NativeLoginViewModel.class, "onCountrySelected", "onCountrySelected(Lcom/facebook/aura/components/phone/CountryDialCode;)V", 0);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CountryDialCode countryDialCode) {
        ((NativeLoginViewModel) AnonymousClass006.A0o(countryDialCode, this)).onCountrySelected(countryDialCode);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(CountryDialCode countryDialCode) {
        invoke2(countryDialCode);
        return Unit.INSTANCE;
    }
}
