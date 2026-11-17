package com.facebook.aura.rentalcars;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class RentalCarRepositoryKt {
    public static final String TAG = "RentalCarRepository";

    @DebugMetadata(c = "com.facebook.aura.rentalcars.RentalCarRepositoryKt", f = "RentalCarRepository.kt", l = {20}, m = "findRentalCarResults", v = 2)
    /* renamed from: com.facebook.aura.rentalcars.RentalCarRepositoryKt$findRentalCarResults$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RentalCarRepositoryKt.findRentalCarResults(null, null, null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object findRentalCarResults(com.facebook.aura.conversation.offline.HatchOfflineConversationRepository r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, X.HtJ<? super com.facebook.aura.rentalcars.RentalCarResults> r10) {
        /*
            boolean r0 = r10 instanceof com.facebook.aura.rentalcars.RentalCarRepositoryKt.AnonymousClass1
            if (r0 == 0) goto L21
            r5 = r10
            com.facebook.aura.rentalcars.RentalCarRepositoryKt$findRentalCarResults$1 r5 = (com.facebook.aura.rentalcars.RentalCarRepositoryKt.AnonymousClass1) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r5.label = r2
        L12:
            java.lang.Object r4 = r5.result
            X.Hji r2 = X.EnumC10460Hji.A02
            int r0 = r5.label
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L2c
            if (r0 != r1) goto L27
            java.lang.Object r9 = r5.L$3
            goto L45
        L21:
            com.facebook.aura.rentalcars.RentalCarRepositoryKt$findRentalCarResults$1 r5 = new com.facebook.aura.rentalcars.RentalCarRepositoryKt$findRentalCarResults$1
            r5.<init>(r10)
            goto L12
        L27:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L2c:
            X.Hwg.A00(r4)
            if (r7 != 0) goto L33
            java.lang.String r7 = "primary_session_id"
        L33:
            r0 = 0
            r5.L$0 = r0     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8b
            r5.L$1 = r0     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8b
            r5.L$2 = r0     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8b
            r5.L$3 = r9     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8b
            r5.label = r1     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8b
            java.lang.Object r4 = r6.findMessage(r7, r8, r5)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8b
            if (r4 != r2) goto L48
            return r2
        L45:
            X.Hwg.A00(r4)     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8b
        L48:
            com.facebook.aura.model.HatchMessage r4 = (com.facebook.aura.model.HatchMessage) r4     // Catch: java.lang.Exception -> L82 java.util.concurrent.CancellationException -> L8b
            if (r4 == 0) goto L7f
            java.util.List<com.facebook.aura.model.HatchWidgetPresentation> r0 = r4.presentations
            if (r0 == 0) goto L7f
            java.util.Iterator r2 = r0.iterator()
        L54:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.facebook.aura.model.HatchWidgetPresentation r0 = (com.facebook.aura.model.HatchWidgetPresentation) r0
            java.lang.String r0 = r0.presentationId
            boolean r0 = X.C7384Etj.areEqual(r0, r9)
            if (r0 == 0) goto L54
        L69:
            com.facebook.aura.model.HatchWidgetPresentation r1 = (com.facebook.aura.model.HatchWidgetPresentation) r1
            if (r1 == 0) goto L7f
            com.facebook.aura.model.HatchPresentationData r1 = r1.data
            boolean r0 = r1 instanceof com.facebook.aura.model.GenericListPresentationData
            if (r0 == 0) goto L7f
            com.facebook.aura.model.GenericListPresentationData r1 = (com.facebook.aura.model.GenericListPresentationData) r1
            if (r1 == 0) goto L7f
            com.facebook.aura.model.GenericListPresentation r0 = r1.list
            if (r0 == 0) goto L7f
            com.facebook.aura.rentalcars.RentalCarResults r3 = com.facebook.aura.rentalcars.RentalCarRateJsonKt.rentalCarResults(r0)
        L7f:
            return r3
        L80:
            r1 = r3
            goto L69
        L82:
            r2 = move-exception
            java.lang.String r1 = "Couldn't read rental-car results from chat history"
            java.lang.String r0 = "RentalCarRepository"
            X.CFK.A0A(r0, r1, r2)
            return r3
        L8b:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.rentalcars.RentalCarRepositoryKt.findRentalCarResults(com.facebook.aura.conversation.offline.HatchOfflineConversationRepository, java.lang.String, java.lang.String, java.lang.String, X.HtJ):java.lang.Object");
    }
}
