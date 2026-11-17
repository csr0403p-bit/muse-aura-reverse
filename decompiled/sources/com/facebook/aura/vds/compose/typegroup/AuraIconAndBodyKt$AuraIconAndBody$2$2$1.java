package com.facebook.aura.vds.compose.typegroup;

import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.ApQ;
import X.C1733ApU;
import X.C1OR;
import X.G0U;
import com.facebook.aura.vds.compose.ext.StringExtKt;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraIconAndBodyKt$AuraIconAndBody$2$2$1 extends AbstractC7559F3s implements G0U<Integer, Unit> {
    public final /* synthetic */ ApQ $text;
    public final /* synthetic */ G0U<String, Unit> $textOnUrlClick;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraIconAndBodyKt$AuraIconAndBody$2$2$1(ApQ apQ, G0U<? super String, Unit> g0u) {
        super(1);
        this.$text = apQ;
        this.$textOnUrlClick = g0u;
    }

    public final void invoke(int i) {
        C1OR c1or;
        String str;
        C1733ApU<C1OR> firstUrlAnnotation = StringExtKt.getFirstUrlAnnotation(this.$text, i);
        if (firstUrlAnnotation == null || (c1or = firstUrlAnnotation.A02) == null || (str = c1or.A00) == null) {
            return;
        }
        this.$textOnUrlClick.invoke(str);
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(AnonymousClass001.A0F(num));
        return Unit.INSTANCE;
    }
}
