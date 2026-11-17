package com.facebook.aura.commands.sms;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class DeviceContactResolverKt {
    public static final String TAG = "DeviceContactResolver";

    @DebugMetadata(c = "com.facebook.aura.commands.sms.DeviceContactResolverKt", f = "DeviceContactResolver.kt", l = {115}, m = "enrichContactNames", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.DeviceContactResolverKt$enrichContactNames$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceContactResolverKt.enrichContactNames(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object enrichContactNames(com.facebook.aura.commands.sms.CanonicalSmsPayload r19, android.content.Context r20, X.HtJ<? super com.facebook.aura.commands.sms.CanonicalSmsPayload> r21) {
        /*
            r4 = r19
            r3 = r21
            boolean r0 = r3 instanceof com.facebook.aura.commands.sms.DeviceContactResolverKt.AnonymousClass1
            if (r0 == 0) goto Lca
            r7 = r3
            com.facebook.aura.commands.sms.DeviceContactResolverKt$enrichContactNames$1 r7 = (com.facebook.aura.commands.sms.DeviceContactResolverKt.AnonymousClass1) r7
            int r2 = r7.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lca
            int r2 = r2 - r1
            r7.label = r2
        L16:
            java.lang.Object r2 = r7.result
            X.Hji r6 = X.EnumC10460Hji.A02
            int r0 = r7.label
            r5 = 1
            if (r0 == 0) goto L6c
            if (r0 != r5) goto Ldb
            java.lang.Object r4 = r7.L$0
            com.facebook.aura.commands.sms.CanonicalSmsPayload r4 = (com.facebook.aura.commands.sms.CanonicalSmsPayload) r4
            X.Hwg.A00(r2)
        L28:
            r6 = r4
            java.util.Map r2 = (java.util.Map) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Lda
            java.util.List<com.facebook.aura.commands.sms.CanonicalSmsMessage> r0 = r4.messages
            java.util.ArrayList r3 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L3b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Ld1
            java.lang.Object r5 = r1.next()
            com.facebook.aura.commands.sms.CanonicalSmsMessage r5 = (com.facebook.aura.commands.sms.CanonicalSmsMessage) r5
            java.lang.String r0 = r5.address
            java.lang.Object r15 = r2.get(r0)
            java.lang.String r15 = (java.lang.String) r15
            r20 = 7935(0x1eff, float:1.112E-41)
            r6 = 0
            r10 = 0
            r14 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r12 = r6
            r13 = r6
            r16 = r14
            r17 = r6
            r18 = r6
            r19 = r6
            r21 = r6
            com.facebook.aura.commands.sms.CanonicalSmsMessage r0 = com.facebook.aura.commands.sms.CanonicalSmsMessage.copy$default(r5, r6, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r3.add(r0)
            goto L3b
        L6c:
            X.Hwg.A00(r2)
            java.util.List<com.facebook.aura.commands.sms.CanonicalSmsMessage> r0 = r4.messages
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Le0
            java.util.List<com.facebook.aura.commands.sms.CanonicalSmsMessage> r0 = r4.messages
            java.util.ArrayList r2 = X.AnonymousClass002.A0m(r0)
            java.util.Iterator r1 = r0.iterator()
        L81:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L93
            java.lang.Object r0 = r1.next()
            com.facebook.aura.commands.sms.CanonicalSmsMessage r0 = (com.facebook.aura.commands.sms.CanonicalSmsMessage) r0
            java.lang.String r0 = r0.address
            r2.add(r0)
            goto L81
        L93:
            java.util.ArrayList r3 = X.C3cG.A0h()
            java.util.Iterator r2 = r2.iterator()
        L9b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lac
            java.lang.Object r1 = r2.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            X.AnonymousClass006.A1F(r0, r1, r3)
            goto L9b
        Lac:
            java.util.List r2 = X.C3cG.A0m(r3)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto Le0
            com.facebook.aura.commands.contactlookup.ContactNameLookup r1 = com.facebook.aura.commands.contactlookup.ContactNameLookup.INSTANCE
            r7.L$0 = r4
            r0 = 0
            r7.L$1 = r0
            r7.L$2 = r0
            r7.label = r5
            r0 = r20
            java.lang.Object r2 = r1.namesFor(r0, r2, r7)
            if (r2 != r6) goto L28
            return r6
        Lca:
            com.facebook.aura.commands.sms.DeviceContactResolverKt$enrichContactNames$1 r7 = new com.facebook.aura.commands.sms.DeviceContactResolverKt$enrichContactNames$1
            r7.<init>(r3)
            goto L16
        Ld1:
            java.lang.String r2 = r4.platform
            long r0 = r4.syncedAtMs
            com.facebook.aura.commands.sms.CanonicalSmsPayload r0 = r4.copy(r2, r0, r3)
            return r0
        Lda:
            return r6
        Ldb:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        Le0:
            return r19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.DeviceContactResolverKt.enrichContactNames(com.facebook.aura.commands.sms.CanonicalSmsPayload, android.content.Context, X.HtJ):java.lang.Object");
    }
}
