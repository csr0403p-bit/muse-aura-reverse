package com.facebook.aura.login.nativeflow;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1822Arm;
import X.G0V;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class NativeLoginCommonKt$NativeLoginLinkedLegalText$3 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onLinkClick;
    public final /* synthetic */ C1822Arm $style;
    public final /* synthetic */ List<LegalSubstitution> $substitutions;
    public final /* synthetic */ String $template;
    public final /* synthetic */ int $textAlign;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeLoginCommonKt$NativeLoginLinkedLegalText$3(String str, List<LegalSubstitution> list, int i, C1822Arm c1822Arm, BRg bRg, Function0<Unit> function0, int i2, int i3) {
        super(2);
        this.$template = str;
        this.$substitutions = list;
        this.$textAlign = i;
        this.$style = c1822Arm;
        this.$modifier = bRg;
        this.$onLinkClick = function0;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        NativeLoginCommonKt.m1280NativeLoginLinkedLegalTextgm0gx_Q(this.$template, this.$substitutions, this.$textAlign, this.$style, this.$modifier, this.$onLinkClick, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
