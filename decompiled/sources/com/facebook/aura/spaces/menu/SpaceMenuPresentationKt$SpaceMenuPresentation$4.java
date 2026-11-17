package com.facebook.aura.spaces.menu;

import X.AHD;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.G0U;
import X.G0V;
import com.facebook.aura.vds.compose.contextmenu.AuraContextMenuItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class SpaceMenuPresentationKt$SpaceMenuPresentation$4 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$changed1;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ boolean $asBottomSheet;
    public final /* synthetic */ boolean $expanded;
    public final /* synthetic */ String $imageUrl;
    public final /* synthetic */ G0U<AuraContextMenuItem, G0V<BFM, Integer, Unit>> $itemTrailingContent;
    public final /* synthetic */ G0V<BFM, Integer, AHD<AuraContextMenuItem>> $items;
    public final /* synthetic */ Integer $loadingItemId;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ long $offset;
    public final /* synthetic */ Function0<Unit> $onDismissRequest;
    public final /* synthetic */ G0U<AuraContextMenuItem, Unit> $onItemClick;
    public final /* synthetic */ String $title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SpaceMenuPresentationKt$SpaceMenuPresentation$4(String str, String str2, boolean z, boolean z2, long j, Function0<Unit> function0, G0U<? super AuraContextMenuItem, Unit> g0u, G0V<? super BFM, ? super Integer, ? extends AHD<AuraContextMenuItem>> g0v, BRg bRg, Integer num, G0U<? super AuraContextMenuItem, ? extends G0V<? super BFM, ? super Integer, Unit>> g0u2, int i, int i2, int i3) {
        super(2);
        this.$title = str;
        this.$imageUrl = str2;
        this.$asBottomSheet = z;
        this.$expanded = z2;
        this.$offset = j;
        this.$onDismissRequest = function0;
        this.$onItemClick = g0u;
        this.$items = g0v;
        this.$modifier = bRg;
        this.$loadingItemId = num;
        this.$itemTrailingContent = g0u2;
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
        SpaceMenuPresentationKt.m2180SpaceMenuPresentationrSEfpyU(this.$title, this.$imageUrl, this.$asBottomSheet, this.$expanded, this.$offset, this.$onDismissRequest, this.$onItemClick, this.$items, this.$modifier, this.$loadingItemId, this.$itemTrailingContent, bfm, AnonymousClass011.A00(this.$$changed), AnonymousClass011.A01(this.$$changed1), this.$$default);
    }
}
