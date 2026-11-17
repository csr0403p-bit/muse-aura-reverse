package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass004;
import X.BFM;
import X.BRg;
import X.C1D3;
import X.C7384Etj;
import X.G0W;
import com.facebook.aura.model.GenericListPresentation;
import com.facebook.aura.model.JSONState;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class HatchGenericListCardKt$HatchGenericListCard$renderDefault$1 extends AbstractC7559F3s implements G0W<BRg, BFM, Integer, Unit> {
    public final /* synthetic */ long $backgroundColor;
    public final /* synthetic */ InlineContentCallbacks $callbacks;
    public final /* synthetic */ C1D3 $containerShape;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ GenericListPresentation $list;
    public final /* synthetic */ String $presentationId;
    public final /* synthetic */ JSONState $state;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGenericListCardKt$HatchGenericListCard$renderDefault$1(GenericListPresentation genericListPresentation, String str, String str2, JSONState jSONState, long j, C1D3 c1d3, InlineContentCallbacks inlineContentCallbacks) {
        super(3);
        this.$list = genericListPresentation;
        this.$presentationId = str;
        this.$hostMessageId = str2;
        this.$state = jSONState;
        this.$backgroundColor = j;
        this.$containerShape = c1d3;
        this.$callbacks = inlineContentCallbacks;
    }

    @Override // X.G0W
    public /* bridge */ /* synthetic */ Unit invoke(BRg bRg, BFM bfm, Integer num) {
        invoke(bRg, bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BRg bRg, BFM bfm, int i) {
        int iA0d = i;
        C7384Etj.A0Y(bRg, 0);
        if ((i & 6) == 0) {
            iA0d = i | AnonymousClass004.A0d(bfm, bRg);
        }
        if (AnonymousClass001.A1b(AnonymousClass004.A1H(iA0d), bfm, iA0d)) {
            HatchGenericListCardKt.m602DefaultGenericListCardNpZTi58(this.$list, this.$presentationId, this.$hostMessageId, this.$state, this.$backgroundColor, this.$containerShape, this.$callbacks, bRg, bfm, AnonymousClass001.A0C(iA0d << 21, (InlineContentCallbacks.$stable << 18) | (JSONState.$stable << 9)), 0);
            return;
        }
        bfm.Afo();
    }
}
