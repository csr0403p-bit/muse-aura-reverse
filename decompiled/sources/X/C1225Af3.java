package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Af3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1225Af3 extends AbstractC7559F3s implements Function0<Unit> {
    public final /* synthetic */ BLU $parentBounds;
    public final /* synthetic */ long $popupContentSize;
    public final /* synthetic */ BO7 $popupPosition;
    public final /* synthetic */ long $windowSize;
    public final /* synthetic */ C1711Aou this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225Af3(BLU blu, C1711Aou c1711Aou, BO7 bo7, long j, long j2) {
        super(0);
        this.$popupPosition = bo7;
        this.this$0 = c1711Aou;
        this.$parentBounds = blu;
        this.$windowSize = j;
        this.$popupContentSize = j2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Unit invoke() {
        BO7 bo7 = this.$popupPosition;
        C1711Aou c1711Aou = this.this$0;
        bo7.element = c1711Aou.A01.mo11calculatePositionllwVHH4(this.$parentBounds, this.$windowSize, c1711Aou.A00, this.$popupContentSize);
        return Unit.INSTANCE;
    }
}
