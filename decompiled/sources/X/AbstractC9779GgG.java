package X;

import com.facebook.aura.pairs.PairsDiscretionDocument;
import com.fasterxml.jackson.core.JsonParseException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringWriter;

/* renamed from: X.GgG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC9779GgG {
    public static void A01(StringBuilder sb, Object obj) {
        String string = obj.toString();
        C7384Etj.A0U(string);
        sb.append(string.toCharArray(), 0, (int) Math.min(r4.length, 100 - sb.length()));
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/Class<*>;LX/Gl7;Ljava/lang/Exception;)V */
    public static final void A00(AbstractC9916Gl7 abstractC9916Gl7, Class cls, Exception exc) throws IOException {
        String string;
        Reader reader;
        AnonymousClass003.A0u(cls, abstractC9916Gl7);
        try {
            Object objA1W = abstractC9916Gl7.A1W();
            StringBuilder sbA0w = C60O.A0w();
            sbA0w.append("current token: ");
            sbA0w.append(abstractC9916Gl7.A1c());
            sbA0w.append(PairsDiscretionDocument.TERMINATOR);
            if (objA1W instanceof InputStream) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (abstractC9916Gl7 instanceof C9982Gmy) {
                    C9982Gmy c9982Gmy = (C9982Gmy) abstractC9916Gl7;
                    int i = ((AbstractC9980Gmw) c9982Gmy).A04;
                    int i2 = ((AbstractC9980Gmw) c9982Gmy).A05;
                    int i3 = i - i2;
                    if (i3 >= 1) {
                        ((AbstractC9980Gmw) c9982Gmy).A05 = i2 + i3;
                        byteArrayOutputStream.write(c9982Gmy.A04, i2, i3);
                    }
                }
                byteArrayOutputStream.flush();
                A01(sbA0w, byteArrayOutputStream);
                byteArrayOutputStream.close();
                while (true) {
                    int i4 = ((InputStream) objA1W).read();
                    if (i4 == -1 || sbA0w.length() >= 100) {
                        break;
                    } else {
                        sbA0w.append((char) i4);
                    }
                }
            } else if (objA1W instanceof Reader) {
                StringWriter stringWriter = new StringWriter();
                abstractC9916Gl7.A1n(stringWriter);
                stringWriter.flush();
                A01(sbA0w, stringWriter);
                stringWriter.close();
                while (true) {
                    reader = (Reader) objA1W;
                    int i5 = reader.read();
                    if (i5 == -1 || sbA0w.length() >= 100) {
                        break;
                    } else {
                        sbA0w.append((char) i5);
                    }
                }
                reader.close();
            } else if (objA1W == null) {
                StringWriter stringWriter2 = new StringWriter();
                abstractC9916Gl7.A1n(stringWriter2);
                stringWriter2.flush();
                A01(sbA0w, stringWriter2);
                stringWriter2.close();
            }
            if (sbA0w.length() == 100) {
                sbA0w.append("...");
            }
            string = sbA0w.toString();
        } catch (Exception unused) {
            string = "failed to get parser text";
        }
        String strA05 = C6tn.A05(FGI.A0h("\n        Failed to deserialize to instance ", cls.getSimpleName(), "\n        ", string, "\n        "));
        C9516GMj c9516GMjA1K = abstractC9916Gl7.A1K();
        JsonParseException jsonParseException = new JsonParseException(strA05, exc);
        jsonParseException._location = c9516GMjA1K;
        jsonParseException.A00 = null;
        throw jsonParseException;
    }
}
