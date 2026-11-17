package X;

import kotlin.Unit;

/* renamed from: X.DAc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4875DAc extends AbstractC7559F3s implements G0U<String, Unit> {
    public final /* synthetic */ int $idx;
    public final /* synthetic */ DB0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4875DAc(DB0 db0, int i) {
        super(1);
        this.this$0 = db0;
        this.$idx = i;
    }

    @Override // X.G0U
    public final /* bridge */ /* synthetic */ Unit invoke(String str) {
        short s;
        boolean z;
        String strA13 = C8j3.A13(str);
        HxE<Boolean, Boolean> hxEA00 = this.this$0.A01.A00(this.$idx, true);
        boolean zA1X = AnonymousClass001.A1X(hxEA00.first);
        boolean zA1X2 = AnonymousClass001.A1X(hxEA00.second);
        ((DAZ) this.this$0).A02.markerPoint(FGI.A0M("signal_", strA13));
        DB0 db0 = this.this$0;
        if (!((DAZ) db0).A04.get()) {
            if (zA1X) {
                s = 2;
                z = true;
            } else if (zA1X2) {
                s = 2;
                z = false;
            }
            DAZ.A00(db0, strA13, null, s, z);
        }
        return Unit.INSTANCE;
    }
}
