package com.facebook.aura.commands.sms;

import X.AnonymousClass003;
import X.C3cF;
import X.C60P;
import X.C7384Etj;
import X.C7Je;
import X.CFK;
import X.FGI;
import android.content.Intent;
import android.telephony.SmsManager;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public abstract class MessageDraftSenderKt {
    public static final String NOTIFICATION_CHANNEL_ID = "hatch_sms_send";
    public static final int NOTIFICATION_ID_BASE = 9000;
    public static final long SMS_SEND_TIMEOUT_MS = 30000;
    public static final String TAG = "MessageDraftSender";
    public static final int UNICODE_MULTIPART_CHARS = 67;
    public static final int UNICODE_SINGLE_PART_CHARS = 70;
    public static final AtomicInteger notificationIdCounter = new AtomicInteger(0);

    public static final String smsSendExceptionKind(Exception exc) {
        return exc instanceof SecurityException ? "security" : exc instanceof IllegalArgumentException ? "illegal_argument" : exc instanceof IllegalStateException ? "illegal_state" : exc instanceof UnsupportedOperationException ? C3cF.A00(61) : exc instanceof NullPointerException ? "null_pointer" : exc instanceof RuntimeException ? "other_runtime" : DeviceSmsReaderKt.ATTACHMENT_OTHER;
    }

    public static final Intent buildSmsDraftIntent(String str, String str2) {
        AnonymousClass003.A0u(str, str2);
        Intent intentA03 = C60P.A03("android.intent.action.SENDTO");
        intentA03.setData(C7Je.A01(FGI.A0M("sms:", str)));
        intentA03.putExtra("sms_body", str2);
        intentA03.addFlags(268435456);
        return intentA03;
    }

    public static final ArrayList<String> divideIntoSmsParts(SmsManager smsManager, String str) {
        try {
            ArrayList<String> arrayListDivideMessage = smsManager.divideMessage(str);
            C7384Etj.A0X(arrayListDivideMessage);
            return arrayListDivideMessage;
        } catch (SecurityException e) {
            CFK.A0A(TAG, "divideMessage denied; splitting locally", e);
            return splitUnicodeSmsParts(str);
        }
    }

    public static final <T> T runStep(SmsSendStep smsSendStep, Function0<? extends T> function0) throws SmsSendStepException {
        try {
            return function0.invoke();
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            throw new SmsSendStepException(smsSendStep, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003d A[PHI: r1
  0x003d: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:12:0x002f, B:14:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList<java.lang.String> splitUnicodeSmsParts(java.lang.String r7) {
        /*
            int r6 = r7.length()
            r0 = 70
            r5 = 0
            if (r6 > r0) goto L12
            java.lang.String[] r0 = new java.lang.String[]{r7}
            java.util.ArrayList r4 = X.AbstractC0885AGm.A0x(r0)
        L11:
            return r4
        L12:
            java.text.BreakIterator r3 = java.text.BreakIterator.getCharacterInstance()
            r3.setText(r7)
            java.util.ArrayList r4 = X.C3cG.A0h()
        L1d:
            int r0 = r5 + 67
            int r2 = java.lang.Math.min(r0, r6)
            if (r2 >= r6) goto L3e
            boolean r0 = r3.isBoundary(r2)
            if (r0 != 0) goto L3e
            int r1 = r3.preceding(r2)
            if (r1 > r5) goto L3d
            int r1 = r2 + (-1)
            char r0 = r7.charAt(r1)
            boolean r0 = java.lang.Character.isHighSurrogate(r0)
            if (r0 == 0) goto L3e
        L3d:
            r2 = r1
        L3e:
            java.lang.String r0 = r7.substring(r5, r2)
            r4.add(r0)
            r5 = r2
            if (r2 >= r6) goto L11
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.aura.commands.sms.MessageDraftSenderKt.splitUnicodeSmsParts(java.lang.String):java.util.ArrayList");
    }
}
