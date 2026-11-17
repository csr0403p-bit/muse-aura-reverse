package com.facebook.aura.checkout.ui;

import X.AbstractC7559F3s;
import X.C0981AMm;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;
import X.G0W;
import java.util.Map;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class HatchFormSheetKt$FormTextInput$4$1 extends AbstractC7559F3s implements G0U<C1805ArO, Unit> {
    public final /* synthetic */ HatchFormField $field;
    public final /* synthetic */ G0U<String, Unit> $onTextChange;
    public final /* synthetic */ HatchFormState $state;
    public final /* synthetic */ C1805ArO $value;
    public final /* synthetic */ C0981AMm<String, C1805ArO> $values;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1805ArO c1805ArO) {
        String str;
        String str2;
        String strInvoke;
        G0U<String, Unit> g0u;
        C7384Etj.A0Y(c1805ArO, 0);
        C1805ArO c1805ArO2 = this.$values.get(this.$field.id);
        if (c1805ArO2 == null || (str = c1805ArO2.A01.A00) == null) {
            str = "";
        }
        G0W<String, String, Map<String, String>, String> g0w = this.$field.format;
        if (g0w == null || (strInvoke = g0w.invoke((str2 = c1805ArO.A01.A00), this.$value.A01.A00, HatchFormSheetKt.plainValues(this.$values))) == null) {
            HatchFormFieldKind hatchFormFieldKind = this.$field.kind;
            str2 = c1805ArO.A01.A00;
            strInvoke = HatchFormSheetKt.formattedInput(hatchFormFieldKind, str2, this.$value.A01.A00);
        }
        C0981AMm<String, C1805ArO> c0981AMm = this.$values;
        String str3 = this.$field.id;
        if (!C7384Etj.areEqual(strInvoke, str2)) {
            c1805ArO = HatchFormSheetKt.reformattedAs(c1805ArO, strInvoke);
        }
        c0981AMm.put(str3, c1805ArO);
        this.$state.reformatDependents$fbandroid_express_aura_java_com_facebook_aura_checkout_ui_ui(this.$field.id);
        if (str.equals(strInvoke) || (g0u = this.$onTextChange) == null) {
            return;
        }
        g0u.invoke(strInvoke);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchFormSheetKt$FormTextInput$4$1(C0981AMm<String, C1805ArO> c0981AMm, HatchFormField hatchFormField, C1805ArO c1805ArO, HatchFormState hatchFormState, G0U<? super String, Unit> g0u) {
        super(1);
        this.$values = c0981AMm;
        this.$field = hatchFormField;
        this.$value = c1805ArO;
        this.$state = hatchFormState;
        this.$onTextChange = g0u;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1805ArO c1805ArO) {
        invoke2(c1805ArO);
        return Unit.INSTANCE;
    }
}
