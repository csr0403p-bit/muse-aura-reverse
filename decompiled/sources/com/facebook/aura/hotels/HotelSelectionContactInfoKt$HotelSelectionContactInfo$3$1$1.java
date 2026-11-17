package com.facebook.aura.hotels;

import X.AbstractC7559F3s;
import X.AnonymousClass002;
import X.C3cG;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HotelSelectionContactInfoKt$HotelSelectionContactInfo$3$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ MutableState<HotelContactAction> $action$delegate;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ Uri $dialUri;
    public final /* synthetic */ boolean $linksEnabled;
    public final /* synthetic */ HotelContactAction $selected;
    public final /* synthetic */ HotelSelection $selection;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HotelContactAction.values().length];
            try {
                AnonymousClass002.A13(HotelContactAction.MAPS, iArr);
            } catch (NoSuchFieldError unused) {
            }
            try {
                AnonymousClass002.A14(HotelContactAction.PHONE, iArr);
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HotelSelectionContactInfoKt$HotelSelectionContactInfo$3$1$1(boolean z, HotelContactAction hotelContactAction, Context context, HotelSelection hotelSelection, Uri uri, MutableState<HotelContactAction> mutableState) {
        super(0);
        this.$linksEnabled = z;
        this.$selected = hotelContactAction;
        this.$context = context;
        this.$selection = hotelSelection;
        this.$dialUri = uri;
        this.$action$delegate = mutableState;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$action$delegate.Af8(null);
        if (this.$linksEnabled) {
            int iOrdinal = this.$selected.ordinal();
            if (iOrdinal == 0) {
                HotelSelectionContactInfoKt.openHotelMaps(this.$context, this.$selection);
            } else {
                if (iOrdinal != 1) {
                    throw C3cG.A0q();
                }
                Uri uri = this.$dialUri;
                if (uri != null) {
                    HotelSelectionContactInfoKt.launchHotelContact(this.$context, new Intent("android.intent.action.DIAL", uri));
                }
            }
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
