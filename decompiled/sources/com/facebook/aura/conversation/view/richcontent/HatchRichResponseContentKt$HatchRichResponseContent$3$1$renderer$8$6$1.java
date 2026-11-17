package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.G0V;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8$6$1 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ String $fileName;
    public final /* synthetic */ G0V<String, String, Unit> $onInlineFileClick;
    public final /* synthetic */ String $url;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HatchRichResponseContentKt$HatchRichResponseContent$3$1$renderer$8$6$1(G0V<? super String, ? super String, Unit> g0v, String str, String str2) {
        super(0);
        this.$onInlineFileClick = g0v;
        this.$url = str;
        this.$fileName = str2;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        G0V<String, String, Unit> g0v = this.$onInlineFileClick;
        if (g0v != null) {
            g0v.invoke(this.$url, this.$fileName);
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }
}
