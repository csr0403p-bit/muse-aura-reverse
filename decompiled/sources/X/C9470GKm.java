package X;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.GKm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9470GKm implements EX9 {
    public static final Set<String> A03;
    public static final byte[] A04 = new byte[0];
    public final EX9 A00;
    public final GKQ A01;
    public final String A02;

    static {
        HashSet hashSetA13 = C60O.A13();
        hashSetA13.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
        hashSetA13.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        hashSetA13.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        hashSetA13.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        hashSetA13.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        hashSetA13.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
        A03 = Collections.unmodifiableSet(hashSetA13);
    }

    @Override // X.EX9
    public final byte[] AAW(final byte[] plaintext, final byte[] associatedData) throws GeneralSecurityException {
        AbstractC9465GKh abstractC9465GKhA00 = C9471GKn.A00(this.A01, C9471GKn.A02, null);
        byte[] bArrAAW = this.A00.AAW(((GKV) GL6.A01.A06(abstractC9465GKhA00)).A02.A04(), A04);
        int length = bArrAAW.length;
        if (length > 4096) {
            throw BV6.A0u("length of encrypted DEK too large");
        }
        byte[] bArrAAW2 = ((EX9) GL9.A01.A00.get().A00(abstractC9465GKhA00, EX9.class)).AAW(plaintext, associatedData);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length + 4 + bArrAAW2.length);
        byteBufferAllocate.putInt(length);
        byteBufferAllocate.put(bArrAAW);
        byteBufferAllocate.put(bArrAAW2);
        return byteBufferAllocate.array();
    }

    @Deprecated
    public C9470GKm(EX9 dekTemplate, GJL remote) {
        if (!A03.contains(remote.typeUrl_)) {
            throw C60Q.A0V("Unsupported DEK key type: ", remote.typeUrl_, ". Only Tink AEAD key types are supported.");
        }
        this.A02 = remote.typeUrl_;
        GHW ghwA09 = GHS.A09(GJL.DEFAULT_INSTANCE);
        if (!ghwA09.A01.equals(remote)) {
            GHM ghmA00 = GHW.A00(ghwA09);
            AbstractC7609F5w.A0d(ghmA00).AQb(ghmA00, remote);
        }
        GJM gjm = (GJM) ghwA09;
        gjm.A05(GKP.RAW);
        this.A01 = GKS.A00(gjm.A02().A0D());
        this.A00 = dekTemplate;
    }

    @Override // X.EX9
    public final byte[] A8i(final byte[] ciphertext, final byte[] associatedData) throws GeneralSecurityException {
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(ciphertext);
            int i = byteBufferWrap.getInt();
            if (i <= 0 || i > 4096 || i > ciphertext.length - 4) {
                throw BV6.A0u("length of encrypted DEK too large");
            }
            byte[] bArr = new byte[i];
            byteBufferWrap.get(bArr, 0, i);
            byte[] bArr2 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr2, 0, byteBufferWrap.remaining());
            byte[] bArrA8i = this.A00.A8i(bArr, A04);
            String str = this.A02;
            AbstractC9321GEc abstractC9321GEc = AbstractC9321GEc.A00;
            return ((EX9) GL9.A01.A00.get().A00(GL6.A01.A04(GKV.A00(GJO.SYMMETRIC, GKP.RAW, AbstractC9321GEc.A01(bArrA8i, 0, bArrA8i.length), null, str)), EX9.class)).A8i(bArr2, associatedData);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e) {
            throw new GeneralSecurityException("invalid ciphertext", e);
        }
    }
}
