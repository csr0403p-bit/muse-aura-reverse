package com.facebook.aura.conversation.view;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.EnumC10460Hji;
import X.G0V;
import X.HtJ;
import X.Hwg;
import androidx.compose.runtime.MutableState;
import com.facebook.aura.opengraph.HatchOpenGraphRepository;
import com.facebook.aura.opengraph.HatchWebPageMetadata;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.HatchGenericListCardKt$rememberLinkImages$1$1", f = "HatchGenericListCard.kt", l = {420}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchGenericListCardKt$rememberLinkImages$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ MutableState<HatchWebPageMetadata> $metadata$delegate;
    public final /* synthetic */ HatchOpenGraphRepository $repository;
    public final /* synthetic */ String $webUrl;
    public Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchGenericListCardKt$rememberLinkImages$1$1(HatchOpenGraphRepository hatchOpenGraphRepository, String str, MutableState<HatchWebPageMetadata> mutableState, HtJ<? super HatchGenericListCardKt$rememberLinkImages$1$1> htJ) {
        super(2, htJ);
        this.$repository = hatchOpenGraphRepository;
        this.$webUrl = str;
        this.$metadata$delegate = mutableState;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchGenericListCardKt$rememberLinkImages$1$1(this.$repository, this.$webUrl, this.$metadata$delegate, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        MutableState mutableState;
        EnumC10460Hji enumC10460Hji = EnumC10460Hji.A02;
        int i = this.label;
        if (i == 0) {
            Hwg.A00(obj);
            MutableState<HatchWebPageMetadata> mutableState2 = this.$metadata$delegate;
            float f = HatchGenericListCardKt.CardPadding;
            if (mutableState2.getValue() == null) {
                mutableState = this.$metadata$delegate;
                HatchOpenGraphRepository hatchOpenGraphRepository = this.$repository;
                String str = this.$webUrl;
                this.L$0 = mutableState;
                this.label = 1;
                obj = hatchOpenGraphRepository.metadata(str, this);
                if (obj == enumC10460Hji) {
                    return enumC10460Hji;
                }
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw AnonymousClass001.A0n();
        }
        mutableState = (MutableState) this.L$0;
        Hwg.A00(obj);
        float f2 = HatchGenericListCardKt.CardPadding;
        mutableState.Af8(obj);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchGenericListCardKt$rememberLinkImages$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
