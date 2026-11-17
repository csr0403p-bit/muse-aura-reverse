package com.facebook.aura.vds.compose.input;

import X.AbstractC7559F3s;
import X.BQG;
import X.C1805ArO;
import X.C7384Etj;
import X.G0U;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class AuraCodeInputKt$AuraCodeInput$4$3$1 extends AbstractC7559F3s implements G0U<C1805ArO, Unit> {
    public final /* synthetic */ CodeFieldEditor $editor;
    public final /* synthetic */ int $length;
    public final /* synthetic */ G0U<String, Unit> $onValueChange;

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(C1805ArO c1805ArO) {
        C7384Etj.A0Y(c1805ArO, 0);
        this.$onValueChange.invoke(BQG.A17(this.$editor.record(c1805ArO), this.$length));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AuraCodeInputKt$AuraCodeInput$4$3$1(G0U<? super String, Unit> g0u, CodeFieldEditor codeFieldEditor, int i) {
        super(1);
        this.$onValueChange = g0u;
        this.$editor = codeFieldEditor;
        this.$length = i;
    }

    @Override // X.G0U
    public /* bridge */ /* synthetic */ Unit invoke(C1805ArO c1805ArO) {
        invoke2(c1805ArO);
        return Unit.INSTANCE;
    }
}
