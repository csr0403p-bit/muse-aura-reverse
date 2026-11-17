package com.facebook.traffic.nts.providers.background;

import X.AbstractC0882AGj;
import X.AnonymousClass003;
import X.C06H;
import X.C3cG;
import X.C60O;
import X.C7384Etj;
import X.EIF;
import X.EK5;
import X.EKN;
import X.EnumC6619EKm;
import X.F3R;
import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes3.dex */
public final class BackgroundV2TaskSchedulerPeriodicJobSafeHandling {
    public static final Companion Companion = new Companion();
    public static final String TAG = "ConfigurablePeriodicBackgroundJobCommon";

    public final class Companion {
        private final ListenableFuture<List<EKN>> getAllTntsWorkInfos(F3R f3r) {
            List listSingletonList = Collections.singletonList(ForeverConstants.TNTS_JOB_TAG_DO_NOT_CHANGE);
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            ArrayList arrayListA0h3 = C3cG.A0h();
            ArrayList arrayListA0h4 = C3cG.A0h();
            AbstractC0882AGj.A0r(listSingletonList, arrayListA0h3);
            AbstractC0882AGj.A0r(Arrays.asList(EnumC6619EKm.A04, EnumC6619EKm.A06), arrayListA0h4);
            if (arrayListA0h.isEmpty() && arrayListA0h2.isEmpty() && arrayListA0h3.isEmpty() && arrayListA0h4.isEmpty()) {
                throw C60O.A0i("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return f3r.A03(new EIF(arrayListA0h, arrayListA0h2, arrayListA0h3, arrayListA0h4));
        }

        private final ListenableFuture<List<EKN>> getTntsWorkInfosByUniqueWorkNames(F3R f3r, List<String> list) {
            List listSingletonList = Collections.singletonList(ForeverConstants.TNTS_JOB_TAG_DO_NOT_CHANGE);
            ArrayList arrayListA0h = C3cG.A0h();
            ArrayList arrayListA0h2 = C3cG.A0h();
            ArrayList arrayListA0h3 = C3cG.A0h();
            ArrayList arrayListA0h4 = C3cG.A0h();
            AbstractC0882AGj.A0r(listSingletonList, arrayListA0h3);
            C7384Etj.A0Y(list, 0);
            AbstractC0882AGj.A0r(list, arrayListA0h2);
            AbstractC0882AGj.A0r(Arrays.asList(EnumC6619EKm.A04, EnumC6619EKm.A06), arrayListA0h4);
            if (arrayListA0h.isEmpty() && arrayListA0h2.isEmpty() && arrayListA0h3.isEmpty() && arrayListA0h4.isEmpty()) {
                throw C60O.A0i("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
            }
            return f3r.A03(new EIF(arrayListA0h, arrayListA0h2, arrayListA0h3, arrayListA0h4));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00cd  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e6  */
        /* JADX WARN: Type inference failed for: r7v4, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r8v4, types: [java.util.List] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object cancelAllUnmanagedJobsSuspend(android.content.Context r9, java.util.List<java.lang.String> r10, X.HtJ<? super kotlin.Unit> r11) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion.cancelAllUnmanagedJobsSuspend(android.content.Context, java.util.List, X.HtJ):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x0025  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object checkAndCancelStaleJobByIdSuspend(android.content.Context r8, java.util.UUID r9, X.HtJ<? super kotlin.Unit> r10) throws java.lang.Throwable {
            /*
                r7 = this;
                boolean r0 = r10 instanceof com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$checkAndCancelStaleJobByIdSuspend$1
                if (r0 == 0) goto L25
                r5 = r10
                com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$checkAndCancelStaleJobByIdSuspend$1 r5 = (com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$checkAndCancelStaleJobByIdSuspend$1) r5
                int r2 = r5.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r2 & r1
                if (r0 == 0) goto L25
                int r2 = r2 - r1
                r5.label = r2
            L12:
                java.lang.Object r1 = r5.result
                X.Hji r4 = X.EnumC10460Hji.A02
                int r0 = r5.label
                r6 = 2
                r2 = 1
                if (r0 == 0) goto L2b
                if (r0 == r2) goto L4c
                if (r0 == r6) goto L9d
                java.lang.IllegalStateException r1 = X.AnonymousClass001.A0n()
                throw r1
            L25:
                com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$checkAndCancelStaleJobByIdSuspend$1 r5 = new com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling$Companion$checkAndCancelStaleJobByIdSuspend$1
                r5.<init>(r7, r10)
                goto L12
            L2b:
                X.Hwg.A00(r1)
                X.EK5 r3 = X.F3R.A02(r8)
                java.lang.String r0 = "TNTSPeriodicScheduledCoroutineJob"
                java.util.List r0 = java.util.Collections.singletonList(r0)
                com.google.common.util.concurrent.ListenableFuture r1 = r7.getTntsWorkInfosByUniqueWorkNames(r3, r0)
                r0 = 0
                r5.L$0 = r0
                r5.L$1 = r9
                r5.L$2 = r3
                r5.label = r2
                java.lang.Object r1 = X.Br8.A00(r1, r5)
                if (r1 != r4) goto L57
                return r4
            L4c:
                java.lang.Object r3 = r5.L$2
                X.F3R r3 = (X.F3R) r3
                java.lang.Object r9 = r5.L$1
                java.util.UUID r9 = (java.util.UUID) r9
                X.Hwg.A00(r1)
            L57:
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r2 = X.AnonymousClass003.A0i(r1)
                java.util.Iterator r1 = r1.iterator()
            L61:
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L73
                java.lang.Object r0 = r1.next()
                X.EKN r0 = (X.EKN) r0
                java.util.UUID r0 = r0.A01
                r2.add(r0)
                goto L61
            L73:
                boolean r0 = r2.isEmpty()
                if (r0 != 0) goto L85
                boolean r0 = r2.contains(r9)
                if (r0 == 0) goto L85
                r9.toString()
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            L85:
                X.EyE r0 = r3.A05(r9)
                com.google.common.util.concurrent.ListenableFuture<X.EN8> r1 = r0.A00
                r0 = 0
                r5.L$0 = r0
                r5.L$1 = r0
                r5.L$2 = r0
                r5.L$3 = r0
                r5.label = r6
                java.lang.Object r0 = X.Br8.A00(r1, r5)
                if (r0 != r4) goto La0
                return r4
            L9d:
                X.Hwg.A00(r1)
            La0:
                java.lang.String r0 = "Stale job detected"
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion.checkAndCancelStaleJobByIdSuspend(android.content.Context, java.util.UUID, X.HtJ):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0039  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x01cd  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0130 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Type inference failed for: r0v7, types: [T, com.facebook.traffic.nts.providers.background.JobResult$ResultCategory] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object handleInvocation(android.content.Context r22, X.BzB r23, java.util.UUID r24, com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerEarlyNTSConfigChecker r25, X.HtJ<? super com.facebook.traffic.nts.providers.background.JobResult> r26) {
            /*
                Method dump skipped, instructions count: 469
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerPeriodicJobSafeHandling.Companion.handleInvocation(android.content.Context, X.BzB, java.util.UUID, com.facebook.traffic.nts.providers.background.BackgroundV2TaskSchedulerEarlyNTSConfigChecker, X.HtJ):java.lang.Object");
        }

        public final void cancelAllUnmanagedJobs(Context context, List<String> list) throws ExecutionException, InterruptedException {
            AnonymousClass003.A0u(context, list);
            EK5 ek5A02 = F3R.A02(context);
            List<EKN> list2 = getTntsWorkInfosByUniqueWorkNames(ek5A02, list).get();
            C7384Etj.A0U(list2);
            List<EKN> list3 = list2;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list3);
            Iterator<T> it = list3.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(((EKN) it.next()).A01);
            }
            List<EKN> list4 = getAllTntsWorkInfos(ek5A02).get();
            C7384Etj.A0U(list4);
            ArrayList arrayListA0h = C3cG.A0h();
            for (Object obj : list4) {
                if (!arrayListA0i.contains(((EKN) obj).A01)) {
                    arrayListA0h.add(obj);
                }
            }
            Iterator it2 = arrayListA0h.iterator();
            while (it2.hasNext()) {
                ek5A02.A05(((EKN) it2.next()).A01).A00.get();
            }
            arrayListA0h.size();
        }

        public final void checkAndCancelStaleJobById(Context context, UUID uuid) {
            AnonymousClass003.A0u(context, uuid);
            EK5 ek5A02 = F3R.A02(context);
            List<EKN> list = getTntsWorkInfosByUniqueWorkNames(ek5A02, Collections.singletonList(BackgroundV2TaskSchedulerAppLayerUpcallsImplPeriodic.TNTS_UNIQUE_WORK_NAME)).get();
            C7384Etj.A0U(list);
            List<EKN> list2 = list;
            ArrayList arrayListA0i = AnonymousClass003.A0i(list2);
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayListA0i.add(((EKN) it.next()).A01);
            }
            if (arrayListA0i.isEmpty() || !arrayListA0i.contains(uuid)) {
                ek5A02.A05(uuid).A00.get();
                throw new RuntimeException("Stale job detected");
            }
            uuid.toString();
        }

        public /* synthetic */ Companion(C06H c06h) {
        }

        public Companion() {
        }
    }
}
