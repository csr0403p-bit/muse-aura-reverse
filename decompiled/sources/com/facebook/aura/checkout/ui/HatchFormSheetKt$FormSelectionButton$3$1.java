package com.facebook.aura.checkout.ui;

import X.AY5;
import X.AYA;
import X.AbstractC1564Ale;
import X.AbstractC1578Alt;
import X.AbstractC1671Anw;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.C1BO;
import X.C7384Etj;
import X.G0U;
import X.Hw8;
import X.InterfaceC0857A6e;
import android.view.autofill.AutofillValue;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$FormSelectionButton$3$1 extends AbstractC7559F3s implements G0U<InterfaceC0857A6e, Unit> {
    public final /* synthetic */ Hw8 $autofillType;
    public final /* synthetic */ C1BO<Function0<Unit>> $currentOnClick$delegate;
    public final /* synthetic */ String $errorMessage;
    public final /* synthetic */ G0U<CharSequence, Boolean> $onAutofill;
    public final /* synthetic */ String $placeholder;
    public final /* synthetic */ String $value;

    /* renamed from: com.facebook.aura.checkout.ui.HatchFormSheetKt$FormSelectionButton$3$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public final class AnonymousClass2 extends AbstractC7559F3s implements Function0<Boolean> {
        public final /* synthetic */ C1BO<Function0<Unit>> $currentOnClick$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(C1BO<? extends Function0<Unit>> c1bo) {
            super(0);
            this.$currentOnClick$delegate = c1bo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            C1BO.A0D(this.$currentOnClick$delegate);
            return AnonymousClass001.A0i();
        }
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(InterfaceC0857A6e interfaceC0857A6e) {
        C7384Etj.A0Y(interfaceC0857A6e, 0);
        AbstractC1564Ale.A08(interfaceC0857A6e, this.$placeholder);
        AbstractC1564Ale.A06(interfaceC0857A6e, 0);
        String str = this.$value;
        if (str.length() > 0) {
            AbstractC1564Ale.A09(interfaceC0857A6e, str);
        }
        String str2 = this.$errorMessage;
        if (str2 != null) {
            interfaceC0857A6e.Aca(AbstractC1671Anw.A07, str2);
        }
        AbstractC1564Ale.A0A(interfaceC0857A6e, null, new AnonymousClass2(this.$currentOnClick$delegate));
        Hw8 hw8 = this.$autofillType;
        if (hw8 != null) {
            String str3 = this.$value;
            G0U<CharSequence, Boolean> g0u = this.$onAutofill;
            AbstractC1564Ale.A00(hw8, interfaceC0857A6e);
            interfaceC0857A6e.Aca(AbstractC1671Anw.A02, AYA.A01);
            interfaceC0857A6e.Aca(AbstractC1671Anw.A08, new AY5(AutofillValue.forText(str3)));
            InterfaceC0857A6e.A00(AbstractC1578Alt.A0C, interfaceC0857A6e, null, new HatchFormSheetKt$FormSelectionButton$3$1$3$2(g0u));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFormSheetKt$FormSelectionButton$3$1(String str, String str2, String str3, Hw8 hw8, C1BO<? extends Function0<Unit>> c1bo, G0U<? super CharSequence, Boolean> g0u) {
        super(1);
        this.$placeholder = str;
        this.$value = str2;
        this.$errorMessage = str3;
        this.$autofillType = hw8;
        this.$currentOnClick$delegate = c1bo;
        this.$onAutofill = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(InterfaceC0857A6e interfaceC0857A6e) {
        invoke2(interfaceC0857A6e);
        return Unit.INSTANCE;
    }
}
