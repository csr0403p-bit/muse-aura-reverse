package X;

import android.util.JsonReader;
import com.facebook.crudolib.netfb.FbApiException;
import com.facebook.crudolib.netfb.HttpResponseException;
import com.facebook.crudolib.netfb.InvalidJsonException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;

/* loaded from: classes5.dex */
public final class CEy implements CGu {
    @Override // X.CGu
    public final void AVV(C4019Ck1 c4019Ck1, C7416EvJ c7416EvJ) throws IOException {
        int i = c7416EvJ.A00;
        if (i >= 400) {
            InputStream inputStream = c7416EvJ.A01;
            try {
                ByteArrayOutputStream byteArrayOutputStreamA0F = BV4.A0F();
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        } else {
                            byteArrayOutputStreamA0F.write(bArr, 0, i2);
                        }
                    }
                    byteArrayOutputStreamA0F.close();
                    String string = byteArrayOutputStreamA0F.toString();
                    inputStream.close();
                    if (i < 500) {
                        try {
                            C3331CEw c3331CEw = new C3331CEw();
                            try {
                                JsonReader jsonReader = new JsonReader(new StringReader(string == null ? "" : string));
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    if (!c3331CEw.A01(jsonReader, jsonReader.nextName())) {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                c3331CEw.A00();
                            } catch (IOException | AssertionError | IllegalStateException e) {
                                CFK.A0E("FbApiErrorParser", "could not parse response: %s", e, string);
                                throw new InvalidJsonException(e);
                            }
                        } catch (FbApiException e2) {
                            throw e2;
                        } catch (InvalidJsonException e3) {
                            CFK.A0B("FbApiErrorInterceptor", "Unable to parse 4XX error", e3);
                        }
                    }
                    StringBuilder sbA0w = C60O.A0w();
                    sbA0w.append(c7416EvJ.A02);
                    if (string != null) {
                        sbA0w.append('\n');
                        sbA0w.append(string);
                    }
                    String string2 = sbA0w.toString();
                    StringBuilder sbA0w2 = C60O.A0w();
                    sbA0w2.append(i);
                    throw new HttpResponseException(C60P.A1M(": ", string2, sbA0w2));
                } catch (Throwable th) {
                    byteArrayOutputStreamA0F.close();
                    throw th;
                }
            } catch (Throwable th2) {
                inputStream.close();
                throw th2;
            }
        }
    }
}
