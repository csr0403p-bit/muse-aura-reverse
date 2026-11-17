package X;

import android.media.AudioManager;
import com.facebook.rp.platform.metaai.rsys.MetaAiRsysSdkRealTimeSession;
import java.util.List;
import kotlin.Unit;

/* renamed from: X.FtE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8897FtE extends AbstractC07127nr implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public final Object A03;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8897FtE(G0U<? super G0V<? super InterfaceC10512HoG, ? super V, Unit>, Unit> g0u, HtJ<? super C8897FtE> htJ) {
        super(2, htJ);
        this.$t = 1;
        this.A03 = g0u;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7 A[RETURN] */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8897FtE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[PHI: r2
  0x0078: PHI (r2v2 java.lang.String) = (r2v1 java.lang.String), (r2v7 java.lang.String) binds: [B:18:0x003e, B:25:0x0058] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A0M(X.C9607GRo r8, X.HtJ<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof X.C9610GRs
            if (r0 == 0) goto L8d
            r4 = r9
            X.GRs r4 = (X.C9610GRs) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8d
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r5 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 != r3) goto L93
            java.lang.Object r8 = r4.L$0
            X.GRo r8 = (X.C9607GRo) r8
        L21:
            X.Hwg.A00(r1)
        L24:
            X.GQq r7 = r8.A04
            java.lang.String r6 = "0"
            r2 = 9
            X.GR9 r1 = r7.A0C
            if (r1 == 0) goto L8b
            X.G50<com.facebook.rsys.audio.gen.AudioApi> r0 = com.facebook.rsys.audio.gen.AudioApi.CONVERTER
            java.lang.Object r0 = r1.ACQ(r0)
            com.facebook.rsys.audio.gen.AudioApi r0 = (com.facebook.rsys.audio.gen.AudioApi) r0
            if (r0 == 0) goto L8b
            int r6 = r0.getAudioLevel(r6, r2)
        L3c:
            java.lang.String r2 = r8.A02
            if (r2 != 0) goto L78
            X.GRZ r0 = r8.A05
            X.GRH r1 = X.C9659Gcj.A00(r0)
            java.lang.Class<com.facebook.rsys.call.gen.CallModel> r0 = com.facebook.rsys.call.gen.CallModel.class
            java.lang.Object r0 = r1.A00(r0)
            com.facebook.rsys.call.gen.CallModel r0 = (com.facebook.rsys.call.gen.CallModel) r0
            if (r0 == 0) goto L76
            com.facebook.rsys.call.gen.CallParticipant r0 = r0.selfParticipant
            if (r0 == 0) goto L76
            java.lang.String r2 = r0.userId
        L56:
            r8.A02 = r2
            if (r2 != 0) goto L78
        L5a:
            r2 = 0
        L5b:
            X.BLG<X.59a> r1 = r8.A08
            X.59a r0 = new X.59a
            r0.<init>(r6, r2)
            X.AnonymousClass002.A1I(r1, r0)
            long r0 = r8.A01
            r4.L$0 = r8
            r4.I$0 = r6
            r4.I$1 = r2
            r4.label = r3
            java.lang.Object r0 = X.C7Bq.A01(r0, r4)
            if (r0 != r5) goto L24
            return r5
        L76:
            r2 = 0
            goto L56
        L78:
            X.GR9 r1 = r7.A0C
            if (r1 == 0) goto L5a
            X.G50<com.facebook.rsys.audio.gen.AudioApi> r0 = com.facebook.rsys.audio.gen.AudioApi.CONVERTER
            java.lang.Object r0 = r1.ACQ(r0)
            com.facebook.rsys.audio.gen.AudioApi r0 = (com.facebook.rsys.audio.gen.AudioApi) r0
            if (r0 == 0) goto L5a
            int r2 = r0.getAudioLevel(r2, r3)
            goto L5b
        L8b:
            r6 = 0
            goto L3c
        L8d:
            X.GRs r4 = new X.GRs
            r4.<init>(r9)
            goto L12
        L93:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8897FtE.A0M(X.GRo, X.HtJ):X.Hji");
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        int i;
        Object obj4;
        Object obj5;
        Object obj6;
        int i2;
        C8897FtE c8897FtE;
        switch (this.$t) {
            case 0:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 0;
                C8897FtE c8897FtE2 = new C8897FtE(obj3, (List<C8962Fuf>) obj2, (InterfaceC8975FvZ) htJ, (HtJ<? super C8897FtE>) i);
                c8897FtE2.A02 = obj;
                return c8897FtE2;
            case 1:
                c8897FtE = new C8897FtE((G0U) this.A03, htJ);
                c8897FtE.A01 = obj;
                return c8897FtE;
            case 2:
                obj6 = this.A01;
                obj4 = this.A02;
                obj5 = this.A03;
                i2 = 2;
                return new C8897FtE(obj5, obj4, obj6, htJ, i2);
            case 3:
                obj6 = this.A01;
                obj4 = this.A02;
                obj5 = this.A03;
                i2 = 3;
                return new C8897FtE(obj5, obj4, obj6, htJ, i2);
            case 4:
                obj6 = this.A01;
                obj4 = this.A02;
                obj5 = this.A03;
                i2 = 4;
                return new C8897FtE(obj5, obj4, obj6, htJ, i2);
            case 5:
                obj4 = this.A02;
                obj6 = this.A01;
                obj5 = this.A03;
                i2 = 5;
                return new C8897FtE(obj5, obj4, obj6, htJ, i2);
            case 6:
                obj4 = this.A02;
                obj6 = this.A01;
                obj5 = this.A03;
                i2 = 6;
                return new C8897FtE(obj5, obj4, obj6, htJ, i2);
            case 7:
                obj4 = this.A02;
                obj6 = this.A01;
                obj5 = this.A03;
                i2 = 7;
                return new C8897FtE(obj5, obj4, obj6, htJ, i2);
            case 8:
                obj4 = this.A02;
                obj5 = this.A03;
                obj6 = this.A01;
                i2 = 8;
                return new C8897FtE(obj5, obj4, obj6, htJ, i2);
            case 9:
                c8897FtE = new C8897FtE(this.A02, (C9607GRo) htJ, (C10543Hqv<HoC>) this.A03, (HtJ<? super C8897FtE>) 9);
                c8897FtE.A01 = obj;
                return c8897FtE;
            case 10:
                obj4 = this.A02;
                obj5 = this.A03;
                obj6 = this.A01;
                i2 = 10;
                return new C8897FtE(obj5, obj4, obj6, htJ, i2);
            case 11:
                obj2 = this.A01;
                obj3 = this.A03;
                i = 11;
                C8897FtE c8897FtE22 = new C8897FtE(obj3, (List<C8962Fuf>) obj2, (InterfaceC8975FvZ) htJ, (HtJ<? super C8897FtE>) i);
                c8897FtE22.A02 = obj;
                return c8897FtE22;
            default:
                c8897FtE = new C8897FtE(this.A02, (C9607GRo) htJ, (C10543Hqv<HoC>) this.A03, (HtJ<? super C8897FtE>) 12);
                c8897FtE.A01 = obj;
                return c8897FtE;
        }
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C8897FtE) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8897FtE(Object obj, MetaAiRsysSdkRealTimeSession metaAiRsysSdkRealTimeSession, AudioManager audioManager, GXX gxx, HtJ<? super C8897FtE> htJ) {
        super(2, gxx);
        this.$t = htJ;
        this.A02 = metaAiRsysSdkRealTimeSession;
        this.A03 = obj;
        this.A01 = audioManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8897FtE(Object obj, List<C8962Fuf> list, InterfaceC8975FvZ interfaceC8975FvZ, HtJ<? super C8897FtE> htJ) {
        super(2, interfaceC8975FvZ);
        this.$t = htJ;
        this.A01 = list;
        this.A03 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C8897FtE(Object obj, C9607GRo c9607GRo, C10543Hqv<HoC> c10543Hqv, HtJ<? super C8897FtE> htJ) {
        super(2, c9607GRo);
        this.$t = htJ;
        this.A02 = obj;
        this.A03 = c10543Hqv;
    }
}
