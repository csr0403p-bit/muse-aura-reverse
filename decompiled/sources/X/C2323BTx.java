package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: X.BTx, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2323BTx extends AbstractC07117nq implements G0V {
    public final int $t;
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (LX/AWs;Lkotlin/jvm/functions/Function0<Lkotlin/Unit;>;LX/HtJ<-LX/BTx;>;)V */
    public C2323BTx(AWs aWs, HtJ htJ, Function0 function0) {
        super(2, htJ);
        this.$t = 2;
        this.A01 = aWs;
        this.A02 = function0;
    }

    public static final AWx A01(C1247Afe c1247Afe) {
        int i = c1247Afe.A00;
        if (i != 10 && i != 11 && i != 12) {
            return null;
        }
        List<C1299Agk> list = c1247Afe.A05;
        C1299Agk c1299Agk = (C1299Agk) AbstractC0878AGe.A0G(list);
        if (c1299Agk == null) {
            return null;
        }
        long j = c1299Agk.A09 ^ (-9223372034707292160L);
        List list2 = c1299Agk.A02;
        if (list2 == null) {
            list2 = C0881AGi.A00;
        }
        AWx aWxA0B = AWx.A0B(0L);
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            aWxA0B = AWx.A0B(AWx.A04(aWxA0B.A00, ((C1301Agm) list2.get(i2)).A02));
        }
        long jA05 = AWx.A05(j, aWxA0B.A00);
        if (jA05 == 0) {
            return null;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C1299Agk.A00(list, i3);
        }
        return AWx.A0B(jA05);
    }

    public static final Float A02(C1247Afe c1247Afe) {
        int i = c1247Afe.A00;
        if (i == 7 || i == 8 || i == 9) {
            List<C1299Agk> list = c1247Afe.A05;
            int size = list.size();
            float f = 1.0f;
            for (int i2 = 0; i2 < size; i2++) {
                C1299Agk c1299AgkA0h = C8j3.A0h(list, i2);
                f *= c1299AgkA0h.A06;
                List list2 = c1299AgkA0h.A02;
                if (list2 == null) {
                    list2 = C0881AGi.A00;
                }
                int size2 = list2.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    f *= ((C1301Agm) list2.get(i3)).A01;
                }
            }
            if (f != 1.0f) {
                int size3 = list.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    C1299Agk.A00(list, i4);
                }
                return Float.valueOf(f);
            }
        }
        return null;
    }

    public static final AWx A00(InterfaceC1285AgV interfaceC1285AgV, C1247Afe c1247Afe) {
        long jA05;
        if (!AnonymousClass002.A1L(c1247Afe.A03 & 4096)) {
            return null;
        }
        int i = c1247Afe.A00;
        if (i != 6 && i != 10 && i != 11 && i != 12) {
            return null;
        }
        long jA5m = interfaceC1285AgV.A5m(c1247Afe);
        List<C1299Agk> list = c1247Afe.A05;
        C1299Agk c1299Agk = (C1299Agk) AbstractC0878AGe.A0G(list);
        if (c1299Agk != null) {
            long j = c1299Agk.A09 ^ (-9223372034707292160L);
            List list2 = c1299Agk.A02;
            if (list2 == null) {
                list2 = C0881AGi.A00;
            }
            AWx aWxA0B = AWx.A0B(0L);
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                aWxA0B = AWx.A0B(AWx.A04(aWxA0B.A00, ((C1301Agm) list2.get(i2)).A02));
            }
            jA05 = AWx.A05(j, aWxA0B.A00);
        } else {
            jA05 = 0;
        }
        long jA052 = AWx.A05(jA5m, jA05);
        if (jA052 == 0) {
            return null;
        }
        int size2 = list.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C1299Agk.A00(list, i3);
        }
        return AWx.A0B(jA052);
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        switch (this.$t) {
            case 0:
                obj2 = this.A02;
                obj3 = this.A03;
                obj4 = this.A01;
                i = 0;
                break;
            case 1:
                C2323BTx c2323BTx = new C2323BTx((C1221Aez) this.A04, htJ);
                c2323BTx.A01 = obj;
                return c2323BTx;
            case 2:
                C2323BTx c2323BTx2 = new C2323BTx((AWs) this.A01, htJ, (Function0) this.A02);
                c2323BTx2.A03 = obj;
                return c2323BTx2;
            default:
                obj4 = this.A01;
                obj2 = this.A02;
                obj3 = this.A03;
                i = 3;
                break;
        }
        C2323BTx c2323BTx3 = new C2323BTx(obj3, obj2, obj4, htJ, i);
        c2323BTx3.A04 = obj;
        return c2323BTx3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (X.HzS.A06((X.C78T) r17.A02) != false) goto L48;
     */
    /* JADX WARN: Path cross not found for [B:114:0x0283, B:170:0x037f], limit reached: 297 */
    /* JADX WARN: Path cross not found for [B:116:0x0292, B:170:0x037f], limit reached: 297 */
    /* JADX WARN: Path cross not found for [B:122:0x02ae, B:169:0x037b], limit reached: 297 */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03e4 A[PHI: r5
  0x03e4: PHI (r5v12 X.AHm) = (r5v11 X.AHm), (r5v11 X.AHm), (r5v14 X.AHm) binds: [B:190:0x03bd, B:192:0x03c1, B:203:0x03e9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0446 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:291:? A[LOOP:7: B:187:0x03b6->B:291:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014b A[Catch: all -> 0x04ad, TryCatch #0 {all -> 0x04ad, blocks: (B:68:0x0181, B:69:0x0184, B:71:0x018c, B:65:0x015b, B:48:0x00e6, B:52:0x00f5, B:56:0x010d, B:57:0x011a, B:61:0x0143, B:63:0x014b, B:64:0x0150, B:72:0x018f, B:73:0x019a, B:77:0x01d5, B:79:0x01e1, B:60:0x0140, B:76:0x01d2, B:51:0x00f2), top: B:252:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018c A[Catch: all -> 0x04ad, TryCatch #0 {all -> 0x04ad, blocks: (B:68:0x0181, B:69:0x0184, B:71:0x018c, B:65:0x015b, B:48:0x00e6, B:52:0x00f5, B:56:0x010d, B:57:0x011a, B:61:0x0143, B:63:0x014b, B:64:0x0150, B:72:0x018f, B:73:0x019a, B:77:0x01d5, B:79:0x01e1, B:60:0x0140, B:76:0x01d2, B:51:0x00f2), top: B:252:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f A[Catch: all -> 0x04ad, TryCatch #0 {all -> 0x04ad, blocks: (B:68:0x0181, B:69:0x0184, B:71:0x018c, B:65:0x015b, B:48:0x00e6, B:52:0x00f5, B:56:0x010d, B:57:0x011a, B:61:0x0143, B:63:0x014b, B:64:0x0150, B:72:0x018f, B:73:0x019a, B:77:0x01d5, B:79:0x01e1, B:60:0x0140, B:76:0x01d2, B:51:0x00f2), top: B:252:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e1 A[Catch: all -> 0x04ad, TRY_LEAVE, TryCatch #0 {all -> 0x04ad, blocks: (B:68:0x0181, B:69:0x0184, B:71:0x018c, B:65:0x015b, B:48:0x00e6, B:52:0x00f5, B:56:0x010d, B:57:0x011a, B:61:0x0143, B:63:0x014b, B:64:0x0150, B:72:0x018f, B:73:0x019a, B:77:0x01d5, B:79:0x01e1, B:60:0x0140, B:76:0x01d2, B:51:0x00f2), top: B:252:0x00c8 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0234  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:100:0x0248 -> B:88:0x020c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x02be -> B:128:0x02cf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x0444 -> B:215:0x041f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:55:0x010b -> B:48:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0149 -> B:80:0x01e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x014b -> B:57:0x011a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x017d -> B:69:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x01df -> B:80:0x01e4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x01e1 -> B:73:0x019a). Please report as a decompilation issue!!! */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 1228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2323BTx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C2323BTx) C8j3.A1E(obj2, obj, this)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2323BTx(C1221Aez c1221Aez, HtJ<? super C2323BTx> htJ) {
        super(2, htJ);
        this.$t = 1;
        this.A04 = c1221Aez;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2323BTx(Object obj, C78T c78t, InterfaceC1285AgV interfaceC1285AgV, HzR<BRI> hzR, HtJ<? super C2323BTx> htJ) {
        super(2, hzR);
        this.$t = htJ;
        this.A02 = c78t;
        this.A03 = obj;
        this.A01 = interfaceC1285AgV;
    }
}
