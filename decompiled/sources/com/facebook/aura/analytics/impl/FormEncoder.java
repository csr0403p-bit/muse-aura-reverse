package com.facebook.aura.analytics.impl;

import X.C7384Etj;
import X.DCl;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public final class FormEncoder {
    public boolean hasPrevious;
    public final OutputStream out;

    public FormEncoder(OutputStream outputStream) {
        C7384Etj.A0Y(outputStream, 0);
        this.out = outputStream;
    }

    public final void write(String str, String str2) throws IOException {
        C7384Etj.A0Y(str, 0);
        if (this.hasPrevious) {
            this.out.write(38);
        }
        OutputStream outputStream = this.out;
        Charset charset = DCl.A05;
        String strEncode = URLEncoder.encode(str, charset.name());
        C7384Etj.A0U(strEncode);
        outputStream.write(strEncode.getBytes(charset));
        this.out.write(61);
        if (str2 != null) {
            OutputStream outputStream2 = this.out;
            String strEncode2 = URLEncoder.encode(str2, charset.name());
            C7384Etj.A0U(strEncode2);
            outputStream2.write(strEncode2.getBytes(charset));
        }
        this.hasPrevious = true;
    }
}
