package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1;
import com.facebook.aura.analytics.impl.MetaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.jni.CppException;
import java.util.AbstractCollection;
import java.util.Map;
import java.util.Set;

/* renamed from: X.DGt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class HandlerC4948DGt extends Handler implements DG8 {
    public C4949DGw A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1 A09;
    public final MetaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1 A0A;
    public final C4943DGh A0B;
    public final Object A0C;
    public final Map<String, Long> A0D;
    public final Set<String> A0E;
    public final F0C A0F;
    public final F0C A0G;
    public final AIG<C4932DFh> A0H;
    public final boolean A0I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HandlerC4948DGt(Looper looper, C4949DGw c4949DGw, MetaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1 metaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1, MetaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1 metaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1, C4943DGh c4943DGh, Map map, Set set) {
        super(looper);
        Object objA0T = C3cG.A0T();
        C7384Etj.A0Y(c4949DGw, 5);
        this.A09 = metaAnalyticsBuilder$maybeEnableOneFabric$latencyResolver$1;
        this.A0B = c4943DGh;
        this.A0I = true;
        this.A00 = c4949DGw;
        this.A0A = metaAnalyticsBuilder$maybeEnableOneFabric$startupStatusProvider$1;
        this.A08 = 400;
        this.A0E = set;
        this.A0D = map;
        this.A0C = objA0T;
        this.A0G = new C5322DgG(null, C6724EXi.A00(5));
        this.A0F = C5322DgG.A00(this, 2);
        this.A07 = 1;
        this.A03 = 2;
        this.A01 = 3;
        this.A04 = 4;
        this.A05 = 5;
        this.A06 = 6;
        this.A02 = 7;
        this.A0H = new AIG<>();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.util.AbstractMap, java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.util.AbstractMap, java.util.HashMap] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        C7384Etj.A0Y(message, 0);
        int i = message.what;
        if (i != this.A01) {
            int i2 = this.A07;
            if (i != i2) {
                if (i != this.A03) {
                    if (i == this.A04) {
                        FFSingletonJNILogger.pauseTasksForInternalUse();
                        return;
                    }
                    if (i == this.A05) {
                        FFSingletonJNILogger.resumeTasksForInternalUse();
                        return;
                    }
                    if (i != this.A06) {
                        if (i == this.A02) {
                            FFSingletonJNILogger.setAppStarting(false);
                            return;
                        }
                        return;
                    }
                    Object obj = message.obj;
                    C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.Boolean");
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    A00();
                    if (zBooleanValue) {
                        FFSingletonJNILogger.triggerUploadFlushDirectlyForInternalUse();
                        return;
                    } else {
                        FFSingletonJNILogger.triggerUploadNowForInternalUse();
                        return;
                    }
                }
                if (this.A00.A00 != 0) {
                    A00();
                }
                Object obj2 = message.obj;
                C7384Etj.A0Z(obj2, "null cannot be cast to non-null type com.facebook.analytics2.identity.IdentitiesDescriptor");
                C4949DGw c4949DGw = (C4949DGw) obj2;
                this.A00 = c4949DGw;
                if (c4949DGw.A00 == 0) {
                    return;
                }
            }
            A00();
            sendEmptyMessageDelayed(i2, 500L);
            return;
        }
        if (!this.A0I) {
            AbstractCollection abstractCollection = this.A0H;
            Object obj3 = message.obj;
            C7384Etj.A0Z(obj3, "null cannot be cast to non-null type com.facebook.analytics2.fabric.handler.EventDataWithLatency");
            abstractCollection.add(obj3);
            return;
        }
        F0C f0c = this.A0F;
        DGz dGz = (DGz) f0c.getValue();
        if (dGz.A00 == dGz.A01) {
            A00();
        }
        Object obj4 = message.obj;
        C7384Etj.A0Z(obj4, "null cannot be cast to non-null type com.facebook.analytics2.fabric.handler.EventDataWithLatency");
        C4932DFh c4932DFh = (C4932DFh) obj4;
        if (c4932DFh.A00 == 0) {
            DH2.A02.A00(c4932DFh.A09);
            c4932DFh.A00 = this.A00.A00;
        }
        c4932DFh.A01 = this.A09.resolveLatency(c4932DFh.A01);
        Map<String, Long> map = this.A0D;
        String str = c4932DFh.A09;
        Long l = map.get(str);
        if (l != null) {
            long jLongValue = l.longValue();
            if (jLongValue >= 0) {
                c4932DFh.A01 = jLongValue;
            }
        }
        String str2 = c4932DFh.A04;
        if (str2 == null) {
            Object obj5 = AbstractC3344CFp.A00(c4932DFh.A07).get("extra");
            C7384Etj.A0Z(obj5, "null cannot be cast to non-null type kotlin.String");
            str2 = (String) obj5;
            c4932DFh.A04 = str2;
        }
        if (str2 == null) {
            Object obj6 = AbstractC3344CFp.A00(c4932DFh.A07).get("extra");
            C7384Etj.A0Z(obj6, "null cannot be cast to non-null type kotlin.String");
            c4932DFh.A04 = (String) obj6;
        }
        DGz dGz2 = (DGz) f0c.getValue();
        long[] jArr = dGz2.A03;
        int i3 = dGz2.A00;
        jArr[i3] = c4932DFh.A00;
        dGz2.A04[i3] = c4932DFh.A05;
        dGz2.A08[i3] = str;
        dGz2.A06[i3] = c4932DFh.A06;
        dGz2.A05[i3] = c4932DFh.A01;
        dGz2.A07[i3] = c4932DFh.A04;
        dGz2.A09[i3] = c4932DFh.A0A;
        int[] iArr = dGz2.A02;
        C4934DFk c4934DFk = c4932DFh.A08;
        iArr[i3] = c4934DFk.A00;
        dGz2.A0A[i3] = c4934DFk.A04;
        dGz2.A00 = i3 + 1;
        if (c4932DFh.A0B || this.A00.A09 || this.A0E.contains(str) || map.containsKey(str)) {
            A00();
        }
        c4932DFh.A07.A03();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.AbstractMap, java.util.HashMap] */
    private final void A00() {
        if (!this.A0I) {
            AIG<C4932DFh> aig = this.A0H;
            if (aig.isEmpty()) {
                return;
            }
            while (!aig.isEmpty()) {
                C4932DFh c4932DFhRemoveFirst = aig.removeFirst();
                try {
                    if (c4932DFhRemoveFirst.A00 == 0) {
                        DH2.A02.A00(c4932DFhRemoveFirst.A09);
                        c4932DFhRemoveFirst.A00 = this.A00.A00;
                    }
                    long j = c4932DFhRemoveFirst.A05;
                    C3341CFl c3341CFl = c4932DFhRemoveFirst.A07;
                    Object obj = AbstractC3344CFp.A00(c3341CFl).get("extra");
                    C7384Etj.A0Z(obj, "null cannot be cast to non-null type kotlin.String");
                    c4932DFhRemoveFirst.A04 = (String) obj;
                    long jResolveLatency = this.A09.resolveLatency(c4932DFhRemoveFirst.A01);
                    c4932DFhRemoveFirst.A01 = jResolveLatency;
                    C4934DFk c4934DFk = c4932DFhRemoveFirst.A08;
                    long j2 = c4934DFk.A00;
                    if (c4934DFk.A04) {
                        FFSingletonJNILogger.log(c4932DFhRemoveFirst.A00, c4932DFhRemoveFirst.A09, j, false, 1L, false, c4932DFhRemoveFirst.A06, jResolveLatency, c4932DFhRemoveFirst.A04, c4932DFhRemoveFirst.A0A);
                    } else {
                        FFSingletonJNILogger.logWithCollectionControlDecision(c4932DFhRemoveFirst.A00, c4932DFhRemoveFirst.A09, j, false, c4932DFhRemoveFirst.A06, jResolveLatency, c4932DFhRemoveFirst.A04, new FFSingletonJNILogger.CollectionControlDecision(j2, c4934DFk.A01, j, false, FFSingletonJNILogger.CollectionControlDecisionStatus.SUCCESS.mVal), c4932DFhRemoveFirst.A0A);
                    }
                    c3341CFl.A03();
                } catch (CppException e) {
                    CFK.A0I("OneFabricEventHandler", "JNI exception when logging event %s", c4932DFhRemoveFirst.A09, e);
                }
            }
            return;
        }
        F0C f0c = this.A0F;
        if (((DGz) f0c.getValue()).A00 == 0 || ((DGz) f0c.getValue()).A00 == 0) {
            return;
        }
        FFSingletonJNILogger.logBatchedMixed(((DGz) f0c.getValue()).A03, ((DGz) f0c.getValue()).A00, ((DGz) f0c.getValue()).A08, ((DGz) f0c.getValue()).A04, ((DGz) f0c.getValue()).A06, ((DGz) f0c.getValue()).A05, ((DGz) f0c.getValue()).A07, ((DGz) f0c.getValue()).A09, ((DGz) f0c.getValue()).A02, ((DGz) f0c.getValue()).A0A);
        int i = ((DGz) f0c.getValue()).A00;
        int i2 = 0;
        while (true) {
            DGz dGz = (DGz) f0c.getValue();
            if (i2 >= i) {
                dGz.A00 = 0;
                return;
            }
            dGz.A03[i2] = 0;
            ((DGz) f0c.getValue()).A04[i2] = 0;
            ((DGz) f0c.getValue()).A08[i2] = null;
            ((DGz) f0c.getValue()).A06[i2] = 0;
            ((DGz) f0c.getValue()).A05[i2] = 0;
            ((DGz) f0c.getValue()).A07[i2] = null;
            ((DGz) f0c.getValue()).A09[i2] = null;
            ((DGz) f0c.getValue()).A02[i2] = 0;
            ((DGz) f0c.getValue()).A0A[i2] = false;
            i2++;
        }
    }
}
