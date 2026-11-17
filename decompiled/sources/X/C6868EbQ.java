package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: X.EbQ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6868EbQ implements InterfaceC6909Ec6 {
    public static final List<String> A06 = AbstractC6843Eav.A07("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", DBJ.FIRST_RUN_UPGRADE, ":method", ":path", ":scheme", ":authority");
    public static final List<String> A07 = AbstractC6843Eav.A07("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", DBJ.FIRST_RUN_UPGRADE);
    public final EnumC6905Ec1 A00;
    public final C6862EbK A01;
    public final C6875EbX A02;
    public final C6879Ebb A03;
    public volatile C6878Eba A04;
    public volatile boolean A05;

    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b1 A[PHI: r0
  0x01b1: PHI (r0v45 int) = (r0v43 int), (r0v64 int) binds: [B:74:0x01a6, B:141:0x01b1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b5 A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:39:0x00fb, B:41:0x00ff, B:43:0x0105, B:45:0x010f, B:46:0x0112, B:47:0x011e, B:49:0x0125, B:51:0x0140, B:55:0x014d, B:57:0x0159, B:59:0x0163, B:64:0x016d, B:66:0x0176, B:68:0x0187, B:70:0x0196, B:72:0x019e, B:78:0x01b5, B:85:0x01e0, B:87:0x01e9, B:88:0x01fb, B:89:0x01fe, B:91:0x020e, B:92:0x021f, B:79:0x01be, B:81:0x01ca, B:83:0x01d2, B:84:0x01db, B:75:0x01a8, B:94:0x0235, B:98:0x0248, B:99:0x024a, B:101:0x0258, B:104:0x025f, B:107:0x026e, B:117:0x02b1, B:118:0x02b5), top: B:131:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01be A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:39:0x00fb, B:41:0x00ff, B:43:0x0105, B:45:0x010f, B:46:0x0112, B:47:0x011e, B:49:0x0125, B:51:0x0140, B:55:0x014d, B:57:0x0159, B:59:0x0163, B:64:0x016d, B:66:0x0176, B:68:0x0187, B:70:0x0196, B:72:0x019e, B:78:0x01b5, B:85:0x01e0, B:87:0x01e9, B:88:0x01fb, B:89:0x01fe, B:91:0x020e, B:92:0x021f, B:79:0x01be, B:81:0x01ca, B:83:0x01d2, B:84:0x01db, B:75:0x01a8, B:94:0x0235, B:98:0x0248, B:99:0x024a, B:101:0x0258, B:104:0x025f, B:107:0x026e, B:117:0x02b1, B:118:0x02b5), top: B:131:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01e9 A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:39:0x00fb, B:41:0x00ff, B:43:0x0105, B:45:0x010f, B:46:0x0112, B:47:0x011e, B:49:0x0125, B:51:0x0140, B:55:0x014d, B:57:0x0159, B:59:0x0163, B:64:0x016d, B:66:0x0176, B:68:0x0187, B:70:0x0196, B:72:0x019e, B:78:0x01b5, B:85:0x01e0, B:87:0x01e9, B:88:0x01fb, B:89:0x01fe, B:91:0x020e, B:92:0x021f, B:79:0x01be, B:81:0x01ca, B:83:0x01d2, B:84:0x01db, B:75:0x01a8, B:94:0x0235, B:98:0x0248, B:99:0x024a, B:101:0x0258, B:104:0x025f, B:107:0x026e, B:117:0x02b1, B:118:0x02b5), top: B:131:0x00fb }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe A[Catch: all -> 0x02b6, TryCatch #1 {all -> 0x02b6, blocks: (B:39:0x00fb, B:41:0x00ff, B:43:0x0105, B:45:0x010f, B:46:0x0112, B:47:0x011e, B:49:0x0125, B:51:0x0140, B:55:0x014d, B:57:0x0159, B:59:0x0163, B:64:0x016d, B:66:0x0176, B:68:0x0187, B:70:0x0196, B:72:0x019e, B:78:0x01b5, B:85:0x01e0, B:87:0x01e9, B:88:0x01fb, B:89:0x01fe, B:91:0x020e, B:92:0x021f, B:79:0x01be, B:81:0x01ca, B:83:0x01d2, B:84:0x01db, B:75:0x01a8, B:94:0x0235, B:98:0x0248, B:99:0x024a, B:101:0x0258, B:104:0x025f, B:107:0x026e, B:117:0x02b1, B:118:0x02b5), top: B:131:0x00fb }] */
    @Override // X.InterfaceC6909Ec6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ait(X.Eb0 r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6868EbQ.Ait(X.Eb0):void");
    }

    @Override // X.InterfaceC6909Ec6
    public final void cancel() {
        this.A05 = true;
        C6878Eba c6878Eba = this.A04;
        if (c6878Eba != null) {
            c6878Eba.A07(Ec2.CANCEL);
        }
    }

    @Override // X.InterfaceC6909Ec6
    public final InterfaceC6833Eal A80(Eb0 eb0, long j) {
        C6878Eba c6878Eba = this.A04;
        C7384Etj.A0X(c6878Eba);
        return c6878Eba.A02();
    }

    @Override // X.InterfaceC6909Ec6
    public final void ABc() {
        C6878Eba c6878Eba = this.A04;
        C7384Etj.A0X(c6878Eba);
        c6878Eba.A02().close();
    }

    @Override // X.InterfaceC6909Ec6
    public final void ABg() {
        this.A03.A0N.A01();
    }

    @Override // X.InterfaceC6909Ec6
    public final C6862EbK ADv() {
        return this.A01;
    }

    @Override // X.InterfaceC6909Ec6
    public final InterfaceC6834Eam AXW(C6886Ebi c6886Ebi) {
        C6878Eba c6878Eba = this.A04;
        C7384Etj.A0X(c6878Eba);
        return c6878Eba.A0B;
    }

    @Override // X.InterfaceC6909Ec6
    public final C6884Ebg AZT(boolean z) throws IOException {
        ArrayDeque<C6844Eaw> arrayDeque;
        C6844Eaw c6844Eaw;
        C6878Eba c6878Eba = this.A04;
        C7384Etj.A0X(c6878Eba);
        synchronized (c6878Eba) {
            C6892Ebo c6892Ebo = c6878Eba.A0C;
            c6892Ebo.A07();
            while (true) {
                try {
                    arrayDeque = c6878Eba.A08;
                    if (!arrayDeque.isEmpty() || c6878Eba.A05 != null) {
                        break;
                    }
                    try {
                        c6878Eba.wait();
                    } catch (InterruptedException unused) {
                        BV4.A1A();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    c6892Ebo.A09();
                    throw th;
                }
            }
            c6892Ebo.A09();
            if (arrayDeque.isEmpty()) {
                IOException iOException = c6878Eba.A04;
                if (iOException != null) {
                    throw iOException;
                }
                Ec2 ec2 = c6878Eba.A05;
                C7384Etj.A0X(ec2);
                throw new StreamResetException(ec2);
            }
            C6844Eaw c6844EawRemoveFirst = arrayDeque.removeFirst();
            C7384Etj.A0U(c6844EawRemoveFirst);
            c6844Eaw = c6844EawRemoveFirst;
        }
        EnumC6905Ec1 enumC6905Ec1 = this.A00;
        C7384Etj.A0Y(c6844Eaw, 0);
        C6845Eax c6845Eax = new C6845Eax();
        String[] strArr = c6844Eaw.A00;
        int length = strArr.length / 2;
        C6896Ebs c6896EbsA00 = null;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            int i3 = i * 2;
            String str = strArr[i3];
            String str2 = strArr[i3 + 1];
            if (":status".equals(str)) {
                c6896EbsA00 = C6896Ebs.A00(AnonymousClass006.A0y(str2, "HTTP/1.1 ", C60O.A0w()));
            } else if (!A07.contains(str)) {
                c6845Eax.A02(str, str2);
            }
            i = i2;
        }
        if (c6896EbsA00 == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        C6884Ebg c6884Ebg = new C6884Ebg();
        c6884Ebg.A06 = enumC6905Ec1;
        c6884Ebg.A00 = c6896EbsA00.A00;
        String str3 = c6896EbsA00.A01;
        C7384Etj.A0Y(str3, 0);
        c6884Ebg.A03 = str3;
        c6884Ebg.A05 = c6845Eax.A00().A04();
        if (z && c6884Ebg.A00 == 100) {
            return null;
        }
        return c6884Ebg;
    }

    public C6868EbQ(C6859EbH c6859EbH, C6862EbK c6862EbK, C6875EbX c6875EbX, C6879Ebb c6879Ebb) {
        this.A01 = c6862EbK;
        this.A02 = c6875EbX;
        this.A03 = c6879Ebb;
        List<EnumC6905Ec1> list = c6859EbH.A04;
        EnumC6905Ec1 enumC6905Ec1 = EnumC6905Ec1.H2_PRIOR_KNOWLEDGE;
        this.A00 = list.contains(enumC6905Ec1) ? enumC6905Ec1 : EnumC6905Ec1.HTTP_2;
    }

    @Override // X.InterfaceC6909Ec6
    public final long Ab7(C6886Ebi c6886Ebi) {
        if (AbstractC6802EaD.A02(c6886Ebi)) {
            return AbstractC6843Eav.A03(c6886Ebi);
        }
        return 0L;
    }
}
