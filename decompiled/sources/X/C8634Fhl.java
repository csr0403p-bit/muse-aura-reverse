package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* renamed from: X.Fhl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8634Fhl extends C7438Evz implements G0W {
    public final int $t;

    /* JADX WARN: Illegal instructions before constructor call */
    public C8634Fhl(Object obj, int i) {
        Class cls;
        String str;
        int i2;
        int i3;
        String str2;
        this.$t = i;
        switch (i) {
            case 0:
                cls = C5192Dd3.class;
                str = "getOrCompile(Ljava/lang/String;ILcom/instagram/common/bloks/BloksContext;)Ljava/util/List;";
                i2 = 0;
                i3 = 3;
                str2 = "getOrCompile";
                break;
            case 1:
                cls = GCV.class;
                str = "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V";
                i2 = 0;
                i3 = 3;
                str2 = "onCancellationImplDoNotCall";
                break;
            default:
                cls = GCV.class;
                str = "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V";
                i2 = 0;
                i3 = 3;
                str2 = "onCancellationChannelResultImplDoNotCall";
                break;
        }
        super(i3, obj, cls, str2, str, i2);
    }

    @Override // X.G0W
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.$t) {
            case 0:
                String str = (String) obj;
                int iA0F = AnonymousClass001.A0F(obj2);
                return ((C5192Dd3) AnonymousClass006.A0o(str, this)).A00((FBB) obj3, str, iA0F);
            case 1:
                GCV gcv = (GCV) this.receiver;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = GCV.A07;
                G0U<E, Unit> g0u = gcv.A00;
                C7384Etj.A0X(g0u);
                GCT.A01(obj2, (C78T) obj3, g0u);
                break;
            default:
                Object obj4 = ((HoI) obj2).A00;
                C78T c78t = (C78T) obj3;
                GCV gcv2 = (GCV) this.receiver;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = GCV.A07;
                G0U<E, Unit> g0u2 = gcv2.A00;
                C7384Etj.A0X(g0u2);
                if (obj4 instanceof C2zT) {
                    obj4 = null;
                }
                C7384Etj.A0X(obj4);
                GCT.A01(obj4, c78t, g0u2);
                break;
        }
        return Unit.INSTANCE;
    }
}
