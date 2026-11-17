package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.C3UX;
import X.G0U;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.model.HatchContentViewModelData;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.conversation.view.richcontent.HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$1$1", f = "HatchRichResponseContent.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$1$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public final /* synthetic */ HatchContentViewModelData $contentViewModel;
    public final /* synthetic */ G0U<String, Unit> $onArtifactVisible;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$1$1(G0U<? super String, Unit> g0u, HatchContentViewModelData hatchContentViewModelData, HtJ<? super HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$1$1> htJ) {
        super(2, htJ);
        this.$onArtifactVisible = g0u;
        this.$contentViewModel = hatchContentViewModelData;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$1$1(this.$onArtifactVisible, this.$contentViewModel, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        this.$onArtifactVisible.invoke(((HatchContentViewModelData.InlineHtml) this.$contentViewModel).url);
        return Unit.INSTANCE;
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$10$1$1) create(c3ux, htJ)).invokeSuspend(Unit.INSTANCE);
    }
}
