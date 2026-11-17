package com.facebook.aura.sharesheet;

import X.AbstractC07127nr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C3UX;
import X.G0V;
import X.HtJ;
import X.Hwg;
import com.facebook.aura.markdown.parser.ast.AuraMarkdownDocument;
import com.facebook.aura.markdown.parser.custom.AuraMarkdown;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.aura.sharesheet.HatchMessageShareImageRenderer$render$4$document$1", f = "HatchMessageShareImageRenderer.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class HatchMessageShareImageRenderer$render$4$document$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super AuraMarkdownDocument>, Object> {
    public final /* synthetic */ String $message;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HatchMessageShareImageRenderer$render$4$document$1(String str, HtJ<? super HatchMessageShareImageRenderer$render$4$document$1> htJ) {
        super(2, htJ);
        this.$message = str;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        return new HatchMessageShareImageRenderer$render$4$document$1(this.$message, htJ);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw AnonymousClass001.A0n();
        }
        Hwg.A00(obj);
        return AuraMarkdown.INSTANCE.parse(AnonymousClass002.A0l(this.$message), true);
    }

    @Override // X.G0V
    public final Object invoke(C3UX c3ux, HtJ<? super AuraMarkdownDocument> htJ) {
        return new HatchMessageShareImageRenderer$render$4$document$1(this.$message, htJ).invokeSuspend(Unit.INSTANCE);
    }
}
