package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.DAy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4879DAy extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ int $idx;
    public final /* synthetic */ DB0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4879DAy(DB0 db0, int i) {
        super(0);
        this.this$0 = db0;
        this.$idx = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        this.this$0.A01.A00(this.$idx, false);
        return Unit.INSTANCE;
    }
}
