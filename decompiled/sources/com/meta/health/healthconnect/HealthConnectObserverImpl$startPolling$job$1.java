package com.meta.health.healthconnect;

import X.AbstractC07127nr;
import X.C3UX;
import X.C8j3;
import X.G0V;
import X.HtJ;
import com.facebook.aura.ageverification.SelfieSnapshotKt;
import com.facebook.aura.composer.util.ImageCompressor;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.health.healthconnect.HealthConnectObserverImpl$startPolling$job$1", f = "HealthConnectObserverImpl.kt", l = {84, ImageCompressor.IMAGE_COMPRESSION_QUALITY, SelfieSnapshotKt.SELFIE_JPEG_QUALITY, 130, 139, 157, 176, 178}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class HealthConnectObserverImpl$startPolling$job$1 extends AbstractC07127nr implements G0V<C3UX, HtJ<? super Unit>, Object> {
    public int I$0;
    public int I$1;
    public int I$2;
    public long J$0;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public int label;
    public final /* synthetic */ HealthConnectObserverImpl this$0;

    public static void A0M(HealthConnectObserverImpl$startPolling$job$1 healthConnectObserverImpl$startPolling$job$1, Object obj, long j) {
        healthConnectObserverImpl$startPolling$job$1.L$1 = obj;
        healthConnectObserverImpl$startPolling$job$1.L$2 = null;
        healthConnectObserverImpl$startPolling$job$1.L$3 = null;
        healthConnectObserverImpl$startPolling$job$1.L$4 = null;
        healthConnectObserverImpl$startPolling$job$1.L$5 = null;
        healthConnectObserverImpl$startPolling$job$1.J$0 = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HealthConnectObserverImpl$startPolling$job$1(HealthConnectObserverImpl healthConnectObserverImpl, HtJ<? super HealthConnectObserverImpl$startPolling$job$1> htJ) {
        super(2, htJ);
        this.this$0 = healthConnectObserverImpl;
    }

    @Override // X.AbstractC8884Fsp
    public final HtJ<Unit> create(Object obj, HtJ<?> htJ) {
        HealthConnectObserverImpl$startPolling$job$1 healthConnectObserverImpl$startPolling$job$1 = new HealthConnectObserverImpl$startPolling$job$1(this.this$0, htJ);
        healthConnectObserverImpl$startPolling$job$1.L$0 = obj;
        return healthConnectObserverImpl$startPolling$job$1;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:21|(2:23|123)|26|27|(2:29|124)|31|159|(12:37|(4:40|(5:162|42|(6:46|(4:49|(3:169|51|172)(1:171)|170|47)|168|52|(2:55|53)|173)|56|167)(3:161|57|(3:163|59|166)(1:165))|164|38)|160|60|(2:63|(2:65|(3:156|67|126)(1:33))(1:155))(3:158|62|77)|(7:138|79|(3:136|81|(1:83))|86|142|87|(2:89|127))|94|(1:96)(1:97)|132|98|(4:100|116|18|(0)(0))(1:174)|34)|157|36|140|68|(2:70|125)|72|94|(0)(0)|132|98|(0)(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(7:138|79|(3:136|81|(1:83))|86|142|87|(2:89|127)) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x024f, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0250, code lost:
    
        r8 = r10;
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0262, code lost:
    
        X.CFK.A04("HealthConnectObserver", X.FGI.A0M("Health Connect polling authorization failure: ", r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0270, code lost:
    
        r20.L$0 = r5;
        A0M(r20, r8, 1000);
        r20.I$0 = 0;
        r20.label = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0284, code lost:
    
        if (X.C7Bq.A01(3600000, r20) != r4) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0286, code lost:
    
        r2 = 1000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x028b, code lost:
    
        X.CFK.A06("HealthConnectObserver", X.FGI.A0W("Health Connect polling error (attempt ", "): ", r7, r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0297, code lost:
    
        r20.L$0 = r5;
        A0M(r20, r8, r2);
        r20.I$0 = r9;
        r20.label = 8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x02a6, code lost:
    
        if (X.C7Bq.A01(r2, r20) == r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x02a8, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x02b4, code lost:
    
        r2 = (long) (r2 * 2.0d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0085, code lost:
    
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:?, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01eb, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x022a, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Path cross not found for [B:136:0x01f6, B:86:0x01ff], limit reached: 168 */
    /* JADX WARN: Path cross not found for [B:138:0x01f0, B:94:0x022e], limit reached: 168 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ec A[Catch: Exception -> 0x0253, CancellationException -> 0x02c0, TryCatch #1 {CancellationException -> 0x02c0, blocks: (B:21:0x008d, B:26:0x00b2, B:27:0x00b4, B:31:0x00ce, B:34:0x00e0, B:36:0x00e4, B:68:0x01b9, B:72:0x01e4, B:98:0x0238, B:37:0x00ec, B:38:0x00f2, B:40:0x00f8, B:42:0x0102, B:44:0x0108, B:56:0x016f, B:46:0x0115, B:47:0x0125, B:49:0x012b, B:51:0x013f, B:52:0x0145, B:53:0x014d, B:55:0x0153, B:57:0x0173, B:59:0x0177, B:60:0x0180, B:79:0x01f0, B:81:0x01f6, B:86:0x01ff, B:87:0x020f, B:63:0x0190, B:65:0x0194, B:33:0x00de, B:8:0x002e, B:12:0x0045, B:32:0x00db, B:71:0x01e1, B:30:0x00cb, B:25:0x00af), top: B:134:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0235  */
    @Override // X.AbstractC8884Fsp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.health.healthconnect.HealthConnectObserverImpl$startPolling$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.G0V
    public final /* bridge */ /* synthetic */ Object invoke(C3UX c3ux, HtJ<? super Unit> htJ) {
        return ((HealthConnectObserverImpl$startPolling$job$1) C8j3.A1E(htJ, c3ux, this)).invokeSuspend(Unit.INSTANCE);
    }
}
