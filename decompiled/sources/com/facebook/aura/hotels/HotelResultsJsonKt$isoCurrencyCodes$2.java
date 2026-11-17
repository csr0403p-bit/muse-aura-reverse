package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.C60O;
import X.C7384Etj;
import android.icu.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelResultsJsonKt$isoCurrencyCodes$2 extends AbstractC7559F3s implements Function0<HashSet<String>> {
    public static final HotelResultsJsonKt$isoCurrencyCodes$2 INSTANCE = new HotelResultsJsonKt$isoCurrencyCodes$2();

    public HotelResultsJsonKt$isoCurrencyCodes$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final HashSet<String> invoke() {
        Set<Currency> availableCurrencies = Currency.getAvailableCurrencies();
        C7384Etj.A0U(availableCurrencies);
        HashSet<String> hashSetA13 = C60O.A13();
        Iterator<Currency> it = availableCurrencies.iterator();
        while (it.hasNext()) {
            hashSetA13.add(it.next().getCurrencyCode());
        }
        return hashSetA13;
    }
}
