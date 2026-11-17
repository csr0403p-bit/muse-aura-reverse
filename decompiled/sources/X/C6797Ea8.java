package X;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: X.Ea8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C6797Ea8 {
    public final List<Certificate> A00;
    public final F0C A01;
    public final C6895Ebr A02;
    public final EnumC6899Ebv A03;

    /* JADX WARN: Incorrect types in method signature: (LX/Ebv;LX/Ebr;Ljava/util/List<+Ljava/security/cert/Certificate;>;Lkotlin/jvm/functions/Function0<+Ljava/util/List<+Ljava/security/cert/Certificate;>;>;)V */
    public C6797Ea8(List list, Function0 function0, C6895Ebr c6895Ebr, EnumC6899Ebv enumC6899Ebv) {
        C7384Etj.A0Y(list, 2);
        this.A03 = enumC6899Ebv;
        this.A02 = c6895Ebr;
        this.A00 = list;
        this.A01 = C5322DgG.A01((Function0) new EQf(function0, 19));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C6797Ea8) {
            C6797Ea8 c6797Ea8 = (C6797Ea8) obj;
            if (c6797Ea8.A03 == this.A03 && c6797Ea8.A02.equals(this.A02) && C7384Etj.areEqual(c6797Ea8.A01.getValue(), this.A01.getValue()) && c6797Ea8.A00.equals(this.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass005.A0G(this.A00, AnonymousClass005.A0F(this.A01.getValue(), AnonymousClass005.A0F(this.A02, BV8.A09(this.A03))));
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> list = (List) this.A01.getValue();
        ArrayList arrayListA0m = AnonymousClass002.A0m(list);
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                C7384Etj.A0U(type2);
            }
            arrayListA0m.add(type2);
        }
        String string = arrayListA0m.toString();
        StringBuilder sbA0x = C60O.A0x("Handshake{tlsVersion=");
        sbA0x.append(this.A03);
        sbA0x.append(" cipherSuite=");
        sbA0x.append(this.A02);
        sbA0x.append(" peerCertificates=");
        sbA0x.append(string);
        sbA0x.append(" localCertificates=");
        List<Certificate> list2 = this.A00;
        ArrayList arrayListA0m2 = AnonymousClass002.A0m(list2);
        for (Certificate certificate2 : list2) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                C7384Etj.A0U(type);
            }
            arrayListA0m2.add(type);
        }
        sbA0x.append(arrayListA0m2);
        return C8j3.A15(sbA0x);
    }
}
