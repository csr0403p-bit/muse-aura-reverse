package X;

import com.facebook.aura.opengraph.HatchWebPageParserKt;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

/* loaded from: classes5.dex */
public abstract class C08 {
    public static FileOutputStream A00;
    public static FileChannel A01;

    static {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("/sys/kernel/debug/tracing/trace_marker");
            A00 = fileOutputStream;
            A01 = fileOutputStream.getChannel();
        } catch (FileNotFoundException e) {
            CFK.A0J("TraceDirect", e, "Failed to open trace_marker file.");
            A00 = null;
            A01 = null;
        }
    }

    public static void A00(String str) {
        String str2;
        String str3;
        int iWrite;
        FileChannel fileChannel = A01;
        if (fileChannel != null) {
            try {
                byte[] bytes = str.getBytes(Charset.forName(HatchWebPageParserKt.UTF_8));
                int length = bytes.length;
                if (length < 1) {
                    return;
                }
                do {
                    iWrite = fileChannel.write(ByteBuffer.wrap(bytes));
                } while (iWrite == 0);
                if (iWrite != length) {
                    CFK.A04("TraceDirect", "Partial write of systrace line.");
                }
            } catch (UnsupportedEncodingException e) {
                e = e;
                str2 = "TraceDirect";
                str3 = "Failed to encode raw systrace line to UTF-8.";
                CFK.A0J(str2, e, str3);
            } catch (IOException e2) {
                e = e2;
                str2 = "TraceDirect";
                str3 = "Failed to write systrace line.";
                CFK.A0J(str2, e, str3);
            }
        }
    }
}
