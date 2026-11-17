package X;

import kotlin.jvm.functions.Function0;

/* renamed from: X.DaW, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C5142DaW extends AbstractC7559F3s implements Function0<AbstractC5160Daq> {
    public final /* synthetic */ int $prefixCount;
    public final /* synthetic */ int $prefixEnd;
    public final /* synthetic */ int[] $prefixPositions;
    public final /* synthetic */ C5130DaE this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5142DaW(C5130DaE c5130DaE, int[] iArr, int i, int i2) {
        super(0);
        this.this$0 = c5130DaE;
        this.$prefixPositions = iArr;
        this.$prefixCount = i;
        this.$prefixEnd = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ AbstractC5160Daq invoke() {
        return new C5132DaL(this.this$0, this.$prefixPositions, this.$prefixCount, this.$prefixEnd);
    }
}
