package com.facebook.aura.network.transport.tigon.internal;

import X.AbstractC2159Azp;
import X.AnonymousClass001;
import X.AnonymousClass003;
import X.AnonymousClass005;
import X.AnonymousClass007;
import X.BV4;
import X.C3cI;
import X.C60O;
import X.C7384Etj;
import X.DCl;
import X.FGI;
import com.facebook.acra.util.HttpRequestMultipart;
import com.facebook.aura.network.transport.HatchMultipartPart;
import com.facebook.aura.network.transport.HatchRequestBody;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class TigonMultipartBody {
    public static final TigonMultipartBody INSTANCE = new TigonMultipartBody();
    public static final byte[] PART_TRAILER = HttpRequestMultipart.LINE_FEED.getBytes(DCl.A01);

    public final class Encoded {
        public final byte[] bytes;
        public final String contentType;

        public final byte[] getBytes() {
            return this.bytes;
        }

        public final String getContentType() {
            return this.contentType;
        }

        public Encoded(byte[] bArr, String str) {
            AnonymousClass003.A0u(bArr, str);
            this.bytes = bArr;
            this.contentType = str;
        }
    }

    public final byte[] closingBoundaryAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0U("--", str, "--\r\n").getBytes(DCl.A01);
    }

    public final String contentTypeFor(String str) {
        C7384Etj.A0Y(str, 0);
        return FGI.A0M("multipart/form-data; boundary=", str);
    }

    public final Encoded encode(HatchRequestBody.Multipart multipart) {
        C7384Etj.A0Y(multipart, 0);
        if (!multipart.fileParts.isEmpty()) {
            throw C60O.A0i("byte-only encoder; route fileParts to TigonMultipartStreamingProvider");
        }
        String strGenerateBoundary = generateBoundary();
        return new Encoded(encodeWithBoundary$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(multipart, strGenerateBoundary), contentTypeFor(strGenerateBoundary));
    }

    private final String escapeQuotes(String str) {
        return AbstractC2159Azp.A0z(str, "\"", "%22");
    }

    public final byte[] getPART_TRAILER$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal() {
        return PART_TRAILER;
    }

    public final byte[] encodeWithBoundary$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(HatchRequestBody.Multipart multipart, String str) throws IOException {
        AnonymousClass003.A0u(multipart, str);
        if (!multipart.fileParts.isEmpty()) {
            throw C60O.A0i("byte-only encoder; route fileParts to TigonMultipartStreamingProvider");
        }
        ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
        for (HatchMultipartPart hatchMultipartPart : multipart.parts) {
            byteArrayOutputStreamA0F.write(partHeaderAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(str, hatchMultipartPart.name, hatchMultipartPart.filename, hatchMultipartPart.contentType));
            byteArrayOutputStreamA0F.write(hatchMultipartPart.bytes);
            byteArrayOutputStreamA0F.write(PART_TRAILER);
        }
        byteArrayOutputStreamA0F.write(closingBoundaryAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(str));
        return C7384Etj.A0d(byteArrayOutputStreamA0F);
    }

    public final String generateBoundary() {
        return AnonymousClass007.A0a("AuraTigonBoundary-", UUID.randomUUID());
    }

    public final byte[] partHeaderAscii$fbandroid_express_aura_java_com_facebook_aura_network_transport_tigon_internal_internal(String str, String str2, String str3, String str4) {
        String str5;
        AnonymousClass005.A0y(str, str2, str4);
        StringBuilder sbA0x = C3cI.A0x("--", str);
        sbA0x.append(HttpRequestMultipart.LINE_FEED);
        sbA0x.append("Content-Disposition: form-data; name=\"");
        String strA0z = AbstractC2159Azp.A0z(str2, "\"", "%22");
        if (str3 == null) {
            sbA0x.append(strA0z);
            str5 = "\"\r\n\r\n";
        } else {
            sbA0x.append(strA0z);
            sbA0x.append("\"; filename=\"");
            sbA0x.append(AbstractC2159Azp.A0z(str3, "\"", "%22"));
            sbA0x.append("\"\r\nContent-Type: ");
            sbA0x.append(str4);
            str5 = "\r\n\r\n";
        }
        return AnonymousClass001.A0v(str5, sbA0x).getBytes(DCl.A01);
    }
}
