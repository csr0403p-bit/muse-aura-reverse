package com.facebook.aura.email.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import com.facebook.aura.email.model.EmailRestrictionNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class EmailScreenKt$EmailSetupPrompt$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ float $bottomPadding;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onCreate;
    public final /* synthetic */ EmailRestrictionNotice $takenDownNotice;
    public final /* synthetic */ float $topPadding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailScreenKt$EmailSetupPrompt$2(float f, float f2, BRg bRg, EmailRestrictionNotice emailRestrictionNotice, Function0<Unit> function0, int i, int i2) {
        super(2);
        this.$topPadding = f;
        this.$bottomPadding = f2;
        this.$modifier = bRg;
        this.$takenDownNotice = emailRestrictionNotice;
        this.$onCreate = function0;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        EmailScreenKt.m754EmailSetupPromptcmhDWc(this.$topPadding, this.$bottomPadding, this.$modifier, this.$takenDownNotice, this.$onCreate, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
