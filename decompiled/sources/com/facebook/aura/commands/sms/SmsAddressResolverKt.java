package com.facebook.aura.commands.sms;

import X.HtJ;
import X.HzP;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* loaded from: classes3.dex */
public abstract class SmsAddressResolverKt {

    @DebugMetadata(c = "com.facebook.aura.commands.sms.SmsAddressResolverKt", f = "SmsAddressResolver.kt", l = {35}, m = "resolveSmsAddress", v = 2)
    /* renamed from: com.facebook.aura.commands.sms.SmsAddressResolverKt$resolveSmsAddress$1, reason: invalid class name */
    public final class AnonymousClass1 extends HzP {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        @Override // X.AbstractC8884Fsp
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmsAddressResolverKt.resolveSmsAddress(null, null, this);
        }

        public AnonymousClass1(HtJ<? super AnonymousClass1> htJ) {
            super(htJ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object resolveSmsAddress(android.content.Context r5, java.lang.String r6, X.HtJ<? super com.facebook.aura.commands.sms.SmsAddressResolution> r7) {
        /*
            boolean r0 = r7 instanceof com.facebook.aura.commands.sms.SmsAddressResolverKt.AnonymousClass1
            if (r0 == 0) goto L75
            r4 = r7
            com.facebook.aura.commands.sms.SmsAddressResolverKt$resolveSmsAddress$1 r4 = (com.facebook.aura.commands.sms.SmsAddressResolverKt.AnonymousClass1) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r4.label = r2
        L12:
            java.lang.Object r1 = r4.result
            X.Hji r3 = X.EnumC10460Hji.A02
            int r0 = r4.label
            r2 = 1
            if (r0 == 0) goto L56
            if (r0 != r2) goto L88
            java.lang.Object r0 = r4.L$1
            java.lang.String r6 = X.C3cG.A0d(r0, r1)
        L23:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L32
            r2 = 0
            java.lang.String r1 = "permission_denied"
            java.lang.String r0 = "Contacts permission is required to message a contact by name. Use a phone number instead, or enable Contacts permission."
        L2c:
            com.facebook.aura.commands.sms.SmsAddressResolution r3 = new com.facebook.aura.commands.sms.SmsAddressResolution
            r3.<init>(r2, r1, r0)
            return r3
        L32:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L44
            java.lang.String r1 = "No phone number found for contact '"
            java.lang.String r0 = "'."
            java.lang.String r0 = X.FGI.A0U(r1, r6, r0)
            r2 = 0
            java.lang.String r1 = "contact_not_found"
            goto L2c
        L44:
            int r0 = r1.size()
            if (r0 <= r2) goto L7b
            java.lang.String r1 = "Multiple phone numbers found for contact '"
            java.lang.String r0 = "'. Use a phone number."
            java.lang.String r0 = X.FGI.A0U(r1, r6, r0)
            r2 = 0
            java.lang.String r1 = "ambiguous_contact"
            goto L2c
        L56:
            X.Hwg.A00(r1)
            boolean r0 = X.C7BY.A0j(r6)
            if (r0 != 0) goto L8d
            boolean r0 = com.facebook.aura.commands.core.PhoneNumberHeuristicsKt.looksLikePhoneNumber(r6)
            if (r0 != 0) goto L8d
            com.facebook.aura.commands.sms.DeviceContactResolver r1 = com.facebook.aura.commands.sms.DeviceContactResolver.INSTANCE
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r6
            r4.label = r2
            java.lang.Object r1 = r1.resolvePhoneNumbers(r5, r6, r4)
            if (r1 != r3) goto L23
            return r3
        L75:
            com.facebook.aura.commands.sms.SmsAddressResolverKt$resolveSmsAddress$1 r4 = new com.facebook.aura.commands.sms.SmsAddressResolverKt$resolveSmsAddress$1
            r4.<init>(r7)
            goto L12
        L7b:
            java.lang.Object r1 = X.AbstractC0878AGe.A0J(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            com.facebook.aura.commands.sms.SmsAddressResolution r3 = new com.facebook.aura.commands.sms.SmsAddressResolution
            r3.<init>(r1, r0, r0)
            return r3
        L88:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0n()
            throw r0
        L8d:
            r1 = 0
            com.facebook.aura.commands.sms.SmsAddressResolution r0 = new com.facebook.aura.commands.sms.SmsAddressResolution
            r0.<init>(r6, r1, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.SmsAddressResolverKt.resolveSmsAddress(android.content.Context, java.lang.String, X.HtJ):java.lang.Object");
    }
}
