package com.facebook.aura.conversation.view;

import X.AbstractC0878AGe;
import X.AbstractC7559F3s;
import X.G0U;
import X.G0W;
import com.facebook.aura.model.ImageOptionsWidgetData;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class HatchImageOptionsWidgetKt$SingleSelectImageOptions$1$1$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ ImageOptionsWidgetData $data;
    public final /* synthetic */ int $index;
    public final /* synthetic */ boolean $isPrimaryThread;
    public final /* synthetic */ G0W<String, String, String, Unit> $onSendSelectionText;
    public final /* synthetic */ G0U<String, Unit> $onSetSelectedPath;
    public final /* synthetic */ String $selectionMessage;
    public final /* synthetic */ Map<String, String> $threadLogMetadata;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchImageOptionsWidgetKt$SingleSelectImageOptions$1$1$1(boolean z, Map<String, String> map, ImageOptionsWidgetData imageOptionsWidgetData, int i, G0U<? super String, Unit> g0u, G0W<? super String, ? super String, ? super String, Unit> g0w, String str) {
        super(0);
        this.$isPrimaryThread = z;
        this.$threadLogMetadata = map;
        this.$data = imageOptionsWidgetData;
        this.$index = i;
        this.$onSetSelectedPath = g0u;
        this.$onSendSelectionText = g0w;
        this.$selectionMessage = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        HatchImageOptionsWidgetKt.logImageOptionsConfirmClick(this.$isPrimaryThread, this.$threadLogMetadata);
        String str = this.$data.images.get(this.$index);
        this.$onSetSelectedPath.invoke(str);
        this.$onSendSelectionText.invoke(this.$selectionMessage, str, AbstractC0878AGe.A0A(this.$index, this.$data.imageIds));
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
