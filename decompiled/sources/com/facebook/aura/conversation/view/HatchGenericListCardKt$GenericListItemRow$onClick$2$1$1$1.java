package com.facebook.aura.conversation.view;

import X.AbstractC3358CGz;
import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.gateway.AuraMarkdownUrlResolversKt;
import com.facebook.aura.model.HatchAttachmentFile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchGenericListCardKt$GenericListItemRow$onClick$2$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ HatchAttachmentFile $file;
    public final /* synthetic */ G0V<String, String, Unit> $open;
    public final /* synthetic */ AbstractC3358CGz $userSession;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchGenericListCardKt$GenericListItemRow$onClick$2$1$1$1(G0V<? super String, ? super String, Unit> g0v, HatchAttachmentFile hatchAttachmentFile, AbstractC3358CGz abstractC3358CGz) {
        super(0);
        this.$open = g0v;
        this.$file = hatchAttachmentFile;
        this.$userSession = abstractC3358CGz;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchGenericListCardKt.logRowClick();
        this.$open.invoke(AuraMarkdownUrlResolversKt.resolveAttachmentRawUrl(this.$file, this.$userSession), this.$file.label);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
