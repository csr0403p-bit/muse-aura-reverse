package X;

import kotlin.Unit;

/* renamed from: X.BTz, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2325BTz extends AbstractC07127nr implements G0W {
    public final int $t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2325BTz(int i, HtJ<? super C2325BTz> htJ) {
        super(3, htJ);
        this.$t = i;
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        HtJ htJ;
        int i;
        if (this.$t != 0) {
            AnonymousClass005.A0w(obj);
            htJ = (HtJ) obj3;
            i = 1;
        } else {
            htJ = (HtJ) obj3;
            i = 0;
        }
        return new C2325BTz(i, htJ).invokeSuspend(Unit.INSTANCE);
    }

    @Override // X.AbstractC8884Fsp
    public final Object invokeSuspend(Object obj) {
        if (this.$t != 0) {
            Hwg.A00(obj);
            return AnonymousClass001.A0h();
        }
        Hwg.A00(obj);
        return Unit.INSTANCE;
    }
}
