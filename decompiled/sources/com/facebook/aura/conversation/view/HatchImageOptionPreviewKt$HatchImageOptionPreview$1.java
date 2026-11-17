package com.facebook.aura.conversation.view;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionPreviewKt$HatchImageOptionPreview$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ long $dimColor;
    public final /* synthetic */ String $hostMessageId;
    public final /* synthetic */ List<String> $images;
    public final /* synthetic */ Function0<Unit> $onClosed;
    public final /* synthetic */ ImageOptionPreviewRequest $request;
    public final /* synthetic */ String $widgetId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchImageOptionPreviewKt$HatchImageOptionPreview$1(ImageOptionPreviewRequest imageOptionPreviewRequest, List<String> list, long j, String str, String str2, Function0<Unit> function0, int i) {
        super(2);
        this.$request = imageOptionPreviewRequest;
        this.$images = list;
        this.$dimColor = j;
        this.$widgetId = str;
        this.$hostMessageId = str2;
        this.$onClosed = function0;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        HatchImageOptionPreviewKt.m609HatchImageOptionPreviewT042LqI(this.$request, this.$images, this.$dimColor, this.$widgetId, this.$hostMessageId, this.$onClosed, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
