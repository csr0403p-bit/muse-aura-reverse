package com.facebook.aura.rentalcars;

import X.AbstractC7559F3s;
import com.facebook.aura.navigation.AuraNavKey;
import com.facebook.aura.navigation.AuraNavigator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class RentalCarResultsCardKt$RentalCarResultsCard$1$2$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ AuraNavigator $navigator;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ String $sessionId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RentalCarResultsCardKt$RentalCarResultsCard$1$2$1(AuraNavigator auraNavigator, String str, String str2, String str3) {
        super(0);
        this.$navigator = auraNavigator;
        this.$sessionId = str;
        this.$hostMessageId = str2;
        this.$presentationId = str3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$navigator.navigate((AuraNavKey) new RentalCarResultsScreenKey(this.$sessionId, this.$hostMessageId, this.$presentationId), false);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
