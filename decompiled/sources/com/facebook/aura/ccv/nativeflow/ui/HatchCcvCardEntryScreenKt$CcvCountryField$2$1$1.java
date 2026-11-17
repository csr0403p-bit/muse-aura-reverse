package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC1564Ale;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.InterfaceC0857A6e;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchCcvCardEntryScreenKt$CcvCountryField$2$1$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ String $displayValue;
    public final /* synthetic */ C1BO<Function0<Unit>> $openMenu$delegate;
    public final /* synthetic */ String $placeholder;

    /* renamed from: com.facebook.aura.ccv.nativeflow.ui.HatchCcvCardEntryScreenKt$CcvCountryField$2$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<Function0<Unit>> $openMenu$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(C1BO<? extends Function0<Unit>> c1bo) {
            super(0);
            this.$openMenu$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            C1BO.A0D(this.$openMenu$delegate);
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$placeholder);
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
        String str = this.$displayValue;
        if (str.length() > 0) {
            AbstractC1564Ale.A09(interfaceC0857A6e, str);
        }
        AbstractC1564Ale.A0A(interfaceC0857A6e, null, new AnonymousClass1(this.$openMenu$delegate));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryScreenKt$CcvCountryField$2$1$1(String str, String str2, C1BO<? extends Function0<Unit>> c1bo) {
        super(1);
        this.$placeholder = str;
        this.$displayValue = str2;
        this.$openMenu$delegate = c1bo;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
