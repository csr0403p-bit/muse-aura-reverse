package com.facebook.aura.pairs;

import X.AbstractC7559F3s;
import X.BFI;
import X.C06827l3;
import X.C3cH;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.G0U;
import android.util.Base64;
import com.facebook.aura.json.NetworkException;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class PairsInviteMailboxKt {
    public static final int HTTP_NOT_FOUND = 404;
    public static final int MAX_DELIVERY_ID_LENGTH = 256;
    public static final int MAX_INVITE_B64_LENGTH = 4096;
    public static final int MAX_INVITE_PHOTO_B64_LENGTH = 43692;
    public static final int MAX_INVITE_PHOTO_BYTES = 32768;
    public static final int MAX_ITEMS = 32;
    public static final int MAX_REPORTED_FAILURES = 64;
    public static final String NO_BODY = "";
    public static final String OUTCOME_FAILED = "failed";
    public static final String OUTCOME_OK = "ok";
    public static final String SEND_STATUS_SENT = "sent";
    public static final String STAGE_ACK = "mailbox_ack";
    public static final String STAGE_READ = "mailbox_read";
    public static final String STAGE_SUBMIT = "vm_submit";
    public static final String TAG = "PairsInviteMailbox";
    public static final Set<String> LIVE_DELIVERY_STATES = C60O.A19("waiting", "delivered");
    public static final C06827l3 DELIVERY_ID = C06827l3.A02("^[A-Za-z0-9._:-]+$");
    public static final C06827l3 STANDARD_BASE64 = C06827l3.A02("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$");

    /* renamed from: com.facebook.aura.pairs.PairsInviteMailboxKt$deliveryKey$1, reason: invalid class name */
    public final class AnonymousClass1 extends AbstractC7559F3s implements G0U<Byte, CharSequence> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(1);
        }

        @Override // X.G0U
        public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
            return C3cJ.A0K(Byte.valueOf(b.byteValue()));
        }

        public final CharSequence invoke(byte b) {
            return C3cJ.A0K(Byte.valueOf(b));
        }
    }

    public static final int httpCode(Throwable th) {
        NetworkException networkException;
        if (!(th instanceof NetworkException) || (networkException = (NetworkException) th) == null) {
            return -1;
        }
        return networkException.httpResponseCode;
    }

    public static final String deliveryKey(String str) {
        byte[] bArrA1T = C3cH.A1T(str);
        C7384Etj.A0U(bArrA1T);
        return BFI.A0C("", AnonymousClass1.INSTANCE, bArrA1T);
    }

    public static final boolean isDeliveryId(String str) {
        int length = str.length();
        return 1 <= length && length < 257 && DELIVERY_ID.A08(str);
    }

    public static final boolean isInviteB64(String str) {
        int length = str.length();
        return 1 <= length && length < 4097 && length % 4 == 0 && STANDARD_BASE64.A08(str);
    }

    public static final boolean isInvitePhoto(String str) {
        if (str.length() <= 43692 && STANDARD_BASE64.A08(str)) {
            try {
                int length = Base64.decode(str, 0).length;
                if (1 <= length && length < 32769) {
                    return true;
                }
            } catch (IllegalArgumentException unused) {
            }
        }
        return false;
    }
}
