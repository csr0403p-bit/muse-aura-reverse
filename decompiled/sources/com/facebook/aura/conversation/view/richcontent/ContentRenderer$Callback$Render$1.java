package com.facebook.aura.conversation.view.richcontent;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass011;
import X.BFM;
import X.G0V;
import com.facebook.aura.conversation.view.richcontent.ContentRenderer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class ContentRenderer$Callback$Render$1 extends AbstractC7559F3s implements G0V<BFM, Integer, Unit> {
    public final /* synthetic */ int $$changed;
    public final /* synthetic */ Function0<Unit> $onCompleted;
    public final /* synthetic */ ContentRenderer.Callback $tmp0_rcvr;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentRenderer$Callback$Render$1(ContentRenderer.Callback callback, Function0<Unit> function0, int i) {
        super(2);
        this.$tmp0_rcvr = callback;
        this.$onCompleted = function0;
        this.$$changed = i;
    }

    @Override // X.G0V
    public /* bridge */ /* synthetic */ Unit invoke(BFM bfm, Integer num) {
        invoke(bfm, AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }

    public final void invoke(BFM bfm, int i) {
        this.$tmp0_rcvr.Render(this.$onCompleted, bfm, AnonymousClass011.A00(this.$$changed));
    }
}
