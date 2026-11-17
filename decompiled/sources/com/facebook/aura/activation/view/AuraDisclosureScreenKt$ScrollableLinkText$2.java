package com.facebook.aura.activation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.ApQ;
import X.BFM;
import X.BRg;
import X.G0V;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraDisclosureScreenKt$ScrollableLinkText$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ ApQ $annotatedString;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onLinkClick;
    public final /* synthetic */ int $textAlign;
    public final /* synthetic */ Map<String, String> $titlesByUrl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuraDisclosureScreenKt$ScrollableLinkText$2(ApQ apQ, Map<String, String> map, int i, Function0<Unit> function0, BRg bRg, int i2, int i3) {
        super(2);
        this.$annotatedString = apQ;
        this.$titlesByUrl = map;
        this.$textAlign = i;
        this.$onLinkClick = function0;
        this.$modifier = bRg;
        this.$$changed = i2;
        this.$$default = i3;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        AuraDisclosureScreenKt.m119ScrollableLinkTextD30ufTU(this.$annotatedString, this.$titlesByUrl, this.$textAlign, this.$onLinkClick, this.$modifier, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
