package com.facebook.aura.conversation.search;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0U;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ConversationSearchScreenKt$SearchTextField$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ String $clearContentDescription;
    public final /* synthetic */ long $fillColor;
    public final /* synthetic */ boolean $isCompact;
    public final /* synthetic */ Integer $leadingIconRes;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onActivate;
    public final /* synthetic */ Function0<Unit> $onClear;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<String, Unit> $onQueryChange;
    public final /* synthetic */ String $placeholderText;
    public final /* synthetic */ String $query;
    public final /* synthetic */ boolean $readOnly;
    public final /* synthetic */ boolean $requestFocusOnMount;
    public final /* synthetic */ C1822Arm $textStyle;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ConversationSearchScreenKt$SearchTextField$4(String str, G0U<? super String, Unit> g0u, BRg bRg, boolean z, boolean z2, Function0<Unit> function0, boolean z3, C1822Arm c1822Arm, String str2, String str3, Function0<Unit> function02, Function0<Unit> function03, Integer num, long j, int i, int i2, int i3) {
        super(2);
        this.$query = str;
        this.$onQueryChange = g0u;
        this.$modifier = bRg;
        this.$readOnly = z;
        this.$requestFocusOnMount = z2;
        this.$onClick = function0;
        this.$isCompact = z3;
        this.$textStyle = c1822Arm;
        this.$placeholderText = str2;
        this.$clearContentDescription = str3;
        this.$onActivate = function02;
        this.$onClear = function03;
        this.$leadingIconRes = num;
        this.$fillColor = j;
        this.$$changed = i;
        this.$$changed1 = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        ConversationSearchScreenKt.m504SearchTextFieldOqVHbNc(this.$query, this.$onQueryChange, this.$modifier, this.$readOnly, this.$requestFocusOnMount, this.$onClick, this.$isCompact, this.$textStyle, this.$placeholderText, this.$clearContentDescription, this.$onActivate, this.$onClear, this.$leadingIconRes, this.$fillColor, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
