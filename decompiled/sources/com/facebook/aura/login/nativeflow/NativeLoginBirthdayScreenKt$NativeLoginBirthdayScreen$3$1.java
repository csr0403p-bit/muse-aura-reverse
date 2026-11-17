package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.C7384Etj;
import X.G0U;
import androidx.compose.runtime.MutableState;
import java.time.LocalDate;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$3$1 extends AbstractC7559F3s implements G0U<LocalDate, Unit> {
    public final /* synthetic */ MutableState<Boolean> $isPickerVisible$delegate;
    public final /* synthetic */ G0U<LocalDate, Unit> $onBirthdaySelected;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LocalDate localDate) {
        C7384Etj.A0Y(localDate, 0);
        MutableState.A09(false, this.$isPickerVisible$delegate);
        this.$onBirthdaySelected.invoke(localDate);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NativeLoginBirthdayScreenKt$NativeLoginBirthdayScreen$3$1(G0U<? super LocalDate, Unit> g0u, MutableState<Boolean> mutableState) {
        super(1);
        this.$onBirthdaySelected = g0u;
        this.$isPickerVisible$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(LocalDate localDate) {
        invoke2(localDate);
        return Unit.INSTANCE;
    }
}
