package com.facebook.aura.shopping.view;

import X.AbstractC7559F3s;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchProductDetailsLocationSectionKt$LocationMap$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ Double $latitude;
    public final /* synthetic */ String $locationText;
    public final /* synthetic */ Double $longitude;
    public final /* synthetic */ String $productId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchProductDetailsLocationSectionKt$LocationMap$1$1(String str, String str2, Context context, Double d, Double d2, String str3) {
        super(0);
        this.$productId = str;
        this.$hostMessageId = str2;
        this.$context = context;
        this.$latitude = d;
        this.$longitude = d2;
        this.$locationText = str3;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchProductDetailsLocationSectionKt.logLocationMapClick(this.$productId, this.$hostMessageId);
        HatchProductDetailsLocationSectionKt.openMap(this.$context, this.$latitude.doubleValue(), this.$longitude.doubleValue(), this.$locationText);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
