package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.G0V;
import com.facebook.aura.model.GenericListPresentation;
import com.facebook.aura.model.JSONState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchGenericListCardKt$HatchGenericListCard$2 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ int $$default;
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ GenericListPresentation $list;
    public final /* synthetic */ BRg $modifier;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ String $sessionId;
    public final /* synthetic */ JSONState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGenericListCardKt$HatchGenericListCard$2(GenericListPresentation genericListPresentation, String str, String str2, JSONState jSONState, String str3, BRg bRg, long j, C1D3 c1d3, InlineContentCallbacks inlineContentCallbacks, int i, int i2) {
        super(2);
        this.$list = genericListPresentation;
        this.$presentationId = str;
        this.$hostMessageId = str2;
        this.$state = jSONState;
        this.$sessionId = str3;
        this.$modifier = bRg;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$callbacks = inlineContentCallbacks;
        this.$$changed = i;
        this.$$default = i2;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchGenericListCardKt.m604HatchGenericListCardmwpFuRA(this.$list, this.$presentationId, this.$hostMessageId, this.$state, this.$sessionId, this.$modifier, this.$backgroundColor, this.$containerShape, this.$callbacks, bfm, AnonymousClass011.A00(this.$$changed), this.$$default);
    }
}
