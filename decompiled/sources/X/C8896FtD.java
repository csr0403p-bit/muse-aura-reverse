package X;

import android.media.AudioManager;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.FtD, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8896FtD extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8896FtD(Object obj, MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, HoC hoC, AudioManager audioManager, HtJ<? super C8896FtD> htJ) {
        super(2, audioManager);
        this.$t = htJ;
        this.A04 = metaAiRsysSdkRealTimeSession;
        this.A03 = hoC;
        this.A02 = obj;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        switch (this.$t) {
            case 0:
                obj4 = this.A01;
                obj2 = this.A04;
                obj3 = this.A02;
                obj5 = this.A03;
                i = 0;
                break;
            case 1:
                obj2 = this.A04;
                obj3 = this.A02;
                obj4 = this.A01;
                obj5 = this.A03;
                i = 1;
                break;
            case 2:
                obj2 = this.A04;
                obj5 = this.A03;
                obj4 = this.A01;
                obj3 = this.A02;
                i = 2;
                break;
            case 3:
                Object obj6 = this.A03;
                C8896FtD c8896FtD = new C8896FtD(this.A02, this.A04, obj6, htJ, 3);
                c8896FtD.A01 = obj;
                return c8896FtD;
            case 4:
                obj2 = this.A04;
                obj4 = this.A01;
                obj3 = this.A02;
                obj5 = this.A03;
                i = 4;
                break;
            case 5:
                return new C8896FtD(this.A02, this.A04, this.A03, htJ, 5);
            case 6:
                obj2 = this.A04;
                obj3 = this.A02;
                obj4 = this.A01;
                obj5 = this.A03;
                i = 6;
                break;
            default:
                obj2 = this.A04;
                obj3 = this.A02;
                obj4 = this.A01;
                obj5 = this.A03;
                i = 7;
                break;
        }
        return new C8896FtD(obj4, obj2, obj5, obj3, htJ, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:228:0x04d0 A[Catch: Exception -> 0x04f3, CancellationException -> 0x04fb, TryCatch #2 {CancellationException -> 0x04fb, Exception -> 0x04f3, blocks: (B:214:0x0485, B:215:0x0488, B:217:0x0494, B:219:0x0497, B:221:0x049b, B:222:0x04a5, B:226:0x04ca, B:228:0x04d0, B:229:0x04d5, B:234:0x04e0, B:236:0x04eb, B:225:0x04c7, B:211:0x0471), top: B:251:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x04de  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x04eb A[Catch: Exception -> 0x04f3, CancellationException -> 0x04fb, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x04fb, Exception -> 0x04f3, blocks: (B:214:0x0485, B:215:0x0488, B:217:0x0494, B:219:0x0497, B:221:0x049b, B:222:0x04a5, B:226:0x04ca, B:228:0x04d0, B:229:0x04d5, B:234:0x04e0, B:236:0x04eb, B:225:0x04c7, B:211:0x0471), top: B:251:0x0469 }] */
    /* JADX WARN: Removed duplicated region for block: B:248:0x050c A[PHI: r3
  0x050c: PHI (r3v31 java.lang.Object) = (r3v25 java.lang.Object), (r3v0 java.lang.Object), (r3v34 java.lang.Object) binds: [B:32:0x00ab, B:247:0x0509, B:10:0x0035] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8896FtD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8896FtD) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8896FtD(Object obj, C9703GeH c9703GeH, InterfaceC10512HoG interfaceC10512HoG, List<? extends AbstractC10579HwA> list, InterfaceC9765GfJ interfaceC9765GfJ, HtJ<? super C8896FtD> htJ) {
        super(2, interfaceC9765GfJ);
        this.$t = htJ;
        this.A04 = c9703GeH;
        this.A01 = obj;
        this.A02 = list;
        this.A03 = interfaceC10512HoG;
    }
}
