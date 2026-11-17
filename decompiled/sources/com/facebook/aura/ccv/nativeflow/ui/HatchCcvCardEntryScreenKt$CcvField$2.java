package com.facebook.aura.ccv.nativeflow.ui;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1518AkS;
import X.C2257BGr;
import X.G0U;
import X.G0V;
import X.Hw8;
import com.facebook.aura.ccv.nativeflow.HatchCardFieldError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class HatchCcvCardEntryScreenKt$CcvField$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ int $capitalization;
    public final /* synthetic */ Hw8 $contentType;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ HatchCardFieldError $error;
    public final /* synthetic */ C1518AkS $focusRequester;
    public final /* synthetic */ int $imeAction;
    public final /* synthetic */ C2257BGr $keyboardActions;
    public final /* synthetic */ int $keyboardType;
    public final /* synthetic */ String $label;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onBlur;
    public final /* synthetic */ G0U<String, Unit> $onChange;
    public final /* synthetic */ String $placeholder;
    public final /* synthetic */ int $placeholderRes;
    public final /* synthetic */ String $serverError;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $trailingIcon;
    public final /* synthetic */ String $value;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchCcvCardEntryScreenKt$CcvField$2(String str, G0U<? super String, Unit> g0u, Function0<Unit> function0, int i, HatchCardFieldError hatchCardFieldError, String str2, boolean z, Hw8 hw8, BRg bRg, String str3, String str4, int i2, int i3, int i4, C2257BGr c2257BGr, C1518AkS c1518AkS, G0V<? super BFM, ? super Integer, Unit> g0v, int i5, int i6, int i7) {
        super(2);
        this.$value = str;
        this.$onChange = g0u;
        this.$onBlur = function0;
        this.$placeholderRes = i;
        this.$error = hatchCardFieldError;
        this.$serverError = str2;
        this.$enabled = z;
        this.$contentType = hw8;
        this.$modifier = bRg;
        this.$placeholder = str3;
        this.$label = str4;
        this.$keyboardType = i2;
        this.$capitalization = i3;
        this.$imeAction = i4;
        this.$keyboardActions = c2257BGr;
        this.$focusRequester = c1518AkS;
        this.$trailingIcon = g0v;
        this.$$changed = i5;
        this.$$changed1 = i6;
        this.$$default = i7;
    }

    public final void invoke(BFM bfm, int i) {
        HatchCcvCardEntryScreenKt.m334CcvFieldV4wbGKQ(this.$value, this.$onChange, this.$onBlur, this.$placeholderRes, this.$error, this.$serverError, this.$enabled, this.$contentType, this.$modifier, this.$placeholder, this.$label, this.$keyboardType, this.$capitalization, this.$imeAction, this.$keyboardActions, this.$focusRequester, this.$trailingIcon, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
