package com.facebook.aura.hotels;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelResultsCardKt$HotelResultsCard$2$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ HotelResults $results;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelResultsCardKt$HotelResultsCard$2$2$1(AbstractC3358CGz abstractC3358CGz, HotelResults hotelResults, AuraNavigator auraNavigator, String str) {
        super(0);
        this.$userSession = abstractC3358CGz;
        this.$results = hotelResults;
        this.$navigator = auraNavigator;
        this.$sessionId = str;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HotelRepository.Companion.getInstance(this.$userSession).rememberInitialResults(this.$results);
        this.$navigator.navigate((AuraNavKey) new HotelResultsScreenKey(this.$results.searchRef, this.$sessionId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
