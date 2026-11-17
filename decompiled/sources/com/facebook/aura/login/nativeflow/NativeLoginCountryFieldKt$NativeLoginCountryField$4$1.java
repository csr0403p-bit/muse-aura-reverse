package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.components.phone.CountryDialCode;
import com.facebook.aura.components.phone.CountryDialCodesKt;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginCountryFieldKt$NativeLoginCountryField$4$1 extends AbstractC7559F3s implements G0U<AuraContextMenuItem, Unit> {
    public final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    public final /* synthetic */ G0U<CountryDialCode, Unit> $onCountrySelected;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AuraContextMenuItem auraContextMenuItem) {
        C7384Etj.A0Y(auraContextMenuItem, 0);
        this.$onCountrySelected.invoke(CountryDialCodesKt.COUNTRY_DIAL_CODES.get(auraContextMenuItem.id));
        MutableState<Boolean> mutableState = this.$expanded$delegate;
        List<String> list = NativeLoginCountryFieldKt.COUNTRY_MENU_LABELS;
        MutableState.A09(false, mutableState);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginCountryFieldKt$NativeLoginCountryField$4$1(G0U<? super CountryDialCode, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$onCountrySelected = g0u;
        this.$expanded$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(AuraContextMenuItem auraContextMenuItem) {
        invoke2(auraContextMenuItem);
        return Unit.INSTANCE;
    }
}
