package com.facebook.aura.vds.compose.card;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C07C;
import X.C08R;
import X.C1DM;
import X.G0U;
import X.G0V;
import X.G0W;
import X.InterfaceC05011Yg;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class AuraCardKt$AuraCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $alert;
    public final /* synthetic */ long $alertColor;
    public final /* synthetic */ C1DM $cardShape;
    public final /* synthetic */ Boolean $checked;
    public final /* synthetic */ AuraCardContent $content;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $contentComposable;
    public final /* synthetic */ boolean $destructive;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ G0W<C07C, BFM, Integer, Unit> $footerComposable;
    public final /* synthetic */ InterfaceC05011Yg $indication;
    public final /* synthetic */ G0V<BFM, Integer, Unit> $leading;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ G0U<Boolean, Unit> $onChange;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0U<String, Unit> $onTextChange;
    public final /* synthetic */ AuraCardStyle $style;
    public final /* synthetic */ G0W<C08R, BFM, Integer, Unit> $trailing;
    public final /* synthetic */ AuraCardType $type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCardKt$AuraCard$2(BRg bRg, AuraCardStyle auraCardStyle, AuraCardContent auraCardContent, AuraCardType auraCardType, G0V<? super BFM, ? super Integer, Unit> g0v, G0W<? super C08R, ? super BFM, ? super Integer, Unit> g0w, Function0<Unit> function0, Boolean bool, G0U<? super Boolean, Unit> g0u, G0U<? super String, Unit> g0u2, boolean z, boolean z2, InterfaceC05011Yg interfaceC05011Yg, C1DM c1dm, long j, boolean z3, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w2, G0W<? super C07C, ? super BFM, ? super Integer, Unit> g0w3, int i, int i2, int i3) {
        super(2);
        this.$modifier = bRg;
        this.$style = auraCardStyle;
        this.$content = auraCardContent;
        this.$type = auraCardType;
        this.$leading = g0v;
        this.$trailing = g0w;
        this.$onClick = function0;
        this.$checked = bool;
        this.$onChange = g0u;
        this.$onTextChange = g0u2;
        this.$enabled = z;
        this.$alert = z2;
        this.$indication = interfaceC05011Yg;
        this.$cardShape = c1dm;
        this.$alertColor = j;
        this.$destructive = z3;
        this.$footerComposable = g0w2;
        this.$contentComposable = g0w3;
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
        AuraCardKt.m2484AuraCardjQVUvHA(this.$modifier, this.$style, this.$content, this.$type, this.$leading, this.$trailing, this.$onClick, this.$checked, this.$onChange, this.$onTextChange, this.$enabled, this.$alert, this.$indication, this.$cardShape, this.$alertColor, this.$destructive, this.$footerComposable, this.$contentComposable, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
