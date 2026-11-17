package X;

import com.facebook.aura.sharesheet.HatchVideoAudioStripperKt;
import java.nio.ByteBuffer;
import java.util.UUID;

/* renamed from: X.Djk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC5508Djk {
    public static byte[] A01(UUID uuid, byte[] bArr, UUID[] uuidArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? HatchVideoAudioStripperKt.MAX_SAMPLE_BYTES : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr == null || (length = bArr.length) == 0) {
            byteBufferAllocate.putInt(0);
        } else {
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static C5399Dhq A00(byte[] bArr) {
        UUID[] uuidArr;
        E1P e1pA0Z = BV6.A0Z(bArr);
        if (e1pA0Z.A00 < 32) {
            return null;
        }
        e1pA0Z.A0R(0);
        int iA04 = e1pA0Z.A04();
        int iA05 = e1pA0Z.A05();
        if (iA05 != iA04) {
            CNC.A04("PsshAtomUtil", FGI.A0T("Advertised atom size (", ") does not match buffer size: ", iA05, iA04));
            return null;
        }
        int iA052 = e1pA0Z.A05();
        if (iA052 != 1886614376) {
            BV6.A1H("Atom type is not pssh: ", iA052, "PsshAtomUtil");
            return null;
        }
        int iA053 = e1pA0Z.A05();
        byte[] bArr2 = E2Q.A00;
        int i = (iA053 >> 24) & 255;
        if (i > 1) {
            BV6.A1H("Unsupported pssh version: ", i, "PsshAtomUtil");
            return null;
        }
        UUID uuid = new UUID(e1pA0Z.A0G(), e1pA0Z.A0G());
        if (i == 1) {
            int iA0C = e1pA0Z.A0C();
            uuidArr = new UUID[iA0C];
            for (int i2 = 0; i2 < iA0C; i2++) {
                uuidArr[i2] = new UUID(e1pA0Z.A0G(), e1pA0Z.A0G());
            }
        } else {
            uuidArr = null;
        }
        int iA0C2 = e1pA0Z.A0C();
        int iA042 = e1pA0Z.A04();
        if (iA0C2 != iA042) {
            CNC.A04("PsshAtomUtil", FGI.A0T("Atom data size (", ") does not match the bytes left: ", iA0C2, iA042));
            return null;
        }
        byte[] bArr3 = new byte[iA0C2];
        e1pA0Z.A0U(bArr3, 0, iA0C2);
        return new C5399Dhq(uuid, bArr3, uuidArr, i);
    }
}
