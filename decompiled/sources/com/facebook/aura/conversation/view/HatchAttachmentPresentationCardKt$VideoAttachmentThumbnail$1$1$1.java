package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.G0V;
import com.facebook.aura.model.HatchAttachmentFile;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchAttachmentPresentationCardKt$VideoAttachmentThumbnail$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ G0V<String, String, Unit> $it;
    public final /* synthetic */ String $url;
    public final /* synthetic */ HatchAttachmentFile $video;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchAttachmentPresentationCardKt$VideoAttachmentThumbnail$1$1$1(G0V<? super String, ? super String, Unit> g0v, String str, HatchAttachmentFile hatchAttachmentFile) {
        super(0);
        this.$it = g0v;
        this.$url = str;
        this.$video = hatchAttachmentFile;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$it.invoke(this.$url, this.$video.label);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
