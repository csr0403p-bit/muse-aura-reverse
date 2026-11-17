package com.facebook.aura.conversation.view;

import X.AaC;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0V;
import X.G0W;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$ImageOptionTile$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $dimmed;
    public final /* synthetic */ boolean $enabled;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ Function0<Unit> $onClick;
    public final /* synthetic */ G0W<AaC, Float, Float, Unit> $onPreview;
    public final /* synthetic */ String $path;
    public final /* synthetic */ int $position;
    public final /* synthetic */ int $role;
    public final /* synthetic */ boolean $selected;
    public final /* synthetic */ String $sharedElementKey;
    public final /* synthetic */ boolean $showCheckmark;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionsWidgetKt$ImageOptionTile$4(String str, int i, String str2, boolean z, boolean z2, boolean z3, int i2, Function0<Unit> function0, G0W<? super AaC, ? super Float, ? super Float, Unit> g0w, BRg bRg, boolean z4, int i3, int i4, int i5) {
        super(2);
        this.$path = str;
        this.$position = i;
        this.$sharedElementKey = str2;
        this.$selected = z;
        this.$dimmed = z2;
        this.$enabled = z3;
        this.$role = i2;
        this.$onClick = function0;
        this.$onPreview = g0w;
        this.$modifier = bRg;
        this.$showCheckmark = z4;
        this.$$changed = i3;
        this.$$changed1 = i4;
        this.$$default = i5;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchImageOptionsWidgetKt.m619ImageOptionTilePZy0YI(this.$path, this.$position, this.$sharedElementKey, this.$selected, this.$dimmed, this.$enabled, this.$role, this.$onClick, this.$onPreview, this.$modifier, this.$showCheckmark, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
