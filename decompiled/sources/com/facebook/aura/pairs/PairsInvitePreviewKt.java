package com.facebook.aura.pairs;

import X.AbstractC06907md;
import X.AbstractC7559F3s;
import X.AnonymousClass001;
import X.AnonymousClass007;
import X.BFI;
import X.BQG;
import X.C06827l3;
import X.C3cG;
import X.C3cJ;
import X.C60O;
import X.C7384Etj;
import X.C7LE;
import X.DCl;
import X.G0U;
import android.util.Base64;
import com.facebook.aura.activation.view.InviteCodeScratcherKt;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes3.dex */
public abstract class PairsInvitePreviewKt {
    public static final long FIELD_AGENT_NAME = 2;
    public static final long FIELD_DISPLAY = 6;
    public static final long FIELD_DISPLAY_NAME = 1;
    public static final long FIELD_DISPLAY_PHOTO = 4;
    public static final long FIELD_EXPIRES_AT_MS = 8;
    public static final long FIELD_GENERATION_ID = 9;
    public static final long FIELD_INVITER_MUSE = 3;
    public static final long FIELD_INVITE_BODY = 1;
    public static final long FIELD_OFFERED_PRESET = 7;
    public static final long FIELD_PHOTO_SHA256 = 1;
    public static final long FIELD_REQUEST_EXPIRES_AT_MS = 11;
    public static final long FIELD_VERSION = 1;
    public static final int GENERATION_ID_BYTES = 16;
    public static final int MAX_NAME_LENGTH = 256;
    public static final int MAX_VARINT_BYTES = 10;
    public static final int MUSE_ID_BYTES = 32;
    public static final String MUSE_ID_PREFIX = "muse";
    public static final int SHA256_BYTES = 32;
    public static final long SUPPORTED_VERSION = 2;
    public static final long WIRE_FIXED32 = 5;
    public static final long WIRE_FIXED64 = 1;
    public static final long WIRE_LENGTH_DELIMITED = 2;
    public static final long WIRE_VARINT = 0;

    /* renamed from: com.facebook.aura.pairs.PairsInvitePreviewKt$toHex$1, reason: invalid class name */
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

    public static final String toGenerationId(byte[] bArr) {
        int length = bArr.length;
        if (length != 16) {
            return null;
        }
        int i = 0;
        while (bArr[i] == 0) {
            i++;
            if (i >= length) {
                return null;
            }
        }
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        return AnonymousClass001.A0u(new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong()).toString());
    }

    public static final String toHex(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        return BFI.A0C("", AnonymousClass1.INSTANCE, bArr);
    }

    public static final String toMuseId(byte[] bArr) {
        if (bArr.length == 32) {
            return Bech32m.INSTANCE.encode(MUSE_ID_PREFIX, bArr);
        }
        return null;
    }

    public static final String toName(byte[] bArr) {
        C7384Etj.A0Y(bArr, 0);
        String str = new String(bArr, DCl.A05);
        StringBuilder sbA0w = C60O.A0w();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            int type = Character.getType(cCharAt);
            if ((type != 15 && type != 16) || C7LE.A00(cCharAt)) {
                sbA0w.append(cCharAt);
            }
        }
        List listA05 = C06827l3.A02("\\s+").A05(sbA0w.toString());
        ArrayList arrayListA0h = C3cG.A0h();
        Iterator it = listA05.iterator();
        while (it.hasNext()) {
            AnonymousClass007.A19(arrayListA0h, it);
        }
        String strA01 = AbstractC06907md.A01(InviteCodeScratcherKt.CODE_SEPARATOR, arrayListA0h, null);
        if (strA01.length() > 0) {
            return BQG.A17(strA01, 256);
        }
        return null;
    }

    public static final String toSha256Hex(byte[] bArr) {
        if (bArr.length == 32) {
            return toHex(bArr);
        }
        return null;
    }

    public static final byte[] decodeBase64Url(String str) {
        try {
            return Base64.decode(str, 11);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
