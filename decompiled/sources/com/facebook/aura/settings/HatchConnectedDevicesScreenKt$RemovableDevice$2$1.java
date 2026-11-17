package com.facebook.aura.settings;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.BHP;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import androidx.compose.runtime.MutableState;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchConnectedDevicesScreenKt$RemovableDevice$2$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $removeActionLabel;
    public final /* synthetic */ MutableState<Boolean> $showRemoveConfirmation$delegate;

    /* renamed from: com.facebook.aura.settings.HatchConnectedDevicesScreenKt$RemovableDevice$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ MutableState<Boolean> $showRemoveConfirmation$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MutableState<Boolean> mutableState) {
            super(0);
            this.$showRemoveConfirmation$delegate = mutableState;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            MutableState.A09(true, this.$showRemoveConfirmation$delegate);
            return true;
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A0C(interfaceC0857A6e, Collections.singletonList(new BHP(this.$removeActionLabel, new AnonymousClass1(this.$showRemoveConfirmation$delegate))));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchConnectedDevicesScreenKt$RemovableDevice$2$1(String str, MutableState<Boolean> mutableState) {
        super(1);
        this.$removeActionLabel = str;
        this.$showRemoveConfirmation$delegate = mutableState;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
