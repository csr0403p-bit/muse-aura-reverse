package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.email.viewmodel.EmailInboxEntryPoint;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailScreen$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ EmailInboxEntryPoint $entryPoint;
    public final /* synthetic */ String $initialAction;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onSetupRequestHandled;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailScreen$4(float f, float f2, String str, Function0<Unit> function0, EmailInboxEntryPoint emailInboxEntryPoint, BRg bRg, int i, int i2) {
        super(2);
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$initialAction = str;
        this.$onSetupRequestHandled = function0;
        this.$entryPoint = emailInboxEntryPoint;
        this.$modifier = bRg;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        EmailScreenKt.m753EmailScreenX35cekY(this.$topPadding, this.$bottomPadding, this.$initialAction, this.$onSetupRequestHandled, this.$entryPoint, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
